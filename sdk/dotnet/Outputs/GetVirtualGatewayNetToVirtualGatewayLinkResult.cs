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
    public sealed class GetVirtualGatewayNetToVirtualGatewayLinkResult
    {
        /// <summary>
        /// The ID of the Net to which the virtual gateway is attached.
        /// </summary>
        public readonly string NetId;
        /// <summary>
        /// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private GetVirtualGatewayNetToVirtualGatewayLinkResult(
            string netId,

            string state)
        {
            NetId = netId;
            State = state;
        }
    }
}