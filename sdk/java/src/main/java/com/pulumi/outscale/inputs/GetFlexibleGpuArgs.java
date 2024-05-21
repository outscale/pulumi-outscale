// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetFlexibleGpuFilterArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFlexibleGpuArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlexibleGpuArgs Empty = new GetFlexibleGpuArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetFlexibleGpuFilterArgs>> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<Output<List<GetFlexibleGpuFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetFlexibleGpuArgs() {}

    private GetFlexibleGpuArgs(GetFlexibleGpuArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlexibleGpuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlexibleGpuArgs $;

        public Builder() {
            $ = new GetFlexibleGpuArgs();
        }

        public Builder(GetFlexibleGpuArgs defaults) {
            $ = new GetFlexibleGpuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetFlexibleGpuFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetFlexibleGpuFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetFlexibleGpuFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetFlexibleGpuArgs build() {
            return $;
        }
    }

}