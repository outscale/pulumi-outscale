// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about VM states.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Instance-Lifecycle.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmsstate).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const vmStates01 = outscale.getVmStates({
 *     filters: [
 *         {
 *             name: "vm_ids",
 *             values: [
 *                 "i-12345678",
 *                 "i-87654321",
 *             ],
 *         },
 *         {
 *             name: "vm_states",
 *             values: ["running"],
 *         },
 *     ],
 * });
 * ```
 */
export function getVmStates(args?: GetVmStatesArgs, opts?: pulumi.InvokeOptions): Promise<GetVmStatesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getVmStates:getVmStates", {
        "allVms": args.allVms,
        "filters": args.filters,
        "vmIds": args.vmIds,
    }, opts);
}

/**
 * A collection of arguments for invoking getVmStates.
 */
export interface GetVmStatesArgs {
    /**
     * If true, includes the status of all VMs. By default or if set to false, only includes the status of running VMs.
     */
    allVms?: boolean;
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetVmStatesFilter[];
    /**
     * One or more IDs of VMs.
     */
    vmIds?: string[];
}

/**
 * A collection of values returned by getVmStates.
 */
export interface GetVmStatesResult {
    readonly allVms?: boolean;
    readonly filters?: outputs.GetVmStatesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly requestId: string;
    readonly vmIds?: string[];
    /**
     * Information about one or more VM states.
     */
    readonly vmStates: outputs.GetVmStatesVmState[];
}
/**
 * Provides information about VM states.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Instance-Lifecycle.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmsstate).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const vmStates01 = outscale.getVmStates({
 *     filters: [
 *         {
 *             name: "vm_ids",
 *             values: [
 *                 "i-12345678",
 *                 "i-87654321",
 *             ],
 *         },
 *         {
 *             name: "vm_states",
 *             values: ["running"],
 *         },
 *     ],
 * });
 * ```
 */
export function getVmStatesOutput(args?: GetVmStatesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVmStatesResult> {
    return pulumi.output(args).apply((a: any) => getVmStates(a, opts))
}

/**
 * A collection of arguments for invoking getVmStates.
 */
export interface GetVmStatesOutputArgs {
    /**
     * If true, includes the status of all VMs. By default or if set to false, only includes the status of running VMs.
     */
    allVms?: pulumi.Input<boolean>;
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetVmStatesFilterArgs>[]>;
    /**
     * One or more IDs of VMs.
     */
    vmIds?: pulumi.Input<pulumi.Input<string>[]>;
}
