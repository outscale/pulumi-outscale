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
    public sealed class GetNatServicesNatServiceResult
    {
        /// <summary>
        /// The ID of the NAT service.
        /// </summary>
        public readonly string NatServiceId;
        /// <summary>
        /// The ID of the Net in which the NAT service is.
        /// </summary>
        public readonly string NetId;
        /// <summary>
        /// Information about the public IP or IPs associated with the NAT service.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNatServicesNatServicePublicIpResult> PublicIps;
        /// <summary>
        /// The state of the NAT service (`pending` \| `available` \| `deleting` \| `deleted`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The ID of the Subnet in which the NAT service is.
        /// </summary>
        public readonly string SubnetId;
        /// <summary>
        /// The key/value combinations of the tags associated with the NAT services, in the following format: `TAGKEY=TAGVALUE`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNatServicesNatServiceTagResult> Tags;

        [OutputConstructor]
        private GetNatServicesNatServiceResult(
            string natServiceId,

            string netId,

            ImmutableArray<Outputs.GetNatServicesNatServicePublicIpResult> publicIps,

            string state,

            string subnetId,

            ImmutableArray<Outputs.GetNatServicesNatServiceTagResult> tags)
        {
            NatServiceId = natServiceId;
            NetId = netId;
            PublicIps = publicIps;
            State = state;
            SubnetId = subnetId;
            Tags = tags;
        }
    }
}