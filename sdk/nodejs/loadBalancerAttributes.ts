// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages load balancer attributes.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updateloadbalancer).
 *
 * ## Example Usage
 * ### Required resource
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const loadBalancer01 = new outscale.LoadBalancer("loadBalancer01", {
 *     listeners: [
 *         {
 *             backendPort: 80,
 *             backendProtocol: "HTTP",
 *             loadBalancerPort: 80,
 *             loadBalancerProtocol: "HTTP",
 *         },
 *         {
 *             backendPort: 8080,
 *             backendProtocol: "HTTPS",
 *             loadBalancerPort: 8080,
 *             loadBalancerProtocol: "HTTPS",
 *             serverCertificateId: "arn:aws:iam::012345678910:server-certificate/MyCertificates/Certificate",
 *         },
 *         {
 *             backendPort: 1024,
 *             backendProtocol: "TCP",
 *             loadBalancerPort: 1024,
 *             loadBalancerProtocol: "TCP",
 *         },
 *     ],
 *     loadBalancerName: "terraform-load-balancer",
 *     subregionNames: ["eu-west-2a"],
 *     tags: [
 *         {
 *             key: "name",
 *             value: "terraform-load-balancer",
 *         },
 *         {
 *             key: "platform",
 *             value: "eu-west-2",
 *         },
 *     ],
 * });
 * ```
 * ### Update health check
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const attributes01 = new outscale.LoadBalancerAttributes("attributes01", {
 *     loadBalancerName: outscale_load_balancer.load_balancer01.id,
 *     healthCheck: {
 *         healthyThreshold: 10,
 *         checkInterval: 30,
 *         path: "/index.html",
 *         port: 8080,
 *         protocol: "HTTPS",
 *         timeout: 5,
 *         unhealthyThreshold: 5,
 *     },
 * });
 * ```
 * ### Update access log
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const attributes02 = new outscale.LoadBalancerAttributes("attributes02", {
 *     loadBalancerName: outscale_load_balancer.load_balancer01.id,
 *     accessLog: {
 *         publicationInterval: 5,
 *         isEnabled: true,
 *         osuBucketName: "terraform-access-logs",
 *         osuBucketPrefix: "access-logs-01234",
 *     },
 * });
 * ```
 * ### Update policies
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const attributes03 = new outscale.LoadBalancerAttributes("attributes03", {
 *     loadBalancerName: outscale_load_balancer.load_balancer01.id,
 *     loadBalancerPort: 80,
 *     policyNames: ["policy-name-01"],
 * });
 * ```
 * ### Update SSL certificate
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@outscale/pulumi-outscale";
 *
 * const attributes04 = new outscale.LoadBalancerAttributes("attributes04", {
 *     loadBalancerName: outscale_load_balancer.load_balancer01.id,
 *     loadBalancerPort: 8080,
 *     serverCertificateId: "arn:aws:iam::012345678910:server-certificate/MyCertificates/Certificate",
 * });
 * ```
 */
export class LoadBalancerAttributes extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerAttributes resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerAttributesState, opts?: pulumi.CustomResourceOptions): LoadBalancerAttributes {
        return new LoadBalancerAttributes(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'outscale:index/loadBalancerAttributes:LoadBalancerAttributes';

    /**
     * Returns true if the given object is an instance of LoadBalancerAttributes.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerAttributes {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerAttributes.__pulumiType;
    }

    /**
     * Information about access logs.
     */
    public readonly accessLog!: pulumi.Output<outputs.LoadBalancerAttributesAccessLog>;
    /**
     * The stickiness policies defined for the load balancer.
     */
    public /*out*/ readonly applicationStickyCookiePolicies!: pulumi.Output<outputs.LoadBalancerAttributesApplicationStickyCookiePolicy[]>;
    /**
     * One or more IDs of back-end VMs for the load balancer.
     */
    public /*out*/ readonly backendVmIds!: pulumi.Output<string[]>;
    /**
     * The DNS name of the load balancer.
     */
    public /*out*/ readonly dnsName!: pulumi.Output<string>;
    /**
     * Information about the health check configuration.
     */
    public readonly healthCheck!: pulumi.Output<outputs.LoadBalancerAttributesHealthCheck>;
    /**
     * The listeners for the load balancer.
     */
    public /*out*/ readonly listeners!: pulumi.Output<outputs.LoadBalancerAttributesListener[]>;
    /**
     * The name of the load balancer.
     */
    public readonly loadBalancerName!: pulumi.Output<string>;
    /**
     * The port on which the load balancer is listening (between `1` and `65535`, both included). This parameter is required if you want to update the server certificate.
     */
    public readonly loadBalancerPort!: pulumi.Output<number | undefined>;
    /**
     * The policies defined for the load balancer.
     */
    public /*out*/ readonly loadBalancerStickyCookiePolicies!: pulumi.Output<outputs.LoadBalancerAttributesLoadBalancerStickyCookiePolicy[]>;
    /**
     * The type of load balancer. Valid only for load balancers in a Net.<br />
     * If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
     * If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     */
    public /*out*/ readonly loadBalancerType!: pulumi.Output<string>;
    /**
     * The name of the policy you want to enable for the listener.
     */
    public readonly policyNames!: pulumi.Output<string[] | undefined>;
    public /*out*/ readonly requestId!: pulumi.Output<string>;
    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     */
    public /*out*/ readonly securityGroups!: pulumi.Output<string[]>;
    /**
     * The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers > Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns). If this parameter is specified, you must also specify the `loadBalancerPort` parameter.
     */
    public readonly serverCertificateId!: pulumi.Output<string | undefined>;
    /**
     * Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     */
    public /*out*/ readonly sourceSecurityGroups!: pulumi.Output<outputs.LoadBalancerAttributesSourceSecurityGroup[]>;
    /**
     * The ID of the Subnet in which the load balancer was created.
     */
    public /*out*/ readonly subnets!: pulumi.Output<string[]>;
    /**
     * The ID of the Subregion in which the load balancer was created.
     */
    public /*out*/ readonly subregionNames!: pulumi.Output<string[]>;
    /**
     * One or more tags associated with the load balancer.
     */
    public readonly tags!: pulumi.Output<outputs.LoadBalancerAttributesTag[]>;

    /**
     * Create a LoadBalancerAttributes resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerAttributesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerAttributesArgs | LoadBalancerAttributesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerAttributesState | undefined;
            resourceInputs["accessLog"] = state ? state.accessLog : undefined;
            resourceInputs["applicationStickyCookiePolicies"] = state ? state.applicationStickyCookiePolicies : undefined;
            resourceInputs["backendVmIds"] = state ? state.backendVmIds : undefined;
            resourceInputs["dnsName"] = state ? state.dnsName : undefined;
            resourceInputs["healthCheck"] = state ? state.healthCheck : undefined;
            resourceInputs["listeners"] = state ? state.listeners : undefined;
            resourceInputs["loadBalancerName"] = state ? state.loadBalancerName : undefined;
            resourceInputs["loadBalancerPort"] = state ? state.loadBalancerPort : undefined;
            resourceInputs["loadBalancerStickyCookiePolicies"] = state ? state.loadBalancerStickyCookiePolicies : undefined;
            resourceInputs["loadBalancerType"] = state ? state.loadBalancerType : undefined;
            resourceInputs["policyNames"] = state ? state.policyNames : undefined;
            resourceInputs["requestId"] = state ? state.requestId : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
            resourceInputs["serverCertificateId"] = state ? state.serverCertificateId : undefined;
            resourceInputs["sourceSecurityGroups"] = state ? state.sourceSecurityGroups : undefined;
            resourceInputs["subnets"] = state ? state.subnets : undefined;
            resourceInputs["subregionNames"] = state ? state.subregionNames : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as LoadBalancerAttributesArgs | undefined;
            if ((!args || args.loadBalancerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerName'");
            }
            resourceInputs["accessLog"] = args ? args.accessLog : undefined;
            resourceInputs["healthCheck"] = args ? args.healthCheck : undefined;
            resourceInputs["loadBalancerName"] = args ? args.loadBalancerName : undefined;
            resourceInputs["loadBalancerPort"] = args ? args.loadBalancerPort : undefined;
            resourceInputs["policyNames"] = args ? args.policyNames : undefined;
            resourceInputs["serverCertificateId"] = args ? args.serverCertificateId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["applicationStickyCookiePolicies"] = undefined /*out*/;
            resourceInputs["backendVmIds"] = undefined /*out*/;
            resourceInputs["dnsName"] = undefined /*out*/;
            resourceInputs["listeners"] = undefined /*out*/;
            resourceInputs["loadBalancerStickyCookiePolicies"] = undefined /*out*/;
            resourceInputs["loadBalancerType"] = undefined /*out*/;
            resourceInputs["requestId"] = undefined /*out*/;
            resourceInputs["securityGroups"] = undefined /*out*/;
            resourceInputs["sourceSecurityGroups"] = undefined /*out*/;
            resourceInputs["subnets"] = undefined /*out*/;
            resourceInputs["subregionNames"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancerAttributes.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerAttributes resources.
 */
export interface LoadBalancerAttributesState {
    /**
     * Information about access logs.
     */
    accessLog?: pulumi.Input<inputs.LoadBalancerAttributesAccessLog>;
    /**
     * The stickiness policies defined for the load balancer.
     */
    applicationStickyCookiePolicies?: pulumi.Input<pulumi.Input<inputs.LoadBalancerAttributesApplicationStickyCookiePolicy>[]>;
    /**
     * One or more IDs of back-end VMs for the load balancer.
     */
    backendVmIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS name of the load balancer.
     */
    dnsName?: pulumi.Input<string>;
    /**
     * Information about the health check configuration.
     */
    healthCheck?: pulumi.Input<inputs.LoadBalancerAttributesHealthCheck>;
    /**
     * The listeners for the load balancer.
     */
    listeners?: pulumi.Input<pulumi.Input<inputs.LoadBalancerAttributesListener>[]>;
    /**
     * The name of the load balancer.
     */
    loadBalancerName?: pulumi.Input<string>;
    /**
     * The port on which the load balancer is listening (between `1` and `65535`, both included). This parameter is required if you want to update the server certificate.
     */
    loadBalancerPort?: pulumi.Input<number>;
    /**
     * The policies defined for the load balancer.
     */
    loadBalancerStickyCookiePolicies?: pulumi.Input<pulumi.Input<inputs.LoadBalancerAttributesLoadBalancerStickyCookiePolicy>[]>;
    /**
     * The type of load balancer. Valid only for load balancers in a Net.<br />
     * If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
     * If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     */
    loadBalancerType?: pulumi.Input<string>;
    /**
     * The name of the policy you want to enable for the listener.
     */
    policyNames?: pulumi.Input<pulumi.Input<string>[]>;
    requestId?: pulumi.Input<string>;
    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers > Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns). If this parameter is specified, you must also specify the `loadBalancerPort` parameter.
     */
    serverCertificateId?: pulumi.Input<string>;
    /**
     * Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     */
    sourceSecurityGroups?: pulumi.Input<pulumi.Input<inputs.LoadBalancerAttributesSourceSecurityGroup>[]>;
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
    tags?: pulumi.Input<pulumi.Input<inputs.LoadBalancerAttributesTag>[]>;
}

/**
 * The set of arguments for constructing a LoadBalancerAttributes resource.
 */
export interface LoadBalancerAttributesArgs {
    /**
     * Information about access logs.
     */
    accessLog?: pulumi.Input<inputs.LoadBalancerAttributesAccessLog>;
    /**
     * Information about the health check configuration.
     */
    healthCheck?: pulumi.Input<inputs.LoadBalancerAttributesHealthCheck>;
    /**
     * The name of the load balancer.
     */
    loadBalancerName: pulumi.Input<string>;
    /**
     * The port on which the load balancer is listening (between `1` and `65535`, both included). This parameter is required if you want to update the server certificate.
     */
    loadBalancerPort?: pulumi.Input<number>;
    /**
     * The name of the policy you want to enable for the listener.
     */
    policyNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers > Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns). If this parameter is specified, you must also specify the `loadBalancerPort` parameter.
     */
    serverCertificateId?: pulumi.Input<string>;
    /**
     * One or more tags associated with the load balancer.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.LoadBalancerAttributesTag>[]>;
}
