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
    public sealed class GetSubnetsSubnetResult
    {
        /// <summary>
        /// The number of available IPs in the Subnets.
        /// </summary>
        public readonly int AvailableIpsCount;
        /// <summary>
        /// The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        public readonly string IpRange;
        /// <summary>
        /// If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
        /// </summary>
        public readonly bool MapPublicIpOnLaunch;
        /// <summary>
        /// The ID of the Net in which the Subnet is.
        /// </summary>
        public readonly string NetId;
        /// <summary>
        /// The state of the Subnet (`pending` \| `available` \| `deleted`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The ID of the Subnet.
        /// </summary>
        public readonly string SubnetId;
        /// <summary>
        /// The name of the Subregion in which the Subnet is located.
        /// </summary>
        public readonly string SubregionName;
        /// <summary>
        /// The key/value combinations of the tags associated with the Subnets, in the following format: `TAGKEY=TAGVALUE`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSubnetsSubnetTagResult> Tags;

        [OutputConstructor]
        private GetSubnetsSubnetResult(
            int availableIpsCount,

            string ipRange,

            bool mapPublicIpOnLaunch,

            string netId,

            string state,

            string subnetId,

            string subregionName,

            ImmutableArray<Outputs.GetSubnetsSubnetTagResult> tags)
        {
            AvailableIpsCount = availableIpsCount;
            IpRange = ipRange;
            MapPublicIpOnLaunch = mapPublicIpOnLaunch;
            NetId = netId;
            State = state;
            SubnetId = subnetId;
            SubregionName = subregionName;
            Tags = tags;
        }
    }
}
