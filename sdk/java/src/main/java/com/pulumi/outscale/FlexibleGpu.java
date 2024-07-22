// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.FlexibleGpuArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.FlexibleGpuState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a flexible GPU.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
 * 
 * ## Example Usage
 * ### Create a flexible GPU
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 *         var flexibleGpu01 = new FlexibleGpu(&#34;flexibleGpu01&#34;, FlexibleGpuArgs.builder()        
 *             .modelName(var_.model_name())
 *             .generation(&#34;v4&#34;)
 *             .subregionName(String.format(&#34;%sa&#34;, var_.region()))
 *             .deleteOnVmDeletion(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A flexible GPU can be imported using its ID. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/flexibleGpu:FlexibleGpu imported_fgpu fgpu-12345678
 * ```
 * 
 */
@ResourceType(type="outscale:index/flexibleGpu:FlexibleGpu")
public class FlexibleGpu extends com.pulumi.resources.CustomResource {
    /**
     * If true, the fGPU is deleted when the VM is terminated.
     * 
     */
    @Export(name="deleteOnVmDeletion", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deleteOnVmDeletion;

    /**
     * @return If true, the fGPU is deleted when the VM is terminated.
     * 
     */
    public Output<Boolean> deleteOnVmDeletion() {
        return this.deleteOnVmDeletion;
    }
    /**
     * The ID of the fGPU.
     * 
     */
    @Export(name="flexibleGpuId", refs={String.class}, tree="[0]")
    private Output<String> flexibleGpuId;

    /**
     * @return The ID of the fGPU.
     * 
     */
    public Output<String> flexibleGpuId() {
        return this.flexibleGpuId;
    }
    /**
     * The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
     * 
     */
    @Export(name="generation", refs={String.class}, tree="[0]")
    private Output<String> generation;

    /**
     * @return The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
     * 
     */
    public Output<String> generation() {
        return this.generation;
    }
    /**
     * The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     * 
     */
    @Export(name="modelName", refs={String.class}, tree="[0]")
    private Output<String> modelName;

    /**
     * @return The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     * 
     */
    public Output<String> modelName() {
        return this.modelName;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The Subregion in which you want to create the fGPU.
     * 
     */
    @Export(name="subregionName", refs={String.class}, tree="[0]")
    private Output<String> subregionName;

    /**
     * @return The Subregion in which you want to create the fGPU.
     * 
     */
    public Output<String> subregionName() {
        return this.subregionName;
    }
    /**
     * The ID of the VM the fGPU is attached to, if any.
     * 
     */
    @Export(name="vmId", refs={String.class}, tree="[0]")
    private Output<String> vmId;

    /**
     * @return The ID of the VM the fGPU is attached to, if any.
     * 
     */
    public Output<String> vmId() {
        return this.vmId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlexibleGpu(String name) {
        this(name, FlexibleGpuArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlexibleGpu(String name, FlexibleGpuArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlexibleGpu(String name, FlexibleGpuArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/flexibleGpu:FlexibleGpu", name, args == null ? FlexibleGpuArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlexibleGpu(String name, Output<String> id, @Nullable FlexibleGpuState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/flexibleGpu:FlexibleGpu", name, state, makeResourceOptions(options, id));
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
    public static FlexibleGpu get(String name, Output<String> id, @Nullable FlexibleGpuState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlexibleGpu(name, id, state, options);
    }
}
