// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.LoadBalancerPolicyArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.LoadBalancerPolicyState;
import com.pulumi.outscale.outputs.LoadBalancerPolicyAccessLog;
import com.pulumi.outscale.outputs.LoadBalancerPolicyApplicationStickyCookiePolicy;
import com.pulumi.outscale.outputs.LoadBalancerPolicyHealthCheck;
import com.pulumi.outscale.outputs.LoadBalancerPolicyListener;
import com.pulumi.outscale.outputs.LoadBalancerPolicyLoadBalancerStickyCookiePolicy;
import com.pulumi.outscale.outputs.LoadBalancerPolicySourceSecurityGroup;
import com.pulumi.outscale.outputs.LoadBalancerPolicyTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a load balancer policy.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancerpolicy).
 * 
 * ## Example Usage
 * ### Create a load balancer policy based on browser
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.LoadBalancer;
 * import com.pulumi.outscale.LoadBalancerArgs;
 * import com.pulumi.outscale.inputs.LoadBalancerListenerArgs;
 * import com.pulumi.outscale.LoadBalancerPolicy;
 * import com.pulumi.outscale.LoadBalancerPolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var loadBalancer01 = new LoadBalancer(&#34;loadBalancer01&#34;, LoadBalancerArgs.builder()        
 *             .listeners(LoadBalancerListenerArgs.builder()
 *                 .backendPort(8080)
 *                 .backendProtocol(&#34;HTTP&#34;)
 *                 .loadBalancerPort(8080)
 *                 .loadBalancerProtocol(&#34;HTTP&#34;)
 *                 .build())
 *             .loadBalancerName(&#34;terraform-lb-for-browser-policy&#34;)
 *             .subregionNames(&#34;eu-west-2a&#34;)
 *             .build());
 * 
 *         var loadBalancerPolicy01 = new LoadBalancerPolicy(&#34;loadBalancerPolicy01&#34;, LoadBalancerPolicyArgs.builder()        
 *             .loadBalancerName(&#34;terraform-lb-for-browser-policy&#34;)
 *             .policyName(&#34;terraform-lb-browser-policy&#34;)
 *             .policyType(&#34;load_balancer&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create a load balancer policy based on application cookie
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.LoadBalancer;
 * import com.pulumi.outscale.LoadBalancerArgs;
 * import com.pulumi.outscale.inputs.LoadBalancerListenerArgs;
 * import com.pulumi.outscale.LoadBalancerPolicy;
 * import com.pulumi.outscale.LoadBalancerPolicyArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var loadBalancer02 = new LoadBalancer(&#34;loadBalancer02&#34;, LoadBalancerArgs.builder()        
 *             .loadBalancerName(&#34;terraform-lb-for-app-policy&#34;)
 *             .subregionNames(String.format(&#34;%sb&#34;, var_.region()))
 *             .listeners(LoadBalancerListenerArgs.builder()
 *                 .loadBalancerPort(80)
 *                 .loadBalancerProtocol(&#34;TCP&#34;)
 *                 .backendPort(80)
 *                 .backendProtocol(&#34;TCP&#34;)
 *                 .build())
 *             .build());
 * 
 *         var loadBalancerPolicy02 = new LoadBalancerPolicy(&#34;loadBalancerPolicy02&#34;, LoadBalancerPolicyArgs.builder()        
 *             .loadBalancerName(loadBalancer02.loadBalancerName())
 *             .policyName(&#34;terraform-lb-app-policy&#34;)
 *             .policyType(&#34;app&#34;)
 *             .cookieName(&#34;cookie01&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(loadBalancer02)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="outscale:index/loadBalancerPolicy:LoadBalancerPolicy")
public class LoadBalancerPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Information about access logs.
     * 
     */
    @Export(name="accessLogs", refs={List.class,LoadBalancerPolicyAccessLog.class}, tree="[0,1]")
    private Output<List<LoadBalancerPolicyAccessLog>> accessLogs;

    /**
     * @return Information about access logs.
     * 
     */
    public Output<List<LoadBalancerPolicyAccessLog>> accessLogs() {
        return this.accessLogs;
    }
    /**
     * The stickiness policies defined for the load balancer.
     * 
     */
    @Export(name="applicationStickyCookiePolicies", refs={List.class,LoadBalancerPolicyApplicationStickyCookiePolicy.class}, tree="[0,1]")
    private Output<List<LoadBalancerPolicyApplicationStickyCookiePolicy>> applicationStickyCookiePolicies;

    /**
     * @return The stickiness policies defined for the load balancer.
     * 
     */
    public Output<List<LoadBalancerPolicyApplicationStickyCookiePolicy>> applicationStickyCookiePolicies() {
        return this.applicationStickyCookiePolicies;
    }
    /**
     * One or more IDs of back-end VMs for the load balancer.
     * 
     */
    @Export(name="backendVmIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> backendVmIds;

    /**
     * @return One or more IDs of back-end VMs for the load balancer.
     * 
     */
    public Output<List<String>> backendVmIds() {
        return this.backendVmIds;
    }
    @Export(name="cookieExpirationPeriod", refs={Integer.class}, tree="[0]")
    private Output<Integer> cookieExpirationPeriod;

    public Output<Integer> cookieExpirationPeriod() {
        return this.cookieExpirationPeriod;
    }
    /**
     * The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
     * 
     */
    @Export(name="cookieName", refs={String.class}, tree="[0]")
    private Output<String> cookieName;

    /**
     * @return The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
     * 
     */
    public Output<String> cookieName() {
        return this.cookieName;
    }
    /**
     * The DNS name of the load balancer.
     * 
     */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return The DNS name of the load balancer.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Information about the health check configuration.
     * 
     */
    @Export(name="healthChecks", refs={List.class,LoadBalancerPolicyHealthCheck.class}, tree="[0,1]")
    private Output<List<LoadBalancerPolicyHealthCheck>> healthChecks;

    /**
     * @return Information about the health check configuration.
     * 
     */
    public Output<List<LoadBalancerPolicyHealthCheck>> healthChecks() {
        return this.healthChecks;
    }
    /**
     * The listeners for the load balancer.
     * 
     */
    @Export(name="listeners", refs={List.class,LoadBalancerPolicyListener.class}, tree="[0,1]")
    private Output<List<LoadBalancerPolicyListener>> listeners;

    /**
     * @return The listeners for the load balancer.
     * 
     */
    public Output<List<LoadBalancerPolicyListener>> listeners() {
        return this.listeners;
    }
    /**
     * The name of the load balancer for which you want to create a policy.
     * 
     */
    @Export(name="loadBalancerName", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerName;

    /**
     * @return The name of the load balancer for which you want to create a policy.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }
    /**
     * The policies defined for the load balancer.
     * 
     */
    @Export(name="loadBalancerStickyCookiePolicies", refs={List.class,LoadBalancerPolicyLoadBalancerStickyCookiePolicy.class}, tree="[0,1]")
    private Output<List<LoadBalancerPolicyLoadBalancerStickyCookiePolicy>> loadBalancerStickyCookiePolicies;

    /**
     * @return The policies defined for the load balancer.
     * 
     */
    public Output<List<LoadBalancerPolicyLoadBalancerStickyCookiePolicy>> loadBalancerStickyCookiePolicies() {
        return this.loadBalancerStickyCookiePolicies;
    }
    /**
     * The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt;
     * If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt;
     * If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     * 
     */
    @Export(name="loadBalancerType", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerType;

    /**
     * @return The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt;
     * If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt;
     * If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
     * 
     */
    public Output<String> loadBalancerType() {
        return this.loadBalancerType;
    }
    /**
     * The ID of the Net for the load balancer.
     * 
     */
    @Export(name="netId", refs={String.class}, tree="[0]")
    private Output<String> netId;

    /**
     * @return The ID of the Net for the load balancer.
     * 
     */
    public Output<String> netId() {
        return this.netId;
    }
    /**
     * The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     * 
     */
    @Export(name="policyName", refs={String.class}, tree="[0]")
    private Output<String> policyName;

    /**
     * @return The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }
    /**
     * The type of stickiness policy you want to create: `app` or `load_balancer`.
     * 
     */
    @Export(name="policyType", refs={String.class}, tree="[0]")
    private Output<String> policyType;

    /**
     * @return The type of stickiness policy you want to create: `app` or `load_balancer`.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }
    @Export(name="publicIp", refs={String.class}, tree="[0]")
    private Output<String> publicIp;

    public Output<String> publicIp() {
        return this.publicIp;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    @Export(name="securedCookies", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> securedCookies;

    public Output<Boolean> securedCookies() {
        return this.securedCookies;
    }
    /**
     * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroups;

    /**
     * @return One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }
    /**
     * Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     * 
     */
    @Export(name="sourceSecurityGroups", refs={List.class,LoadBalancerPolicySourceSecurityGroup.class}, tree="[0,1]")
    private Output<List<LoadBalancerPolicySourceSecurityGroup>> sourceSecurityGroups;

    /**
     * @return Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt;
     * To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
     * 
     */
    public Output<List<LoadBalancerPolicySourceSecurityGroup>> sourceSecurityGroups() {
        return this.sourceSecurityGroups;
    }
    /**
     * The ID of the Subnet in which the load balancer was created.
     * 
     */
    @Export(name="subnets", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnets;

    /**
     * @return The ID of the Subnet in which the load balancer was created.
     * 
     */
    public Output<List<String>> subnets() {
        return this.subnets;
    }
    /**
     * The ID of the Subregion in which the load balancer was created.
     * 
     */
    @Export(name="subregionNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subregionNames;

    /**
     * @return The ID of the Subregion in which the load balancer was created.
     * 
     */
    public Output<List<String>> subregionNames() {
        return this.subregionNames;
    }
    /**
     * One or more tags associated with the load balancer.
     * 
     */
    @Export(name="tags", refs={List.class,LoadBalancerPolicyTag.class}, tree="[0,1]")
    private Output<List<LoadBalancerPolicyTag>> tags;

    /**
     * @return One or more tags associated with the load balancer.
     * 
     */
    public Output<List<LoadBalancerPolicyTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerPolicy(String name) {
        this(name, LoadBalancerPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerPolicy(String name, LoadBalancerPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerPolicy(String name, LoadBalancerPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/loadBalancerPolicy:LoadBalancerPolicy", name, args == null ? LoadBalancerPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerPolicy(String name, Output<String> id, @Nullable LoadBalancerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/loadBalancerPolicy:LoadBalancerPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancerPolicy get(String name, Output<String> id, @Nullable LoadBalancerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerPolicy(name, id, state, options);
    }
}
