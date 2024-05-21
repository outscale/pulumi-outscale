// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerAccessLog {
    /**
     * @return If true, access logs are enabled for your load balancer. If false, they are not. If you set this to true in your request, the `osu_bucket_name` parameter is required.
     * 
     */
    private @Nullable Boolean isEnabled;
    /**
     * @return The name of the OOS bucket for the access logs.
     * 
     */
    private @Nullable String osuBucketName;
    /**
     * @return The path to the folder of the access logs in your OOS bucket (by default, the `root` level of your bucket).
     * 
     */
    private @Nullable String osuBucketPrefix;
    /**
     * @return The time interval for the publication of access logs in the OOS bucket, in minutes. This value can be either `5` or `60` (by default, `60`).
     * 
     */
    private @Nullable Integer publicationInterval;

    private LoadBalancerAccessLog() {}
    /**
     * @return If true, access logs are enabled for your load balancer. If false, they are not. If you set this to true in your request, the `osu_bucket_name` parameter is required.
     * 
     */
    public Optional<Boolean> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * @return The name of the OOS bucket for the access logs.
     * 
     */
    public Optional<String> osuBucketName() {
        return Optional.ofNullable(this.osuBucketName);
    }
    /**
     * @return The path to the folder of the access logs in your OOS bucket (by default, the `root` level of your bucket).
     * 
     */
    public Optional<String> osuBucketPrefix() {
        return Optional.ofNullable(this.osuBucketPrefix);
    }
    /**
     * @return The time interval for the publication of access logs in the OOS bucket, in minutes. This value can be either `5` or `60` (by default, `60`).
     * 
     */
    public Optional<Integer> publicationInterval() {
        return Optional.ofNullable(this.publicationInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAccessLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private @Nullable String osuBucketName;
        private @Nullable String osuBucketPrefix;
        private @Nullable Integer publicationInterval;
        public Builder() {}
        public Builder(LoadBalancerAccessLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.osuBucketName = defaults.osuBucketName;
    	      this.osuBucketPrefix = defaults.osuBucketPrefix;
    	      this.publicationInterval = defaults.publicationInterval;
        }

        @CustomType.Setter
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder osuBucketName(@Nullable String osuBucketName) {
            this.osuBucketName = osuBucketName;
            return this;
        }
        @CustomType.Setter
        public Builder osuBucketPrefix(@Nullable String osuBucketPrefix) {
            this.osuBucketPrefix = osuBucketPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder publicationInterval(@Nullable Integer publicationInterval) {
            this.publicationInterval = publicationInterval;
            return this;
        }
        public LoadBalancerAccessLog build() {
            final var o = new LoadBalancerAccessLog();
            o.isEnabled = isEnabled;
            o.osuBucketName = osuBucketName;
            o.osuBucketPrefix = osuBucketPrefix;
            o.publicationInterval = publicationInterval;
            return o;
        }
    }
}