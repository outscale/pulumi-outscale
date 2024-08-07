// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetClientGatewayFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClientGatewayPlainArgs Empty = new GetClientGatewayPlainArgs();

    /**
     * The ID of the client gateway.
     * 
     */
    @Import(name="clientGatewayId")
    private @Nullable String clientGatewayId;

    /**
     * @return The ID of the client gateway.
     * 
     */
    public Optional<String> clientGatewayId() {
        return Optional.ofNullable(this.clientGatewayId);
    }

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetClientGatewayFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetClientGatewayFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetClientGatewayPlainArgs() {}

    private GetClientGatewayPlainArgs(GetClientGatewayPlainArgs $) {
        this.clientGatewayId = $.clientGatewayId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClientGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClientGatewayPlainArgs $;

        public Builder() {
            $ = new GetClientGatewayPlainArgs();
        }

        public Builder(GetClientGatewayPlainArgs defaults) {
            $ = new GetClientGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientGatewayId The ID of the client gateway.
         * 
         * @return builder
         * 
         */
        public Builder clientGatewayId(@Nullable String clientGatewayId) {
            $.clientGatewayId = clientGatewayId;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetClientGatewayFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetClientGatewayFilter... filters) {
            return filters(List.of(filters));
        }

        public GetClientGatewayPlainArgs build() {
            return $;
        }
    }

}
