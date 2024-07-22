// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetNetsFilter;
import com.pulumi.outscale.outputs.GetNetsNet;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNetsResult {
    private @Nullable List<GetNetsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The ID of the Net.
     * 
     */
    private @Nullable List<String> netIds;
    /**
     * @return Information about the described Nets.
     * 
     */
    private List<GetNetsNet> nets;
    private String requestId;

    private GetNetsResult() {}
    public List<GetNetsFilter> filters() {
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
     * @return The ID of the Net.
     * 
     */
    public List<String> netIds() {
        return this.netIds == null ? List.of() : this.netIds;
    }
    /**
     * @return Information about the described Nets.
     * 
     */
    public List<GetNetsNet> nets() {
        return this.nets;
    }
    public String requestId() {
        return this.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetNetsFilter> filters;
        private String id;
        private @Nullable List<String> netIds;
        private List<GetNetsNet> nets;
        private String requestId;
        public Builder() {}
        public Builder(GetNetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.netIds = defaults.netIds;
    	      this.nets = defaults.nets;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetNetsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNetsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder netIds(@Nullable List<String> netIds) {
            this.netIds = netIds;
            return this;
        }
        public Builder netIds(String... netIds) {
            return netIds(List.of(netIds));
        }
        @CustomType.Setter
        public Builder nets(List<GetNetsNet> nets) {
            this.nets = Objects.requireNonNull(nets);
            return this;
        }
        public Builder nets(GetNetsNet... nets) {
            return nets(List.of(nets));
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        public GetNetsResult build() {
            final var o = new GetNetsResult();
            o.filters = filters;
            o.id = id;
            o.netIds = netIds;
            o.nets = nets;
            o.requestId = requestId;
            return o;
        }
    }
}
