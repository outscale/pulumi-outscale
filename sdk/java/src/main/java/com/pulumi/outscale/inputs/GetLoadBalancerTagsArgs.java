// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetLoadBalancerTagsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancerTagsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerTagsArgs Empty = new GetLoadBalancerTagsArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetLoadBalancerTagsFilterArgs>> filters;

    public Optional<Output<List<GetLoadBalancerTagsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="loadBalancerNames")
    private @Nullable Output<List<String>> loadBalancerNames;

    public Optional<Output<List<String>>> loadBalancerNames() {
        return Optional.ofNullable(this.loadBalancerNames);
    }

    private GetLoadBalancerTagsArgs() {}

    private GetLoadBalancerTagsArgs(GetLoadBalancerTagsArgs $) {
        this.filters = $.filters;
        this.loadBalancerNames = $.loadBalancerNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerTagsArgs $;

        public Builder() {
            $ = new GetLoadBalancerTagsArgs();
        }

        public Builder(GetLoadBalancerTagsArgs defaults) {
            $ = new GetLoadBalancerTagsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetLoadBalancerTagsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetLoadBalancerTagsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetLoadBalancerTagsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder loadBalancerNames(@Nullable Output<List<String>> loadBalancerNames) {
            $.loadBalancerNames = loadBalancerNames;
            return this;
        }

        public Builder loadBalancerNames(List<String> loadBalancerNames) {
            return loadBalancerNames(Output.of(loadBalancerNames));
        }

        public Builder loadBalancerNames(String... loadBalancerNames) {
            return loadBalancerNames(List.of(loadBalancerNames));
        }

        public GetLoadBalancerTagsArgs build() {
            return $;
        }
    }

}