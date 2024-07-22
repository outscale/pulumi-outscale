// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVmNicLinkPublicIp {
    /**
     * @return The name of the public DNS.
     * 
     */
    private String publicDnsName;
    /**
     * @return The public IP of the VM.
     * 
     */
    private String publicIp;
    /**
     * @return The account ID of the owner of the public IP.
     * 
     */
    private String publicIpAccountId;

    private GetVmNicLinkPublicIp() {}
    /**
     * @return The name of the public DNS.
     * 
     */
    public String publicDnsName() {
        return this.publicDnsName;
    }
    /**
     * @return The public IP of the VM.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    /**
     * @return The account ID of the owner of the public IP.
     * 
     */
    public String publicIpAccountId() {
        return this.publicIpAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmNicLinkPublicIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String publicDnsName;
        private String publicIp;
        private String publicIpAccountId;
        public Builder() {}
        public Builder(GetVmNicLinkPublicIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicDnsName = defaults.publicDnsName;
    	      this.publicIp = defaults.publicIp;
    	      this.publicIpAccountId = defaults.publicIpAccountId;
        }

        @CustomType.Setter
        public Builder publicDnsName(String publicDnsName) {
            this.publicDnsName = Objects.requireNonNull(publicDnsName);
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAccountId(String publicIpAccountId) {
            this.publicIpAccountId = Objects.requireNonNull(publicIpAccountId);
            return this;
        }
        public GetVmNicLinkPublicIp build() {
            final var o = new GetVmNicLinkPublicIp();
            o.publicDnsName = publicDnsName;
            o.publicIp = publicIp;
            o.publicIpAccountId = publicIpAccountId;
            return o;
        }
    }
}
