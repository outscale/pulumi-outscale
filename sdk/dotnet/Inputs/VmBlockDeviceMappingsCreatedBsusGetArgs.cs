// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VmBlockDeviceMappingsCreatedBsusGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
        /// </summary>
        [Input("deleteOnVmDeletion")]
        public Input<bool>? DeleteOnVmDeletion { get; set; }

        /// <summary>
        /// The date and time of attachment of the volume to the VM, in ISO 8601 date-time format.
        /// </summary>
        [Input("linkDate")]
        public Input<string>? LinkDate { get; set; }

        /// <summary>
        /// The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputList<Inputs.VmBlockDeviceMappingsCreatedBsusTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.VmBlockDeviceMappingsCreatedBsusTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.VmBlockDeviceMappingsCreatedBsusTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the volume.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        public VmBlockDeviceMappingsCreatedBsusGetArgs()
        {
        }
        public static new VmBlockDeviceMappingsCreatedBsusGetArgs Empty => new VmBlockDeviceMappingsCreatedBsusGetArgs();
    }
}
