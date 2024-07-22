// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetNetAccessPointsFilter;
import com.pulumi.outscale.outputs.GetNetAccessPointsNetAccessPoint;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNetAccessPointsResult {
    private @Nullable List<GetNetAccessPointsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return One or more Net access points.
     * 
     */
    private List<GetNetAccessPointsNetAccessPoint> netAccessPoints;
    private String requestId;

    private GetNetAccessPointsResult() {}
    public List<GetNetAccessPointsFilter> filters() {
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
     * @return One or more Net access points.
     * 
     */
    public List<GetNetAccessPointsNetAccessPoint> netAccessPoints() {
        return this.netAccessPoints;
    }
    public String requestId() {
        return this.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetAccessPointsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetNetAccessPointsFilter> filters;
        private String id;
        private List<GetNetAccessPointsNetAccessPoint> netAccessPoints;
        private String requestId;
        public Builder() {}
        public Builder(GetNetAccessPointsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.netAccessPoints = defaults.netAccessPoints;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetNetAccessPointsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNetAccessPointsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder netAccessPoints(List<GetNetAccessPointsNetAccessPoint> netAccessPoints) {
            this.netAccessPoints = Objects.requireNonNull(netAccessPoints);
            return this;
        }
        public Builder netAccessPoints(GetNetAccessPointsNetAccessPoint... netAccessPoints) {
            return netAccessPoints(List.of(netAccessPoints));
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        public GetNetAccessPointsResult build() {
            final var o = new GetNetAccessPointsResult();
            o.filters = filters;
            o.id = id;
            o.netAccessPoints = netAccessPoints;
            o.requestId = requestId;
            return o;
        }
    }
}
