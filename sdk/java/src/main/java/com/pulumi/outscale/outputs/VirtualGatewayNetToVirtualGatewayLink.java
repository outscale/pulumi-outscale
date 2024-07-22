// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewayNetToVirtualGatewayLink {
    /**
     * @return The ID of the Net to which the virtual gateway is attached.
     * 
     */
    private @Nullable String netId;
    /**
     * @return The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    private @Nullable String state;

    private VirtualGatewayNetToVirtualGatewayLink() {}
    /**
     * @return The ID of the Net to which the virtual gateway is attached.
     * 
     */
    public Optional<String> netId() {
        return Optional.ofNullable(this.netId);
    }
    /**
     * @return The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewayNetToVirtualGatewayLink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String netId;
        private @Nullable String state;
        public Builder() {}
        public Builder(VirtualGatewayNetToVirtualGatewayLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.netId = defaults.netId;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder netId(@Nullable String netId) {
            this.netId = netId;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public VirtualGatewayNetToVirtualGatewayLink build() {
            final var o = new VirtualGatewayNetToVirtualGatewayLink();
            o.netId = netId;
            o.state = state;
            return o;
        }
    }
}
