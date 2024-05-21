// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about an image export task.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const imageExportTask01 = outscale.getImageExportTask({
 *     filters: [{
 *         name: "task_ids",
 *         values: ["image-export-12345678"],
 *     }],
 * });
 * ```
 */
export function getImageExportTask(args?: GetImageExportTaskArgs, opts?: pulumi.InvokeOptions): Promise<GetImageExportTaskResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getImageExportTask:getImageExportTask", {
        "dryRun": args.dryRun,
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getImageExportTask.
 */
export interface GetImageExportTaskArgs {
    dryRun?: boolean;
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetImageExportTaskFilter[];
}

/**
 * A collection of values returned by getImageExportTask.
 */
export interface GetImageExportTaskResult {
    /**
     * If the OMI export task fails, an error message appears.
     */
    readonly comment: string;
    readonly dryRun: boolean;
    readonly filters?: outputs.GetImageExportTaskFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the OMI to be exported.
     */
    readonly imageId: string;
    /**
     * Information about the OMI export task.
     */
    readonly osuExports: outputs.GetImageExportTaskOsuExport[];
    /**
     * The progress of the OMI export task, as a percentage.
     */
    readonly progress: number;
    readonly requestId: string;
    /**
     * The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     */
    readonly state: string;
    /**
     * One or more tags associated with the image export task.
     */
    readonly tags: outputs.GetImageExportTaskTag[];
    /**
     * The ID of the OMI export task.
     */
    readonly taskId: string;
}
/**
 * Provides information about an image export task.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const imageExportTask01 = outscale.getImageExportTask({
 *     filters: [{
 *         name: "task_ids",
 *         values: ["image-export-12345678"],
 *     }],
 * });
 * ```
 */
export function getImageExportTaskOutput(args?: GetImageExportTaskOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImageExportTaskResult> {
    return pulumi.output(args).apply((a: any) => getImageExportTask(a, opts))
}

/**
 * A collection of arguments for invoking getImageExportTask.
 */
export interface GetImageExportTaskOutputArgs {
    dryRun?: pulumi.Input<boolean>;
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetImageExportTaskFilterArgs>[]>;
}