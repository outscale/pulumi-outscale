// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNatServicePublicIp {
    /**
     * @return The public IP associated with the NAT service.
     * 
     */
    private String publicIp;
    /**
     * @return The allocation ID of the public IP associated with the NAT service.
     * 
     */
    private String publicIpId;

    private GetNatServicePublicIp() {}
    /**
     * @return The public IP associated with the NAT service.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    /**
     * @return The allocation ID of the public IP associated with the NAT service.
     * 
     */
    public String publicIpId() {
        return this.publicIpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatServicePublicIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String publicIp;
        private String publicIpId;
        public Builder() {}
        public Builder(GetNatServicePublicIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIp = defaults.publicIp;
    	      this.publicIpId = defaults.publicIpId;
        }

        @CustomType.Setter
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpId(String publicIpId) {
            this.publicIpId = Objects.requireNonNull(publicIpId);
            return this;
        }
        public GetNatServicePublicIp build() {
            final var o = new GetNatServicePublicIp();
            o.publicIp = publicIp;
            o.publicIpId = publicIpId;
            return o;
        }
    }
}
