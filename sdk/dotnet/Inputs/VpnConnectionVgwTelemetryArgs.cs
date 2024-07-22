// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VpnConnectionVgwTelemetryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of routes accepted through BGP (Border Gateway Protocol) route exchanges.
        /// </summary>
        [Input("acceptedRouteCount")]
        public Input<int>? AcceptedRouteCount { get; set; }

        /// <summary>
        /// The date and time (UTC) of the latest state update.
        /// </summary>
        [Input("lastStateChangeDate")]
        public Input<string>? LastStateChangeDate { get; set; }

        /// <summary>
        /// The IP on the OUTSCALE side of the tunnel.
        /// </summary>
        [Input("outsideIpAddress")]
        public Input<string>? OutsideIpAddress { get; set; }

        /// <summary>
        /// The state of the IPSEC tunnel (`UP` \| `DOWN`).
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// A description of the current state of the tunnel.
        /// </summary>
        [Input("stateDescription")]
        public Input<string>? StateDescription { get; set; }

        public VpnConnectionVgwTelemetryArgs()
        {
        }
        public static new VpnConnectionVgwTelemetryArgs Empty => new VpnConnectionVgwTelemetryArgs();
    }
}
