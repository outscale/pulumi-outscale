// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessKeyState extends com.pulumi.resources.ResourceArgs {

    public static final AccessKeyState Empty = new AccessKeyState();

    /**
     * The ID of the access key.
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Output<String> accessKeyId;

    /**
     * @return The ID of the access key.
     * 
     */
    public Optional<Output<String>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    /**
     * The date and time (UTC) of creation of the access key.
     * 
     */
    @Import(name="creationDate")
    private @Nullable Output<String> creationDate;

    /**
     * @return The date and time (UTC) of creation of the access key.
     * 
     */
    public Optional<Output<String>> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }

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
     * The date and time (UTC) of the last modification of the access key.
     * 
     */
    @Import(name="lastModificationDate")
    private @Nullable Output<String> lastModificationDate;

    /**
     * @return The date and time (UTC) of the last modification of the access key.
     * 
     */
    public Optional<Output<String>> lastModificationDate() {
        return Optional.ofNullable(this.lastModificationDate);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The access key that enables you to send requests.
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return The access key that enables you to send requests.
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
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

    private AccessKeyState() {}

    private AccessKeyState(AccessKeyState $) {
        this.accessKeyId = $.accessKeyId;
        this.creationDate = $.creationDate;
        this.expirationDate = $.expirationDate;
        this.lastModificationDate = $.lastModificationDate;
        this.requestId = $.requestId;
        this.secretKey = $.secretKey;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessKeyState $;

        public Builder() {
            $ = new AccessKeyState();
        }

        public Builder(AccessKeyState defaults) {
            $ = new AccessKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId The ID of the access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId The ID of the access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param creationDate The date and time (UTC) of creation of the access key.
         * 
         * @return builder
         * 
         */
        public Builder creationDate(@Nullable Output<String> creationDate) {
            $.creationDate = creationDate;
            return this;
        }

        /**
         * @param creationDate The date and time (UTC) of creation of the access key.
         * 
         * @return builder
         * 
         */
        public Builder creationDate(String creationDate) {
            return creationDate(Output.of(creationDate));
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
         * @param lastModificationDate The date and time (UTC) of the last modification of the access key.
         * 
         * @return builder
         * 
         */
        public Builder lastModificationDate(@Nullable Output<String> lastModificationDate) {
            $.lastModificationDate = lastModificationDate;
            return this;
        }

        /**
         * @param lastModificationDate The date and time (UTC) of the last modification of the access key.
         * 
         * @return builder
         * 
         */
        public Builder lastModificationDate(String lastModificationDate) {
            return lastModificationDate(Output.of(lastModificationDate));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param secretKey The access key that enables you to send requests.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The access key that enables you to send requests.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
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

        public AccessKeyState build() {
            return $;
        }
    }

}
