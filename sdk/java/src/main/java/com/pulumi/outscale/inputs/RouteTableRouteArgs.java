// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteTableRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteTableRouteArgs Empty = new RouteTableRouteArgs();

    /**
     * The method used to create the route.
     * 
     */
    @Import(name="creationMethod")
    private @Nullable Output<String> creationMethod;

    /**
     * @return The method used to create the route.
     * 
     */
    public Optional<Output<String>> creationMethod() {
        return Optional.ofNullable(this.creationMethod);
    }

    /**
     * The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
     * 
     */
    @Import(name="destinationIpRange")
    private @Nullable Output<String> destinationIpRange;

    /**
     * @return The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
     * 
     */
    public Optional<Output<String>> destinationIpRange() {
        return Optional.ofNullable(this.destinationIpRange);
    }

    /**
     * The ID of the OUTSCALE service.
     * 
     */
    @Import(name="destinationServiceId")
    private @Nullable Output<String> destinationServiceId;

    /**
     * @return The ID of the OUTSCALE service.
     * 
     */
    public Optional<Output<String>> destinationServiceId() {
        return Optional.ofNullable(this.destinationServiceId);
    }

    /**
     * The ID of the Internet service or virtual gateway attached to the Net.
     * 
     */
    @Import(name="gatewayId")
    private @Nullable Output<String> gatewayId;

    /**
     * @return The ID of the Internet service or virtual gateway attached to the Net.
     * 
     */
    public Optional<Output<String>> gatewayId() {
        return Optional.ofNullable(this.gatewayId);
    }

    /**
     * The ID of a NAT service attached to the Net.
     * 
     */
    @Import(name="natServiceId")
    private @Nullable Output<String> natServiceId;

    /**
     * @return The ID of a NAT service attached to the Net.
     * 
     */
    public Optional<Output<String>> natServiceId() {
        return Optional.ofNullable(this.natServiceId);
    }

    /**
     * The ID of the Net access point.
     * 
     */
    @Import(name="netAccessPointId")
    private @Nullable Output<String> netAccessPointId;

    /**
     * @return The ID of the Net access point.
     * 
     */
    public Optional<Output<String>> netAccessPointId() {
        return Optional.ofNullable(this.netAccessPointId);
    }

    /**
     * The ID of the Net peering.
     * 
     */
    @Import(name="netPeeringId")
    private @Nullable Output<String> netPeeringId;

    /**
     * @return The ID of the Net peering.
     * 
     */
    public Optional<Output<String>> netPeeringId() {
        return Optional.ofNullable(this.netPeeringId);
    }

    /**
     * The ID of the NIC.
     * 
     */
    @Import(name="nicId")
    private @Nullable Output<String> nicId;

    /**
     * @return The ID of the NIC.
     * 
     */
    public Optional<Output<String>> nicId() {
        return Optional.ofNullable(this.nicId);
    }

    /**
     * The state of a route in the route table (always `active`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of a route in the route table (always `active`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The account ID of the owner of the VM.
     * 
     */
    @Import(name="vmAccountId")
    private @Nullable Output<String> vmAccountId;

    /**
     * @return The account ID of the owner of the VM.
     * 
     */
    public Optional<Output<String>> vmAccountId() {
        return Optional.ofNullable(this.vmAccountId);
    }

    /**
     * The ID of a VM specified in a route in the table.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<String> vmId;

    /**
     * @return The ID of a VM specified in a route in the table.
     * 
     */
    public Optional<Output<String>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private RouteTableRouteArgs() {}

    private RouteTableRouteArgs(RouteTableRouteArgs $) {
        this.creationMethod = $.creationMethod;
        this.destinationIpRange = $.destinationIpRange;
        this.destinationServiceId = $.destinationServiceId;
        this.gatewayId = $.gatewayId;
        this.natServiceId = $.natServiceId;
        this.netAccessPointId = $.netAccessPointId;
        this.netPeeringId = $.netPeeringId;
        this.nicId = $.nicId;
        this.state = $.state;
        this.vmAccountId = $.vmAccountId;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteTableRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteTableRouteArgs $;

        public Builder() {
            $ = new RouteTableRouteArgs();
        }

        public Builder(RouteTableRouteArgs defaults) {
            $ = new RouteTableRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationMethod The method used to create the route.
         * 
         * @return builder
         * 
         */
        public Builder creationMethod(@Nullable Output<String> creationMethod) {
            $.creationMethod = creationMethod;
            return this;
        }

        /**
         * @param creationMethod The method used to create the route.
         * 
         * @return builder
         * 
         */
        public Builder creationMethod(String creationMethod) {
            return creationMethod(Output.of(creationMethod));
        }

        /**
         * @param destinationIpRange The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
         * 
         * @return builder
         * 
         */
        public Builder destinationIpRange(@Nullable Output<String> destinationIpRange) {
            $.destinationIpRange = destinationIpRange;
            return this;
        }

        /**
         * @param destinationIpRange The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
         * 
         * @return builder
         * 
         */
        public Builder destinationIpRange(String destinationIpRange) {
            return destinationIpRange(Output.of(destinationIpRange));
        }

        /**
         * @param destinationServiceId The ID of the OUTSCALE service.
         * 
         * @return builder
         * 
         */
        public Builder destinationServiceId(@Nullable Output<String> destinationServiceId) {
            $.destinationServiceId = destinationServiceId;
            return this;
        }

        /**
         * @param destinationServiceId The ID of the OUTSCALE service.
         * 
         * @return builder
         * 
         */
        public Builder destinationServiceId(String destinationServiceId) {
            return destinationServiceId(Output.of(destinationServiceId));
        }

        /**
         * @param gatewayId The ID of the Internet service or virtual gateway attached to the Net.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(@Nullable Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId The ID of the Internet service or virtual gateway attached to the Net.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        /**
         * @param natServiceId The ID of a NAT service attached to the Net.
         * 
         * @return builder
         * 
         */
        public Builder natServiceId(@Nullable Output<String> natServiceId) {
            $.natServiceId = natServiceId;
            return this;
        }

        /**
         * @param natServiceId The ID of a NAT service attached to the Net.
         * 
         * @return builder
         * 
         */
        public Builder natServiceId(String natServiceId) {
            return natServiceId(Output.of(natServiceId));
        }

        /**
         * @param netAccessPointId The ID of the Net access point.
         * 
         * @return builder
         * 
         */
        public Builder netAccessPointId(@Nullable Output<String> netAccessPointId) {
            $.netAccessPointId = netAccessPointId;
            return this;
        }

        /**
         * @param netAccessPointId The ID of the Net access point.
         * 
         * @return builder
         * 
         */
        public Builder netAccessPointId(String netAccessPointId) {
            return netAccessPointId(Output.of(netAccessPointId));
        }

        /**
         * @param netPeeringId The ID of the Net peering.
         * 
         * @return builder
         * 
         */
        public Builder netPeeringId(@Nullable Output<String> netPeeringId) {
            $.netPeeringId = netPeeringId;
            return this;
        }

        /**
         * @param netPeeringId The ID of the Net peering.
         * 
         * @return builder
         * 
         */
        public Builder netPeeringId(String netPeeringId) {
            return netPeeringId(Output.of(netPeeringId));
        }

        /**
         * @param nicId The ID of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder nicId(@Nullable Output<String> nicId) {
            $.nicId = nicId;
            return this;
        }

        /**
         * @param nicId The ID of the NIC.
         * 
         * @return builder
         * 
         */
        public Builder nicId(String nicId) {
            return nicId(Output.of(nicId));
        }

        /**
         * @param state The state of a route in the route table (always `active`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of a route in the route table (always `active`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param vmAccountId The account ID of the owner of the VM.
         * 
         * @return builder
         * 
         */
        public Builder vmAccountId(@Nullable Output<String> vmAccountId) {
            $.vmAccountId = vmAccountId;
            return this;
        }

        /**
         * @param vmAccountId The account ID of the owner of the VM.
         * 
         * @return builder
         * 
         */
        public Builder vmAccountId(String vmAccountId) {
            return vmAccountId(Output.of(vmAccountId));
        }

        /**
         * @param vmId The ID of a VM specified in a route in the table.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<String> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The ID of a VM specified in a route in the table.
         * 
         * @return builder
         * 
         */
        public Builder vmId(String vmId) {
            return vmId(Output.of(vmId));
        }

        public RouteTableRouteArgs build() {
            return $;
        }
    }

}
