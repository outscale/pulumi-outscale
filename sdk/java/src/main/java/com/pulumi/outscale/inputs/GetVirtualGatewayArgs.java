// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetVirtualGatewayFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualGatewayArgs Empty = new GetVirtualGatewayArgs();

    /**
     * The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
     * 
     */
    @Import(name="connectionType")
    private @Nullable Output<String> connectionType;

    /**
     * @return The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
     * 
     */
    public Optional<Output<String>> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetVirtualGatewayFilterArgs>> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<Output<List<GetVirtualGatewayFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The ID of the virtual gateway.
     * 
     */
    @Import(name="virtualGatewayId")
    private @Nullable Output<String> virtualGatewayId;

    /**
     * @return The ID of the virtual gateway.
     * 
     */
    public Optional<Output<String>> virtualGatewayId() {
        return Optional.ofNullable(this.virtualGatewayId);
    }

    private GetVirtualGatewayArgs() {}

    private GetVirtualGatewayArgs(GetVirtualGatewayArgs $) {
        this.connectionType = $.connectionType;
        this.filters = $.filters;
        this.state = $.state;
        this.virtualGatewayId = $.virtualGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualGatewayArgs $;

        public Builder() {
            $ = new GetVirtualGatewayArgs();
        }

        public Builder(GetVirtualGatewayArgs defaults) {
            $ = new GetVirtualGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionType The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
         * 
         * @return builder
         * 
         */
        public Builder connectionType(@Nullable Output<String> connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param connectionType The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            return connectionType(Output.of(connectionType));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetVirtualGatewayFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetVirtualGatewayFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVirtualGatewayFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param virtualGatewayId The ID of the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayId(@Nullable Output<String> virtualGatewayId) {
            $.virtualGatewayId = virtualGatewayId;
            return this;
        }

        /**
         * @param virtualGatewayId The ID of the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayId(String virtualGatewayId) {
            return virtualGatewayId(Output.of(virtualGatewayId));
        }

        public GetVirtualGatewayArgs build() {
            return $;
        }
    }

}
