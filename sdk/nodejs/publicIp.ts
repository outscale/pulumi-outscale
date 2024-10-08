// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a public IP.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-EIPs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-publicip).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const publicIp01 = new outscale.PublicIp("publicIp01", {});
 * ```
 *
 * ## Import
 *
 * A public IP can be imported using its ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/publicIp:PublicIp ImportedPublicIp eipalloc-12345678
 * ```
 */
export class PublicIp extends pulumi.CustomResource {
    /**
     * Get an existing PublicIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PublicIpState, opts?: pulumi.CustomResourceOptions): PublicIp {
        return new PublicIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/publicIp:PublicIp';

    /**
     * Returns true if the given object is an instance of PublicIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PublicIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PublicIp.__pulumiType;
    }

    /**
     * (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
     */
    public /*out*/ readonly linkPublicIpId!: pulumi.Output<string>;
    /**
     * The account ID of the owner of the NIC.
     */
    public /*out*/ readonly nicAccountId!: pulumi.Output<string>;
    /**
     * The ID of the NIC the public IP is associated with (if any).
     */
    public /*out*/ readonly nicId!: pulumi.Output<string>;
    /**
     * The private IP associated with the public IP.
     */
    public /*out*/ readonly privateIp!: pulumi.Output<string>;
    /**
     * The public IP.
     */
    public /*out*/ readonly publicIp!: pulumi.Output<string>;
    /**
     * The allocation ID of the public IP.
     */
    public /*out*/ readonly publicIpId!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    public readonly tags!: pulumi.Output<outputs.PublicIpTag[] | undefined>;
    /**
     * The ID of the VM the public IP is associated with (if any).
     */
    public /*out*/ readonly vmId!: pulumi.Output<string>;

    /**
     * Create a PublicIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PublicIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PublicIpArgs | PublicIpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PublicIpState | undefined;
            resourceInputs["linkPublicIpId"] = state ? state.linkPublicIpId : undefined;
            resourceInputs["nicAccountId"] = state ? state.nicAccountId : undefined;
            resourceInputs["nicId"] = state ? state.nicId : undefined;
            resourceInputs["privateIp"] = state ? state.privateIp : undefined;
            resourceInputs["publicIp"] = state ? state.publicIp : undefined;
            resourceInputs["publicIpId"] = state ? state.publicIpId : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vmId"] = state ? state.vmId : undefined;
        } else {
            const args = argsOrState as PublicIpArgs | undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["linkPublicIpId"] = undefined /*out*/;
            resourceInputs["nicAccountId"] = undefined /*out*/;
            resourceInputs["nicId"] = undefined /*out*/;
            resourceInputs["privateIp"] = undefined /*out*/;
            resourceInputs["publicIp"] = undefined /*out*/;
            resourceInputs["publicIpId"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["vmId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PublicIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PublicIp resources.
 */
export interface PublicIpState {
    /**
     * (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
     */
    linkPublicIpId?: pulumi.Input<string>;
    /**
     * The account ID of the owner of the NIC.
     */
    nicAccountId?: pulumi.Input<string>;
    /**
     * The ID of the NIC the public IP is associated with (if any).
     */
    nicId?: pulumi.Input<string>;
    /**
     * The private IP associated with the public IP.
     */
    privateIp?: pulumi.Input<string>;
    /**
     * The public IP.
     */
    publicIp?: pulumi.Input<string>;
    /**
     * The allocation ID of the public IP.
     */
    publicIpId?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.PublicIpTag>[]>;
    /**
     * The ID of the VM the public IP is associated with (if any).
     */
    vmId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PublicIp resource.
 */
export interface PublicIpArgs {
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.PublicIpTag>[]>;
}
