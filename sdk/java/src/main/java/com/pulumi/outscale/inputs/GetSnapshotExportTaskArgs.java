// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetSnapshotExportTaskFilterArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotExportTaskArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotExportTaskArgs Empty = new GetSnapshotExportTaskArgs();

    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetSnapshotExportTaskFilterArgs>> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<Output<List<GetSnapshotExportTaskFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetSnapshotExportTaskArgs() {}

    private GetSnapshotExportTaskArgs(GetSnapshotExportTaskArgs $) {
        this.dryRun = $.dryRun;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotExportTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotExportTaskArgs $;

        public Builder() {
            $ = new GetSnapshotExportTaskArgs();
        }

        public Builder(GetSnapshotExportTaskArgs defaults) {
            $ = new GetSnapshotExportTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetSnapshotExportTaskFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetSnapshotExportTaskFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSnapshotExportTaskFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public GetSnapshotExportTaskArgs build() {
            return $;
        }
    }

}