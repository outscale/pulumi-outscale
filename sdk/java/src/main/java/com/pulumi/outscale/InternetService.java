// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.InternetServiceArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.InternetServiceState;
import com.pulumi.outscale.outputs.InternetServiceTag;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Internet service.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Internet-Gateways.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-internetservice).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.InternetService;
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
 *         var internetService01 = new InternetService(&#34;internetService01&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * An internet service can be imported using its ID. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/internetService:InternetService ImportedInternetService igw-12345678
 * ```
 * 
 */
@ResourceType(type="outscale:index/internetService:InternetService")
public class InternetService extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Internet service.
     * 
     */
    @Export(name="internetServiceId", refs={String.class}, tree="[0]")
    private Output<String> internetServiceId;

    /**
     * @return The ID of the Internet service.
     * 
     */
    public Output<String> internetServiceId() {
        return this.internetServiceId;
    }
    /**
     * The ID of the Net attached to the Internet service.
     * 
     */
    @Export(name="netId", refs={String.class}, tree="[0]")
    private Output<String> netId;

    /**
     * @return The ID of the Net attached to the Internet service.
     * 
     */
    public Output<String> netId() {
        return this.netId;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The state of the attachment of the Internet service to the Net (always `available`).
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the attachment of the Internet service to the Net (always `available`).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Export(name="tags", refs={List.class,InternetServiceTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InternetServiceTag>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Output<Optional<List<InternetServiceTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InternetService(String name) {
        this(name, InternetServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InternetService(String name, @Nullable InternetServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InternetService(String name, @Nullable InternetServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/internetService:InternetService", name, args == null ? InternetServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InternetService(String name, Output<String> id, @Nullable InternetServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/internetService:InternetService", name, state, makeResourceOptions(options, id));
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
    public static InternetService get(String name, Output<String> id, @Nullable InternetServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InternetService(name, id, state, options);
    }
}
