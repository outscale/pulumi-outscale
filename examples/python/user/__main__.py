"""A Python Pulumi program"""

import pulumi_outscale as outscale

# How to use and to set a simple example
DEPLOYER = outscale.Keypair(resource_name="deployer",
                            keypair_name="deployer")
NET = outscale.Net(ip_range="10.0.0.0/16",
                   resource_name="demo-pulumi-net")
SUBNET = outscale.Subnet(net_id=NET.id,
                         ip_range="10.0.0.0/24",
                         subregion_name="eu-west-2a",
                         resource_name="demo-pulumi-subnet")
IGW = outscale.InternetService(resource_name="demo-pulumi-igw")
IGW_LINK = outscale.InternetServiceLink(resource_name="demo-pulumi-igw-link",
                                        internet_service_id=IGW.id,
                                        net_id=NET.id)
PUBLIC_IP = outscale.PublicIp(resource_name="demo-pulumi-public-ip")
ROUTE_TABLE = outscale.RouteTable(resource_name="demo-pulumi-route-table",
                                  net_id=NET.id, )
ROUTE_TABLE_LINK = outscale.RouteTableLink(resource_name="demo-pulumi-route-table-link",
                                           subnet_id=SUBNET.id,
                                           route_table_id=ROUTE_TABLE.id)
ROUTE = outscale.Route(resource_name="demo-pulumi-route",
                       destination_ip_range="0.0.0.0/0",
                       gateway_id=IGW.id,
                       route_table_id=ROUTE_TABLE.id)

SECURITY_GROUP = outscale.SecurityGroup(resource_name="demo-pulumi-sg",
                                        description="test security group",
                                        net_id=NET.id)
SECURITY_GROUP_RULE = outscale.SecurityGroupRule(resource_name="demo-pulumi-sgr",
                                                 flow="Inbound",
                                                 security_group_id=SECURITY_GROUP.id,
                                                 from_port_range=22,
                                                 to_port_range=22,
                                                 ip_protocol="tcp",
                                                 ip_range="0.0.0.0/0")
VM = outscale.Vm(resource_name="demo-pulumi-vm",
                 image_id="ami-cd8d714e",
                 vm_type="tinav4.c1r1p2",
                 keypair_name=DEPLOYER.keypair_name,
                 security_group_ids=[SECURITY_GROUP.id],
                 subnet_id=SUBNET.id)
