// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetLoadBalancerAccessLogArgs;
import com.pulumi.outscale.inputs.GetLoadBalancerFilterArgs;
import com.pulumi.outscale.inputs.GetLoadBalancerHealthCheckArgs;
import com.pulumi.outscale.inputs.GetLoadBalancerListenerArgs;
import com.pulumi.outscale.inputs.GetLoadBalancerTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerArgs Empty = new GetLoadBalancerArgs();

    /**
     * Information about access logs.
     * 
     */
    @Import(name="accessLogs")
    private @Nullable Output<List<GetLoadBalancerAccessLogArgs>> accessLogs;

    /**
     * @return Information about access logs.
     * 
     */
    public Optional<Output<List<GetLoadBalancerAccessLogArgs>>> accessLogs() {
        return Optional.ofNullable(this.accessLogs);
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
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetLoadBalancerFilterArgs>> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<Output<List<GetLoadBalancerFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Information about the health check configuration.
     * 
     */
    @Import(name="healthChecks")
    private @Nullable Output<List<GetLoadBalancerHealthCheckArgs>> healthChecks;

    /**
     * @return Information about the health check configuration.
     * 
     */
    public Optional<Output<List<GetLoadBalancerHealthCheckArgs>>> healthChecks() {
        return Optional.ofNullable(this.healthChecks);
    }

    /**
     * The listeners for the load balancer.
     * 
     */
    @Import(name="listeners")
    private @Nullable Output<List<GetLoadBalancerListenerArgs>> listeners;

    /**
     * @return The listeners for the load balancer.
     * 
     */
    public Optional<Output<List<GetLoadBalancerListenerArgs>>> listeners() {
        return Optional.ofNullable(this.listeners);
    }

    /**
     * The name of the load balancer.
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable Output<String> loadBalancerName;

    /**
     * @return The name of the load balancer.
     * 
     */
    public Optional<Output<String>> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
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
     * One or more tags associated with the load balancer.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<GetLoadBalancerTagArgs>> tags;

    /**
     * @return One or more tags associated with the load balancer.
     * 
     */
    public Optional<Output<List<GetLoadBalancerTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLoadBalancerArgs() {}

    private GetLoadBalancerArgs(GetLoadBalancerArgs $) {
        this.accessLogs = $.accessLogs;
        this.backendVmIds = $.backendVmIds;
        this.dnsName = $.dnsName;
        this.filters = $.filters;
        this.healthChecks = $.healthChecks;
        this.listeners = $.listeners;
        this.loadBalancerName = $.loadBalancerName;
        this.loadBalancerType = $.loadBalancerType;
        this.netId = $.netId;
        this.securityGroups = $.securityGroups;
        this.subnets = $.subnets;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerArgs $;

        public Builder() {
            $ = new GetLoadBalancerArgs();
        }

        public Builder(GetLoadBalancerArgs defaults) {
            $ = new GetLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLogs Information about access logs.
         * 
         * @return builder
         * 
         */
        public Builder accessLogs(@Nullable Output<List<GetLoadBalancerAccessLogArgs>> accessLogs) {
            $.accessLogs = accessLogs;
            return this;
        }

        /**
         * @param accessLogs Information about access logs.
         * 
         * @return builder
         * 
         */
        public Builder accessLogs(List<GetLoadBalancerAccessLogArgs> accessLogs) {
            return accessLogs(Output.of(accessLogs));
        }

        /**
         * @param accessLogs Information about access logs.
         * 
         * @return builder
         * 
         */
        public Builder accessLogs(GetLoadBalancerAccessLogArgs... accessLogs) {
            return accessLogs(List.of(accessLogs));
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
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetLoadBalancerFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetLoadBalancerFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLoadBalancerFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param healthChecks Information about the health check configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthChecks(@Nullable Output<List<GetLoadBalancerHealthCheckArgs>> healthChecks) {
            $.healthChecks = healthChecks;
            return this;
        }

        /**
         * @param healthChecks Information about the health check configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthChecks(List<GetLoadBalancerHealthCheckArgs> healthChecks) {
            return healthChecks(Output.of(healthChecks));
        }

        /**
         * @param healthChecks Information about the health check configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthChecks(GetLoadBalancerHealthCheckArgs... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }

        /**
         * @param listeners The listeners for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder listeners(@Nullable Output<List<GetLoadBalancerListenerArgs>> listeners) {
            $.listeners = listeners;
            return this;
        }

        /**
         * @param listeners The listeners for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder listeners(List<GetLoadBalancerListenerArgs> listeners) {
            return listeners(Output.of(listeners));
        }

        /**
         * @param listeners The listeners for the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder listeners(GetLoadBalancerListenerArgs... listeners) {
            return listeners(List.of(listeners));
        }

        /**
         * @param loadBalancerName The name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param loadBalancerName The name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
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
         * @param tags One or more tags associated with the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<GetLoadBalancerTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags One or more tags associated with the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<GetLoadBalancerTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags One or more tags associated with the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder tags(GetLoadBalancerTagArgs... tags) {
            return tags(List.of(tags));
        }

        public GetLoadBalancerArgs build() {
            return $;
        }
    }

}
