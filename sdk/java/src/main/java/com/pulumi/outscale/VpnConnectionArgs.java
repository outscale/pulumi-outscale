// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.VpnConnectionTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnConnectionArgs Empty = new VpnConnectionArgs();

    /**
     * The ID of the client gateway.
     * 
     */
    @Import(name="clientGatewayId", required=true)
    private Output<String> clientGatewayId;

    /**
     * @return The ID of the client gateway.
     * 
     */
    public Output<String> clientGatewayId() {
        return this.clientGatewayId;
    }

    /**
     * The type of VPN connection (only `ipsec.1` is supported).
     * 
     */
    @Import(name="connectionType", required=true)
    private Output<String> connectionType;

    /**
     * @return The type of VPN connection (only `ipsec.1` is supported).
     * 
     */
    public Output<String> connectionType() {
        return this.connectionType;
    }

    /**
     * If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
     * 
     */
    @Import(name="staticRoutesOnly")
    private @Nullable Output<Boolean> staticRoutesOnly;

    /**
     * @return If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
     * 
     */
    public Optional<Output<Boolean>> staticRoutesOnly() {
        return Optional.ofNullable(this.staticRoutesOnly);
    }

    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<VpnConnectionTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<VpnConnectionTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the virtual gateway.
     * 
     */
    @Import(name="virtualGatewayId", required=true)
    private Output<String> virtualGatewayId;

    /**
     * @return The ID of the virtual gateway.
     * 
     */
    public Output<String> virtualGatewayId() {
        return this.virtualGatewayId;
    }

    private VpnConnectionArgs() {}

    private VpnConnectionArgs(VpnConnectionArgs $) {
        this.clientGatewayId = $.clientGatewayId;
        this.connectionType = $.connectionType;
        this.staticRoutesOnly = $.staticRoutesOnly;
        this.tags = $.tags;
        this.virtualGatewayId = $.virtualGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnConnectionArgs $;

        public Builder() {
            $ = new VpnConnectionArgs();
        }

        public Builder(VpnConnectionArgs defaults) {
            $ = new VpnConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientGatewayId The ID of the client gateway.
         * 
         * @return builder
         * 
         */
        public Builder clientGatewayId(Output<String> clientGatewayId) {
            $.clientGatewayId = clientGatewayId;
            return this;
        }

        /**
         * @param clientGatewayId The ID of the client gateway.
         * 
         * @return builder
         * 
         */
        public Builder clientGatewayId(String clientGatewayId) {
            return clientGatewayId(Output.of(clientGatewayId));
        }

        /**
         * @param connectionType The type of VPN connection (only `ipsec.1` is supported).
         * 
         * @return builder
         * 
         */
        public Builder connectionType(Output<String> connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param connectionType The type of VPN connection (only `ipsec.1` is supported).
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            return connectionType(Output.of(connectionType));
        }

        /**
         * @param staticRoutesOnly If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
         * 
         * @return builder
         * 
         */
        public Builder staticRoutesOnly(@Nullable Output<Boolean> staticRoutesOnly) {
            $.staticRoutesOnly = staticRoutesOnly;
            return this;
        }

        /**
         * @param staticRoutesOnly If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
         * 
         * @return builder
         * 
         */
        public Builder staticRoutesOnly(Boolean staticRoutesOnly) {
            return staticRoutesOnly(Output.of(staticRoutesOnly));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<VpnConnectionTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<VpnConnectionTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(VpnConnectionTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param virtualGatewayId The ID of the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayId(Output<String> virtualGatewayId) {
            $.virtualGatewayId = virtualGatewayId;
            return this;
        }

        /**
         * @param virtualGatewayId The ID of the virtual gateway.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayId(String virtualGatewayId) {
            return virtualGatewayId(Output.of(virtualGatewayId));
        }

        public VpnConnectionArgs build() {
            $.clientGatewayId = Objects.requireNonNull($.clientGatewayId, "expected parameter 'clientGatewayId' to be non-null");
            $.connectionType = Objects.requireNonNull($.connectionType, "expected parameter 'connectionType' to be non-null");
            $.virtualGatewayId = Objects.requireNonNull($.virtualGatewayId, "expected parameter 'virtualGatewayId' to be non-null");
            return $;
        }
    }

}
