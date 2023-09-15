// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a snapshot export task.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-snapshot).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const snapshotExportTask01 = outscale.getSnapshotExportTask({
 *     filters: [{
 *         name: "task_ids",
 *         values: ["snap-export-12345678"],
 *     }],
 * });
 * ```
 */
export function getSnapshotExportTask(args?: GetSnapshotExportTaskArgs, opts?: pulumi.InvokeOptions): Promise<GetSnapshotExportTaskResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getSnapshotExportTask:getSnapshotExportTask", {
        "dryRun": args.dryRun,
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getSnapshotExportTask.
 */
export interface GetSnapshotExportTaskArgs {
    dryRun?: boolean;
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetSnapshotExportTaskFilter[];
}

/**
 * A collection of values returned by getSnapshotExportTask.
 */
export interface GetSnapshotExportTaskResult {
    /**
     * If the snapshot export task fails, an error message appears.
     */
    readonly comment: string;
    readonly dryRun: boolean;
    readonly filters?: outputs.GetSnapshotExportTaskFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Information about the snapshot export task.
     */
    readonly osuExports: outputs.GetSnapshotExportTaskOsuExport[];
    /**
     * The progress of the snapshot export task, as a percentage.
     */
    readonly progress: number;
    readonly requestId: string;
    /**
     * The ID of the snapshot to be exported.
     */
    readonly snapshotId: string;
    /**
     * The state of the snapshot export task (`pending` \| `active` \| `completed` \| `failed`).
     */
    readonly state: string;
    /**
     * One or more tags associated with the snapshot export task.
     */
    readonly tags: outputs.GetSnapshotExportTaskTag[];
    /**
     * The ID of the snapshot export task.
     */
    readonly taskId: string;
}
/**
 * Provides information about a snapshot export task.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-snapshot).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const snapshotExportTask01 = outscale.getSnapshotExportTask({
 *     filters: [{
 *         name: "task_ids",
 *         values: ["snap-export-12345678"],
 *     }],
 * });
 * ```
 */
export function getSnapshotExportTaskOutput(args?: GetSnapshotExportTaskOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSnapshotExportTaskResult> {
    return pulumi.output(args).apply((a: any) => getSnapshotExportTask(a, opts))
}

/**
 * A collection of arguments for invoking getSnapshotExportTask.
 */
export interface GetSnapshotExportTaskOutputArgs {
    dryRun?: pulumi.Input<boolean>;
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetSnapshotExportTaskFilterArgs>[]>;
}
