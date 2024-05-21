// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InternetServiceLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final InternetServiceLinkArgs Empty = new InternetServiceLinkArgs();

    /**
     * The ID of the Internet service you want to attach.
     * 
     */
    @Import(name="internetServiceId", required=true)
    private Output<String> internetServiceId;

    /**
     * @return The ID of the Internet service you want to attach.
     * 
     */
    public Output<String> internetServiceId() {
        return this.internetServiceId;
    }

    /**
     * The ID of the Net to which you want to attach the Internet service.
     * 
     */
    @Import(name="netId", required=true)
    private Output<String> netId;

    /**
     * @return The ID of the Net to which you want to attach the Internet service.
     * 
     */
    public Output<String> netId() {
        return this.netId;
    }

    private InternetServiceLinkArgs() {}

    private InternetServiceLinkArgs(InternetServiceLinkArgs $) {
        this.internetServiceId = $.internetServiceId;
        this.netId = $.netId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InternetServiceLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InternetServiceLinkArgs $;

        public Builder() {
            $ = new InternetServiceLinkArgs();
        }

        public Builder(InternetServiceLinkArgs defaults) {
            $ = new InternetServiceLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param internetServiceId The ID of the Internet service you want to attach.
         * 
         * @return builder
         * 
         */
        public Builder internetServiceId(Output<String> internetServiceId) {
            $.internetServiceId = internetServiceId;
            return this;
        }

        /**
         * @param internetServiceId The ID of the Internet service you want to attach.
         * 
         * @return builder
         * 
         */
        public Builder internetServiceId(String internetServiceId) {
            return internetServiceId(Output.of(internetServiceId));
        }

        /**
         * @param netId The ID of the Net to which you want to attach the Internet service.
         * 
         * @return builder
         * 
         */
        public Builder netId(Output<String> netId) {
            $.netId = netId;
            return this;
        }

        /**
         * @param netId The ID of the Net to which you want to attach the Internet service.
         * 
         * @return builder
         * 
         */
        public Builder netId(String netId) {
            return netId(Output.of(netId));
        }

        public InternetServiceLinkArgs build() {
            $.internetServiceId = Objects.requireNonNull($.internetServiceId, "expected parameter 'internetServiceId' to be non-null");
            $.netId = Objects.requireNonNull($.netId, "expected parameter 'netId' to be non-null");
            return $;
        }
    }

}