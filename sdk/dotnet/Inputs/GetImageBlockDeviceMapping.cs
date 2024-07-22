// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class GetImageBlockDeviceMappingArgs : global::Pulumi.InvokeArgs
    {
        [Input("bsus", required: true)]
        private List<Inputs.GetImageBlockDeviceMappingBsusArgs>? _bsus;

        /// <summary>
        /// Information about the BSU volume to create.
        /// </summary>
        public List<Inputs.GetImageBlockDeviceMappingBsusArgs> Bsus
        {
            get => _bsus ?? (_bsus = new List<Inputs.GetImageBlockDeviceMappingBsusArgs>());
            set => _bsus = value;
        }

        /// <summary>
        /// The device name for the volume. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
        /// </summary>
        [Input("deviceName", required: true)]
        public string DeviceName { get; set; } = null!;

        /// <summary>
        /// The name of the virtual device (`ephemeralN`).
        /// </summary>
        [Input("virtualDeviceName", required: true)]
        public string VirtualDeviceName { get; set; } = null!;

        public GetImageBlockDeviceMappingArgs()
        {
        }
        public static new GetImageBlockDeviceMappingArgs Empty => new GetImageBlockDeviceMappingArgs();
    }
}
