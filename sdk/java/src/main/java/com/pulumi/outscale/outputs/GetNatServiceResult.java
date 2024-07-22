// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetNatServiceFilter;
import com.pulumi.outscale.outputs.GetNatServicePublicIp;
import com.pulumi.outscale.outputs.GetNatServiceTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNatServiceResult {
    private @Nullable List<GetNatServiceFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The ID of the NAT service.
     * 
     */
    private @Nullable String natServiceId;
    /**
     * @return The ID of the Net in which the NAT service is.
     * 
     */
    private String netId;
    /**
     * @return Information about the public IP or IPs associated with the NAT service.
     * 
     */
    private List<GetNatServicePublicIp> publicIps;
    private String requestId;
    /**
     * @return The state of the NAT service (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    private String state;
    /**
     * @return The ID of the Subnet in which the NAT service is.
     * 
     */
    private String subnetId;
    /**
     * @return One or more tags associated with the NAT service.
     * 
     */
    private List<GetNatServiceTag> tags;

    private GetNatServiceResult() {}
    public List<GetNatServiceFilter> filters() {
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
     * @return The ID of the NAT service.
     * 
     */
    public Optional<String> natServiceId() {
        return Optional.ofNullable(this.natServiceId);
    }
    /**
     * @return The ID of the Net in which the NAT service is.
     * 
     */
    public String netId() {
        return this.netId;
    }
    /**
     * @return Information about the public IP or IPs associated with the NAT service.
     * 
     */
    public List<GetNatServicePublicIp> publicIps() {
        return this.publicIps;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return The state of the NAT service (`pending` \| `available` \| `deleting` \| `deleted`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The ID of the Subnet in which the NAT service is.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return One or more tags associated with the NAT service.
     * 
     */
    public List<GetNatServiceTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetNatServiceFilter> filters;
        private String id;
        private @Nullable String natServiceId;
        private String netId;
        private List<GetNatServicePublicIp> publicIps;
        private String requestId;
        private String state;
        private String subnetId;
        private List<GetNatServiceTag> tags;
        public Builder() {}
        public Builder(GetNatServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.natServiceId = defaults.natServiceId;
    	      this.netId = defaults.netId;
    	      this.publicIps = defaults.publicIps;
    	      this.requestId = defaults.requestId;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetNatServiceFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNatServiceFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder natServiceId(@Nullable String natServiceId) {
            this.natServiceId = natServiceId;
            return this;
        }
        @CustomType.Setter
        public Builder netId(String netId) {
            this.netId = Objects.requireNonNull(netId);
            return this;
        }
        @CustomType.Setter
        public Builder publicIps(List<GetNatServicePublicIp> publicIps) {
            this.publicIps = Objects.requireNonNull(publicIps);
            return this;
        }
        public Builder publicIps(GetNatServicePublicIp... publicIps) {
            return publicIps(List.of(publicIps));
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetNatServiceTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetNatServiceTag... tags) {
            return tags(List.of(tags));
        }
        public GetNatServiceResult build() {
            final var o = new GetNatServiceResult();
            o.filters = filters;
            o.id = id;
            o.natServiceId = natServiceId;
            o.netId = netId;
            o.publicIps = publicIps;
            o.requestId = requestId;
            o.state = state;
            o.subnetId = subnetId;
            o.tags = tags;
            return o;
        }
    }
}
