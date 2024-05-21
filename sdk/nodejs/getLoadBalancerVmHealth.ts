// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about the health of one or more back-end VMs registered with a specific load balancer.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmshealth).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const loadBalancerVmHealth01 = outscale.getLoadBalancerVmHealth({
 *     backendVmIds: [
 *         "i-12345678",
 *         "i-87654321",
 *     ],
 *     loadBalancerName: "load_balancer01",
 * });
 * ```
 */
export function getLoadBalancerVmHealth(args: GetLoadBalancerVmHealthArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancerVmHealthResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getLoadBalancerVmHealth:getLoadBalancerVmHealth", {
        "backendVmIds": args.backendVmIds,
        "filters": args.filters,
        "loadBalancerName": args.loadBalancerName,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancerVmHealth.
 */
export interface GetLoadBalancerVmHealthArgs {
    /**
     * One or more IDs of back-end VMs.
     */
    backendVmIds?: string[];
    filters?: inputs.GetLoadBalancerVmHealthFilter[];
    /**
     * The name of the load balancer.
     */
    loadBalancerName: string;
}

/**
 * A collection of values returned by getLoadBalancerVmHealth.
 */
export interface GetLoadBalancerVmHealthResult {
    /**
     * Information about the health of one or more back-end VMs.
     */
    readonly backendVmHealths: outputs.GetLoadBalancerVmHealthBackendVmHealth[];
    readonly backendVmIds?: string[];
    readonly filters?: outputs.GetLoadBalancerVmHealthFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly loadBalancerName: string;
    readonly requestId: string;
}
/**
 * Provides information about the health of one or more back-end VMs registered with a specific load balancer.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmshealth).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const loadBalancerVmHealth01 = outscale.getLoadBalancerVmHealth({
 *     backendVmIds: [
 *         "i-12345678",
 *         "i-87654321",
 *     ],
 *     loadBalancerName: "load_balancer01",
 * });
 * ```
 */
export function getLoadBalancerVmHealthOutput(args: GetLoadBalancerVmHealthOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLoadBalancerVmHealthResult> {
    return pulumi.output(args).apply((a: any) => getLoadBalancerVmHealth(a, opts))
}

/**
 * A collection of arguments for invoking getLoadBalancerVmHealth.
 */
export interface GetLoadBalancerVmHealthOutputArgs {
    /**
     * One or more IDs of back-end VMs.
     */
    backendVmIds?: pulumi.Input<pulumi.Input<string>[]>;
    filters?: pulumi.Input<pulumi.Input<inputs.GetLoadBalancerVmHealthFilterArgs>[]>;
    /**
     * The name of the load balancer.
     */
    loadBalancerName: pulumi.Input<string>;
}