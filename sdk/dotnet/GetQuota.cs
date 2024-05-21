// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetQuota
    {
        /// <summary>
        /// Provides information about a quota.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Your-Account.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readquotas).
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
        ///     var loadBalancerListenersQuota01 = Outscale.GetQuota.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetQuotaFilterInputArgs
        ///             {
        ///                 Name = "collections",
        ///                 Values = new[]
        ///                 {
        ///                     "LBU",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetQuotaFilterInputArgs
        ///             {
        ///                 Name = "quota_names",
        ///                 Values = new[]
        ///                 {
        ///                     "lb_listeners_limit",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetQuotaFilterInputArgs
        ///             {
        ///                 Name = "quota_types",
        ///                 Values = new[]
        ///                 {
        ///                     "global",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetQuotaFilterInputArgs
        ///             {
        ///                 Name = "short_descriptions",
        ///                 Values = new[]
        ///                 {
        ///                     "Load Balancer Listeners Limit",
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
        public static Task<GetQuotaResult> InvokeAsync(GetQuotaArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetQuotaResult>("outscale:index/getQuota:getQuota", args ?? new GetQuotaArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a quota.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Your-Account.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readquotas).
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
        ///     var loadBalancerListenersQuota01 = Outscale.GetQuota.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetQuotaFilterInputArgs
        ///             {
        ///                 Name = "collections",
        ///                 Values = new[]
        ///                 {
        ///                     "LBU",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetQuotaFilterInputArgs
        ///             {
        ///                 Name = "quota_names",
        ///                 Values = new[]
        ///                 {
        ///                     "lb_listeners_limit",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetQuotaFilterInputArgs
        ///             {
        ///                 Name = "quota_types",
        ///                 Values = new[]
        ///                 {
        ///                     "global",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetQuotaFilterInputArgs
        ///             {
        ///                 Name = "short_descriptions",
        ///                 Values = new[]
        ///                 {
        ///                     "Load Balancer Listeners Limit",
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
        public static Output<GetQuotaResult> Invoke(GetQuotaInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetQuotaResult>("outscale:index/getQuota:getQuota", args ?? new GetQuotaInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetQuotaArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetQuotaFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetQuotaFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetQuotaFilterArgs>());
            set => _filters = value;
        }

        public GetQuotaArgs()
        {
        }
        public static new GetQuotaArgs Empty => new GetQuotaArgs();
    }

    public sealed class GetQuotaInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetQuotaFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetQuotaFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetQuotaFilterInputArgs>());
            set => _filters = value;
        }

        public GetQuotaInvokeArgs()
        {
        }
        public static new GetQuotaInvokeArgs Empty => new GetQuotaInvokeArgs();
    }


    [OutputType]
    public sealed class GetQuotaResult
    {
        /// <summary>
        /// The account ID of the owner of the quotas.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The description of the quota.
        /// </summary>
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetQuotaFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The maximum value of the quota for the OUTSCALE user account (if there is no limit, `0`).
        /// </summary>
        public readonly int MaxValue;
        /// <summary>
        /// The unique name of the quota.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The group name of the quota.
        /// </summary>
        public readonly string QuotaCollection;
        /// <summary>
        /// The resource ID if it is a resource-specific quota, `global` if it is not.
        /// </summary>
        public readonly string QuotaType;
        public readonly string RequestId;
        /// <summary>
        /// The description of the quota.
        /// </summary>
        public readonly string ShortDescription;
        /// <summary>
        /// The limit value currently used by the OUTSCALE user account.
        /// </summary>
        public readonly int UsedValue;

        [OutputConstructor]
        private GetQuotaResult(
            string accountId,

            string description,

            ImmutableArray<Outputs.GetQuotaFilterResult> filters,

            string id,

            int maxValue,

            string name,

            string quotaCollection,

            string quotaType,

            string requestId,

            string shortDescription,

            int usedValue)
        {
            AccountId = accountId;
            Description = description;
            Filters = filters;
            Id = id;
            MaxValue = maxValue;
            Name = name;
            QuotaCollection = quotaCollection;
            QuotaType = quotaType;
            RequestId = requestId;
            ShortDescription = shortDescription;
            UsedValue = usedValue;
        }
    }
}