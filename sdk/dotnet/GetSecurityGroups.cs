// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetSecurityGroups
    {
        /// <summary>
        /// Provides information about security groups.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Security-Groups.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-securitygroup).
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
        ///     var securityGroups01 = Outscale.GetSecurityGroups.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSecurityGroupsFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "sg-12345678",
        ///                     "sg-87654321",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetSecurityGroupsFilterInputArgs
        ///             {
        ///                 Name = "inbound_rule_ip_ranges",
        ///                 Values = new[]
        ///                 {
        ///                     "111.11.111.1/32",
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
        public static Task<GetSecurityGroupsResult> InvokeAsync(GetSecurityGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecurityGroupsResult>("outscale:index/getSecurityGroups:getSecurityGroups", args ?? new GetSecurityGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about security groups.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Security-Groups.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-securitygroup).
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
        ///     var securityGroups01 = Outscale.GetSecurityGroups.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSecurityGroupsFilterInputArgs
        ///             {
        ///                 Name = "net_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "sg-12345678",
        ///                     "sg-87654321",
        ///                 },
        ///             },
        ///             new Outscale.Inputs.GetSecurityGroupsFilterInputArgs
        ///             {
        ///                 Name = "inbound_rule_ip_ranges",
        ///                 Values = new[]
        ///                 {
        ///                     "111.11.111.1/32",
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
        public static Output<GetSecurityGroupsResult> Invoke(GetSecurityGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecurityGroupsResult>("outscale:index/getSecurityGroups:getSecurityGroups", args ?? new GetSecurityGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecurityGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetSecurityGroupsFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetSecurityGroupsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetSecurityGroupsFilterArgs>());
            set => _filters = value;
        }

        [Input("securityGroupIds")]
        private List<string>? _securityGroupIds;

        /// <summary>
        /// The IDs of the security groups.
        /// </summary>
        public List<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new List<string>());
            set => _securityGroupIds = value;
        }

        [Input("securityGroupNames")]
        private List<string>? _securityGroupNames;

        /// <summary>
        /// The names of the security groups.
        /// </summary>
        public List<string> SecurityGroupNames
        {
            get => _securityGroupNames ?? (_securityGroupNames = new List<string>());
            set => _securityGroupNames = value;
        }

        public GetSecurityGroupsArgs()
        {
        }
        public static new GetSecurityGroupsArgs Empty => new GetSecurityGroupsArgs();
    }

    public sealed class GetSecurityGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetSecurityGroupsFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetSecurityGroupsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetSecurityGroupsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// The IDs of the security groups.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("securityGroupNames")]
        private InputList<string>? _securityGroupNames;

        /// <summary>
        /// The names of the security groups.
        /// </summary>
        public InputList<string> SecurityGroupNames
        {
            get => _securityGroupNames ?? (_securityGroupNames = new InputList<string>());
            set => _securityGroupNames = value;
        }

        public GetSecurityGroupsInvokeArgs()
        {
        }
        public static new GetSecurityGroupsInvokeArgs Empty => new GetSecurityGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecurityGroupsResult
    {
        public readonly ImmutableArray<Outputs.GetSecurityGroupsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string RequestId;
        public readonly ImmutableArray<string> SecurityGroupIds;
        public readonly ImmutableArray<string> SecurityGroupNames;
        /// <summary>
        /// Information about one or more security groups.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityGroupsSecurityGroupResult> SecurityGroups;

        [OutputConstructor]
        private GetSecurityGroupsResult(
            ImmutableArray<Outputs.GetSecurityGroupsFilterResult> filters,

            string id,

            string requestId,

            ImmutableArray<string> securityGroupIds,

            ImmutableArray<string> securityGroupNames,

            ImmutableArray<Outputs.GetSecurityGroupsSecurityGroupResult> securityGroups)
        {
            Filters = filters;
            Id = id;
            RequestId = requestId;
            SecurityGroupIds = securityGroupIds;
            SecurityGroupNames = securityGroupNames;
            SecurityGroups = securityGroups;
        }
    }
}
