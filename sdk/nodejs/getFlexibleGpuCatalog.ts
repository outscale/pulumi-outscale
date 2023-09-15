// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about the flexible GPU catalog.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readflexiblegpucatalog).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const flexibleGpuCatalog01 = outscale.getFlexibleGpuCatalog({});
 * ```
 */
export function getFlexibleGpuCatalog(args?: GetFlexibleGpuCatalogArgs, opts?: pulumi.InvokeOptions): Promise<GetFlexibleGpuCatalogResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getFlexibleGpuCatalog:getFlexibleGpuCatalog", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlexibleGpuCatalog.
 */
export interface GetFlexibleGpuCatalogArgs {
    filters?: inputs.GetFlexibleGpuCatalogFilter[];
}

/**
 * A collection of values returned by getFlexibleGpuCatalog.
 */
export interface GetFlexibleGpuCatalogResult {
    readonly filters?: outputs.GetFlexibleGpuCatalogFilter[];
    /**
     * Information about one or more fGPUs available in the public catalog.
     */
    readonly flexibleGpuCatalogs: outputs.GetFlexibleGpuCatalogFlexibleGpuCatalog[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly requestId: string;
}
/**
 * Provides information about the flexible GPU catalog.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readflexiblegpucatalog).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const flexibleGpuCatalog01 = outscale.getFlexibleGpuCatalog({});
 * ```
 */
export function getFlexibleGpuCatalogOutput(args?: GetFlexibleGpuCatalogOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFlexibleGpuCatalogResult> {
    return pulumi.output(args).apply((a: any) => getFlexibleGpuCatalog(a, opts))
}

/**
 * A collection of arguments for invoking getFlexibleGpuCatalog.
 */
export interface GetFlexibleGpuCatalogOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetFlexibleGpuCatalogFilterArgs>[]>;
}
