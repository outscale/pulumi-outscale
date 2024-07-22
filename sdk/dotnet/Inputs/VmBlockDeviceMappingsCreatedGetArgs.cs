// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VmBlockDeviceMappingsCreatedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("bsus")]
        private InputList<Inputs.VmBlockDeviceMappingsCreatedBsusGetArgs>? _bsus;

        /// <summary>
        /// Information about the BSU volume to create.
        /// </summary>
        public InputList<Inputs.VmBlockDeviceMappingsCreatedBsusGetArgs> Bsus
        {
            get => _bsus ?? (_bsus = new InputList<Inputs.VmBlockDeviceMappingsCreatedBsusGetArgs>());
            set => _bsus = value;
        }

        /// <summary>
        /// The device name for the volume. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        public VmBlockDeviceMappingsCreatedGetArgs()
        {
        }
        public static new VmBlockDeviceMappingsCreatedGetArgs Empty => new VmBlockDeviceMappingsCreatedGetArgs();
    }
}
