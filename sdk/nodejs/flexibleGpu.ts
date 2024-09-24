// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a flexible GPU.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
 *
 * ## Example Usage
 * ### Create a flexible GPU
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const flexibleGpu01 = new outscale.FlexibleGpu("flexibleGpu01", {
 *     modelName: _var.model_name,
 *     generation: "v4",
 *     subregionName: `${_var.region}a`,
 *     deleteOnVmDeletion: true,
 * });
 * ```
 *
 * ## Import
 *
 * A flexible GPU can be imported using its ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/flexibleGpu:FlexibleGpu imported_fgpu fgpu-12345678
 * ```
 */
export class FlexibleGpu extends pulumi.CustomResource {
    /**
     * Get an existing FlexibleGpu resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlexibleGpuState, opts?: pulumi.CustomResourceOptions): FlexibleGpu {
        return new FlexibleGpu(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/flexibleGpu:FlexibleGpu';

    /**
     * Returns true if the given object is an instance of FlexibleGpu.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlexibleGpu {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlexibleGpu.__pulumiType;
    }

    /**
     * If true, the fGPU is deleted when the VM is terminated.
     */
    public readonly deleteOnVmDeletion!: pulumi.Output<boolean>;
    /**
     * The ID of the fGPU.
     */
    public /*out*/ readonly flexibleGpuId!: pulumi.Output<string>;
    /**
     * The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
     */
    public readonly generation!: pulumi.Output<string>;
    /**
     * The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     */
    public readonly modelName!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The Subregion in which you want to create the fGPU.
     */
    public readonly subregionName!: pulumi.Output<string>;
    /**
     * The ID of the VM the fGPU is attached to, if any.
     */
    public /*out*/ readonly vmId!: pulumi.Output<string>;

    /**
     * Create a FlexibleGpu resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlexibleGpuArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlexibleGpuArgs | FlexibleGpuState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlexibleGpuState | undefined;
            resourceInputs["deleteOnVmDeletion"] = state ? state.deleteOnVmDeletion : undefined;
            resourceInputs["flexibleGpuId"] = state ? state.flexibleGpuId : undefined;
            resourceInputs["generation"] = state ? state.generation : undefined;
            resourceInputs["modelName"] = state ? state.modelName : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["subregionName"] = state ? state.subregionName : undefined;
            resourceInputs["vmId"] = state ? state.vmId : undefined;
        } else {
            const args = argsOrState as FlexibleGpuArgs | undefined;
            if ((!args || args.modelName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'modelName'");
            }
            if ((!args || args.subregionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subregionName'");
            }
            resourceInputs["deleteOnVmDeletion"] = args ? args.deleteOnVmDeletion : undefined;
            resourceInputs["generation"] = args ? args.generation : undefined;
            resourceInputs["modelName"] = args ? args.modelName : undefined;
            resourceInputs["subregionName"] = args ? args.subregionName : undefined;
            resourceInputs["flexibleGpuId"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["vmId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FlexibleGpu.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlexibleGpu resources.
 */
export interface FlexibleGpuState {
    /**
     * If true, the fGPU is deleted when the VM is terminated.
     */
    deleteOnVmDeletion?: pulumi.Input<boolean>;
    /**
     * The ID of the fGPU.
     */
    flexibleGpuId?: pulumi.Input<string>;
    /**
     * The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
     */
    generation?: pulumi.Input<string>;
    /**
     * The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     */
    modelName?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    /**
     * The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
     */
    state?: pulumi.Input<string>;
    /**
     * The Subregion in which you want to create the fGPU.
     */
    subregionName?: pulumi.Input<string>;
    /**
     * The ID of the VM the fGPU is attached to, if any.
     */
    vmId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FlexibleGpu resource.
 */
export interface FlexibleGpuArgs {
    /**
     * If true, the fGPU is deleted when the VM is terminated.
     */
    deleteOnVmDeletion?: pulumi.Input<boolean>;
    /**
     * The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
     */
    generation?: pulumi.Input<string>;
    /**
     * The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     */
    modelName: pulumi.Input<string>;
    /**
     * The Subregion in which you want to create the fGPU.
     */
    subregionName: pulumi.Input<string>;
}
