// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetNetAccessPointsNetAccessPointTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetAccessPointsNetAccessPoint {
    /**
     * @return The ID of the Net access point.
     * 
     */
    private String netAccessPointId;
    /**
     * @return The ID of the Net with which the Net access point is associated.
     * 
     */
    private String netId;
    /**
     * @return The ID of the route tables associated with the Net access point.
     * 
     */
    private List<String> routeTableIds;
    /**
     * @return The name of the service with which the Net access point is associated.
     * 
     */
    private String serviceName;
    /**
     * @return The state of the Net access point (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    private String state;
    /**
     * @return The key/value combinations of the tags associated with the Net access points, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    private List<GetNetAccessPointsNetAccessPointTag> tags;

    private GetNetAccessPointsNetAccessPoint() {}
    /**
     * @return The ID of the Net access point.
     * 
     */
    public String netAccessPointId() {
        return this.netAccessPointId;
    }
    /**
     * @return The ID of the Net with which the Net access point is associated.
     * 
     */
    public String netId() {
        return this.netId;
    }
    /**
     * @return The ID of the route tables associated with the Net access point.
     * 
     */
    public List<String> routeTableIds() {
        return this.routeTableIds;
    }
    /**
     * @return The name of the service with which the Net access point is associated.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return The state of the Net access point (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The key/value combinations of the tags associated with the Net access points, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    public List<GetNetAccessPointsNetAccessPointTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetAccessPointsNetAccessPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String netAccessPointId;
        private String netId;
        private List<String> routeTableIds;
        private String serviceName;
        private String state;
        private List<GetNetAccessPointsNetAccessPointTag> tags;
        public Builder() {}
        public Builder(GetNetAccessPointsNetAccessPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.netAccessPointId = defaults.netAccessPointId;
    	      this.netId = defaults.netId;
    	      this.routeTableIds = defaults.routeTableIds;
    	      this.serviceName = defaults.serviceName;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder netAccessPointId(String netAccessPointId) {
            this.netAccessPointId = Objects.requireNonNull(netAccessPointId);
            return this;
        }
        @CustomType.Setter
        public Builder netId(String netId) {
            this.netId = Objects.requireNonNull(netId);
            return this;
        }
        @CustomType.Setter
        public Builder routeTableIds(List<String> routeTableIds) {
            this.routeTableIds = Objects.requireNonNull(routeTableIds);
            return this;
        }
        public Builder routeTableIds(String... routeTableIds) {
            return routeTableIds(List.of(routeTableIds));
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetNetAccessPointsNetAccessPointTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetNetAccessPointsNetAccessPointTag... tags) {
            return tags(List.of(tags));
        }
        public GetNetAccessPointsNetAccessPoint build() {
            final var o = new GetNetAccessPointsNetAccessPoint();
            o.netAccessPointId = netAccessPointId;
            o.netId = netId;
            o.routeTableIds = routeTableIds;
            o.serviceName = serviceName;
            o.state = state;
            o.tags = tags;
            return o;
        }
    }
}
