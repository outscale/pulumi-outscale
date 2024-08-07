// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetDhcpOption
    {
        /// <summary>
        /// Provides information about a DHCP option.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-DHCP-Options.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-dhcpoption).
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
        ///     var dhcpOption01 = Outscale.GetDhcpOption.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetDhcpOptionFilterInputArgs
        ///             {
        ///                 Name = "dhcp_options_set_id",
        ///                 Values = new[]
        ///                 {
        ///                     "dopt-12345678",
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
        public static Task<GetDhcpOptionResult> InvokeAsync(GetDhcpOptionArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDhcpOptionResult>("outscale:index/getDhcpOption:getDhcpOption", args ?? new GetDhcpOptionArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a DHCP option.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-DHCP-Options.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-dhcpoption).
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
        ///     var dhcpOption01 = Outscale.GetDhcpOption.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetDhcpOptionFilterInputArgs
        ///             {
        ///                 Name = "dhcp_options_set_id",
        ///                 Values = new[]
        ///                 {
        ///                     "dopt-12345678",
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
        public static Output<GetDhcpOptionResult> Invoke(GetDhcpOptionInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDhcpOptionResult>("outscale:index/getDhcpOption:getDhcpOption", args ?? new GetDhcpOptionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDhcpOptionArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetDhcpOptionFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetDhcpOptionFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDhcpOptionFilterArgs>());
            set => _filters = value;
        }

        public GetDhcpOptionArgs()
        {
        }
        public static new GetDhcpOptionArgs Empty => new GetDhcpOptionArgs();
    }

    public sealed class GetDhcpOptionInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetDhcpOptionFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetDhcpOptionFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetDhcpOptionFilterInputArgs>());
            set => _filters = value;
        }

        public GetDhcpOptionInvokeArgs()
        {
        }
        public static new GetDhcpOptionInvokeArgs Empty => new GetDhcpOptionInvokeArgs();
    }


    [OutputType]
    public sealed class GetDhcpOptionResult
    {
        /// <summary>
        /// If true, the DHCP options set is a default one. If false, it is not.
        /// </summary>
        public readonly bool Default;
        /// <summary>
        /// The ID of the DHCP options set.
        /// </summary>
        public readonly string DhcpOptionsSetId;
        /// <summary>
        /// The domain name.
        /// </summary>
        public readonly string DomainName;
        /// <summary>
        /// One or more IPs for the domain name servers.
        /// </summary>
        public readonly ImmutableArray<string> DomainNameServers;
        public readonly ImmutableArray<Outputs.GetDhcpOptionFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// One or more IPs for the log servers.
        /// </summary>
        public readonly ImmutableArray<string> LogServers;
        /// <summary>
        /// One or more IPs for the NTP servers.
        /// </summary>
        public readonly ImmutableArray<string> NtpServers;
        public readonly string RequestId;
        /// <summary>
        /// One or more tags associated with the DHCP options set.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDhcpOptionTagResult> Tags;

        [OutputConstructor]
        private GetDhcpOptionResult(
            bool @default,

            string dhcpOptionsSetId,

            string domainName,

            ImmutableArray<string> domainNameServers,

            ImmutableArray<Outputs.GetDhcpOptionFilterResult> filters,

            string id,

            ImmutableArray<string> logServers,

            ImmutableArray<string> ntpServers,

            string requestId,

            ImmutableArray<Outputs.GetDhcpOptionTagResult> tags)
        {
            Default = @default;
            DhcpOptionsSetId = dhcpOptionsSetId;
            DomainName = domainName;
            DomainNameServers = domainNameServers;
            Filters = filters;
            Id = id;
            LogServers = logServers;
            NtpServers = ntpServers;
            RequestId = requestId;
            Tags = tags;
        }
    }
}
