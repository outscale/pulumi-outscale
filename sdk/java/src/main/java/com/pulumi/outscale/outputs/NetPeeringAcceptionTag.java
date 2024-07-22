// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetPeeringAcceptionTag {
    /**
     * @return The key of the tag, with a minimum of 1 character.
     * 
     */
    private @Nullable String key;
    /**
     * @return The value of the tag, between 0 and 255 characters.
     * 
     */
    private @Nullable String value;

    private NetPeeringAcceptionTag() {}
    /**
     * @return The key of the tag, with a minimum of 1 character.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The value of the tag, between 0 and 255 characters.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetPeeringAcceptionTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(NetPeeringAcceptionTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public NetPeeringAcceptionTag build() {
            final var o = new NetPeeringAcceptionTag();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}
