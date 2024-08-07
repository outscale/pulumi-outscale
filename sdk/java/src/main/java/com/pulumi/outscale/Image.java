// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.ImageArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.ImageState;
import com.pulumi.outscale.outputs.ImageBlockDeviceMapping;
import com.pulumi.outscale.outputs.ImagePermissionsToLaunch;
import com.pulumi.outscale.outputs.ImageStateComment;
import com.pulumi.outscale.outputs.ImageTag;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an image.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).
 * 
 * ## Example Usage
 * ### Create an image
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
 *             .imageName(&#34;terraform-omi-create&#34;)
 *             .vmId(var_.vm_id())
 *             .noReboot(&#34;true&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Import an image
 * &gt; **Important** Make sure the manifest file is still valid.
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
 *         var image02 = new Image(&#34;image02&#34;, ImageArgs.builder()        
 *             .description(&#34;Terraform register OMI&#34;)
 *             .fileLocation(&#34;&lt;URL&gt;&#34;)
 *             .imageName(&#34;terraform-omi-register&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Copy an image
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
 *         var image03 = new Image(&#34;image03&#34;, ImageArgs.builder()        
 *             .description(&#34;Terraform copy OMI&#34;)
 *             .imageName(&#34;terraform-omi-copy&#34;)
 *             .sourceImageId(&#34;ami-12345678&#34;)
 *             .sourceRegionName(&#34;eu-west-2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create an image with a Block Storage Unit (BSU) volume
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.Image;
 * import com.pulumi.outscale.ImageArgs;
 * import com.pulumi.outscale.inputs.ImageBlockDeviceMappingArgs;
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
 *         var image04 = new Image(&#34;image04&#34;, ImageArgs.builder()        
 *             .blockDeviceMappings(ImageBlockDeviceMappingArgs.builder()
 *                 .bsus(ImageBlockDeviceMappingBsusArgs.builder()
 *                     .deleteOnVmDeletion(&#34;true&#34;)
 *                     .iops(150)
 *                     .snapshotId(&#34;snap-12345678&#34;)
 *                     .volumeSize(&#34;120&#34;)
 *                     .volumeType(&#34;io1&#34;)
 *                     .build())
 *                 .deviceName(&#34;/dev/sda1&#34;)
 *                 .build())
 *             .description(&#34;Terraform OMI with BSU&#34;)
 *             .imageName(&#34;terraform-omi-bsu&#34;)
 *             .rootDeviceName(&#34;/dev/sda1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * An image can be imported using its ID. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/image:Image ImportedImage ami-12345678
 * ```
 * 
 */
@ResourceType(type="outscale:index/image:Image")
public class Image extends com.pulumi.resources.CustomResource {
    /**
     * The account alias of the owner of the OMI.
     * 
     */
    @Export(name="accountAlias", refs={String.class}, tree="[0]")
    private Output<String> accountAlias;

    /**
     * @return The account alias of the owner of the OMI.
     * 
     */
    public Output<String> accountAlias() {
        return this.accountAlias;
    }
    /**
     * The account ID of the owner of the OMI.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account ID of the owner of the OMI.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The architecture of the OMI (by default, `i386` if you specified the `file_location` or `root_device_name` parameter).
     * 
     */
    @Export(name="architecture", refs={String.class}, tree="[0]")
    private Output<String> architecture;

    /**
     * @return The architecture of the OMI (by default, `i386` if you specified the `file_location` or `root_device_name` parameter).
     * 
     */
    public Output<String> architecture() {
        return this.architecture;
    }
    /**
     * One or more block device mappings.
     * 
     */
    @Export(name="blockDeviceMappings", refs={List.class,ImageBlockDeviceMapping.class}, tree="[0,1]")
    private Output<List<ImageBlockDeviceMapping>> blockDeviceMappings;

    /**
     * @return One or more block device mappings.
     * 
     */
    public Output<List<ImageBlockDeviceMapping>> blockDeviceMappings() {
        return this.blockDeviceMappings;
    }
    /**
     * The date and time of creation of the OMI, in ISO 8601 date-time format.
     * 
     */
    @Export(name="creationDate", refs={String.class}, tree="[0]")
    private Output<String> creationDate;

    /**
     * @return The date and time of creation of the OMI, in ISO 8601 date-time format.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * A description for the new OMI.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description for the new OMI.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The pre-signed URL of the OMI manifest file, or the full path to the OMI stored in a bucket. If you specify this parameter, a copy of the OMI is created in your account. You must specify only one of the following parameters: `file_location`, `root_device_name`, `source_image_id` or `vm_id`.
     * 
     */
    @Export(name="fileLocation", refs={String.class}, tree="[0]")
    private Output<String> fileLocation;

    /**
     * @return The pre-signed URL of the OMI manifest file, or the full path to the OMI stored in a bucket. If you specify this parameter, a copy of the OMI is created in your account. You must specify only one of the following parameters: `file_location`, `root_device_name`, `source_image_id` or `vm_id`.
     * 
     */
    public Output<String> fileLocation() {
        return this.fileLocation;
    }
    /**
     * The ID of the OMI.
     * 
     */
    @Export(name="imageId", refs={String.class}, tree="[0]")
    private Output<String> imageId;

    /**
     * @return The ID of the OMI.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }
    /**
     * A unique name for the new OMI.&lt;br /&gt;
     * Constraints: 3-128 alphanumeric characters, underscores (_), spaces ( ), parentheses (()), slashes (/), periods (.), or dashes (-).
     * 
     */
    @Export(name="imageName", refs={String.class}, tree="[0]")
    private Output<String> imageName;

    /**
     * @return A unique name for the new OMI.&lt;br /&gt;
     * Constraints: 3-128 alphanumeric characters, underscores (_), spaces ( ), parentheses (()), slashes (/), periods (.), or dashes (-).
     * 
     */
    public Output<String> imageName() {
        return this.imageName;
    }
    /**
     * The type of the OMI.
     * 
     */
    @Export(name="imageType", refs={String.class}, tree="[0]")
    private Output<String> imageType;

    /**
     * @return The type of the OMI.
     * 
     */
    public Output<String> imageType() {
        return this.imageType;
    }
    @Export(name="isPublic", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isPublic;

    public Output<Boolean> isPublic() {
        return this.isPublic;
    }
    /**
     * If false, the VM shuts down before creating the OMI and then reboots. If true, the VM does not.
     * 
     */
    @Export(name="noReboot", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> noReboot;

    /**
     * @return If false, the VM shuts down before creating the OMI and then reboots. If true, the VM does not.
     * 
     */
    public Output<Boolean> noReboot() {
        return this.noReboot;
    }
    /**
     * Permissions for the resource.
     * 
     */
    @Export(name="permissionsToLaunches", refs={List.class,ImagePermissionsToLaunch.class}, tree="[0,1]")
    private Output<List<ImagePermissionsToLaunch>> permissionsToLaunches;

    /**
     * @return Permissions for the resource.
     * 
     */
    public Output<List<ImagePermissionsToLaunch>> permissionsToLaunches() {
        return this.permissionsToLaunches;
    }
    /**
     * The product codes associated with the OMI.
     * 
     */
    @Export(name="productCodes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> productCodes;

    /**
     * @return The product codes associated with the OMI.
     * 
     */
    public Output<List<String>> productCodes() {
        return this.productCodes;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The name of the root device. You must specify only one of the following parameters: `file_location`, `root_device_name`, `source_image_id` or `vm_id`.
     * 
     */
    @Export(name="rootDeviceName", refs={String.class}, tree="[0]")
    private Output<String> rootDeviceName;

    /**
     * @return The name of the root device. You must specify only one of the following parameters: `file_location`, `root_device_name`, `source_image_id` or `vm_id`.
     * 
     */
    public Output<String> rootDeviceName() {
        return this.rootDeviceName;
    }
    /**
     * The type of root device used by the OMI (always `bsu`).
     * 
     */
    @Export(name="rootDeviceType", refs={String.class}, tree="[0]")
    private Output<String> rootDeviceType;

    /**
     * @return The type of root device used by the OMI (always `bsu`).
     * 
     */
    public Output<String> rootDeviceType() {
        return this.rootDeviceType;
    }
    /**
     * The ID of the OMI you want to copy. You must specify only one of the following parameters: `file_location`, `root_device_name`, `source_image_id` or `vm_id`.
     * 
     */
    @Export(name="sourceImageId", refs={String.class}, tree="[0]")
    private Output<String> sourceImageId;

    /**
     * @return The ID of the OMI you want to copy. You must specify only one of the following parameters: `file_location`, `root_device_name`, `source_image_id` or `vm_id`.
     * 
     */
    public Output<String> sourceImageId() {
        return this.sourceImageId;
    }
    /**
     * The name of the source Region, which must be the same as the Region of your account.
     * 
     */
    @Export(name="sourceRegionName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceRegionName;

    /**
     * @return The name of the source Region, which must be the same as the Region of your account.
     * 
     */
    public Output<Optional<String>> sourceRegionName() {
        return Codegen.optional(this.sourceRegionName);
    }
    /**
     * The state of the OMI (`pending` \| `available` \| `failed`).
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the OMI (`pending` \| `available` \| `failed`).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Information about the change of state.
     * 
     */
    @Export(name="stateComments", refs={List.class,ImageStateComment.class}, tree="[0,1]")
    private Output<List<ImageStateComment>> stateComments;

    /**
     * @return Information about the change of state.
     * 
     */
    public Output<List<ImageStateComment>> stateComments() {
        return this.stateComments;
    }
    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Export(name="tags", refs={List.class,ImageTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ImageTag>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Output<Optional<List<ImageTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VM from which you want to create the OMI. You must specify only one of the following parameters: `file_location`, `root_device_name`, `source_image_id` or `vm_id`.
     * 
     */
    @Export(name="vmId", refs={String.class}, tree="[0]")
    private Output<String> vmId;

    /**
     * @return The ID of the VM from which you want to create the OMI. You must specify only one of the following parameters: `file_location`, `root_device_name`, `source_image_id` or `vm_id`.
     * 
     */
    public Output<String> vmId() {
        return this.vmId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, @Nullable ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, @Nullable ImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/image:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/image:Image", name, state, makeResourceOptions(options, id));
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
    public static Image get(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}
