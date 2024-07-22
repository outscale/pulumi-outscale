// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const accessKey01 = new outscale.AccessKey("accessKey01", {
 *     expirationDate: "2023-01-01",
 *     state: "ACTIVE",
 * });
 * ```
 *
 * ## Import
 *
 * An access key can be imported using its ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/accessKey:AccessKey ImportedAccessKey ABCDEFGHIJ0123456789
 * ```
 */
export class AccessKey extends pulumi.CustomResource {
    /**
     * Get an existing AccessKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessKeyState, opts?: pulumi.CustomResourceOptions): AccessKey {
        return new AccessKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/accessKey:AccessKey';

    /**
     * Returns true if the given object is an instance of AccessKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessKey.__pulumiType;
    }

    /**
     * The ID of the access key.
     */
    public /*out*/ readonly accessKeyId!: pulumi.Output<string>;
    /**
     * The date and time (UTC) of creation of the access key.
     */
    public /*out*/ readonly creationDate!: pulumi.Output<string>;
    /**
     * The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
     */
    public readonly expirationDate!: pulumi.Output<string | undefined>;
    /**
     * The date and time (UTC) of the last modification of the access key.
     */
    public /*out*/ readonly lastModificationDate!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The access key that enables you to send requests.
     */
    public /*out*/ readonly secretKey!: pulumi.Output<string>;
    /**
     * The state for the access key (`ACTIVE` | `INACTIVE`).
     */
    public readonly state!: pulumi.Output<string | undefined>;

    /**
     * Create a AccessKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AccessKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessKeyArgs | AccessKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessKeyState | undefined;
            resourceInputs["accessKeyId"] = state ? state.accessKeyId : undefined;
            resourceInputs["creationDate"] = state ? state.creationDate : undefined;
            resourceInputs["expirationDate"] = state ? state.expirationDate : undefined;
            resourceInputs["lastModificationDate"] = state ? state.lastModificationDate : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["secretKey"] = state ? state.secretKey : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as AccessKeyArgs | undefined;
            resourceInputs["expirationDate"] = args ? args.expirationDate : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["accessKeyId"] = undefined /*out*/;
            resourceInputs["creationDate"] = undefined /*out*/;
            resourceInputs["lastModificationDate"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["secretKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessKey resources.
 */
export interface AccessKeyState {
    /**
     * The ID of the access key.
     */
    accessKeyId?: pulumi.Input<string>;
    /**
     * The date and time (UTC) of creation of the access key.
     */
    creationDate?: pulumi.Input<string>;
    /**
     * The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * The date and time (UTC) of the last modification of the access key.
     */
    lastModificationDate?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    /**
     * The access key that enables you to send requests.
     */
    secretKey?: pulumi.Input<string>;
    /**
     * The state for the access key (`ACTIVE` | `INACTIVE`).
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessKey resource.
 */
export interface AccessKeyArgs {
    /**
     * The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * The state for the access key (`ACTIVE` | `INACTIVE`).
     */
    state?: pulumi.Input<string>;
}
