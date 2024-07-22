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
    public sealed class RouteTableLinkRouteTable
    {
        /// <summary>
        /// The ID of the association between the route table and the Subnet.
        /// </summary>
        public readonly string? LinkRouteTableId;
        /// <summary>
        /// If true, the route table is the main one.
        /// </summary>
        public readonly bool? Main;
        /// <summary>
        /// The ID of the route table.
        /// </summary>
        public readonly string? RouteTableId;
        public readonly string? RouteTableToSubnetLinkId;
        /// <summary>
        /// The ID of the Subnet.
        /// </summary>
        public readonly string? SubnetId;

        [OutputConstructor]
        private RouteTableLinkRouteTable(
            string? linkRouteTableId,

            bool? main,

            string? routeTableId,

            string? routeTableToSubnetLinkId,

            string? subnetId)
        {
            LinkRouteTableId = linkRouteTableId;
            Main = main;
            RouteTableId = routeTableId;
            RouteTableToSubnetLinkId = routeTableToSubnetLinkId;
            SubnetId = subnetId;
        }
    }
}
