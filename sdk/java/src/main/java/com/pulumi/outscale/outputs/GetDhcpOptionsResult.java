// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetDhcpOptionsDhcpOption;
import com.pulumi.outscale.outputs.GetDhcpOptionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDhcpOptionsResult {
    private List<GetDhcpOptionsDhcpOption> dhcpOptions;
    private List<String> dhcpOptionsSetIds;
    private @Nullable List<GetDhcpOptionsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String requestId;

    private GetDhcpOptionsResult() {}
    public List<GetDhcpOptionsDhcpOption> dhcpOptions() {
        return this.dhcpOptions;
    }
    public List<String> dhcpOptionsSetIds() {
        return this.dhcpOptionsSetIds;
    }
    public List<GetDhcpOptionsFilter> filters() {
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

    public static Builder builder(GetDhcpOptionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDhcpOptionsDhcpOption> dhcpOptions;
        private List<String> dhcpOptionsSetIds;
        private @Nullable List<GetDhcpOptionsFilter> filters;
        private String id;
        private String requestId;
        public Builder() {}
        public Builder(GetDhcpOptionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhcpOptions = defaults.dhcpOptions;
    	      this.dhcpOptionsSetIds = defaults.dhcpOptionsSetIds;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder dhcpOptions(List<GetDhcpOptionsDhcpOption> dhcpOptions) {
            this.dhcpOptions = Objects.requireNonNull(dhcpOptions);
            return this;
        }
        public Builder dhcpOptions(GetDhcpOptionsDhcpOption... dhcpOptions) {
            return dhcpOptions(List.of(dhcpOptions));
        }
        @CustomType.Setter
        public Builder dhcpOptionsSetIds(List<String> dhcpOptionsSetIds) {
            this.dhcpOptionsSetIds = Objects.requireNonNull(dhcpOptionsSetIds);
            return this;
        }
        public Builder dhcpOptionsSetIds(String... dhcpOptionsSetIds) {
            return dhcpOptionsSetIds(List.of(dhcpOptionsSetIds));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetDhcpOptionsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetDhcpOptionsFilter... filters) {
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
        public GetDhcpOptionsResult build() {
            final var o = new GetDhcpOptionsResult();
            o.dhcpOptions = dhcpOptions;
            o.dhcpOptionsSetIds = dhcpOptionsSetIds;
            o.filters = filters;
            o.id = id;
            o.requestId = requestId;
            return o;
        }
    }
}
