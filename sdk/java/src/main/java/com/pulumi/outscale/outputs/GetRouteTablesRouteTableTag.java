// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteTablesRouteTableTag {
    /**
     * @return The key of the tag, with a minimum of 1 character.
     * 
     */
    private String key;
    /**
     * @return The value of the tag, between 0 and 255 characters.
     * 
     */
    private String value;

    private GetRouteTablesRouteTableTag() {}
    /**
     * @return The key of the tag, with a minimum of 1 character.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value of the tag, between 0 and 255 characters.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTablesRouteTableTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetRouteTablesRouteTableTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetRouteTablesRouteTableTag build() {
            final var o = new GetRouteTablesRouteTableTag();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}
