// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a load balancer.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancer).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const loadBalancer01 = outscale.getLoadBalancer({
 *     filters: [{
 *         name: "load_balancer_names",
 *         values: ["load_balancer01"],
 *     }],
 * });
 * ```
 */
export function getLoadBalancer(args?: GetLoadBalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadBalancerResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getLoadBalancer:getLoadBalancer", {
        "accessLogs": args.accessLogs,
        "backendVmIds": args.backendVmIds,
        "dnsName": args.dnsName,
        "filters": args.filters,
        "healthChecks": args.healthChecks,
        "listeners": args.listeners,
        "loadBalancerName": args.loadBalancerName,
        "loadBalancerType": args.loadBalancerType,
        "netId": args.netId,
        "securityGroups": args.securityGroups,
        "subnets": args.subnets,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerArgs {
    /**
     * Information about access logs.
     */
    accessLogs?: inputs.GetLoadBalancerAccessLog[];
    /**
     * One or more IDs of back-end VMs for the load balancer.
     */
    backendVmIds?: string[];
    /**
     * The DNS name of the load balancer.
     */
    dnsName?: string;
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: inputs.GetLoadBalancerFilter[];
    /**
     * Information about the health check configuration.
     */
    healthChecks?: inputs.GetLoadBalancerHealthCheck[];
    /**
     * The listeners for the load balancer.
     */
    listeners?: inputs.GetLoadBalancerListener[];
    /**
     * The name of the load balancer.
     */
    loadBalancerName?: string;
    /**
     * The type of load balancer. Valid only for load balancers in a Net.<br />
     * If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
     * If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     */
    loadBalancerType?: string;
    /**
     * The ID of the Net for the load balancer.
     */
    netId?: string;
    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     */
    securityGroups?: string[];
    /**
     * The ID of the Subnet in which the load balancer was created.
     */
    subnets?: string[];
    /**
     * One or more tags associated with the load balancer.
     */
    tags?: inputs.GetLoadBalancerTag[];
}

/**
 * A collection of values returned by getLoadBalancer.
 */
export interface GetLoadBalancerResult {
    /**
     * Information about access logs.
     */
    readonly accessLogs: outputs.GetLoadBalancerAccessLog[];
    /**
     * The stickiness policies defined for the load balancer.
     */
    readonly applicationStickyCookiePolicies: outputs.GetLoadBalancerApplicationStickyCookiePolicy[];
    /**
     * One or more IDs of back-end VMs for the load balancer.
     */
    readonly backendVmIds: string[];
    /**
     * The DNS name of the load balancer.
     */
    readonly dnsName: string;
    readonly filters?: outputs.GetLoadBalancerFilter[];
    /**
     * Information about the health check configuration.
     */
    readonly healthChecks: outputs.GetLoadBalancerHealthCheck[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The listeners for the load balancer.
     */
    readonly listeners: outputs.GetLoadBalancerListener[];
    /**
     * The name of the load balancer.
     */
    readonly loadBalancerName: string;
    /**
     * The policies defined for the load balancer.
     */
    readonly loadBalancerStickyCookiePolicies: outputs.GetLoadBalancerLoadBalancerStickyCookiePolicy[];
    /**
     * The type of load balancer. Valid only for load balancers in a Net.<br />
     * If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
     * If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     */
    readonly loadBalancerType: string;
    /**
     * The ID of the Net for the load balancer.
     */
    readonly netId: string;
    /**
     * (internet-facing only) The public IP associated with the load balancer.
     */
    readonly publicIp: string;
    readonly requestId: string;
    /**
     * Whether secure cookies are enabled for the load balancer.
     */
    readonly securedCookies: boolean;
    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     */
    readonly securityGroups: string[];
    /**
     * Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     */
    readonly sourceSecurityGroups: outputs.GetLoadBalancerSourceSecurityGroup[];
    /**
     * The ID of the Subnet in which the load balancer was created.
     */
    readonly subnets: string[];
    /**
     * The ID of the Subregion in which the load balancer was created.
     */
    readonly subregionNames: string[];
    /**
     * One or more tags associated with the load balancer.
     */
    readonly tags: outputs.GetLoadBalancerTag[];
}
/**
 * Provides information about a load balancer.
 *
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancer).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as outscale from "@pulumi/outscale";
 *
 * const loadBalancer01 = outscale.getLoadBalancer({
 *     filters: [{
 *         name: "load_balancer_names",
 *         values: ["load_balancer01"],
 *     }],
 * });
 * ```
 */
export function getLoadBalancerOutput(args?: GetLoadBalancerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLoadBalancerResult> {
    return pulumi.output(args).apply((a: any) => getLoadBalancer(a, opts))
}

/**
 * A collection of arguments for invoking getLoadBalancer.
 */
export interface GetLoadBalancerOutputArgs {
    /**
     * Information about access logs.
     */
    accessLogs?: pulumi.Input<pulumi.Input<inputs.GetLoadBalancerAccessLogArgs>[]>;
    /**
     * One or more IDs of back-end VMs for the load balancer.
     */
    backendVmIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS name of the load balancer.
     */
    dnsName?: pulumi.Input<string>;
    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetLoadBalancerFilterArgs>[]>;
    /**
     * Information about the health check configuration.
     */
    healthChecks?: pulumi.Input<pulumi.Input<inputs.GetLoadBalancerHealthCheckArgs>[]>;
    /**
     * The listeners for the load balancer.
     */
    listeners?: pulumi.Input<pulumi.Input<inputs.GetLoadBalancerListenerArgs>[]>;
    /**
     * The name of the load balancer.
     */
    loadBalancerName?: pulumi.Input<string>;
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
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the Subnet in which the load balancer was created.
     */
    subnets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more tags associated with the load balancer.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.GetLoadBalancerTagArgs>[]>;
}