// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetPeeringAcceptionStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetPeeringAcceptionStateArgs Empty = new NetPeeringAcceptionStateArgs();

    /**
     * Additional information about the state of the Net peering.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Additional information about the state of the Net peering.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The state of the Net peering (`pending-acceptance` \| `active` \| `rejected` \| `failed` \| `expired` \| `deleted`).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The state of the Net peering (`pending-acceptance` \| `active` \| `rejected` \| `failed` \| `expired` \| `deleted`).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private NetPeeringAcceptionStateArgs() {}

    private NetPeeringAcceptionStateArgs(NetPeeringAcceptionStateArgs $) {
        this.message = $.message;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetPeeringAcceptionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetPeeringAcceptionStateArgs $;

        public Builder() {
            $ = new NetPeeringAcceptionStateArgs();
        }

        public Builder(NetPeeringAcceptionStateArgs defaults) {
            $ = new NetPeeringAcceptionStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param message Additional information about the state of the Net peering.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Additional information about the state of the Net peering.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param name The state of the Net peering (`pending-acceptance` \| `active` \| `rejected` \| `failed` \| `expired` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The state of the Net peering (`pending-acceptance` \| `active` \| `rejected` \| `failed` \| `expired` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public NetPeeringAcceptionStateArgs build() {
            return $;
        }
    }

}