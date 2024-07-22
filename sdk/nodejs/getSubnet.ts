// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Subnet.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-subnet).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const subnet01 = outscale.getSubnet({
 *     filters: [{
 *         name: "net_ids",
 *         values: ["vpc-12345678"],
 *     }],
 * });
 * ```
 */
export function getSubnet(args?: GetSubnetArgs, opts?: pulumi.InvokeOptions): Promise<GetSubnetResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getSubnet:getSubnet", {
        "filters": args.filters,
        "subnetId": args.subnetId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubnet.
 */
export interface GetSubnetArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetSubnetFilter[];
    /**
     * The ID of the Subnet.
     */
    subnetId?: string;
}

/**
 * A collection of values returned by getSubnet.
 */
export interface GetSubnetResult {
    /**
     * The number of available IPs in the Subnets.
     */
    readonly availableIpsCount: number;
    readonly filters?: outputs.GetSubnetFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).
     */
    readonly ipRange: string;
    /**
     * If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
     */
    readonly mapPublicIpOnLaunch: boolean;
    /**
     * The ID of the Net in which the Subnet is.
     */
    readonly netId: string;
    readonly requestId: string;
    /**
     * The state of the Subnet (`pending` \| `available` \| `deleted`).
     */
    readonly state: string;
    /**
     * The ID of the Subnet.
     */
    readonly subnetId: string;
    /**
     * The name of the Subregion in which the Subnet is located.
     */
    readonly subregionName: string;
    /**
     * One or more tags associated with the Subnet.
     */
    readonly tags: outputs.GetSubnetTag[];
}
/**
 * Provides information about a Subnet.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-subnet).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const subnet01 = outscale.getSubnet({
 *     filters: [{
 *         name: "net_ids",
 *         values: ["vpc-12345678"],
 *     }],
 * });
 * ```
 */
export function getSubnetOutput(args?: GetSubnetOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubnetResult> {
    return pulumi.output(args).apply((a: any) => getSubnet(a, opts))
}

/**
 * A collection of arguments for invoking getSubnet.
 */
export interface GetSubnetOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetSubnetFilterArgs>[]>;
    /**
     * The ID of the Subnet.
     */
    subnetId?: pulumi.Input<string>;
}
