// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.InternetServiceTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InternetServiceState extends com.pulumi.resources.ResourceArgs {

    public static final InternetServiceState Empty = new InternetServiceState();

    /**
     * The ID of the Internet service.
     * 
     */
    @Import(name="internetServiceId")
    private @Nullable Output<String> internetServiceId;

    /**
     * @return The ID of the Internet service.
     * 
     */
    public Optional<Output<String>> internetServiceId() {
        return Optional.ofNullable(this.internetServiceId);
    }

    /**
     * The ID of the Net attached to the Internet service.
     * 
     */
    @Import(name="netId")
    private @Nullable Output<String> netId;

    /**
     * @return The ID of the Net attached to the Internet service.
     * 
     */
    public Optional<Output<String>> netId() {
        return Optional.ofNullable(this.netId);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The state of the attachment of the Internet service to the Net (always `available`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the attachment of the Internet service to the Net (always `available`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<InternetServiceTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<InternetServiceTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private InternetServiceState() {}

    private InternetServiceState(InternetServiceState $) {
        this.internetServiceId = $.internetServiceId;
        this.netId = $.netId;
        this.requestId = $.requestId;
        this.state = $.state;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InternetServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InternetServiceState $;

        public Builder() {
            $ = new InternetServiceState();
        }

        public Builder(InternetServiceState defaults) {
            $ = new InternetServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param internetServiceId The ID of the Internet service.
         * 
         * @return builder
         * 
         */
        public Builder internetServiceId(@Nullable Output<String> internetServiceId) {
            $.internetServiceId = internetServiceId;
            return this;
        }

        /**
         * @param internetServiceId The ID of the Internet service.
         * 
         * @return builder
         * 
         */
        public Builder internetServiceId(String internetServiceId) {
            return internetServiceId(Output.of(internetServiceId));
        }

        /**
         * @param netId The ID of the Net attached to the Internet service.
         * 
         * @return builder
         * 
         */
        public Builder netId(@Nullable Output<String> netId) {
            $.netId = netId;
            return this;
        }

        /**
         * @param netId The ID of the Net attached to the Internet service.
         * 
         * @return builder
         * 
         */
        public Builder netId(String netId) {
            return netId(Output.of(netId));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param state The state of the attachment of the Internet service to the Net (always `available`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the attachment of the Internet service to the Net (always `available`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<InternetServiceTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<InternetServiceTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(InternetServiceTagArgs... tags) {
            return tags(List.of(tags));
        }

        public InternetServiceState build() {
            return $;
        }
    }

}