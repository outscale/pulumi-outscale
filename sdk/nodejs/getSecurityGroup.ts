// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a security group.
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
 * const securityGroup01 = outscale.getSecurityGroup({
 *     filters: [{
 *         name: "security_group_ids",
 *         values: ["sg-12345678"],
 *     }],
 * });
 * ```
 */
export function getSecurityGroup(args?: GetSecurityGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityGroupResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getSecurityGroup:getSecurityGroup", {
        "filters": args.filters,
        "securityGroupId": args.securityGroupId,
        "securityGroupName": args.securityGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityGroup.
 */
export interface GetSecurityGroupArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetSecurityGroupFilter[];
    /**
     * The ID of the security group.
     */
    securityGroupId?: string;
    /**
     * The name of the security group.
     */
    securityGroupName?: string;
}

/**
 * A collection of values returned by getSecurityGroup.
 */
export interface GetSecurityGroupResult {
    /**
     * The account ID that owns the source or destination security group.
     */
    readonly accountId: string;
    /**
     * The description of the security group.
     */
    readonly description: string;
    readonly filters?: outputs.GetSecurityGroupFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The inbound rules associated with the security group.
     */
    readonly inboundRules: outputs.GetSecurityGroupInboundRule[];
    /**
     * The ID of the Net for the security group.
     */
    readonly netId: string;
    /**
     * The outbound rules associated with the security group.
     */
    readonly outboundRules: outputs.GetSecurityGroupOutboundRule[];
    readonly requestId: string;
    /**
     * The ID of the security group.
     */
    readonly securityGroupId: string;
    /**
     * The name of the security group.
     */
    readonly securityGroupName: string;
    /**
     * One or more tags associated with the security group.
     */
    readonly tags: outputs.GetSecurityGroupTag[];
}
/**
 * Provides information about a security group.
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
 * const securityGroup01 = outscale.getSecurityGroup({
 *     filters: [{
 *         name: "security_group_ids",
 *         values: ["sg-12345678"],
 *     }],
 * });
 * ```
 */
export function getSecurityGroupOutput(args?: GetSecurityGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecurityGroupResult> {
    return pulumi.output(args).apply((a: any) => getSecurityGroup(a, opts))
}

/**
 * A collection of arguments for invoking getSecurityGroup.
 */
export interface GetSecurityGroupOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetSecurityGroupFilterArgs>[]>;
    /**
     * The ID of the security group.
     */
    securityGroupId?: pulumi.Input<string>;
    /**
     * The name of the security group.
     */
    securityGroupName?: pulumi.Input<string>;
}
