// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a virtual gateway link.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Virtual-Private-Gateways.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-virtualgateway).
 *
 * ## Example Usage
 * ### Required resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const virtualGateway01 = new outscale.VirtualGateway("virtualGateway01", {connectionType: "ipsec.1"});
 * const net01 = new outscale.Net("net01", {ipRange: "10.0.0.0/16"});
 * ```
 * ### Link a virtual gateway to a Net
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const virtualGatewayLink01 = new outscale.VirtualGatewayLink("virtualGatewayLink01", {
 *     virtualGatewayId: outscale_virtual_gateway.virtual_gateway01.virtual_gateway_id,
 *     netId: outscale_net.net01.net_id,
 * });
 * ```
 *
 * ## Import
 *
 * A virtual gateway link can be imported using its virtual gateway ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/virtualGatewayLink:VirtualGatewayLink ImportedVirtualGatewayLink vgw-12345678
 * ```
 */
export class VirtualGatewayLink extends pulumi.CustomResource {
    /**
     * Get an existing VirtualGatewayLink resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualGatewayLinkState, opts?: pulumi.CustomResourceOptions): VirtualGatewayLink {
        return new VirtualGatewayLink(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/virtualGatewayLink:VirtualGatewayLink';

    /**
     * Returns true if the given object is an instance of VirtualGatewayLink.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualGatewayLink {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualGatewayLink.__pulumiType;
    }

    public readonly dryRun!: pulumi.Output<string>;
    /**
     * The ID of the Net to which you want to attach the virtual gateway.
     */
    public readonly netId!: pulumi.Output<string>;
    public /*out*/ readonly netToVirtualGatewayLinks!: pulumi.Output<outputs.VirtualGatewayLinkNetToVirtualGatewayLink[]>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The ID of the virtual gateway.
     */
    public readonly virtualGatewayId!: pulumi.Output<string>;

    /**
     * Create a VirtualGatewayLink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualGatewayLinkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualGatewayLinkArgs | VirtualGatewayLinkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualGatewayLinkState | undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["netId"] = state ? state.netId : undefined;
            resourceInputs["netToVirtualGatewayLinks"] = state ? state.netToVirtualGatewayLinks : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["virtualGatewayId"] = state ? state.virtualGatewayId : undefined;
        } else {
            const args = argsOrState as VirtualGatewayLinkArgs | undefined;
            if ((!args || args.netId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'netId'");
            }
            if ((!args || args.virtualGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualGatewayId'");
            }
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["netId"] = args ? args.netId : undefined;
            resourceInputs["virtualGatewayId"] = args ? args.virtualGatewayId : undefined;
            resourceInputs["netToVirtualGatewayLinks"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualGatewayLink.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualGatewayLink resources.
 */
export interface VirtualGatewayLinkState {
    dryRun?: pulumi.Input<string>;
    /**
     * The ID of the Net to which you want to attach the virtual gateway.
     */
    netId?: pulumi.Input<string>;
    netToVirtualGatewayLinks?: pulumi.Input<pulumi.Input<inputs.VirtualGatewayLinkNetToVirtualGatewayLink>[]>;
    requestId?: pulumi.Input<string>;
    /**
     * The ID of the virtual gateway.
     */
    virtualGatewayId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualGatewayLink resource.
 */
export interface VirtualGatewayLinkArgs {
    dryRun?: pulumi.Input<string>;
    /**
     * The ID of the Net to which you want to attach the virtual gateway.
     */
    netId: pulumi.Input<string>;
    /**
     * The ID of the virtual gateway.
     */
    virtualGatewayId: pulumi.Input<string>;
}
