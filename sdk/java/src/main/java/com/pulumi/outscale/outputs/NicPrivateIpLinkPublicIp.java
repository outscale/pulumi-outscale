// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NicPrivateIpLinkPublicIp {
    /**
     * @return (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
     * 
     */
    private @Nullable String linkPublicIpId;
    /**
     * @return The name of the public DNS.
     * 
     */
    private @Nullable String publicDnsName;
    /**
     * @return The public IP associated with the NIC.
     * 
     */
    private @Nullable String publicIp;
    /**
     * @return The account ID of the owner of the public IP.
     * 
     */
    private @Nullable String publicIpAccountId;
    /**
     * @return The allocation ID of the public IP.
     * 
     */
    private @Nullable String publicIpId;

    private NicPrivateIpLinkPublicIp() {}
    /**
     * @return (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
     * 
     */
    public Optional<String> linkPublicIpId() {
        return Optional.ofNullable(this.linkPublicIpId);
    }
    /**
     * @return The name of the public DNS.
     * 
     */
    public Optional<String> publicDnsName() {
        return Optional.ofNullable(this.publicDnsName);
    }
    /**
     * @return The public IP associated with the NIC.
     * 
     */
    public Optional<String> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }
    /**
     * @return The account ID of the owner of the public IP.
     * 
     */
    public Optional<String> publicIpAccountId() {
        return Optional.ofNullable(this.publicIpAccountId);
    }
    /**
     * @return The allocation ID of the public IP.
     * 
     */
    public Optional<String> publicIpId() {
        return Optional.ofNullable(this.publicIpId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NicPrivateIpLinkPublicIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String linkPublicIpId;
        private @Nullable String publicDnsName;
        private @Nullable String publicIp;
        private @Nullable String publicIpAccountId;
        private @Nullable String publicIpId;
        public Builder() {}
        public Builder(NicPrivateIpLinkPublicIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkPublicIpId = defaults.linkPublicIpId;
    	      this.publicDnsName = defaults.publicDnsName;
    	      this.publicIp = defaults.publicIp;
    	      this.publicIpAccountId = defaults.publicIpAccountId;
    	      this.publicIpId = defaults.publicIpId;
        }

        @CustomType.Setter
        public Builder linkPublicIpId(@Nullable String linkPublicIpId) {
            this.linkPublicIpId = linkPublicIpId;
            return this;
        }
        @CustomType.Setter
        public Builder publicDnsName(@Nullable String publicDnsName) {
            this.publicDnsName = publicDnsName;
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(@Nullable String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAccountId(@Nullable String publicIpAccountId) {
            this.publicIpAccountId = publicIpAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpId(@Nullable String publicIpId) {
            this.publicIpId = publicIpId;
            return this;
        }
        public NicPrivateIpLinkPublicIp build() {
            final var o = new NicPrivateIpLinkPublicIp();
            o.linkPublicIpId = linkPublicIpId;
            o.publicDnsName = publicDnsName;
            o.publicIp = publicIp;
            o.publicIpAccountId = publicIpAccountId;
            o.publicIpId = publicIpId;
            return o;
        }
    }
}