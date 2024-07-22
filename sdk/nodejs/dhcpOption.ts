// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a DHCP option.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-DHCP-Options.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-dhcpoption).
 *
 * ## Example Usage
 * ### Create a basic DHCP options set
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const dhcpOption01 = new outscale.DhcpOption("dhcpOption01", {domainName: "MyCompany.com"});
 * ```
 * ### Create a complete DHCP options set
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const dhcpOption02 = new outscale.DhcpOption("dhcpOption02", {
 *     domainName: "MyCompany.com",
 *     domainNameServers: [
 *         "111.111.11.111",
 *         "222.222.22.222",
 *     ],
 *     ntpServers: [
 *         "111.1.1.1",
 *         "222.2.2.2",
 *     ],
 *     tags: [{
 *         key: "Name",
 *         value: "DHCP01",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * DHCP options can be imported using the DHCP option ID. For exampleconsole
 *
 * ```sh
 *  $ pulumi import outscale:index/dhcpOption:DhcpOption ImportedDhcpSet dopt-87654321
 * ```
 */
export class DhcpOption extends pulumi.CustomResource {
    /**
     * Get an existing DhcpOption resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DhcpOptionState, opts?: pulumi.CustomResourceOptions): DhcpOption {
        return new DhcpOption(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/dhcpOption:DhcpOption';

    /**
     * Returns true if the given object is an instance of DhcpOption.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DhcpOption {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DhcpOption.__pulumiType;
    }

    /**
     * If true, the DHCP options set is a default one. If false, it is not.
     */
    public /*out*/ readonly default!: pulumi.Output<boolean>;
    /**
     * The ID of the DHCP options set.
     */
    public /*out*/ readonly dhcpOptionsSetId!: pulumi.Output<string>;
    /**
     * Specify a domain name (for example, MyCompany.com). You can specify only one domain name. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * The IPs of domain name servers. If no IPs are specified, the `OutscaleProvidedDNS` value is set by default. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    public readonly domainNameServers!: pulumi.Output<string[]>;
    /**
     * The IPs of the log servers. You must specify at least one of the following parameters: `domainName`, `domainNameServers`, `logServers`, or `ntpServers`.
     */
    public readonly logServers!: pulumi.Output<string[]>;
    /**
     * The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    public readonly ntpServers!: pulumi.Output<string[]>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    public readonly tags!: pulumi.Output<outputs.DhcpOptionTag[] | undefined>;

    /**
     * Create a DhcpOption resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DhcpOptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DhcpOptionArgs | DhcpOptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DhcpOptionState | undefined;
            resourceInputs["default"] = state ? state.default : undefined;
            resourceInputs["dhcpOptionsSetId"] = state ? state.dhcpOptionsSetId : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["domainNameServers"] = state ? state.domainNameServers : undefined;
            resourceInputs["logServers"] = state ? state.logServers : undefined;
            resourceInputs["ntpServers"] = state ? state.ntpServers : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DhcpOptionArgs | undefined;
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["domainNameServers"] = args ? args.domainNameServers : undefined;
            resourceInputs["logServers"] = args ? args.logServers : undefined;
            resourceInputs["ntpServers"] = args ? args.ntpServers : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["default"] = undefined /*out*/;
            resourceInputs["dhcpOptionsSetId"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DhcpOption.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DhcpOption resources.
 */
export interface DhcpOptionState {
    /**
     * If true, the DHCP options set is a default one. If false, it is not.
     */
    default?: pulumi.Input<boolean>;
    /**
     * The ID of the DHCP options set.
     */
    dhcpOptionsSetId?: pulumi.Input<string>;
    /**
     * Specify a domain name (for example, MyCompany.com). You can specify only one domain name. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    domainName?: pulumi.Input<string>;
    /**
     * The IPs of domain name servers. If no IPs are specified, the `OutscaleProvidedDNS` value is set by default. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    domainNameServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The IPs of the log servers. You must specify at least one of the following parameters: `domainName`, `domainNameServers`, `logServers`, or `ntpServers`.
     */
    logServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    requestId?: pulumi.Input<string>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.DhcpOptionTag>[]>;
}

/**
 * The set of arguments for constructing a DhcpOption resource.
 */
export interface DhcpOptionArgs {
    /**
     * Specify a domain name (for example, MyCompany.com). You can specify only one domain name. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    domainName?: pulumi.Input<string>;
    /**
     * The IPs of domain name servers. If no IPs are specified, the `OutscaleProvidedDNS` value is set by default. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    domainNameServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The IPs of the log servers. You must specify at least one of the following parameters: `domainName`, `domainNameServers`, `logServers`, or `ntpServers`.
     */
    logServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     */
    ntpServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A tag to add to this resource. You can specify this argument several times.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.DhcpOptionTag>[]>;
}
