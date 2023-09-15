// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class Snapshot extends pulumi.CustomResource {
    /**
     * Get an existing Snapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotState, opts?: pulumi.CustomResourceOptions): Snapshot {
        return new Snapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/snapshot:Snapshot';

    /**
     * Returns true if the given object is an instance of Snapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Snapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Snapshot.__pulumiType;
    }

    public /*out*/ readonly accountAlias!: pulumi.Output<string>;
    public /*out*/ readonly accountId!: pulumi.Output<string>;
    public /*out*/ readonly creationDate!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string>;
    public readonly fileLocation!: pulumi.Output<string>;
    public /*out*/ readonly permissionsToCreateVolumes!: pulumi.Output<outputs.SnapshotPermissionsToCreateVolume[]>;
    public /*out*/ readonly progress!: pulumi.Output<number>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    public /*out*/ readonly snapshotId!: pulumi.Output<string>;
    public readonly snapshotSize!: pulumi.Output<number>;
    public readonly sourceRegionName!: pulumi.Output<string>;
    public readonly sourceSnapshotId!: pulumi.Output<string>;
    public /*out*/ readonly state!: pulumi.Output<string>;
    public readonly tags!: pulumi.Output<outputs.SnapshotTag[] | undefined>;
    public readonly volumeId!: pulumi.Output<string>;
    public /*out*/ readonly volumeSize!: pulumi.Output<number>;

    /**
     * Create a Snapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotArgs | SnapshotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotState | undefined;
            resourceInputs["accountAlias"] = state ? state.accountAlias : undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["creationDate"] = state ? state.creationDate : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fileLocation"] = state ? state.fileLocation : undefined;
            resourceInputs["permissionsToCreateVolumes"] = state ? state.permissionsToCreateVolumes : undefined;
            resourceInputs["progress"] = state ? state.progress : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["snapshotId"] = state ? state.snapshotId : undefined;
            resourceInputs["snapshotSize"] = state ? state.snapshotSize : undefined;
            resourceInputs["sourceRegionName"] = state ? state.sourceRegionName : undefined;
            resourceInputs["sourceSnapshotId"] = state ? state.sourceSnapshotId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["volumeId"] = state ? state.volumeId : undefined;
            resourceInputs["volumeSize"] = state ? state.volumeSize : undefined;
        } else {
            const args = argsOrState as SnapshotArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fileLocation"] = args ? args.fileLocation : undefined;
            resourceInputs["snapshotSize"] = args ? args.snapshotSize : undefined;
            resourceInputs["sourceRegionName"] = args ? args.sourceRegionName : undefined;
            resourceInputs["sourceSnapshotId"] = args ? args.sourceSnapshotId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["volumeId"] = args ? args.volumeId : undefined;
            resourceInputs["accountAlias"] = undefined /*out*/;
            resourceInputs["accountId"] = undefined /*out*/;
            resourceInputs["creationDate"] = undefined /*out*/;
            resourceInputs["permissionsToCreateVolumes"] = undefined /*out*/;
            resourceInputs["progress"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["snapshotId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["volumeSize"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Snapshot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snapshot resources.
 */
export interface SnapshotState {
    accountAlias?: pulumi.Input<string>;
    accountId?: pulumi.Input<string>;
    creationDate?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    fileLocation?: pulumi.Input<string>;
    permissionsToCreateVolumes?: pulumi.Input<pulumi.Input<inputs.SnapshotPermissionsToCreateVolume>[]>;
    progress?: pulumi.Input<number>;
    requestId?: pulumi.Input<string>;
    snapshotId?: pulumi.Input<string>;
    snapshotSize?: pulumi.Input<number>;
    sourceRegionName?: pulumi.Input<string>;
    sourceSnapshotId?: pulumi.Input<string>;
    state?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<inputs.SnapshotTag>[]>;
    volumeId?: pulumi.Input<string>;
    volumeSize?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    description?: pulumi.Input<string>;
    fileLocation?: pulumi.Input<string>;
    snapshotSize?: pulumi.Input<number>;
    sourceRegionName?: pulumi.Input<string>;
    sourceSnapshotId?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<inputs.SnapshotTag>[]>;
    volumeId?: pulumi.Input<string>;
}