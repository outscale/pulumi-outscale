// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetNetAccessPointServicesFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetAccessPointServicesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetAccessPointServicesPlainArgs Empty = new GetNetAccessPointServicesPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetNetAccessPointServicesFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetNetAccessPointServicesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetNetAccessPointServicesPlainArgs() {}

    private GetNetAccessPointServicesPlainArgs(GetNetAccessPointServicesPlainArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetAccessPointServicesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetAccessPointServicesPlainArgs $;

        public Builder() {
            $ = new GetNetAccessPointServicesPlainArgs();
        }

        public Builder(GetNetAccessPointServicesPlainArgs defaults) {
            $ = new GetNetAccessPointServicesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetNetAccessPointServicesFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetNetAccessPointServicesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetNetAccessPointServicesPlainArgs build() {
            return $;
        }
    }

}
