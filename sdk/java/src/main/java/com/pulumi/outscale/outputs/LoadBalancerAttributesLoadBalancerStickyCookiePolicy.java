// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerAttributesLoadBalancerStickyCookiePolicy {
    /**
     * @return The name of the stickiness policy.
     * 
     */
    private @Nullable String policyName;

    private LoadBalancerAttributesLoadBalancerStickyCookiePolicy() {}
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

    public static Builder builder(LoadBalancerAttributesLoadBalancerStickyCookiePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String policyName;
        public Builder() {}
        public Builder(LoadBalancerAttributesLoadBalancerStickyCookiePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyName = defaults.policyName;
        }

        @CustomType.Setter
        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }
        public LoadBalancerAttributesLoadBalancerStickyCookiePolicy build() {
            final var o = new LoadBalancerAttributesLoadBalancerStickyCookiePolicy();
            o.policyName = policyName;
            return o;
        }
    }
}
