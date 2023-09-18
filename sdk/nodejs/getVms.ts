// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about virtual machines (VMs).
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Instances.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vm).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const vms01 = outscale.getVms({
 *     filters: [
 *         {
 *             name: "tag_keys",
 *             values: ["env"],
 *         },
 *         {
 *             name: "tag_values",
 *             values: [
 *                 "prod",
 *                 "test",
 *             ],
 *         },
 *     ],
 * });
 * ```
 */
export function getVms(args?: GetVmsArgs, opts?: pulumi.InvokeOptions): Promise<GetVmsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getVms:getVms", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getVms.
 */
export interface GetVmsArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetVmsFilter[];
}

/**
 * A collection of values returned by getVms.
 */
export interface GetVmsResult {
    readonly filters?: outputs.GetVmsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly requestId: string;
    /**
     * Information about one or more VMs.
     */
    readonly vms: outputs.GetVmsVm[];
}
/**
 * Provides information about virtual machines (VMs).
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Instances.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vm).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const vms01 = outscale.getVms({
 *     filters: [
 *         {
 *             name: "tag_keys",
 *             values: ["env"],
 *         },
 *         {
 *             name: "tag_values",
 *             values: [
 *                 "prod",
 *                 "test",
 *             ],
 *         },
 *     ],
 * });
 * ```
 */
export function getVmsOutput(args?: GetVmsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVmsResult> {
    return pulumi.output(args).apply((a: any) => getVms(a, opts))
}

/**
 * A collection of arguments for invoking getVms.
 */
export interface GetVmsOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetVmsFilterArgs>[]>;
}
