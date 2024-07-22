// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeTagArgs Empty = new VolumeTagArgs();

    /**
     * The key of the tag, with a minimum of 1 character.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The key of the tag, with a minimum of 1 character.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The value of the tag, between 0 and 255 characters.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the tag, between 0 and 255 characters.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private VolumeTagArgs() {}

    private VolumeTagArgs(VolumeTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeTagArgs $;

        public Builder() {
            $ = new VolumeTagArgs();
        }

        public Builder(VolumeTagArgs defaults) {
            $ = new VolumeTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key of the tag, with a minimum of 1 character.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key of the tag, with a minimum of 1 character.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value of the tag, between 0 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the tag, between 0 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public VolumeTagArgs build() {
            return $;
        }
    }

}
