// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetLoadBalancerVmHealth
    {
        /// <summary>
        /// Provides information about the health of one or more back-end VMs registered with a specific load balancer.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmshealth).
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
        ///     var loadBalancerVmHealth01 = Outscale.GetLoadBalancerVmHealth.Invoke(new()
        ///     {
        ///         BackendVmIds = new[]
        ///         {
        ///             "i-12345678",
        ///             "i-87654321",
        ///         },
        ///         LoadBalancerName = "load_balancer01",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLoadBalancerVmHealthResult> InvokeAsync(GetLoadBalancerVmHealthArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerVmHealthResult>("outscale:index/getLoadBalancerVmHealth:getLoadBalancerVmHealth", args ?? new GetLoadBalancerVmHealthArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about the health of one or more back-end VMs registered with a specific load balancer.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmshealth).
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
        ///     var loadBalancerVmHealth01 = Outscale.GetLoadBalancerVmHealth.Invoke(new()
        ///     {
        ///         BackendVmIds = new[]
        ///         {
        ///             "i-12345678",
        ///             "i-87654321",
        ///         },
        ///         LoadBalancerName = "load_balancer01",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLoadBalancerVmHealthResult> Invoke(GetLoadBalancerVmHealthInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerVmHealthResult>("outscale:index/getLoadBalancerVmHealth:getLoadBalancerVmHealth", args ?? new GetLoadBalancerVmHealthInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancerVmHealthArgs : global::Pulumi.InvokeArgs
    {
        [Input("backendVmIds")]
        private List<string>? _backendVmIds;

        /// <summary>
        /// One or more IDs of back-end VMs.
        /// </summary>
        public List<string> BackendVmIds
        {
            get => _backendVmIds ?? (_backendVmIds = new List<string>());
            set => _backendVmIds = value;
        }

        [Input("filters")]
        private List<Inputs.GetLoadBalancerVmHealthFilterArgs>? _filters;
        public List<Inputs.GetLoadBalancerVmHealthFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetLoadBalancerVmHealthFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The name of the load balancer.
        /// </summary>
        [Input("loadBalancerName", required: true)]
        public string LoadBalancerName { get; set; } = null!;

        public GetLoadBalancerVmHealthArgs()
        {
        }
        public static new GetLoadBalancerVmHealthArgs Empty => new GetLoadBalancerVmHealthArgs();
    }

    public sealed class GetLoadBalancerVmHealthInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("backendVmIds")]
        private InputList<string>? _backendVmIds;

        /// <summary>
        /// One or more IDs of back-end VMs.
        /// </summary>
        public InputList<string> BackendVmIds
        {
            get => _backendVmIds ?? (_backendVmIds = new InputList<string>());
            set => _backendVmIds = value;
        }

        [Input("filters")]
        private InputList<Inputs.GetLoadBalancerVmHealthFilterInputArgs>? _filters;
        public InputList<Inputs.GetLoadBalancerVmHealthFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetLoadBalancerVmHealthFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The name of the load balancer.
        /// </summary>
        [Input("loadBalancerName", required: true)]
        public Input<string> LoadBalancerName { get; set; } = null!;

        public GetLoadBalancerVmHealthInvokeArgs()
        {
        }
        public static new GetLoadBalancerVmHealthInvokeArgs Empty => new GetLoadBalancerVmHealthInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadBalancerVmHealthResult
    {
        /// <summary>
        /// Information about the health of one or more back-end VMs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancerVmHealthBackendVmHealthResult> BackendVmHealths;
        public readonly ImmutableArray<string> BackendVmIds;
        public readonly ImmutableArray<Outputs.GetLoadBalancerVmHealthFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string LoadBalancerName;
        public readonly string RequestId;

        [OutputConstructor]
        private GetLoadBalancerVmHealthResult(
            ImmutableArray<Outputs.GetLoadBalancerVmHealthBackendVmHealthResult> backendVmHealths,

            ImmutableArray<string> backendVmIds,

            ImmutableArray<Outputs.GetLoadBalancerVmHealthFilterResult> filters,

            string id,

            string loadBalancerName,

            string requestId)
        {
            BackendVmHealths = backendVmHealths;
            BackendVmIds = backendVmIds;
            Filters = filters;
            Id = id;
            LoadBalancerName = loadBalancerName;
            RequestId = requestId;
        }
    }
}
