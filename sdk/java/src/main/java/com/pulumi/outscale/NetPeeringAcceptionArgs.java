// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NetPeeringAcceptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetPeeringAcceptionArgs Empty = new NetPeeringAcceptionArgs();

    /**
     * The ID of the Net peering you want to accept.
     * 
     */
    @Import(name="netPeeringId", required=true)
    private Output<String> netPeeringId;

    /**
     * @return The ID of the Net peering you want to accept.
     * 
     */
    public Output<String> netPeeringId() {
        return this.netPeeringId;
    }

    private NetPeeringAcceptionArgs() {}

    private NetPeeringAcceptionArgs(NetPeeringAcceptionArgs $) {
        this.netPeeringId = $.netPeeringId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetPeeringAcceptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetPeeringAcceptionArgs $;

        public Builder() {
            $ = new NetPeeringAcceptionArgs();
        }

        public Builder(NetPeeringAcceptionArgs defaults) {
            $ = new NetPeeringAcceptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param netPeeringId The ID of the Net peering you want to accept.
         * 
         * @return builder
         * 
         */
        public Builder netPeeringId(Output<String> netPeeringId) {
            $.netPeeringId = netPeeringId;
            return this;
        }

        /**
         * @param netPeeringId The ID of the Net peering you want to accept.
         * 
         * @return builder
         * 
         */
        public Builder netPeeringId(String netPeeringId) {
            return netPeeringId(Output.of(netPeeringId));
        }

        public NetPeeringAcceptionArgs build() {
            $.netPeeringId = Objects.requireNonNull($.netPeeringId, "expected parameter 'netPeeringId' to be non-null");
            return $;
        }
    }

}
