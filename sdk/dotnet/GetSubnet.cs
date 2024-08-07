// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetSubnet
    {
        /// <summary>
        /// Provides information about a Subnet.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-subnet).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Outscale = Pulumi.Outscale;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var subnet01 = Outscale.GetSubnet.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSubnetFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSubnetResult> InvokeAsync(GetSubnetArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubnetResult>("outscale:index/getSubnet:getSubnet", args ?? new GetSubnetArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Subnet.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-subnet).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Outscale = Pulumi.Outscale;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var subnet01 = Outscale.GetSubnet.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSubnetFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSubnetResult> Invoke(GetSubnetInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubnetResult>("outscale:index/getSubnet:getSubnet", args ?? new GetSubnetInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubnetArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetSubnetFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetSubnetFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetSubnetFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the Subnet.
        /// </summary>
        [Input("subnetId")]
        public string? SubnetId { get; set; }

        public GetSubnetArgs()
        {
        }
        public static new GetSubnetArgs Empty => new GetSubnetArgs();
    }

    public sealed class GetSubnetInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetSubnetFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetSubnetFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetSubnetFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the Subnet.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public GetSubnetInvokeArgs()
        {
        }
        public static new GetSubnetInvokeArgs Empty => new GetSubnetInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubnetResult
    {
        /// <summary>
        /// The number of available IPs in the Subnets.
        /// </summary>
        public readonly int AvailableIpsCount;
        public readonly ImmutableArray<Outputs.GetSubnetFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        public readonly string IpRange;
        /// <summary>
        /// If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
        /// </summary>
        public readonly bool MapPublicIpOnLaunch;
        /// <summary>
        /// The ID of the Net in which the Subnet is.
        /// </summary>
        public readonly string NetId;
        public readonly string RequestId;
        /// <summary>
        /// The state of the Subnet (`pending` \| `available` \| `deleted`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The ID of the Subnet.
        /// </summary>
        public readonly string SubnetId;
        /// <summary>
        /// The name of the Subregion in which the Subnet is located.
        /// </summary>
        public readonly string SubregionName;
        /// <summary>
        /// One or more tags associated with the Subnet.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSubnetTagResult> Tags;

        [OutputConstructor]
        private GetSubnetResult(
            int availableIpsCount,

            ImmutableArray<Outputs.GetSubnetFilterResult> filters,

            string id,

            string ipRange,

            bool mapPublicIpOnLaunch,

            string netId,

            string requestId,

            string state,

            string subnetId,

            string subregionName,

            ImmutableArray<Outputs.GetSubnetTagResult> tags)
        {
            AvailableIpsCount = availableIpsCount;
            Filters = filters;
            Id = id;
            IpRange = ipRange;
            MapPublicIpOnLaunch = mapPublicIpOnLaunch;
            NetId = netId;
            RequestId = requestId;
            State = state;
            SubnetId = subnetId;
            SubregionName = subregionName;
            Tags = tags;
        }
    }
}
