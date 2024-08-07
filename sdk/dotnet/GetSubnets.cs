// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetSubnets
    {
        /// <summary>
        /// Provides information about Subnets.
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
        ///     var subnets01 = Outscale.GetSubnets.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSubnetsFilterInputArgs
        ///             {
        ///                 Name = "states",
        ///                 Values = new[]
        ///                 {
        ///                     "available",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetSubnetsFilterInputArgs
        ///             {
        ///                 Name = "subregion_names",
        ///                 Values = new[]
        ///                 {
        ///                     "eu-west-2a",
        ///                     "eu-west-2b",
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
        public static Task<GetSubnetsResult> InvokeAsync(GetSubnetsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubnetsResult>("outscale:index/getSubnets:getSubnets", args ?? new GetSubnetsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Subnets.
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
        ///     var subnets01 = Outscale.GetSubnets.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSubnetsFilterInputArgs
        ///             {
        ///                 Name = "states",
        ///                 Values = new[]
        ///                 {
        ///                     "available",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetSubnetsFilterInputArgs
        ///             {
        ///                 Name = "subregion_names",
        ///                 Values = new[]
        ///                 {
        ///                     "eu-west-2a",
        ///                     "eu-west-2b",
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
        public static Output<GetSubnetsResult> Invoke(GetSubnetsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubnetsResult>("outscale:index/getSubnets:getSubnets", args ?? new GetSubnetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubnetsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetSubnetsFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetSubnetsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetSubnetsFilterArgs>());
            set => _filters = value;
        }

        [Input("subnetIds")]
        private List<string>? _subnetIds;

        /// <summary>
        /// The IDs of the Subnets.
        /// </summary>
        public List<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new List<string>());
            set => _subnetIds = value;
        }

        public GetSubnetsArgs()
        {
        }
        public static new GetSubnetsArgs Empty => new GetSubnetsArgs();
    }

    public sealed class GetSubnetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetSubnetsFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetSubnetsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetSubnetsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// The IDs of the Subnets.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

        public GetSubnetsInvokeArgs()
        {
        }
        public static new GetSubnetsInvokeArgs Empty => new GetSubnetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubnetsResult
    {
        public readonly ImmutableArray<Outputs.GetSubnetsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string RequestId;
        public readonly ImmutableArray<string> SubnetIds;
        /// <summary>
        /// Information about one or more Subnets.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSubnetsSubnetResult> Subnets;

        [OutputConstructor]
        private GetSubnetsResult(
            ImmutableArray<Outputs.GetSubnetsFilterResult> filters,

            string id,

            string requestId,

            ImmutableArray<string> subnetIds,

            ImmutableArray<Outputs.GetSubnetsSubnetResult> subnets)
        {
            Filters = filters;
            Id = id;
            RequestId = requestId;
            SubnetIds = subnetIds;
            Subnets = subnets;
        }
    }
}
