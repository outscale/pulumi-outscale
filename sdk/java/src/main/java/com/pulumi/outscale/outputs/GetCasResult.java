// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetCasCa;
import com.pulumi.outscale.outputs.GetCasFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCasResult {
    /**
     * @return Information about one or more CAs.
     * 
     */
    private List<GetCasCa> cas;
    private @Nullable List<GetCasFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String requestId;

    private GetCasResult() {}
    /**
     * @return Information about one or more CAs.
     * 
     */
    public List<GetCasCa> cas() {
        return this.cas;
    }
    public List<GetCasFilter> filters() {
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

    public static Builder builder(GetCasResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCasCa> cas;
        private @Nullable List<GetCasFilter> filters;
        private String id;
        private String requestId;
        public Builder() {}
        public Builder(GetCasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cas = defaults.cas;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder cas(List<GetCasCa> cas) {
            this.cas = Objects.requireNonNull(cas);
            return this;
        }
        public Builder cas(GetCasCa... cas) {
            return cas(List.of(cas));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetCasFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetCasFilter... filters) {
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
        public GetCasResult build() {
            final var o = new GetCasResult();
            o.cas = cas;
            o.filters = filters;
            o.id = id;
            o.requestId = requestId;
            return o;
        }
    }
}
