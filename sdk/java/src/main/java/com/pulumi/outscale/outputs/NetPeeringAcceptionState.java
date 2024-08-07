// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetPeeringAcceptionState {
    /**
     * @return Additional information about the state of the Net peering.
     * 
     */
    private @Nullable String message;
    /**
     * @return The state of the Net peering (`pending-acceptance` \| `active` \| `rejected` \| `failed` \| `expired` \| `deleted`).
     * 
     */
    private @Nullable String name;

    private NetPeeringAcceptionState() {}
    /**
     * @return Additional information about the state of the Net peering.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return The state of the Net peering (`pending-acceptance` \| `active` \| `rejected` \| `failed` \| `expired` \| `deleted`).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetPeeringAcceptionState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String message;
        private @Nullable String name;
        public Builder() {}
        public Builder(NetPeeringAcceptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public NetPeeringAcceptionState build() {
            final var o = new NetPeeringAcceptionState();
            o.message = message;
            o.name = name;
            return o;
        }
    }
}
