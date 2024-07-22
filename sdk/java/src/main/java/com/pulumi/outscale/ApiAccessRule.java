// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.ApiAccessRuleArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.inputs.ApiAccessRuleState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an API access rule.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-API-Access-Rules.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-apiaccessrule).
 * 
 * ## Example Usage
 * ### Create an API access rule based on IPs
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.ApiAccessRule;
 * import com.pulumi.outscale.ApiAccessRuleArgs;
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
 *         var apiAccessRule01 = new ApiAccessRule(&#34;apiAccessRule01&#34;, ApiAccessRuleArgs.builder()        
 *             .description(&#34;Basic API Access Rule from Terraform&#34;)
 *             .ipRanges(            
 *                 &#34;192.0.2.0&#34;,
 *                 &#34;192.0.2.0/16&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create an API access rule based on IPs and Certificate Authority (CA)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.Ca;
 * import com.pulumi.outscale.CaArgs;
 * import com.pulumi.outscale.ApiAccessRule;
 * import com.pulumi.outscale.ApiAccessRuleArgs;
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
 *         var ca01 = new Ca(&#34;ca01&#34;, CaArgs.builder()        
 *             .caPem(Files.readString(Paths.get(&#34;&lt;PATH&gt;&#34;)))
 *             .description(&#34;Terraform CA&#34;)
 *             .build());
 * 
 *         var apiAccessRule02 = new ApiAccessRule(&#34;apiAccessRule02&#34;, ApiAccessRuleArgs.builder()        
 *             .ipRanges(            
 *                 &#34;192.0.2.0&#34;,
 *                 &#34;192.0.2.0/16&#34;)
 *             .caIds(ca01.caId())
 *             .description(&#34;API Access Rule with CA from Terraform&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * An API access rule can be imported using its ID. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/apiAccessRule:ApiAccessRule ImportedAPIAccessRule &#34;aar-12345678&#34;
 * ```
 * 
 */
@ResourceType(type="outscale:index/apiAccessRule:ApiAccessRule")
public class ApiAccessRule extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the API access rule.
     * 
     */
    @Export(name="apiAccessRuleId", refs={String.class}, tree="[0]")
    private Output<String> apiAccessRuleId;

    /**
     * @return The ID of the API access rule.
     * 
     */
    public Output<String> apiAccessRuleId() {
        return this.apiAccessRuleId;
    }
    /**
     * One or more IDs of Client Certificate Authorities (CAs).
     * 
     */
    @Export(name="caIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> caIds;

    /**
     * @return One or more IDs of Client Certificate Authorities (CAs).
     * 
     */
    public Output<Optional<List<String>>> caIds() {
        return Codegen.optional(this.caIds);
    }
    /**
     * One or more Client Certificate Common Names (CNs). If this parameter is specified, you must also specify the `ca_ids` parameter.
     * 
     */
    @Export(name="cns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> cns;

    /**
     * @return One or more Client Certificate Common Names (CNs). If this parameter is specified, you must also specify the `ca_ids` parameter.
     * 
     */
    public Output<Optional<List<String>>> cns() {
        return Codegen.optional(this.cns);
    }
    /**
     * A description for the API access rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the API access rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * One or more IP addresses or CIDR blocks (for example, `192.0.2.0/16`).
     * 
     */
    @Export(name="ipRanges", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ipRanges;

    /**
     * @return One or more IP addresses or CIDR blocks (for example, `192.0.2.0/16`).
     * 
     */
    public Output<Optional<List<String>>> ipRanges() {
        return Codegen.optional(this.ipRanges);
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
    public ApiAccessRule(String name) {
        this(name, ApiAccessRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiAccessRule(String name, @Nullable ApiAccessRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiAccessRule(String name, @Nullable ApiAccessRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/apiAccessRule:ApiAccessRule", name, args == null ? ApiAccessRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiAccessRule(String name, Output<String> id, @Nullable ApiAccessRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/apiAccessRule:ApiAccessRule", name, state, makeResourceOptions(options, id));
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
    public static ApiAccessRule get(String name, Output<String> id, @Nullable ApiAccessRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiAccessRule(name, id, state, options);
    }
}
