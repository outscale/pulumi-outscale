// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages an image export task.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).
 *
 * ## Example Usage
 * ### Required resource
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const image01 = new outscale.Image("image01", {
 *     imageName: "terraform-image-to-export",
 *     vmId: "i-12345678",
 * });
 * ```
 * ### Create an image export task
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const imageExportTask01 = new outscale.ImageExportTask("imageExportTask01", {
 *     imageId: outscale_image.image01.image_id,
 *     osuExports: [{
 *         diskImageFormat: "qcow2",
 *         osuBucket: "terraform-bucket",
 *         osuPrefix: "new-export",
 *         osuApiKeys: [{
 *             apiKeyId: _var.access_key_id,
 *             secretKey: _var.secret_key_id,
 *         }],
 *     }],
 *     tags: [{
 *         key: "Name",
 *         value: "terraform-snapshot-export-task",
 *     }],
 * });
 * ```
 */
export class ImageExportTask extends pulumi.CustomResource {
    /**
     * Get an existing ImageExportTask resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageExportTaskState, opts?: pulumi.CustomResourceOptions): ImageExportTask {
        return new ImageExportTask(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/imageExportTask:ImageExportTask';

    /**
     * Returns true if the given object is an instance of ImageExportTask.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ImageExportTask {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ImageExportTask.__pulumiType;
    }

    /**
     * If the OMI export task fails, an error message appears.
     */
    public /*out*/ readonly comment!: pulumi.Output<string>;
    /**
     * The ID of the OMI to export.
     */
    public readonly imageId!: pulumi.Output<string>;
    /**
     * Information about the OOS export task to create.
     */
    public readonly osuExports!: pulumi.Output<outputs.ImageExportTaskOsuExport[]>;
    /**
     * The progress of the OMI export task, as a percentage.
     */
    public /*out*/ readonly progress!: pulumi.Output<number>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    public readonly tags!: pulumi.Output<outputs.ImageExportTaskTag[] | undefined>;
    /**
     * The ID of the OMI export task.
     */
    public /*out*/ readonly taskId!: pulumi.Output<string>;

    /**
     * Create a ImageExportTask resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImageExportTaskArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageExportTaskArgs | ImageExportTaskState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImageExportTaskState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["imageId"] = state ? state.imageId : undefined;
            resourceInputs["osuExports"] = state ? state.osuExports : undefined;
            resourceInputs["progress"] = state ? state.progress : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["taskId"] = state ? state.taskId : undefined;
        } else {
            const args = argsOrState as ImageExportTaskArgs | undefined;
            if ((!args || args.imageId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'imageId'");
            }
            if ((!args || args.osuExports === undefined) && !opts.urn) {
                throw new Error("Missing required property 'osuExports'");
            }
            resourceInputs["imageId"] = args ? args.imageId : undefined;
            resourceInputs["osuExports"] = args ? args.osuExports : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["comment"] = undefined /*out*/;
            resourceInputs["progress"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["taskId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ImageExportTask.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImageExportTask resources.
 */
export interface ImageExportTaskState {
    /**
     * If the OMI export task fails, an error message appears.
     */
    comment?: pulumi.Input<string>;
    /**
     * The ID of the OMI to export.
     */
    imageId?: pulumi.Input<string>;
    /**
     * Information about the OOS export task to create.
     */
    osuExports?: pulumi.Input<pulumi.Input<inputs.ImageExportTaskOsuExport>[]>;
    /**
     * The progress of the OMI export task, as a percentage.
     */
    progress?: pulumi.Input<number>;
    requestId?: pulumi.Input<string>;
    /**
     * The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     */
    state?: pulumi.Input<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ImageExportTaskTag>[]>;
    /**
     * The ID of the OMI export task.
     */
    taskId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ImageExportTask resource.
 */
export interface ImageExportTaskArgs {
    /**
     * The ID of the OMI to export.
     */
    imageId: pulumi.Input<string>;
    /**
     * Information about the OOS export task to create.
     */
    osuExports: pulumi.Input<pulumi.Input<inputs.ImageExportTaskOsuExport>[]>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.ImageExportTaskTag>[]>;
}
