// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.VirtualGatewayNetToVirtualGatewayLinkArgs;
import com.pulumi.outscale.inputs.VirtualGatewayTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewayArgs Empty = new VirtualGatewayArgs();

    /**
     * The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
     * 
     */
    @Import(name="connectionType", required=true)
    private Output<String> connectionType;

    /**
     * @return The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
     * 
     */
    public Output<String> connectionType() {
        return this.connectionType;
    }

    /**
     * The Net to which the virtual gateway is attached.
     * 
     */
    @Import(name="netToVirtualGatewayLinks")
    private @Nullable Output<List<VirtualGatewayNetToVirtualGatewayLinkArgs>> netToVirtualGatewayLinks;

    /**
     * @return The Net to which the virtual gateway is attached.
     * 
     */
    public Optional<Output<List<VirtualGatewayNetToVirtualGatewayLinkArgs>>> netToVirtualGatewayLinks() {
        return Optional.ofNullable(this.netToVirtualGatewayLinks);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
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
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<VirtualGatewayTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<VirtualGatewayTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
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

    private VirtualGatewayArgs() {}

    private VirtualGatewayArgs(VirtualGatewayArgs $) {
        this.connectionType = $.connectionType;
        this.netToVirtualGatewayLinks = $.netToVirtualGatewayLinks;
        this.requestId = $.requestId;
        this.state = $.state;
        this.tags = $.tags;
        this.virtualGatewayId = $.virtualGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewayArgs $;

        public Builder() {
            $ = new VirtualGatewayArgs();
        }

        public Builder(VirtualGatewayArgs defaults) {
            $ = new VirtualGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionType The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
         * 
         * @return builder
         * 
         */
        public Builder connectionType(Output<String> connectionType) {
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
         * @param netToVirtualGatewayLinks The Net to which the virtual gateway is attached.
         * 
         * @return builder
         * 
         */
        public Builder netToVirtualGatewayLinks(@Nullable Output<List<VirtualGatewayNetToVirtualGatewayLinkArgs>> netToVirtualGatewayLinks) {
            $.netToVirtualGatewayLinks = netToVirtualGatewayLinks;
            return this;
        }

        /**
         * @param netToVirtualGatewayLinks The Net to which the virtual gateway is attached.
         * 
         * @return builder
         * 
         */
        public Builder netToVirtualGatewayLinks(List<VirtualGatewayNetToVirtualGatewayLinkArgs> netToVirtualGatewayLinks) {
            return netToVirtualGatewayLinks(Output.of(netToVirtualGatewayLinks));
        }

        /**
         * @param netToVirtualGatewayLinks The Net to which the virtual gateway is attached.
         * 
         * @return builder
         * 
         */
        public Builder netToVirtualGatewayLinks(VirtualGatewayNetToVirtualGatewayLinkArgs... netToVirtualGatewayLinks) {
            return netToVirtualGatewayLinks(List.of(netToVirtualGatewayLinks));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
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
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<VirtualGatewayTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<VirtualGatewayTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(VirtualGatewayTagArgs... tags) {
            return tags(List.of(tags));
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

        public VirtualGatewayArgs build() {
            $.connectionType = Objects.requireNonNull($.connectionType, "expected parameter 'connectionType' to be non-null");
            return $;
        }
    }

}
