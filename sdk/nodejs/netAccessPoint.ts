// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Net access point.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Endpoints.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netaccesspoint).
 *
 * ## Example Usage
 * ### Required resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const net01 = new outscale.Net("net01", {ipRange: "10.0.0.0/16"});
 * const routeTable01 = new outscale.RouteTable("routeTable01", {netId: net01.netId});
 * ```
 * ### Create a Net access point
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const netAccessPoint01 = new outscale.NetAccessPoint("netAccessPoint01", {
 *     netId: outscale_net.net01.net_id,
 *     routeTableIds: [outscale_route_table.route_table01.route_table_id],
 *     serviceName: "com.outscale.eu-west-2.api",
 *     tags: [{
 *         key: "name",
 *         value: "terraform-net-access-point",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * A Net access point can be imported using its ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/netAccessPoint:NetAccessPoint ImportedNetAccessPoint vpce-87654321
 * ```
 */
export class NetAccessPoint extends pulumi.CustomResource {
    /**
     * Get an existing NetAccessPoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetAccessPointState, opts?: pulumi.CustomResourceOptions): NetAccessPoint {
        return new NetAccessPoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/netAccessPoint:NetAccessPoint';

    /**
     * Returns true if the given object is an instance of NetAccessPoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetAccessPoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetAccessPoint.__pulumiType;
    }

    /**
     * The ID of the Net access point.
     */
    public /*out*/ readonly netAccessPointId!: pulumi.Output<string>;
    /**
     * The ID of the Net.
     */
    public readonly netId!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * One or more IDs of route tables to use for the connection.
     */
    public readonly routeTableIds!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the service (in the format `com.outscale.region.service`).
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * The state of the Net access point (`pending` \| `available` \| `deleting` \| `deleted`).
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    public readonly tags!: pulumi.Output<outputs.NetAccessPointTag[] | undefined>;

    /**
     * Create a NetAccessPoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetAccessPointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetAccessPointArgs | NetAccessPointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetAccessPointState | undefined;
            resourceInputs["netAccessPointId"] = state ? state.netAccessPointId : undefined;
            resourceInputs["netId"] = state ? state.netId : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["routeTableIds"] = state ? state.routeTableIds : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as NetAccessPointArgs | undefined;
            if ((!args || args.netId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'netId'");
            }
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            resourceInputs["netId"] = args ? args.netId : undefined;
            resourceInputs["routeTableIds"] = args ? args.routeTableIds : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["netAccessPointId"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetAccessPoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetAccessPoint resources.
 */
export interface NetAccessPointState {
    /**
     * The ID of the Net access point.
     */
    netAccessPointId?: pulumi.Input<string>;
    /**
     * The ID of the Net.
     */
    netId?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    /**
     * One or more IDs of route tables to use for the connection.
     */
    routeTableIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the service (in the format `com.outscale.region.service`).
     */
    serviceName?: pulumi.Input<string>;
    /**
     * The state of the Net access point (`pending` \| `available` \| `deleting` \| `deleted`).
     */
    state?: pulumi.Input<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.NetAccessPointTag>[]>;
}

/**
 * The set of arguments for constructing a NetAccessPoint resource.
 */
export interface NetAccessPointArgs {
    /**
     * The ID of the Net.
     */
    netId: pulumi.Input<string>;
    /**
     * One or more IDs of route tables to use for the connection.
     */
    routeTableIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the service (in the format `com.outscale.region.service`).
     */
    serviceName: pulumi.Input<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.NetAccessPointTag>[]>;
}
