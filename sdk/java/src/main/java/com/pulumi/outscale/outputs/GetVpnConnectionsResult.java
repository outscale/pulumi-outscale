// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetVpnConnectionsFilter;
import com.pulumi.outscale.outputs.GetVpnConnectionsVpnConnection;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVpnConnectionsResult {
    private @Nullable List<GetVpnConnectionsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String requestId;
    private @Nullable List<String> vpnConnectionIds;
    /**
     * @return Information about one or more VPN connections.
     * 
     */
    private List<GetVpnConnectionsVpnConnection> vpnConnections;

    private GetVpnConnectionsResult() {}
    public List<GetVpnConnectionsFilter> filters() {
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
    public List<String> vpnConnectionIds() {
        return this.vpnConnectionIds == null ? List.of() : this.vpnConnectionIds;
    }
    /**
     * @return Information about one or more VPN connections.
     * 
     */
    public List<GetVpnConnectionsVpnConnection> vpnConnections() {
        return this.vpnConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnConnectionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetVpnConnectionsFilter> filters;
        private String id;
        private String requestId;
        private @Nullable List<String> vpnConnectionIds;
        private List<GetVpnConnectionsVpnConnection> vpnConnections;
        public Builder() {}
        public Builder(GetVpnConnectionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.requestId = defaults.requestId;
    	      this.vpnConnectionIds = defaults.vpnConnectionIds;
    	      this.vpnConnections = defaults.vpnConnections;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetVpnConnectionsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpnConnectionsFilter... filters) {
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
        @CustomType.Setter
        public Builder vpnConnectionIds(@Nullable List<String> vpnConnectionIds) {
            this.vpnConnectionIds = vpnConnectionIds;
            return this;
        }
        public Builder vpnConnectionIds(String... vpnConnectionIds) {
            return vpnConnectionIds(List.of(vpnConnectionIds));
        }
        @CustomType.Setter
        public Builder vpnConnections(List<GetVpnConnectionsVpnConnection> vpnConnections) {
            this.vpnConnections = Objects.requireNonNull(vpnConnections);
            return this;
        }
        public Builder vpnConnections(GetVpnConnectionsVpnConnection... vpnConnections) {
            return vpnConnections(List.of(vpnConnections));
        }
        public GetVpnConnectionsResult build() {
            final var o = new GetVpnConnectionsResult();
            o.filters = filters;
            o.id = id;
            o.requestId = requestId;
            o.vpnConnectionIds = vpnConnectionIds;
            o.vpnConnections = vpnConnections;
            return o;
        }
    }
}
