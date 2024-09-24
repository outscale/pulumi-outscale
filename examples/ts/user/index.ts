import * as pulumi from "@pulumi/pulumi";
import * as outscale from "@outscale/pulumi-outscale";

// How to use and set simple example
const keypair = new outscale.Keypair("ts-demo", {
  keypairName: "ts-demo",
});
const net = new outscale.Net("ts-demo", {
  ipRange: "10.0.0.0/16",
});
const subnet = new outscale.Subnet("ts-demo", {
  ipRange: "10.0.0.0/24",
  netId: net.id,
});

const igw = new outscale.InternetService("ts-demo", {});
const igw_link = new outscale.InternetServiceLink("ts-demo", {
  internetServiceId: igw.id,
  netId: net.id,
});
const public_ip = new outscale.PublicIp("ts-demo", {});
const route_table = new outscale.RouteTable("ts-demo", {
  netId: net.id,
});
const security_group = new outscale.SecurityGroup("ts-demo", {
  description: "test sg",
  netId: net.id,
});

const route_table_link = new outscale.RouteTableLink("ts-demo", {
  routeTableId: route_table.id,
  subnetId: subnet.id,
});

const security_group_rule = new outscale.SecurityGroupRule("ts-demo", {
  flow: "Inbound",
  securityGroupId: security_group.id,
  fromPortRange: 22,
  toPortRange: 22,
  ipProtocol: "tcp",
  ipRange: "0.0.0.0/0",
});

const vm = new outscale.Vm("ts-demo", {
  imageId: "ami-cd8d714e",
  vmType: "tinav4.c4r8p2",
  keypairName: "ts-demo",
  subnetId: subnet.id,
  securityGroupIds: [security_group.id],
});
