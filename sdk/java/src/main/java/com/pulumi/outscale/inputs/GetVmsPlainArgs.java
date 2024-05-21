// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetVmsFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVmsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVmsPlainArgs Empty = new GetVmsPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVmsFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetVmsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetVmsPlainArgs() {}

    private GetVmsPlainArgs(GetVmsPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVmsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVmsPlainArgs $;

        public Builder() {
            $ = new GetVmsPlainArgs();
        }

        public Builder(GetVmsPlainArgs defaults) {
            $ = new GetVmsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVmsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVmsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetVmsPlainArgs build() {
            return $;
        }
    }

}