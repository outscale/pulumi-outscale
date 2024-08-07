// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetPublicIps
    {
        /// <summary>
        /// Provides information about public IPs.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-EIPs.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-publicip).
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
        ///     var publicIps01 = Outscale.GetPublicIps.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetPublicIpsFilterInputArgs
        ///             {
        ///                 Name = "public_ips",
        ///                 Values = new[]
        ///                 {
        ///                     "111.11.111.1",
        ///                     "222.22.222.2",
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
        public static Task<GetPublicIpsResult> InvokeAsync(GetPublicIpsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPublicIpsResult>("outscale:index/getPublicIps:getPublicIps", args ?? new GetPublicIpsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about public IPs.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-EIPs.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-publicip).
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
        ///     var publicIps01 = Outscale.GetPublicIps.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetPublicIpsFilterInputArgs
        ///             {
        ///                 Name = "public_ips",
        ///                 Values = new[]
        ///                 {
        ///                     "111.11.111.1",
        ///                     "222.22.222.2",
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
        public static Output<GetPublicIpsResult> Invoke(GetPublicIpsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPublicIpsResult>("outscale:index/getPublicIps:getPublicIps", args ?? new GetPublicIpsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPublicIpsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetPublicIpsFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetPublicIpsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetPublicIpsFilterArgs>());
            set => _filters = value;
        }

        public GetPublicIpsArgs()
        {
        }
        public static new GetPublicIpsArgs Empty => new GetPublicIpsArgs();
    }

    public sealed class GetPublicIpsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetPublicIpsFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetPublicIpsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetPublicIpsFilterInputArgs>());
            set => _filters = value;
        }

        public GetPublicIpsInvokeArgs()
        {
        }
        public static new GetPublicIpsInvokeArgs Empty => new GetPublicIpsInvokeArgs();
    }


    [OutputType]
    public sealed class GetPublicIpsResult
    {
        public readonly ImmutableArray<Outputs.GetPublicIpsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Information about one or more public IPs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPublicIpsPublicIpResult> PublicIps;
        public readonly string RequestId;

        [OutputConstructor]
        private GetPublicIpsResult(
            ImmutableArray<Outputs.GetPublicIpsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetPublicIpsPublicIpResult> publicIps,

            string requestId)
        {
            Filters = filters;
            Id = id;
            PublicIps = publicIps;
            RequestId = requestId;
        }
    }
}
