// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerApplicationStickyCookiePolicy {
    /**
     * @return The name of the application cookie used for stickiness.
     * 
     */
    private @Nullable String cookieName;
    /**
     * @return The name of the stickiness policy.
     * 
     */
    private @Nullable String policyName;

    private LoadBalancerApplicationStickyCookiePolicy() {}
    /**
     * @return The name of the application cookie used for stickiness.
     * 
     */
    public Optional<String> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }
    /**
     * @return The name of the stickiness policy.
     * 
     */
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerApplicationStickyCookiePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cookieName;
        private @Nullable String policyName;
        public Builder() {}
        public Builder(LoadBalancerApplicationStickyCookiePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieName = defaults.cookieName;
    	      this.policyName = defaults.policyName;
        }

        @CustomType.Setter
        public Builder cookieName(@Nullable String cookieName) {
            this.cookieName = cookieName;
            return this;
        }
        @CustomType.Setter
        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }
        public LoadBalancerApplicationStickyCookiePolicy build() {
            final var o = new LoadBalancerApplicationStickyCookiePolicy();
            o.cookieName = cookieName;
            o.policyName = policyName;
            return o;
        }
    }
}