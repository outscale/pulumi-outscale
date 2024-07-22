// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetRouteTables
    {
        /// <summary>
        /// Provides information about route tables.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).
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
        ///     var routeTables01 = Outscale.GetRouteTables.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetRouteTablesFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                     "vpc-87654321",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetRouteTablesFilterInputArgs
        ///             {
        ///                 Name = "link_route_table_main",
        ///                 Values = new[]
        ///                 {
        ///                     "true",
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
        public static Task<GetRouteTablesResult> InvokeAsync(GetRouteTablesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouteTablesResult>("outscale:index/getRouteTables:getRouteTables", args ?? new GetRouteTablesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about route tables.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).
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
        ///     var routeTables01 = Outscale.GetRouteTables.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetRouteTablesFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vpc-12345678",
        ///                     "vpc-87654321",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetRouteTablesFilterInputArgs
        ///             {
        ///                 Name = "link_route_table_main",
        ///                 Values = new[]
        ///                 {
        ///                     "true",
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
        public static Output<GetRouteTablesResult> Invoke(GetRouteTablesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteTablesResult>("outscale:index/getRouteTables:getRouteTables", args ?? new GetRouteTablesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouteTablesArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetRouteTablesFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetRouteTablesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetRouteTablesFilterArgs>());
            set => _filters = value;
        }

        [Input("routeTableIds")]
        private List<string>? _routeTableIds;

        /// <summary>
        /// The ID of the route table.
        /// </summary>
        public List<string> RouteTableIds
        {
            get => _routeTableIds ?? (_routeTableIds = new List<string>());
            set => _routeTableIds = value;
        }

        public GetRouteTablesArgs()
        {
        }
        public static new GetRouteTablesArgs Empty => new GetRouteTablesArgs();
    }

    public sealed class GetRouteTablesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetRouteTablesFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetRouteTablesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetRouteTablesFilterInputArgs>());
            set => _filters = value;
        }

        [Input("routeTableIds")]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// The ID of the route table.
        /// </summary>
        public InputList<string> RouteTableIds
        {
            get => _routeTableIds ?? (_routeTableIds = new InputList<string>());
            set => _routeTableIds = value;
        }

        public GetRouteTablesInvokeArgs()
        {
        }
        public static new GetRouteTablesInvokeArgs Empty => new GetRouteTablesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouteTablesResult
    {
        public readonly ImmutableArray<Outputs.GetRouteTablesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string RequestId;
        /// <summary>
        /// The ID of the route table.
        /// </summary>
        public readonly ImmutableArray<string> RouteTableIds;
        /// <summary>
        /// Information about one or more route tables.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouteTablesRouteTableResult> RouteTables;

        [OutputConstructor]
        private GetRouteTablesResult(
            ImmutableArray<Outputs.GetRouteTablesFilterResult> filters,

            string id,

            string requestId,

            ImmutableArray<string> routeTableIds,

            ImmutableArray<Outputs.GetRouteTablesRouteTableResult> routeTables)
        {
            Filters = filters;
            Id = id;
            RequestId = requestId;
            RouteTableIds = routeTableIds;
            RouteTables = routeTables;
        }
    }
}
