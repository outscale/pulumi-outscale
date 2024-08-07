// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetPeeringAcceptionAccepterNetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetPeeringAcceptionAccepterNetArgs Empty = new NetPeeringAcceptionAccepterNetArgs();

    /**
     * The account ID of the owner of the source Net.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account ID of the owner of the source Net.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The IP range for the source Net, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    /**
     * @return The IP range for the source Net, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    /**
     * The ID of the source Net.
     * 
     */
    @Import(name="netId")
    private @Nullable Output<String> netId;

    /**
     * @return The ID of the source Net.
     * 
     */
    public Optional<Output<String>> netId() {
        return Optional.ofNullable(this.netId);
    }

    private NetPeeringAcceptionAccepterNetArgs() {}

    private NetPeeringAcceptionAccepterNetArgs(NetPeeringAcceptionAccepterNetArgs $) {
        this.accountId = $.accountId;
        this.ipRange = $.ipRange;
        this.netId = $.netId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetPeeringAcceptionAccepterNetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetPeeringAcceptionAccepterNetArgs $;

        public Builder() {
            $ = new NetPeeringAcceptionAccepterNetArgs();
        }

        public Builder(NetPeeringAcceptionAccepterNetArgs defaults) {
            $ = new NetPeeringAcceptionAccepterNetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID of the owner of the source Net.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID of the owner of the source Net.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param ipRange The IP range for the source Net, in CIDR notation (for example, `10.0.0.0/16`).
         * 
         * @return builder
         * 
         */
        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange The IP range for the source Net, in CIDR notation (for example, `10.0.0.0/16`).
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        /**
         * @param netId The ID of the source Net.
         * 
         * @return builder
         * 
         */
        public Builder netId(@Nullable Output<String> netId) {
            $.netId = netId;
            return this;
        }

        /**
         * @param netId The ID of the source Net.
         * 
         * @return builder
         * 
         */
        public Builder netId(String netId) {
            return netId(Output.of(netId));
        }

        public NetPeeringAcceptionAccepterNetArgs build() {
            return $;
        }
    }

}
