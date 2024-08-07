// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancersLoadBalancerResult
    {
        /// <summary>
        /// Information about access logs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerAccessLogResult> AccessLogs;
        /// <summary>
        /// The stickiness policies defined for the load balancer.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerApplicationStickyCookiePolicyResult> ApplicationStickyCookiePolicies;
        /// <summary>
        /// One or more IDs of back-end VMs for the load balancer.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerBackendVmIdResult> BackendVmIds;
        /// <summary>
        /// The DNS name of the load balancer.
        /// </summary>
        public readonly string DnsName;
        /// <summary>
        /// Information about the health check configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerHealthCheckResult> HealthChecks;
        /// <summary>
        /// The listeners for the load balancer.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerListenerResult> Listeners;
        /// <summary>
        /// The name of the load balancer.
        /// </summary>
        public readonly string LoadBalancerName;
        /// <summary>
        /// The policies defined for the load balancer.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerLoadBalancerStickyCookiePolicyResult> LoadBalancerStickyCookiePolicies;
        /// <summary>
        /// The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt;
        /// If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt;
        /// If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
        /// </summary>
        public readonly string LoadBalancerType;
        /// <summary>
        /// The ID of the Net for the load balancer.
        /// </summary>
        public readonly string NetId;
        /// <summary>
        /// (internet-facing only) The public IP associated with the load balancer.
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// Whether secure cookies are enabled for the load balancer.
        /// </summary>
        public readonly bool SecuredCookies;
        /// <summary>
        /// One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
        /// To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerSourceSecurityGroupResult> SourceSecurityGroups;
        public readonly ImmutableArray<string> SubnetIds;
        /// <summary>
        /// The ID of the Subregion in which the load balancer was created.
        /// </summary>
        public readonly ImmutableArray<string> SubregionNames;
        /// <summary>
        /// One or more tags associated with the load balancer.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLoadBalancersLoadBalancerTagResult> Tags;

        [OutputConstructor]
        private GetLoadBalancersLoadBalancerResult(
            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerAccessLogResult> accessLogs,

            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerApplicationStickyCookiePolicyResult> applicationStickyCookiePolicies,

            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerBackendVmIdResult> backendVmIds,

            string dnsName,

            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerHealthCheckResult> healthChecks,

            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerListenerResult> listeners,

            string loadBalancerName,

            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerLoadBalancerStickyCookiePolicyResult> loadBalancerStickyCookiePolicies,

            string loadBalancerType,

            string netId,

            string publicIp,

            bool securedCookies,

            ImmutableArray<string> securityGroups,

            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerSourceSecurityGroupResult> sourceSecurityGroups,

            ImmutableArray<string> subnetIds,

            ImmutableArray<string> subregionNames,

            ImmutableArray<Outputs.GetLoadBalancersLoadBalancerTagResult> tags)
        {
            AccessLogs = accessLogs;
            ApplicationStickyCookiePolicies = applicationStickyCookiePolicies;
            BackendVmIds = backendVmIds;
            DnsName = dnsName;
            HealthChecks = healthChecks;
            Listeners = listeners;
            LoadBalancerName = loadBalancerName;
            LoadBalancerStickyCookiePolicies = loadBalancerStickyCookiePolicies;
            LoadBalancerType = loadBalancerType;
            NetId = netId;
            PublicIp = publicIp;
            SecuredCookies = securedCookies;
            SecurityGroups = securityGroups;
            SourceSecurityGroups = sourceSecurityGroups;
            SubnetIds = subnetIds;
            SubregionNames = subregionNames;
            Tags = tags;
        }
    }
}
