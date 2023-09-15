// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

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
    filters?: inputs.GetSecurityGroupsFilter[];
    securityGroupIds?: string[];
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
    readonly securityGroups: outputs.GetSecurityGroupsSecurityGroup[];
}
export function getSecurityGroupsOutput(args?: GetSecurityGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecurityGroupsResult> {
    return pulumi.output(args).apply((a: any) => getSecurityGroups(a, opts))
}

/**
 * A collection of arguments for invoking getSecurityGroups.
 */
export interface GetSecurityGroupsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetSecurityGroupsFilterArgs>[]>;
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    securityGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
}
