// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages an API access rule.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-API-Access-Rules.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-apiaccessrule).
 *
 * ## Example Usage
 * ### Create an API access rule based on IPs
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const apiAccessRule01 = new outscale.ApiAccessRule("apiAccessRule01", {
 *     description: "Basic API Access Rule from Terraform",
 *     ipRanges: [
 *         "192.0.2.0",
 *         "192.0.2.0/16",
 *     ],
 * });
 * ```
 * ### Create an API access rule based on IPs and Certificate Authority (CA)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const ca01 = new outscale.Ca("ca01", {
 *     caPem: fs.readFileSync("<PATH>", "utf8"),
 *     description: "Terraform CA",
 * });
 * const apiAccessRule02 = new outscale.ApiAccessRule("apiAccessRule02", {
 *     ipRanges: [
 *         "192.0.2.0",
 *         "192.0.2.0/16",
 *     ],
 *     caIds: [ca01.caId],
 *     description: "API Access Rule with CA from Terraform",
 * });
 * ```
 *
 * ## Import
 *
 * An API access rule can be imported using its ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/apiAccessRule:ApiAccessRule ImportedAPIAccessRule "aar-12345678"
 * ```
 */
export class ApiAccessRule extends pulumi.CustomResource {
    /**
     * Get an existing ApiAccessRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiAccessRuleState, opts?: pulumi.CustomResourceOptions): ApiAccessRule {
        return new ApiAccessRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/apiAccessRule:ApiAccessRule';

    /**
     * Returns true if the given object is an instance of ApiAccessRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiAccessRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiAccessRule.__pulumiType;
    }

    /**
     * The ID of the API access rule.
     */
    public /*out*/ readonly apiAccessRuleId!: pulumi.Output<string>;
    /**
     * One or more IDs of Client Certificate Authorities (CAs).
     */
    public readonly caIds!: pulumi.Output<string[] | undefined>;
    /**
     * One or more Client Certificate Common Names (CNs). If this parameter is specified, you must also specify the `caIds` parameter.
     */
    public readonly cns!: pulumi.Output<string[] | undefined>;
    /**
     * A description for the API access rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * One or more IP addresses or CIDR blocks (for example, `192.0.2.0/16`).
     */
    public readonly ipRanges!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;

    /**
     * Create a ApiAccessRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ApiAccessRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiAccessRuleArgs | ApiAccessRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiAccessRuleState | undefined;
            resourceInputs["apiAccessRuleId"] = state ? state.apiAccessRuleId : undefined;
            resourceInputs["caIds"] = state ? state.caIds : undefined;
            resourceInputs["cns"] = state ? state.cns : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ipRanges"] = state ? state.ipRanges : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
        } else {
            const args = argsOrState as ApiAccessRuleArgs | undefined;
            resourceInputs["caIds"] = args ? args.caIds : undefined;
            resourceInputs["cns"] = args ? args.cns : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["ipRanges"] = args ? args.ipRanges : undefined;
            resourceInputs["apiAccessRuleId"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApiAccessRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiAccessRule resources.
 */
export interface ApiAccessRuleState {
    /**
     * The ID of the API access rule.
     */
    apiAccessRuleId?: pulumi.Input<string>;
    /**
     * One or more IDs of Client Certificate Authorities (CAs).
     */
    caIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more Client Certificate Common Names (CNs). If this parameter is specified, you must also specify the `caIds` parameter.
     */
    cns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A description for the API access rule.
     */
    description?: pulumi.Input<string>;
    /**
     * One or more IP addresses or CIDR blocks (for example, `192.0.2.0/16`).
     */
    ipRanges?: pulumi.Input<pulumi.Input<string>[]>;
    requestId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiAccessRule resource.
 */
export interface ApiAccessRuleArgs {
    /**
     * One or more IDs of Client Certificate Authorities (CAs).
     */
    caIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more Client Certificate Common Names (CNs). If this parameter is specified, you must also specify the `caIds` parameter.
     */
    cns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A description for the API access rule.
     */
    description?: pulumi.Input<string>;
    /**
     * One or more IP addresses or CIDR blocks (for example, `192.0.2.0/16`).
     */
    ipRanges?: pulumi.Input<pulumi.Input<string>[]>;
}
