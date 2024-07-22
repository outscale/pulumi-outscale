// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.VmNicPrivateIpLinkPublicIpArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VmNicPrivateIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmNicPrivateIpArgs Empty = new VmNicPrivateIpArgs();

    /**
     * If true, the IP is the primary private IP of the NIC.
     * 
     */
    @Import(name="isPrimary")
    private @Nullable Output<Boolean> isPrimary;

    /**
     * @return If true, the IP is the primary private IP of the NIC.
     * 
     */
    public Optional<Output<Boolean>> isPrimary() {
        return Optional.ofNullable(this.isPrimary);
    }

    /**
     * Information about the public IP associated with the NIC.
     * 
     */
    @Import(name="linkPublicIps")
    private @Nullable Output<List<VmNicPrivateIpLinkPublicIpArgs>> linkPublicIps;

    /**
     * @return Information about the public IP associated with the NIC.
     * 
     */
    public Optional<Output<List<VmNicPrivateIpLinkPublicIpArgs>>> linkPublicIps() {
        return Optional.ofNullable(this.linkPublicIps);
    }

    /**
     * The name of the private DNS.
     * 
     */
    @Import(name="privateDnsName")
    private @Nullable Output<String> privateDnsName;

    /**
     * @return The name of the private DNS.
     * 
     */
    public Optional<Output<String>> privateDnsName() {
        return Optional.ofNullable(this.privateDnsName);
    }

    /**
     * The private IP of the NIC.
     * 
     */
    @Import(name="privateIp")
    private @Nullable Output<String> privateIp;

    /**
     * @return The private IP of the NIC.
     * 
     */
    public Optional<Output<String>> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }

    private VmNicPrivateIpArgs() {}

    private VmNicPrivateIpArgs(VmNicPrivateIpArgs $) {
        this.isPrimary = $.isPrimary;
        this.linkPublicIps = $.linkPublicIps;
        this.privateDnsName = $.privateDnsName;
        this.privateIp = $.privateIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmNicPrivateIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmNicPrivateIpArgs $;

        public Builder() {
            $ = new VmNicPrivateIpArgs();
        }

        public Builder(VmNicPrivateIpArgs defaults) {
            $ = new VmNicPrivateIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isPrimary If true, the IP is the primary private IP of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder isPrimary(@Nullable Output<Boolean> isPrimary) {
            $.isPrimary = isPrimary;
            return this;
        }

        /**
         * @param isPrimary If true, the IP is the primary private IP of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder isPrimary(Boolean isPrimary) {
            return isPrimary(Output.of(isPrimary));
        }

        /**
         * @param linkPublicIps Information about the public IP associated with the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIps(@Nullable Output<List<VmNicPrivateIpLinkPublicIpArgs>> linkPublicIps) {
            $.linkPublicIps = linkPublicIps;
            return this;
        }

        /**
         * @param linkPublicIps Information about the public IP associated with the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIps(List<VmNicPrivateIpLinkPublicIpArgs> linkPublicIps) {
            return linkPublicIps(Output.of(linkPublicIps));
        }

        /**
         * @param linkPublicIps Information about the public IP associated with the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIps(VmNicPrivateIpLinkPublicIpArgs... linkPublicIps) {
            return linkPublicIps(List.of(linkPublicIps));
        }

        /**
         * @param privateDnsName The name of the private DNS.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsName(@Nullable Output<String> privateDnsName) {
            $.privateDnsName = privateDnsName;
            return this;
        }

        /**
         * @param privateDnsName The name of the private DNS.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsName(String privateDnsName) {
            return privateDnsName(Output.of(privateDnsName));
        }

        /**
         * @param privateIp The private IP of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder privateIp(@Nullable Output<String> privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        /**
         * @param privateIp The private IP of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder privateIp(String privateIp) {
            return privateIp(Output.of(privateIp));
        }

        public VmNicPrivateIpArgs build() {
            return $;
        }
    }

}
