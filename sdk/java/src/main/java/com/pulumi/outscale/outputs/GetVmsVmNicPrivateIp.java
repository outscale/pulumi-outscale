// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetVmsVmNicPrivateIpLinkPublicIp;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVmsVmNicPrivateIp {
    /**
     * @return If true, the IP is the primary private IP of the NIC.
     * 
     */
    private Boolean isPrimary;
    /**
     * @return Information about the public IP associated with the NIC.
     * 
     */
    private List<GetVmsVmNicPrivateIpLinkPublicIp> linkPublicIps;
    /**
     * @return The name of the private DNS.
     * 
     */
    private String privateDnsName;
    /**
     * @return The primary private IP of the VM.
     * 
     */
    private String privateIp;

    private GetVmsVmNicPrivateIp() {}
    /**
     * @return If true, the IP is the primary private IP of the NIC.
     * 
     */
    public Boolean isPrimary() {
        return this.isPrimary;
    }
    /**
     * @return Information about the public IP associated with the NIC.
     * 
     */
    public List<GetVmsVmNicPrivateIpLinkPublicIp> linkPublicIps() {
        return this.linkPublicIps;
    }
    /**
     * @return The name of the private DNS.
     * 
     */
    public String privateDnsName() {
        return this.privateDnsName;
    }
    /**
     * @return The primary private IP of the VM.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmsVmNicPrivateIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean isPrimary;
        private List<GetVmsVmNicPrivateIpLinkPublicIp> linkPublicIps;
        private String privateDnsName;
        private String privateIp;
        public Builder() {}
        public Builder(GetVmsVmNicPrivateIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPrimary = defaults.isPrimary;
    	      this.linkPublicIps = defaults.linkPublicIps;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateIp = defaults.privateIp;
        }

        @CustomType.Setter
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = Objects.requireNonNull(isPrimary);
            return this;
        }
        @CustomType.Setter
        public Builder linkPublicIps(List<GetVmsVmNicPrivateIpLinkPublicIp> linkPublicIps) {
            this.linkPublicIps = Objects.requireNonNull(linkPublicIps);
            return this;
        }
        public Builder linkPublicIps(GetVmsVmNicPrivateIpLinkPublicIp... linkPublicIps) {
            return linkPublicIps(List.of(linkPublicIps));
        }
        @CustomType.Setter
        public Builder privateDnsName(String privateDnsName) {
            this.privateDnsName = Objects.requireNonNull(privateDnsName);
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public GetVmsVmNicPrivateIp build() {
            final var o = new GetVmsVmNicPrivateIp();
            o.isPrimary = isPrimary;
            o.linkPublicIps = linkPublicIps;
            o.privateDnsName = privateDnsName;
            o.privateIp = privateIp;
            return o;
        }
    }
}
