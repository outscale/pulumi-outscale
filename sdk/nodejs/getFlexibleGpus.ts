// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about flexible GPUs.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const flexibleGpus01 = outscale.getFlexibleGpus({
 *     filters: [
 *         {
 *             name: "model_names",
 *             values: [
 *                 "nvidia-p6",
 *                 "nvidia-p100",
 *             ],
 *         },
 *         {
 *             name: "states",
 *             values: ["attached"],
 *         },
 *     ],
 * });
 * ```
 */
export function getFlexibleGpus(args?: GetFlexibleGpusArgs, opts?: pulumi.InvokeOptions): Promise<GetFlexibleGpusResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getFlexibleGpus:getFlexibleGpus", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlexibleGpus.
 */
export interface GetFlexibleGpusArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetFlexibleGpusFilter[];
}

/**
 * A collection of values returned by getFlexibleGpus.
 */
export interface GetFlexibleGpusResult {
    readonly filters?: outputs.GetFlexibleGpusFilter[];
    /**
     * Information about one or more fGPUs.
     */
    readonly flexibleGpuses: outputs.GetFlexibleGpusFlexibleGpus[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly requestId: string;
}
/**
 * Provides information about flexible GPUs.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const flexibleGpus01 = outscale.getFlexibleGpus({
 *     filters: [
 *         {
 *             name: "model_names",
 *             values: [
 *                 "nvidia-p6",
 *                 "nvidia-p100",
 *             ],
 *         },
 *         {
 *             name: "states",
 *             values: ["attached"],
 *         },
 *     ],
 * });
 * ```
 */
export function getFlexibleGpusOutput(args?: GetFlexibleGpusOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFlexibleGpusResult> {
    return pulumi.output(args).apply((a: any) => getFlexibleGpus(a, opts))
}

/**
 * A collection of arguments for invoking getFlexibleGpus.
 */
export interface GetFlexibleGpusOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetFlexibleGpusFilterArgs>[]>;
}
