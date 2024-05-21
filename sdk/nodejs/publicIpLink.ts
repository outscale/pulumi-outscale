// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a public IP link.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-EIPs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-publicip).
 *
 * ## Example Usage
 * ### Required resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const publicIp01 = new outscale.PublicIp("publicIp01", {});
 * const vm01 = new outscale.Vm("vm01", {
 *     imageId: _var.image_id,
 *     vmType: _var.vm_type,
 *     keypairName: _var.keypair_name,
 *     securityGroupIds: [_var.security_group_id],
 * });
 * ```
 * ### Link a public IP address to a VM
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const publicIpLink01 = new outscale.PublicIpLink("publicIpLink01", {
 *     vmId: outscale_vm.vm01.vm_id,
 *     publicIp: outscale_public_ip.public_ip01.public_ip,
 * });
 * ```
 *
 * ## Import
 *
 * A public IP link can be imported using the public IP or the public IP link ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/publicIpLink:PublicIpLink ImportedPublicIpLink eipassoc-12345678
 * ```
 */
export class PublicIpLink extends pulumi.CustomResource {
    /**
     * Get an existing PublicIpLink resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PublicIpLinkState, opts?: pulumi.CustomResourceOptions): PublicIpLink {
        return new PublicIpLink(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/publicIpLink:PublicIpLink';

    /**
     * Returns true if the given object is an instance of PublicIpLink.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PublicIpLink {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PublicIpLink.__pulumiType;
    }

    /**
     * If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
     */
    public readonly allowRelink!: pulumi.Output<boolean | undefined>;
    /**
     * (Net only) The ID representing the association of the public IP with the VM or the NIC.
     */
    public /*out*/ readonly linkPublicIpId!: pulumi.Output<string>;
    public /*out*/ readonly nicAccountId!: pulumi.Output<string>;
    /**
     * (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vmId` parameter instead. You cannot specify both parameters at the same time.
     */
    public readonly nicId!: pulumi.Output<string>;
    /**
     * (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
     */
    public readonly privateIp!: pulumi.Output<string>;
    /**
     * The public IP. This parameter is required unless you use the `publicIpId` parameter.
     */
    public readonly publicIp!: pulumi.Output<string>;
    /**
     * The allocation ID of the public IP. This parameter is required unless you use the `publicIp` parameter.
     */
    public readonly publicIpId!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    public /*out*/ readonly tags!: pulumi.Output<outputs.PublicIpLinkTag[]>;
    /**
     * The ID of the VM.<br />- In the public Cloud, this parameter is required.<br />- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nicId` parameter instead. You cannot specify both parameters at the same time.
     */
    public readonly vmId!: pulumi.Output<string>;

    /**
     * Create a PublicIpLink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PublicIpLinkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PublicIpLinkArgs | PublicIpLinkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PublicIpLinkState | undefined;
            resourceInputs["allowRelink"] = state ? state.allowRelink : undefined;
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
            const args = argsOrState as PublicIpLinkArgs | undefined;
            resourceInputs["allowRelink"] = args ? args.allowRelink : undefined;
            resourceInputs["nicId"] = args ? args.nicId : undefined;
            resourceInputs["privateIp"] = args ? args.privateIp : undefined;
            resourceInputs["publicIp"] = args ? args.publicIp : undefined;
            resourceInputs["publicIpId"] = args ? args.publicIpId : undefined;
            resourceInputs["vmId"] = args ? args.vmId : undefined;
            resourceInputs["linkPublicIpId"] = undefined /*out*/;
            resourceInputs["nicAccountId"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["tags"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PublicIpLink.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PublicIpLink resources.
 */
export interface PublicIpLinkState {
    /**
     * If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
     */
    allowRelink?: pulumi.Input<boolean>;
    /**
     * (Net only) The ID representing the association of the public IP with the VM or the NIC.
     */
    linkPublicIpId?: pulumi.Input<string>;
    nicAccountId?: pulumi.Input<string>;
    /**
     * (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vmId` parameter instead. You cannot specify both parameters at the same time.
     */
    nicId?: pulumi.Input<string>;
    /**
     * (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
     */
    privateIp?: pulumi.Input<string>;
    /**
     * The public IP. This parameter is required unless you use the `publicIpId` parameter.
     */
    publicIp?: pulumi.Input<string>;
    /**
     * The allocation ID of the public IP. This parameter is required unless you use the `publicIp` parameter.
     */
    publicIpId?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<inputs.PublicIpLinkTag>[]>;
    /**
     * The ID of the VM.<br />- In the public Cloud, this parameter is required.<br />- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nicId` parameter instead. You cannot specify both parameters at the same time.
     */
    vmId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PublicIpLink resource.
 */
export interface PublicIpLinkArgs {
    /**
     * If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
     */
    allowRelink?: pulumi.Input<boolean>;
    /**
     * (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vmId` parameter instead. You cannot specify both parameters at the same time.
     */
    nicId?: pulumi.Input<string>;
    /**
     * (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
     */
    privateIp?: pulumi.Input<string>;
    /**
     * The public IP. This parameter is required unless you use the `publicIpId` parameter.
     */
    publicIp?: pulumi.Input<string>;
    /**
     * The allocation ID of the public IP. This parameter is required unless you use the `publicIp` parameter.
     */
    publicIpId?: pulumi.Input<string>;
    /**
     * The ID of the VM.<br />- In the public Cloud, this parameter is required.<br />- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nicId` parameter instead. You cannot specify both parameters at the same time.
     */
    vmId?: pulumi.Input<string>;
}