// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetLoadBalancersFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancersPlainArgs Empty = new GetLoadBalancersPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetLoadBalancersFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetLoadBalancersFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the load balancer.
     * 
     */
    @Import(name="loadBalancerNames")
    private @Nullable List<String> loadBalancerNames;

    /**
     * @return The name of the load balancer.
     * 
     */
    public Optional<List<String>> loadBalancerNames() {
        return Optional.ofNullable(this.loadBalancerNames);
    }

    private GetLoadBalancersPlainArgs() {}

    private GetLoadBalancersPlainArgs(GetLoadBalancersPlainArgs $) {
        this.filters = $.filters;
        this.loadBalancerNames = $.loadBalancerNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancersPlainArgs $;

        public Builder() {
            $ = new GetLoadBalancersPlainArgs();
        }

        public Builder(GetLoadBalancersPlainArgs defaults) {
            $ = new GetLoadBalancersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetLoadBalancersFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLoadBalancersFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param loadBalancerNames The name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerNames(@Nullable List<String> loadBalancerNames) {
            $.loadBalancerNames = loadBalancerNames;
            return this;
        }

        /**
         * @param loadBalancerNames The name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerNames(String... loadBalancerNames) {
            return loadBalancerNames(List.of(loadBalancerNames));
        }

        public GetLoadBalancersPlainArgs build() {
            return $;
        }
    }

}