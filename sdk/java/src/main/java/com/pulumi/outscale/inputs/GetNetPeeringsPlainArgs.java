// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetNetPeeringsFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetPeeringsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetPeeringsPlainArgs Empty = new GetNetPeeringsPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetNetPeeringsFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetNetPeeringsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetNetPeeringsPlainArgs() {}

    private GetNetPeeringsPlainArgs(GetNetPeeringsPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetPeeringsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetPeeringsPlainArgs $;

        public Builder() {
            $ = new GetNetPeeringsPlainArgs();
        }

        public Builder(GetNetPeeringsPlainArgs defaults) {
            $ = new GetNetPeeringsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetNetPeeringsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetNetPeeringsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetNetPeeringsPlainArgs build() {
            return $;
        }
    }

}
