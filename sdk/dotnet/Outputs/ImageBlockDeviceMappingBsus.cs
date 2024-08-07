// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Outputs
{

    [OutputType]
    public sealed class ImageBlockDeviceMappingBsus
    {
        /// <summary>
        /// By default or if set to true, the volume is deleted when terminating the VM. If false, the volume is not deleted when terminating the VM.
        /// </summary>
        public readonly bool? DeleteOnVmDeletion;
        /// <summary>
        /// The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
        /// </summary>
        public readonly int? Iops;
        /// <summary>
        /// The ID of the snapshot used to create the volume.
        /// </summary>
        public readonly string? SnapshotId;
        /// <summary>
        /// The size of the volume, in gibibytes (GiB).&lt;br /&gt;
        /// If you specify a snapshot ID, the volume size must be at least equal to the snapshot size.&lt;br /&gt;
        /// If you specify a snapshot ID but no volume size, the volume is created with a size similar to the snapshot one.
        /// </summary>
        public readonly int? VolumeSize;
        /// <summary>
        /// The type of the volume (`standard` \| `io1` \| `gp2`). If not specified in the request, a `standard` volume is created.&lt;br /&gt;
        /// For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
        /// </summary>
        public readonly string? VolumeType;

        [OutputConstructor]
        private ImageBlockDeviceMappingBsus(
            bool? deleteOnVmDeletion,

            int? iops,

            string? snapshotId,

            int? volumeSize,

            string? volumeType)
        {
            DeleteOnVmDeletion = deleteOnVmDeletion;
            Iops = iops;
            SnapshotId = snapshotId;
            VolumeSize = volumeSize;
            VolumeType = volumeType;
        }
    }
}
