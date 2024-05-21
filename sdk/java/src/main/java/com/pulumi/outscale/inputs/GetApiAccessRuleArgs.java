// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetApiAccessRuleFilterArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiAccessRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiAccessRuleArgs Empty = new GetApiAccessRuleArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetApiAccessRuleFilterArgs>> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<Output<List<GetApiAccessRuleFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetApiAccessRuleArgs() {}

    private GetApiAccessRuleArgs(GetApiAccessRuleArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiAccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiAccessRuleArgs $;

        public Builder() {
            $ = new GetApiAccessRuleArgs();
        }

        public Builder(GetApiAccessRuleArgs defaults) {
            $ = new GetApiAccessRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetApiAccessRuleFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetApiAccessRuleFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetApiAccessRuleFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetApiAccessRuleArgs build() {
            return $;
        }
    }

}