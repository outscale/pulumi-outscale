// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetNetPeerings
    {
        /// <summary>
        /// Provides information about Net peerings.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Peering-Connections.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netpeering).
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
        ///     var netPeerings01 = Outscale.GetNetPeerings.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetPeeringsFilterInputArgs
        ///             {
        ///                 Name = "source_net_net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetNetPeeringsFilterInputArgs
        ///             {
        ///                 Name = "state_names",
        ///                 Values = new[]
        ///                 {
        ///                     "active",
        ///                     "pending-acceptance",
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
        public static Task<GetNetPeeringsResult> InvokeAsync(GetNetPeeringsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetPeeringsResult>("outscale:index/getNetPeerings:getNetPeerings", args ?? new GetNetPeeringsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Net peerings.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Peering-Connections.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netpeering).
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
        ///     var netPeerings01 = Outscale.GetNetPeerings.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetPeeringsFilterInputArgs
        ///             {
        ///                 Name = "source_net_net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetNetPeeringsFilterInputArgs
        ///             {
        ///                 Name = "state_names",
        ///                 Values = new[]
        ///                 {
        ///                     "active",
        ///                     "pending-acceptance",
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
        public static Output<GetNetPeeringsResult> Invoke(GetNetPeeringsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetPeeringsResult>("outscale:index/getNetPeerings:getNetPeerings", args ?? new GetNetPeeringsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetPeeringsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNetPeeringsFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetNetPeeringsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNetPeeringsFilterArgs>());
            set => _filters = value;
        }

        public GetNetPeeringsArgs()
        {
        }
        public static new GetNetPeeringsArgs Empty => new GetNetPeeringsArgs();
    }

    public sealed class GetNetPeeringsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNetPeeringsFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetNetPeeringsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNetPeeringsFilterInputArgs>());
            set => _filters = value;
        }

        public GetNetPeeringsInvokeArgs()
        {
        }
        public static new GetNetPeeringsInvokeArgs Empty => new GetNetPeeringsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetPeeringsResult
    {
        public readonly ImmutableArray<Outputs.GetNetPeeringsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Information about one or more Net peerings.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetPeeringsNetPeeringResult> NetPeerings;
        public readonly string RequestId;

        [OutputConstructor]
        private GetNetPeeringsResult(
            ImmutableArray<Outputs.GetNetPeeringsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetNetPeeringsNetPeeringResult> netPeerings,

            string requestId)
        {
            Filters = filters;
            Id = id;
            NetPeerings = netPeerings;
            RequestId = requestId;
        }
    }
}
