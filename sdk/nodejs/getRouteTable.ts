// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a route table.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const routeTable01 = outscale.getRouteTable({
 *     filters: [{
 *         name: "route_table_ids",
 *         values: ["rtb-12345678"],
 *     }],
 * });
 * ```
 */
export function getRouteTable(args?: GetRouteTableArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteTableResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getRouteTable:getRouteTable", {
        "filters": args.filters,
        "routeTableId": args.routeTableId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteTable.
 */
export interface GetRouteTableArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetRouteTableFilter[];
    /**
     * The ID of the route table.
     */
    routeTableId?: string;
}

/**
 * A collection of values returned by getRouteTable.
 */
export interface GetRouteTableResult {
    readonly filters?: outputs.GetRouteTableFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * One or more associations between the route table and Subnets.
     */
    readonly linkRouteTables: outputs.GetRouteTableLinkRouteTable[];
    /**
     * The ID of the Net for the route table.
     */
    readonly netId: string;
    readonly requestId: string;
    /**
     * Information about virtual gateways propagating routes.
     */
    readonly routePropagatingVirtualGateways: outputs.GetRouteTableRoutePropagatingVirtualGateway[];
    /**
     * The ID of the route table.
     */
    readonly routeTableId: string;
    /**
     * One or more routes in the route table.
     */
    readonly routes: outputs.GetRouteTableRoute[];
    /**
     * One or more tags associated with the route table.
     */
    readonly tags: outputs.GetRouteTableTag[];
}
/**
 * Provides information about a route table.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const routeTable01 = outscale.getRouteTable({
 *     filters: [{
 *         name: "route_table_ids",
 *         values: ["rtb-12345678"],
 *     }],
 * });
 * ```
 */
export function getRouteTableOutput(args?: GetRouteTableOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRouteTableResult> {
    return pulumi.output(args).apply((a: any) => getRouteTable(a, opts))
}

/**
 * A collection of arguments for invoking getRouteTable.
 */
export interface GetRouteTableOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetRouteTableFilterArgs>[]>;
    /**
     * The ID of the route table.
     */
    routeTableId?: pulumi.Input<string>;
}
