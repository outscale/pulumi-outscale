// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a quota.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Your-Account.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readquotas).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const loadBalancerListenersQuota01 = outscale.getQuota({
 *     filters: [
 *         {
 *             name: "collections",
 *             values: ["LBU"],
 *         },
 *         {
 *             name: "quota_names",
 *             values: ["lb_listeners_limit"],
 *         },
 *         {
 *             name: "quota_types",
 *             values: ["global"],
 *         },
 *         {
 *             name: "short_descriptions",
 *             values: ["Load Balancer Listeners Limit"],
 *         },
 *     ],
 * });
 * ```
 */
export function getQuota(args?: GetQuotaArgs, opts?: pulumi.InvokeOptions): Promise<GetQuotaResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getQuota:getQuota", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getQuota.
 */
export interface GetQuotaArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetQuotaFilter[];
}

/**
 * A collection of values returned by getQuota.
 */
export interface GetQuotaResult {
    /**
     * The account ID of the owner of the quotas.
     */
    readonly accountId: string;
    /**
     * The description of the quota.
     */
    readonly description: string;
    readonly filters?: outputs.GetQuotaFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The maximum value of the quota for the OUTSCALE user account (if there is no limit, `0`).
     */
    readonly maxValue: number;
    /**
     * The unique name of the quota.
     */
    readonly name: string;
    /**
     * The group name of the quota.
     */
    readonly quotaCollection: string;
    /**
     * The resource ID if it is a resource-specific quota, `global` if it is not.
     */
    readonly quotaType: string;
    readonly requestId: string;
    /**
     * The description of the quota.
     */
    readonly shortDescription: string;
    /**
     * The limit value currently used by the OUTSCALE user account.
     */
    readonly usedValue: number;
}
/**
 * Provides information about a quota.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Your-Account.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readquotas).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const loadBalancerListenersQuota01 = outscale.getQuota({
 *     filters: [
 *         {
 *             name: "collections",
 *             values: ["LBU"],
 *         },
 *         {
 *             name: "quota_names",
 *             values: ["lb_listeners_limit"],
 *         },
 *         {
 *             name: "quota_types",
 *             values: ["global"],
 *         },
 *         {
 *             name: "short_descriptions",
 *             values: ["Load Balancer Listeners Limit"],
 *         },
 *     ],
 * });
 * ```
 */
export function getQuotaOutput(args?: GetQuotaOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetQuotaResult> {
    return pulumi.output(args).apply((a: any) => getQuota(a, opts))
}

/**
 * A collection of arguments for invoking getQuota.
 */
export interface GetQuotaOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetQuotaFilterArgs>[]>;
}
