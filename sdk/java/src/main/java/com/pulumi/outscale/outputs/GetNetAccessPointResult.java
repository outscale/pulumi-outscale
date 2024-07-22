// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetNetAccessPointFilter;
import com.pulumi.outscale.outputs.GetNetAccessPointTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNetAccessPointResult {
    private @Nullable List<GetNetAccessPointFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
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
    private String requestId;
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
     * @return One or more tags associated with the Net access point.
     * 
     */
    private List<GetNetAccessPointTag> tags;

    private GetNetAccessPointResult() {}
    public List<GetNetAccessPointFilter> filters() {
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
    public String requestId() {
        return this.requestId;
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
     * @return One or more tags associated with the Net access point.
     * 
     */
    public List<GetNetAccessPointTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetAccessPointResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetNetAccessPointFilter> filters;
        private String id;
        private String netAccessPointId;
        private String netId;
        private String requestId;
        private List<String> routeTableIds;
        private String serviceName;
        private String state;
        private List<GetNetAccessPointTag> tags;
        public Builder() {}
        public Builder(GetNetAccessPointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.netAccessPointId = defaults.netAccessPointId;
    	      this.netId = defaults.netId;
    	      this.requestId = defaults.requestId;
    	      this.routeTableIds = defaults.routeTableIds;
    	      this.serviceName = defaults.serviceName;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetNetAccessPointFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNetAccessPointFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
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
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
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
        public Builder tags(List<GetNetAccessPointTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetNetAccessPointTag... tags) {
            return tags(List.of(tags));
        }
        public GetNetAccessPointResult build() {
            final var o = new GetNetAccessPointResult();
            o.filters = filters;
            o.id = id;
            o.netAccessPointId = netAccessPointId;
            o.netId = netId;
            o.requestId = requestId;
            o.routeTableIds = routeTableIds;
            o.serviceName = serviceName;
            o.state = state;
            o.tags = tags;
            return o;
        }
    }
}
