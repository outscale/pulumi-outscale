// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetClientGatewaysClientGateway;
import com.pulumi.outscale.outputs.GetClientGatewaysFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetClientGatewaysResult {
    private @Nullable List<String> clientGatewayIds;
    /**
     * @return Information about one or more client gateways.
     * 
     */
    private List<GetClientGatewaysClientGateway> clientGateways;
    private @Nullable List<GetClientGatewaysFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String requestId;

    private GetClientGatewaysResult() {}
    public List<String> clientGatewayIds() {
        return this.clientGatewayIds == null ? List.of() : this.clientGatewayIds;
    }
    /**
     * @return Information about one or more client gateways.
     * 
     */
    public List<GetClientGatewaysClientGateway> clientGateways() {
        return this.clientGateways;
    }
    public List<GetClientGatewaysFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String requestId() {
        return this.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientGatewaysResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> clientGatewayIds;
        private List<GetClientGatewaysClientGateway> clientGateways;
        private @Nullable List<GetClientGatewaysFilter> filters;
        private String id;
        private String requestId;
        public Builder() {}
        public Builder(GetClientGatewaysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientGatewayIds = defaults.clientGatewayIds;
    	      this.clientGateways = defaults.clientGateways;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder clientGatewayIds(@Nullable List<String> clientGatewayIds) {
            this.clientGatewayIds = clientGatewayIds;
            return this;
        }
        public Builder clientGatewayIds(String... clientGatewayIds) {
            return clientGatewayIds(List.of(clientGatewayIds));
        }
        @CustomType.Setter
        public Builder clientGateways(List<GetClientGatewaysClientGateway> clientGateways) {
            this.clientGateways = Objects.requireNonNull(clientGateways);
            return this;
        }
        public Builder clientGateways(GetClientGatewaysClientGateway... clientGateways) {
            return clientGateways(List.of(clientGateways));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetClientGatewaysFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetClientGatewaysFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        public GetClientGatewaysResult build() {
            final var o = new GetClientGatewaysResult();
            o.clientGatewayIds = clientGatewayIds;
            o.clientGateways = clientGateways;
            o.filters = filters;
            o.id = id;
            o.requestId = requestId;
            return o;
        }
    }
}
