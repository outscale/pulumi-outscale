// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NatServicePublicIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final NatServicePublicIpArgs Empty = new NatServicePublicIpArgs();

    /**
     * The public IP associated with the NAT service.
     * 
     */
    @Import(name="publicIp")
    private @Nullable Output<String> publicIp;

    /**
     * @return The public IP associated with the NAT service.
     * 
     */
    public Optional<Output<String>> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }

    /**
     * The allocation ID of the public IP to associate with the NAT service.&lt;br /&gt;
     * If the public IP is already associated with another resource, you must first disassociate it.
     * 
     */
    @Import(name="publicIpId")
    private @Nullable Output<String> publicIpId;

    /**
     * @return The allocation ID of the public IP to associate with the NAT service.&lt;br /&gt;
     * If the public IP is already associated with another resource, you must first disassociate it.
     * 
     */
    public Optional<Output<String>> publicIpId() {
        return Optional.ofNullable(this.publicIpId);
    }

    private NatServicePublicIpArgs() {}

    private NatServicePublicIpArgs(NatServicePublicIpArgs $) {
        this.publicIp = $.publicIp;
        this.publicIpId = $.publicIpId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NatServicePublicIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NatServicePublicIpArgs $;

        public Builder() {
            $ = new NatServicePublicIpArgs();
        }

        public Builder(NatServicePublicIpArgs defaults) {
            $ = new NatServicePublicIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicIp The public IP associated with the NAT service.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(@Nullable Output<String> publicIp) {
            $.publicIp = publicIp;
            return this;
        }

        /**
         * @param publicIp The public IP associated with the NAT service.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(String publicIp) {
            return publicIp(Output.of(publicIp));
        }

        /**
         * @param publicIpId The allocation ID of the public IP to associate with the NAT service.&lt;br /&gt;
         * If the public IP is already associated with another resource, you must first disassociate it.
         * 
         * @return builder
         * 
         */
        public Builder publicIpId(@Nullable Output<String> publicIpId) {
            $.publicIpId = publicIpId;
            return this;
        }

        /**
         * @param publicIpId The allocation ID of the public IP to associate with the NAT service.&lt;br /&gt;
         * If the public IP is already associated with another resource, you must first disassociate it.
         * 
         * @return builder
         * 
         */
        public Builder publicIpId(String publicIpId) {
            return publicIpId(Output.of(publicIpId));
        }

        public NatServicePublicIpArgs build() {
            return $;
        }
    }

}
