// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Net peering acceptation.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Peering-Connections.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netpeering).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const netPeeringAcceptation01 = new outscale.NetPeeringAcception("netPeeringAcceptation01", {netPeeringId: outscale_net_peering.net_peering01.net_peering_id});
 * ```
 */
export class NetPeeringAcception extends pulumi.CustomResource {
    /**
     * Get an existing NetPeeringAcception resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetPeeringAcceptionState, opts?: pulumi.CustomResourceOptions): NetPeeringAcception {
        return new NetPeeringAcception(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/netPeeringAcception:NetPeeringAcception';

    /**
     * Returns true if the given object is an instance of NetPeeringAcception.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetPeeringAcception {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetPeeringAcception.__pulumiType;
    }

    public /*out*/ readonly accepterNetId!: pulumi.Output<string>;
    /**
     * Information about the accepter Net.
     */
    public /*out*/ readonly accepterNets!: pulumi.Output<outputs.NetPeeringAcceptionAccepterNet[]>;
    /**
     * The ID of the Net peering you want to accept.
     */
    public readonly netPeeringId!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    public /*out*/ readonly sourceNetId!: pulumi.Output<string>;
    /**
     * Information about the source Net.
     */
    public /*out*/ readonly sourceNets!: pulumi.Output<outputs.NetPeeringAcceptionSourceNet[]>;
    /**
     * Information about the state of the Net peering.
     */
    public /*out*/ readonly states!: pulumi.Output<outputs.NetPeeringAcceptionState[]>;
    /**
     * One or more tags associated with the Net peering.
     */
    public /*out*/ readonly tags!: pulumi.Output<outputs.NetPeeringAcceptionTag[]>;

    /**
     * Create a NetPeeringAcception resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetPeeringAcceptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetPeeringAcceptionArgs | NetPeeringAcceptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetPeeringAcceptionState | undefined;
            resourceInputs["accepterNetId"] = state ? state.accepterNetId : undefined;
            resourceInputs["accepterNets"] = state ? state.accepterNets : undefined;
            resourceInputs["netPeeringId"] = state ? state.netPeeringId : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["sourceNetId"] = state ? state.sourceNetId : undefined;
            resourceInputs["sourceNets"] = state ? state.sourceNets : undefined;
            resourceInputs["states"] = state ? state.states : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as NetPeeringAcceptionArgs | undefined;
            if ((!args || args.netPeeringId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'netPeeringId'");
            }
            resourceInputs["netPeeringId"] = args ? args.netPeeringId : undefined;
            resourceInputs["accepterNetId"] = undefined /*out*/;
            resourceInputs["accepterNets"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["sourceNetId"] = undefined /*out*/;
            resourceInputs["sourceNets"] = undefined /*out*/;
            resourceInputs["states"] = undefined /*out*/;
            resourceInputs["tags"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetPeeringAcception.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetPeeringAcception resources.
 */
export interface NetPeeringAcceptionState {
    accepterNetId?: pulumi.Input<string>;
    /**
     * Information about the accepter Net.
     */
    accepterNets?: pulumi.Input<pulumi.Input<inputs.NetPeeringAcceptionAccepterNet>[]>;
    /**
     * The ID of the Net peering you want to accept.
     */
    netPeeringId?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    sourceNetId?: pulumi.Input<string>;
    /**
     * Information about the source Net.
     */
    sourceNets?: pulumi.Input<pulumi.Input<inputs.NetPeeringAcceptionSourceNet>[]>;
    /**
     * Information about the state of the Net peering.
     */
    states?: pulumi.Input<pulumi.Input<inputs.NetPeeringAcceptionState>[]>;
    /**
     * One or more tags associated with the Net peering.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.NetPeeringAcceptionTag>[]>;
}

/**
 * The set of arguments for constructing a NetPeeringAcception resource.
 */
export interface NetPeeringAcceptionArgs {
    /**
     * The ID of the Net peering you want to accept.
     */
    netPeeringId: pulumi.Input<string>;
}
