// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccessKeysAccessKey {
    /**
     * @return The ID of the access key.
     * 
     */
    private String accessKeyId;
    /**
     * @return The date and time (UTC) of creation of the access key.
     * 
     */
    private String creationDate;
    /**
     * @return The date (UTC) at which the access key expires.
     * 
     */
    private String expirationDate;
    /**
     * @return The date and time (UTC) of the last modification of the access key.
     * 
     */
    private String lastModificationDate;
    /**
     * @return The state of the access key (`ACTIVE` if the key is valid for API calls, or `INACTIVE` if not).
     * 
     */
    private String state;

    private GetAccessKeysAccessKey() {}
    /**
     * @return The ID of the access key.
     * 
     */
    public String accessKeyId() {
        return this.accessKeyId;
    }
    /**
     * @return The date and time (UTC) of creation of the access key.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return The date (UTC) at which the access key expires.
     * 
     */
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * @return The date and time (UTC) of the last modification of the access key.
     * 
     */
    public String lastModificationDate() {
        return this.lastModificationDate;
    }
    /**
     * @return The state of the access key (`ACTIVE` if the key is valid for API calls, or `INACTIVE` if not).
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessKeysAccessKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKeyId;
        private String creationDate;
        private String expirationDate;
        private String lastModificationDate;
        private String state;
        public Builder() {}
        public Builder(GetAccessKeysAccessKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.creationDate = defaults.creationDate;
    	      this.expirationDate = defaults.expirationDate;
    	      this.lastModificationDate = defaults.lastModificationDate;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        @CustomType.Setter
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }
        @CustomType.Setter
        public Builder lastModificationDate(String lastModificationDate) {
            this.lastModificationDate = Objects.requireNonNull(lastModificationDate);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetAccessKeysAccessKey build() {
            final var o = new GetAccessKeysAccessKey();
            o.accessKeyId = accessKeyId;
            o.creationDate = creationDate;
            o.expirationDate = expirationDate;
            o.lastModificationDate = lastModificationDate;
            o.state = state;
            return o;
        }
    }
}
