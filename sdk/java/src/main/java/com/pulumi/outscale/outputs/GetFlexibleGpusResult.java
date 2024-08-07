// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetFlexibleGpusFilter;
import com.pulumi.outscale.outputs.GetFlexibleGpusFlexibleGpus;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetFlexibleGpusResult {
    private @Nullable List<GetFlexibleGpusFilter> filters;
    /**
     * @return Information about one or more fGPUs.
     * 
     */
    private List<GetFlexibleGpusFlexibleGpus> flexibleGpuses;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String requestId;

    private GetFlexibleGpusResult() {}
    public List<GetFlexibleGpusFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Information about one or more fGPUs.
     * 
     */
    public List<GetFlexibleGpusFlexibleGpus> flexibleGpuses() {
        return this.flexibleGpuses;
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

    public static Builder builder(GetFlexibleGpusResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetFlexibleGpusFilter> filters;
        private List<GetFlexibleGpusFlexibleGpus> flexibleGpuses;
        private String id;
        private String requestId;
        public Builder() {}
        public Builder(GetFlexibleGpusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.flexibleGpuses = defaults.flexibleGpuses;
    	      this.id = defaults.id;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetFlexibleGpusFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetFlexibleGpusFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder flexibleGpuses(List<GetFlexibleGpusFlexibleGpus> flexibleGpuses) {
            this.flexibleGpuses = Objects.requireNonNull(flexibleGpuses);
            return this;
        }
        public Builder flexibleGpuses(GetFlexibleGpusFlexibleGpus... flexibleGpuses) {
            return flexibleGpuses(List.of(flexibleGpuses));
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
        public GetFlexibleGpusResult build() {
            final var o = new GetFlexibleGpusResult();
            o.filters = filters;
            o.flexibleGpuses = flexibleGpuses;
            o.id = id;
            o.requestId = requestId;
            return o;
        }
    }
}
