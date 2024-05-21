// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerApplicationStickyCookiePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerApplicationStickyCookiePolicyArgs Empty = new LoadBalancerApplicationStickyCookiePolicyArgs();

    /**
     * The name of the application cookie used for stickiness.
     * 
     */
    @Import(name="cookieName")
    private @Nullable Output<String> cookieName;

    /**
     * @return The name of the application cookie used for stickiness.
     * 
     */
    public Optional<Output<String>> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }

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

    private LoadBalancerApplicationStickyCookiePolicyArgs() {}

    private LoadBalancerApplicationStickyCookiePolicyArgs(LoadBalancerApplicationStickyCookiePolicyArgs $) {
        this.cookieName = $.cookieName;
        this.policyName = $.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerApplicationStickyCookiePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerApplicationStickyCookiePolicyArgs $;

        public Builder() {
            $ = new LoadBalancerApplicationStickyCookiePolicyArgs();
        }

        public Builder(LoadBalancerApplicationStickyCookiePolicyArgs defaults) {
            $ = new LoadBalancerApplicationStickyCookiePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cookieName The name of the application cookie used for stickiness.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(@Nullable Output<String> cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        /**
         * @param cookieName The name of the application cookie used for stickiness.
         * 
         * @return builder
         * 
         */
        public Builder cookieName(String cookieName) {
            return cookieName(Output.of(cookieName));
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

        public LoadBalancerApplicationStickyCookiePolicyArgs build() {
            return $;
        }
    }

}