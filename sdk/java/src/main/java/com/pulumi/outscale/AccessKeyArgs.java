// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessKeyArgs Empty = new AccessKeyArgs();

    /**
     * The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
     * 
     */
    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    /**
     * @return The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
     * 
     */
    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * The state for the access key (`ACTIVE` | `INACTIVE`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state for the access key (`ACTIVE` | `INACTIVE`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private AccessKeyArgs() {}

    private AccessKeyArgs(AccessKeyArgs $) {
        this.expirationDate = $.expirationDate;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessKeyArgs $;

        public Builder() {
            $ = new AccessKeyArgs();
        }

        public Builder(AccessKeyArgs defaults) {
            $ = new AccessKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationDate The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param expirationDate The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        /**
         * @param state The state for the access key (`ACTIVE` | `INACTIVE`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state for the access key (`ACTIVE` | `INACTIVE`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public AccessKeyArgs build() {
            return $;
        }
    }

}
