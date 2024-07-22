// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.ImageExportTaskArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.ImageExportTaskState;
import com.pulumi.outscale.outputs.ImageExportTaskOsuExport;
import com.pulumi.outscale.outputs.ImageExportTaskTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an image export task.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).
 * 
 * ## Example Usage
 * ### Required resource
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.Image;
 * import com.pulumi.outscale.ImageArgs;
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
 *         var image01 = new Image(&#34;image01&#34;, ImageArgs.builder()        
 *             .imageName(&#34;terraform-image-to-export&#34;)
 *             .vmId(&#34;i-12345678&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create an image export task
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.ImageExportTask;
 * import com.pulumi.outscale.ImageExportTaskArgs;
 * import com.pulumi.outscale.inputs.ImageExportTaskOsuExportArgs;
 * import com.pulumi.outscale.inputs.ImageExportTaskTagArgs;
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
 *         var imageExportTask01 = new ImageExportTask(&#34;imageExportTask01&#34;, ImageExportTaskArgs.builder()        
 *             .imageId(outscale_image.image01().image_id())
 *             .osuExports(ImageExportTaskOsuExportArgs.builder()
 *                 .diskImageFormat(&#34;qcow2&#34;)
 *                 .osuBucket(&#34;terraform-bucket&#34;)
 *                 .osuPrefix(&#34;new-export&#34;)
 *                 .osuApiKeys(ImageExportTaskOsuExportOsuApiKeyArgs.builder()
 *                     .apiKeyId(var_.access_key_id())
 *                     .secretKey(var_.secret_key_id())
 *                     .build())
 *                 .build())
 *             .tags(ImageExportTaskTagArgs.builder()
 *                 .key(&#34;Name&#34;)
 *                 .value(&#34;terraform-snapshot-export-task&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="outscale:index/imageExportTask:ImageExportTask")
public class ImageExportTask extends com.pulumi.resources.CustomResource {
    /**
     * If the OMI export task fails, an error message appears.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output<String> comment;

    /**
     * @return If the OMI export task fails, an error message appears.
     * 
     */
    public Output<String> comment() {
        return this.comment;
    }
    /**
     * The ID of the OMI to export.
     * 
     */
    @Export(name="imageId", refs={String.class}, tree="[0]")
    private Output<String> imageId;

    /**
     * @return The ID of the OMI to export.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }
    /**
     * Information about the OOS export task to create.
     * 
     */
    @Export(name="osuExports", refs={List.class,ImageExportTaskOsuExport.class}, tree="[0,1]")
    private Output<List<ImageExportTaskOsuExport>> osuExports;

    /**
     * @return Information about the OOS export task to create.
     * 
     */
    public Output<List<ImageExportTaskOsuExport>> osuExports() {
        return this.osuExports;
    }
    /**
     * The progress of the OMI export task, as a percentage.
     * 
     */
    @Export(name="progress", refs={Integer.class}, tree="[0]")
    private Output<Integer> progress;

    /**
     * @return The progress of the OMI export task, as a percentage.
     * 
     */
    public Output<Integer> progress() {
        return this.progress;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Export(name="tags", refs={List.class,ImageExportTaskTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ImageExportTaskTag>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Output<Optional<List<ImageExportTaskTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the OMI export task.
     * 
     */
    @Export(name="taskId", refs={String.class}, tree="[0]")
    private Output<String> taskId;

    /**
     * @return The ID of the OMI export task.
     * 
     */
    public Output<String> taskId() {
        return this.taskId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImageExportTask(String name) {
        this(name, ImageExportTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImageExportTask(String name, ImageExportTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImageExportTask(String name, ImageExportTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/imageExportTask:ImageExportTask", name, args == null ? ImageExportTaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImageExportTask(String name, Output<String> id, @Nullable ImageExportTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/imageExportTask:ImageExportTask", name, state, makeResourceOptions(options, id));
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
    public static ImageExportTask get(String name, Output<String> id, @Nullable ImageExportTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImageExportTask(name, id, state, options);
    }
}
