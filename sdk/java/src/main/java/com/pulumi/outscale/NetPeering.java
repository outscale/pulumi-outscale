// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.outscale.NetPeeringArgs;
import com.pulumi.outscale.Utilities;
import com.pulumi.outscale.outputs.NetPeeringAccepterNet;
import com.pulumi.outscale.outputs.NetPeeringSourceNet;
import com.pulumi.outscale.outputs.NetPeeringState;
import com.pulumi.outscale.outputs.NetPeeringTag;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Net peering.
 * 
 * For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Peering-Connections.html).\
 * For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netpeering).
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
 *             .ipRange(&#34;10.10.0.0/24&#34;)
 *             .build());
 * 
 *         var net02 = new Net(&#34;net02&#34;, NetArgs.builder()        
 *             .ipRange(&#34;10.31.0.0/16&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Peer Nets
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.outscale.NetPeering;
 * import com.pulumi.outscale.NetPeeringArgs;
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
 *         var netPeering01 = new NetPeering(&#34;netPeering01&#34;, NetPeeringArgs.builder()        
 *             .accepterNetId(outscale_net.net01().net_id())
 *             .sourceNetId(outscale_net.net02().net_id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A Net peering can be imported using its ID. For exampleconsole
 * 
 * ```sh
 *  $ pulumi import outscale:index/netPeering:NetPeering ImportedNetPeering pcx-12345678
 * ```
 * 
 */
@ResourceType(type="outscale:index/netPeering:NetPeering")
public class NetPeering extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Net you want to connect with.
     * 
     */
    @Export(name="accepterNetId", refs={String.class}, tree="[0]")
    private Output<String> accepterNetId;

    /**
     * @return The ID of the Net you want to connect with.
     * 
     */
    public Output<String> accepterNetId() {
        return this.accepterNetId;
    }
    /**
     * Information about the accepter Net.
     * 
     */
    @Export(name="accepterNets", refs={List.class,NetPeeringAccepterNet.class}, tree="[0,1]")
    private Output<List<NetPeeringAccepterNet>> accepterNets;

    /**
     * @return Information about the accepter Net.
     * 
     */
    public Output<List<NetPeeringAccepterNet>> accepterNets() {
        return this.accepterNets;
    }
    /**
     * The ID of the Net peering.
     * 
     */
    @Export(name="netPeeringId", refs={String.class}, tree="[0]")
    private Output<String> netPeeringId;

    /**
     * @return The ID of the Net peering.
     * 
     */
    public Output<String> netPeeringId() {
        return this.netPeeringId;
    }
    @Export(name="requestId", refs={String.class}, tree="[0]")
    private Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId;
    }
    @Export(name="sourceNetAccountId", refs={String.class}, tree="[0]")
    private Output<String> sourceNetAccountId;

    public Output<String> sourceNetAccountId() {
        return this.sourceNetAccountId;
    }
    /**
     * The ID of the Net you send the peering request from.
     * 
     */
    @Export(name="sourceNetId", refs={String.class}, tree="[0]")
    private Output<String> sourceNetId;

    /**
     * @return The ID of the Net you send the peering request from.
     * 
     */
    public Output<String> sourceNetId() {
        return this.sourceNetId;
    }
    /**
     * Information about the source Net.
     * 
     */
    @Export(name="sourceNets", refs={List.class,NetPeeringSourceNet.class}, tree="[0,1]")
    private Output<List<NetPeeringSourceNet>> sourceNets;

    /**
     * @return Information about the source Net.
     * 
     */
    public Output<List<NetPeeringSourceNet>> sourceNets() {
        return this.sourceNets;
    }
    /**
     * Information about the state of the Net peering.
     * 
     */
    @Export(name="states", refs={List.class,NetPeeringState.class}, tree="[0,1]")
    private Output<List<NetPeeringState>> states;

    /**
     * @return Information about the state of the Net peering.
     * 
     */
    public Output<List<NetPeeringState>> states() {
        return this.states;
    }
    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Export(name="tags", refs={List.class,NetPeeringTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NetPeeringTag>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Output<Optional<List<NetPeeringTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetPeering(String name) {
        this(name, NetPeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetPeering(String name, NetPeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetPeering(String name, NetPeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/netPeering:NetPeering", name, args == null ? NetPeeringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetPeering(String name, Output<String> id, @Nullable com.pulumi.outscale.inputs.NetPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("outscale:index/netPeering:NetPeering", name, state, makeResourceOptions(options, id));
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
    public static NetPeering get(String name, Output<String> id, @Nullable com.pulumi.outscale.inputs.NetPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetPeering(name, id, state, options);
    }
}