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
    public sealed class GetVirtualGatewaysVirtualGatewayResult
    {
        /// <summary>
        /// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
        /// </summary>
        public readonly string ConnectionType;
        /// <summary>
        /// The Net to which the virtual gateway is attached.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVirtualGatewaysVirtualGatewayNetToVirtualGatewayLinkResult> NetToVirtualGatewayLinks;
        /// <summary>
        /// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The key/value combinations of the tags associated with the virtual gateways, in the following format: `TAGKEY=TAGVALUE`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVirtualGatewaysVirtualGatewayTagResult> Tags;
        /// <summary>
        /// The ID of the virtual gateway.
        /// </summary>
        public readonly string VirtualGatewayId;

        [OutputConstructor]
        private GetVirtualGatewaysVirtualGatewayResult(
            string connectionType,

            ImmutableArray<Outputs.GetVirtualGatewaysVirtualGatewayNetToVirtualGatewayLinkResult> netToVirtualGatewayLinks,

            string state,

            ImmutableArray<Outputs.GetVirtualGatewaysVirtualGatewayTagResult> tags,

            string virtualGatewayId)
        {
            ConnectionType = connectionType;
            NetToVirtualGatewayLinks = netToVirtualGatewayLinks;
            State = state;
            Tags = tags;
            VirtualGatewayId = virtualGatewayId;
        }
    }
}
