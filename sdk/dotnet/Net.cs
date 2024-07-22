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
    /// Manages a Net.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-net).
    /// 
    /// ## Example Usage
    /// ### Create a Net
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
    ///         IpRange = "10.10.0.0/16",
    ///         Tenancy = "default",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a Net with a network
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var net02 = new Outscale.Net("net02", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///     });
    /// 
    ///     var subnet01 = new Outscale.Subnet("subnet01", new()
    ///     {
    ///         NetId = net02.NetId,
    ///         IpRange = "10.0.0.0/18",
    ///     });
    /// 
    ///     var publicIp01 = new Outscale.PublicIp("publicIp01");
    /// 
    ///     var natService01 = new Outscale.NatService("natService01", new()
    ///     {
    ///         SubnetId = subnet01.SubnetId,
    ///         PublicIpId = publicIp01.PublicIpId,
    ///     });
    /// 
    ///     var routeTable01 = new Outscale.RouteTable("routeTable01", new()
    ///     {
    ///         NetId = net02.NetId,
    ///     });
    /// 
    ///     var internetService01 = new Outscale.InternetService("internetService01");
    /// 
    ///     var route01 = new Outscale.Route("route01", new()
    ///     {
    ///         DestinationIpRange = "0.0.0.0/0",
    ///         GatewayId = internetService01.InternetServiceId,
    ///         RouteTableId = routeTable01.RouteTableId,
    ///     });
    /// 
    ///     var routeTableLink01 = new Outscale.RouteTableLink("routeTableLink01", new()
    ///     {
    ///         SubnetId = subnet01.SubnetId,
    ///         RouteTableId = routeTable01.Id,
    ///     });
    /// 
    ///     var internetServiceLink01 = new Outscale.InternetServiceLink("internetServiceLink01", new()
    ///     {
    ///         NetId = net02.NetId,
    ///         InternetServiceId = internetService01.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A Net can be imported using its ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/net:Net ImportedNet vpc-87654321
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/net:Net")]
    public partial class Net : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the DHCP options set (or `default` if you want to associate the default one).
        /// </summary>
        [Output("dhcpOptionsSetId")]
        public Output<string> DhcpOptionsSetId { get; private set; } = null!;

        /// <summary>
        /// The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        [Output("ipRange")]
        public Output<string> IpRange { get; private set; } = null!;

        /// <summary>
        /// The ID of the Net.
        /// </summary>
        [Output("netId")]
        public Output<string> NetId { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The state of the Net (`pending` \| `available` \| `deleted`).
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.NetTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The tenancy options for the VMs (`default` if a VM created in a Net can be launched with any tenancy, `dedicated` if it can be launched with dedicated tenancy VMs running on single-tenant hardware).
        /// </summary>
        [Output("tenancy")]
        public Output<string> Tenancy { get; private set; } = null!;


        /// <summary>
        /// Create a Net resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Net(string name, NetArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/net:Net", name, args ?? new NetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Net(string name, Input<string> id, NetState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/net:Net", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Net resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Net Get(string name, Input<string> id, NetState? state = null, CustomResourceOptions? options = null)
        {
            return new Net(name, id, state, options);
        }
    }

    public sealed class NetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        [Input("ipRange", required: true)]
        public Input<string> IpRange { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.NetTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.NetTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.NetTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The tenancy options for the VMs (`default` if a VM created in a Net can be launched with any tenancy, `dedicated` if it can be launched with dedicated tenancy VMs running on single-tenant hardware).
        /// </summary>
        [Input("tenancy")]
        public Input<string>? Tenancy { get; set; }

        public NetArgs()
        {
        }
        public static new NetArgs Empty => new NetArgs();
    }

    public sealed class NetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the DHCP options set (or `default` if you want to associate the default one).
        /// </summary>
        [Input("dhcpOptionsSetId")]
        public Input<string>? DhcpOptionsSetId { get; set; }

        /// <summary>
        /// The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        [Input("ipRange")]
        public Input<string>? IpRange { get; set; }

        /// <summary>
        /// The ID of the Net.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The state of the Net (`pending` \| `available` \| `deleted`).
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputList<Inputs.NetTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.NetTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.NetTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The tenancy options for the VMs (`default` if a VM created in a Net can be launched with any tenancy, `dedicated` if it can be launched with dedicated tenancy VMs running on single-tenant hardware).
        /// </summary>
        [Input("tenancy")]
        public Input<string>? Tenancy { get; set; }

        public NetState()
        {
        }
        public static new NetState Empty => new NetState();
    }
}
