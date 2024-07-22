// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetSubnetsSubnetTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubnetsSubnet {
    /**
     * @return The number of available IPs in the Subnets.
     * 
     */
    private Integer availableIpsCount;
    /**
     * @return The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    private String ipRange;
    /**
     * @return If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
     * 
     */
    private Boolean mapPublicIpOnLaunch;
    /**
     * @return The ID of the Net in which the Subnet is.
     * 
     */
    private String netId;
    /**
     * @return The state of the Subnet (`pending` \| `available` \| `deleted`).
     * 
     */
    private String state;
    /**
     * @return The ID of the Subnet.
     * 
     */
    private String subnetId;
    /**
     * @return The name of the Subregion in which the Subnet is located.
     * 
     */
    private String subregionName;
    /**
     * @return The key/value combinations of the tags associated with the Subnets, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    private List<GetSubnetsSubnetTag> tags;

    private GetSubnetsSubnet() {}
    /**
     * @return The number of available IPs in the Subnets.
     * 
     */
    public Integer availableIpsCount() {
        return this.availableIpsCount;
    }
    /**
     * @return The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    public String ipRange() {
        return this.ipRange;
    }
    /**
     * @return If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
     * 
     */
    public Boolean mapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }
    /**
     * @return The ID of the Net in which the Subnet is.
     * 
     */
    public String netId() {
        return this.netId;
    }
    /**
     * @return The state of the Subnet (`pending` \| `available` \| `deleted`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The ID of the Subnet.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return The name of the Subregion in which the Subnet is located.
     * 
     */
    public String subregionName() {
        return this.subregionName;
    }
    /**
     * @return The key/value combinations of the tags associated with the Subnets, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    public List<GetSubnetsSubnetTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetsSubnet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer availableIpsCount;
        private String ipRange;
        private Boolean mapPublicIpOnLaunch;
        private String netId;
        private String state;
        private String subnetId;
        private String subregionName;
        private List<GetSubnetsSubnetTag> tags;
        public Builder() {}
        public Builder(GetSubnetsSubnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableIpsCount = defaults.availableIpsCount;
    	      this.ipRange = defaults.ipRange;
    	      this.mapPublicIpOnLaunch = defaults.mapPublicIpOnLaunch;
    	      this.netId = defaults.netId;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.subregionName = defaults.subregionName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder availableIpsCount(Integer availableIpsCount) {
            this.availableIpsCount = Objects.requireNonNull(availableIpsCount);
            return this;
        }
        @CustomType.Setter
        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }
        @CustomType.Setter
        public Builder mapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = Objects.requireNonNull(mapPublicIpOnLaunch);
            return this;
        }
        @CustomType.Setter
        public Builder netId(String netId) {
            this.netId = Objects.requireNonNull(netId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder subregionName(String subregionName) {
            this.subregionName = Objects.requireNonNull(subregionName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetSubnetsSubnetTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetSubnetsSubnetTag... tags) {
            return tags(List.of(tags));
        }
        public GetSubnetsSubnet build() {
            final var o = new GetSubnetsSubnet();
            o.availableIpsCount = availableIpsCount;
            o.ipRange = ipRange;
            o.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
            o.netId = netId;
            o.state = state;
            o.subnetId = subnetId;
            o.subregionName = subregionName;
            o.tags = tags;
            return o;
        }
    }
}
