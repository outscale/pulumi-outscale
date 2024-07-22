// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VmPrimaryNicArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID of the owner of the NIC.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
        /// </summary>
        [Input("deleteOnVmDeletion")]
        public Input<bool>? DeleteOnVmDeletion { get; set; }

        /// <summary>
        /// The description of the NIC, if you are creating a NIC when creating the VM.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The index of the VM device for the NIC attachment (must be `0`). This parameter is required if you create a NIC when creating the VM.
        /// </summary>
        [Input("deviceNumber", required: true)]
        public Input<int> DeviceNumber { get; set; } = null!;

        /// <summary>
        /// (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        /// </summary>
        [Input("isSourceDestChecked")]
        public Input<bool>? IsSourceDestChecked { get; set; }

        [Input("linkNics")]
        private InputList<Inputs.VmPrimaryNicLinkNicArgs>? _linkNics;

        /// <summary>
        /// Information about the network interface card (NIC).
        /// </summary>
        public InputList<Inputs.VmPrimaryNicLinkNicArgs> LinkNics
        {
            get => _linkNics ?? (_linkNics = new InputList<Inputs.VmPrimaryNicLinkNicArgs>());
            set => _linkNics = value;
        }

        [Input("linkPublicIps")]
        private InputList<Inputs.VmPrimaryNicLinkPublicIpArgs>? _linkPublicIps;

        /// <summary>
        /// Information about the public IP associated with the NIC.
        /// </summary>
        public InputList<Inputs.VmPrimaryNicLinkPublicIpArgs> LinkPublicIps
        {
            get => _linkPublicIps ?? (_linkPublicIps = new InputList<Inputs.VmPrimaryNicLinkPublicIpArgs>());
            set => _linkPublicIps = value;
        }

        /// <summary>
        /// The Media Access Control (MAC) address of the NIC.
        /// </summary>
        [Input("macAddress")]
        public Input<string>? MacAddress { get; set; }

        /// <summary>
        /// The ID of the Net for the NIC.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        /// <summary>
        /// The ID of the NIC, if you are attaching an existing NIC when creating a VM.
        /// </summary>
        [Input("nicId")]
        public Input<string>? NicId { get; set; }

        /// <summary>
        /// The name of the private DNS.
        /// </summary>
        [Input("privateDnsName")]
        public Input<string>? PrivateDnsName { get; set; }

        [Input("privateIps")]
        private InputList<Inputs.VmPrimaryNicPrivateIpArgs>? _privateIps;

        /// <summary>
        /// One or more private IPs of the VM.
        /// </summary>
        public InputList<Inputs.VmPrimaryNicPrivateIpArgs> PrivateIps
        {
            get => _privateIps ?? (_privateIps = new InputList<Inputs.VmPrimaryNicPrivateIpArgs>());
            set => _privateIps = value;
        }

        /// <summary>
        /// The number of secondary private IPs, if you create a NIC when creating a VM. This parameter cannot be specified if you specified more than one private IP in the `private_ips` parameter.
        /// </summary>
        [Input("secondaryPrivateIpCount")]
        public Input<int>? SecondaryPrivateIpCount { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more IDs of security group for the VMs.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("securityGroups")]
        private InputList<Inputs.VmPrimaryNicSecurityGroupArgs>? _securityGroups;

        /// <summary>
        /// One or more security groups associated with the VM.
        /// </summary>
        public InputList<Inputs.VmPrimaryNicSecurityGroupArgs> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<Inputs.VmPrimaryNicSecurityGroupArgs>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public VmPrimaryNicArgs()
        {
        }
        public static new VmPrimaryNicArgs Empty => new VmPrimaryNicArgs();
    }
}
