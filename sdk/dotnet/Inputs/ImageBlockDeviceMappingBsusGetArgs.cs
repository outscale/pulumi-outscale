// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class ImageBlockDeviceMappingBsusGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// By default or if set to true, the volume is deleted when terminating the VM. If false, the volume is not deleted when terminating the VM.
        /// </summary>
        [Input("deleteOnVmDeletion")]
        public Input<bool>? DeleteOnVmDeletion { get; set; }

        /// <summary>
        /// The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
        /// </summary>
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        /// <summary>
        /// The ID of the snapshot used to create the volume.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The size of the volume, in gibibytes (GiB).&lt;br /&gt;
        /// If you specify a snapshot ID, the volume size must be at least equal to the snapshot size.&lt;br /&gt;
        /// If you specify a snapshot ID but no volume size, the volume is created with a size similar to the snapshot one.
        /// </summary>
        [Input("volumeSize")]
        public Input<int>? VolumeSize { get; set; }

        /// <summary>
        /// The type of the volume (`standard` \| `io1` \| `gp2`). If not specified in the request, a `standard` volume is created.&lt;br /&gt;
        /// For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public ImageBlockDeviceMappingBsusGetArgs()
        {
        }
        public static new ImageBlockDeviceMappingBsusGetArgs Empty => new ImageBlockDeviceMappingBsusGetArgs();
    }
}
