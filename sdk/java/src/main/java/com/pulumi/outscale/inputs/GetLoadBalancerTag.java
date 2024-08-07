// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerTag extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerTag Empty = new GetLoadBalancerTag();

    /**
     * The key of the tag, with a minimum of 1 character.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The key of the tag, with a minimum of 1 character.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The value of the tag, between 0 and 255 characters.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return The value of the tag, between 0 and 255 characters.
     * 
     */
    public String value() {
        return this.value;
    }

    private GetLoadBalancerTag() {}

    private GetLoadBalancerTag(GetLoadBalancerTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerTag $;

        public Builder() {
            $ = new GetLoadBalancerTag();
        }

        public Builder(GetLoadBalancerTag defaults) {
            $ = new GetLoadBalancerTag(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key of the tag, with a minimum of 1 character.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value The value of the tag, between 0 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetLoadBalancerTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
