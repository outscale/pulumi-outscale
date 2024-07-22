// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a network interface card (NIC).
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-FNIs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-nic).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const nic01 = outscale.getNic({
 *     filters: [{
 *         name: "nic_ids",
 *         values: ["eni-12345678"],
 *     }],
 * });
 * ```
 */
export function getNic(args?: GetNicArgs, opts?: pulumi.InvokeOptions): Promise<GetNicResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getNic:getNic", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getNic.
 */
export interface GetNicArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetNicFilter[];
}

/**
 * A collection of values returned by getNic.
 */
export interface GetNicResult {
    /**
     * The account ID of the owner of the NIC.
     */
    readonly accountId: string;
    /**
     * The description of the NIC.
     */
    readonly description: string;
    readonly filters?: outputs.GetNicFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
     */
    readonly isSourceDestChecked: boolean;
    /**
     * Information about the NIC attachment.
     */
    readonly linkNics: outputs.GetNicLinkNic[];
    /**
     * Information about the public IP association.
     */
    readonly linkPublicIps: outputs.GetNicLinkPublicIp[];
    /**
     * The Media Access Control (MAC) address of the NIC.
     */
    readonly macAddress: string;
    /**
     * The ID of the Net for the NIC.
     */
    readonly netId: string;
    /**
     * The ID of the NIC.
     */
    readonly nicId: string;
    /**
     * The name of the private DNS.
     */
    readonly privateDnsName: string;
    /**
     * The private IP of the NIC.
     */
    readonly privateIp: string;
    /**
     * The private IPs of the NIC.
     */
    readonly privateIps: outputs.GetNicPrivateIp[];
    readonly requestId: string;
    readonly requesterManaged: boolean;
    /**
     * The ID of the security group.
     */
    readonly securityGroupIds: string[];
    /**
     * One or more IDs of security groups for the NIC.
     */
    readonly securityGroups: outputs.GetNicSecurityGroup[];
    /**
     * The state of the NIC (`available` \| `attaching` \| `in-use` \| `detaching`).
     */
    readonly state: string;
    /**
     * The ID of the Subnet.
     */
    readonly subnetId: string;
    /**
     * The Subregion in which the NIC is located.
     */
    readonly subregionName: string;
    /**
     * One or more tags associated with the NIC.
     */
    readonly tags: outputs.GetNicTag[];
}
/**
 * Provides information about a network interface card (NIC).
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-FNIs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-nic).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const nic01 = outscale.getNic({
 *     filters: [{
 *         name: "nic_ids",
 *         values: ["eni-12345678"],
 *     }],
 * });
 * ```
 */
export function getNicOutput(args?: GetNicOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNicResult> {
    return pulumi.output(args).apply((a: any) => getNic(a, opts))
}

/**
 * A collection of arguments for invoking getNic.
 */
export interface GetNicOutputArgs {
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetNicFilterArgs>[]>;
}
