// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetCaFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCaResult {
    /**
     * @return The fingerprint of the CA.
     * 
     */
    private String caFingerprint;
    /**
     * @return The ID of the CA.
     * 
     */
    private String caId;
    private String caPem;
    /**
     * @return The description of the CA.
     * 
     */
    private String description;
    private @Nullable List<GetCaFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String requestId;

    private GetCaResult() {}
    /**
     * @return The fingerprint of the CA.
     * 
     */
    public String caFingerprint() {
        return this.caFingerprint;
    }
    /**
     * @return The ID of the CA.
     * 
     */
    public String caId() {
        return this.caId;
    }
    public String caPem() {
        return this.caPem;
    }
    /**
     * @return The description of the CA.
     * 
     */
    public String description() {
        return this.description;
    }
    public List<GetCaFilter> filters() {
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

    public static Builder builder(GetCaResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String caFingerprint;
        private String caId;
        private String caPem;
        private String description;
        private @Nullable List<GetCaFilter> filters;
        private String id;
        private String requestId;
        public Builder() {}
        public Builder(GetCaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caFingerprint = defaults.caFingerprint;
    	      this.caId = defaults.caId;
    	      this.caPem = defaults.caPem;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder caFingerprint(String caFingerprint) {
            this.caFingerprint = Objects.requireNonNull(caFingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder caId(String caId) {
            this.caId = Objects.requireNonNull(caId);
            return this;
        }
        @CustomType.Setter
        public Builder caPem(String caPem) {
            this.caPem = Objects.requireNonNull(caPem);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetCaFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetCaFilter... filters) {
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
        public GetCaResult build() {
            final var o = new GetCaResult();
            o.caFingerprint = caFingerprint;
            o.caId = caId;
            o.caPem = caPem;
            o.description = description;
            o.filters = filters;
            o.id = id;
            o.requestId = requestId;
            return o;
        }
    }
}