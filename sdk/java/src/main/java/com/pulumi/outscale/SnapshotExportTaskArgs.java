// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.SnapshotExportTaskOsuExportArgs;
import com.pulumi.outscale.inputs.SnapshotExportTaskTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotExportTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotExportTaskArgs Empty = new SnapshotExportTaskArgs();

    /**
     * Information about the OOS export task to create.
     * 
     */
    @Import(name="osuExports", required=true)
    private Output<List<SnapshotExportTaskOsuExportArgs>> osuExports;

    /**
     * @return Information about the OOS export task to create.
     * 
     */
    public Output<List<SnapshotExportTaskOsuExportArgs>> osuExports() {
        return this.osuExports;
    }

    /**
     * The ID of the snapshot to export.
     * 
     */
    @Import(name="snapshotId", required=true)
    private Output<String> snapshotId;

    /**
     * @return The ID of the snapshot to export.
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }

    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<SnapshotExportTaskTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<SnapshotExportTaskTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SnapshotExportTaskArgs() {}

    private SnapshotExportTaskArgs(SnapshotExportTaskArgs $) {
        this.osuExports = $.osuExports;
        this.snapshotId = $.snapshotId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotExportTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotExportTaskArgs $;

        public Builder() {
            $ = new SnapshotExportTaskArgs();
        }

        public Builder(SnapshotExportTaskArgs defaults) {
            $ = new SnapshotExportTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param osuExports Information about the OOS export task to create.
         * 
         * @return builder
         * 
         */
        public Builder osuExports(Output<List<SnapshotExportTaskOsuExportArgs>> osuExports) {
            $.osuExports = osuExports;
            return this;
        }

        /**
         * @param osuExports Information about the OOS export task to create.
         * 
         * @return builder
         * 
         */
        public Builder osuExports(List<SnapshotExportTaskOsuExportArgs> osuExports) {
            return osuExports(Output.of(osuExports));
        }

        /**
         * @param osuExports Information about the OOS export task to create.
         * 
         * @return builder
         * 
         */
        public Builder osuExports(SnapshotExportTaskOsuExportArgs... osuExports) {
            return osuExports(List.of(osuExports));
        }

        /**
         * @param snapshotId The ID of the snapshot to export.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The ID of the snapshot to export.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<SnapshotExportTaskTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<SnapshotExportTaskTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(SnapshotExportTaskTagArgs... tags) {
            return tags(List.of(tags));
        }

        public SnapshotExportTaskArgs build() {
            $.osuExports = Objects.requireNonNull($.osuExports, "expected parameter 'osuExports' to be non-null");
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            return $;
        }
    }

}