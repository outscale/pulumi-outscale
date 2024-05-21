// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetDhcpOptionFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDhcpOptionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDhcpOptionPlainArgs Empty = new GetDhcpOptionPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetDhcpOptionFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetDhcpOptionFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetDhcpOptionPlainArgs() {}

    private GetDhcpOptionPlainArgs(GetDhcpOptionPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDhcpOptionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDhcpOptionPlainArgs $;

        public Builder() {
            $ = new GetDhcpOptionPlainArgs();
        }

        public Builder(GetDhcpOptionPlainArgs defaults) {
            $ = new GetDhcpOptionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetDhcpOptionFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetDhcpOptionFilter... filters) {
            return filters(List.of(filters));
        }

        public GetDhcpOptionPlainArgs build() {
            return $;
        }
    }

}