// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NicPrivateIpLinkPublicIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final NicPrivateIpLinkPublicIpArgs Empty = new NicPrivateIpLinkPublicIpArgs();

    /**
     * (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
     * 
     */
    @Import(name="linkPublicIpId")
    private @Nullable Output<String> linkPublicIpId;

    /**
     * @return (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
     * 
     */
    public Optional<Output<String>> linkPublicIpId() {
        return Optional.ofNullable(this.linkPublicIpId);
    }

    /**
     * The name of the public DNS.
     * 
     */
    @Import(name="publicDnsName")
    private @Nullable Output<String> publicDnsName;

    /**
     * @return The name of the public DNS.
     * 
     */
    public Optional<Output<String>> publicDnsName() {
        return Optional.ofNullable(this.publicDnsName);
    }

    /**
     * The public IP associated with the NIC.
     * 
     */
    @Import(name="publicIp")
    private @Nullable Output<String> publicIp;

    /**
     * @return The public IP associated with the NIC.
     * 
     */
    public Optional<Output<String>> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }

    /**
     * The account ID of the owner of the public IP.
     * 
     */
    @Import(name="publicIpAccountId")
    private @Nullable Output<String> publicIpAccountId;

    /**
     * @return The account ID of the owner of the public IP.
     * 
     */
    public Optional<Output<String>> publicIpAccountId() {
        return Optional.ofNullable(this.publicIpAccountId);
    }

    /**
     * The allocation ID of the public IP.
     * 
     */
    @Import(name="publicIpId")
    private @Nullable Output<String> publicIpId;

    /**
     * @return The allocation ID of the public IP.
     * 
     */
    public Optional<Output<String>> publicIpId() {
        return Optional.ofNullable(this.publicIpId);
    }

    private NicPrivateIpLinkPublicIpArgs() {}

    private NicPrivateIpLinkPublicIpArgs(NicPrivateIpLinkPublicIpArgs $) {
        this.linkPublicIpId = $.linkPublicIpId;
        this.publicDnsName = $.publicDnsName;
        this.publicIp = $.publicIp;
        this.publicIpAccountId = $.publicIpAccountId;
        this.publicIpId = $.publicIpId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NicPrivateIpLinkPublicIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NicPrivateIpLinkPublicIpArgs $;

        public Builder() {
            $ = new NicPrivateIpLinkPublicIpArgs();
        }

        public Builder(NicPrivateIpLinkPublicIpArgs defaults) {
            $ = new NicPrivateIpLinkPublicIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkPublicIpId (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIpId(@Nullable Output<String> linkPublicIpId) {
            $.linkPublicIpId = linkPublicIpId;
            return this;
        }

        /**
         * @param linkPublicIpId (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIpId(String linkPublicIpId) {
            return linkPublicIpId(Output.of(linkPublicIpId));
        }

        /**
         * @param publicDnsName The name of the public DNS.
         * 
         * @return builder
         * 
         */
        public Builder publicDnsName(@Nullable Output<String> publicDnsName) {
            $.publicDnsName = publicDnsName;
            return this;
        }

        /**
         * @param publicDnsName The name of the public DNS.
         * 
         * @return builder
         * 
         */
        public Builder publicDnsName(String publicDnsName) {
            return publicDnsName(Output.of(publicDnsName));
        }

        /**
         * @param publicIp The public IP associated with the NIC.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(@Nullable Output<String> publicIp) {
            $.publicIp = publicIp;
            return this;
        }

        /**
         * @param publicIp The public IP associated with the NIC.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(String publicIp) {
            return publicIp(Output.of(publicIp));
        }

        /**
         * @param publicIpAccountId The account ID of the owner of the public IP.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAccountId(@Nullable Output<String> publicIpAccountId) {
            $.publicIpAccountId = publicIpAccountId;
            return this;
        }

        /**
         * @param publicIpAccountId The account ID of the owner of the public IP.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAccountId(String publicIpAccountId) {
            return publicIpAccountId(Output.of(publicIpAccountId));
        }

        /**
         * @param publicIpId The allocation ID of the public IP.
         * 
         * @return builder
         * 
         */
        public Builder publicIpId(@Nullable Output<String> publicIpId) {
            $.publicIpId = publicIpId;
            return this;
        }

        /**
         * @param publicIpId The allocation ID of the public IP.
         * 
         * @return builder
         * 
         */
        public Builder publicIpId(String publicIpId) {
            return publicIpId(Output.of(publicIpId));
        }

        public NicPrivateIpLinkPublicIpArgs build() {
            return $;
        }
    }

}
