// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VmNicLinkNicGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
        /// </summary>
        [Input("deleteOnVmDeletion")]
        public Input<bool>? DeleteOnVmDeletion { get; set; }

        /// <summary>
        /// The index of the VM device for the NIC attachment (must be `0`). This parameter is required if you create a NIC when creating the VM.
        /// </summary>
        [Input("deviceNumber")]
        public Input<string>? DeviceNumber { get; set; }

        /// <summary>
        /// The ID of the NIC to attach.
        /// </summary>
        [Input("linkNicId")]
        public Input<string>? LinkNicId { get; set; }

        /// <summary>
        /// The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public VmNicLinkNicGetArgs()
        {
        }
        public static new VmNicLinkNicGetArgs Empty => new VmNicLinkNicGetArgs();
    }
}