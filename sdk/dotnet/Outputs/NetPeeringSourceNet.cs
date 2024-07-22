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
    public sealed class NetPeeringSourceNet
    {
        /// <summary>
        /// The account ID of the owner of the source Net.
        /// </summary>
        public readonly string? AccountId;
        /// <summary>
        /// The IP range for the source Net, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        public readonly string? IpRange;
        /// <summary>
        /// The ID of the source Net.
        /// </summary>
        public readonly string? NetId;

        [OutputConstructor]
        private NetPeeringSourceNet(
            string? accountId,

            string? ipRange,

            string? netId)
        {
            AccountId = accountId;
            IpRange = ipRange;
            NetId = netId;
        }
    }
}
