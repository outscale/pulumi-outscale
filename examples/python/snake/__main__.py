"""A Python Pulumi program"""

import pulumi
import pulumi_command as command
import pulumi_outscale as outscale
import pulumi_cloudinit as cloudinit


CONFIG = pulumi.Config()
PUBLIC_KEY_PATH = CONFIG.require("publicKeyPath")
USER = CONFIG.require("user")

PUBLIC_SSH_KEY_PATH = CONFIG.require("publicSshKeyPath")

PRIVATE_KEY_PATH = CONFIG.require("privateKeyPath")

VM_TYPE = CONFIG.get("vmType") or "tinav6.c4r8p2"
LINUX_OMI = CONFIG.get("linuxOmi") or "ami-cd8d714e"
PUBLIC_KEY = open(PUBLIC_KEY_PATH).read()
PRIVATE_KEY = open(PRIVATE_KEY_PATH).read()
PUBLIC_SSH_KEY = open(PUBLIC_SSH_KEY_PATH).read()

NET = outscale.Net(ip_range="10.192.0.0/16",
                   resource_name="snake-net")

SUB = outscale.Subnet(net_id=NET.id,
                      ip_range="10.192.0.0/24",
                      resource_name="snake-subpub1")

IGW = outscale.InternetService(resource_name="snake-igw")

IGW_LINK = outscale.InternetServiceLink(resource_name="snake-igwl",
                                        internet_service_id=IGW.id,
                                        net_id=NET.id)

ROUTE_TABLE = outscale.RouteTable(resource_name="snake-rtb",
                                  net_id=NET.id)

ROUTE_TABLE_LINK = outscale.RouteTableLink(resource_name="snake-rtbl",
                                           subnet_id=SUB.id,
                                           route_table_id=ROUTE_TABLE.id)

ROUTE = outscale.Route(resource_name="snake-route",
                       destination_ip_range="0.0.0.0/0",
                       route_table_id=ROUTE_TABLE.id,
                       gateway_id=IGW.id)

SECURITY_GROUP = outscale.SecurityGroup(resource_name="snake-sg",
                                        description=" allow ssh, http and https",
                                        net_id=NET.id)

SECURITY_GROUP_RULE_HTTP = outscale.SecurityGroupRule(resource_name="snake-sgr-http",
                                                      flow="Inbound",
                                                      security_group_id=SECURITY_GROUP.id,
                                                      from_port_range=8080,
                                                      to_port_range=8080,
                                                      ip_protocol="tcp",
                                                      ip_range="0.0.0.0/0")

SECURITY_GROUP_RULE_SSH = outscale.SecurityGroupRule(resource_name="snake-sgr-ssh",
                                                     flow="Inbound",
                                                     security_group_id=SECURITY_GROUP.id,
                                                     from_port_range=22,
                                                     to_port_range=22,
                                                     ip_protocol="tcp",
                                                     ip_range="0.0.0.0/0")
KEYPAIR = outscale.Keypair(resource_name="snake-kp",
                           public_key=PUBLIC_KEY,
                           keypair_name="snake-kp")

with open('cloudinit.yaml') as f:
    SCRIPT = f.read()


VM_STARTUP = cloudinit.Config(resource_name="hello-cloudinit",
                              base64_encode=True,
                              gzip=False,
                              parts=[cloudinit.GetConfigPartArgs(
                                  content=SCRIPT,
                              )]
                              )

VM = outscale.Vm(resource_name="snake-vm",
                 image_id=LINUX_OMI,
                 vm_type=VM_TYPE,
                 keypair_name=KEYPAIR.keypair_name,
                 subnet_id=SUB.id,
                 security_group_ids=[SECURITY_GROUP.id],
                 user_data=VM_STARTUP.rendered
                )

PUBLIC_IP = outscale.PublicIp(resource_name="snake-eip")

PUBLIC_IP_LINK = outscale.PublicIpLink(resource_name="snake-lpi",
                                       public_ip_id=PUBLIC_IP.id,
                                       vm_id=VM.id)

command.local.Command("random",
    create="echo ${public_ip} ${hostname} >>  ~/.ssh/known_hosts",
    environment={
        "public_ip": PUBLIC_IP.public_ip,
        "hostname": PUBLIC_SSH_KEY.split(' '+ USER, 1)[0],
    },
    opts=pulumi.ResourceOptions(depends_on=[
         PUBLIC_IP_LINK,
    ])
)

UPDATE_CMD = command.remote.Command("updateCmd",
                                    connection=command.remote.ConnectionArgs(
                                        host=PUBLIC_IP.public_ip,
                                        port=22,
                                        user="outscale",
                                        private_key=PRIVATE_KEY,
                                        per_dial_timeout=60
                                    ),
                                    create="""(sudo apt-get update -y || true);
                                    """
                                    )


PLAY_ANSIBLE_PLAYBOOK_CMD = command.local.Command("playAnsiblePlaybookCmd",
                                                  create=PUBLIC_IP.public_ip.apply(
                                                      lambda public_ip: f"""\
 ansible-playbook \
-u outscale \
-i '{public_ip},' \
--private-key {PRIVATE_KEY_PATH} \
playbook.yml"""),
                                                  opts=pulumi.ResourceOptions(depends_on=[
                                                      UPDATE_CMD,
                                                  ]))


pulumi.export("url", pulumi.Output.format("http://{0}:8080", PUBLIC_IP.public_ip))


