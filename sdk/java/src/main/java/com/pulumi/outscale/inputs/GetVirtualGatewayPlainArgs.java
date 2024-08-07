// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetVirtualGatewayFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualGatewayPlainArgs Empty = new GetVirtualGatewayPlainArgs();

    /**
     * The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
     * 
     */
    @Import(name="connectionType")
    private @Nullable String connectionType;

    /**
     * @return The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
     * 
     */
    public Optional<String> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVirtualGatewayFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetVirtualGatewayFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The ID of the virtual gateway.
     * 
     */
    @Import(name="virtualGatewayId")
    private @Nullable String virtualGatewayId;

    /**
     * @return The ID of the virtual gateway.
     * 
     */
    public Optional<String> virtualGatewayId() {
        return Optional.ofNullable(this.virtualGatewayId);
    }

    private GetVirtualGatewayPlainArgs() {}

    private GetVirtualGatewayPlainArgs(GetVirtualGatewayPlainArgs $) {
        this.connectionType = $.connectionType;
        this.filters = $.filters;
        this.state = $.state;
        this.virtualGatewayId = $.virtualGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualGatewayPlainArgs $;

        public Builder() {
            $ = new GetVirtualGatewayPlainArgs();
        }

        public Builder(GetVirtualGatewayPlainArgs defaults) {
            $ = new GetVirtualGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionType The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
         * 
         * @return builder
         * 
         */
        public Builder connectionType(@Nullable String connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVirtualGatewayFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVirtualGatewayFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param virtualGatewayId The ID of the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayId(@Nullable String virtualGatewayId) {
            $.virtualGatewayId = virtualGatewayId;
            return this;
        }

        public GetVirtualGatewayPlainArgs build() {
            return $;
        }
    }

}
