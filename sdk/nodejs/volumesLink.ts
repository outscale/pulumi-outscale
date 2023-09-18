// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a volume link.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Volumes.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-volume).
 *
 * ## Example Usage
 * ### Required resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const volume01 = new outscale.Volume("volume01", {
 *     subregionName: `${_var.region}a`,
 *     size: 40,
 * });
 * const vm01 = new outscale.Vm("vm01", {
 *     imageId: _var.image_id,
 *     vmType: _var.vm_type,
 *     keypairName: _var.keypair_name,
 *     securityGroupIds: [_var.security_group_id],
 * });
 * ```
 * ### Link a volume to a VM
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const volumesLink01 = new outscale.VolumesLink("volumesLink01", {
 *     deviceName: "/dev/xvdc",
 *     volumeId: outscale_volume.volume01.id,
 *     vmId: outscale_vm.vm01.id,
 * });
 * ```
 *
 * ## Import
 *
 * A volume link can be imported using a volume ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/volumesLink:VolumesLink ImportedVolumeLink vol-12345678
 * ```
 */
export class VolumesLink extends pulumi.CustomResource {
    /**
     * Get an existing VolumesLink resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VolumesLinkState, opts?: pulumi.CustomResourceOptions): VolumesLink {
        return new VolumesLink(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/volumesLink:VolumesLink';

    /**
     * Returns true if the given object is an instance of VolumesLink.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VolumesLink {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VolumesLink.__pulumiType;
    }

    public readonly deleteOnVmTermination!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     */
    public readonly deviceName!: pulumi.Output<string>;
    public readonly forceUnlink!: pulumi.Output<boolean>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The state of the attachment of the volume (`attaching` | `detaching` | `attached` | `detached`).
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The ID of the VM you want to attach the volume to.
     */
    public readonly vmId!: pulumi.Output<string>;
    /**
     * The ID of the volume you want to attach.
     */
    public readonly volumeId!: pulumi.Output<string>;

    /**
     * Create a VolumesLink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VolumesLinkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VolumesLinkArgs | VolumesLinkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VolumesLinkState | undefined;
            resourceInputs["deleteOnVmTermination"] = state ? state.deleteOnVmTermination : undefined;
            resourceInputs["deviceName"] = state ? state.deviceName : undefined;
            resourceInputs["forceUnlink"] = state ? state.forceUnlink : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["vmId"] = state ? state.vmId : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
        } else {
            const args = argsOrState as VolumesLinkArgs | undefined;
            if ((!args || args.deviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceName'");
            }
            if ((!args || args.vmId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vmId'");
            }
            if ((!args || args.volumeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'volumeId'");
            }
            resourceInputs["deleteOnVmTermination"] = args ? args.deleteOnVmTermination : undefined;
            resourceInputs["deviceName"] = args ? args.deviceName : undefined;
            resourceInputs["forceUnlink"] = args ? args.forceUnlink : undefined;
            resourceInputs["vmId"] = args ? args.vmId : undefined;
            resourceInputs["volumeId"] = args ? args.volumeId : undefined;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VolumesLink.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VolumesLink resources.
 */
export interface VolumesLinkState {
    deleteOnVmTermination?: pulumi.Input<boolean>;
    /**
     * The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     */
    deviceName?: pulumi.Input<string>;
    forceUnlink?: pulumi.Input<boolean>;
    requestId?: pulumi.Input<string>;
    /**
     * The state of the attachment of the volume (`attaching` | `detaching` | `attached` | `detached`).
     */
    state?: pulumi.Input<string>;
    /**
     * The ID of the VM you want to attach the volume to.
     */
    vmId?: pulumi.Input<string>;
    /**
     * The ID of the volume you want to attach.
     */
    volumeId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VolumesLink resource.
 */
export interface VolumesLinkArgs {
    deleteOnVmTermination?: pulumi.Input<boolean>;
    /**
     * The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     */
    deviceName: pulumi.Input<string>;
    forceUnlink?: pulumi.Input<boolean>;
    /**
     * The ID of the VM you want to attach the volume to.
     */
    vmId: pulumi.Input<string>;
    /**
     * The ID of the volume you want to attach.
     */
    volumeId: pulumi.Input<string>;
}
