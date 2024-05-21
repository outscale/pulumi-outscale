// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiAccessPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ApiAccessPolicyState Empty = new ApiAccessPolicyState();

    /**
     * The maximum possible lifetime for your access keys, in seconds (between `0` and `3153600000`, both included). If set to `O`, your access keys can have unlimited lifetimes, but a trusted session cannot be activated. Otherwise, all your access keys must have an expiration date. This value must be greater than the remaining lifetime of each access key of your account.
     * 
     */
    @Import(name="maxAccessKeyExpirationSeconds")
    private @Nullable Output<Integer> maxAccessKeyExpirationSeconds;

    /**
     * @return The maximum possible lifetime for your access keys, in seconds (between `0` and `3153600000`, both included). If set to `O`, your access keys can have unlimited lifetimes, but a trusted session cannot be activated. Otherwise, all your access keys must have an expiration date. This value must be greater than the remaining lifetime of each access key of your account.
     * 
     */
    public Optional<Output<Integer>> maxAccessKeyExpirationSeconds() {
        return Optional.ofNullable(this.maxAccessKeyExpirationSeconds);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * If true, a trusted session is activated, provided that you specify the `max_access_key_expiration_seconds` parameter with a value greater than `0`.
     * 
     */
    @Import(name="requireTrustedEnv")
    private @Nullable Output<Boolean> requireTrustedEnv;

    /**
     * @return If true, a trusted session is activated, provided that you specify the `max_access_key_expiration_seconds` parameter with a value greater than `0`.
     * 
     */
    public Optional<Output<Boolean>> requireTrustedEnv() {
        return Optional.ofNullable(this.requireTrustedEnv);
    }

    private ApiAccessPolicyState() {}

    private ApiAccessPolicyState(ApiAccessPolicyState $) {
        this.maxAccessKeyExpirationSeconds = $.maxAccessKeyExpirationSeconds;
        this.requestId = $.requestId;
        this.requireTrustedEnv = $.requireTrustedEnv;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiAccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiAccessPolicyState $;

        public Builder() {
            $ = new ApiAccessPolicyState();
        }

        public Builder(ApiAccessPolicyState defaults) {
            $ = new ApiAccessPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxAccessKeyExpirationSeconds The maximum possible lifetime for your access keys, in seconds (between `0` and `3153600000`, both included). If set to `O`, your access keys can have unlimited lifetimes, but a trusted session cannot be activated. Otherwise, all your access keys must have an expiration date. This value must be greater than the remaining lifetime of each access key of your account.
         * 
         * @return builder
         * 
         */
        public Builder maxAccessKeyExpirationSeconds(@Nullable Output<Integer> maxAccessKeyExpirationSeconds) {
            $.maxAccessKeyExpirationSeconds = maxAccessKeyExpirationSeconds;
            return this;
        }

        /**
         * @param maxAccessKeyExpirationSeconds The maximum possible lifetime for your access keys, in seconds (between `0` and `3153600000`, both included). If set to `O`, your access keys can have unlimited lifetimes, but a trusted session cannot be activated. Otherwise, all your access keys must have an expiration date. This value must be greater than the remaining lifetime of each access key of your account.
         * 
         * @return builder
         * 
         */
        public Builder maxAccessKeyExpirationSeconds(Integer maxAccessKeyExpirationSeconds) {
            return maxAccessKeyExpirationSeconds(Output.of(maxAccessKeyExpirationSeconds));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param requireTrustedEnv If true, a trusted session is activated, provided that you specify the `max_access_key_expiration_seconds` parameter with a value greater than `0`.
         * 
         * @return builder
         * 
         */
        public Builder requireTrustedEnv(@Nullable Output<Boolean> requireTrustedEnv) {
            $.requireTrustedEnv = requireTrustedEnv;
            return this;
        }

        /**
         * @param requireTrustedEnv If true, a trusted session is activated, provided that you specify the `max_access_key_expiration_seconds` parameter with a value greater than `0`.
         * 
         * @return builder
         * 
         */
        public Builder requireTrustedEnv(Boolean requireTrustedEnv) {
            return requireTrustedEnv(Output.of(requireTrustedEnv));
        }

        public ApiAccessPolicyState build() {
            return $;
        }
    }

}