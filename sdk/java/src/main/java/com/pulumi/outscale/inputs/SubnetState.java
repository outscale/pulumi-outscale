// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.SubnetTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetState extends com.pulumi.resources.ResourceArgs {

    public static final SubnetState Empty = new SubnetState();

    /**
     * The number of available IPs in the Subnets.
     * 
     */
    @Import(name="availableIpsCount")
    private @Nullable Output<Integer> availableIpsCount;

    /**
     * @return The number of available IPs in the Subnets.
     * 
     */
    public Optional<Output<Integer>> availableIpsCount() {
        return Optional.ofNullable(this.availableIpsCount);
    }

    /**
     * The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).&lt;br /&gt;
     * The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
     * 
     */
    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    /**
     * @return The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).&lt;br /&gt;
     * The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
     * 
     */
    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    /**
     * If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
     * 
     */
    @Import(name="mapPublicIpOnLaunch")
    private @Nullable Output<Boolean> mapPublicIpOnLaunch;

    /**
     * @return If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
     * 
     */
    public Optional<Output<Boolean>> mapPublicIpOnLaunch() {
        return Optional.ofNullable(this.mapPublicIpOnLaunch);
    }

    /**
     * The ID of the Net for which you want to create a Subnet.
     * 
     */
    @Import(name="netId")
    private @Nullable Output<String> netId;

    /**
     * @return The ID of the Net for which you want to create a Subnet.
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
     * The state of the Subnet (`pending` \| `available` \| `deleted`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the Subnet (`pending` \| `available` \| `deleted`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The ID of the Subnet.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The name of the Subregion in which you want to create the Subnet.
     * 
     */
    @Import(name="subregionName")
    private @Nullable Output<String> subregionName;

    /**
     * @return The name of the Subregion in which you want to create the Subnet.
     * 
     */
    public Optional<Output<String>> subregionName() {
        return Optional.ofNullable(this.subregionName);
    }

    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<SubnetTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<SubnetTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SubnetState() {}

    private SubnetState(SubnetState $) {
        this.availableIpsCount = $.availableIpsCount;
        this.ipRange = $.ipRange;
        this.mapPublicIpOnLaunch = $.mapPublicIpOnLaunch;
        this.netId = $.netId;
        this.requestId = $.requestId;
        this.state = $.state;
        this.subnetId = $.subnetId;
        this.subregionName = $.subregionName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetState $;

        public Builder() {
            $ = new SubnetState();
        }

        public Builder(SubnetState defaults) {
            $ = new SubnetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param availableIpsCount The number of available IPs in the Subnets.
         * 
         * @return builder
         * 
         */
        public Builder availableIpsCount(@Nullable Output<Integer> availableIpsCount) {
            $.availableIpsCount = availableIpsCount;
            return this;
        }

        /**
         * @param availableIpsCount The number of available IPs in the Subnets.
         * 
         * @return builder
         * 
         */
        public Builder availableIpsCount(Integer availableIpsCount) {
            return availableIpsCount(Output.of(availableIpsCount));
        }

        /**
         * @param ipRange The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).&lt;br /&gt;
         * The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
         * 
         * @return builder
         * 
         */
        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).&lt;br /&gt;
         * The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        /**
         * @param mapPublicIpOnLaunch If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
         * 
         * @return builder
         * 
         */
        public Builder mapPublicIpOnLaunch(@Nullable Output<Boolean> mapPublicIpOnLaunch) {
            $.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
            return this;
        }

        /**
         * @param mapPublicIpOnLaunch If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
         * 
         * @return builder
         * 
         */
        public Builder mapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
            return mapPublicIpOnLaunch(Output.of(mapPublicIpOnLaunch));
        }

        /**
         * @param netId The ID of the Net for which you want to create a Subnet.
         * 
         * @return builder
         * 
         */
        public Builder netId(@Nullable Output<String> netId) {
            $.netId = netId;
            return this;
        }

        /**
         * @param netId The ID of the Net for which you want to create a Subnet.
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
         * @param state The state of the Subnet (`pending` \| `available` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the Subnet (`pending` \| `available` \| `deleted`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subnetId The ID of the Subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param subregionName The name of the Subregion in which you want to create the Subnet.
         * 
         * @return builder
         * 
         */
        public Builder subregionName(@Nullable Output<String> subregionName) {
            $.subregionName = subregionName;
            return this;
        }

        /**
         * @param subregionName The name of the Subregion in which you want to create the Subnet.
         * 
         * @return builder
         * 
         */
        public Builder subregionName(String subregionName) {
            return subregionName(Output.of(subregionName));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<SubnetTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<SubnetTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(SubnetTagArgs... tags) {
            return tags(List.of(tags));
        }

        public SubnetState build() {
            return $;
        }
    }

}
