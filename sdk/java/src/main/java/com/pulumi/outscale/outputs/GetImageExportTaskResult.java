// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetImageExportTaskFilter;
import com.pulumi.outscale.outputs.GetImageExportTaskOsuExport;
import com.pulumi.outscale.outputs.GetImageExportTaskTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImageExportTaskResult {
    /**
     * @return If the OMI export task fails, an error message appears.
     * 
     */
    private String comment;
    private Boolean dryRun;
    private @Nullable List<GetImageExportTaskFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The ID of the OMI to be exported.
     * 
     */
    private String imageId;
    /**
     * @return Information about the OMI export task.
     * 
     */
    private List<GetImageExportTaskOsuExport> osuExports;
    /**
     * @return The progress of the OMI export task, as a percentage.
     * 
     */
    private Integer progress;
    private String requestId;
    /**
     * @return The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     * 
     */
    private String state;
    /**
     * @return One or more tags associated with the image export task.
     * 
     */
    private List<GetImageExportTaskTag> tags;
    /**
     * @return The ID of the OMI export task.
     * 
     */
    private String taskId;

    private GetImageExportTaskResult() {}
    /**
     * @return If the OMI export task fails, an error message appears.
     * 
     */
    public String comment() {
        return this.comment;
    }
    public Boolean dryRun() {
        return this.dryRun;
    }
    public List<GetImageExportTaskFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the OMI to be exported.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return Information about the OMI export task.
     * 
     */
    public List<GetImageExportTaskOsuExport> osuExports() {
        return this.osuExports;
    }
    /**
     * @return The progress of the OMI export task, as a percentage.
     * 
     */
    public Integer progress() {
        return this.progress;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return One or more tags associated with the image export task.
     * 
     */
    public List<GetImageExportTaskTag> tags() {
        return this.tags;
    }
    /**
     * @return The ID of the OMI export task.
     * 
     */
    public String taskId() {
        return this.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageExportTaskResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private Boolean dryRun;
        private @Nullable List<GetImageExportTaskFilter> filters;
        private String id;
        private String imageId;
        private List<GetImageExportTaskOsuExport> osuExports;
        private Integer progress;
        private String requestId;
        private String state;
        private List<GetImageExportTaskTag> tags;
        private String taskId;
        public Builder() {}
        public Builder(GetImageExportTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.dryRun = defaults.dryRun;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.osuExports = defaults.osuExports;
    	      this.progress = defaults.progress;
    	      this.requestId = defaults.requestId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.taskId = defaults.taskId;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = Objects.requireNonNull(dryRun);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetImageExportTaskFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetImageExportTaskFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        @CustomType.Setter
        public Builder osuExports(List<GetImageExportTaskOsuExport> osuExports) {
            this.osuExports = Objects.requireNonNull(osuExports);
            return this;
        }
        public Builder osuExports(GetImageExportTaskOsuExport... osuExports) {
            return osuExports(List.of(osuExports));
        }
        @CustomType.Setter
        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetImageExportTaskTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetImageExportTaskTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder taskId(String taskId) {
            this.taskId = Objects.requireNonNull(taskId);
            return this;
        }
        public GetImageExportTaskResult build() {
            final var o = new GetImageExportTaskResult();
            o.comment = comment;
            o.dryRun = dryRun;
            o.filters = filters;
            o.id = id;
            o.imageId = imageId;
            o.osuExports = osuExports;
            o.progress = progress;
            o.requestId = requestId;
            o.state = state;
            o.tags = tags;
            o.taskId = taskId;
            return o;
        }
    }
}
