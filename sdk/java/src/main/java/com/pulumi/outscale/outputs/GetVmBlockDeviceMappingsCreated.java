// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetVmBlockDeviceMappingsCreatedBsus;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVmBlockDeviceMappingsCreated {
    /**
     * @return Information about the created BSU volume.
     * 
     */
    private List<GetVmBlockDeviceMappingsCreatedBsus> bsus;
    /**
     * @return The name of the device.
     * 
     */
    private String deviceName;

    private GetVmBlockDeviceMappingsCreated() {}
    /**
     * @return Information about the created BSU volume.
     * 
     */
    public List<GetVmBlockDeviceMappingsCreatedBsus> bsus() {
        return this.bsus;
    }
    /**
     * @return The name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmBlockDeviceMappingsCreated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVmBlockDeviceMappingsCreatedBsus> bsus;
        private String deviceName;
        public Builder() {}
        public Builder(GetVmBlockDeviceMappingsCreated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bsus = defaults.bsus;
    	      this.deviceName = defaults.deviceName;
        }

        @CustomType.Setter
        public Builder bsus(List<GetVmBlockDeviceMappingsCreatedBsus> bsus) {
            this.bsus = Objects.requireNonNull(bsus);
            return this;
        }
        public Builder bsus(GetVmBlockDeviceMappingsCreatedBsus... bsus) {
            return bsus(List.of(bsus));
        }
        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public GetVmBlockDeviceMappingsCreated build() {
            final var o = new GetVmBlockDeviceMappingsCreated();
            o.bsus = bsus;
            o.deviceName = deviceName;
            return o;
        }
    }
}
