// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetLoadBalancersFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancersArgs Empty = new GetLoadBalancersArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetLoadBalancersFilterArgs>> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<Output<List<GetLoadBalancersFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the load balancer.
     * 
     */
    @Import(name="loadBalancerNames")
    private @Nullable Output<List<String>> loadBalancerNames;

    /**
     * @return The name of the load balancer.
     * 
     */
    public Optional<Output<List<String>>> loadBalancerNames() {
        return Optional.ofNullable(this.loadBalancerNames);
    }

    private GetLoadBalancersArgs() {}

    private GetLoadBalancersArgs(GetLoadBalancersArgs $) {
        this.filters = $.filters;
        this.loadBalancerNames = $.loadBalancerNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancersArgs $;

        public Builder() {
            $ = new GetLoadBalancersArgs();
        }

        public Builder(GetLoadBalancersArgs defaults) {
            $ = new GetLoadBalancersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetLoadBalancersFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetLoadBalancersFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLoadBalancersFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param loadBalancerNames The name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerNames(@Nullable Output<List<String>> loadBalancerNames) {
            $.loadBalancerNames = loadBalancerNames;
            return this;
        }

        /**
         * @param loadBalancerNames The name of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerNames(List<String> loadBalancerNames) {
            return loadBalancerNames(Output.of(loadBalancerNames));
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

        public GetLoadBalancersArgs build() {
            return $;
        }
    }

}