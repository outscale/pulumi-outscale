// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetVirtualGatewayFilter;
import com.pulumi.outscale.outputs.GetVirtualGatewayNetToVirtualGatewayLink;
import com.pulumi.outscale.outputs.GetVirtualGatewayTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualGatewayResult {
    /**
     * @return The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
     * 
     */
    private String connectionType;
    private @Nullable List<GetVirtualGatewayFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Net to which the virtual gateway is attached.
     * 
     */
    private List<GetVirtualGatewayNetToVirtualGatewayLink> netToVirtualGatewayLinks;
    private String requestId;
    /**
     * @return The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    private String state;
    /**
     * @return One or more tags associated with the virtual gateway.
     * 
     */
    private List<GetVirtualGatewayTag> tags;
    /**
     * @return The ID of the virtual gateway.
     * 
     */
    private String virtualGatewayId;

    private GetVirtualGatewayResult() {}
    /**
     * @return The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }
    public List<GetVirtualGatewayFilter> filters() {
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
     * @return The Net to which the virtual gateway is attached.
     * 
     */
    public List<GetVirtualGatewayNetToVirtualGatewayLink> netToVirtualGatewayLinks() {
        return this.netToVirtualGatewayLinks;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return One or more tags associated with the virtual gateway.
     * 
     */
    public List<GetVirtualGatewayTag> tags() {
        return this.tags;
    }
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

    public static Builder builder(GetVirtualGatewayResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionType;
        private @Nullable List<GetVirtualGatewayFilter> filters;
        private String id;
        private List<GetVirtualGatewayNetToVirtualGatewayLink> netToVirtualGatewayLinks;
        private String requestId;
        private String state;
        private List<GetVirtualGatewayTag> tags;
        private String virtualGatewayId;
        public Builder() {}
        public Builder(GetVirtualGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionType = defaults.connectionType;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.netToVirtualGatewayLinks = defaults.netToVirtualGatewayLinks;
    	      this.requestId = defaults.requestId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.virtualGatewayId = defaults.virtualGatewayId;
        }

        @CustomType.Setter
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetVirtualGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVirtualGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder netToVirtualGatewayLinks(List<GetVirtualGatewayNetToVirtualGatewayLink> netToVirtualGatewayLinks) {
            this.netToVirtualGatewayLinks = Objects.requireNonNull(netToVirtualGatewayLinks);
            return this;
        }
        public Builder netToVirtualGatewayLinks(GetVirtualGatewayNetToVirtualGatewayLink... netToVirtualGatewayLinks) {
            return netToVirtualGatewayLinks(List.of(netToVirtualGatewayLinks));
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
        public Builder tags(List<GetVirtualGatewayTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetVirtualGatewayTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder virtualGatewayId(String virtualGatewayId) {
            this.virtualGatewayId = Objects.requireNonNull(virtualGatewayId);
            return this;
        }
        public GetVirtualGatewayResult build() {
            final var o = new GetVirtualGatewayResult();
            o.connectionType = connectionType;
            o.filters = filters;
            o.id = id;
            o.netToVirtualGatewayLinks = netToVirtualGatewayLinks;
            o.requestId = requestId;
            o.state = state;
            o.tags = tags;
            o.virtualGatewayId = virtualGatewayId;
            return o;
        }
    }
}
