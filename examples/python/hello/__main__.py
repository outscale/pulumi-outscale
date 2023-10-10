"""A Python Pulumi program"""

import pulumi_cloudinit as cloudinit
import pulumi_outscale as outscale




KEYPAIR = outscale.Keypair(resource_name="hello",
                           keypair_name="hello-kp")

SECURITY_GROUP = outscale.SecurityGroup(resource_name="hello-sg",
                                        description="test security group")

SECURITY_GROUP_RULE_SSH = outscale.SecurityGroupRule(resource_name="hello-sg-ssh",
                                                     flow="Inbound",
                                                     security_group_id=SECURITY_GROUP.id,
                                                     from_port_range=22,
                                                     to_port_range=22,
                                                     ip_protocol="tcp",
                                                     ip_range="0.0.0.0/0")

SECURITY_GROUP_RULE_HTTP = outscale.SecurityGroupRule(resource_name="hello-sg-http",
                                                      flow="Inbound",
                                                      security_group_id=SECURITY_GROUP.id,
                                                      from_port_range=8080,
                                                      to_port_range=8080,
                                                      ip_protocol="tcp",
                                                      ip_range="0.0.0.0/0")

PUBLIC_IP = outscale.PublicIp(resource_name="hello-public-ip")

with open('hello_startup.sh') as f:
    SCRIPT = f.read()


VM_STARTUP = cloudinit.Config(resource_name="hello-cloudinit",
                              base64_encode=True,
                              gzip=False,
                              parts=[cloudinit.GetConfigPartArgs(
                                  content=SCRIPT,
                                  content_type="text/x-shellscript",
                              )]
                              )

VM = outscale.Vm(resource_name="hello-vm",
                 image_id='ami-cd8d714e',
                 vm_type="tinav5.c4r8p1",
                 keypair_name=KEYPAIR.keypair_name,
                 security_group_ids=[SECURITY_GROUP.id],
                 placement_subregion_name="eu-west-2a",
                 placement_tenancy="default",
                 block_device_mappings=[outscale.VmBlockDeviceMappingsCreatedArgs(
                     device_name="/dev/sda1",
                     bsu=outscale.VmBlockDeviceMappingBsuArgs(volume_size=30,
                                                              volume_type="gp2",
                                                              delete_on_vm_deletion=True))],
                 user_data=VM_STARTUP.rendered
                )

PUBLIC_IP_LINK = outscale.PublicIpLink(resource_name="helo-ip-link",
                                       public_ip_id=PUBLIC_IP.id,
                                       vm_id=VM.id
                                      )

outscale.Tag(resource_name="auto-attach",
             resource_ids=[VM.id],
             tag=[outscale.TagTagArgs(key="osc.fcu.eip.auto-attach",
                                      value=PUBLIC_IP.public_ip)]
            )
