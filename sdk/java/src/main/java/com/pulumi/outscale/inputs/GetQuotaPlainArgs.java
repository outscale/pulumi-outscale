// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetQuotaFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQuotaPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQuotaPlainArgs Empty = new GetQuotaPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetQuotaFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetQuotaFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetQuotaPlainArgs() {}

    private GetQuotaPlainArgs(GetQuotaPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQuotaPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQuotaPlainArgs $;

        public Builder() {
            $ = new GetQuotaPlainArgs();
        }

        public Builder(GetQuotaPlainArgs defaults) {
            $ = new GetQuotaPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetQuotaFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetQuotaFilter... filters) {
            return filters(List.of(filters));
        }

        public GetQuotaPlainArgs build() {
            return $;
        }
    }

}
