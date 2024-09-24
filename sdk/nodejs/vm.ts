// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a virtual machine (VM).
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Instances.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vm).
 *
 * ## Example Usage
 * ### Optional resource
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const keypair01 = new outscale.Keypair("keypair01", {keypairName: "terraform-keypair-for-vm"});
 * ```
 * ### Create a VM with block device mappings
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const vm02 = new outscale.Vm("vm02", {
 *     imageId: _var.image_id,
 *     vmType: _var.vm_type,
 *     keypairName: _var.keypair_name,
 *     blockDeviceMappings: [
 *         {
 *             deviceName: "/dev/sda1",
 *             bsu: {
 *                 volumeSize: 15,
 *                 volumeType: "gp2",
 *                 snapshotId: _var.snapshot_id,
 *             },
 *         },
 *         {
 *             deviceName: "/dev/sdb",
 *             bsu: {
 *                 volumeSize: 22,
 *                 volumeType: "io1",
 *                 iops: 150,
 *                 deleteOnVmDeletion: true,
 *             },
 *         },
 *     ],
 * });
 * ```
 * ### Create a VM in a Net with a network
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const net01 = new outscale.Net("net01", {
 *     ipRange: "10.0.0.0/16",
 *     tags: [{
 *         key: "name",
 *         value: "terraform-net-for-vm",
 *     }],
 * });
 * const subnet01 = new outscale.Subnet("subnet01", {
 *     netId: net01.netId,
 *     ipRange: "10.0.0.0/24",
 *     subregionName: "eu-west-2b",
 *     tags: [{
 *         key: "name",
 *         value: "terraform-subnet-for-vm",
 *     }],
 * });
 * const securityGroup01 = new outscale.SecurityGroup("securityGroup01", {
 *     description: "Terraform security group for VM",
 *     securityGroupName: "terraform-security-group-for-vm",
 *     netId: net01.netId,
 * });
 * const internetService01 = new outscale.InternetService("internetService01", {});
 * const routeTable01 = new outscale.RouteTable("routeTable01", {
 *     netId: net01.netId,
 *     tags: [{
 *         key: "name",
 *         value: "terraform-route-table-for-vm",
 *     }],
 * });
 * const routeTableLink01 = new outscale.RouteTableLink("routeTableLink01", {
 *     routeTableId: routeTable01.routeTableId,
 *     subnetId: subnet01.subnetId,
 * });
 * const internetServiceLink01 = new outscale.InternetServiceLink("internetServiceLink01", {
 *     internetServiceId: internetService01.internetServiceId,
 *     netId: net01.netId,
 * });
 * const route01 = new outscale.Route("route01", {
 *     gatewayId: internetService01.internetServiceId,
 *     destinationIpRange: "0.0.0.0/0",
 *     routeTableId: routeTable01.routeTableId,
 * });
 * const vm03 = new outscale.Vm("vm03", {
 *     imageId: _var.image_id,
 *     vmType: _var.vm_type,
 *     keypairName: _var.keypair_name,
 *     securityGroupIds: [securityGroup01.securityGroupId],
 *     subnetId: subnet01.subnetId,
 * });
 * ```
 * ### Create a VM with a NIC
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const net02 = new outscale.Net("net02", {
 *     ipRange: "10.0.0.0/16",
 *     tags: [{
 *         key: "name",
 *         value: "terraform-net-for-vm-with-nic",
 *     }],
 * });
 * const subnet02 = new outscale.Subnet("subnet02", {
 *     netId: net02.netId,
 *     ipRange: "10.0.0.0/24",
 *     subregionName: "eu-west-2a",
 *     tags: [{
 *         key: "name",
 *         value: "terraform-subnet-for-vm-with-nic",
 *     }],
 * });
 * const nic01 = new outscale.Nic("nic01", {subnetId: subnet02.subnetId});
 * const vm04 = new outscale.Vm("vm04", {
 *     imageId: _var.image_id,
 *     vmType: "c4.large",
 *     keypairName: _var.keypair_name,
 *     primaryNics: [{
 *         nicId: nic01.nicId,
 *         deviceNumber: 0,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * A VM can be imported using its ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/vm:Vm ImportedVm i-12345678
 * ```
 */
export class Vm extends pulumi.CustomResource {
    /**
     * Get an existing Vm resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VmState, opts?: pulumi.CustomResourceOptions): Vm {
        return new Vm(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/vm:Vm';

    /**
     * Returns true if the given object is an instance of Vm.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Vm {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Vm.__pulumiType;
    }

    public /*out*/ readonly adminPassword!: pulumi.Output<string>;
    /**
     * The architecture of the VM (`i386` \| `x8664`).
     */
    public /*out*/ readonly architecture!: pulumi.Output<string>;
    /**
     * One or more block device mappings.
     */
    public readonly blockDeviceMappings!: pulumi.Output<outputs.VmBlockDeviceMapping[] | undefined>;
    /**
     * The block device mapping of the VM.
     */
    public /*out*/ readonly blockDeviceMappingsCreateds!: pulumi.Output<outputs.VmBlockDeviceMappingsCreated[]>;
    public readonly bsuOptimized!: pulumi.Output<boolean>;
    /**
     * A unique identifier which enables you to manage the idempotency.
     */
    public /*out*/ readonly clientToken!: pulumi.Output<string>;
    /**
     * The date and time of creation of the VM.
     */
    public /*out*/ readonly creationDate!: pulumi.Output<string>;
    /**
     * If true, you cannot delete the VM unless you change this parameter back to false.
     */
    public readonly deletionProtection!: pulumi.Output<boolean>;
    /**
     * (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `adminPassword` attribute.
     */
    public readonly getAdminPassword!: pulumi.Output<boolean | undefined>;
    /**
     * The hypervisor type of the VMs (`ovm` \| `xen`).
     */
    public /*out*/ readonly hypervisor!: pulumi.Output<string>;
    /**
     * The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
     */
    public readonly imageId!: pulumi.Output<string>;
    /**
     * (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     */
    public readonly isSourceDestChecked!: pulumi.Output<boolean>;
    /**
     * The name of the keypair.
     */
    public readonly keypairName!: pulumi.Output<string>;
    /**
     * The number for the VM when launching a group of several VMs (for example, `0`, `1`, `2`, and so on).
     */
    public /*out*/ readonly launchNumber!: pulumi.Output<number>;
    /**
     * (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
     */
    public readonly nestedVirtualization!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the Net for the NIC.
     */
    public /*out*/ readonly netId!: pulumi.Output<string>;
    /**
     * One or more NICs. If you specify this parameter, you must not specify the `subnetId` and `subregionName` parameters. To define a NIC as the primary network interface of the VM, use the `primaryNic` argument.
     */
    public readonly nics!: pulumi.Output<outputs.VmNic[]>;
    /**
     * Indicates the operating system (OS) of the VM.
     */
    public /*out*/ readonly osFamily!: pulumi.Output<string>;
    /**
     * The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
     */
    public readonly performance!: pulumi.Output<string>;
    /**
     * The name of the Subregion where the VM is placed.
     */
    public readonly placementSubregionName!: pulumi.Output<string>;
    /**
     * The tenancy of the VM (`default` | `dedicated`).
     */
    public readonly placementTenancy!: pulumi.Output<string>;
    /**
     * The primary network interface of the VM.
     */
    public readonly primaryNics!: pulumi.Output<outputs.VmPrimaryNic[]>;
    /**
     * The name of the private DNS.
     */
    public /*out*/ readonly privateDnsName!: pulumi.Output<string>;
    /**
     * The private IP of the NIC.
     */
    public /*out*/ readonly privateIp!: pulumi.Output<string>;
    /**
     * One or more private IPs of the VM.
     */
    public readonly privateIps!: pulumi.Output<string[] | undefined>;
    /**
     * The product codes associated with the OMI used to create the VM.
     */
    public /*out*/ readonly productCodes!: pulumi.Output<string[]>;
    /**
     * The name of the public DNS.
     */
    public /*out*/ readonly publicDnsName!: pulumi.Output<string>;
    /**
     * The public IP of the VM.
     */
    public /*out*/ readonly publicIp!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The reservation ID of the VM.
     */
    public /*out*/ readonly reservationId!: pulumi.Output<string>;
    /**
     * The name of the root device for the VM (for example, `/dev/vda1`).
     */
    public /*out*/ readonly rootDeviceName!: pulumi.Output<string>;
    /**
     * The type of root device used by the VM (always `bsu`).
     */
    public /*out*/ readonly rootDeviceType!: pulumi.Output<string>;
    /**
     * One or more IDs of security group for the VMs.
     */
    public readonly securityGroupIds!: pulumi.Output<string[] | undefined>;
    /**
     * One or more names of security groups for the VMs.
     */
    public readonly securityGroupNames!: pulumi.Output<string[] | undefined>;
    /**
     * One or more security groups associated with the VM.
     */
    public /*out*/ readonly securityGroups!: pulumi.Output<outputs.VmSecurityGroup[]>;
    /**
     * The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vmInitiatedShutdownBehavior` argument.
     */
    public readonly state!: pulumi.Output<string | undefined>;
    /**
     * The reason explaining the current state of the VM.
     */
    public /*out*/ readonly stateReason!: pulumi.Output<string>;
    /**
     * The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
     */
    public readonly subnetId!: pulumi.Output<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    public readonly tags!: pulumi.Output<outputs.VmTag[] | undefined>;
    /**
     * Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
     */
    public readonly userData!: pulumi.Output<string | undefined>;
    /**
     * The ID of the VM.
     */
    public readonly vmId!: pulumi.Output<string>;
    /**
     * The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
     */
    public readonly vmInitiatedShutdownBehavior!: pulumi.Output<string>;
    /**
     * The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.<br /> For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
     */
    public readonly vmType!: pulumi.Output<string>;

    /**
     * Create a Vm resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VmArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VmArgs | VmState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VmState | undefined;
            resourceInputs["adminPassword"] = state ? state.adminPassword : undefined;
            resourceInputs["architecture"] = state ? state.architecture : undefined;
            resourceInputs["blockDeviceMappings"] = state ? state.blockDeviceMappings : undefined;
            resourceInputs["blockDeviceMappingsCreateds"] = state ? state.blockDeviceMappingsCreateds : undefined;
            resourceInputs["bsuOptimized"] = state ? state.bsuOptimized : undefined;
            resourceInputs["clientToken"] = state ? state.clientToken : undefined;
            resourceInputs["creationDate"] = state ? state.creationDate : undefined;
            resourceInputs["deletionProtection"] = state ? state.deletionProtection : undefined;
            resourceInputs["getAdminPassword"] = state ? state.getAdminPassword : undefined;
            resourceInputs["hypervisor"] = state ? state.hypervisor : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["isSourceDestChecked"] = state ? state.isSourceDestChecked : undefined;
            resourceInputs["keypairName"] = state ? state.keypairName : undefined;
            resourceInputs["launchNumber"] = state ? state.launchNumber : undefined;
            resourceInputs["nestedVirtualization"] = state ? state.nestedVirtualization : undefined;
            resourceInputs["netId"] = state ? state.netId : undefined;
            resourceInputs["nics"] = state ? state.nics : undefined;
            resourceInputs["osFamily"] = state ? state.osFamily : undefined;
            resourceInputs["performance"] = state ? state.performance : undefined;
            resourceInputs["placementSubregionName"] = state ? state.placementSubregionName : undefined;
            resourceInputs["placementTenancy"] = state ? state.placementTenancy : undefined;
            resourceInputs["primaryNics"] = state ? state.primaryNics : undefined;
            resourceInputs["privateDnsName"] = state ? state.privateDnsName : undefined;
            resourceInputs["privateIp"] = state ? state.privateIp : undefined;
            resourceInputs["privateIps"] = state ? state.privateIps : undefined;
            resourceInputs["productCodes"] = state ? state.productCodes : undefined;
            resourceInputs["publicDnsName"] = state ? state.publicDnsName : undefined;
            resourceInputs["publicIp"] = state ? state.publicIp : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["reservationId"] = state ? state.reservationId : undefined;
            resourceInputs["rootDeviceName"] = state ? state.rootDeviceName : undefined;
            resourceInputs["rootDeviceType"] = state ? state.rootDeviceType : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["securityGroupNames"] = state ? state.securityGroupNames : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["stateReason"] = state ? state.stateReason : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userData"] = state ? state.userData : undefined;
            resourceInputs["vmId"] = state ? state.vmId : undefined;
            resourceInputs["vmInitiatedShutdownBehavior"] = state ? state.vmInitiatedShutdownBehavior : undefined;
            resourceInputs["vmType"] = state ? state.vmType : undefined;
        } else {
            const args = argsOrState as VmArgs | undefined;
            if ((!args || args.imageId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'imageId'");
            }
            resourceInputs["blockDeviceMappings"] = args ? args.blockDeviceMappings : undefined;
            resourceInputs["bsuOptimized"] = args ? args.bsuOptimized : undefined;
            resourceInputs["deletionProtection"] = args ? args.deletionProtection : undefined;
            resourceInputs["getAdminPassword"] = args ? args.getAdminPassword : undefined;
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["isSourceDestChecked"] = args ? args.isSourceDestChecked : undefined;
            resourceInputs["keypairName"] = args ? args.keypairName : undefined;
            resourceInputs["nestedVirtualization"] = args ? args.nestedVirtualization : undefined;
            resourceInputs["nics"] = args ? args.nics : undefined;
            resourceInputs["performance"] = args ? args.performance : undefined;
            resourceInputs["placementSubregionName"] = args ? args.placementSubregionName : undefined;
            resourceInputs["placementTenancy"] = args ? args.placementTenancy : undefined;
            resourceInputs["primaryNics"] = args ? args.primaryNics : undefined;
            resourceInputs["privateIps"] = args ? args.privateIps : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["securityGroupNames"] = args ? args.securityGroupNames : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userData"] = args ? args.userData : undefined;
            resourceInputs["vmId"] = args ? args.vmId : undefined;
            resourceInputs["vmInitiatedShutdownBehavior"] = args ? args.vmInitiatedShutdownBehavior : undefined;
            resourceInputs["vmType"] = args ? args.vmType : undefined;
            resourceInputs["adminPassword"] = undefined /*out*/;
            resourceInputs["architecture"] = undefined /*out*/;
            resourceInputs["blockDeviceMappingsCreateds"] = undefined /*out*/;
            resourceInputs["clientToken"] = undefined /*out*/;
            resourceInputs["creationDate"] = undefined /*out*/;
            resourceInputs["hypervisor"] = undefined /*out*/;
            resourceInputs["launchNumber"] = undefined /*out*/;
            resourceInputs["netId"] = undefined /*out*/;
            resourceInputs["osFamily"] = undefined /*out*/;
            resourceInputs["privateDnsName"] = undefined /*out*/;
            resourceInputs["privateIp"] = undefined /*out*/;
            resourceInputs["productCodes"] = undefined /*out*/;
            resourceInputs["publicDnsName"] = undefined /*out*/;
            resourceInputs["publicIp"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["reservationId"] = undefined /*out*/;
            resourceInputs["rootDeviceName"] = undefined /*out*/;
            resourceInputs["rootDeviceType"] = undefined /*out*/;
            resourceInputs["securityGroups"] = undefined /*out*/;
            resourceInputs["stateReason"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Vm.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Vm resources.
 */
export interface VmState {
    adminPassword?: pulumi.Input<string>;
    /**
     * The architecture of the VM (`i386` \| `x8664`).
     */
    architecture?: pulumi.Input<string>;
    /**
     * One or more block device mappings.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.VmBlockDeviceMapping>[]>;
    /**
     * The block device mapping of the VM.
     */
    blockDeviceMappingsCreateds?: pulumi.Input<pulumi.Input<inputs.VmBlockDeviceMappingsCreated>[]>;
    bsuOptimized?: pulumi.Input<boolean>;
    /**
     * A unique identifier which enables you to manage the idempotency.
     */
    clientToken?: pulumi.Input<string>;
    /**
     * The date and time of creation of the VM.
     */
    creationDate?: pulumi.Input<string>;
    /**
     * If true, you cannot delete the VM unless you change this parameter back to false.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `adminPassword` attribute.
     */
    getAdminPassword?: pulumi.Input<boolean>;
    /**
     * The hypervisor type of the VMs (`ovm` \| `xen`).
     */
    hypervisor?: pulumi.Input<string>;
    /**
     * The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
     */
    imageId?: pulumi.Input<string>;
    /**
     * (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     */
    isSourceDestChecked?: pulumi.Input<boolean>;
    /**
     * The name of the keypair.
     */
    keypairName?: pulumi.Input<string>;
    /**
     * The number for the VM when launching a group of several VMs (for example, `0`, `1`, `2`, and so on).
     */
    launchNumber?: pulumi.Input<number>;
    /**
     * (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
     */
    nestedVirtualization?: pulumi.Input<boolean>;
    /**
     * The ID of the Net for the NIC.
     */
    netId?: pulumi.Input<string>;
    /**
     * One or more NICs. If you specify this parameter, you must not specify the `subnetId` and `subregionName` parameters. To define a NIC as the primary network interface of the VM, use the `primaryNic` argument.
     */
    nics?: pulumi.Input<pulumi.Input<inputs.VmNic>[]>;
    /**
     * Indicates the operating system (OS) of the VM.
     */
    osFamily?: pulumi.Input<string>;
    /**
     * The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
     */
    performance?: pulumi.Input<string>;
    /**
     * The name of the Subregion where the VM is placed.
     */
    placementSubregionName?: pulumi.Input<string>;
    /**
     * The tenancy of the VM (`default` | `dedicated`).
     */
    placementTenancy?: pulumi.Input<string>;
    /**
     * The primary network interface of the VM.
     */
    primaryNics?: pulumi.Input<pulumi.Input<inputs.VmPrimaryNic>[]>;
    /**
     * The name of the private DNS.
     */
    privateDnsName?: pulumi.Input<string>;
    /**
     * The private IP of the NIC.
     */
    privateIp?: pulumi.Input<string>;
    /**
     * One or more private IPs of the VM.
     */
    privateIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The product codes associated with the OMI used to create the VM.
     */
    productCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the public DNS.
     */
    publicDnsName?: pulumi.Input<string>;
    /**
     * The public IP of the VM.
     */
    publicIp?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    /**
     * The reservation ID of the VM.
     */
    reservationId?: pulumi.Input<string>;
    /**
     * The name of the root device for the VM (for example, `/dev/vda1`).
     */
    rootDeviceName?: pulumi.Input<string>;
    /**
     * The type of root device used by the VM (always `bsu`).
     */
    rootDeviceType?: pulumi.Input<string>;
    /**
     * One or more IDs of security group for the VMs.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more names of security groups for the VMs.
     */
    securityGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more security groups associated with the VM.
     */
    securityGroups?: pulumi.Input<pulumi.Input<inputs.VmSecurityGroup>[]>;
    /**
     * The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vmInitiatedShutdownBehavior` argument.
     */
    state?: pulumi.Input<string>;
    /**
     * The reason explaining the current state of the VM.
     */
    stateReason?: pulumi.Input<string>;
    /**
     * The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
     */
    subnetId?: pulumi.Input<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.VmTag>[]>;
    /**
     * Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
     */
    userData?: pulumi.Input<string>;
    /**
     * The ID of the VM.
     */
    vmId?: pulumi.Input<string>;
    /**
     * The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
     */
    vmInitiatedShutdownBehavior?: pulumi.Input<string>;
    /**
     * The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.<br /> For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
     */
    vmType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Vm resource.
 */
export interface VmArgs {
    /**
     * One or more block device mappings.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.VmBlockDeviceMapping>[]>;
    bsuOptimized?: pulumi.Input<boolean>;
    /**
     * If true, you cannot delete the VM unless you change this parameter back to false.
     */
    deletionProtection?: pulumi.Input<boolean>;
    /**
     * (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `adminPassword` attribute.
     */
    getAdminPassword?: pulumi.Input<boolean>;
    /**
     * The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
     */
    imageId: pulumi.Input<string>;
    /**
     * (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     */
    isSourceDestChecked?: pulumi.Input<boolean>;
    /**
     * The name of the keypair.
     */
    keypairName?: pulumi.Input<string>;
    /**
     * (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
     */
    nestedVirtualization?: pulumi.Input<boolean>;
    /**
     * One or more NICs. If you specify this parameter, you must not specify the `subnetId` and `subregionName` parameters. To define a NIC as the primary network interface of the VM, use the `primaryNic` argument.
     */
    nics?: pulumi.Input<pulumi.Input<inputs.VmNic>[]>;
    /**
     * The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
     */
    performance?: pulumi.Input<string>;
    /**
     * The name of the Subregion where the VM is placed.
     */
    placementSubregionName?: pulumi.Input<string>;
    /**
     * The tenancy of the VM (`default` | `dedicated`).
     */
    placementTenancy?: pulumi.Input<string>;
    /**
     * The primary network interface of the VM.
     */
    primaryNics?: pulumi.Input<pulumi.Input<inputs.VmPrimaryNic>[]>;
    /**
     * One or more private IPs of the VM.
     */
    privateIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more IDs of security group for the VMs.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more names of security groups for the VMs.
     */
    securityGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vmInitiatedShutdownBehavior` argument.
     */
    state?: pulumi.Input<string>;
    /**
     * The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
     */
    subnetId?: pulumi.Input<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.VmTag>[]>;
    /**
     * Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
     */
    userData?: pulumi.Input<string>;
    /**
     * The ID of the VM.
     */
    vmId?: pulumi.Input<string>;
    /**
     * The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
     */
    vmInitiatedShutdownBehavior?: pulumi.Input<string>;
    /**
     * The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.<br /> For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
     */
    vmType?: pulumi.Input<string>;
}
