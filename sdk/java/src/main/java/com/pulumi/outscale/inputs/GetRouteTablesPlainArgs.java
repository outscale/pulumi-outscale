// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetRouteTablesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteTablesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteTablesPlainArgs Empty = new GetRouteTablesPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetRouteTablesFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetRouteTablesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the route table.
     * 
     */
    @Import(name="routeTableIds")
    private @Nullable List<String> routeTableIds;

    /**
     * @return The ID of the route table.
     * 
     */
    public Optional<List<String>> routeTableIds() {
        return Optional.ofNullable(this.routeTableIds);
    }

    private GetRouteTablesPlainArgs() {}

    private GetRouteTablesPlainArgs(GetRouteTablesPlainArgs $) {
        this.filters = $.filters;
        this.routeTableIds = $.routeTableIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteTablesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteTablesPlainArgs $;

        public Builder() {
            $ = new GetRouteTablesPlainArgs();
        }

        public Builder(GetRouteTablesPlainArgs defaults) {
            $ = new GetRouteTablesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetRouteTablesFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetRouteTablesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param routeTableIds The ID of the route table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableIds(@Nullable List<String> routeTableIds) {
            $.routeTableIds = routeTableIds;
            return this;
        }

        /**
         * @param routeTableIds The ID of the route table.
         * 
         * @return builder
         * 
         */
        public Builder routeTableIds(String... routeTableIds) {
            return routeTableIds(List.of(routeTableIds));
        }

        public GetRouteTablesPlainArgs build() {
            return $;
        }
    }

}
