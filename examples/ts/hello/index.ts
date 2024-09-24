import * as outscale from "@outscale/pulumi-outscale";
import * as cloudinit from "@pulumi/cloudinit";
import { readFileSync } from "fs";

const script = readFileSync("./hello_startup.sh", "utf-8");

new outscale.Keypair("hello", {
  keypairName: "hello",
});

const public_ip = new outscale.PublicIp("hello", {});

const security_group = new outscale.SecurityGroup("hello", {
  description: "test security group",
});

const security_group_rule_ssh = new outscale.SecurityGroupRule("hello-sg-ssh", {
  flow: "Inbound",
  securityGroupId: security_group.id,
  fromPortRange: 22,
  toPortRange: 22,
  ipProtocol: "tcp",
  ipRange: "0.0.0.0/0",
});

const security_group_rule_http = new outscale.SecurityGroupRule(
  "hello-sg-http",
  {
    flow: "Inbound",
    securityGroupId: security_group.id,
    fromPortRange: 8080,
    toPortRange: 8080,
    ipProtocol: "tcp",
    ipRange: "0.0.0.0/0",
  },
);

const resourceConf = new cloudinit.Config("hello", {
  gzip: false,
  base64Encode: true,
  parts: [
    {
      contentType: "text/x-shellscript",
      content: script,
    },
  ],
});

const vm = new outscale.Vm("hello", {
  imageId: "ami-cd8d714e",
  vmType: "tinav6.c4r8p2",
  keypairName: "hello",
  securityGroupIds: [security_group.id],
  placementSubregionName: "eu-west-2a",
  placementTenancy: "default",
  userData: resourceConf.rendered,
});

const volume = new outscale.Volume("hello", {
  subregionName: "eu-west-2a",
  volumeType: "gp2",
  size: 80,
});

const volumeLink = new outscale.VolumesLink("hello", {
  deviceName: "/dev/sdb",
  volumeId: volume.id,
  vmId: vm.id,
});

const publicIpLink = new outscale.PublicIpLink("hello", {
  vmId: vm.id,
  publicIpId: public_ip.id,
});
