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
    public sealed class GetVmPrimaryNicLinkNicResult
    {
        /// <summary>
        /// If true, the NIC is deleted when the VM is terminated.
        /// </summary>
        public readonly bool DeleteOnVmDeletion;
        /// <summary>
        /// The device index for the NIC attachment (between `1` and `7`, both included).
        /// </summary>
        public readonly string DeviceNumber;
        /// <summary>
        /// The ID of the NIC to attach.
        /// </summary>
        public readonly string LinkNicId;
        /// <summary>
        /// The state of the VM (`pending` \| `running` \| `stopping` \| `stopped` \| `shutting-down` \| `terminated` \| `quarantine`).
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private GetVmPrimaryNicLinkNicResult(
            bool deleteOnVmDeletion,

            string deviceNumber,

            string linkNicId,

            string state)
        {
            DeleteOnVmDeletion = deleteOnVmDeletion;
            DeviceNumber = deviceNumber;
            LinkNicId = linkNicId;
            State = state;
        }
    }
}
