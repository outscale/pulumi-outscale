// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VirtualGatewayNetToVirtualGatewayLinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Net to which the virtual gateway is attached.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        /// <summary>
        /// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public VirtualGatewayNetToVirtualGatewayLinkArgs()
        {
        }
        public static new VirtualGatewayNetToVirtualGatewayLinkArgs Empty => new VirtualGatewayNetToVirtualGatewayLinkArgs();
    }
}
