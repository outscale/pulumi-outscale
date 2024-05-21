// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a NIC's private IPs.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-FNIs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-nic).
 *
 * ## Example Usage
 * ### Required resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const net01 = new outscale.Net("net01", {ipRange: "10.0.0.0/16"});
 * const subnet01 = new outscale.Subnet("subnet01", {
 *     subregionName: `${_var.region}a`,
 *     ipRange: "10.0.0.0/16",
 *     netId: net01.netId,
 * });
 * const nic01 = new outscale.Nic("nic01", {subnetId: subnet01.subnetId});
 * ```
 * ### Link a specific secondary private IP address to a NIC
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const nicPrivateIp01 = new outscale.NicPrivateIp("nicPrivateIp01", {
 *     nicId: outscale_nic.nic01.nic_id,
 *     privateIps: [
 *         "10.0.12.34",
 *         "10.0.12.35",
 *     ],
 * });
 * ```
 * ### Link several automatic secondary private IP addresses to a NIC
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const nicPrivateIp02 = new outscale.NicPrivateIp("nicPrivateIp02", {
 *     nicId: outscale_nic.nic01.nic_id,
 *     secondaryPrivateIpCount: 2,
 * });
 * ```
 */
export class NicPrivateIp extends pulumi.CustomResource {
    /**
     * Get an existing NicPrivateIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NicPrivateIpState, opts?: pulumi.CustomResourceOptions): NicPrivateIp {
        return new NicPrivateIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/nicPrivateIp:NicPrivateIp';

    /**
     * Returns true if the given object is an instance of NicPrivateIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NicPrivateIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NicPrivateIp.__pulumiType;
    }

    /**
     * If true, allows an IP that is already assigned to another NIC in the same Subnet to be assigned to the NIC you specified.
     */
    public readonly allowRelink!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the NIC.
     */
    public readonly nicId!: pulumi.Output<string>;
    public /*out*/ readonly primaryPrivateIp!: pulumi.Output<string>;
    /**
     * The secondary private IP or IPs you want to assign to the NIC within the IP range of the Subnet.
     */
    public readonly privateIps!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The number of secondary private IPs to assign to the NIC.
     */
    public readonly secondaryPrivateIpCount!: pulumi.Output<number>;

    /**
     * Create a NicPrivateIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NicPrivateIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NicPrivateIpArgs | NicPrivateIpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NicPrivateIpState | undefined;
            resourceInputs["allowRelink"] = state ? state.allowRelink : undefined;
            resourceInputs["nicId"] = state ? state.nicId : undefined;
            resourceInputs["primaryPrivateIp"] = state ? state.primaryPrivateIp : undefined;
            resourceInputs["privateIps"] = state ? state.privateIps : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["secondaryPrivateIpCount"] = state ? state.secondaryPrivateIpCount : undefined;
        } else {
            const args = argsOrState as NicPrivateIpArgs | undefined;
            if ((!args || args.nicId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nicId'");
            }
            resourceInputs["allowRelink"] = args ? args.allowRelink : undefined;
            resourceInputs["nicId"] = args ? args.nicId : undefined;
            resourceInputs["privateIps"] = args ? args.privateIps : undefined;
            resourceInputs["secondaryPrivateIpCount"] = args ? args.secondaryPrivateIpCount : undefined;
            resourceInputs["primaryPrivateIp"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NicPrivateIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NicPrivateIp resources.
 */
export interface NicPrivateIpState {
    /**
     * If true, allows an IP that is already assigned to another NIC in the same Subnet to be assigned to the NIC you specified.
     */
    allowRelink?: pulumi.Input<boolean>;
    /**
     * The ID of the NIC.
     */
    nicId?: pulumi.Input<string>;
    primaryPrivateIp?: pulumi.Input<string>;
    /**
     * The secondary private IP or IPs you want to assign to the NIC within the IP range of the Subnet.
     */
    privateIps?: pulumi.Input<pulumi.Input<string>[]>;
    requestId?: pulumi.Input<string>;
    /**
     * The number of secondary private IPs to assign to the NIC.
     */
    secondaryPrivateIpCount?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a NicPrivateIp resource.
 */
export interface NicPrivateIpArgs {
    /**
     * If true, allows an IP that is already assigned to another NIC in the same Subnet to be assigned to the NIC you specified.
     */
    allowRelink?: pulumi.Input<boolean>;
    /**
     * The ID of the NIC.
     */
    nicId: pulumi.Input<string>;
    /**
     * The secondary private IP or IPs you want to assign to the NIC within the IP range of the Subnet.
     */
    privateIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of secondary private IPs to assign to the NIC.
     */
    secondaryPrivateIpCount?: pulumi.Input<number>;
}