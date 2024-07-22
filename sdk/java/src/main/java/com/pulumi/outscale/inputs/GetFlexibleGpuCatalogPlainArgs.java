// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetFlexibleGpuCatalogFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFlexibleGpuCatalogPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlexibleGpuCatalogPlainArgs Empty = new GetFlexibleGpuCatalogPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetFlexibleGpuCatalogFilter> filters;

    public Optional<List<GetFlexibleGpuCatalogFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetFlexibleGpuCatalogPlainArgs() {}

    private GetFlexibleGpuCatalogPlainArgs(GetFlexibleGpuCatalogPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlexibleGpuCatalogPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlexibleGpuCatalogPlainArgs $;

        public Builder() {
            $ = new GetFlexibleGpuCatalogPlainArgs();
        }

        public Builder(GetFlexibleGpuCatalogPlainArgs defaults) {
            $ = new GetFlexibleGpuCatalogPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetFlexibleGpuCatalogFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetFlexibleGpuCatalogFilter... filters) {
            return filters(List.of(filters));
        }

        public GetFlexibleGpuCatalogPlainArgs build() {
            return $;
        }
    }

}
