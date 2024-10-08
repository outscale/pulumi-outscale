// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a load balancer policy.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancerpolicy).
 *
 * ## Example Usage
 * ### Create a load balancer policy based on browser
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const loadBalancer01 = new outscale.LoadBalancer("loadBalancer01", {
 *     listeners: [{
 *         backendPort: 8080,
 *         backendProtocol: "HTTP",
 *         loadBalancerPort: 8080,
 *         loadBalancerProtocol: "HTTP",
 *     }],
 *     loadBalancerName: "terraform-lb-for-browser-policy",
 *     subregionNames: ["eu-west-2a"],
 * });
 * const loadBalancerPolicy01 = new outscale.LoadBalancerPolicy("loadBalancerPolicy01", {
 *     loadBalancerName: "terraform-lb-for-browser-policy",
 *     policyName: "terraform-lb-browser-policy",
 *     policyType: "load_balancer",
 * });
 * ```
 * ### Create a load balancer policy based on application cookie
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const loadBalancer02 = new outscale.LoadBalancer("loadBalancer02", {
 *     loadBalancerName: "terraform-lb-for-app-policy",
 *     subregionNames: [`${_var.region}b`],
 *     listeners: [{
 *         loadBalancerPort: 80,
 *         loadBalancerProtocol: "TCP",
 *         backendPort: 80,
 *         backendProtocol: "TCP",
 *     }],
 * });
 * const loadBalancerPolicy02 = new outscale.LoadBalancerPolicy("loadBalancerPolicy02", {
 *     loadBalancerName: loadBalancer02.loadBalancerName,
 *     policyName: "terraform-lb-app-policy",
 *     policyType: "app",
 *     cookieName: "cookie01",
 * }, {
 *     dependsOn: [loadBalancer02],
 * });
 * ```
 */
export class LoadBalancerPolicy extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerPolicyState, opts?: pulumi.CustomResourceOptions): LoadBalancerPolicy {
        return new LoadBalancerPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/loadBalancerPolicy:LoadBalancerPolicy';

    /**
     * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerPolicy.__pulumiType;
    }

    /**
     * Information about access logs.
     */
    public readonly accessLogs!: pulumi.Output<outputs.LoadBalancerPolicyAccessLog[]>;
    /**
     * The stickiness policies defined for the load balancer.
     */
    public /*out*/ readonly applicationStickyCookiePolicies!: pulumi.Output<outputs.LoadBalancerPolicyApplicationStickyCookiePolicy[]>;
    /**
     * One or more IDs of back-end VMs for the load balancer.
     */
    public readonly backendVmIds!: pulumi.Output<string[]>;
    public readonly cookieExpirationPeriod!: pulumi.Output<number>;
    /**
     * The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
     */
    public readonly cookieName!: pulumi.Output<string>;
    /**
     * The DNS name of the load balancer.
     */
    public /*out*/ readonly dnsName!: pulumi.Output<string>;
    /**
     * Information about the health check configuration.
     */
    public /*out*/ readonly healthChecks!: pulumi.Output<outputs.LoadBalancerPolicyHealthCheck[]>;
    /**
     * The listeners for the load balancer.
     */
    public /*out*/ readonly listeners!: pulumi.Output<outputs.LoadBalancerPolicyListener[]>;
    /**
     * The name of the load balancer for which you want to create a policy.
     */
    public readonly loadBalancerName!: pulumi.Output<string>;
    /**
     * The policies defined for the load balancer.
     */
    public /*out*/ readonly loadBalancerStickyCookiePolicies!: pulumi.Output<outputs.LoadBalancerPolicyLoadBalancerStickyCookiePolicy[]>;
    /**
     * The type of load balancer. Valid only for load balancers in a Net.<br />
     * If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
     * If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     */
    public readonly loadBalancerType!: pulumi.Output<string>;
    /**
     * The ID of the Net for the load balancer.
     */
    public /*out*/ readonly netId!: pulumi.Output<string>;
    /**
     * The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     */
    public readonly policyName!: pulumi.Output<string>;
    /**
     * The type of stickiness policy you want to create: `app` or `loadBalancer`.
     */
    public readonly policyType!: pulumi.Output<string>;
    public /*out*/ readonly publicIp!: pulumi.Output<string>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    public /*out*/ readonly securedCookies!: pulumi.Output<boolean>;
    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     */
    public readonly securityGroups!: pulumi.Output<string[]>;
    /**
     * Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     */
    public /*out*/ readonly sourceSecurityGroups!: pulumi.Output<outputs.LoadBalancerPolicySourceSecurityGroup[]>;
    /**
     * The ID of the Subnet in which the load balancer was created.
     */
    public readonly subnets!: pulumi.Output<string[]>;
    /**
     * The ID of the Subregion in which the load balancer was created.
     */
    public readonly subregionNames!: pulumi.Output<string[]>;
    /**
     * One or more tags associated with the load balancer.
     */
    public readonly tags!: pulumi.Output<outputs.LoadBalancerPolicyTag[]>;

    /**
     * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerPolicyArgs | LoadBalancerPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerPolicyState | undefined;
            resourceInputs["accessLogs"] = state ? state.accessLogs : undefined;
            resourceInputs["applicationStickyCookiePolicies"] = state ? state.applicationStickyCookiePolicies : undefined;
            resourceInputs["backendVmIds"] = state ? state.backendVmIds : undefined;
            resourceInputs["cookieExpirationPeriod"] = state ? state.cookieExpirationPeriod : undefined;
            resourceInputs["cookieName"] = state ? state.cookieName : undefined;
            resourceInputs["dnsName"] = state ? state.dnsName : undefined;
            resourceInputs["healthChecks"] = state ? state.healthChecks : undefined;
            resourceInputs["listeners"] = state ? state.listeners : undefined;
            resourceInputs["loadBalancerName"] = state ? state.loadBalancerName : undefined;
            resourceInputs["loadBalancerStickyCookiePolicies"] = state ? state.loadBalancerStickyCookiePolicies : undefined;
            resourceInputs["loadBalancerType"] = state ? state.loadBalancerType : undefined;
            resourceInputs["netId"] = state ? state.netId : undefined;
            resourceInputs["policyName"] = state ? state.policyName : undefined;
            resourceInputs["policyType"] = state ? state.policyType : undefined;
            resourceInputs["publicIp"] = state ? state.publicIp : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["securedCookies"] = state ? state.securedCookies : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
            resourceInputs["sourceSecurityGroups"] = state ? state.sourceSecurityGroups : undefined;
            resourceInputs["subnets"] = state ? state.subnets : undefined;
            resourceInputs["subregionNames"] = state ? state.subregionNames : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as LoadBalancerPolicyArgs | undefined;
            if ((!args || args.loadBalancerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerName'");
            }
            if ((!args || args.policyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyName'");
            }
            if ((!args || args.policyType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyType'");
            }
            resourceInputs["accessLogs"] = args ? args.accessLogs : undefined;
            resourceInputs["backendVmIds"] = args ? args.backendVmIds : undefined;
            resourceInputs["cookieExpirationPeriod"] = args ? args.cookieExpirationPeriod : undefined;
            resourceInputs["cookieName"] = args ? args.cookieName : undefined;
            resourceInputs["loadBalancerName"] = args ? args.loadBalancerName : undefined;
            resourceInputs["loadBalancerType"] = args ? args.loadBalancerType : undefined;
            resourceInputs["policyName"] = args ? args.policyName : undefined;
            resourceInputs["policyType"] = args ? args.policyType : undefined;
            resourceInputs["securityGroups"] = args ? args.securityGroups : undefined;
            resourceInputs["subnets"] = args ? args.subnets : undefined;
            resourceInputs["subregionNames"] = args ? args.subregionNames : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["applicationStickyCookiePolicies"] = undefined /*out*/;
            resourceInputs["dnsName"] = undefined /*out*/;
            resourceInputs["healthChecks"] = undefined /*out*/;
            resourceInputs["listeners"] = undefined /*out*/;
            resourceInputs["loadBalancerStickyCookiePolicies"] = undefined /*out*/;
            resourceInputs["netId"] = undefined /*out*/;
            resourceInputs["publicIp"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["securedCookies"] = undefined /*out*/;
            resourceInputs["sourceSecurityGroups"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancerPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerPolicy resources.
 */
export interface LoadBalancerPolicyState {
    /**
     * Information about access logs.
     */
    accessLogs?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicyAccessLog>[]>;
    /**
     * The stickiness policies defined for the load balancer.
     */
    applicationStickyCookiePolicies?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicyApplicationStickyCookiePolicy>[]>;
    /**
     * One or more IDs of back-end VMs for the load balancer.
     */
    backendVmIds?: pulumi.Input<pulumi.Input<string>[]>;
    cookieExpirationPeriod?: pulumi.Input<number>;
    /**
     * The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
     */
    cookieName?: pulumi.Input<string>;
    /**
     * The DNS name of the load balancer.
     */
    dnsName?: pulumi.Input<string>;
    /**
     * Information about the health check configuration.
     */
    healthChecks?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicyHealthCheck>[]>;
    /**
     * The listeners for the load balancer.
     */
    listeners?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicyListener>[]>;
    /**
     * The name of the load balancer for which you want to create a policy.
     */
    loadBalancerName?: pulumi.Input<string>;
    /**
     * The policies defined for the load balancer.
     */
    loadBalancerStickyCookiePolicies?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicyLoadBalancerStickyCookiePolicy>[]>;
    /**
     * The type of load balancer. Valid only for load balancers in a Net.<br />
     * If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
     * If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     */
    loadBalancerType?: pulumi.Input<string>;
    /**
     * The ID of the Net for the load balancer.
     */
    netId?: pulumi.Input<string>;
    /**
     * The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     */
    policyName?: pulumi.Input<string>;
    /**
     * The type of stickiness policy you want to create: `app` or `loadBalancer`.
     */
    policyType?: pulumi.Input<string>;
    publicIp?: pulumi.Input<string>;
    requestId?: pulumi.Input<string>;
    securedCookies?: pulumi.Input<boolean>;
    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     */
    sourceSecurityGroups?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicySourceSecurityGroup>[]>;
    /**
     * The ID of the Subnet in which the load balancer was created.
     */
    subnets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the Subregion in which the load balancer was created.
     */
    subregionNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more tags associated with the load balancer.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicyTag>[]>;
}

/**
 * The set of arguments for constructing a LoadBalancerPolicy resource.
 */
export interface LoadBalancerPolicyArgs {
    /**
     * Information about access logs.
     */
    accessLogs?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicyAccessLog>[]>;
    /**
     * One or more IDs of back-end VMs for the load balancer.
     */
    backendVmIds?: pulumi.Input<pulumi.Input<string>[]>;
    cookieExpirationPeriod?: pulumi.Input<number>;
    /**
     * The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
     */
    cookieName?: pulumi.Input<string>;
    /**
     * The name of the load balancer for which you want to create a policy.
     */
    loadBalancerName: pulumi.Input<string>;
    /**
     * The type of load balancer. Valid only for load balancers in a Net.<br />
     * If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
     * If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     */
    loadBalancerType?: pulumi.Input<string>;
    /**
     * The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     */
    policyName: pulumi.Input<string>;
    /**
     * The type of stickiness policy you want to create: `app` or `loadBalancer`.
     */
    policyType: pulumi.Input<string>;
    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the Subnet in which the load balancer was created.
     */
    subnets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the Subregion in which the load balancer was created.
     */
    subregionNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more tags associated with the load balancer.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPolicyTag>[]>;
}
