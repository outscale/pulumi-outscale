// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.InternetServiceLinkArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.InternetServiceLinkState;
import com.pulumi.outscale.outputs.InternetServiceLinkTag;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages an Internet service link.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Internet-Gateways.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-internetservice).
 * 
 * ## Example Usage
 * ### Required resources
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.Net;
 * import com.pulumi.outscale.NetArgs;
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
 *         var net01 = new Net(&#34;net01&#34;, NetArgs.builder()        
 *             .ipRange(&#34;10.0.0.0/18&#34;)
 *             .build());
 * 
 *         var internetService01 = new InternetService(&#34;internetService01&#34;);
 * 
 *     }
 * }
 * ```
 * ### Link an Internet service to a Net
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.InternetServiceLink;
 * import com.pulumi.outscale.InternetServiceLinkArgs;
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
 *         var internetServiceLink01 = new InternetServiceLink(&#34;internetServiceLink01&#34;, InternetServiceLinkArgs.builder()        
 *             .internetServiceId(outscale_internet_service.internet_service01().internet_service_id())
 *             .netId(outscale_net.net01().net_id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * An internet service link can be imported using the internet service ID. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/internetServiceLink:InternetServiceLink ImportedInternetServiceLink igw-87654321
 * ```
 * 
 */
@ResourceType(type="outscale:index/internetServiceLink:InternetServiceLink")
public class InternetServiceLink extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Internet service you want to attach.
     * 
     */
    @Export(name="internetServiceId", refs={String.class}, tree="[0]")
    private Output<String> internetServiceId;

    /**
     * @return The ID of the Internet service you want to attach.
     * 
     */
    public Output<String> internetServiceId() {
        return this.internetServiceId;
    }
    /**
     * The ID of the Net to which you want to attach the Internet service.
     * 
     */
    @Export(name="netId", refs={String.class}, tree="[0]")
    private Output<String> netId;

    /**
     * @return The ID of the Net to which you want to attach the Internet service.
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
     * One or more tags associated with the Internet service.
     * 
     */
    @Export(name="tags", refs={List.class,InternetServiceLinkTag.class}, tree="[0,1]")
    private Output<List<InternetServiceLinkTag>> tags;

    /**
     * @return One or more tags associated with the Internet service.
     * 
     */
    public Output<List<InternetServiceLinkTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InternetServiceLink(String name) {
        this(name, InternetServiceLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InternetServiceLink(String name, InternetServiceLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InternetServiceLink(String name, InternetServiceLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/internetServiceLink:InternetServiceLink", name, args == null ? InternetServiceLinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InternetServiceLink(String name, Output<String> id, @Nullable InternetServiceLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/internetServiceLink:InternetServiceLink", name, state, makeResourceOptions(options, id));
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
    public static InternetServiceLink get(String name, Output<String> id, @Nullable InternetServiceLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InternetServiceLink(name, id, state, options);
    }
}
