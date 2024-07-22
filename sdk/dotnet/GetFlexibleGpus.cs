// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetFlexibleGpus
    {
        /// <summary>
        /// Provides information about flexible GPUs.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
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
        ///     var flexibleGpus01 = Outscale.GetFlexibleGpus.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetFlexibleGpusFilterInputArgs
        ///             {
        ///                 Name = "model_names",
        ///                 Values = new[]
        ///                 {
        ///                     "nvidia-p6",
        ///                     "nvidia-p100",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetFlexibleGpusFilterInputArgs
        ///             {
        ///                 Name = "states",
        ///                 Values = new[]
        ///                 {
        ///                     "attached",
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
        public static Task<GetFlexibleGpusResult> InvokeAsync(GetFlexibleGpusArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlexibleGpusResult>("outscale:index/getFlexibleGpus:getFlexibleGpus", args ?? new GetFlexibleGpusArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about flexible GPUs.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
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
        ///     var flexibleGpus01 = Outscale.GetFlexibleGpus.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetFlexibleGpusFilterInputArgs
        ///             {
        ///                 Name = "model_names",
        ///                 Values = new[]
        ///                 {
        ///                     "nvidia-p6",
        ///                     "nvidia-p100",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetFlexibleGpusFilterInputArgs
        ///             {
        ///                 Name = "states",
        ///                 Values = new[]
        ///                 {
        ///                     "attached",
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
        public static Output<GetFlexibleGpusResult> Invoke(GetFlexibleGpusInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlexibleGpusResult>("outscale:index/getFlexibleGpus:getFlexibleGpus", args ?? new GetFlexibleGpusInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlexibleGpusArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetFlexibleGpusFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetFlexibleGpusFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetFlexibleGpusFilterArgs>());
            set => _filters = value;
        }

        public GetFlexibleGpusArgs()
        {
        }
        public static new GetFlexibleGpusArgs Empty => new GetFlexibleGpusArgs();
    }

    public sealed class GetFlexibleGpusInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetFlexibleGpusFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetFlexibleGpusFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetFlexibleGpusFilterInputArgs>());
            set => _filters = value;
        }

        public GetFlexibleGpusInvokeArgs()
        {
        }
        public static new GetFlexibleGpusInvokeArgs Empty => new GetFlexibleGpusInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlexibleGpusResult
    {
        public readonly ImmutableArray<Outputs.GetFlexibleGpusFilterResult> Filters;
        /// <summary>
        /// Information about one or more fGPUs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFlexibleGpusFlexibleGpusResult> FlexibleGpuses;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string RequestId;

        [OutputConstructor]
        private GetFlexibleGpusResult(
            ImmutableArray<Outputs.GetFlexibleGpusFilterResult> filters,

            ImmutableArray<Outputs.GetFlexibleGpusFlexibleGpusResult> flexibleGpuses,

            string id,

            string requestId)
        {
            Filters = filters;
            FlexibleGpuses = flexibleGpuses;
            Id = id;
            RequestId = requestId;
        }
    }
}
