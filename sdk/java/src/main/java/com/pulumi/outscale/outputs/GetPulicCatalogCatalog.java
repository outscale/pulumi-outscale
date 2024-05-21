// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetPulicCatalogCatalogEntry;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPulicCatalogCatalog {
    private List<GetPulicCatalogCatalogEntry> entries;

    private GetPulicCatalogCatalog() {}
    public List<GetPulicCatalogCatalogEntry> entries() {
        return this.entries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPulicCatalogCatalog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPulicCatalogCatalogEntry> entries;
        public Builder() {}
        public Builder(GetPulicCatalogCatalog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entries = defaults.entries;
        }

        @CustomType.Setter
        public Builder entries(List<GetPulicCatalogCatalogEntry> entries) {
            this.entries = Objects.requireNonNull(entries);
            return this;
        }
        public Builder entries(GetPulicCatalogCatalogEntry... entries) {
            return entries(List.of(entries));
        }
        public GetPulicCatalogCatalog build() {
            final var o = new GetPulicCatalogCatalog();
            o.entries = entries;
            return o;
        }
    }
}