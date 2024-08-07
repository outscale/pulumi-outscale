// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetInternetServicesInternetServiceTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInternetServicesInternetService {
    /**
     * @return The ID of the Internet service.
     * 
     */
    private String internetServiceId;
    /**
     * @return The ID of the Net attached to the Internet service.
     * 
     */
    private String netId;
    /**
     * @return The state of the attachment of the Internet service to the Net (always `available`).
     * 
     */
    private String state;
    /**
     * @return The key/value combinations of the tags associated with the Internet services, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    private List<GetInternetServicesInternetServiceTag> tags;

    private GetInternetServicesInternetService() {}
    /**
     * @return The ID of the Internet service.
     * 
     */
    public String internetServiceId() {
        return this.internetServiceId;
    }
    /**
     * @return The ID of the Net attached to the Internet service.
     * 
     */
    public String netId() {
        return this.netId;
    }
    /**
     * @return The state of the attachment of the Internet service to the Net (always `available`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The key/value combinations of the tags associated with the Internet services, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    public List<GetInternetServicesInternetServiceTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInternetServicesInternetService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String internetServiceId;
        private String netId;
        private String state;
        private List<GetInternetServicesInternetServiceTag> tags;
        public Builder() {}
        public Builder(GetInternetServicesInternetService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internetServiceId = defaults.internetServiceId;
    	      this.netId = defaults.netId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder internetServiceId(String internetServiceId) {
            this.internetServiceId = Objects.requireNonNull(internetServiceId);
            return this;
        }
        @CustomType.Setter
        public Builder netId(String netId) {
            this.netId = Objects.requireNonNull(netId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetInternetServicesInternetServiceTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetInternetServicesInternetServiceTag... tags) {
            return tags(List.of(tags));
        }
        public GetInternetServicesInternetService build() {
            final var o = new GetInternetServicesInternetService();
            o.internetServiceId = internetServiceId;
            o.netId = netId;
            o.state = state;
            o.tags = tags;
            return o;
        }
    }
}
