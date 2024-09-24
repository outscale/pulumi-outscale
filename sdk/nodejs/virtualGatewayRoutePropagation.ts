// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a virtual gateway route propagation.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Routing-Configuration-for-VPN-Connections.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updateroutepropagation).
 *
 * ## Example Usage
 * ### Required resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const virtualGateway01 = new outscale.VirtualGateway("virtualGateway01", {connectionType: "ipsec.1"});
 * const net01 = new outscale.Net("net01", {ipRange: "10.0.0.0/16"});
 * const routeTable01 = new outscale.RouteTable("routeTable01", {netId: net01.netId});
 * const virtualGatewayLink01 = new outscale.VirtualGatewayLink("virtualGatewayLink01", {
 *     virtualGatewayId: virtualGateway01.virtualGatewayId,
 *     netId: net01.netId,
 * });
 * ```
 * ### Activate the propagation of routes to a route table of a Net by a virtual gateway
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const virtualGatewayRoutePropagation01 = new outscale.VirtualGatewayRoutePropagation("virtualGatewayRoutePropagation01", {
 *     enable: true,
 *     virtualGatewayId: outscale_virtual_gateway.virtual_gateway01.virtual_gateway_id,
 *     routeTableId: outscale_route_table.route_table01.route_table_id,
 * }, {
 *     dependsOn: [outscale_virtual_gateway_link.virtual_gateway_link01],
 * });
 * ```
 */
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

    /**
     * If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
     */
    public readonly enable!: pulumi.Output<boolean>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The ID of the route table.
     */
    public readonly routeTableId!: pulumi.Output<string>;
    /**
     * The ID of the virtual gateway.
     */
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
    /**
     * If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
     */
    enable?: pulumi.Input<boolean>;
    requestId?: pulumi.Input<string>;
    /**
     * The ID of the route table.
     */
    routeTableId?: pulumi.Input<string>;
    /**
     * The ID of the virtual gateway.
     */
    virtualGatewayId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualGatewayRoutePropagation resource.
 */
export interface VirtualGatewayRoutePropagationArgs {
    /**
     * If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
     */
    enable: pulumi.Input<boolean>;
    /**
     * The ID of the route table.
     */
    routeTableId: pulumi.Input<string>;
    /**
     * The ID of the virtual gateway.
     */
    virtualGatewayId: pulumi.Input<string>;
}
