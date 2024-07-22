// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetRouteTableFilter;
import com.pulumi.outscale.outputs.GetRouteTableLinkRouteTable;
import com.pulumi.outscale.outputs.GetRouteTableRoute;
import com.pulumi.outscale.outputs.GetRouteTableRoutePropagatingVirtualGateway;
import com.pulumi.outscale.outputs.GetRouteTableTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRouteTableResult {
    private @Nullable List<GetRouteTableFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return One or more associations between the route table and Subnets.
     * 
     */
    private List<GetRouteTableLinkRouteTable> linkRouteTables;
    /**
     * @return The ID of the Net for the route table.
     * 
     */
    private String netId;
    private String requestId;
    /**
     * @return Information about virtual gateways propagating routes.
     * 
     */
    private List<GetRouteTableRoutePropagatingVirtualGateway> routePropagatingVirtualGateways;
    /**
     * @return The ID of the route table.
     * 
     */
    private String routeTableId;
    /**
     * @return One or more routes in the route table.
     * 
     */
    private List<GetRouteTableRoute> routes;
    /**
     * @return One or more tags associated with the route table.
     * 
     */
    private List<GetRouteTableTag> tags;

    private GetRouteTableResult() {}
    public List<GetRouteTableFilter> filters() {
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
     * @return One or more associations between the route table and Subnets.
     * 
     */
    public List<GetRouteTableLinkRouteTable> linkRouteTables() {
        return this.linkRouteTables;
    }
    /**
     * @return The ID of the Net for the route table.
     * 
     */
    public String netId() {
        return this.netId;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return Information about virtual gateways propagating routes.
     * 
     */
    public List<GetRouteTableRoutePropagatingVirtualGateway> routePropagatingVirtualGateways() {
        return this.routePropagatingVirtualGateways;
    }
    /**
     * @return The ID of the route table.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }
    /**
     * @return One or more routes in the route table.
     * 
     */
    public List<GetRouteTableRoute> routes() {
        return this.routes;
    }
    /**
     * @return One or more tags associated with the route table.
     * 
     */
    public List<GetRouteTableTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetRouteTableFilter> filters;
        private String id;
        private List<GetRouteTableLinkRouteTable> linkRouteTables;
        private String netId;
        private String requestId;
        private List<GetRouteTableRoutePropagatingVirtualGateway> routePropagatingVirtualGateways;
        private String routeTableId;
        private List<GetRouteTableRoute> routes;
        private List<GetRouteTableTag> tags;
        public Builder() {}
        public Builder(GetRouteTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.linkRouteTables = defaults.linkRouteTables;
    	      this.netId = defaults.netId;
    	      this.requestId = defaults.requestId;
    	      this.routePropagatingVirtualGateways = defaults.routePropagatingVirtualGateways;
    	      this.routeTableId = defaults.routeTableId;
    	      this.routes = defaults.routes;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetRouteTableFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetRouteTableFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder linkRouteTables(List<GetRouteTableLinkRouteTable> linkRouteTables) {
            this.linkRouteTables = Objects.requireNonNull(linkRouteTables);
            return this;
        }
        public Builder linkRouteTables(GetRouteTableLinkRouteTable... linkRouteTables) {
            return linkRouteTables(List.of(linkRouteTables));
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
        public Builder routePropagatingVirtualGateways(List<GetRouteTableRoutePropagatingVirtualGateway> routePropagatingVirtualGateways) {
            this.routePropagatingVirtualGateways = Objects.requireNonNull(routePropagatingVirtualGateways);
            return this;
        }
        public Builder routePropagatingVirtualGateways(GetRouteTableRoutePropagatingVirtualGateway... routePropagatingVirtualGateways) {
            return routePropagatingVirtualGateways(List.of(routePropagatingVirtualGateways));
        }
        @CustomType.Setter
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        @CustomType.Setter
        public Builder routes(List<GetRouteTableRoute> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        public Builder routes(GetRouteTableRoute... routes) {
            return routes(List.of(routes));
        }
        @CustomType.Setter
        public Builder tags(List<GetRouteTableTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetRouteTableTag... tags) {
            return tags(List.of(tags));
        }
        public GetRouteTableResult build() {
            final var o = new GetRouteTableResult();
            o.filters = filters;
            o.id = id;
            o.linkRouteTables = linkRouteTables;
            o.netId = netId;
            o.requestId = requestId;
            o.routePropagatingVirtualGateways = routePropagatingVirtualGateways;
            o.routeTableId = routeTableId;
            o.routes = routes;
            o.tags = tags;
            return o;
        }
    }
}
