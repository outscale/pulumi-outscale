// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetRouteTableFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteTablePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteTablePlainArgs Empty = new GetRouteTablePlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetRouteTableFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetRouteTableFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the route table.
     * 
     */
    @Import(name="routeTableId")
    private @Nullable String routeTableId;

    /**
     * @return The ID of the route table.
     * 
     */
    public Optional<String> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    private GetRouteTablePlainArgs() {}

    private GetRouteTablePlainArgs(GetRouteTablePlainArgs $) {
        this.filters = $.filters;
        this.routeTableId = $.routeTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteTablePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteTablePlainArgs $;

        public Builder() {
            $ = new GetRouteTablePlainArgs();
        }

        public Builder(GetRouteTablePlainArgs defaults) {
            $ = new GetRouteTablePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetRouteTableFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetRouteTableFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param routeTableId The ID of the route table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(@Nullable String routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        public GetRouteTablePlainArgs build() {
            return $;
        }
    }

}
