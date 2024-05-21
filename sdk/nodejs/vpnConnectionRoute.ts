// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a VPN connection route.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Routing-Configuration-for-VPN-Connections.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vpnconnection).
 *
 * ## Example Usage
 * ### Required resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const clientGateway01 = new outscale.ClientGateway("clientGateway01", {
 *     bgpAsn: 65000,
 *     publicIp: "111.11.11.111",
 *     connectionType: "ipsec.1",
 * });
 * const virtualGateway01 = new outscale.VirtualGateway("virtualGateway01", {connectionType: "ipsec.1"});
 * const vpnConnection01 = new outscale.VpnConnection("vpnConnection01", {
 *     clientGatewayId: clientGateway01.clientGatewayId,
 *     virtualGatewayId: virtualGateway01.virtualGatewayId,
 *     connectionType: "ipsec.1",
 *     staticRoutesOnly: true,
 * });
 * ```
 * ### Create a static route to a VPN connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const vpnConnectionRoute01 = new outscale.VpnConnectionRoute("vpnConnectionRoute01", {
 *     vpnConnectionId: outscale_vpn_connection.vpn_connection01.vpn_connection_id,
 *     destinationIpRange: "10.0.0.0/16",
 * });
 * ```
 *
 * ## Import
 *
 * A VPN connection route can be imported using the VPN connection ID and the route destination IP range. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/vpnConnectionRoute:VpnConnectionRoute ImportedRoute vpn-12345678_10.0.0.0/0
 * ```
 */
export class VpnConnectionRoute extends pulumi.CustomResource {
    /**
     * Get an existing VpnConnectionRoute resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpnConnectionRouteState, opts?: pulumi.CustomResourceOptions): VpnConnectionRoute {
        return new VpnConnectionRoute(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/vpnConnectionRoute:VpnConnectionRoute';

    /**
     * Returns true if the given object is an instance of VpnConnectionRoute.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpnConnectionRoute {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpnConnectionRoute.__pulumiType;
    }

    /**
     * The network prefix of the route, in CIDR notation (for example, `10.12.0.0/16`).
     */
    public readonly destinationIpRange!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The ID of the target VPN connection of the static route.
     */
    public readonly vpnConnectionId!: pulumi.Output<string>;

    /**
     * Create a VpnConnectionRoute resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpnConnectionRouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpnConnectionRouteArgs | VpnConnectionRouteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpnConnectionRouteState | undefined;
            resourceInputs["destinationIpRange"] = state ? state.destinationIpRange : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["vpnConnectionId"] = state ? state.vpnConnectionId : undefined;
        } else {
            const args = argsOrState as VpnConnectionRouteArgs | undefined;
            if ((!args || args.destinationIpRange === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationIpRange'");
            }
            if ((!args || args.vpnConnectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpnConnectionId'");
            }
            resourceInputs["destinationIpRange"] = args ? args.destinationIpRange : undefined;
            resourceInputs["vpnConnectionId"] = args ? args.vpnConnectionId : undefined;
            resourceInputs["requestId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpnConnectionRoute.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpnConnectionRoute resources.
 */
export interface VpnConnectionRouteState {
    /**
     * The network prefix of the route, in CIDR notation (for example, `10.12.0.0/16`).
     */
    destinationIpRange?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    /**
     * The ID of the target VPN connection of the static route.
     */
    vpnConnectionId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VpnConnectionRoute resource.
 */
export interface VpnConnectionRouteArgs {
    /**
     * The network prefix of the route, in CIDR notation (for example, `10.12.0.0/16`).
     */
    destinationIpRange: pulumi.Input<string>;
    /**
     * The ID of the target VPN connection of the static route.
     */
    vpnConnectionId: pulumi.Input<string>;
}