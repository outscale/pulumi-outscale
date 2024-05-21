// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    /// <summary>
    /// Manages a load balancer.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancer).
    /// 
    /// ## Example Usage
    /// ### Create a load balancer in the public Cloud
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var loadBalancer01 = new Outscale.LoadBalancer("loadBalancer01", new()
    ///     {
    ///         Listeners = new[]
    ///         {
    ///             new Outscale.Inputs.LoadBalancerListenerArgs
    ///             {
    ///                 BackendPort = 8080,
    ///                 BackendProtocol = "HTTP",
    ///                 LoadBalancerPort = 8080,
    ///                 LoadBalancerProtocol = "HTTP",
    ///             },
    ///         },
    ///         LoadBalancerName = "terraform-public-load-balancer",
    ///         SubregionNames = new[]
    ///         {
    ///             $"{@var.Region}a",
    ///         },
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.LoadBalancerTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-public-load-balancer",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a load balancer in a Net
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var net01 = new Outscale.Net("net01", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///     });
    /// 
    ///     var subnet01 = new Outscale.Subnet("subnet01", new()
    ///     {
    ///         NetId = net01.NetId,
    ///         IpRange = "10.0.0.0/24",
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.SubnetTagArgs
    ///             {
    ///                 Key = "Name",
    ///                 Value = "terraform-subnet-for-internal-load-balancer",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var securityGroup01 = new Outscale.SecurityGroup("securityGroup01", new()
    ///     {
    ///         Description = "Terraform security group for internal load balancer",
    ///         SecurityGroupName = "terraform-security-group-for-internal-load-balancer",
    ///         NetId = net01.NetId,
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.SecurityGroupTagArgs
    ///             {
    ///                 Key = "Name",
    ///                 Value = "terraform-security-group-for-internal-load-balancer",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var loadBalancer02 = new Outscale.LoadBalancer("loadBalancer02", new()
    ///     {
    ///         LoadBalancerName = "terraform-private-load-balancer",
    ///         Listeners = new[]
    ///         {
    ///             new Outscale.Inputs.LoadBalancerListenerArgs
    ///             {
    ///                 BackendPort = 80,
    ///                 BackendProtocol = "TCP",
    ///                 LoadBalancerProtocol = "TCP",
    ///                 LoadBalancerPort = 80,
    ///             },
    ///         },
    ///         Subnets = new[]
    ///         {
    ///             subnet01.SubnetId,
    ///         },
    ///         SecurityGroups = new[]
    ///         {
    ///             securityGroup01.SecurityGroupId,
    ///         },
    ///         LoadBalancerType = "internal",
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.LoadBalancerTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-private-load-balancer",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create an internet-facing load balancer in a Net
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var net02 = new Outscale.Net("net02", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///     });
    /// 
    ///     var subnet02 = new Outscale.Subnet("subnet02", new()
    ///     {
    ///         NetId = net02.NetId,
    ///         IpRange = "10.0.0.0/24",
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.SubnetTagArgs
    ///             {
    ///                 Key = "Name",
    ///                 Value = "terraform-security-group-for-load-balancer",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var internetService01 = new Outscale.InternetService("internetService01", new()
    ///     {
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             net02,
    ///         },
    ///     });
    /// 
    ///     var internetServiceLink01 = new Outscale.InternetServiceLink("internetServiceLink01", new()
    ///     {
    ///         InternetServiceId = internetService01.InternetServiceId,
    ///         NetId = net02.NetId,
    ///     });
    /// 
    ///     var routeTable01 = new Outscale.RouteTable("routeTable01", new()
    ///     {
    ///         NetId = net02.NetId,
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.RouteTableTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-route-table-for-load-balancer",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var route01 = new Outscale.Route("route01", new()
    ///     {
    ///         GatewayId = internetService01.Id,
    ///         DestinationIpRange = "10.0.0.0/0",
    ///         RouteTableId = routeTable01.RouteTableId,
    ///     });
    /// 
    ///     var routeTableLink01 = new Outscale.RouteTableLink("routeTableLink01", new()
    ///     {
    ///         RouteTableId = routeTable01.RouteTableId,
    ///         SubnetId = subnet02.SubnetId,
    ///     });
    /// 
    ///     var loadBalancer03 = new Outscale.LoadBalancer("loadBalancer03", new()
    ///     {
    ///         LoadBalancerName = "terraform-internet-private-lb",
    ///         Listeners = new[]
    ///         {
    ///             new Outscale.Inputs.LoadBalancerListenerArgs
    ///             {
    ///                 BackendPort = 80,
    ///                 BackendProtocol = "TCP",
    ///                 LoadBalancerProtocol = "TCP",
    ///                 LoadBalancerPort = 80,
    ///             },
    ///             new Outscale.Inputs.LoadBalancerListenerArgs
    ///             {
    ///                 BackendPort = 8080,
    ///                 BackendProtocol = "HTTP",
    ///                 LoadBalancerProtocol = "HTTP",
    ///                 LoadBalancerPort = 8080,
    ///             },
    ///         },
    ///         Subnets = new[]
    ///         {
    ///             subnet02.SubnetId,
    ///         },
    ///         LoadBalancerType = "internet-facing",
    ///         PublicIp = "192.0.2.0",
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.LoadBalancerTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-internet-private-lb",
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             route01,
    ///             routeTableLink01,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A load balancer can be imported using its name. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/loadBalancer:LoadBalancer ImportedLbu Name-of-the-Lbu
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/loadBalancer:LoadBalancer")]
    public partial class LoadBalancer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Information about access logs.
        /// </summary>
        [Output("accessLogs")]
        public Output<ImmutableArray<Outputs.LoadBalancerAccessLog>> AccessLogs { get; private set; } = null!;

        /// <summary>
        /// The stickiness policies defined for the load balancer.
        /// </summary>
        [Output("applicationStickyCookiePolicies")]
        public Output<ImmutableArray<Outputs.LoadBalancerApplicationStickyCookiePolicy>> ApplicationStickyCookiePolicies { get; private set; } = null!;

        /// <summary>
        /// One or more IDs of back-end VMs for the load balancer.
        /// </summary>
        [Output("backendVmIds")]
        public Output<ImmutableArray<string>> BackendVmIds { get; private set; } = null!;

        /// <summary>
        /// The DNS name of the load balancer.
        /// </summary>
        [Output("dnsName")]
        public Output<string> DnsName { get; private set; } = null!;

        /// <summary>
        /// Information about the health check configuration.
        /// </summary>
        [Output("healthChecks")]
        public Output<ImmutableArray<Outputs.LoadBalancerHealthCheck>> HealthChecks { get; private set; } = null!;

        /// <summary>
        /// One or more listeners to create.
        /// </summary>
        [Output("listeners")]
        public Output<ImmutableArray<Outputs.LoadBalancerListener>> Listeners { get; private set; } = null!;

        /// <summary>
        /// The unique name of the load balancer (32 alphanumeric or hyphen characters maximum, but cannot start or end with a hyphen).
        /// </summary>
        [Output("loadBalancerName")]
        public Output<string> LoadBalancerName { get; private set; } = null!;

        /// <summary>
        /// The policies defined for the load balancer.
        /// </summary>
        [Output("loadBalancerStickyCookiePolicies")]
        public Output<ImmutableArray<Outputs.LoadBalancerLoadBalancerStickyCookiePolicy>> LoadBalancerStickyCookiePolicies { get; private set; } = null!;

        /// <summary>
        /// The type of load balancer: `internet-facing` or `internal`. Use this parameter only for load balancers in a Net.
        /// </summary>
        [Output("loadBalancerType")]
        public Output<string> LoadBalancerType { get; private set; } = null!;

        /// <summary>
        /// The ID of the Net for the load balancer.
        /// </summary>
        [Output("netId")]
        public Output<string> NetId { get; private set; } = null!;

        /// <summary>
        /// (internet-facing only) The public IP you want to associate with the load balancer. If not specified, a public IP owned by 3DS OUTSCALE is associated.
        /// </summary>
        [Output("publicIp")]
        public Output<string> PublicIp { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// Whether secure cookies are enabled for the load balancer.
        /// </summary>
        [Output("securedCookies")]
        public Output<bool> SecuredCookies { get; private set; } = null!;

        /// <summary>
        /// (Net only) One or more IDs of security groups you want to assign to the load balancer. If not specified, the default security group of the Net is assigned to the load balancer.
        /// </summary>
        [Output("securityGroups")]
        public Output<ImmutableArray<string>> SecurityGroups { get; private set; } = null!;

        /// <summary>
        /// Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
        /// To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
        /// </summary>
        [Output("sourceSecurityGroups")]
        public Output<ImmutableArray<Outputs.LoadBalancerSourceSecurityGroup>> SourceSecurityGroups { get; private set; } = null!;

        /// <summary>
        /// (Net only) The ID of the Subnet in which you want to create the load balancer. Regardless of this Subnet, the load balancer can distribute traffic to all Subnets. This parameter is required in a Net.
        /// </summary>
        [Output("subnets")]
        public Output<ImmutableArray<string>> Subnets { get; private set; } = null!;

        /// <summary>
        /// (public Cloud only) The Subregion in which you want to create the load balancer. Regardless of this Subregion, the load balancer can distribute traffic to all Subregions. This parameter is required in the public Cloud.
        /// </summary>
        [Output("subregionNames")]
        public Output<ImmutableArray<string>> SubregionNames { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.LoadBalancerTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancer(string name, LoadBalancerArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/loadBalancer:LoadBalancer", name, args ?? new LoadBalancerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancer(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/loadBalancer:LoadBalancer", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancer Get(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancer(name, id, state, options);
        }
    }

    public sealed class LoadBalancerArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessLogs")]
        private InputList<Inputs.LoadBalancerAccessLogArgs>? _accessLogs;

        /// <summary>
        /// Information about access logs.
        /// </summary>
        public InputList<Inputs.LoadBalancerAccessLogArgs> AccessLogs
        {
            get => _accessLogs ?? (_accessLogs = new InputList<Inputs.LoadBalancerAccessLogArgs>());
            set => _accessLogs = value;
        }

        [Input("backendVmIds")]
        private InputList<string>? _backendVmIds;

        /// <summary>
        /// One or more IDs of back-end VMs for the load balancer.
        /// </summary>
        public InputList<string> BackendVmIds
        {
            get => _backendVmIds ?? (_backendVmIds = new InputList<string>());
            set => _backendVmIds = value;
        }

        [Input("listeners", required: true)]
        private InputList<Inputs.LoadBalancerListenerArgs>? _listeners;

        /// <summary>
        /// One or more listeners to create.
        /// </summary>
        public InputList<Inputs.LoadBalancerListenerArgs> Listeners
        {
            get => _listeners ?? (_listeners = new InputList<Inputs.LoadBalancerListenerArgs>());
            set => _listeners = value;
        }

        /// <summary>
        /// The unique name of the load balancer (32 alphanumeric or hyphen characters maximum, but cannot start or end with a hyphen).
        /// </summary>
        [Input("loadBalancerName", required: true)]
        public Input<string> LoadBalancerName { get; set; } = null!;

        /// <summary>
        /// The type of load balancer: `internet-facing` or `internal`. Use this parameter only for load balancers in a Net.
        /// </summary>
        [Input("loadBalancerType")]
        public Input<string>? LoadBalancerType { get; set; }

        /// <summary>
        /// (internet-facing only) The public IP you want to associate with the load balancer. If not specified, a public IP owned by 3DS OUTSCALE is associated.
        /// </summary>
        [Input("publicIp")]
        public Input<string>? PublicIp { get; set; }

        /// <summary>
        /// Whether secure cookies are enabled for the load balancer.
        /// </summary>
        [Input("securedCookies")]
        public Input<bool>? SecuredCookies { get; set; }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// (Net only) One or more IDs of security groups you want to assign to the load balancer. If not specified, the default security group of the Net is assigned to the load balancer.
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        [Input("subnets")]
        private InputList<string>? _subnets;

        /// <summary>
        /// (Net only) The ID of the Subnet in which you want to create the load balancer. Regardless of this Subnet, the load balancer can distribute traffic to all Subnets. This parameter is required in a Net.
        /// </summary>
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        [Input("subregionNames")]
        private InputList<string>? _subregionNames;

        /// <summary>
        /// (public Cloud only) The Subregion in which you want to create the load balancer. Regardless of this Subregion, the load balancer can distribute traffic to all Subregions. This parameter is required in the public Cloud.
        /// </summary>
        public InputList<string> SubregionNames
        {
            get => _subregionNames ?? (_subregionNames = new InputList<string>());
            set => _subregionNames = value;
        }

        [Input("tags")]
        private InputList<Inputs.LoadBalancerTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.LoadBalancerTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.LoadBalancerTagArgs>());
            set => _tags = value;
        }

        public LoadBalancerArgs()
        {
        }
        public static new LoadBalancerArgs Empty => new LoadBalancerArgs();
    }

    public sealed class LoadBalancerState : global::Pulumi.ResourceArgs
    {
        [Input("accessLogs")]
        private InputList<Inputs.LoadBalancerAccessLogGetArgs>? _accessLogs;

        /// <summary>
        /// Information about access logs.
        /// </summary>
        public InputList<Inputs.LoadBalancerAccessLogGetArgs> AccessLogs
        {
            get => _accessLogs ?? (_accessLogs = new InputList<Inputs.LoadBalancerAccessLogGetArgs>());
            set => _accessLogs = value;
        }

        [Input("applicationStickyCookiePolicies")]
        private InputList<Inputs.LoadBalancerApplicationStickyCookiePolicyGetArgs>? _applicationStickyCookiePolicies;

        /// <summary>
        /// The stickiness policies defined for the load balancer.
        /// </summary>
        public InputList<Inputs.LoadBalancerApplicationStickyCookiePolicyGetArgs> ApplicationStickyCookiePolicies
        {
            get => _applicationStickyCookiePolicies ?? (_applicationStickyCookiePolicies = new InputList<Inputs.LoadBalancerApplicationStickyCookiePolicyGetArgs>());
            set => _applicationStickyCookiePolicies = value;
        }

        [Input("backendVmIds")]
        private InputList<string>? _backendVmIds;

        /// <summary>
        /// One or more IDs of back-end VMs for the load balancer.
        /// </summary>
        public InputList<string> BackendVmIds
        {
            get => _backendVmIds ?? (_backendVmIds = new InputList<string>());
            set => _backendVmIds = value;
        }

        /// <summary>
        /// The DNS name of the load balancer.
        /// </summary>
        [Input("dnsName")]
        public Input<string>? DnsName { get; set; }

        [Input("healthChecks")]
        private InputList<Inputs.LoadBalancerHealthCheckGetArgs>? _healthChecks;

        /// <summary>
        /// Information about the health check configuration.
        /// </summary>
        public InputList<Inputs.LoadBalancerHealthCheckGetArgs> HealthChecks
        {
            get => _healthChecks ?? (_healthChecks = new InputList<Inputs.LoadBalancerHealthCheckGetArgs>());
            set => _healthChecks = value;
        }

        [Input("listeners")]
        private InputList<Inputs.LoadBalancerListenerGetArgs>? _listeners;

        /// <summary>
        /// One or more listeners to create.
        /// </summary>
        public InputList<Inputs.LoadBalancerListenerGetArgs> Listeners
        {
            get => _listeners ?? (_listeners = new InputList<Inputs.LoadBalancerListenerGetArgs>());
            set => _listeners = value;
        }

        /// <summary>
        /// The unique name of the load balancer (32 alphanumeric or hyphen characters maximum, but cannot start or end with a hyphen).
        /// </summary>
        [Input("loadBalancerName")]
        public Input<string>? LoadBalancerName { get; set; }

        [Input("loadBalancerStickyCookiePolicies")]
        private InputList<Inputs.LoadBalancerLoadBalancerStickyCookiePolicyGetArgs>? _loadBalancerStickyCookiePolicies;

        /// <summary>
        /// The policies defined for the load balancer.
        /// </summary>
        public InputList<Inputs.LoadBalancerLoadBalancerStickyCookiePolicyGetArgs> LoadBalancerStickyCookiePolicies
        {
            get => _loadBalancerStickyCookiePolicies ?? (_loadBalancerStickyCookiePolicies = new InputList<Inputs.LoadBalancerLoadBalancerStickyCookiePolicyGetArgs>());
            set => _loadBalancerStickyCookiePolicies = value;
        }

        /// <summary>
        /// The type of load balancer: `internet-facing` or `internal`. Use this parameter only for load balancers in a Net.
        /// </summary>
        [Input("loadBalancerType")]
        public Input<string>? LoadBalancerType { get; set; }

        /// <summary>
        /// The ID of the Net for the load balancer.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        /// <summary>
        /// (internet-facing only) The public IP you want to associate with the load balancer. If not specified, a public IP owned by 3DS OUTSCALE is associated.
        /// </summary>
        [Input("publicIp")]
        public Input<string>? PublicIp { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// Whether secure cookies are enabled for the load balancer.
        /// </summary>
        [Input("securedCookies")]
        public Input<bool>? SecuredCookies { get; set; }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// (Net only) One or more IDs of security groups you want to assign to the load balancer. If not specified, the default security group of the Net is assigned to the load balancer.
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        [Input("sourceSecurityGroups")]
        private InputList<Inputs.LoadBalancerSourceSecurityGroupGetArgs>? _sourceSecurityGroups;

        /// <summary>
        /// Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
        /// To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
        /// </summary>
        public InputList<Inputs.LoadBalancerSourceSecurityGroupGetArgs> SourceSecurityGroups
        {
            get => _sourceSecurityGroups ?? (_sourceSecurityGroups = new InputList<Inputs.LoadBalancerSourceSecurityGroupGetArgs>());
            set => _sourceSecurityGroups = value;
        }

        [Input("subnets")]
        private InputList<string>? _subnets;

        /// <summary>
        /// (Net only) The ID of the Subnet in which you want to create the load balancer. Regardless of this Subnet, the load balancer can distribute traffic to all Subnets. This parameter is required in a Net.
        /// </summary>
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        [Input("subregionNames")]
        private InputList<string>? _subregionNames;

        /// <summary>
        /// (public Cloud only) The Subregion in which you want to create the load balancer. Regardless of this Subregion, the load balancer can distribute traffic to all Subregions. This parameter is required in the public Cloud.
        /// </summary>
        public InputList<string> SubregionNames
        {
            get => _subregionNames ?? (_subregionNames = new InputList<string>());
            set => _subregionNames = value;
        }

        [Input("tags")]
        private InputList<Inputs.LoadBalancerTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.LoadBalancerTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.LoadBalancerTagGetArgs>());
            set => _tags = value;
        }

        public LoadBalancerState()
        {
        }
        public static new LoadBalancerState Empty => new LoadBalancerState();
    }
}