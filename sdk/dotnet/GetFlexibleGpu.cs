// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetFlexibleGpu
    {
        /// <summary>
        /// Provides information about a flexible GPU.
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
        ///     var flexibleGpu01 = Outscale.GetFlexibleGpu.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetFlexibleGpuFilterInputArgs
        ///             {
        ///                 Name = "flexible_gpu_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "fgpu-12345678",
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
        public static Task<GetFlexibleGpuResult> InvokeAsync(GetFlexibleGpuArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlexibleGpuResult>("outscale:index/getFlexibleGpu:getFlexibleGpu", args ?? new GetFlexibleGpuArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a flexible GPU.
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
        ///     var flexibleGpu01 = Outscale.GetFlexibleGpu.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetFlexibleGpuFilterInputArgs
        ///             {
        ///                 Name = "flexible_gpu_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "fgpu-12345678",
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
        public static Output<GetFlexibleGpuResult> Invoke(GetFlexibleGpuInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlexibleGpuResult>("outscale:index/getFlexibleGpu:getFlexibleGpu", args ?? new GetFlexibleGpuInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlexibleGpuArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetFlexibleGpuFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetFlexibleGpuFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetFlexibleGpuFilterArgs>());
            set => _filters = value;
        }

        public GetFlexibleGpuArgs()
        {
        }
        public static new GetFlexibleGpuArgs Empty => new GetFlexibleGpuArgs();
    }

    public sealed class GetFlexibleGpuInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetFlexibleGpuFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetFlexibleGpuFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetFlexibleGpuFilterInputArgs>());
            set => _filters = value;
        }

        public GetFlexibleGpuInvokeArgs()
        {
        }
        public static new GetFlexibleGpuInvokeArgs Empty => new GetFlexibleGpuInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlexibleGpuResult
    {
        /// <summary>
        /// If true, the fGPU is deleted when the VM is terminated.
        /// </summary>
        public readonly bool DeleteOnVmDeletion;
        public readonly ImmutableArray<Outputs.GetFlexibleGpuFilterResult> Filters;
        /// <summary>
        /// The ID of the fGPU.
        /// </summary>
        public readonly string FlexibleGpuId;
        /// <summary>
        /// The compatible processor generation.
        /// </summary>
        public readonly string Generation;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The model of fGPU. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
        /// </summary>
        public readonly string ModelName;
        public readonly string RequestId;
        /// <summary>
        /// The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The Subregion where the fGPU is located.
        /// </summary>
        public readonly string SubregionName;
        /// <summary>
        /// The ID of the VM the fGPU is attached to, if any.
        /// </summary>
        public readonly string VmId;

        [OutputConstructor]
        private GetFlexibleGpuResult(
            bool deleteOnVmDeletion,

            ImmutableArray<Outputs.GetFlexibleGpuFilterResult> filters,

            string flexibleGpuId,

            string generation,

            string id,

            string modelName,

            string requestId,

            string state,

            string subregionName,

            string vmId)
        {
            DeleteOnVmDeletion = deleteOnVmDeletion;
            Filters = filters;
            FlexibleGpuId = flexibleGpuId;
            Generation = generation;
            Id = id;
            ModelName = modelName;
            RequestId = requestId;
            State = state;
            SubregionName = subregionName;
            VmId = vmId;
        }
    }
}
