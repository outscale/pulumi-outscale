// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about subregions.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Regions-Endpoints-and-Availability-Zones.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readsubregions).
 *
 * ## Example Usage
 * ### List a specific Subregion in the current Region
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const subregions01 = outscale.getSubregions({
 *     filters: [{
 *         name: "subregion_names",
 *         values: ["eu-west-2a"],
 *     }],
 * });
 * ```
 * ### List two specific Subregions in the current Region
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const subregions02 = outscale.getSubregions({
 *     filters: [{
 *         name: "subregion_names",
 *         values: [
 *             "eu-west-2a",
 *             "eu-west-2b",
 *         ],
 *     }],
 * });
 * ```
 * ### List all accessible Subregions in the current Region
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const all-subregions = outscale.getSubregions({});
 * ```
 */
export function getSubregions(args?: GetSubregionsArgs, opts?: pulumi.InvokeOptions): Promise<GetSubregionsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getSubregions:getSubregions", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubregions.
 */
export interface GetSubregionsArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetSubregionsFilter[];
}

/**
 * A collection of values returned by getSubregions.
 */
export interface GetSubregionsResult {
    readonly filters?: outputs.GetSubregionsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly requestId: string;
    /**
     * Information about one or more Subregions.
     */
    readonly subregions: outputs.GetSubregionsSubregion[];
}
/**
 * Provides information about subregions.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Regions-Endpoints-and-Availability-Zones.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readsubregions).
 *
 * ## Example Usage
 * ### List a specific Subregion in the current Region
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const subregions01 = outscale.getSubregions({
 *     filters: [{
 *         name: "subregion_names",
 *         values: ["eu-west-2a"],
 *     }],
 * });
 * ```
 * ### List two specific Subregions in the current Region
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const subregions02 = outscale.getSubregions({
 *     filters: [{
 *         name: "subregion_names",
 *         values: [
 *             "eu-west-2a",
 *             "eu-west-2b",
 *         ],
 *     }],
 * });
 * ```
 * ### List all accessible Subregions in the current Region
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const all-subregions = outscale.getSubregions({});
 * ```
 */
export function getSubregionsOutput(args?: GetSubregionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubregionsResult> {
    return pulumi.output(args).apply((a: any) => getSubregions(a, opts))
}

/**
 * A collection of arguments for invoking getSubregions.
 */
export interface GetSubregionsOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetSubregionsFilterArgs>[]>;
}
