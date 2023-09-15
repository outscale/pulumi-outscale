"""A Python Pulumi program"""

import pulumi
import pulumi_outscale as outscale
import pulumi_cloudinit as cloudinit



keypair = outscale.Keypair(resource_name="hello", keypair_name="hello-kp")
security_group = outscale.SecurityGroup(resource_name="hello-sg", description="test security group")
security_group_rule_ssh = outscale.SecurityGroupRule(resource_name="hello-sg-ssh", flow="Inbound", security_group_id=security_group.id, from_port_range=22, to_port_range=22, ip_protocol="tcp", ip_range="0.0.0.0/0")
security_group_rule_http = outscale.SecurityGroupRule(resource_name="hello-sg-http", flow="Inbound", security_group_id=security_group.id, from_port_range=8080, to_port_range=8080, ip_protocol="tcp", ip_range="0.0.0.0/0")
public_ip = outscale.PublicIp(resource_name="hello-public-ip")
with open('hello_startup.sh') as f: script = f.read()


vm_startup = cloudinit.Config(resource_name="hello-cloudinit", 
                              base64_encode=True,
                              gzip=False,
                              parts=[cloudinit.GetConfigPartArgs(
                                       content=script,
                                      content_type="text/x-shellscript",
                            )]
)

vm = outscale.Vm(resource_name="hello-vm", image_id='ami-cd8d714e', vm_type="tinav5.c4r8p1", keypair_name=keypair.keypair_name, security_group_ids=[security_group.id], placement_subregion_name="eu-west-2a", placement_tenancy="default", block_device_mappings=[outscale.VmBlockDeviceMappingsCreatedArgs(device_name="/dev/sda1", bsu=outscale.VmBlockDeviceMappingBsuArgs(volume_size=30, volume_type="gp2", delete_on_vm_deletion=True))], user_data=vm_startup.rendered)
public_ip_link = outscale.PublicIpLink(resource_name="helo-ip-link", public_ip_id=public_ip.id, vm_id=vm.id)
outscale.Tag(resource_name="auto-attach", resource_ids=[vm.id], tag=[outscale.TagTagArgs(key= "osc.fcu.eip.auto-attach", value=public_ip.public_ip)])

