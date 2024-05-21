// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetVpnConnections
    {
        /// <summary>
        /// Provides information about VPN connections.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPN-Connections.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vpnconnection).
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
        ///     var vpnConnections01 = Outscale.GetVpnConnections.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetVpnConnectionsFilterInputArgs
        ///             {
        ///                 Name = "client_gateway_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "cgw-12345678",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetVpnConnectionsFilterInputArgs
        ///             {
        ///                 Name = "virtual_gateway_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vgw-12345678",
        ///                     "vgw-12345678",
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
        public static Task<GetVpnConnectionsResult> InvokeAsync(GetVpnConnectionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpnConnectionsResult>("outscale:index/getVpnConnections:getVpnConnections", args ?? new GetVpnConnectionsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about VPN connections.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPN-Connections.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vpnconnection).
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
        ///     var vpnConnections01 = Outscale.GetVpnConnections.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetVpnConnectionsFilterInputArgs
        ///             {
        ///                 Name = "client_gateway_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "cgw-12345678",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetVpnConnectionsFilterInputArgs
        ///             {
        ///                 Name = "virtual_gateway_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "vgw-12345678",
        ///                     "vgw-12345678",
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
        public static Output<GetVpnConnectionsResult> Invoke(GetVpnConnectionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpnConnectionsResult>("outscale:index/getVpnConnections:getVpnConnections", args ?? new GetVpnConnectionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpnConnectionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVpnConnectionsFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetVpnConnectionsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVpnConnectionsFilterArgs>());
            set => _filters = value;
        }

        [Input("vpnConnectionIds")]
        private List<string>? _vpnConnectionIds;

        /// <summary>
        /// The IDs of the VPN connections.
        /// </summary>
        public List<string> VpnConnectionIds
        {
            get => _vpnConnectionIds ?? (_vpnConnectionIds = new List<string>());
            set => _vpnConnectionIds = value;
        }

        public GetVpnConnectionsArgs()
        {
        }
        public static new GetVpnConnectionsArgs Empty => new GetVpnConnectionsArgs();
    }

    public sealed class GetVpnConnectionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVpnConnectionsFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetVpnConnectionsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVpnConnectionsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("vpnConnectionIds")]
        private InputList<string>? _vpnConnectionIds;

        /// <summary>
        /// The IDs of the VPN connections.
        /// </summary>
        public InputList<string> VpnConnectionIds
        {
            get => _vpnConnectionIds ?? (_vpnConnectionIds = new InputList<string>());
            set => _vpnConnectionIds = value;
        }

        public GetVpnConnectionsInvokeArgs()
        {
        }
        public static new GetVpnConnectionsInvokeArgs Empty => new GetVpnConnectionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpnConnectionsResult
    {
        public readonly ImmutableArray<Outputs.GetVpnConnectionsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string RequestId;
        public readonly ImmutableArray<string> VpnConnectionIds;
        /// <summary>
        /// Information about one or more VPN connections.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpnConnectionsVpnConnectionResult> VpnConnections;

        [OutputConstructor]
        private GetVpnConnectionsResult(
            ImmutableArray<Outputs.GetVpnConnectionsFilterResult> filters,

            string id,

            string requestId,

            ImmutableArray<string> vpnConnectionIds,

            ImmutableArray<Outputs.GetVpnConnectionsVpnConnectionResult> vpnConnections)
        {
            Filters = filters;
            Id = id;
            RequestId = requestId;
            VpnConnectionIds = vpnConnectionIds;
            VpnConnections = vpnConnections;
        }
    }
}