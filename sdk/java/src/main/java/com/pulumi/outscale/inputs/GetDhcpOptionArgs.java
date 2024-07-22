// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetDhcpOptionFilterArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDhcpOptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDhcpOptionArgs Empty = new GetDhcpOptionArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetDhcpOptionFilterArgs>> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<Output<List<GetDhcpOptionFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetDhcpOptionArgs() {}

    private GetDhcpOptionArgs(GetDhcpOptionArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDhcpOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDhcpOptionArgs $;

        public Builder() {
            $ = new GetDhcpOptionArgs();
        }

        public Builder(GetDhcpOptionArgs defaults) {
            $ = new GetDhcpOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetDhcpOptionFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetDhcpOptionFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetDhcpOptionFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetDhcpOptionArgs build() {
            return $;
        }
    }

}
