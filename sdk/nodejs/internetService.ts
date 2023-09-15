// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class InternetService extends pulumi.CustomResource {
    /**
     * Get an existing InternetService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InternetServiceState, opts?: pulumi.CustomResourceOptions): InternetService {
        return new InternetService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/internetService:InternetService';

    /**
     * Returns true if the given object is an instance of InternetService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InternetService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InternetService.__pulumiType;
    }

    public /*out*/ readonly internetServiceId!: pulumi.Output<string>;
    public /*out*/ readonly netId!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    public /*out*/ readonly state!: pulumi.Output<string>;
    public readonly tags!: pulumi.Output<outputs.InternetServiceTag[] | undefined>;

    /**
     * Create a InternetService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: InternetServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InternetServiceArgs | InternetServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InternetServiceState | undefined;
            resourceInputs["internetServiceId"] = state ? state.internetServiceId : undefined;
            resourceInputs["netId"] = state ? state.netId : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as InternetServiceArgs | undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["internetServiceId"] = undefined /*out*/;
            resourceInputs["netId"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InternetService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InternetService resources.
 */
export interface InternetServiceState {
    internetServiceId?: pulumi.Input<string>;
    netId?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    state?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<inputs.InternetServiceTag>[]>;
}

/**
 * The set of arguments for constructing a InternetService resource.
 */
export interface InternetServiceArgs {
    tags?: pulumi.Input<pulumi.Input<inputs.InternetServiceTag>[]>;
}