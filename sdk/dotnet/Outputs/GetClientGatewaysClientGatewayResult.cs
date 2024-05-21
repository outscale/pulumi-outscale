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
    public sealed class GetClientGatewaysClientGatewayResult
    {
        /// <summary>
        /// The Autonomous System Number (ASN) used by the Border Gateway Protocol (BGP) to find the path to your client gateway through the Internet.
        /// </summary>
        public readonly int BgpAsn;
        /// <summary>
        /// The ID of the client gateway.
        /// </summary>
        public readonly string? ClientGatewayId;
        /// <summary>
        /// The type of communication tunnel used by the client gateway (only `ipsec.1` is supported).
        /// </summary>
        public readonly string ConnectionType;
        /// <summary>
        /// The public IPv4 address of the client gateway (must be a fixed address into a NATed network).
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// The state of the client gateway (`pending` \| `available` \| `deleting` \| `deleted`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The key/value combinations of the tags associated with the client gateways, in the following format: `TAGKEY=TAGVALUE`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientGatewaysClientGatewayTagResult> Tags;

        [OutputConstructor]
        private GetClientGatewaysClientGatewayResult(
            int bgpAsn,

            string? clientGatewayId,

            string connectionType,

            string publicIp,

            string state,

            ImmutableArray<Outputs.GetClientGatewaysClientGatewayTagResult> tags)
        {
            BgpAsn = bgpAsn;
            ClientGatewayId = clientGatewayId;
            ConnectionType = connectionType;
            PublicIp = publicIp;
            State = state;
            Tags = tags;
        }
    }
}