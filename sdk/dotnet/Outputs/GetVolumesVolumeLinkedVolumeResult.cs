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
    public sealed class GetVolumesVolumeLinkedVolumeResult
    {
        /// <summary>
        /// If true, the volume is deleted when terminating the VM. If false, the volume is not deleted when terminating the VM.
        /// </summary>
        public readonly bool DeleteOnVmDeletion;
        /// <summary>
        /// The name of the device.
        /// </summary>
        public readonly string DeviceName;
        /// <summary>
        /// The state of the volume (`creating` \| `available` \| `in-use` \| `updating` \| `deleting` \| `error`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The ID of the VM.
        /// </summary>
        public readonly string VmId;
        /// <summary>
        /// The ID of the volume.
        /// </summary>
        public readonly string VolumeId;

        [OutputConstructor]
        private GetVolumesVolumeLinkedVolumeResult(
            bool deleteOnVmDeletion,

            string deviceName,

            string state,

            string vmId,

            string volumeId)
        {
            DeleteOnVmDeletion = deleteOnVmDeletion;
            DeviceName = deviceName;
            State = state;
            VmId = vmId;
            VolumeId = volumeId;
        }
    }
}
