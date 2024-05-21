// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.VirtualGatewayRoutePropagationArgs;
import com.pulumi.outscale.inputs.VirtualGatewayRoutePropagationState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a virtual gateway route propagation.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Routing-Configuration-for-VPN-Connections.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updateroutepropagation).
 * 
 * ## Example Usage
 * ### Required resources
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.VirtualGateway;
 * import com.pulumi.outscale.VirtualGatewayArgs;
 * import com.pulumi.outscale.Net;
 * import com.pulumi.outscale.NetArgs;
 * import com.pulumi.outscale.RouteTable;
 * import com.pulumi.outscale.RouteTableArgs;
 * import com.pulumi.outscale.VirtualGatewayLink;
 * import com.pulumi.outscale.VirtualGatewayLinkArgs;
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
 *         var virtualGateway01 = new VirtualGateway(&#34;virtualGateway01&#34;, VirtualGatewayArgs.builder()        
 *             .connectionType(&#34;ipsec.1&#34;)
 *             .build());
 * 
 *         var net01 = new Net(&#34;net01&#34;, NetArgs.builder()        
 *             .ipRange(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var routeTable01 = new RouteTable(&#34;routeTable01&#34;, RouteTableArgs.builder()        
 *             .netId(net01.netId())
 *             .build());
 * 
 *         var virtualGatewayLink01 = new VirtualGatewayLink(&#34;virtualGatewayLink01&#34;, VirtualGatewayLinkArgs.builder()        
 *             .virtualGatewayId(virtualGateway01.virtualGatewayId())
 *             .netId(net01.netId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Activate the propagation of routes to a route table of a Net by a virtual gateway
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.VirtualGatewayRoutePropagation;
 * import com.pulumi.outscale.VirtualGatewayRoutePropagationArgs;
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
 *         var virtualGatewayRoutePropagation01 = new VirtualGatewayRoutePropagation(&#34;virtualGatewayRoutePropagation01&#34;, VirtualGatewayRoutePropagationArgs.builder()        
 *             .enable(true)
 *             .virtualGatewayId(outscale_virtual_gateway.virtual_gateway01().virtual_gateway_id())
 *             .routeTableId(outscale_route_table.route_table01().route_table_id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(outscale_virtual_gateway_link.virtual_gateway_link01())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation")
public class VirtualGatewayRoutePropagation extends com.pulumi.resources.CustomResource {
    /**
     * If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
     * 
     */
    @Export(name="enable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enable;

    /**
     * @return If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
     * 
     */
    public Output<Boolean> enable() {
        return this.enable;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The ID of the route table.
     * 
     */
    @Export(name="routeTableId", refs={String.class}, tree="[0]")
    private Output<String> routeTableId;

    /**
     * @return The ID of the route table.
     * 
     */
    public Output<String> routeTableId() {
        return this.routeTableId;
    }
    /**
     * The ID of the virtual gateway.
     * 
     */
    @Export(name="virtualGatewayId", refs={String.class}, tree="[0]")
    private Output<String> virtualGatewayId;

    /**
     * @return The ID of the virtual gateway.
     * 
     */
    public Output<String> virtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualGatewayRoutePropagation(String name) {
        this(name, VirtualGatewayRoutePropagationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualGatewayRoutePropagation(String name, VirtualGatewayRoutePropagationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualGatewayRoutePropagation(String name, VirtualGatewayRoutePropagationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation", name, args == null ? VirtualGatewayRoutePropagationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualGatewayRoutePropagation(String name, Output<String> id, @Nullable VirtualGatewayRoutePropagationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation", name, state, makeResourceOptions(options, id));
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
    public static VirtualGatewayRoutePropagation get(String name, Output<String> id, @Nullable VirtualGatewayRoutePropagationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualGatewayRoutePropagation(name, id, state, options);
    }
}