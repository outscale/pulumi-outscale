// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetVpnConnectionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpnConnectionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpnConnectionsPlainArgs Empty = new GetVpnConnectionsPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVpnConnectionsFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetVpnConnectionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The IDs of the VPN connections.
     * 
     */
    @Import(name="vpnConnectionIds")
    private @Nullable List<String> vpnConnectionIds;

    /**
     * @return The IDs of the VPN connections.
     * 
     */
    public Optional<List<String>> vpnConnectionIds() {
        return Optional.ofNullable(this.vpnConnectionIds);
    }

    private GetVpnConnectionsPlainArgs() {}

    private GetVpnConnectionsPlainArgs(GetVpnConnectionsPlainArgs $) {
        this.filters = $.filters;
        this.vpnConnectionIds = $.vpnConnectionIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpnConnectionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpnConnectionsPlainArgs $;

        public Builder() {
            $ = new GetVpnConnectionsPlainArgs();
        }

        public Builder(GetVpnConnectionsPlainArgs defaults) {
            $ = new GetVpnConnectionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVpnConnectionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVpnConnectionsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param vpnConnectionIds The IDs of the VPN connections.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionIds(@Nullable List<String> vpnConnectionIds) {
            $.vpnConnectionIds = vpnConnectionIds;
            return this;
        }

        /**
         * @param vpnConnectionIds The IDs of the VPN connections.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionIds(String... vpnConnectionIds) {
            return vpnConnectionIds(List.of(vpnConnectionIds));
        }

        public GetVpnConnectionsPlainArgs build() {
            return $;
        }
    }

}
