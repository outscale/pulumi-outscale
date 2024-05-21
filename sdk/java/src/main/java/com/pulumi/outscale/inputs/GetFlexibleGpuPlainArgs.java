// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetFlexibleGpuFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFlexibleGpuPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlexibleGpuPlainArgs Empty = new GetFlexibleGpuPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetFlexibleGpuFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetFlexibleGpuFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetFlexibleGpuPlainArgs() {}

    private GetFlexibleGpuPlainArgs(GetFlexibleGpuPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlexibleGpuPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlexibleGpuPlainArgs $;

        public Builder() {
            $ = new GetFlexibleGpuPlainArgs();
        }

        public Builder(GetFlexibleGpuPlainArgs defaults) {
            $ = new GetFlexibleGpuPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetFlexibleGpuFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetFlexibleGpuFilter... filters) {
            return filters(List.of(filters));
        }

        public GetFlexibleGpuPlainArgs build() {
            return $;
        }
    }

}