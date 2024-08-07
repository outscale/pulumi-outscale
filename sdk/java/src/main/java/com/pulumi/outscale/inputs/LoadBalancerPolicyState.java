// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.LoadBalancerPolicyAccessLogArgs;
import com.pulumi.outscale.inputs.LoadBalancerPolicyApplicationStickyCookiePolicyArgs;
import com.pulumi.outscale.inputs.LoadBalancerPolicyHealthCheckArgs;
import com.pulumi.outscale.inputs.LoadBalancerPolicyListenerArgs;
import com.pulumi.outscale.inputs.LoadBalancerPolicyLoadBalancerStickyCookiePolicyArgs;
import com.pulumi.outscale.inputs.LoadBalancerPolicySourceSecurityGroupArgs;
import com.pulumi.outscale.inputs.LoadBalancerPolicyTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPolicyState Empty = new LoadBalancerPolicyState();

    /**
     * Information about access logs.
     * 
     */
    @Import(name="accessLogs")
    private @Nullable Output<List<LoadBalancerPolicyAccessLogArgs>> accessLogs;

    /**
     * @return Information about access logs.
     * 
     */
    public Optional<Output<List<LoadBalancerPolicyAccessLogArgs>>> accessLogs() {
        return Optional.ofNullable(this.accessLogs);
    }

    /**
     * The stickiness policies defined for the load balancer.
     * 
     */
    @Import(name="applicationStickyCookiePolicies")
    private @Nullable Output<List<LoadBalancerPolicyApplicationStickyCookiePolicyArgs>> applicationStickyCookiePolicies;

    /**
     * @return The stickiness policies defined for the load balancer.
     * 
     */
    public Optional<Output<List<LoadBalancerPolicyApplicationStickyCookiePolicyArgs>>> applicationStickyCookiePolicies() {
        return Optional.ofNullable(this.applicationStickyCookiePolicies);
    }

    /**
     * One or more IDs of back-end VMs for the load balancer.
     * 
     */
    @Import(name="backendVmIds")
    private @Nullable Output<List<String>> backendVmIds;

    /**
     * @return One or more IDs of back-end VMs for the load balancer.
     * 
     */
    public Optional<Output<List<String>>> backendVmIds() {
        return Optional.ofNullable(this.backendVmIds);
    }

    @Import(name="cookieExpirationPeriod")
    private @Nullable Output<Integer> cookieExpirationPeriod;

    public Optional<Output<Integer>> cookieExpirationPeriod() {
        return Optional.ofNullable(this.cookieExpirationPeriod);
    }

    /**
     * The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
     * 
     */
    @Import(name="cookieName")
    private @Nullable Output<String> cookieName;

    /**
     * @return The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
     * 
     */
    public Optional<Output<String>> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }

    /**
     * The DNS name of the load balancer.
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    /**
     * @return The DNS name of the load balancer.
     * 
     */
    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * Information about the health check configuration.
     * 
     */
    @Import(name="healthChecks")
    private @Nullable Output<List<LoadBalancerPolicyHealthCheckArgs>> healthChecks;

    /**
     * @return Information about the health check configuration.
     * 
     */
    public Optional<Output<List<LoadBalancerPolicyHealthCheckArgs>>> healthChecks() {
        return Optional.ofNullable(this.healthChecks);
    }

    /**
     * The listeners for the load balancer.
     * 
     */
    @Import(name="listeners")
    private @Nullable Output<List<LoadBalancerPolicyListenerArgs>> listeners;

    /**
     * @return The listeners for the load balancer.
     * 
     */
    public Optional<Output<List<LoadBalancerPolicyListenerArgs>>> listeners() {
        return Optional.ofNullable(this.listeners);
    }

    /**
     * The name of the load balancer for which you want to create a policy.
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable Output<String> loadBalancerName;

    /**
     * @return The name of the load balancer for which you want to create a policy.
     * 
     */
    public Optional<Output<String>> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }

    /**
     * The policies defined for the load balancer.
     * 
     */
    @Import(name="loadBalancerStickyCookiePolicies")
    private @Nullable Output<List<LoadBalancerPolicyLoadBalancerStickyCookiePolicyArgs>> loadBalancerStickyCookiePolicies;

    /**
     * @return The policies defined for the load balancer.
     * 
     */
    public Optional<Output<List<LoadBalancerPolicyLoadBalancerStickyCookiePolicyArgs>>> loadBalancerStickyCookiePolicies() {
        return Optional.ofNullable(this.loadBalancerStickyCookiePolicies);
    }

    /**
     * The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt;
     * If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt;
     * If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     * 
     */
    @Import(name="loadBalancerType")
    private @Nullable Output<String> loadBalancerType;

    /**
     * @return The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt;
     * If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt;
     * If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     * 
     */
    public Optional<Output<String>> loadBalancerType() {
        return Optional.ofNullable(this.loadBalancerType);
    }

    /**
     * The ID of the Net for the load balancer.
     * 
     */
    @Import(name="netId")
    private @Nullable Output<String> netId;

    /**
     * @return The ID of the Net for the load balancer.
     * 
     */
    public Optional<Output<String>> netId() {
        return Optional.ofNullable(this.netId);
    }

    /**
     * The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * The type of stickiness policy you want to create: `app` or `load_balancer`.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<String> policyType;

    /**
     * @return The type of stickiness policy you want to create: `app` or `load_balancer`.
     * 
     */
    public Optional<Output<String>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    @Import(name="publicIp")
    private @Nullable Output<String> publicIp;

    public Optional<Output<String>> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="securedCookies")
    private @Nullable Output<Boolean> securedCookies;

    public Optional<Output<Boolean>> securedCookies() {
        return Optional.ofNullable(this.securedCookies);
    }

    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     * 
     */
    @Import(name="sourceSecurityGroups")
    private @Nullable Output<List<LoadBalancerPolicySourceSecurityGroupArgs>> sourceSecurityGroups;

    /**
     * @return Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     * 
     */
    public Optional<Output<List<LoadBalancerPolicySourceSecurityGroupArgs>>> sourceSecurityGroups() {
        return Optional.ofNullable(this.sourceSecurityGroups);
    }

    /**
     * The ID of the Subnet in which the load balancer was created.
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<String>> subnets;

    /**
     * @return The ID of the Subnet in which the load balancer was created.
     * 
     */
    public Optional<Output<List<String>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The ID of the Subregion in which the load balancer was created.
     * 
     */
    @Import(name="subregionNames")
    private @Nullable Output<List<String>> subregionNames;

    /**
     * @return The ID of the Subregion in which the load balancer was created.
     * 
     */
    public Optional<Output<List<String>>> subregionNames() {
        return Optional.ofNullable(this.subregionNames);
    }

    /**
     * One or more tags associated with the load balancer.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<LoadBalancerPolicyTagArgs>> tags;

    /**
     * @return One or more tags associated with the load balancer.
     * 
     */
    public Optional<Output<List<LoadBalancerPolicyTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LoadBalancerPolicyState() {}

    private LoadBalancerPolicyState(LoadBalancerPolicyState $) {
        this.accessLogs = $.accessLogs;
        this.applicationStickyCookiePolicies = $.applicationStickyCookiePolicies;
        this.backendVmIds = $.backendVmIds;
        this.cookieExpirationPeriod = $.cookieExpirationPeriod;
        this.cookieName = $.cookieName;
        this.dnsName = $.dnsName;
        this.healthChecks = $.healthChecks;
        this.listeners = $.listeners;
        this.loadBalancerName = $.loadBalancerName;
        this.loadBalancerStickyCookiePolicies = $.loadBalancerStickyCookiePolicies;
        this.loadBalancerType = $.loadBalancerType;
        this.netId = $.netId;
        this.policyName = $.policyName;
        this.policyType = $.policyType;
        this.publicIp = $.publicIp;
        this.requestId = $.requestId;
        this.securedCookies = $.securedCookies;
        this.securityGroups = $.securityGroups;
        this.sourceSecurityGroups = $.sourceSecurityGroups;
        this.subnets = $.subnets;
        this.subregionNames = $.subregionNames;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPolicyState $;

        public Builder() {
            $ = new LoadBalancerPolicyState();
        }

        public Builder(LoadBalancerPolicyState defaults) {
            $ = new LoadBalancerPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLogs Information about access logs.
         * 
         * @return builder
         * 
         */
        public Builder accessLogs(@Nullable Output<List<LoadBalancerPolicyAccessLogArgs>> accessLogs) {
            $.accessLogs = accessLogs;
            return this;
        }

        /**
         * @param accessLogs Information about access logs.
         * 
         * @return builder
         * 
         */
        public Builder accessLogs(List<LoadBalancerPolicyAccessLogArgs> accessLogs) {
            return accessLogs(Output.of(accessLogs));
        }

        /**
         * @param accessLogs Information about access logs.
         * 
         * @return builder
         * 
         */
        public Builder accessLogs(LoadBalancerPolicyAccessLogArgs... accessLogs) {
            return accessLogs(List.of(accessLogs));
        }

        /**
         * @param applicationStickyCookiePolicies The stickiness policies defined for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder applicationStickyCookiePolicies(@Nullable Output<List<LoadBalancerPolicyApplicationStickyCookiePolicyArgs>> applicationStickyCookiePolicies) {
            $.applicationStickyCookiePolicies = applicationStickyCookiePolicies;
            return this;
        }

        /**
         * @param applicationStickyCookiePolicies The stickiness policies defined for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder applicationStickyCookiePolicies(List<LoadBalancerPolicyApplicationStickyCookiePolicyArgs> applicationStickyCookiePolicies) {
            return applicationStickyCookiePolicies(Output.of(applicationStickyCookiePolicies));
        }

        /**
         * @param applicationStickyCookiePolicies The stickiness policies defined for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder applicationStickyCookiePolicies(LoadBalancerPolicyApplicationStickyCookiePolicyArgs... applicationStickyCookiePolicies) {
            return applicationStickyCookiePolicies(List.of(applicationStickyCookiePolicies));
        }

        /**
         * @param backendVmIds One or more IDs of back-end VMs for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder backendVmIds(@Nullable Output<List<String>> backendVmIds) {
            $.backendVmIds = backendVmIds;
            return this;
        }

        /**
         * @param backendVmIds One or more IDs of back-end VMs for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder backendVmIds(List<String> backendVmIds) {
            return backendVmIds(Output.of(backendVmIds));
        }

        /**
         * @param backendVmIds One or more IDs of back-end VMs for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder backendVmIds(String... backendVmIds) {
            return backendVmIds(List.of(backendVmIds));
        }

        public Builder cookieExpirationPeriod(@Nullable Output<Integer> cookieExpirationPeriod) {
            $.cookieExpirationPeriod = cookieExpirationPeriod;
            return this;
        }

        public Builder cookieExpirationPeriod(Integer cookieExpirationPeriod) {
            return cookieExpirationPeriod(Output.of(cookieExpirationPeriod));
        }

        /**
         * @param cookieName The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(@Nullable Output<String> cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        /**
         * @param cookieName The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(String cookieName) {
            return cookieName(Output.of(cookieName));
        }

        /**
         * @param dnsName The DNS name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        /**
         * @param dnsName The DNS name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        /**
         * @param healthChecks Information about the health check configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthChecks(@Nullable Output<List<LoadBalancerPolicyHealthCheckArgs>> healthChecks) {
            $.healthChecks = healthChecks;
            return this;
        }

        /**
         * @param healthChecks Information about the health check configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthChecks(List<LoadBalancerPolicyHealthCheckArgs> healthChecks) {
            return healthChecks(Output.of(healthChecks));
        }

        /**
         * @param healthChecks Information about the health check configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthChecks(LoadBalancerPolicyHealthCheckArgs... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }

        /**
         * @param listeners The listeners for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder listeners(@Nullable Output<List<LoadBalancerPolicyListenerArgs>> listeners) {
            $.listeners = listeners;
            return this;
        }

        /**
         * @param listeners The listeners for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder listeners(List<LoadBalancerPolicyListenerArgs> listeners) {
            return listeners(Output.of(listeners));
        }

        /**
         * @param listeners The listeners for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder listeners(LoadBalancerPolicyListenerArgs... listeners) {
            return listeners(List.of(listeners));
        }

        /**
         * @param loadBalancerName The name of the load balancer for which you want to create a policy.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param loadBalancerName The name of the load balancer for which you want to create a policy.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        /**
         * @param loadBalancerStickyCookiePolicies The policies defined for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerStickyCookiePolicies(@Nullable Output<List<LoadBalancerPolicyLoadBalancerStickyCookiePolicyArgs>> loadBalancerStickyCookiePolicies) {
            $.loadBalancerStickyCookiePolicies = loadBalancerStickyCookiePolicies;
            return this;
        }

        /**
         * @param loadBalancerStickyCookiePolicies The policies defined for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerStickyCookiePolicies(List<LoadBalancerPolicyLoadBalancerStickyCookiePolicyArgs> loadBalancerStickyCookiePolicies) {
            return loadBalancerStickyCookiePolicies(Output.of(loadBalancerStickyCookiePolicies));
        }

        /**
         * @param loadBalancerStickyCookiePolicies The policies defined for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerStickyCookiePolicies(LoadBalancerPolicyLoadBalancerStickyCookiePolicyArgs... loadBalancerStickyCookiePolicies) {
            return loadBalancerStickyCookiePolicies(List.of(loadBalancerStickyCookiePolicies));
        }

        /**
         * @param loadBalancerType The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt;
         * If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt;
         * If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(@Nullable Output<String> loadBalancerType) {
            $.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * @param loadBalancerType The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt;
         * If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt;
         * If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(String loadBalancerType) {
            return loadBalancerType(Output.of(loadBalancerType));
        }

        /**
         * @param netId The ID of the Net for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder netId(@Nullable Output<String> netId) {
            $.netId = netId;
            return this;
        }

        /**
         * @param netId The ID of the Net for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder netId(String netId) {
            return netId(Output.of(netId));
        }

        /**
         * @param policyName The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param policyType The type of stickiness policy you want to create: `app` or `load_balancer`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType The type of stickiness policy you want to create: `app` or `load_balancer`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        public Builder publicIp(@Nullable Output<String> publicIp) {
            $.publicIp = publicIp;
            return this;
        }

        public Builder publicIp(String publicIp) {
            return publicIp(Output.of(publicIp));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder securedCookies(@Nullable Output<Boolean> securedCookies) {
            $.securedCookies = securedCookies;
            return this;
        }

        public Builder securedCookies(Boolean securedCookies) {
            return securedCookies(Output.of(securedCookies));
        }

        /**
         * @param securityGroups One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param sourceSecurityGroups Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
         * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
         * 
         * @return builder
         * 
         */
        public Builder sourceSecurityGroups(@Nullable Output<List<LoadBalancerPolicySourceSecurityGroupArgs>> sourceSecurityGroups) {
            $.sourceSecurityGroups = sourceSecurityGroups;
            return this;
        }

        /**
         * @param sourceSecurityGroups Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
         * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
         * 
         * @return builder
         * 
         */
        public Builder sourceSecurityGroups(List<LoadBalancerPolicySourceSecurityGroupArgs> sourceSecurityGroups) {
            return sourceSecurityGroups(Output.of(sourceSecurityGroups));
        }

        /**
         * @param sourceSecurityGroups Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
         * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
         * 
         * @return builder
         * 
         */
        public Builder sourceSecurityGroups(LoadBalancerPolicySourceSecurityGroupArgs... sourceSecurityGroups) {
            return sourceSecurityGroups(List.of(sourceSecurityGroups));
        }

        /**
         * @param subnets The ID of the Subnet in which the load balancer was created.
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The ID of the Subnet in which the load balancer was created.
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets The ID of the Subnet in which the load balancer was created.
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param subregionNames The ID of the Subregion in which the load balancer was created.
         * 
         * @return builder
         * 
         */
        public Builder subregionNames(@Nullable Output<List<String>> subregionNames) {
            $.subregionNames = subregionNames;
            return this;
        }

        /**
         * @param subregionNames The ID of the Subregion in which the load balancer was created.
         * 
         * @return builder
         * 
         */
        public Builder subregionNames(List<String> subregionNames) {
            return subregionNames(Output.of(subregionNames));
        }

        /**
         * @param subregionNames The ID of the Subregion in which the load balancer was created.
         * 
         * @return builder
         * 
         */
        public Builder subregionNames(String... subregionNames) {
            return subregionNames(List.of(subregionNames));
        }

        /**
         * @param tags One or more tags associated with the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<LoadBalancerPolicyTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags One or more tags associated with the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<LoadBalancerPolicyTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags One or more tags associated with the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder tags(LoadBalancerPolicyTagArgs... tags) {
            return tags(List.of(tags));
        }

        public LoadBalancerPolicyState build() {
            return $;
        }
    }

}
