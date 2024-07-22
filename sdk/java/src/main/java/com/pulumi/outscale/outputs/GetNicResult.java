// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetNicFilter;
import com.pulumi.outscale.outputs.GetNicLinkNic;
import com.pulumi.outscale.outputs.GetNicLinkPublicIp;
import com.pulumi.outscale.outputs.GetNicPrivateIp;
import com.pulumi.outscale.outputs.GetNicSecurityGroup;
import com.pulumi.outscale.outputs.GetNicTag;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNicResult {
    /**
     * @return The account ID of the owner of the NIC.
     * 
     */
    private String accountId;
    /**
     * @return The description of the NIC.
     * 
     */
    private String description;
    private @Nullable List<GetNicFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     * 
     */
    private Boolean isSourceDestChecked;
    /**
     * @return Information about the NIC attachment.
     * 
     */
    private List<GetNicLinkNic> linkNics;
    /**
     * @return Information about the public IP association.
     * 
     */
    private List<GetNicLinkPublicIp> linkPublicIps;
    /**
     * @return The Media Access Control (MAC) address of the NIC.
     * 
     */
    private String macAddress;
    /**
     * @return The ID of the Net for the NIC.
     * 
     */
    private String netId;
    /**
     * @return The ID of the NIC.
     * 
     */
    private String nicId;
    /**
     * @return The name of the private DNS.
     * 
     */
    private String privateDnsName;
    /**
     * @return The private IP of the NIC.
     * 
     */
    private String privateIp;
    /**
     * @return The private IPs of the NIC.
     * 
     */
    private List<GetNicPrivateIp> privateIps;
    private String requestId;
    private Boolean requesterManaged;
    /**
     * @return The ID of the security group.
     * 
     */
    private List<String> securityGroupIds;
    /**
     * @return One or more IDs of security groups for the NIC.
     * 
     */
    private List<GetNicSecurityGroup> securityGroups;
    /**
     * @return The state of the NIC (`available` \| `attaching` \| `in-use` \| `detaching`).
     * 
     */
    private String state;
    /**
     * @return The ID of the Subnet.
     * 
     */
    private String subnetId;
    /**
     * @return The Subregion in which the NIC is located.
     * 
     */
    private String subregionName;
    /**
     * @return One or more tags associated with the NIC.
     * 
     */
    private List<GetNicTag> tags;

    private GetNicResult() {}
    /**
     * @return The account ID of the owner of the NIC.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The description of the NIC.
     * 
     */
    public String description() {
        return this.description;
    }
    public List<GetNicFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     * 
     */
    public Boolean isSourceDestChecked() {
        return this.isSourceDestChecked;
    }
    /**
     * @return Information about the NIC attachment.
     * 
     */
    public List<GetNicLinkNic> linkNics() {
        return this.linkNics;
    }
    /**
     * @return Information about the public IP association.
     * 
     */
    public List<GetNicLinkPublicIp> linkPublicIps() {
        return this.linkPublicIps;
    }
    /**
     * @return The Media Access Control (MAC) address of the NIC.
     * 
     */
    public String macAddress() {
        return this.macAddress;
    }
    /**
     * @return The ID of the Net for the NIC.
     * 
     */
    public String netId() {
        return this.netId;
    }
    /**
     * @return The ID of the NIC.
     * 
     */
    public String nicId() {
        return this.nicId;
    }
    /**
     * @return The name of the private DNS.
     * 
     */
    public String privateDnsName() {
        return this.privateDnsName;
    }
    /**
     * @return The private IP of the NIC.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return The private IPs of the NIC.
     * 
     */
    public List<GetNicPrivateIp> privateIps() {
        return this.privateIps;
    }
    public String requestId() {
        return this.requestId;
    }
    public Boolean requesterManaged() {
        return this.requesterManaged;
    }
    /**
     * @return The ID of the security group.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return One or more IDs of security groups for the NIC.
     * 
     */
    public List<GetNicSecurityGroup> securityGroups() {
        return this.securityGroups;
    }
    /**
     * @return The state of the NIC (`available` \| `attaching` \| `in-use` \| `detaching`).
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
     * @return The Subregion in which the NIC is located.
     * 
     */
    public String subregionName() {
        return this.subregionName;
    }
    /**
     * @return One or more tags associated with the NIC.
     * 
     */
    public List<GetNicTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNicResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String description;
        private @Nullable List<GetNicFilter> filters;
        private String id;
        private Boolean isSourceDestChecked;
        private List<GetNicLinkNic> linkNics;
        private List<GetNicLinkPublicIp> linkPublicIps;
        private String macAddress;
        private String netId;
        private String nicId;
        private String privateDnsName;
        private String privateIp;
        private List<GetNicPrivateIp> privateIps;
        private String requestId;
        private Boolean requesterManaged;
        private List<String> securityGroupIds;
        private List<GetNicSecurityGroup> securityGroups;
        private String state;
        private String subnetId;
        private String subregionName;
        private List<GetNicTag> tags;
        public Builder() {}
        public Builder(GetNicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.isSourceDestChecked = defaults.isSourceDestChecked;
    	      this.linkNics = defaults.linkNics;
    	      this.linkPublicIps = defaults.linkPublicIps;
    	      this.macAddress = defaults.macAddress;
    	      this.netId = defaults.netId;
    	      this.nicId = defaults.nicId;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateIp = defaults.privateIp;
    	      this.privateIps = defaults.privateIps;
    	      this.requestId = defaults.requestId;
    	      this.requesterManaged = defaults.requesterManaged;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.securityGroups = defaults.securityGroups;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.subregionName = defaults.subregionName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetNicFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNicFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isSourceDestChecked(Boolean isSourceDestChecked) {
            this.isSourceDestChecked = Objects.requireNonNull(isSourceDestChecked);
            return this;
        }
        @CustomType.Setter
        public Builder linkNics(List<GetNicLinkNic> linkNics) {
            this.linkNics = Objects.requireNonNull(linkNics);
            return this;
        }
        public Builder linkNics(GetNicLinkNic... linkNics) {
            return linkNics(List.of(linkNics));
        }
        @CustomType.Setter
        public Builder linkPublicIps(List<GetNicLinkPublicIp> linkPublicIps) {
            this.linkPublicIps = Objects.requireNonNull(linkPublicIps);
            return this;
        }
        public Builder linkPublicIps(GetNicLinkPublicIp... linkPublicIps) {
            return linkPublicIps(List.of(linkPublicIps));
        }
        @CustomType.Setter
        public Builder macAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }
        @CustomType.Setter
        public Builder netId(String netId) {
            this.netId = Objects.requireNonNull(netId);
            return this;
        }
        @CustomType.Setter
        public Builder nicId(String nicId) {
            this.nicId = Objects.requireNonNull(nicId);
            return this;
        }
        @CustomType.Setter
        public Builder privateDnsName(String privateDnsName) {
            this.privateDnsName = Objects.requireNonNull(privateDnsName);
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        @CustomType.Setter
        public Builder privateIps(List<GetNicPrivateIp> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }
        public Builder privateIps(GetNicPrivateIp... privateIps) {
            return privateIps(List.of(privateIps));
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        @CustomType.Setter
        public Builder requesterManaged(Boolean requesterManaged) {
            this.requesterManaged = Objects.requireNonNull(requesterManaged);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder securityGroups(List<GetNicSecurityGroup> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(GetNicSecurityGroup... securityGroups) {
            return securityGroups(List.of(securityGroups));
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
        public Builder tags(List<GetNicTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetNicTag... tags) {
            return tags(List.of(tags));
        }
        public GetNicResult build() {
            final var o = new GetNicResult();
            o.accountId = accountId;
            o.description = description;
            o.filters = filters;
            o.id = id;
            o.isSourceDestChecked = isSourceDestChecked;
            o.linkNics = linkNics;
            o.linkPublicIps = linkPublicIps;
            o.macAddress = macAddress;
            o.netId = netId;
            o.nicId = nicId;
            o.privateDnsName = privateDnsName;
            o.privateIp = privateIp;
            o.privateIps = privateIps;
            o.requestId = requestId;
            o.requesterManaged = requesterManaged;
            o.securityGroupIds = securityGroupIds;
            o.securityGroups = securityGroups;
            o.state = state;
            o.subnetId = subnetId;
            o.subregionName = subregionName;
            o.tags = tags;
            return o;
        }
    }
}
