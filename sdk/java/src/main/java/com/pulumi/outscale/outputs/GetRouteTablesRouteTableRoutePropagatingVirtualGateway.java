// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteTablesRouteTableRoutePropagatingVirtualGateway {
    /**
     * @return The ID of the virtual gateway.
     * 
     */
    private String virtualGatewayId;

    private GetRouteTablesRouteTableRoutePropagatingVirtualGateway() {}
    /**
     * @return The ID of the virtual gateway.
     * 
     */
    public String virtualGatewayId() {
        return this.virtualGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTablesRouteTableRoutePropagatingVirtualGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String virtualGatewayId;
        public Builder() {}
        public Builder(GetRouteTablesRouteTableRoutePropagatingVirtualGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualGatewayId = defaults.virtualGatewayId;
        }

        @CustomType.Setter
        public Builder virtualGatewayId(String virtualGatewayId) {
            this.virtualGatewayId = Objects.requireNonNull(virtualGatewayId);
            return this;
        }
        public GetRouteTablesRouteTableRoutePropagatingVirtualGateway build() {
            final var o = new GetRouteTablesRouteTableRoutePropagatingVirtualGateway();
            o.virtualGatewayId = virtualGatewayId;
            return o;
        }
    }
}