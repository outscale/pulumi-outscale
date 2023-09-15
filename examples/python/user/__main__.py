"""A Python Pulumi program"""

import pulumi
import pulumi_outscale as outscale 

# How to use and to set a simple example
deployer = outscale.Keypair(resource_name="deployer", keypair_name="deployer")
net = outscale.Net(ip_range="10.0.0.0/16", resource_name="demo-pulumi-net")
subnet = outscale.Subnet(net_id=net.id, ip_range="10.0.0.0/24", subregion_name="eu-west-2a", resource_name="demo-pulumi-subnet")
igw = outscale.InternetService(resource_name="demo-pulumi-igw")
igw_link = outscale.InternetServiceLink(resource_name="demo-pulumi-igw-link", internet_service_id=igw.id, net_id=net.id)
public_ip = outscale.PublicIp(resource_name="demo-pulumi-public-ip")
route_table = outscale.RouteTable(resource_name="demo-pulumi-route-table", net_id=net.id, )
route_table_link = outscale.RouteTableLink(resource_name="demo-pulumi-route-table-link", subnet_id=subnet.id, route_table_id=route_table.id)
route = outscale.Route(resource_name="demo-pulumi-route", destination_ip_range="0.0.0.0/0", gateway_id=igw.id, route_table_id=route_table.id),
security_group = outscale.SecurityGroup(resource_name="demo-pulumi-sg", description="test security group", net_id=net.id)
security_group_rule = outscale.SecurityGroupRule(resource_name="demo-pulumi-sgr", flow="Inbound", security_group_id=security_group.id, from_port_range=22, to_port_range=22, ip_protocol="tcp", ip_range="0.0.0.0/0")
vm = outscale.Vm(resource_name="demo-pulumi-vm", image_id="ami-cd8d714e", vm_type="tinav4.c1r1p2", keypair_name=deployer.keypair_name, security_group_ids=[security_group.id], subnet_id=subnet.id)
#public_ip_link = outscale.PublicIpLink(resource_name="demo-pulumi-public-ip-link", public_ip=public_ip.id, vm_id=vm.id)




