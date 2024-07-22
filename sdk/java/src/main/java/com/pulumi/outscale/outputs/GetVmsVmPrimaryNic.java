// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetVmsVmPrimaryNicLinkNic;
import com.pulumi.outscale.outputs.GetVmsVmPrimaryNicLinkPublicIp;
import com.pulumi.outscale.outputs.GetVmsVmPrimaryNicPrivateIp;
import com.pulumi.outscale.outputs.GetVmsVmPrimaryNicSecurityGroup;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVmsVmPrimaryNic {
    /**
     * @return The account ID of the owner of the NIC.
     * 
     */
    private String accountId;
    /**
     * @return If true, the NIC is deleted when the VM is terminated.
     * 
     */
    private Boolean deleteOnVmDeletion;
    /**
     * @return The description of the NIC.
     * 
     */
    private String description;
    /**
     * @return The device index for the NIC attachment (between `1` and `7`, both included).
     * 
     */
    private Integer deviceNumber;
    /**
     * @return (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     * 
     */
    private Boolean isSourceDestChecked;
    /**
     * @return Information about the network interface card (NIC).
     * 
     */
    private List<GetVmsVmPrimaryNicLinkNic> linkNics;
    /**
     * @return Information about the public IP associated with the NIC.
     * 
     */
    private List<GetVmsVmPrimaryNicLinkPublicIp> linkPublicIps;
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
     * @return The private IP or IPs of the NIC.
     * 
     */
    private List<GetVmsVmPrimaryNicPrivateIp> privateIps;
    private Integer secondaryPrivateIpCount;
    private List<String> securityGroupIds;
    /**
     * @return One or more security groups associated with the VM.
     * 
     */
    private List<GetVmsVmPrimaryNicSecurityGroup> securityGroups;
    /**
     * @return The state of the VM (`pending` \| `running` \| `stopping` \| `stopped` \| `shutting-down` \| `terminated` \| `quarantine`).
     * 
     */
    private String state;
    /**
     * @return The ID of the Subnet for the VM.
     * 
     */
    private String subnetId;

    private GetVmsVmPrimaryNic() {}
    /**
     * @return The account ID of the owner of the NIC.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return If true, the NIC is deleted when the VM is terminated.
     * 
     */
    public Boolean deleteOnVmDeletion() {
        return this.deleteOnVmDeletion;
    }
    /**
     * @return The description of the NIC.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The device index for the NIC attachment (between `1` and `7`, both included).
     * 
     */
    public Integer deviceNumber() {
        return this.deviceNumber;
    }
    /**
     * @return (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     * 
     */
    public Boolean isSourceDestChecked() {
        return this.isSourceDestChecked;
    }
    /**
     * @return Information about the network interface card (NIC).
     * 
     */
    public List<GetVmsVmPrimaryNicLinkNic> linkNics() {
        return this.linkNics;
    }
    /**
     * @return Information about the public IP associated with the NIC.
     * 
     */
    public List<GetVmsVmPrimaryNicLinkPublicIp> linkPublicIps() {
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
     * @return The private IP or IPs of the NIC.
     * 
     */
    public List<GetVmsVmPrimaryNicPrivateIp> privateIps() {
        return this.privateIps;
    }
    public Integer secondaryPrivateIpCount() {
        return this.secondaryPrivateIpCount;
    }
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return One or more security groups associated with the VM.
     * 
     */
    public List<GetVmsVmPrimaryNicSecurityGroup> securityGroups() {
        return this.securityGroups;
    }
    /**
     * @return The state of the VM (`pending` \| `running` \| `stopping` \| `stopped` \| `shutting-down` \| `terminated` \| `quarantine`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The ID of the Subnet for the VM.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmsVmPrimaryNic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private Boolean deleteOnVmDeletion;
        private String description;
        private Integer deviceNumber;
        private Boolean isSourceDestChecked;
        private List<GetVmsVmPrimaryNicLinkNic> linkNics;
        private List<GetVmsVmPrimaryNicLinkPublicIp> linkPublicIps;
        private String macAddress;
        private String netId;
        private String nicId;
        private String privateDnsName;
        private List<GetVmsVmPrimaryNicPrivateIp> privateIps;
        private Integer secondaryPrivateIpCount;
        private List<String> securityGroupIds;
        private List<GetVmsVmPrimaryNicSecurityGroup> securityGroups;
        private String state;
        private String subnetId;
        public Builder() {}
        public Builder(GetVmsVmPrimaryNic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.deleteOnVmDeletion = defaults.deleteOnVmDeletion;
    	      this.description = defaults.description;
    	      this.deviceNumber = defaults.deviceNumber;
    	      this.isSourceDestChecked = defaults.isSourceDestChecked;
    	      this.linkNics = defaults.linkNics;
    	      this.linkPublicIps = defaults.linkPublicIps;
    	      this.macAddress = defaults.macAddress;
    	      this.netId = defaults.netId;
    	      this.nicId = defaults.nicId;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateIps = defaults.privateIps;
    	      this.secondaryPrivateIpCount = defaults.secondaryPrivateIpCount;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.securityGroups = defaults.securityGroups;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
            this.deleteOnVmDeletion = Objects.requireNonNull(deleteOnVmDeletion);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder deviceNumber(Integer deviceNumber) {
            this.deviceNumber = Objects.requireNonNull(deviceNumber);
            return this;
        }
        @CustomType.Setter
        public Builder isSourceDestChecked(Boolean isSourceDestChecked) {
            this.isSourceDestChecked = Objects.requireNonNull(isSourceDestChecked);
            return this;
        }
        @CustomType.Setter
        public Builder linkNics(List<GetVmsVmPrimaryNicLinkNic> linkNics) {
            this.linkNics = Objects.requireNonNull(linkNics);
            return this;
        }
        public Builder linkNics(GetVmsVmPrimaryNicLinkNic... linkNics) {
            return linkNics(List.of(linkNics));
        }
        @CustomType.Setter
        public Builder linkPublicIps(List<GetVmsVmPrimaryNicLinkPublicIp> linkPublicIps) {
            this.linkPublicIps = Objects.requireNonNull(linkPublicIps);
            return this;
        }
        public Builder linkPublicIps(GetVmsVmPrimaryNicLinkPublicIp... linkPublicIps) {
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
        public Builder privateIps(List<GetVmsVmPrimaryNicPrivateIp> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }
        public Builder privateIps(GetVmsVmPrimaryNicPrivateIp... privateIps) {
            return privateIps(List.of(privateIps));
        }
        @CustomType.Setter
        public Builder secondaryPrivateIpCount(Integer secondaryPrivateIpCount) {
            this.secondaryPrivateIpCount = Objects.requireNonNull(secondaryPrivateIpCount);
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
        public Builder securityGroups(List<GetVmsVmPrimaryNicSecurityGroup> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(GetVmsVmPrimaryNicSecurityGroup... securityGroups) {
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
        public GetVmsVmPrimaryNic build() {
            final var o = new GetVmsVmPrimaryNic();
            o.accountId = accountId;
            o.deleteOnVmDeletion = deleteOnVmDeletion;
            o.description = description;
            o.deviceNumber = deviceNumber;
            o.isSourceDestChecked = isSourceDestChecked;
            o.linkNics = linkNics;
            o.linkPublicIps = linkPublicIps;
            o.macAddress = macAddress;
            o.netId = netId;
            o.nicId = nicId;
            o.privateDnsName = privateDnsName;
            o.privateIps = privateIps;
            o.secondaryPrivateIpCount = secondaryPrivateIpCount;
            o.securityGroupIds = securityGroupIds;
            o.securityGroups = securityGroups;
            o.state = state;
            o.subnetId = subnetId;
            return o;
        }
    }
}
