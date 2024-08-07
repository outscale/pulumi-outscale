// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.LoadBalancerPolicyAccessLogArgs;
import com.pulumi.outscale.inputs.LoadBalancerPolicyTagArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPolicyArgs Empty = new LoadBalancerPolicyArgs();

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
     * The name of the load balancer for which you want to create a policy.
     * 
     */
    @Import(name="loadBalancerName", required=true)
    private Output<String> loadBalancerName;

    /**
     * @return The name of the load balancer for which you want to create a policy.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
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
     * The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     * The type of stickiness policy you want to create: `app` or `load_balancer`.
     * 
     */
    @Import(name="policyType", required=true)
    private Output<String> policyType;

    /**
     * @return The type of stickiness policy you want to create: `app` or `load_balancer`.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
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

    private LoadBalancerPolicyArgs() {}

    private LoadBalancerPolicyArgs(LoadBalancerPolicyArgs $) {
        this.accessLogs = $.accessLogs;
        this.backendVmIds = $.backendVmIds;
        this.cookieExpirationPeriod = $.cookieExpirationPeriod;
        this.cookieName = $.cookieName;
        this.loadBalancerName = $.loadBalancerName;
        this.loadBalancerType = $.loadBalancerType;
        this.policyName = $.policyName;
        this.policyType = $.policyType;
        this.securityGroups = $.securityGroups;
        this.subnets = $.subnets;
        this.subregionNames = $.subregionNames;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPolicyArgs $;

        public Builder() {
            $ = new LoadBalancerPolicyArgs();
        }

        public Builder(LoadBalancerPolicyArgs defaults) {
            $ = new LoadBalancerPolicyArgs(Objects.requireNonNull(defaults));
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
         * @param loadBalancerName The name of the load balancer for which you want to create a policy.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(Output<String> loadBalancerName) {
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
         * @param policyName The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
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
        public Builder policyType(Output<String> policyType) {
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

        public LoadBalancerPolicyArgs build() {
            $.loadBalancerName = Objects.requireNonNull($.loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            $.policyType = Objects.requireNonNull($.policyType, "expected parameter 'policyType' to be non-null");
            return $;
        }
    }

}
