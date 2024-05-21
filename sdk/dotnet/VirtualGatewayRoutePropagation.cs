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
    /// Manages a virtual gateway route propagation.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Routing-Configuration-for-VPN-Connections.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updateroutepropagation).
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
    ///     var virtualGateway01 = new Outscale.VirtualGateway("virtualGateway01", new()
    ///     {
    ///         ConnectionType = "ipsec.1",
    ///     });
    /// 
    ///     var net01 = new Outscale.Net("net01", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///     });
    /// 
    ///     var routeTable01 = new Outscale.RouteTable("routeTable01", new()
    ///     {
    ///         NetId = net01.NetId,
    ///     });
    /// 
    ///     var virtualGatewayLink01 = new Outscale.VirtualGatewayLink("virtualGatewayLink01", new()
    ///     {
    ///         VirtualGatewayId = virtualGateway01.VirtualGatewayId,
    ///         NetId = net01.NetId,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Activate the propagation of routes to a route table of a Net by a virtual gateway
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var virtualGatewayRoutePropagation01 = new Outscale.VirtualGatewayRoutePropagation("virtualGatewayRoutePropagation01", new()
    ///     {
    ///         Enable = true,
    ///         VirtualGatewayId = outscale_virtual_gateway.Virtual_gateway01.Virtual_gateway_id,
    ///         RouteTableId = outscale_route_table.Route_table01.Route_table_id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             outscale_virtual_gateway_link.Virtual_gateway_link01,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation")]
    public partial class VirtualGatewayRoutePropagation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
        /// </summary>
        [Output("enable")]
        public Output<bool> Enable { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The ID of the route table.
        /// </summary>
        [Output("routeTableId")]
        public Output<string> RouteTableId { get; private set; } = null!;

        /// <summary>
        /// The ID of the virtual gateway.
        /// </summary>
        [Output("virtualGatewayId")]
        public Output<string> VirtualGatewayId { get; private set; } = null!;


        /// <summary>
        /// Create a VirtualGatewayRoutePropagation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VirtualGatewayRoutePropagation(string name, VirtualGatewayRoutePropagationArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation", name, args ?? new VirtualGatewayRoutePropagationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VirtualGatewayRoutePropagation(string name, Input<string> id, VirtualGatewayRoutePropagationState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VirtualGatewayRoutePropagation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VirtualGatewayRoutePropagation Get(string name, Input<string> id, VirtualGatewayRoutePropagationState? state = null, CustomResourceOptions? options = null)
        {
            return new VirtualGatewayRoutePropagation(name, id, state, options);
        }
    }

    public sealed class VirtualGatewayRoutePropagationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
        /// </summary>
        [Input("enable", required: true)]
        public Input<bool> Enable { get; set; } = null!;

        /// <summary>
        /// The ID of the route table.
        /// </summary>
        [Input("routeTableId", required: true)]
        public Input<string> RouteTableId { get; set; } = null!;

        /// <summary>
        /// The ID of the virtual gateway.
        /// </summary>
        [Input("virtualGatewayId", required: true)]
        public Input<string> VirtualGatewayId { get; set; } = null!;

        public VirtualGatewayRoutePropagationArgs()
        {
        }
        public static new VirtualGatewayRoutePropagationArgs Empty => new VirtualGatewayRoutePropagationArgs();
    }

    public sealed class VirtualGatewayRoutePropagationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The ID of the route table.
        /// </summary>
        [Input("routeTableId")]
        public Input<string>? RouteTableId { get; set; }

        /// <summary>
        /// The ID of the virtual gateway.
        /// </summary>
        [Input("virtualGatewayId")]
        public Input<string>? VirtualGatewayId { get; set; }

        public VirtualGatewayRoutePropagationState()
        {
        }
        public static new VirtualGatewayRoutePropagationState Empty => new VirtualGatewayRoutePropagationState();
    }
}