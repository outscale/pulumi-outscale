// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.ImageExportTaskOsuExportArgs;
import com.pulumi.outscale.inputs.ImageExportTaskTagArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageExportTaskState extends com.pulumi.resources.ResourceArgs {

    public static final ImageExportTaskState Empty = new ImageExportTaskState();

    /**
     * If the OMI export task fails, an error message appears.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return If the OMI export task fails, an error message appears.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The ID of the OMI to export.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The ID of the OMI to export.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * Information about the OOS export task to create.
     * 
     */
    @Import(name="osuExports")
    private @Nullable Output<List<ImageExportTaskOsuExportArgs>> osuExports;

    /**
     * @return Information about the OOS export task to create.
     * 
     */
    public Optional<Output<List<ImageExportTaskOsuExportArgs>>> osuExports() {
        return Optional.ofNullable(this.osuExports);
    }

    /**
     * The progress of the OMI export task, as a percentage.
     * 
     */
    @Import(name="progress")
    private @Nullable Output<Integer> progress;

    /**
     * @return The progress of the OMI export task, as a percentage.
     * 
     */
    public Optional<Output<Integer>> progress() {
        return Optional.ofNullable(this.progress);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ImageExportTaskTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<ImageExportTaskTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the OMI export task.
     * 
     */
    @Import(name="taskId")
    private @Nullable Output<String> taskId;

    /**
     * @return The ID of the OMI export task.
     * 
     */
    public Optional<Output<String>> taskId() {
        return Optional.ofNullable(this.taskId);
    }

    private ImageExportTaskState() {}

    private ImageExportTaskState(ImageExportTaskState $) {
        this.comment = $.comment;
        this.imageId = $.imageId;
        this.osuExports = $.osuExports;
        this.progress = $.progress;
        this.requestId = $.requestId;
        this.state = $.state;
        this.tags = $.tags;
        this.taskId = $.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageExportTaskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageExportTaskState $;

        public Builder() {
            $ = new ImageExportTaskState();
        }

        public Builder(ImageExportTaskState defaults) {
            $ = new ImageExportTaskState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment If the OMI export task fails, an error message appears.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment If the OMI export task fails, an error message appears.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param imageId The ID of the OMI to export.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The ID of the OMI to export.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param osuExports Information about the OOS export task to create.
         * 
         * @return builder
         * 
         */
        public Builder osuExports(@Nullable Output<List<ImageExportTaskOsuExportArgs>> osuExports) {
            $.osuExports = osuExports;
            return this;
        }

        /**
         * @param osuExports Information about the OOS export task to create.
         * 
         * @return builder
         * 
         */
        public Builder osuExports(List<ImageExportTaskOsuExportArgs> osuExports) {
            return osuExports(Output.of(osuExports));
        }

        /**
         * @param osuExports Information about the OOS export task to create.
         * 
         * @return builder
         * 
         */
        public Builder osuExports(ImageExportTaskOsuExportArgs... osuExports) {
            return osuExports(List.of(osuExports));
        }

        /**
         * @param progress The progress of the OMI export task, as a percentage.
         * 
         * @return builder
         * 
         */
        public Builder progress(@Nullable Output<Integer> progress) {
            $.progress = progress;
            return this;
        }

        /**
         * @param progress The progress of the OMI export task, as a percentage.
         * 
         * @return builder
         * 
         */
        public Builder progress(Integer progress) {
            return progress(Output.of(progress));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param state The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ImageExportTaskTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ImageExportTaskTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(ImageExportTaskTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param taskId The ID of the OMI export task.
         * 
         * @return builder
         * 
         */
        public Builder taskId(@Nullable Output<String> taskId) {
            $.taskId = taskId;
            return this;
        }

        /**
         * @param taskId The ID of the OMI export task.
         * 
         * @return builder
         * 
         */
        public Builder taskId(String taskId) {
            return taskId(Output.of(taskId));
        }

        public ImageExportTaskState build() {
            return $;
        }
    }

}
