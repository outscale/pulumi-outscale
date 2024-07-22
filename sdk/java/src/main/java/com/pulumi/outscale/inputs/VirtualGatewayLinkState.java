// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.VirtualGatewayLinkNetToVirtualGatewayLinkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewayLinkState extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewayLinkState Empty = new VirtualGatewayLinkState();

    @Import(name="dryRun")
    private @Nullable Output<String> dryRun;

    public Optional<Output<String>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The ID of the Net to which you want to attach the virtual gateway.
     * 
     */
    @Import(name="netId")
    private @Nullable Output<String> netId;

    /**
     * @return The ID of the Net to which you want to attach the virtual gateway.
     * 
     */
    public Optional<Output<String>> netId() {
        return Optional.ofNullable(this.netId);
    }

    @Import(name="netToVirtualGatewayLinks")
    private @Nullable Output<List<VirtualGatewayLinkNetToVirtualGatewayLinkArgs>> netToVirtualGatewayLinks;

    public Optional<Output<List<VirtualGatewayLinkNetToVirtualGatewayLinkArgs>>> netToVirtualGatewayLinks() {
        return Optional.ofNullable(this.netToVirtualGatewayLinks);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
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

    private VirtualGatewayLinkState() {}

    private VirtualGatewayLinkState(VirtualGatewayLinkState $) {
        this.dryRun = $.dryRun;
        this.netId = $.netId;
        this.netToVirtualGatewayLinks = $.netToVirtualGatewayLinks;
        this.requestId = $.requestId;
        this.virtualGatewayId = $.virtualGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewayLinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewayLinkState $;

        public Builder() {
            $ = new VirtualGatewayLinkState();
        }

        public Builder(VirtualGatewayLinkState defaults) {
            $ = new VirtualGatewayLinkState(Objects.requireNonNull(defaults));
        }

        public Builder dryRun(@Nullable Output<String> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        public Builder dryRun(String dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param netId The ID of the Net to which you want to attach the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder netId(@Nullable Output<String> netId) {
            $.netId = netId;
            return this;
        }

        /**
         * @param netId The ID of the Net to which you want to attach the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder netId(String netId) {
            return netId(Output.of(netId));
        }

        public Builder netToVirtualGatewayLinks(@Nullable Output<List<VirtualGatewayLinkNetToVirtualGatewayLinkArgs>> netToVirtualGatewayLinks) {
            $.netToVirtualGatewayLinks = netToVirtualGatewayLinks;
            return this;
        }

        public Builder netToVirtualGatewayLinks(List<VirtualGatewayLinkNetToVirtualGatewayLinkArgs> netToVirtualGatewayLinks) {
            return netToVirtualGatewayLinks(Output.of(netToVirtualGatewayLinks));
        }

        public Builder netToVirtualGatewayLinks(VirtualGatewayLinkNetToVirtualGatewayLinkArgs... netToVirtualGatewayLinks) {
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

        public VirtualGatewayLinkState build() {
            return $;
        }
    }

}
