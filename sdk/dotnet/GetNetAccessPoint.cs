// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetNetAccessPoint
    {
        /// <summary>
        /// Provides information about a Net access point.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Endpoints.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netaccesspoint).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### List a Net access point
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Outscale = Pulumi.Outscale;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var netAccessPoint01 = Outscale.GetNetAccessPoint.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetAccessPointFilterInputArgs
        ///             {
        ///                 Name = "net_access_point_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpce-12345678",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### List a Net access point according to its Net and state
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Outscale = Pulumi.Outscale;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var netAccessPoint02 = Outscale.GetNetAccessPoint.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetAccessPointFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetNetAccessPointFilterInputArgs
        ///             {
        ///                 Name = "states",
        ///                 Values = new[]
        ///                 {
        ///                     "available",
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
        public static Task<GetNetAccessPointResult> InvokeAsync(GetNetAccessPointArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetAccessPointResult>("outscale:index/getNetAccessPoint:getNetAccessPoint", args ?? new GetNetAccessPointArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Net access point.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Endpoints.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netaccesspoint).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### List a Net access point
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Outscale = Pulumi.Outscale;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var netAccessPoint01 = Outscale.GetNetAccessPoint.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetAccessPointFilterInputArgs
        ///             {
        ///                 Name = "net_access_point_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpce-12345678",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### List a Net access point according to its Net and state
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Outscale = Pulumi.Outscale;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var netAccessPoint02 = Outscale.GetNetAccessPoint.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNetAccessPointFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetNetAccessPointFilterInputArgs
        ///             {
        ///                 Name = "states",
        ///                 Values = new[]
        ///                 {
        ///                     "available",
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
        public static Output<GetNetAccessPointResult> Invoke(GetNetAccessPointInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetAccessPointResult>("outscale:index/getNetAccessPoint:getNetAccessPoint", args ?? new GetNetAccessPointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetAccessPointArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNetAccessPointFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetNetAccessPointFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNetAccessPointFilterArgs>());
            set => _filters = value;
        }

        public GetNetAccessPointArgs()
        {
        }
        public static new GetNetAccessPointArgs Empty => new GetNetAccessPointArgs();
    }

    public sealed class GetNetAccessPointInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNetAccessPointFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetNetAccessPointFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNetAccessPointFilterInputArgs>());
            set => _filters = value;
        }

        public GetNetAccessPointInvokeArgs()
        {
        }
        public static new GetNetAccessPointInvokeArgs Empty => new GetNetAccessPointInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetAccessPointResult
    {
        public readonly ImmutableArray<Outputs.GetNetAccessPointFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the Net access point.
        /// </summary>
        public readonly string NetAccessPointId;
        /// <summary>
        /// The ID of the Net with which the Net access point is associated.
        /// </summary>
        public readonly string NetId;
        public readonly string RequestId;
        /// <summary>
        /// The ID of the route tables associated with the Net access point.
        /// </summary>
        public readonly ImmutableArray<string> RouteTableIds;
        /// <summary>
        /// The name of the service with which the Net access point is associated.
        /// </summary>
        public readonly string ServiceName;
        /// <summary>
        /// The state of the Net access point (`pending` \| `available` \| `deleting` \| `deleted`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// One or more tags associated with the Net access point.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetAccessPointTagResult> Tags;

        [OutputConstructor]
        private GetNetAccessPointResult(
            ImmutableArray<Outputs.GetNetAccessPointFilterResult> filters,

            string id,

            string netAccessPointId,

            string netId,

            string requestId,

            ImmutableArray<string> routeTableIds,

            string serviceName,

            string state,

            ImmutableArray<Outputs.GetNetAccessPointTagResult> tags)
        {
            Filters = filters;
            Id = id;
            NetAccessPointId = netAccessPointId;
            NetId = netId;
            RequestId = requestId;
            RouteTableIds = routeTableIds;
            ServiceName = serviceName;
            State = state;
            Tags = tags;
        }
    }
}
