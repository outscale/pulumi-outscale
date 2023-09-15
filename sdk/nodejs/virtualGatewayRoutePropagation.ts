// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class VirtualGatewayRoutePropagation extends pulumi.CustomResource {
    /**
     * Get an existing VirtualGatewayRoutePropagation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualGatewayRoutePropagationState, opts?: pulumi.CustomResourceOptions): VirtualGatewayRoutePropagation {
        return new VirtualGatewayRoutePropagation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation';

    /**
     * Returns true if the given object is an instance of VirtualGatewayRoutePropagation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualGatewayRoutePropagation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualGatewayRoutePropagation.__pulumiType;
    }

    public readonly enable!: pulumi.Output<boolean>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    public readonly routeTableId!: pulumi.Output<string>;
    public readonly virtualGatewayId!: pulumi.Output<string>;

    /**
     * Create a VirtualGatewayRoutePropagation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualGatewayRoutePropagationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualGatewayRoutePropagationArgs | VirtualGatewayRoutePropagationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualGatewayRoutePropagationState | undefined;
            resourceInputs["enable"] = state ? state.enable : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["routeTableId"] = state ? state.routeTableId : undefined;
            resourceInputs["virtualGatewayId"] = state ? state.virtualGatewayId : undefined;
        } else {
            const args = argsOrState as VirtualGatewayRoutePropagationArgs | undefined;
            if ((!args || args.enable === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enable'");
            }
            if ((!args || args.routeTableId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routeTableId'");
            }
            if ((!args || args.virtualGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualGatewayId'");
            }
            resourceInputs["enable"] = args ? args.enable : undefined;
            resourceInputs["routeTableId"] = args ? args.routeTableId : undefined;
            resourceInputs["virtualGatewayId"] = args ? args.virtualGatewayId : undefined;
            resourceInputs["requestId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualGatewayRoutePropagation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualGatewayRoutePropagation resources.
 */
export interface VirtualGatewayRoutePropagationState {
    enable?: pulumi.Input<boolean>;
    requestId?: pulumi.Input<string>;
    routeTableId?: pulumi.Input<string>;
    virtualGatewayId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualGatewayRoutePropagation resource.
 */
export interface VirtualGatewayRoutePropagationArgs {
    enable: pulumi.Input<boolean>;
    routeTableId: pulumi.Input<string>;
    virtualGatewayId: pulumi.Input<string>;
}