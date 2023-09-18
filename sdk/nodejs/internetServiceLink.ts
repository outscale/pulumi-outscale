// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages an Internet service link.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Internet-Gateways.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-internetservice).
 *
 * ## Example Usage
 * ### Required resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const net01 = new outscale.Net("net01", {ipRange: "10.0.0.0/18"});
 * const internetService01 = new outscale.InternetService("internetService01", {});
 * ```
 * ### Link an Internet service to a Net
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const internetServiceLink01 = new outscale.InternetServiceLink("internetServiceLink01", {
 *     internetServiceId: outscale_internet_service.internet_service01.internet_service_id,
 *     netId: outscale_net.net01.net_id,
 * });
 * ```
 *
 * ## Import
 *
 * An internet service link can be imported using the internet service ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/internetServiceLink:InternetServiceLink ImportedInternetServiceLink igw-87654321
 * ```
 */
export class InternetServiceLink extends pulumi.CustomResource {
    /**
     * Get an existing InternetServiceLink resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InternetServiceLinkState, opts?: pulumi.CustomResourceOptions): InternetServiceLink {
        return new InternetServiceLink(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/internetServiceLink:InternetServiceLink';

    /**
     * Returns true if the given object is an instance of InternetServiceLink.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InternetServiceLink {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InternetServiceLink.__pulumiType;
    }

    /**
     * The ID of the Internet service you want to attach.
     */
    public readonly internetServiceId!: pulumi.Output<string>;
    /**
     * The ID of the Net to which you want to attach the Internet service.
     */
    public readonly netId!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The state of the attachment of the Internet service to the Net (always `available`).
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * One or more tags associated with the Internet service.
     */
    public /*out*/ readonly tags!: pulumi.Output<outputs.InternetServiceLinkTag[]>;

    /**
     * Create a InternetServiceLink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InternetServiceLinkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InternetServiceLinkArgs | InternetServiceLinkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InternetServiceLinkState | undefined;
            resourceInputs["internetServiceId"] = state ? state.internetServiceId : undefined;
            resourceInputs["netId"] = state ? state.netId : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as InternetServiceLinkArgs | undefined;
            if ((!args || args.internetServiceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'internetServiceId'");
            }
            if ((!args || args.netId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'netId'");
            }
            resourceInputs["internetServiceId"] = args ? args.internetServiceId : undefined;
            resourceInputs["netId"] = args ? args.netId : undefined;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tags"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InternetServiceLink.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InternetServiceLink resources.
 */
export interface InternetServiceLinkState {
    /**
     * The ID of the Internet service you want to attach.
     */
    internetServiceId?: pulumi.Input<string>;
    /**
     * The ID of the Net to which you want to attach the Internet service.
     */
    netId?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    /**
     * The state of the attachment of the Internet service to the Net (always `available`).
     */
    state?: pulumi.Input<string>;
    /**
     * One or more tags associated with the Internet service.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.InternetServiceLinkTag>[]>;
}

/**
 * The set of arguments for constructing a InternetServiceLink resource.
 */
export interface InternetServiceLinkArgs {
    /**
     * The ID of the Internet service you want to attach.
     */
    internetServiceId: pulumi.Input<string>;
    /**
     * The ID of the Net to which you want to attach the Internet service.
     */
    netId: pulumi.Input<string>;
}
