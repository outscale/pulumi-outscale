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
    public sealed class GetVmStateMaintenanceEventResult
    {
        /// <summary>
        /// The code of the event (`system-reboot` \| `system-maintenance`).
        /// </summary>
        public readonly string Code;
        /// <summary>
        /// The description of the event.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The latest scheduled end time for the event.
        /// </summary>
        public readonly string NotAfter;
        /// <summary>
        /// The earliest scheduled start time for the event.
        /// </summary>
        public readonly string NotBefore;

        [OutputConstructor]
        private GetVmStateMaintenanceEventResult(
            string code,

            string description,

            string notAfter,

            string notBefore)
        {
            Code = code;
            Description = description;
            NotAfter = notAfter;
            NotBefore = notBefore;
        }
    }
}
