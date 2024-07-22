// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetNet
    {
        /// <summary>
        /// Provides information about a Net.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-net).
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
        ///     var net01 = Outscale.GetNet.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetFilterInputArgs
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
        public static Task<GetNetResult> InvokeAsync(GetNetArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetResult>("outscale:index/getNet:getNet", args ?? new GetNetArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Net.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-net).
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
        ///     var net01 = Outscale.GetNet.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetFilterInputArgs
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
        public static Output<GetNetResult> Invoke(GetNetInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetResult>("outscale:index/getNet:getNet", args ?? new GetNetInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNetFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetNetFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNetFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the Net.
        /// </summary>
        [Input("netId")]
        public string? NetId { get; set; }

        public GetNetArgs()
        {
        }
        public static new GetNetArgs Empty => new GetNetArgs();
    }

    public sealed class GetNetInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNetFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetNetFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNetFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the Net.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        public GetNetInvokeArgs()
        {
        }
        public static new GetNetInvokeArgs Empty => new GetNetInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetResult
    {
        /// <summary>
        /// The ID of the DHCP options set (or `default` if you want to associate the default one).
        /// </summary>
        public readonly string DhcpOptionsSetId;
        public readonly ImmutableArray<Outputs.GetNetFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        public readonly string IpRange;
        /// <summary>
        /// The ID of the Net.
        /// </summary>
        public readonly string NetId;
        public readonly string RequestId;
        /// <summary>
        /// The state of the Net (`pending` \| `available` \| `deleted`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// One or more tags associated with the Net.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetTagResult> Tags;
        /// <summary>
        /// The VM tenancy in a Net.
        /// </summary>
        public readonly string Tenancy;

        [OutputConstructor]
        private GetNetResult(
            string dhcpOptionsSetId,

            ImmutableArray<Outputs.GetNetFilterResult> filters,

            string id,

            string ipRange,

            string netId,

            string requestId,

            string state,

            ImmutableArray<Outputs.GetNetTagResult> tags,

            string tenancy)
        {
            DhcpOptionsSetId = dhcpOptionsSetId;
            Filters = filters;
            Id = id;
            IpRange = ipRange;
            NetId = netId;
            RequestId = requestId;
            State = state;
            Tags = tags;
            Tenancy = tenancy;
        }
    }
}
