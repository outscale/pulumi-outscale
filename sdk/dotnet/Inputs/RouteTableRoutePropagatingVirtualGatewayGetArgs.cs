// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class RouteTableRoutePropagatingVirtualGatewayGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the virtual gateway.
        /// </summary>
        [Input("virtualGatewayId")]
        public Input<string>? VirtualGatewayId { get; set; }

        public RouteTableRoutePropagatingVirtualGatewayGetArgs()
        {
        }
        public static new RouteTableRoutePropagatingVirtualGatewayGetArgs Empty => new RouteTableRoutePropagatingVirtualGatewayGetArgs();
    }
}
