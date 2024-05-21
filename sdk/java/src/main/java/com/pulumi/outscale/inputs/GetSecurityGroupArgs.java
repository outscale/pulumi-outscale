// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetSecurityGroupFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecurityGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityGroupArgs Empty = new GetSecurityGroupArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetSecurityGroupFilterArgs>> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<Output<List<GetSecurityGroupFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the security group.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return The ID of the security group.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    /**
     * The name of the security group.
     * 
     */
    @Import(name="securityGroupName")
    private @Nullable Output<String> securityGroupName;

    /**
     * @return The name of the security group.
     * 
     */
    public Optional<Output<String>> securityGroupName() {
        return Optional.ofNullable(this.securityGroupName);
    }

    private GetSecurityGroupArgs() {}

    private GetSecurityGroupArgs(GetSecurityGroupArgs $) {
        this.filters = $.filters;
        this.securityGroupId = $.securityGroupId;
        this.securityGroupName = $.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityGroupArgs $;

        public Builder() {
            $ = new GetSecurityGroupArgs();
        }

        public Builder(GetSecurityGroupArgs defaults) {
            $ = new GetSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetSecurityGroupFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetSecurityGroupFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSecurityGroupFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param securityGroupId The ID of the security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The ID of the security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param securityGroupName The name of the security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupName(@Nullable Output<String> securityGroupName) {
            $.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * @param securityGroupName The name of the security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupName(String securityGroupName) {
            return securityGroupName(Output.of(securityGroupName));
        }

        public GetSecurityGroupArgs build() {
            return $;
        }
    }

}