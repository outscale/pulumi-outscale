// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagTagArgs Empty = new TagTagArgs();

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private TagTagArgs() {}

    private TagTagArgs(TagTagArgs $) {
        this.key = $.key;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagTagArgs $;

        public Builder() {
            $ = new TagTagArgs();
        }

        public Builder(TagTagArgs defaults) {
            $ = new TagTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TagTagArgs build() {
            return $;
        }
    }

}
