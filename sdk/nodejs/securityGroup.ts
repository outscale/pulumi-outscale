// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a security group.
 *
 * Security groups you create to use in a Net contain a default outbound rule that allows all outbound flows.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Security-Groups.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-securitygroup).
 *
 * ## Example Usage
 * ### Optional resource
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const net01 = new outscale.Net("net01", {ipRange: "10.0.0.0/16"});
 * ```
 * ### Create a security group for a Net
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const securityGroup01 = new outscale.SecurityGroup("securityGroup01", {
 *     description: "Terraform security group",
 *     securityGroupName: "terraform-security-group",
 *     netId: outscale_net.net01.net_id,
 * });
 * ```
 * ### Create a security group for a Net without the default outbound rule
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const securityGroup02 = new outscale.SecurityGroup("securityGroup02", {
 *     removeDefaultOutboundRule: true,
 *     description: "Terraform security group without outbound rule",
 *     securityGroupName: "terraform-security-group-empty",
 *     netId: outscale_net.net01.net_id,
 * });
 * ```
 *
 * ## Import
 *
 * A security group can be imported using its ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/securityGroup:SecurityGroup ImportedSecurityGroup sg-87654321
 * ```
 */
export class SecurityGroup extends pulumi.CustomResource {
    /**
     * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityGroupState, opts?: pulumi.CustomResourceOptions): SecurityGroup {
        return new SecurityGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/securityGroup:SecurityGroup';

    /**
     * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityGroup.__pulumiType;
    }

    /**
     * The account ID that owns the source or destination security group.
     */
    public /*out*/ readonly accountId!: pulumi.Output<string>;
    /**
     * A description for the security group, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The inbound rules associated with the security group.
     */
    public /*out*/ readonly inboundRules!: pulumi.Output<outputs.SecurityGroupInboundRule[]>;
    /**
     * The ID of the Net for the security group.
     */
    public readonly netId!: pulumi.Output<string>;
    /**
     * The outbound rules associated with the security group.
     */
    public /*out*/ readonly outboundRules!: pulumi.Output<outputs.SecurityGroupOutboundRule[]>;
    /**
     * (Net only) By default or if set to false, the security group is created with a default outbound rule allowing all outbound flows. If set to true, the security group is created without a default outbound rule. For an existing security group, setting this parameter to true deletes the security group and creates a new one.
     */
    public readonly removeDefaultOutboundRule!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * The ID of the security group.
     */
    public /*out*/ readonly securityGroupId!: pulumi.Output<string>;
    /**
     * The name of the security group.<br />
     * This name must not start with `sg-`.</br>
     * This name must be unique and contain between 1 and 255 ASCII characters. Accented letters are not allowed.
     */
    public readonly securityGroupName!: pulumi.Output<string>;
    public readonly tag!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    public readonly tags!: pulumi.Output<outputs.SecurityGroupTag[] | undefined>;

    /**
     * Create a SecurityGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SecurityGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityGroupArgs | SecurityGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityGroupState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["inboundRules"] = state ? state.inboundRules : undefined;
            resourceInputs["netId"] = state ? state.netId : undefined;
            resourceInputs["outboundRules"] = state ? state.outboundRules : undefined;
            resourceInputs["removeDefaultOutboundRule"] = state ? state.removeDefaultOutboundRule : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["securityGroupId"] = state ? state.securityGroupId : undefined;
            resourceInputs["securityGroupName"] = state ? state.securityGroupName : undefined;
            resourceInputs["tag"] = state ? state.tag : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as SecurityGroupArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["netId"] = args ? args.netId : undefined;
            resourceInputs["removeDefaultOutboundRule"] = args ? args.removeDefaultOutboundRule : undefined;
            resourceInputs["securityGroupName"] = args ? args.securityGroupName : undefined;
            resourceInputs["tag"] = args ? args.tag : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["accountId"] = undefined /*out*/;
            resourceInputs["inboundRules"] = undefined /*out*/;
            resourceInputs["outboundRules"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["securityGroupId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityGroup resources.
 */
export interface SecurityGroupState {
    /**
     * The account ID that owns the source or destination security group.
     */
    accountId?: pulumi.Input<string>;
    /**
     * A description for the security group, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
     */
    description?: pulumi.Input<string>;
    /**
     * The inbound rules associated with the security group.
     */
    inboundRules?: pulumi.Input<pulumi.Input<inputs.SecurityGroupInboundRule>[]>;
    /**
     * The ID of the Net for the security group.
     */
    netId?: pulumi.Input<string>;
    /**
     * The outbound rules associated with the security group.
     */
    outboundRules?: pulumi.Input<pulumi.Input<inputs.SecurityGroupOutboundRule>[]>;
    /**
     * (Net only) By default or if set to false, the security group is created with a default outbound rule allowing all outbound flows. If set to true, the security group is created without a default outbound rule. For an existing security group, setting this parameter to true deletes the security group and creates a new one.
     */
    removeDefaultOutboundRule?: pulumi.Input<boolean>;
    requestId?: pulumi.Input<string>;
    /**
     * The ID of the security group.
     */
    securityGroupId?: pulumi.Input<string>;
    /**
     * The name of the security group.<br />
     * This name must not start with `sg-`.</br>
     * This name must be unique and contain between 1 and 255 ASCII characters. Accented letters are not allowed.
     */
    securityGroupName?: pulumi.Input<string>;
    tag?: pulumi.Input<{[key: string]: any}>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.SecurityGroupTag>[]>;
}

/**
 * The set of arguments for constructing a SecurityGroup resource.
 */
export interface SecurityGroupArgs {
    /**
     * A description for the security group, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Net for the security group.
     */
    netId?: pulumi.Input<string>;
    /**
     * (Net only) By default or if set to false, the security group is created with a default outbound rule allowing all outbound flows. If set to true, the security group is created without a default outbound rule. For an existing security group, setting this parameter to true deletes the security group and creates a new one.
     */
    removeDefaultOutboundRule?: pulumi.Input<boolean>;
    /**
     * The name of the security group.<br />
     * This name must not start with `sg-`.</br>
     * This name must be unique and contain between 1 and 255 ASCII characters. Accented letters are not allowed.
     */
    securityGroupName?: pulumi.Input<string>;
    tag?: pulumi.Input<{[key: string]: any}>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.SecurityGroupTag>[]>;
}