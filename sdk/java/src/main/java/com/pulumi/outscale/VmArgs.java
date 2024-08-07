// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.VmBlockDeviceMappingArgs;
import com.pulumi.outscale.inputs.VmNicArgs;
import com.pulumi.outscale.inputs.VmPrimaryNicArgs;
import com.pulumi.outscale.inputs.VmTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VmArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmArgs Empty = new VmArgs();

    /**
     * One or more block device mappings.
     * 
     */
    @Import(name="blockDeviceMappings")
    private @Nullable Output<List<VmBlockDeviceMappingArgs>> blockDeviceMappings;

    /**
     * @return One or more block device mappings.
     * 
     */
    public Optional<Output<List<VmBlockDeviceMappingArgs>>> blockDeviceMappings() {
        return Optional.ofNullable(this.blockDeviceMappings);
    }

    @Import(name="bsuOptimized")
    private @Nullable Output<Boolean> bsuOptimized;

    public Optional<Output<Boolean>> bsuOptimized() {
        return Optional.ofNullable(this.bsuOptimized);
    }

    /**
     * If true, you cannot delete the VM unless you change this parameter back to false.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    /**
     * @return If true, you cannot delete the VM unless you change this parameter back to false.
     * 
     */
    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `admin_password` attribute.
     * 
     */
    @Import(name="getAdminPassword")
    private @Nullable Output<Boolean> getAdminPassword;

    /**
     * @return (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `admin_password` attribute.
     * 
     */
    public Optional<Output<Boolean>> getAdminPassword() {
        return Optional.ofNullable(this.getAdminPassword);
    }

    /**
     * The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
     * 
     */
    @Import(name="imageId", required=true)
    private Output<String> imageId;

    /**
     * @return The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }

    /**
     * (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     * 
     */
    @Import(name="isSourceDestChecked")
    private @Nullable Output<Boolean> isSourceDestChecked;

    /**
     * @return (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     * 
     */
    public Optional<Output<Boolean>> isSourceDestChecked() {
        return Optional.ofNullable(this.isSourceDestChecked);
    }

    /**
     * The name of the keypair.
     * 
     */
    @Import(name="keypairName")
    private @Nullable Output<String> keypairName;

    /**
     * @return The name of the keypair.
     * 
     */
    public Optional<Output<String>> keypairName() {
        return Optional.ofNullable(this.keypairName);
    }

    /**
     * (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
     * 
     */
    @Import(name="nestedVirtualization")
    private @Nullable Output<Boolean> nestedVirtualization;

    /**
     * @return (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
     * 
     */
    public Optional<Output<Boolean>> nestedVirtualization() {
        return Optional.ofNullable(this.nestedVirtualization);
    }

    /**
     * One or more NICs. If you specify this parameter, you must not specify the `subnet_id` and `subregion_name` parameters. To define a NIC as the primary network interface of the VM, use the `primary_nic` argument.
     * 
     */
    @Import(name="nics")
    private @Nullable Output<List<VmNicArgs>> nics;

    /**
     * @return One or more NICs. If you specify this parameter, you must not specify the `subnet_id` and `subregion_name` parameters. To define a NIC as the primary network interface of the VM, use the `primary_nic` argument.
     * 
     */
    public Optional<Output<List<VmNicArgs>>> nics() {
        return Optional.ofNullable(this.nics);
    }

    /**
     * The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
     * 
     */
    @Import(name="performance")
    private @Nullable Output<String> performance;

    /**
     * @return The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
     * 
     */
    public Optional<Output<String>> performance() {
        return Optional.ofNullable(this.performance);
    }

    /**
     * The name of the Subregion where the VM is placed.
     * 
     */
    @Import(name="placementSubregionName")
    private @Nullable Output<String> placementSubregionName;

    /**
     * @return The name of the Subregion where the VM is placed.
     * 
     */
    public Optional<Output<String>> placementSubregionName() {
        return Optional.ofNullable(this.placementSubregionName);
    }

    /**
     * The tenancy of the VM (`default` | `dedicated`).
     * 
     */
    @Import(name="placementTenancy")
    private @Nullable Output<String> placementTenancy;

    /**
     * @return The tenancy of the VM (`default` | `dedicated`).
     * 
     */
    public Optional<Output<String>> placementTenancy() {
        return Optional.ofNullable(this.placementTenancy);
    }

    /**
     * The primary network interface of the VM.
     * 
     */
    @Import(name="primaryNics")
    private @Nullable Output<List<VmPrimaryNicArgs>> primaryNics;

    /**
     * @return The primary network interface of the VM.
     * 
     */
    public Optional<Output<List<VmPrimaryNicArgs>>> primaryNics() {
        return Optional.ofNullable(this.primaryNics);
    }

    /**
     * One or more private IPs of the VM.
     * 
     */
    @Import(name="privateIps")
    private @Nullable Output<List<String>> privateIps;

    /**
     * @return One or more private IPs of the VM.
     * 
     */
    public Optional<Output<List<String>>> privateIps() {
        return Optional.ofNullable(this.privateIps);
    }

    /**
     * One or more IDs of security group for the VMs.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return One or more IDs of security group for the VMs.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * One or more names of security groups for the VMs.
     * 
     */
    @Import(name="securityGroupNames")
    private @Nullable Output<List<String>> securityGroupNames;

    /**
     * @return One or more names of security groups for the VMs.
     * 
     */
    public Optional<Output<List<String>>> securityGroupNames() {
        return Optional.ofNullable(this.securityGroupNames);
    }

    /**
     * The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<VmTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<VmTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * The ID of the VM.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<String> vmId;

    /**
     * @return The ID of the VM.
     * 
     */
    public Optional<Output<String>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    /**
     * The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
     * 
     */
    @Import(name="vmInitiatedShutdownBehavior")
    private @Nullable Output<String> vmInitiatedShutdownBehavior;

    /**
     * @return The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
     * 
     */
    public Optional<Output<String>> vmInitiatedShutdownBehavior() {
        return Optional.ofNullable(this.vmInitiatedShutdownBehavior);
    }

    /**
     * The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.&lt;br /&gt; For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
     * 
     */
    @Import(name="vmType")
    private @Nullable Output<String> vmType;

    /**
     * @return The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.&lt;br /&gt; For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
     * 
     */
    public Optional<Output<String>> vmType() {
        return Optional.ofNullable(this.vmType);
    }

    private VmArgs() {}

    private VmArgs(VmArgs $) {
        this.blockDeviceMappings = $.blockDeviceMappings;
        this.bsuOptimized = $.bsuOptimized;
        this.deletionProtection = $.deletionProtection;
        this.getAdminPassword = $.getAdminPassword;
        this.imageId = $.imageId;
        this.isSourceDestChecked = $.isSourceDestChecked;
        this.keypairName = $.keypairName;
        this.nestedVirtualization = $.nestedVirtualization;
        this.nics = $.nics;
        this.performance = $.performance;
        this.placementSubregionName = $.placementSubregionName;
        this.placementTenancy = $.placementTenancy;
        this.primaryNics = $.primaryNics;
        this.privateIps = $.privateIps;
        this.securityGroupIds = $.securityGroupIds;
        this.securityGroupNames = $.securityGroupNames;
        this.state = $.state;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.userData = $.userData;
        this.vmId = $.vmId;
        this.vmInitiatedShutdownBehavior = $.vmInitiatedShutdownBehavior;
        this.vmType = $.vmType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmArgs $;

        public Builder() {
            $ = new VmArgs();
        }

        public Builder(VmArgs defaults) {
            $ = new VmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockDeviceMappings One or more block device mappings.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(@Nullable Output<List<VmBlockDeviceMappingArgs>> blockDeviceMappings) {
            $.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        /**
         * @param blockDeviceMappings One or more block device mappings.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(List<VmBlockDeviceMappingArgs> blockDeviceMappings) {
            return blockDeviceMappings(Output.of(blockDeviceMappings));
        }

        /**
         * @param blockDeviceMappings One or more block device mappings.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(VmBlockDeviceMappingArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }

        public Builder bsuOptimized(@Nullable Output<Boolean> bsuOptimized) {
            $.bsuOptimized = bsuOptimized;
            return this;
        }

        public Builder bsuOptimized(Boolean bsuOptimized) {
            return bsuOptimized(Output.of(bsuOptimized));
        }

        /**
         * @param deletionProtection If true, you cannot delete the VM unless you change this parameter back to false.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * @param deletionProtection If true, you cannot delete the VM unless you change this parameter back to false.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        /**
         * @param getAdminPassword (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `admin_password` attribute.
         * 
         * @return builder
         * 
         */
        public Builder getAdminPassword(@Nullable Output<Boolean> getAdminPassword) {
            $.getAdminPassword = getAdminPassword;
            return this;
        }

        /**
         * @param getAdminPassword (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `admin_password` attribute.
         * 
         * @return builder
         * 
         */
        public Builder getAdminPassword(Boolean getAdminPassword) {
            return getAdminPassword(Output.of(getAdminPassword));
        }

        /**
         * @param imageId The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
         * 
         * @return builder
         * 
         */
        public Builder imageId(Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param isSourceDestChecked (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
         * 
         * @return builder
         * 
         */
        public Builder isSourceDestChecked(@Nullable Output<Boolean> isSourceDestChecked) {
            $.isSourceDestChecked = isSourceDestChecked;
            return this;
        }

        /**
         * @param isSourceDestChecked (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
         * 
         * @return builder
         * 
         */
        public Builder isSourceDestChecked(Boolean isSourceDestChecked) {
            return isSourceDestChecked(Output.of(isSourceDestChecked));
        }

        /**
         * @param keypairName The name of the keypair.
         * 
         * @return builder
         * 
         */
        public Builder keypairName(@Nullable Output<String> keypairName) {
            $.keypairName = keypairName;
            return this;
        }

        /**
         * @param keypairName The name of the keypair.
         * 
         * @return builder
         * 
         */
        public Builder keypairName(String keypairName) {
            return keypairName(Output.of(keypairName));
        }

        /**
         * @param nestedVirtualization (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
         * 
         * @return builder
         * 
         */
        public Builder nestedVirtualization(@Nullable Output<Boolean> nestedVirtualization) {
            $.nestedVirtualization = nestedVirtualization;
            return this;
        }

        /**
         * @param nestedVirtualization (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
         * 
         * @return builder
         * 
         */
        public Builder nestedVirtualization(Boolean nestedVirtualization) {
            return nestedVirtualization(Output.of(nestedVirtualization));
        }

        /**
         * @param nics One or more NICs. If you specify this parameter, you must not specify the `subnet_id` and `subregion_name` parameters. To define a NIC as the primary network interface of the VM, use the `primary_nic` argument.
         * 
         * @return builder
         * 
         */
        public Builder nics(@Nullable Output<List<VmNicArgs>> nics) {
            $.nics = nics;
            return this;
        }

        /**
         * @param nics One or more NICs. If you specify this parameter, you must not specify the `subnet_id` and `subregion_name` parameters. To define a NIC as the primary network interface of the VM, use the `primary_nic` argument.
         * 
         * @return builder
         * 
         */
        public Builder nics(List<VmNicArgs> nics) {
            return nics(Output.of(nics));
        }

        /**
         * @param nics One or more NICs. If you specify this parameter, you must not specify the `subnet_id` and `subregion_name` parameters. To define a NIC as the primary network interface of the VM, use the `primary_nic` argument.
         * 
         * @return builder
         * 
         */
        public Builder nics(VmNicArgs... nics) {
            return nics(List.of(nics));
        }

        /**
         * @param performance The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
         * 
         * @return builder
         * 
         */
        public Builder performance(@Nullable Output<String> performance) {
            $.performance = performance;
            return this;
        }

        /**
         * @param performance The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
         * 
         * @return builder
         * 
         */
        public Builder performance(String performance) {
            return performance(Output.of(performance));
        }

        /**
         * @param placementSubregionName The name of the Subregion where the VM is placed.
         * 
         * @return builder
         * 
         */
        public Builder placementSubregionName(@Nullable Output<String> placementSubregionName) {
            $.placementSubregionName = placementSubregionName;
            return this;
        }

        /**
         * @param placementSubregionName The name of the Subregion where the VM is placed.
         * 
         * @return builder
         * 
         */
        public Builder placementSubregionName(String placementSubregionName) {
            return placementSubregionName(Output.of(placementSubregionName));
        }

        /**
         * @param placementTenancy The tenancy of the VM (`default` | `dedicated`).
         * 
         * @return builder
         * 
         */
        public Builder placementTenancy(@Nullable Output<String> placementTenancy) {
            $.placementTenancy = placementTenancy;
            return this;
        }

        /**
         * @param placementTenancy The tenancy of the VM (`default` | `dedicated`).
         * 
         * @return builder
         * 
         */
        public Builder placementTenancy(String placementTenancy) {
            return placementTenancy(Output.of(placementTenancy));
        }

        /**
         * @param primaryNics The primary network interface of the VM.
         * 
         * @return builder
         * 
         */
        public Builder primaryNics(@Nullable Output<List<VmPrimaryNicArgs>> primaryNics) {
            $.primaryNics = primaryNics;
            return this;
        }

        /**
         * @param primaryNics The primary network interface of the VM.
         * 
         * @return builder
         * 
         */
        public Builder primaryNics(List<VmPrimaryNicArgs> primaryNics) {
            return primaryNics(Output.of(primaryNics));
        }

        /**
         * @param primaryNics The primary network interface of the VM.
         * 
         * @return builder
         * 
         */
        public Builder primaryNics(VmPrimaryNicArgs... primaryNics) {
            return primaryNics(List.of(primaryNics));
        }

        /**
         * @param privateIps One or more private IPs of the VM.
         * 
         * @return builder
         * 
         */
        public Builder privateIps(@Nullable Output<List<String>> privateIps) {
            $.privateIps = privateIps;
            return this;
        }

        /**
         * @param privateIps One or more private IPs of the VM.
         * 
         * @return builder
         * 
         */
        public Builder privateIps(List<String> privateIps) {
            return privateIps(Output.of(privateIps));
        }

        /**
         * @param privateIps One or more private IPs of the VM.
         * 
         * @return builder
         * 
         */
        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }

        /**
         * @param securityGroupIds One or more IDs of security group for the VMs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds One or more IDs of security group for the VMs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds One or more IDs of security group for the VMs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param securityGroupNames One or more names of security groups for the VMs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupNames(@Nullable Output<List<String>> securityGroupNames) {
            $.securityGroupNames = securityGroupNames;
            return this;
        }

        /**
         * @param securityGroupNames One or more names of security groups for the VMs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupNames(List<String> securityGroupNames) {
            return securityGroupNames(Output.of(securityGroupNames));
        }

        /**
         * @param securityGroupNames One or more names of security groups for the VMs.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupNames(String... securityGroupNames) {
            return securityGroupNames(List.of(securityGroupNames));
        }

        /**
         * @param state The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subnetId The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<VmTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<VmTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(VmTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param userData Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param vmId The ID of the VM.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<String> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The ID of the VM.
         * 
         * @return builder
         * 
         */
        public Builder vmId(String vmId) {
            return vmId(Output.of(vmId));
        }

        /**
         * @param vmInitiatedShutdownBehavior The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
         * 
         * @return builder
         * 
         */
        public Builder vmInitiatedShutdownBehavior(@Nullable Output<String> vmInitiatedShutdownBehavior) {
            $.vmInitiatedShutdownBehavior = vmInitiatedShutdownBehavior;
            return this;
        }

        /**
         * @param vmInitiatedShutdownBehavior The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
         * 
         * @return builder
         * 
         */
        public Builder vmInitiatedShutdownBehavior(String vmInitiatedShutdownBehavior) {
            return vmInitiatedShutdownBehavior(Output.of(vmInitiatedShutdownBehavior));
        }

        /**
         * @param vmType The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.&lt;br /&gt; For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
         * 
         * @return builder
         * 
         */
        public Builder vmType(@Nullable Output<String> vmType) {
            $.vmType = vmType;
            return this;
        }

        /**
         * @param vmType The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.&lt;br /&gt; For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
         * 
         * @return builder
         * 
         */
        public Builder vmType(String vmType) {
            return vmType(Output.of(vmType));
        }

        public VmArgs build() {
            $.imageId = Objects.requireNonNull($.imageId, "expected parameter 'imageId' to be non-null");
            return $;
        }
    }

}
