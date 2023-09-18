// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Net access points.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Endpoints.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netaccesspoint).
 *
 * ## Example Usage
 * ### List Net access points
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const netAccessPoints01 = outscale.getNetAccessPoints({
 *     filters: [{
 *         name: "net_access_point_ids",
 *         values: [
 *             "vpce-12345678",
 *             "vpce-12345679",
 *         ],
 *     }],
 * });
 * ```
 * ### List Net access points according to their Net and state
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const netAccessPoints02 = outscale.getNetAccessPoints({
 *     filters: [
 *         {
 *             name: "net_ids",
 *             values: ["vpc-12345678"],
 *         },
 *         {
 *             name: "states",
 *             values: ["available"],
 *         },
 *     ],
 * });
 * ```
 */
export function getNetAccessPoints(args?: GetNetAccessPointsArgs, opts?: pulumi.InvokeOptions): Promise<GetNetAccessPointsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getNetAccessPoints:getNetAccessPoints", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetAccessPoints.
 */
export interface GetNetAccessPointsArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetNetAccessPointsFilter[];
}

/**
 * A collection of values returned by getNetAccessPoints.
 */
export interface GetNetAccessPointsResult {
    readonly filters?: outputs.GetNetAccessPointsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * One or more Net access points.
     */
    readonly netAccessPoints: outputs.GetNetAccessPointsNetAccessPoint[];
    readonly requestId: string;
}
/**
 * Provides information about Net access points.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Endpoints.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netaccesspoint).
 *
 * ## Example Usage
 * ### List Net access points
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const netAccessPoints01 = outscale.getNetAccessPoints({
 *     filters: [{
 *         name: "net_access_point_ids",
 *         values: [
 *             "vpce-12345678",
 *             "vpce-12345679",
 *         ],
 *     }],
 * });
 * ```
 * ### List Net access points according to their Net and state
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const netAccessPoints02 = outscale.getNetAccessPoints({
 *     filters: [
 *         {
 *             name: "net_ids",
 *             values: ["vpc-12345678"],
 *         },
 *         {
 *             name: "states",
 *             values: ["available"],
 *         },
 *     ],
 * });
 * ```
 */
export function getNetAccessPointsOutput(args?: GetNetAccessPointsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetAccessPointsResult> {
    return pulumi.output(args).apply((a: any) => getNetAccessPoints(a, opts))
}

/**
 * A collection of arguments for invoking getNetAccessPoints.
 */
export interface GetNetAccessPointsOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetNetAccessPointsFilterArgs>[]>;
}
