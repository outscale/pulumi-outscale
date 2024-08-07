// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetVirtualGatewaysFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualGatewaysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualGatewaysPlainArgs Empty = new GetVirtualGatewaysPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVirtualGatewaysFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetVirtualGatewaysFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the virtual gateway.
     * 
     */
    @Import(name="virtualGatewayIds")
    private @Nullable List<String> virtualGatewayIds;

    /**
     * @return The ID of the virtual gateway.
     * 
     */
    public Optional<List<String>> virtualGatewayIds() {
        return Optional.ofNullable(this.virtualGatewayIds);
    }

    private GetVirtualGatewaysPlainArgs() {}

    private GetVirtualGatewaysPlainArgs(GetVirtualGatewaysPlainArgs $) {
        this.filters = $.filters;
        this.virtualGatewayIds = $.virtualGatewayIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualGatewaysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualGatewaysPlainArgs $;

        public Builder() {
            $ = new GetVirtualGatewaysPlainArgs();
        }

        public Builder(GetVirtualGatewaysPlainArgs defaults) {
            $ = new GetVirtualGatewaysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVirtualGatewaysFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVirtualGatewaysFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param virtualGatewayIds The ID of the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayIds(@Nullable List<String> virtualGatewayIds) {
            $.virtualGatewayIds = virtualGatewayIds;
            return this;
        }

        /**
         * @param virtualGatewayIds The ID of the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayIds(String... virtualGatewayIds) {
            return virtualGatewayIds(List.of(virtualGatewayIds));
        }

        public GetVirtualGatewaysPlainArgs build() {
            return $;
        }
    }

}
