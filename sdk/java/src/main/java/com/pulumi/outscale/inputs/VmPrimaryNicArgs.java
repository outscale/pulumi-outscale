// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.VmPrimaryNicLinkNicArgs;
import com.pulumi.outscale.inputs.VmPrimaryNicLinkPublicIpArgs;
import com.pulumi.outscale.inputs.VmPrimaryNicPrivateIpArgs;
import com.pulumi.outscale.inputs.VmPrimaryNicSecurityGroupArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VmPrimaryNicArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmPrimaryNicArgs Empty = new VmPrimaryNicArgs();

    /**
     * The account ID of the owner of the NIC.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account ID of the owner of the NIC.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
     * 
     */
    @Import(name="deleteOnVmDeletion")
    private @Nullable Output<Boolean> deleteOnVmDeletion;

    /**
     * @return If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
     * 
     */
    public Optional<Output<Boolean>> deleteOnVmDeletion() {
        return Optional.ofNullable(this.deleteOnVmDeletion);
    }

    /**
     * The description of the NIC, if you are creating a NIC when creating the VM.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the NIC, if you are creating a NIC when creating the VM.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The index of the VM device for the NIC attachment (must be `0`). This parameter is required if you create a NIC when creating the VM.
     * 
     */
    @Import(name="deviceNumber", required=true)
    private Output<Integer> deviceNumber;

    /**
     * @return The index of the VM device for the NIC attachment (must be `0`). This parameter is required if you create a NIC when creating the VM.
     * 
     */
    public Output<Integer> deviceNumber() {
        return this.deviceNumber;
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
     * Information about the network interface card (NIC).
     * 
     */
    @Import(name="linkNics")
    private @Nullable Output<List<VmPrimaryNicLinkNicArgs>> linkNics;

    /**
     * @return Information about the network interface card (NIC).
     * 
     */
    public Optional<Output<List<VmPrimaryNicLinkNicArgs>>> linkNics() {
        return Optional.ofNullable(this.linkNics);
    }

    /**
     * Information about the public IP associated with the NIC.
     * 
     */
    @Import(name="linkPublicIps")
    private @Nullable Output<List<VmPrimaryNicLinkPublicIpArgs>> linkPublicIps;

    /**
     * @return Information about the public IP associated with the NIC.
     * 
     */
    public Optional<Output<List<VmPrimaryNicLinkPublicIpArgs>>> linkPublicIps() {
        return Optional.ofNullable(this.linkPublicIps);
    }

    /**
     * The Media Access Control (MAC) address of the NIC.
     * 
     */
    @Import(name="macAddress")
    private @Nullable Output<String> macAddress;

    /**
     * @return The Media Access Control (MAC) address of the NIC.
     * 
     */
    public Optional<Output<String>> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }

    /**
     * The ID of the Net for the NIC.
     * 
     */
    @Import(name="netId")
    private @Nullable Output<String> netId;

    /**
     * @return The ID of the Net for the NIC.
     * 
     */
    public Optional<Output<String>> netId() {
        return Optional.ofNullable(this.netId);
    }

    /**
     * The ID of the NIC, if you are attaching an existing NIC when creating a VM.
     * 
     */
    @Import(name="nicId")
    private @Nullable Output<String> nicId;

    /**
     * @return The ID of the NIC, if you are attaching an existing NIC when creating a VM.
     * 
     */
    public Optional<Output<String>> nicId() {
        return Optional.ofNullable(this.nicId);
    }

    /**
     * The name of the private DNS.
     * 
     */
    @Import(name="privateDnsName")
    private @Nullable Output<String> privateDnsName;

    /**
     * @return The name of the private DNS.
     * 
     */
    public Optional<Output<String>> privateDnsName() {
        return Optional.ofNullable(this.privateDnsName);
    }

    /**
     * One or more private IPs of the VM.
     * 
     */
    @Import(name="privateIps")
    private @Nullable Output<List<VmPrimaryNicPrivateIpArgs>> privateIps;

    /**
     * @return One or more private IPs of the VM.
     * 
     */
    public Optional<Output<List<VmPrimaryNicPrivateIpArgs>>> privateIps() {
        return Optional.ofNullable(this.privateIps);
    }

    /**
     * The number of secondary private IPs, if you create a NIC when creating a VM. This parameter cannot be specified if you specified more than one private IP in the `private_ips` parameter.
     * 
     */
    @Import(name="secondaryPrivateIpCount")
    private @Nullable Output<Integer> secondaryPrivateIpCount;

    /**
     * @return The number of secondary private IPs, if you create a NIC when creating a VM. This parameter cannot be specified if you specified more than one private IP in the `private_ips` parameter.
     * 
     */
    public Optional<Output<Integer>> secondaryPrivateIpCount() {
        return Optional.ofNullable(this.secondaryPrivateIpCount);
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
     * One or more security groups associated with the VM.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<VmPrimaryNicSecurityGroupArgs>> securityGroups;

    /**
     * @return One or more security groups associated with the VM.
     * 
     */
    public Optional<Output<List<VmPrimaryNicSecurityGroupArgs>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
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

    private VmPrimaryNicArgs() {}

    private VmPrimaryNicArgs(VmPrimaryNicArgs $) {
        this.accountId = $.accountId;
        this.deleteOnVmDeletion = $.deleteOnVmDeletion;
        this.description = $.description;
        this.deviceNumber = $.deviceNumber;
        this.isSourceDestChecked = $.isSourceDestChecked;
        this.linkNics = $.linkNics;
        this.linkPublicIps = $.linkPublicIps;
        this.macAddress = $.macAddress;
        this.netId = $.netId;
        this.nicId = $.nicId;
        this.privateDnsName = $.privateDnsName;
        this.privateIps = $.privateIps;
        this.secondaryPrivateIpCount = $.secondaryPrivateIpCount;
        this.securityGroupIds = $.securityGroupIds;
        this.securityGroups = $.securityGroups;
        this.state = $.state;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmPrimaryNicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmPrimaryNicArgs $;

        public Builder() {
            $ = new VmPrimaryNicArgs();
        }

        public Builder(VmPrimaryNicArgs defaults) {
            $ = new VmPrimaryNicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID of the owner of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID of the owner of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param deleteOnVmDeletion If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
         * 
         * @return builder
         * 
         */
        public Builder deleteOnVmDeletion(@Nullable Output<Boolean> deleteOnVmDeletion) {
            $.deleteOnVmDeletion = deleteOnVmDeletion;
            return this;
        }

        /**
         * @param deleteOnVmDeletion If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
         * 
         * @return builder
         * 
         */
        public Builder deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
            return deleteOnVmDeletion(Output.of(deleteOnVmDeletion));
        }

        /**
         * @param description The description of the NIC, if you are creating a NIC when creating the VM.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the NIC, if you are creating a NIC when creating the VM.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param deviceNumber The index of the VM device for the NIC attachment (must be `0`). This parameter is required if you create a NIC when creating the VM.
         * 
         * @return builder
         * 
         */
        public Builder deviceNumber(Output<Integer> deviceNumber) {
            $.deviceNumber = deviceNumber;
            return this;
        }

        /**
         * @param deviceNumber The index of the VM device for the NIC attachment (must be `0`). This parameter is required if you create a NIC when creating the VM.
         * 
         * @return builder
         * 
         */
        public Builder deviceNumber(Integer deviceNumber) {
            return deviceNumber(Output.of(deviceNumber));
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
         * @param linkNics Information about the network interface card (NIC).
         * 
         * @return builder
         * 
         */
        public Builder linkNics(@Nullable Output<List<VmPrimaryNicLinkNicArgs>> linkNics) {
            $.linkNics = linkNics;
            return this;
        }

        /**
         * @param linkNics Information about the network interface card (NIC).
         * 
         * @return builder
         * 
         */
        public Builder linkNics(List<VmPrimaryNicLinkNicArgs> linkNics) {
            return linkNics(Output.of(linkNics));
        }

        /**
         * @param linkNics Information about the network interface card (NIC).
         * 
         * @return builder
         * 
         */
        public Builder linkNics(VmPrimaryNicLinkNicArgs... linkNics) {
            return linkNics(List.of(linkNics));
        }

        /**
         * @param linkPublicIps Information about the public IP associated with the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIps(@Nullable Output<List<VmPrimaryNicLinkPublicIpArgs>> linkPublicIps) {
            $.linkPublicIps = linkPublicIps;
            return this;
        }

        /**
         * @param linkPublicIps Information about the public IP associated with the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIps(List<VmPrimaryNicLinkPublicIpArgs> linkPublicIps) {
            return linkPublicIps(Output.of(linkPublicIps));
        }

        /**
         * @param linkPublicIps Information about the public IP associated with the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIps(VmPrimaryNicLinkPublicIpArgs... linkPublicIps) {
            return linkPublicIps(List.of(linkPublicIps));
        }

        /**
         * @param macAddress The Media Access Control (MAC) address of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder macAddress(@Nullable Output<String> macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        /**
         * @param macAddress The Media Access Control (MAC) address of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder macAddress(String macAddress) {
            return macAddress(Output.of(macAddress));
        }

        /**
         * @param netId The ID of the Net for the NIC.
         * 
         * @return builder
         * 
         */
        public Builder netId(@Nullable Output<String> netId) {
            $.netId = netId;
            return this;
        }

        /**
         * @param netId The ID of the Net for the NIC.
         * 
         * @return builder
         * 
         */
        public Builder netId(String netId) {
            return netId(Output.of(netId));
        }

        /**
         * @param nicId The ID of the NIC, if you are attaching an existing NIC when creating a VM.
         * 
         * @return builder
         * 
         */
        public Builder nicId(@Nullable Output<String> nicId) {
            $.nicId = nicId;
            return this;
        }

        /**
         * @param nicId The ID of the NIC, if you are attaching an existing NIC when creating a VM.
         * 
         * @return builder
         * 
         */
        public Builder nicId(String nicId) {
            return nicId(Output.of(nicId));
        }

        /**
         * @param privateDnsName The name of the private DNS.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsName(@Nullable Output<String> privateDnsName) {
            $.privateDnsName = privateDnsName;
            return this;
        }

        /**
         * @param privateDnsName The name of the private DNS.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsName(String privateDnsName) {
            return privateDnsName(Output.of(privateDnsName));
        }

        /**
         * @param privateIps One or more private IPs of the VM.
         * 
         * @return builder
         * 
         */
        public Builder privateIps(@Nullable Output<List<VmPrimaryNicPrivateIpArgs>> privateIps) {
            $.privateIps = privateIps;
            return this;
        }

        /**
         * @param privateIps One or more private IPs of the VM.
         * 
         * @return builder
         * 
         */
        public Builder privateIps(List<VmPrimaryNicPrivateIpArgs> privateIps) {
            return privateIps(Output.of(privateIps));
        }

        /**
         * @param privateIps One or more private IPs of the VM.
         * 
         * @return builder
         * 
         */
        public Builder privateIps(VmPrimaryNicPrivateIpArgs... privateIps) {
            return privateIps(List.of(privateIps));
        }

        /**
         * @param secondaryPrivateIpCount The number of secondary private IPs, if you create a NIC when creating a VM. This parameter cannot be specified if you specified more than one private IP in the `private_ips` parameter.
         * 
         * @return builder
         * 
         */
        public Builder secondaryPrivateIpCount(@Nullable Output<Integer> secondaryPrivateIpCount) {
            $.secondaryPrivateIpCount = secondaryPrivateIpCount;
            return this;
        }

        /**
         * @param secondaryPrivateIpCount The number of secondary private IPs, if you create a NIC when creating a VM. This parameter cannot be specified if you specified more than one private IP in the `private_ips` parameter.
         * 
         * @return builder
         * 
         */
        public Builder secondaryPrivateIpCount(Integer secondaryPrivateIpCount) {
            return secondaryPrivateIpCount(Output.of(secondaryPrivateIpCount));
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
         * @param securityGroups One or more security groups associated with the VM.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<VmPrimaryNicSecurityGroupArgs>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups One or more security groups associated with the VM.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<VmPrimaryNicSecurityGroupArgs> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups One or more security groups associated with the VM.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(VmPrimaryNicSecurityGroupArgs... securityGroups) {
            return securityGroups(List.of(securityGroups));
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

        public VmPrimaryNicArgs build() {
            $.deviceNumber = Objects.requireNonNull($.deviceNumber, "expected parameter 'deviceNumber' to be non-null");
            return $;
        }
    }

}
