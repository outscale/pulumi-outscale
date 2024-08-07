// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVmStatesVmStateMaintenanceEvent {
    /**
     * @return The code of the event (`system-reboot` \| `system-maintenance`).
     * 
     */
    private String code;
    /**
     * @return The description of the event.
     * 
     */
    private String description;
    /**
     * @return The latest scheduled end time for the event.
     * 
     */
    private String notAfter;
    /**
     * @return The earliest scheduled start time for the event.
     * 
     */
    private String notBefore;

    private GetVmStatesVmStateMaintenanceEvent() {}
    /**
     * @return The code of the event (`system-reboot` \| `system-maintenance`).
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return The description of the event.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The latest scheduled end time for the event.
     * 
     */
    public String notAfter() {
        return this.notAfter;
    }
    /**
     * @return The earliest scheduled start time for the event.
     * 
     */
    public String notBefore() {
        return this.notBefore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmStatesVmStateMaintenanceEvent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String code;
        private String description;
        private String notAfter;
        private String notBefore;
        public Builder() {}
        public Builder(GetVmStatesVmStateMaintenanceEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.description = defaults.description;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
        }

        @CustomType.Setter
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder notAfter(String notAfter) {
            this.notAfter = Objects.requireNonNull(notAfter);
            return this;
        }
        @CustomType.Setter
        public Builder notBefore(String notBefore) {
            this.notBefore = Objects.requireNonNull(notBefore);
            return this;
        }
        public GetVmStatesVmStateMaintenanceEvent build() {
            final var o = new GetVmStatesVmStateMaintenanceEvent();
            o.code = code;
            o.description = description;
            o.notAfter = notAfter;
            o.notBefore = notBefore;
            return o;
        }
    }
}
