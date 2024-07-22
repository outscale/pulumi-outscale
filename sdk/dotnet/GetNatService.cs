// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetNatService
    {
        /// <summary>
        /// Provides information about a NAT service.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-NAT-Gateways.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-natservice).
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
        ///     var natService01 = Outscale.GetNatService.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNatServiceFilterInputArgs
        ///             {
        ///                 Name = "nat_service_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "nat-12345678",
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
        public static Task<GetNatServiceResult> InvokeAsync(GetNatServiceArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNatServiceResult>("outscale:index/getNatService:getNatService", args ?? new GetNatServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a NAT service.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-NAT-Gateways.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-natservice).
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
        ///     var natService01 = Outscale.GetNatService.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetNatServiceFilterInputArgs
        ///             {
        ///                 Name = "nat_service_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "nat-12345678",
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
        public static Output<GetNatServiceResult> Invoke(GetNatServiceInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNatServiceResult>("outscale:index/getNatService:getNatService", args ?? new GetNatServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNatServiceArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNatServiceFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetNatServiceFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNatServiceFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the NAT service.
        /// </summary>
        [Input("natServiceId")]
        public string? NatServiceId { get; set; }

        public GetNatServiceArgs()
        {
        }
        public static new GetNatServiceArgs Empty => new GetNatServiceArgs();
    }

    public sealed class GetNatServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNatServiceFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetNatServiceFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNatServiceFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the NAT service.
        /// </summary>
        [Input("natServiceId")]
        public Input<string>? NatServiceId { get; set; }

        public GetNatServiceInvokeArgs()
        {
        }
        public static new GetNatServiceInvokeArgs Empty => new GetNatServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetNatServiceResult
    {
        public readonly ImmutableArray<Outputs.GetNatServiceFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the NAT service.
        /// </summary>
        public readonly string? NatServiceId;
        /// <summary>
        /// The ID of the Net in which the NAT service is.
        /// </summary>
        public readonly string NetId;
        /// <summary>
        /// Information about the public IP or IPs associated with the NAT service.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNatServicePublicIpResult> PublicIps;
        public readonly string RequestId;
        /// <summary>
        /// The state of the NAT service (`pending` \| `available` \| `deleting` \| `deleted`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The ID of the Subnet in which the NAT service is.
        /// </summary>
        public readonly string SubnetId;
        /// <summary>
        /// One or more tags associated with the NAT service.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNatServiceTagResult> Tags;

        [OutputConstructor]
        private GetNatServiceResult(
            ImmutableArray<Outputs.GetNatServiceFilterResult> filters,

            string id,

            string? natServiceId,

            string netId,

            ImmutableArray<Outputs.GetNatServicePublicIpResult> publicIps,

            string requestId,

            string state,

            string subnetId,

            ImmutableArray<Outputs.GetNatServiceTagResult> tags)
        {
            Filters = filters;
            Id = id;
            NatServiceId = natServiceId;
            NetId = netId;
            PublicIps = publicIps;
            RequestId = requestId;
            State = state;
            SubnetId = subnetId;
            Tags = tags;
        }
    }
}
