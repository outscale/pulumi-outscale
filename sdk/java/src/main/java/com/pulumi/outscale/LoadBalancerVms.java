// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.LoadBalancerVmsArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.LoadBalancerVmsState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages load balancer VMs.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancer).
 * 
 * ## Example Usage
 * ### Required resources
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.Vm;
 * import com.pulumi.outscale.VmArgs;
 * import com.pulumi.outscale.LoadBalancer;
 * import com.pulumi.outscale.LoadBalancerArgs;
 * import com.pulumi.outscale.inputs.LoadBalancerListenerArgs;
 * import com.pulumi.outscale.inputs.LoadBalancerTagArgs;
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
 *         var outscaleVm01 = new Vm(&#34;outscaleVm01&#34;, VmArgs.builder()        
 *             .imageId(&#34;ami-12345678&#34;)
 *             .vmType(&#34;t2.small&#34;)
 *             .keypairName(var_.keypair_name())
 *             .build());
 * 
 *         var outscaleVm02 = new Vm(&#34;outscaleVm02&#34;, VmArgs.builder()        
 *             .imageId(var_.image_id())
 *             .vmType(var_.vm_type())
 *             .keypairName(var_.keypair_name())
 *             .build());
 * 
 *         var loadBalancer01 = new LoadBalancer(&#34;loadBalancer01&#34;, LoadBalancerArgs.builder()        
 *             .loadBalancerName(&#34;load-balancer-for-backend-vms&#34;)
 *             .subregionNames(String.format(&#34;%sa&#34;, var_.region()))
 *             .listeners(LoadBalancerListenerArgs.builder()
 *                 .backendPort(80)
 *                 .backendProtocol(&#34;TCP&#34;)
 *                 .loadBalancerProtocol(&#34;TCP&#34;)
 *                 .loadBalancerPort(80)
 *                 .build())
 *             .tags(LoadBalancerTagArgs.builder()
 *                 .key(&#34;name&#34;)
 *                 .value(&#34;outscale_load_balancer01&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Register VMs with a load balancer
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.LoadBalancerVms;
 * import com.pulumi.outscale.LoadBalancerVmsArgs;
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
 *         var outscaleLoadBalancerVms01 = new LoadBalancerVms(&#34;outscaleLoadBalancerVms01&#34;, LoadBalancerVmsArgs.builder()        
 *             .loadBalancerName(&#34;load-balancer-for-backend-vms&#34;)
 *             .backendVmIds(            
 *                 outscale_vm.outscale_vm01().vm_id(),
 *                 outscale_vm.outscale_vm_02().vm_id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="outscale:index/loadBalancerVms:LoadBalancerVms")
public class LoadBalancerVms extends com.pulumi.resources.CustomResource {
    /**
     * One or more IDs of back-end VMs.&lt;br /&gt;
     * Specifying the same ID several times has no effect as each back-end VM has equal weight.
     * 
     */
    @Export(name="backendVmIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> backendVmIds;

    /**
     * @return One or more IDs of back-end VMs.&lt;br /&gt;
     * Specifying the same ID several times has no effect as each back-end VM has equal weight.
     * 
     */
    public Output<List<String>> backendVmIds() {
        return this.backendVmIds;
    }
    /**
     * The name of the load balancer.
     * 
     */
    @Export(name="loadBalancerName", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerName;

    /**
     * @return The name of the load balancer.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerVms(String name) {
        this(name, LoadBalancerVmsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerVms(String name, LoadBalancerVmsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerVms(String name, LoadBalancerVmsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/loadBalancerVms:LoadBalancerVms", name, args == null ? LoadBalancerVmsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerVms(String name, Output<String> id, @Nullable LoadBalancerVmsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/loadBalancerVms:LoadBalancerVms", name, state, makeResourceOptions(options, id));
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
    public static LoadBalancerVms get(String name, Output<String> id, @Nullable LoadBalancerVmsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerVms(name, id, state, options);
    }
}