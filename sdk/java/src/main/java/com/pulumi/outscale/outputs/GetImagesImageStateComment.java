// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagesImageStateComment {
    /**
     * @return The code of the change of state.
     * 
     */
    private String stateCode;
    /**
     * @return A message explaining the change of state.
     * 
     */
    private String stateMessage;

    private GetImagesImageStateComment() {}
    /**
     * @return The code of the change of state.
     * 
     */
    public String stateCode() {
        return this.stateCode;
    }
    /**
     * @return A message explaining the change of state.
     * 
     */
    public String stateMessage() {
        return this.stateMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesImageStateComment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String stateCode;
        private String stateMessage;
        public Builder() {}
        public Builder(GetImagesImageStateComment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stateCode = defaults.stateCode;
    	      this.stateMessage = defaults.stateMessage;
        }

        @CustomType.Setter
        public Builder stateCode(String stateCode) {
            this.stateCode = Objects.requireNonNull(stateCode);
            return this;
        }
        @CustomType.Setter
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }
        public GetImagesImageStateComment build() {
            final var o = new GetImagesImageStateComment();
            o.stateCode = stateCode;
            o.stateMessage = stateMessage;
            return o;
        }
    }
}
