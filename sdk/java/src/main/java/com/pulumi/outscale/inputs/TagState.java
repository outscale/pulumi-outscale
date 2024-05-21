// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.TagTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagState extends com.pulumi.resources.ResourceArgs {

    public static final TagState Empty = new TagState();

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="resourceIds")
    private @Nullable Output<List<String>> resourceIds;

    public Optional<Output<List<String>>> resourceIds() {
        return Optional.ofNullable(this.resourceIds);
    }

    @Import(name="tag")
    private @Nullable Output<List<TagTagArgs>> tag;

    public Optional<Output<List<TagTagArgs>>> tag() {
        return Optional.ofNullable(this.tag);
    }

    @Import(name="tags")
    private @Nullable Output<List<TagTagArgs>> tags;

    public Optional<Output<List<TagTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TagState() {}

    private TagState(TagState $) {
        this.requestId = $.requestId;
        this.resourceIds = $.resourceIds;
        this.tag = $.tag;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagState $;

        public Builder() {
            $ = new TagState();
        }

        public Builder(TagState defaults) {
            $ = new TagState(Objects.requireNonNull(defaults));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder resourceIds(@Nullable Output<List<String>> resourceIds) {
            $.resourceIds = resourceIds;
            return this;
        }

        public Builder resourceIds(List<String> resourceIds) {
            return resourceIds(Output.of(resourceIds));
        }

        public Builder resourceIds(String... resourceIds) {
            return resourceIds(List.of(resourceIds));
        }

        public Builder tag(@Nullable Output<List<TagTagArgs>> tag) {
            $.tag = tag;
            return this;
        }

        public Builder tag(List<TagTagArgs> tag) {
            return tag(Output.of(tag));
        }

        public Builder tag(TagTagArgs... tag) {
            return tag(List.of(tag));
        }

        public Builder tags(@Nullable Output<List<TagTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<TagTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(TagTagArgs... tags) {
            return tags(List.of(tags));
        }

        public TagState build() {
            return $;
        }
    }

}