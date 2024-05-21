// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetVirtualGateways
    {
        /// <summary>
        /// Provides information about virtual gateways.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Virtual-Private-Gateways.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-virtualgateway).
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
        ///     var virtualGateways01 = Outscale.GetVirtualGateways.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetVirtualGatewaysFilterInputArgs
        ///             {
        ///                 Name = "states",
        ///                 Values = new[]
        ///                 {
        ///                     "available",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetVirtualGatewaysFilterInputArgs
        ///             {
        ///                 Name = "link_states",
        ///                 Values = new[]
        ///                 {
        ///                     "attached",
        ///                     "detached",
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
        public static Task<GetVirtualGatewaysResult> InvokeAsync(GetVirtualGatewaysArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVirtualGatewaysResult>("outscale:index/getVirtualGateways:getVirtualGateways", args ?? new GetVirtualGatewaysArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about virtual gateways.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Virtual-Private-Gateways.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-virtualgateway).
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
        ///     var virtualGateways01 = Outscale.GetVirtualGateways.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetVirtualGatewaysFilterInputArgs
        ///             {
        ///                 Name = "states",
        ///                 Values = new[]
        ///                 {
        ///                     "available",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetVirtualGatewaysFilterInputArgs
        ///             {
        ///                 Name = "link_states",
        ///                 Values = new[]
        ///                 {
        ///                     "attached",
        ///                     "detached",
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
        public static Output<GetVirtualGatewaysResult> Invoke(GetVirtualGatewaysInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVirtualGatewaysResult>("outscale:index/getVirtualGateways:getVirtualGateways", args ?? new GetVirtualGatewaysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVirtualGatewaysArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVirtualGatewaysFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetVirtualGatewaysFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVirtualGatewaysFilterArgs>());
            set => _filters = value;
        }

        [Input("virtualGatewayIds")]
        private List<string>? _virtualGatewayIds;

        /// <summary>
        /// The ID of the virtual gateway.
        /// </summary>
        public List<string> VirtualGatewayIds
        {
            get => _virtualGatewayIds ?? (_virtualGatewayIds = new List<string>());
            set => _virtualGatewayIds = value;
        }

        public GetVirtualGatewaysArgs()
        {
        }
        public static new GetVirtualGatewaysArgs Empty => new GetVirtualGatewaysArgs();
    }

    public sealed class GetVirtualGatewaysInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVirtualGatewaysFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetVirtualGatewaysFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVirtualGatewaysFilterInputArgs>());
            set => _filters = value;
        }

        [Input("virtualGatewayIds")]
        private InputList<string>? _virtualGatewayIds;

        /// <summary>
        /// The ID of the virtual gateway.
        /// </summary>
        public InputList<string> VirtualGatewayIds
        {
            get => _virtualGatewayIds ?? (_virtualGatewayIds = new InputList<string>());
            set => _virtualGatewayIds = value;
        }

        public GetVirtualGatewaysInvokeArgs()
        {
        }
        public static new GetVirtualGatewaysInvokeArgs Empty => new GetVirtualGatewaysInvokeArgs();
    }


    [OutputType]
    public sealed class GetVirtualGatewaysResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualGatewaysFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string RequestId;
        /// <summary>
        /// The ID of the virtual gateway.
        /// </summary>
        public readonly ImmutableArray<string> VirtualGatewayIds;
        /// <summary>
        /// Information about one or more virtual gateways.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVirtualGatewaysVirtualGatewayResult> VirtualGateways;

        [OutputConstructor]
        private GetVirtualGatewaysResult(
            ImmutableArray<Outputs.GetVirtualGatewaysFilterResult> filters,

            string id,

            string requestId,

            ImmutableArray<string> virtualGatewayIds,

            ImmutableArray<Outputs.GetVirtualGatewaysVirtualGatewayResult> virtualGateways)
        {
            Filters = filters;
            Id = id;
            RequestId = requestId;
            VirtualGatewayIds = virtualGatewayIds;
            VirtualGateways = virtualGateways;
        }
    }
}