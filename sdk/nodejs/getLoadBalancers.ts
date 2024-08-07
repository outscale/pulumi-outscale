// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about load balancers.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancer).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const loadBalancers01 = outscale.getLoadBalancers({
 *     filters: [{
 *         name: "load_balancer_names",
 *         values: [
 *             "load_balancer01",
 *             "load_balancer02",
 *         ],
 *     }],
 * });
 * ```
 */
export function getLoadBalancers(args?: GetLoadBalancersArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getLoadBalancers:getLoadBalancers", {
        "filters": args.filters,
        "loadBalancerNames": args.loadBalancerNames,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancers.
 */
export interface GetLoadBalancersArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetLoadBalancersFilter[];
    /**
     * The name of the load balancer.
     */
    loadBalancerNames?: string[];
}

/**
 * A collection of values returned by getLoadBalancers.
 */
export interface GetLoadBalancersResult {
    readonly filters?: outputs.GetLoadBalancersFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the load balancer.
     */
    readonly loadBalancerNames?: string[];
    readonly loadBalancers: outputs.GetLoadBalancersLoadBalancer[];
    readonly requestId: string;
}
/**
 * Provides information about load balancers.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancer).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const loadBalancers01 = outscale.getLoadBalancers({
 *     filters: [{
 *         name: "load_balancer_names",
 *         values: [
 *             "load_balancer01",
 *             "load_balancer02",
 *         ],
 *     }],
 * });
 * ```
 */
export function getLoadBalancersOutput(args?: GetLoadBalancersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLoadBalancersResult> {
    return pulumi.output(args).apply((a: any) => getLoadBalancers(a, opts))
}

/**
 * A collection of arguments for invoking getLoadBalancers.
 */
export interface GetLoadBalancersOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetLoadBalancersFilterArgs>[]>;
    /**
     * The name of the load balancer.
     */
    loadBalancerNames?: pulumi.Input<pulumi.Input<string>[]>;
}
