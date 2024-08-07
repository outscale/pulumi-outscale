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
    public sealed class GetVmBlockDeviceMappingsCreatedBsusResult
    {
        /// <summary>
        /// If true, the NIC is deleted when the VM is terminated.
        /// </summary>
        public readonly bool DeleteOnVmDeletion;
        /// <summary>
        /// The date and time of attachment of the volume to the VM, in ISO 8601 date-time format.
        /// </summary>
        public readonly string LinkDate;
        /// <summary>
        /// The state of the VM (`pending` \| `running` \| `stopping` \| `stopped` \| `shutting-down` \| `terminated` \| `quarantine`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The key/value combinations of the tags associated with the VMs, in the following format: `TAGKEY=TAGVALUE`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVmBlockDeviceMappingsCreatedBsusTagResult> Tags;
        /// <summary>
        /// The ID of the volume.
        /// </summary>
        public readonly string VolumeId;

        [OutputConstructor]
        private GetVmBlockDeviceMappingsCreatedBsusResult(
            bool deleteOnVmDeletion,

            string linkDate,

            string state,

            ImmutableArray<Outputs.GetVmBlockDeviceMappingsCreatedBsusTagResult> tags,

            string volumeId)
        {
            DeleteOnVmDeletion = deleteOnVmDeletion;
            LinkDate = linkDate;
            State = state;
            Tags = tags;
            VolumeId = volumeId;
        }
    }
}
