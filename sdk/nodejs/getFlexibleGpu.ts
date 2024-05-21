// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a flexible GPU.
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
 * const flexibleGpu01 = outscale.getFlexibleGpu({
 *     filters: [{
 *         name: "flexible_gpu_ids",
 *         values: ["fgpu-12345678"],
 *     }],
 * });
 * ```
 */
export function getFlexibleGpu(args?: GetFlexibleGpuArgs, opts?: pulumi.InvokeOptions): Promise<GetFlexibleGpuResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getFlexibleGpu:getFlexibleGpu", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlexibleGpu.
 */
export interface GetFlexibleGpuArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetFlexibleGpuFilter[];
}

/**
 * A collection of values returned by getFlexibleGpu.
 */
export interface GetFlexibleGpuResult {
    /**
     * If true, the fGPU is deleted when the VM is terminated.
     */
    readonly deleteOnVmDeletion: boolean;
    readonly filters?: outputs.GetFlexibleGpuFilter[];
    /**
     * The ID of the fGPU.
     */
    readonly flexibleGpuId: string;
    /**
     * The compatible processor generation.
     */
    readonly generation: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The model of fGPU. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     */
    readonly modelName: string;
    readonly requestId: string;
    /**
     * The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
     */
    readonly state: string;
    /**
     * The Subregion where the fGPU is located.
     */
    readonly subregionName: string;
    /**
     * The ID of the VM the fGPU is attached to, if any.
     */
    readonly vmId: string;
}
/**
 * Provides information about a flexible GPU.
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
 * const flexibleGpu01 = outscale.getFlexibleGpu({
 *     filters: [{
 *         name: "flexible_gpu_ids",
 *         values: ["fgpu-12345678"],
 *     }],
 * });
 * ```
 */
export function getFlexibleGpuOutput(args?: GetFlexibleGpuOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFlexibleGpuResult> {
    return pulumi.output(args).apply((a: any) => getFlexibleGpu(a, opts))
}

/**
 * A collection of arguments for invoking getFlexibleGpu.
 */
export interface GetFlexibleGpuOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetFlexibleGpuFilterArgs>[]>;
}