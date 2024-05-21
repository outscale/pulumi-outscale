// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about route tables.
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
 * const routeTables01 = outscale.getRouteTables({
 *     filters: [
 *         {
 *             name: "net_ids",
 *             values: [
 *                 "vpc-12345678",
 *                 "vpc-87654321",
 *             ],
 *         },
 *         {
 *             name: "link_route_table_main",
 *             values: ["true"],
 *         },
 *     ],
 * });
 * ```
 */
export function getRouteTables(args?: GetRouteTablesArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteTablesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getRouteTables:getRouteTables", {
        "filters": args.filters,
        "routeTableIds": args.routeTableIds,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteTables.
 */
export interface GetRouteTablesArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetRouteTablesFilter[];
    /**
     * The ID of the route table.
     */
    routeTableIds?: string[];
}

/**
 * A collection of values returned by getRouteTables.
 */
export interface GetRouteTablesResult {
    readonly filters?: outputs.GetRouteTablesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly requestId: string;
    /**
     * The ID of the route table.
     */
    readonly routeTableIds?: string[];
    /**
     * Information about one or more route tables.
     */
    readonly routeTables: outputs.GetRouteTablesRouteTable[];
}
/**
 * Provides information about route tables.
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
 * const routeTables01 = outscale.getRouteTables({
 *     filters: [
 *         {
 *             name: "net_ids",
 *             values: [
 *                 "vpc-12345678",
 *                 "vpc-87654321",
 *             ],
 *         },
 *         {
 *             name: "link_route_table_main",
 *             values: ["true"],
 *         },
 *     ],
 * });
 * ```
 */
export function getRouteTablesOutput(args?: GetRouteTablesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRouteTablesResult> {
    return pulumi.output(args).apply((a: any) => getRouteTables(a, opts))
}

/**
 * A collection of arguments for invoking getRouteTables.
 */
export interface GetRouteTablesOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetRouteTablesFilterArgs>[]>;
    /**
     * The ID of the route table.
     */
    routeTableIds?: pulumi.Input<pulumi.Input<string>[]>;
}