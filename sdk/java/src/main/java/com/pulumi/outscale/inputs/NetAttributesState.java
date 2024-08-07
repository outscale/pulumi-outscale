// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.NetAttributesTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetAttributesState extends com.pulumi.resources.ResourceArgs {

    public static final NetAttributesState Empty = new NetAttributesState();

    /**
     * The ID of the DHCP options set (or `default` if you want to associate the default one).
     * 
     */
    @Import(name="dhcpOptionsSetId")
    private @Nullable Output<String> dhcpOptionsSetId;

    /**
     * @return The ID of the DHCP options set (or `default` if you want to associate the default one).
     * 
     */
    public Optional<Output<String>> dhcpOptionsSetId() {
        return Optional.ofNullable(this.dhcpOptionsSetId);
    }

    /**
     * The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    /**
     * @return The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    /**
     * The ID of the Net.
     * 
     */
    @Import(name="netId")
    private @Nullable Output<String> netId;

    /**
     * @return The ID of the Net.
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
     * The state of the Net (`pending` \| `available` \| `deleted`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the Net (`pending` \| `available` \| `deleted`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * One or more tags associated with the Net.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<NetAttributesTagArgs>> tags;

    /**
     * @return One or more tags associated with the Net.
     * 
     */
    public Optional<Output<List<NetAttributesTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The VM tenancy in a Net.
     * 
     */
    @Import(name="tenancy")
    private @Nullable Output<String> tenancy;

    /**
     * @return The VM tenancy in a Net.
     * 
     */
    public Optional<Output<String>> tenancy() {
        return Optional.ofNullable(this.tenancy);
    }

    private NetAttributesState() {}

    private NetAttributesState(NetAttributesState $) {
        this.dhcpOptionsSetId = $.dhcpOptionsSetId;
        this.ipRange = $.ipRange;
        this.netId = $.netId;
        this.requestId = $.requestId;
        this.state = $.state;
        this.tags = $.tags;
        this.tenancy = $.tenancy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetAttributesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetAttributesState $;

        public Builder() {
            $ = new NetAttributesState();
        }

        public Builder(NetAttributesState defaults) {
            $ = new NetAttributesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dhcpOptionsSetId The ID of the DHCP options set (or `default` if you want to associate the default one).
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetId(@Nullable Output<String> dhcpOptionsSetId) {
            $.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * @param dhcpOptionsSetId The ID of the DHCP options set (or `default` if you want to associate the default one).
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            return dhcpOptionsSetId(Output.of(dhcpOptionsSetId));
        }

        /**
         * @param ipRange The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
         * 
         * @return builder
         * 
         */
        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        /**
         * @param netId The ID of the Net.
         * 
         * @return builder
         * 
         */
        public Builder netId(@Nullable Output<String> netId) {
            $.netId = netId;
            return this;
        }

        /**
         * @param netId The ID of the Net.
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
         * @param state The state of the Net (`pending` \| `available` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the Net (`pending` \| `available` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags One or more tags associated with the Net.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<NetAttributesTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags One or more tags associated with the Net.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<NetAttributesTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags One or more tags associated with the Net.
         * 
         * @return builder
         * 
         */
        public Builder tags(NetAttributesTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tenancy The VM tenancy in a Net.
         * 
         * @return builder
         * 
         */
        public Builder tenancy(@Nullable Output<String> tenancy) {
            $.tenancy = tenancy;
            return this;
        }

        /**
         * @param tenancy The VM tenancy in a Net.
         * 
         * @return builder
         * 
         */
        public Builder tenancy(String tenancy) {
            return tenancy(Output.of(tenancy));
        }

        public NetAttributesState build() {
            return $;
        }
    }

}
