// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about security groups.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Security-Groups.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-securitygroup).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const securityGroups01 = outscale.getSecurityGroups({
 *     filters: [
 *         {
 *             name: "net_ids",
 *             values: [
 *                 "sg-12345678",
 *                 "sg-87654321",
 *             ],
 *         },
 *         {
 *             name: "inbound_rule_ip_ranges",
 *             values: ["111.11.111.1/32"],
 *         },
 *     ],
 * });
 * ```
 */
export function getSecurityGroups(args?: GetSecurityGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityGroupsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getSecurityGroups:getSecurityGroups", {
        "filters": args.filters,
        "securityGroupIds": args.securityGroupIds,
        "securityGroupNames": args.securityGroupNames,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityGroups.
 */
export interface GetSecurityGroupsArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetSecurityGroupsFilter[];
    /**
     * The IDs of the security groups.
     */
    securityGroupIds?: string[];
    /**
     * The names of the security groups.
     */
    securityGroupNames?: string[];
}

/**
 * A collection of values returned by getSecurityGroups.
 */
export interface GetSecurityGroupsResult {
    readonly filters?: outputs.GetSecurityGroupsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly requestId: string;
    readonly securityGroupIds?: string[];
    readonly securityGroupNames?: string[];
    /**
     * Information about one or more security groups.
     */
    readonly securityGroups: outputs.GetSecurityGroupsSecurityGroup[];
}
/**
 * Provides information about security groups.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Security-Groups.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-securitygroup).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const securityGroups01 = outscale.getSecurityGroups({
 *     filters: [
 *         {
 *             name: "net_ids",
 *             values: [
 *                 "sg-12345678",
 *                 "sg-87654321",
 *             ],
 *         },
 *         {
 *             name: "inbound_rule_ip_ranges",
 *             values: ["111.11.111.1/32"],
 *         },
 *     ],
 * });
 * ```
 */
export function getSecurityGroupsOutput(args?: GetSecurityGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecurityGroupsResult> {
    return pulumi.output(args).apply((a: any) => getSecurityGroups(a, opts))
}

/**
 * A collection of arguments for invoking getSecurityGroups.
 */
export interface GetSecurityGroupsOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetSecurityGroupsFilterArgs>[]>;
    /**
     * The IDs of the security groups.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The names of the security groups.
     */
    securityGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
}