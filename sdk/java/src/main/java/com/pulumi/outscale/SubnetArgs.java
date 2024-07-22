// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.SubnetTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    /**
     * The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).&lt;br /&gt;
     * The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
     * 
     */
    @Import(name="ipRange", required=true)
    private Output<String> ipRange;

    /**
     * @return The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).&lt;br /&gt;
     * The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
     * 
     */
    public Output<String> ipRange() {
        return this.ipRange;
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
    @Import(name="netId", required=true)
    private Output<String> netId;

    /**
     * @return The ID of the Net for which you want to create a Subnet.
     * 
     */
    public Output<String> netId() {
        return this.netId;
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

    private SubnetArgs() {}

    private SubnetArgs(SubnetArgs $) {
        this.ipRange = $.ipRange;
        this.mapPublicIpOnLaunch = $.mapPublicIpOnLaunch;
        this.netId = $.netId;
        this.subregionName = $.subregionName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetArgs $;

        public Builder() {
            $ = new SubnetArgs();
        }

        public Builder(SubnetArgs defaults) {
            $ = new SubnetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipRange The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).&lt;br /&gt;
         * The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
         * 
         * @return builder
         * 
         */
        public Builder ipRange(Output<String> ipRange) {
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
        public Builder netId(Output<String> netId) {
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

        public SubnetArgs build() {
            $.ipRange = Objects.requireNonNull($.ipRange, "expected parameter 'ipRange' to be non-null");
            $.netId = Objects.requireNonNull($.netId, "expected parameter 'netId' to be non-null");
            return $;
        }
    }

}
