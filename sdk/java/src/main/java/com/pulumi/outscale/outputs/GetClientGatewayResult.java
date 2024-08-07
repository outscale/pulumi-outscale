// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetClientGatewayFilter;
import com.pulumi.outscale.outputs.GetClientGatewayTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClientGatewayResult {
    /**
     * @return The Autonomous System Number (ASN) used by the Border Gateway Protocol (BGP) to find the path to your client gateway through the Internet.
     * 
     */
    private Integer bgpAsn;
    /**
     * @return The ID of the client gateway.
     * 
     */
    private @Nullable String clientGatewayId;
    /**
     * @return The type of communication tunnel used by the client gateway (only `ipsec.1` is supported).
     * 
     */
    private String connectionType;
    private @Nullable List<GetClientGatewayFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The public IPv4 address of the client gateway (must be a fixed address into a NATed network).
     * 
     */
    private String publicIp;
    private String requestId;
    /**
     * @return The state of the client gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    private String state;
    /**
     * @return One or more tags associated with the client gateway.
     * 
     */
    private List<GetClientGatewayTag> tags;

    private GetClientGatewayResult() {}
    /**
     * @return The Autonomous System Number (ASN) used by the Border Gateway Protocol (BGP) to find the path to your client gateway through the Internet.
     * 
     */
    public Integer bgpAsn() {
        return this.bgpAsn;
    }
    /**
     * @return The ID of the client gateway.
     * 
     */
    public Optional<String> clientGatewayId() {
        return Optional.ofNullable(this.clientGatewayId);
    }
    /**
     * @return The type of communication tunnel used by the client gateway (only `ipsec.1` is supported).
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }
    public List<GetClientGatewayFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The public IPv4 address of the client gateway (must be a fixed address into a NATed network).
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return The state of the client gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return One or more tags associated with the client gateway.
     * 
     */
    public List<GetClientGatewayTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientGatewayResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer bgpAsn;
        private @Nullable String clientGatewayId;
        private String connectionType;
        private @Nullable List<GetClientGatewayFilter> filters;
        private String id;
        private String publicIp;
        private String requestId;
        private String state;
        private List<GetClientGatewayTag> tags;
        public Builder() {}
        public Builder(GetClientGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.clientGatewayId = defaults.clientGatewayId;
    	      this.connectionType = defaults.connectionType;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.publicIp = defaults.publicIp;
    	      this.requestId = defaults.requestId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder bgpAsn(Integer bgpAsn) {
            this.bgpAsn = Objects.requireNonNull(bgpAsn);
            return this;
        }
        @CustomType.Setter
        public Builder clientGatewayId(@Nullable String clientGatewayId) {
            this.clientGatewayId = clientGatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetClientGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetClientGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetClientGatewayTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetClientGatewayTag... tags) {
            return tags(List.of(tags));
        }
        public GetClientGatewayResult build() {
            final var o = new GetClientGatewayResult();
            o.bgpAsn = bgpAsn;
            o.clientGatewayId = clientGatewayId;
            o.connectionType = connectionType;
            o.filters = filters;
            o.id = id;
            o.publicIp = publicIp;
            o.requestId = requestId;
            o.state = state;
            o.tags = tags;
            return o;
        }
    }
}
