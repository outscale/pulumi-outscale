// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    /// <summary>
    /// Manages a route table link.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).
    /// 
    /// ## Example Usage
    /// ### Required resources
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var net01 = new Outscale.Net("net01", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///     });
    /// 
    ///     var subnet01 = new Outscale.Subnet("subnet01", new()
    ///     {
    ///         NetId = net01.NetId,
    ///         IpRange = "10.0.0.0/18",
    ///     });
    /// 
    ///     var routeTable01 = new Outscale.RouteTable("routeTable01", new()
    ///     {
    ///         NetId = net01.NetId,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Link a route table to a subnet
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var routeTableLink01 = new Outscale.RouteTableLink("routeTableLink01", new()
    ///     {
    ///         SubnetId = outscale_subnet.Subnet01.Subnet_id,
    ///         RouteTableId = outscale_route_table.Route_table01.Route_table_id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A route table link can be imported using the route table ID and the route table link ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/routeTableLink:RouteTableLink ImportedRouteTableLink rtb-12345678_rtbassoc-87654321
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/routeTableLink:RouteTableLink")]
    public partial class RouteTableLink : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the association between the route table and the Subnet.
        /// </summary>
        [Output("linkRouteTableId")]
        public Output<string> LinkRouteTableId { get; private set; } = null!;

        /// <summary>
        /// If true, the route table is the main one.
        /// </summary>
        [Output("main")]
        public Output<bool> Main { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The ID of the route table.
        /// </summary>
        [Output("routeTableId")]
        public Output<string> RouteTableId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Subnet.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;


        /// <summary>
        /// Create a RouteTableLink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouteTableLink(string name, RouteTableLinkArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/routeTableLink:RouteTableLink", name, args ?? new RouteTableLinkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouteTableLink(string name, Input<string> id, RouteTableLinkState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/routeTableLink:RouteTableLink", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RouteTableLink resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouteTableLink Get(string name, Input<string> id, RouteTableLinkState? state = null, CustomResourceOptions? options = null)
        {
            return new RouteTableLink(name, id, state, options);
        }
    }

    public sealed class RouteTableLinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the route table.
        /// </summary>
        [Input("routeTableId", required: true)]
        public Input<string> RouteTableId { get; set; } = null!;

        /// <summary>
        /// The ID of the Subnet.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        public RouteTableLinkArgs()
        {
        }
        public static new RouteTableLinkArgs Empty => new RouteTableLinkArgs();
    }

    public sealed class RouteTableLinkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the association between the route table and the Subnet.
        /// </summary>
        [Input("linkRouteTableId")]
        public Input<string>? LinkRouteTableId { get; set; }

        /// <summary>
        /// If true, the route table is the main one.
        /// </summary>
        [Input("main")]
        public Input<bool>? Main { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The ID of the route table.
        /// </summary>
        [Input("routeTableId")]
        public Input<string>? RouteTableId { get; set; }

        /// <summary>
        /// The ID of the Subnet.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public RouteTableLinkState()
        {
        }
        public static new RouteTableLinkState Empty => new RouteTableLinkState();
    }
}
