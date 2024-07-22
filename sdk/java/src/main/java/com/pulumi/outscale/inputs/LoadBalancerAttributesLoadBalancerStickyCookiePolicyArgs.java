// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs Empty = new LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs();

    /**
     * The name of the stickiness policy.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return The name of the stickiness policy.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    private LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs() {}

    private LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs(LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs $) {
        this.policyName = $.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs $;

        public Builder() {
            $ = new LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs();
        }

        public Builder(LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs defaults) {
            $ = new LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyName The name of the stickiness policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName The name of the stickiness policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        public LoadBalancerAttributesLoadBalancerStickyCookiePolicyArgs build() {
            return $;
        }
    }

}
