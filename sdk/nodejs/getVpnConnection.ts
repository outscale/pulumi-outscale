// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a VPN connection.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPN-Connections.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vpnconnection).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const vpnConnection01 = outscale.getVpnConnection({
 *     filters: [{
 *         name: "vpn_connection_ids",
 *         values: ["vpn-12345678"],
 *     }],
 * });
 * ```
 */
export function getVpnConnection(args?: GetVpnConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetVpnConnectionResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getVpnConnection:getVpnConnection", {
        "filters": args.filters,
        "staticRoutesOnly": args.staticRoutesOnly,
        "vpnConnectionId": args.vpnConnectionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpnConnection.
 */
export interface GetVpnConnectionArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetVpnConnectionFilter[];
    /**
     * If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
     */
    staticRoutesOnly?: boolean;
    /**
     * The ID of the VPN connection.
     */
    vpnConnectionId?: string;
}

/**
 * A collection of values returned by getVpnConnection.
 */
export interface GetVpnConnectionResult {
    /**
     * Example configuration for the client gateway.
     */
    readonly clientGatewayConfiguration: string;
    /**
     * The ID of the client gateway used on the client end of the connection.
     */
    readonly clientGatewayId: string;
    /**
     * The type of VPN connection (always `ipsec.1`).
     */
    readonly connectionType: string;
    readonly filters?: outputs.GetVpnConnectionFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly requestId: string;
    /**
     * Information about one or more static routes associated with the VPN connection, if any.
     */
    readonly routes: outputs.GetVpnConnectionRoute[];
    /**
     * The state of the IPSEC tunnel (`UP` \| `DOWN`).
     */
    readonly state: string;
    /**
     * If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
     */
    readonly staticRoutesOnly?: boolean;
    /**
     * One or more tags associated with the VPN connection.
     */
    readonly tags: outputs.GetVpnConnectionTag[];
    /**
     * Information about the current state of one or more of the VPN tunnels.
     */
    readonly vgwTelemetries: outputs.GetVpnConnectionVgwTelemetry[];
    /**
     * The ID of the virtual gateway used on the OUTSCALE end of the connection.
     */
    readonly virtualGatewayId: string;
    /**
     * The ID of the VPN connection.
     */
    readonly vpnConnectionId?: string;
}
/**
 * Provides information about a VPN connection.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPN-Connections.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vpnconnection).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const vpnConnection01 = outscale.getVpnConnection({
 *     filters: [{
 *         name: "vpn_connection_ids",
 *         values: ["vpn-12345678"],
 *     }],
 * });
 * ```
 */
export function getVpnConnectionOutput(args?: GetVpnConnectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpnConnectionResult> {
    return pulumi.output(args).apply((a: any) => getVpnConnection(a, opts))
}

/**
 * A collection of arguments for invoking getVpnConnection.
 */
export interface GetVpnConnectionOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetVpnConnectionFilterArgs>[]>;
    /**
     * If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
     */
    staticRoutesOnly?: pulumi.Input<boolean>;
    /**
     * The ID of the VPN connection.
     */
    vpnConnectionId?: pulumi.Input<string>;
}
