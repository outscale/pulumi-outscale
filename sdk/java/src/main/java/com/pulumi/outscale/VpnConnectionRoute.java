// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.VpnConnectionRouteArgs;
import com.pulumi.outscale.inputs.VpnConnectionRouteState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a VPN connection route.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Routing-Configuration-for-VPN-Connections.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vpnconnection).
 * 
 * ## Example Usage
 * ### Required resources
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.ClientGateway;
 * import com.pulumi.outscale.ClientGatewayArgs;
 * import com.pulumi.outscale.VirtualGateway;
 * import com.pulumi.outscale.VirtualGatewayArgs;
 * import com.pulumi.outscale.VpnConnection;
 * import com.pulumi.outscale.VpnConnectionArgs;
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
 *         var clientGateway01 = new ClientGateway(&#34;clientGateway01&#34;, ClientGatewayArgs.builder()        
 *             .bgpAsn(65000)
 *             .publicIp(&#34;111.11.11.111&#34;)
 *             .connectionType(&#34;ipsec.1&#34;)
 *             .build());
 * 
 *         var virtualGateway01 = new VirtualGateway(&#34;virtualGateway01&#34;, VirtualGatewayArgs.builder()        
 *             .connectionType(&#34;ipsec.1&#34;)
 *             .build());
 * 
 *         var vpnConnection01 = new VpnConnection(&#34;vpnConnection01&#34;, VpnConnectionArgs.builder()        
 *             .clientGatewayId(clientGateway01.clientGatewayId())
 *             .virtualGatewayId(virtualGateway01.virtualGatewayId())
 *             .connectionType(&#34;ipsec.1&#34;)
 *             .staticRoutesOnly(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create a static route to a VPN connection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.VpnConnectionRoute;
 * import com.pulumi.outscale.VpnConnectionRouteArgs;
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
 *         var vpnConnectionRoute01 = new VpnConnectionRoute(&#34;vpnConnectionRoute01&#34;, VpnConnectionRouteArgs.builder()        
 *             .vpnConnectionId(outscale_vpn_connection.vpn_connection01().vpn_connection_id())
 *             .destinationIpRange(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A VPN connection route can be imported using the VPN connection ID and the route destination IP range. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/vpnConnectionRoute:VpnConnectionRoute ImportedRoute vpn-12345678_10.0.0.0/0
 * ```
 * 
 */
@ResourceType(type="outscale:index/vpnConnectionRoute:VpnConnectionRoute")
public class VpnConnectionRoute extends com.pulumi.resources.CustomResource {
    /**
     * The network prefix of the route, in CIDR notation (for example, `10.12.0.0/16`).
     * 
     */
    @Export(name="destinationIpRange", refs={String.class}, tree="[0]")
    private Output<String> destinationIpRange;

    /**
     * @return The network prefix of the route, in CIDR notation (for example, `10.12.0.0/16`).
     * 
     */
    public Output<String> destinationIpRange() {
        return this.destinationIpRange;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    /**
     * The ID of the target VPN connection of the static route.
     * 
     */
    @Export(name="vpnConnectionId", refs={String.class}, tree="[0]")
    private Output<String> vpnConnectionId;

    /**
     * @return The ID of the target VPN connection of the static route.
     * 
     */
    public Output<String> vpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnConnectionRoute(String name) {
        this(name, VpnConnectionRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnConnectionRoute(String name, VpnConnectionRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnConnectionRoute(String name, VpnConnectionRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/vpnConnectionRoute:VpnConnectionRoute", name, args == null ? VpnConnectionRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpnConnectionRoute(String name, Output<String> id, @Nullable VpnConnectionRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/vpnConnectionRoute:VpnConnectionRoute", name, state, makeResourceOptions(options, id));
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
    public static VpnConnectionRoute get(String name, Output<String> id, @Nullable VpnConnectionRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpnConnectionRoute(name, id, state, options);
    }
}