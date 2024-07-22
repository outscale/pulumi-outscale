// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetVmBlockDeviceMappingsCreated;
import com.pulumi.outscale.outputs.GetVmFilter;
import com.pulumi.outscale.outputs.GetVmNic;
import com.pulumi.outscale.outputs.GetVmPrimaryNic;
import com.pulumi.outscale.outputs.GetVmSecurityGroup;
import com.pulumi.outscale.outputs.GetVmTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVmResult {
    /**
     * @return The architecture of the VM (`i386` \| `x86_64`).
     * 
     */
    private String architecture;
    /**
     * @return The block device mapping of the VM.
     * 
     */
    private List<GetVmBlockDeviceMappingsCreated> blockDeviceMappingsCreateds;
    private Boolean bsuOptimized;
    /**
     * @return The idempotency token provided when launching the VM.
     * 
     */
    private String clientToken;
    /**
     * @return The date and time of creation of the VM.
     * 
     */
    private String creationDate;
    /**
     * @return If true, you cannot delete the VM unless you change this parameter back to false.
     * 
     */
    private Boolean deletionProtection;
    private @Nullable List<GetVmFilter> filters;
    /**
     * @return The hypervisor type of the VMs (`ovm` \| `xen`).
     * 
     */
    private String hypervisor;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The ID of the OMI used to create the VM.
     * 
     */
    private String imageId;
    /**
     * @return (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     * 
     */
    private Boolean isSourceDestChecked;
    /**
     * @return The name of the keypair used when launching the VM.
     * 
     */
    private String keypairName;
    /**
     * @return The number for the VM when launching a group of several VMs (for example, `0`, `1`, `2`, and so on).
     * 
     */
    private Integer launchNumber;
    /**
     * @return If true, nested virtualization is enabled. If false, it is disabled.
     * 
     */
    private Boolean nestedVirtualization;
    /**
     * @return The ID of the Net for the NIC.
     * 
     */
    private String netId;
    /**
     * @return (Net only) The network interface cards (NICs) the VMs are attached to.
     * 
     */
    private List<GetVmNic> nics;
    /**
     * @return Indicates the operating system (OS) of the VM.
     * 
     */
    private String osFamily;
    /**
     * @return The performance of the VM (`medium` \| `high` \|  `highest`).
     * 
     */
    private String performance;
    private String placementSubregionName;
    private String placementTenancy;
    private List<GetVmPrimaryNic> primaryNics;
    /**
     * @return The name of the private DNS.
     * 
     */
    private String privateDnsName;
    /**
     * @return The primary private IP of the VM.
     * 
     */
    private String privateIp;
    /**
     * @return The private IP or IPs of the NIC.
     * 
     */
    private List<String> privateIps;
    /**
     * @return The product codes associated with the OMI used to create the VM.
     * 
     */
    private List<String> productCodes;
    /**
     * @return The name of the public DNS.
     * 
     */
    private String publicDnsName;
    /**
     * @return The public IP of the VM.
     * 
     */
    private String publicIp;
    private String requestId;
    /**
     * @return The reservation ID of the VM.
     * 
     */
    private String reservationId;
    /**
     * @return The name of the root device for the VM (for example, `/dev/vda1`).
     * 
     */
    private String rootDeviceName;
    /**
     * @return The type of root device used by the VM (always `bsu`).
     * 
     */
    private String rootDeviceType;
    private List<String> securityGroupIds;
    private List<String> securityGroupNames;
    /**
     * @return One or more security groups associated with the VM.
     * 
     */
    private List<GetVmSecurityGroup> securityGroups;
    /**
     * @return The state of the VM (`pending` \| `running` \| `stopping` \| `stopped` \| `shutting-down` \| `terminated` \| `quarantine`).
     * 
     */
    private String state;
    /**
     * @return The reason explaining the current state of the VM.
     * 
     */
    private String stateReason;
    /**
     * @return The ID of the Subnet for the VM.
     * 
     */
    private String subnetId;
    /**
     * @return One or more tags associated with the VM.
     * 
     */
    private List<GetVmTag> tags;
    /**
     * @return The Base64-encoded MIME user data.
     * 
     */
    private String userData;
    /**
     * @return The ID of the VM.
     * 
     */
    private String vmId;
    /**
     * @return The VM behavior when you stop it. If set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is deleted.
     * 
     */
    private String vmInitiatedShutdownBehavior;
    /**
     * @return The type of VM. For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
     * 
     */
    private String vmType;

    private GetVmResult() {}
    /**
     * @return The architecture of the VM (`i386` \| `x86_64`).
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return The block device mapping of the VM.
     * 
     */
    public List<GetVmBlockDeviceMappingsCreated> blockDeviceMappingsCreateds() {
        return this.blockDeviceMappingsCreateds;
    }
    public Boolean bsuOptimized() {
        return this.bsuOptimized;
    }
    /**
     * @return The idempotency token provided when launching the VM.
     * 
     */
    public String clientToken() {
        return this.clientToken;
    }
    /**
     * @return The date and time of creation of the VM.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return If true, you cannot delete the VM unless you change this parameter back to false.
     * 
     */
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    public List<GetVmFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The hypervisor type of the VMs (`ovm` \| `xen`).
     * 
     */
    public String hypervisor() {
        return this.hypervisor;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the OMI used to create the VM.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     * 
     */
    public Boolean isSourceDestChecked() {
        return this.isSourceDestChecked;
    }
    /**
     * @return The name of the keypair used when launching the VM.
     * 
     */
    public String keypairName() {
        return this.keypairName;
    }
    /**
     * @return The number for the VM when launching a group of several VMs (for example, `0`, `1`, `2`, and so on).
     * 
     */
    public Integer launchNumber() {
        return this.launchNumber;
    }
    /**
     * @return If true, nested virtualization is enabled. If false, it is disabled.
     * 
     */
    public Boolean nestedVirtualization() {
        return this.nestedVirtualization;
    }
    /**
     * @return The ID of the Net for the NIC.
     * 
     */
    public String netId() {
        return this.netId;
    }
    /**
     * @return (Net only) The network interface cards (NICs) the VMs are attached to.
     * 
     */
    public List<GetVmNic> nics() {
        return this.nics;
    }
    /**
     * @return Indicates the operating system (OS) of the VM.
     * 
     */
    public String osFamily() {
        return this.osFamily;
    }
    /**
     * @return The performance of the VM (`medium` \| `high` \|  `highest`).
     * 
     */
    public String performance() {
        return this.performance;
    }
    public String placementSubregionName() {
        return this.placementSubregionName;
    }
    public String placementTenancy() {
        return this.placementTenancy;
    }
    public List<GetVmPrimaryNic> primaryNics() {
        return this.primaryNics;
    }
    /**
     * @return The name of the private DNS.
     * 
     */
    public String privateDnsName() {
        return this.privateDnsName;
    }
    /**
     * @return The primary private IP of the VM.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return The private IP or IPs of the NIC.
     * 
     */
    public List<String> privateIps() {
        return this.privateIps;
    }
    /**
     * @return The product codes associated with the OMI used to create the VM.
     * 
     */
    public List<String> productCodes() {
        return this.productCodes;
    }
    /**
     * @return The name of the public DNS.
     * 
     */
    public String publicDnsName() {
        return this.publicDnsName;
    }
    /**
     * @return The public IP of the VM.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return The reservation ID of the VM.
     * 
     */
    public String reservationId() {
        return this.reservationId;
    }
    /**
     * @return The name of the root device for the VM (for example, `/dev/vda1`).
     * 
     */
    public String rootDeviceName() {
        return this.rootDeviceName;
    }
    /**
     * @return The type of root device used by the VM (always `bsu`).
     * 
     */
    public String rootDeviceType() {
        return this.rootDeviceType;
    }
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    public List<String> securityGroupNames() {
        return this.securityGroupNames;
    }
    /**
     * @return One or more security groups associated with the VM.
     * 
     */
    public List<GetVmSecurityGroup> securityGroups() {
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
     * @return The reason explaining the current state of the VM.
     * 
     */
    public String stateReason() {
        return this.stateReason;
    }
    /**
     * @return The ID of the Subnet for the VM.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return One or more tags associated with the VM.
     * 
     */
    public List<GetVmTag> tags() {
        return this.tags;
    }
    /**
     * @return The Base64-encoded MIME user data.
     * 
     */
    public String userData() {
        return this.userData;
    }
    /**
     * @return The ID of the VM.
     * 
     */
    public String vmId() {
        return this.vmId;
    }
    /**
     * @return The VM behavior when you stop it. If set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is deleted.
     * 
     */
    public String vmInitiatedShutdownBehavior() {
        return this.vmInitiatedShutdownBehavior;
    }
    /**
     * @return The type of VM. For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
     * 
     */
    public String vmType() {
        return this.vmType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String architecture;
        private List<GetVmBlockDeviceMappingsCreated> blockDeviceMappingsCreateds;
        private Boolean bsuOptimized;
        private String clientToken;
        private String creationDate;
        private Boolean deletionProtection;
        private @Nullable List<GetVmFilter> filters;
        private String hypervisor;
        private String id;
        private String imageId;
        private Boolean isSourceDestChecked;
        private String keypairName;
        private Integer launchNumber;
        private Boolean nestedVirtualization;
        private String netId;
        private List<GetVmNic> nics;
        private String osFamily;
        private String performance;
        private String placementSubregionName;
        private String placementTenancy;
        private List<GetVmPrimaryNic> primaryNics;
        private String privateDnsName;
        private String privateIp;
        private List<String> privateIps;
        private List<String> productCodes;
        private String publicDnsName;
        private String publicIp;
        private String requestId;
        private String reservationId;
        private String rootDeviceName;
        private String rootDeviceType;
        private List<String> securityGroupIds;
        private List<String> securityGroupNames;
        private List<GetVmSecurityGroup> securityGroups;
        private String state;
        private String stateReason;
        private String subnetId;
        private List<GetVmTag> tags;
        private String userData;
        private String vmId;
        private String vmInitiatedShutdownBehavior;
        private String vmType;
        public Builder() {}
        public Builder(GetVmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.blockDeviceMappingsCreateds = defaults.blockDeviceMappingsCreateds;
    	      this.bsuOptimized = defaults.bsuOptimized;
    	      this.clientToken = defaults.clientToken;
    	      this.creationDate = defaults.creationDate;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.filters = defaults.filters;
    	      this.hypervisor = defaults.hypervisor;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.isSourceDestChecked = defaults.isSourceDestChecked;
    	      this.keypairName = defaults.keypairName;
    	      this.launchNumber = defaults.launchNumber;
    	      this.nestedVirtualization = defaults.nestedVirtualization;
    	      this.netId = defaults.netId;
    	      this.nics = defaults.nics;
    	      this.osFamily = defaults.osFamily;
    	      this.performance = defaults.performance;
    	      this.placementSubregionName = defaults.placementSubregionName;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.primaryNics = defaults.primaryNics;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateIp = defaults.privateIp;
    	      this.privateIps = defaults.privateIps;
    	      this.productCodes = defaults.productCodes;
    	      this.publicDnsName = defaults.publicDnsName;
    	      this.publicIp = defaults.publicIp;
    	      this.requestId = defaults.requestId;
    	      this.reservationId = defaults.reservationId;
    	      this.rootDeviceName = defaults.rootDeviceName;
    	      this.rootDeviceType = defaults.rootDeviceType;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.securityGroupNames = defaults.securityGroupNames;
    	      this.securityGroups = defaults.securityGroups;
    	      this.state = defaults.state;
    	      this.stateReason = defaults.stateReason;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.vmId = defaults.vmId;
    	      this.vmInitiatedShutdownBehavior = defaults.vmInitiatedShutdownBehavior;
    	      this.vmType = defaults.vmType;
        }

        @CustomType.Setter
        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        @CustomType.Setter
        public Builder blockDeviceMappingsCreateds(List<GetVmBlockDeviceMappingsCreated> blockDeviceMappingsCreateds) {
            this.blockDeviceMappingsCreateds = Objects.requireNonNull(blockDeviceMappingsCreateds);
            return this;
        }
        public Builder blockDeviceMappingsCreateds(GetVmBlockDeviceMappingsCreated... blockDeviceMappingsCreateds) {
            return blockDeviceMappingsCreateds(List.of(blockDeviceMappingsCreateds));
        }
        @CustomType.Setter
        public Builder bsuOptimized(Boolean bsuOptimized) {
            this.bsuOptimized = Objects.requireNonNull(bsuOptimized);
            return this;
        }
        @CustomType.Setter
        public Builder clientToken(String clientToken) {
            this.clientToken = Objects.requireNonNull(clientToken);
            return this;
        }
        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        @CustomType.Setter
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetVmFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVmFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder hypervisor(String hypervisor) {
            this.hypervisor = Objects.requireNonNull(hypervisor);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        @CustomType.Setter
        public Builder isSourceDestChecked(Boolean isSourceDestChecked) {
            this.isSourceDestChecked = Objects.requireNonNull(isSourceDestChecked);
            return this;
        }
        @CustomType.Setter
        public Builder keypairName(String keypairName) {
            this.keypairName = Objects.requireNonNull(keypairName);
            return this;
        }
        @CustomType.Setter
        public Builder launchNumber(Integer launchNumber) {
            this.launchNumber = Objects.requireNonNull(launchNumber);
            return this;
        }
        @CustomType.Setter
        public Builder nestedVirtualization(Boolean nestedVirtualization) {
            this.nestedVirtualization = Objects.requireNonNull(nestedVirtualization);
            return this;
        }
        @CustomType.Setter
        public Builder netId(String netId) {
            this.netId = Objects.requireNonNull(netId);
            return this;
        }
        @CustomType.Setter
        public Builder nics(List<GetVmNic> nics) {
            this.nics = Objects.requireNonNull(nics);
            return this;
        }
        public Builder nics(GetVmNic... nics) {
            return nics(List.of(nics));
        }
        @CustomType.Setter
        public Builder osFamily(String osFamily) {
            this.osFamily = Objects.requireNonNull(osFamily);
            return this;
        }
        @CustomType.Setter
        public Builder performance(String performance) {
            this.performance = Objects.requireNonNull(performance);
            return this;
        }
        @CustomType.Setter
        public Builder placementSubregionName(String placementSubregionName) {
            this.placementSubregionName = Objects.requireNonNull(placementSubregionName);
            return this;
        }
        @CustomType.Setter
        public Builder placementTenancy(String placementTenancy) {
            this.placementTenancy = Objects.requireNonNull(placementTenancy);
            return this;
        }
        @CustomType.Setter
        public Builder primaryNics(List<GetVmPrimaryNic> primaryNics) {
            this.primaryNics = Objects.requireNonNull(primaryNics);
            return this;
        }
        public Builder primaryNics(GetVmPrimaryNic... primaryNics) {
            return primaryNics(List.of(primaryNics));
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
        public Builder privateIps(List<String> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }
        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }
        @CustomType.Setter
        public Builder productCodes(List<String> productCodes) {
            this.productCodes = Objects.requireNonNull(productCodes);
            return this;
        }
        public Builder productCodes(String... productCodes) {
            return productCodes(List.of(productCodes));
        }
        @CustomType.Setter
        public Builder publicDnsName(String publicDnsName) {
            this.publicDnsName = Objects.requireNonNull(publicDnsName);
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        @CustomType.Setter
        public Builder reservationId(String reservationId) {
            this.reservationId = Objects.requireNonNull(reservationId);
            return this;
        }
        @CustomType.Setter
        public Builder rootDeviceName(String rootDeviceName) {
            this.rootDeviceName = Objects.requireNonNull(rootDeviceName);
            return this;
        }
        @CustomType.Setter
        public Builder rootDeviceType(String rootDeviceType) {
            this.rootDeviceType = Objects.requireNonNull(rootDeviceType);
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
        public Builder securityGroupNames(List<String> securityGroupNames) {
            this.securityGroupNames = Objects.requireNonNull(securityGroupNames);
            return this;
        }
        public Builder securityGroupNames(String... securityGroupNames) {
            return securityGroupNames(List.of(securityGroupNames));
        }
        @CustomType.Setter
        public Builder securityGroups(List<GetVmSecurityGroup> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(GetVmSecurityGroup... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder stateReason(String stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetVmTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetVmTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder userData(String userData) {
            this.userData = Objects.requireNonNull(userData);
            return this;
        }
        @CustomType.Setter
        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        @CustomType.Setter
        public Builder vmInitiatedShutdownBehavior(String vmInitiatedShutdownBehavior) {
            this.vmInitiatedShutdownBehavior = Objects.requireNonNull(vmInitiatedShutdownBehavior);
            return this;
        }
        @CustomType.Setter
        public Builder vmType(String vmType) {
            this.vmType = Objects.requireNonNull(vmType);
            return this;
        }
        public GetVmResult build() {
            final var o = new GetVmResult();
            o.architecture = architecture;
            o.blockDeviceMappingsCreateds = blockDeviceMappingsCreateds;
            o.bsuOptimized = bsuOptimized;
            o.clientToken = clientToken;
            o.creationDate = creationDate;
            o.deletionProtection = deletionProtection;
            o.filters = filters;
            o.hypervisor = hypervisor;
            o.id = id;
            o.imageId = imageId;
            o.isSourceDestChecked = isSourceDestChecked;
            o.keypairName = keypairName;
            o.launchNumber = launchNumber;
            o.nestedVirtualization = nestedVirtualization;
            o.netId = netId;
            o.nics = nics;
            o.osFamily = osFamily;
            o.performance = performance;
            o.placementSubregionName = placementSubregionName;
            o.placementTenancy = placementTenancy;
            o.primaryNics = primaryNics;
            o.privateDnsName = privateDnsName;
            o.privateIp = privateIp;
            o.privateIps = privateIps;
            o.productCodes = productCodes;
            o.publicDnsName = publicDnsName;
            o.publicIp = publicIp;
            o.requestId = requestId;
            o.reservationId = reservationId;
            o.rootDeviceName = rootDeviceName;
            o.rootDeviceType = rootDeviceType;
            o.securityGroupIds = securityGroupIds;
            o.securityGroupNames = securityGroupNames;
            o.securityGroups = securityGroups;
            o.state = state;
            o.stateReason = stateReason;
            o.subnetId = subnetId;
            o.tags = tags;
            o.userData = userData;
            o.vmId = vmId;
            o.vmInitiatedShutdownBehavior = vmInitiatedShutdownBehavior;
            o.vmType = vmType;
            return o;
        }
    }
}
