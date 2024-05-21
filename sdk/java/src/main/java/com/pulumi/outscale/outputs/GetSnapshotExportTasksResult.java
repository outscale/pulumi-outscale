// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetSnapshotExportTasksFilter;
import com.pulumi.outscale.outputs.GetSnapshotExportTasksSnapshotExportTask;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSnapshotExportTasksResult {
    private Boolean dryRun;
    private @Nullable List<GetSnapshotExportTasksFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String requestId;
    /**
     * @return Information about one or more snapshot export tasks.
     * 
     */
    private List<GetSnapshotExportTasksSnapshotExportTask> snapshotExportTasks;

    private GetSnapshotExportTasksResult() {}
    public Boolean dryRun() {
        return this.dryRun;
    }
    public List<GetSnapshotExportTasksFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return Information about one or more snapshot export tasks.
     * 
     */
    public List<GetSnapshotExportTasksSnapshotExportTask> snapshotExportTasks() {
        return this.snapshotExportTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotExportTasksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean dryRun;
        private @Nullable List<GetSnapshotExportTasksFilter> filters;
        private String id;
        private String requestId;
        private List<GetSnapshotExportTasksSnapshotExportTask> snapshotExportTasks;
        public Builder() {}
        public Builder(GetSnapshotExportTasksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dryRun = defaults.dryRun;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.requestId = defaults.requestId;
    	      this.snapshotExportTasks = defaults.snapshotExportTasks;
        }

        @CustomType.Setter
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = Objects.requireNonNull(dryRun);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetSnapshotExportTasksFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSnapshotExportTasksFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotExportTasks(List<GetSnapshotExportTasksSnapshotExportTask> snapshotExportTasks) {
            this.snapshotExportTasks = Objects.requireNonNull(snapshotExportTasks);
            return this;
        }
        public Builder snapshotExportTasks(GetSnapshotExportTasksSnapshotExportTask... snapshotExportTasks) {
            return snapshotExportTasks(List.of(snapshotExportTasks));
        }
        public GetSnapshotExportTasksResult build() {
            final var o = new GetSnapshotExportTasksResult();
            o.dryRun = dryRun;
            o.filters = filters;
            o.id = id;
            o.requestId = requestId;
            o.snapshotExportTasks = snapshotExportTasks;
            return o;
        }
    }
}