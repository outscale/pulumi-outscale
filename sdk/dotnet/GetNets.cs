// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetNets
    {
        /// <summary>
        /// Provides information about Nets.
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
        ///     var nets01 = Outscale.GetNets.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetsFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                     "vpc-87654321",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetNetsFilterInputArgs
        ///             {
        ///                 Name = "ip_ranges",
        ///                 Values = new[]
        ///                 {
        ///                     "10.0.0.0/16",
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
        public static Task<GetNetsResult> InvokeAsync(GetNetsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetsResult>("outscale:index/getNets:getNets", args ?? new GetNetsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Nets.
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
        ///     var nets01 = Outscale.GetNets.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetsFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                     "vpc-87654321",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetNetsFilterInputArgs
        ///             {
        ///                 Name = "ip_ranges",
        ///                 Values = new[]
        ///                 {
        ///                     "10.0.0.0/16",
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
        public static Output<GetNetsResult> Invoke(GetNetsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetsResult>("outscale:index/getNets:getNets", args ?? new GetNetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNetsFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetNetsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNetsFilterArgs>());
            set => _filters = value;
        }

        [Input("netIds")]
        private List<string>? _netIds;

        /// <summary>
        /// The ID of the Net.
        /// </summary>
        public List<string> NetIds
        {
            get => _netIds ?? (_netIds = new List<string>());
            set => _netIds = value;
        }

        public GetNetsArgs()
        {
        }
        public static new GetNetsArgs Empty => new GetNetsArgs();
    }

    public sealed class GetNetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNetsFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetNetsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNetsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("netIds")]
        private InputList<string>? _netIds;

        /// <summary>
        /// The ID of the Net.
        /// </summary>
        public InputList<string> NetIds
        {
            get => _netIds ?? (_netIds = new InputList<string>());
            set => _netIds = value;
        }

        public GetNetsInvokeArgs()
        {
        }
        public static new GetNetsInvokeArgs Empty => new GetNetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetsResult
    {
        public readonly ImmutableArray<Outputs.GetNetsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the Net.
        /// </summary>
        public readonly ImmutableArray<string> NetIds;
        /// <summary>
        /// Information about the described Nets.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetsNetResult> Nets;
        public readonly string RequestId;

        [OutputConstructor]
        private GetNetsResult(
            ImmutableArray<Outputs.GetNetsFilterResult> filters,

            string id,

            ImmutableArray<string> netIds,

            ImmutableArray<Outputs.GetNetsNetResult> nets,

            string requestId)
        {
            Filters = filters;
            Id = id;
            NetIds = netIds;
            Nets = nets;
            RequestId = requestId;
        }
    }
}
