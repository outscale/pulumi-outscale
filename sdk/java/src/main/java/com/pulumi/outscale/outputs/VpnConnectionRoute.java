// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnConnectionRoute {
    /**
     * @return The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
     * 
     */
    private @Nullable String destinationIpRange;
    /**
     * @return The type of route (always `static`).
     * 
     */
    private @Nullable String routeType;
    /**
     * @return The state of the IPSEC tunnel (`UP` \| `DOWN`).
     * 
     */
    private @Nullable String state;

    private VpnConnectionRoute() {}
    /**
     * @return The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
     * 
     */
    public Optional<String> destinationIpRange() {
        return Optional.ofNullable(this.destinationIpRange);
    }
    /**
     * @return The type of route (always `static`).
     * 
     */
    public Optional<String> routeType() {
        return Optional.ofNullable(this.routeType);
    }
    /**
     * @return The state of the IPSEC tunnel (`UP` \| `DOWN`).
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destinationIpRange;
        private @Nullable String routeType;
        private @Nullable String state;
        public Builder() {}
        public Builder(VpnConnectionRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationIpRange = defaults.destinationIpRange;
    	      this.routeType = defaults.routeType;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder destinationIpRange(@Nullable String destinationIpRange) {
            this.destinationIpRange = destinationIpRange;
            return this;
        }
        @CustomType.Setter
        public Builder routeType(@Nullable String routeType) {
            this.routeType = routeType;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public VpnConnectionRoute build() {
            final var o = new VpnConnectionRoute();
            o.destinationIpRange = destinationIpRange;
            o.routeType = routeType;
            o.state = state;
            return o;
        }
    }
}
