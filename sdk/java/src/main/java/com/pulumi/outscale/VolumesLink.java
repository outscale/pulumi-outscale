// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.VolumesLinkArgs;
import com.pulumi.outscale.inputs.VolumesLinkState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a volume link.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Volumes.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-volume).
 * 
 * ## Example Usage
 * ### Required resources
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.Volume;
 * import com.pulumi.outscale.VolumeArgs;
 * import com.pulumi.outscale.Vm;
 * import com.pulumi.outscale.VmArgs;
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
 *         var volume01 = new Volume(&#34;volume01&#34;, VolumeArgs.builder()        
 *             .subregionName(String.format(&#34;%sa&#34;, var_.region()))
 *             .size(40)
 *             .build());
 * 
 *         var vm01 = new Vm(&#34;vm01&#34;, VmArgs.builder()        
 *             .imageId(var_.image_id())
 *             .vmType(var_.vm_type())
 *             .keypairName(var_.keypair_name())
 *             .securityGroupIds(var_.security_group_id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Link a volume to a VM
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.VolumesLink;
 * import com.pulumi.outscale.VolumesLinkArgs;
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
 *         var volumesLink01 = new VolumesLink(&#34;volumesLink01&#34;, VolumesLinkArgs.builder()        
 *             .deviceName(&#34;/dev/xvdc&#34;)
 *             .volumeId(outscale_volume.volume01().id())
 *             .vmId(outscale_vm.vm01().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A volume link can be imported using a volume ID. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/volumesLink:VolumesLink ImportedVolumeLink vol-12345678
 * ```
 * 
 */
@ResourceType(type="outscale:index/volumesLink:VolumesLink")
public class VolumesLink extends com.pulumi.resources.CustomResource {
    @Export(name="deleteOnVmTermination", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteOnVmTermination;

    public Output<Optional<Boolean>> deleteOnVmTermination() {
        return Codegen.optional(this.deleteOnVmTermination);
    }
    /**
     * The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     * 
     */
    @Export(name="deviceName", refs={String.class}, tree="[0]")
    private Output<String> deviceName;

    /**
     * @return The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }
    @Export(name="forceUnlink", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> forceUnlink;

    public Output<Boolean> forceUnlink() {
        return this.forceUnlink;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The state of the attachment of the volume (`attaching` | `detaching` | `attached` | `detached`).
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the attachment of the volume (`attaching` | `detaching` | `attached` | `detached`).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The ID of the VM you want to attach the volume to.
     * 
     */
    @Export(name="vmId", refs={String.class}, tree="[0]")
    private Output<String> vmId;

    /**
     * @return The ID of the VM you want to attach the volume to.
     * 
     */
    public Output<String> vmId() {
        return this.vmId;
    }
    /**
     * The ID of the volume you want to attach.
     * 
     */
    @Export(name="volumeId", refs={String.class}, tree="[0]")
    private Output<String> volumeId;

    /**
     * @return The ID of the volume you want to attach.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumesLink(String name) {
        this(name, VolumesLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumesLink(String name, VolumesLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumesLink(String name, VolumesLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/volumesLink:VolumesLink", name, args == null ? VolumesLinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VolumesLink(String name, Output<String> id, @Nullable VolumesLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/volumesLink:VolumesLink", name, state, makeResourceOptions(options, id));
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
    public static VolumesLink get(String name, Output<String> id, @Nullable VolumesLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumesLink(name, id, state, options);
    }
}