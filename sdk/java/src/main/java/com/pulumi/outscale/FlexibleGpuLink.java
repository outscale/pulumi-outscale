// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.FlexibleGpuLinkArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.FlexibleGpuLinkState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a flexible GPU link.
 * 
 * When linking a flexible GPU to a VM, the VM will automatically be stopped and started again.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
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
 * import com.pulumi.outscale.FlexibleGpu;
 * import com.pulumi.outscale.FlexibleGpuArgs;
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
 *         var vm01 = new Vm(&#34;vm01&#34;, VmArgs.builder()        
 *             .imageId(ami_12345678)
 *             .vmType(t2.small())
 *             .keypairName(var_.keypair_name())
 *             .placementSubregionName(&#34;eu-west-2a&#34;)
 *             .build());
 * 
 *         var flexibleGpu01 = new FlexibleGpu(&#34;flexibleGpu01&#34;, FlexibleGpuArgs.builder()        
 *             .modelName(var_.model_name())
 *             .generation(&#34;v4&#34;)
 *             .subregionName(&#34;eu-west-2a&#34;)
 *             .deleteOnVmDeletion(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create a flexible GPU link
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.FlexibleGpuLink;
 * import com.pulumi.outscale.FlexibleGpuLinkArgs;
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
 *         var linkFgpu01 = new FlexibleGpuLink(&#34;linkFgpu01&#34;, FlexibleGpuLinkArgs.builder()        
 *             .flexibleGpuId(outscale_flexible_gpu.flexible_gpu01().flexible_gpu_id())
 *             .vmId(outscale_vm.vm01().vm_id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A flexible GPU link can be imported using the flexible GPU ID. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/flexibleGpuLink:FlexibleGpuLink imported_link_fgpu fgpu-12345678
 * ```
 * 
 */
@ResourceType(type="outscale:index/flexibleGpuLink:FlexibleGpuLink")
public class FlexibleGpuLink extends com.pulumi.resources.CustomResource {
    @Export(name="flexibleGpuIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> flexibleGpuIds;

    public Output<List<String>> flexibleGpuIds() {
        return this.flexibleGpuIds;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The ID of the VM you want to attach the fGPU to.
     * 
     */
    @Export(name="vmId", refs={String.class}, tree="[0]")
    private Output<String> vmId;

    /**
     * @return The ID of the VM you want to attach the fGPU to.
     * 
     */
    public Output<String> vmId() {
        return this.vmId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlexibleGpuLink(String name) {
        this(name, FlexibleGpuLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlexibleGpuLink(String name, FlexibleGpuLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlexibleGpuLink(String name, FlexibleGpuLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/flexibleGpuLink:FlexibleGpuLink", name, args == null ? FlexibleGpuLinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlexibleGpuLink(String name, Output<String> id, @Nullable FlexibleGpuLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/flexibleGpuLink:FlexibleGpuLink", name, state, makeResourceOptions(options, id));
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
    public static FlexibleGpuLink get(String name, Output<String> id, @Nullable FlexibleGpuLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlexibleGpuLink(name, id, state, options);
    }
}
