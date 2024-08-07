// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetImageBlockDeviceMappingBsusArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetImageBlockDeviceMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImageBlockDeviceMappingArgs Empty = new GetImageBlockDeviceMappingArgs();

    /**
     * Information about the BSU volume to create.
     * 
     */
    @Import(name="bsus", required=true)
    private Output<List<GetImageBlockDeviceMappingBsusArgs>> bsus;

    /**
     * @return Information about the BSU volume to create.
     * 
     */
    public Output<List<GetImageBlockDeviceMappingBsusArgs>> bsus() {
        return this.bsus;
    }

    /**
     * The device name for the volume. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The device name for the volume. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The name of the virtual device (`ephemeralN`).
     * 
     */
    @Import(name="virtualDeviceName", required=true)
    private Output<String> virtualDeviceName;

    /**
     * @return The name of the virtual device (`ephemeralN`).
     * 
     */
    public Output<String> virtualDeviceName() {
        return this.virtualDeviceName;
    }

    private GetImageBlockDeviceMappingArgs() {}

    private GetImageBlockDeviceMappingArgs(GetImageBlockDeviceMappingArgs $) {
        this.bsus = $.bsus;
        this.deviceName = $.deviceName;
        this.virtualDeviceName = $.virtualDeviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageBlockDeviceMappingArgs $;

        public Builder() {
            $ = new GetImageBlockDeviceMappingArgs();
        }

        public Builder(GetImageBlockDeviceMappingArgs defaults) {
            $ = new GetImageBlockDeviceMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bsus Information about the BSU volume to create.
         * 
         * @return builder
         * 
         */
        public Builder bsus(Output<List<GetImageBlockDeviceMappingBsusArgs>> bsus) {
            $.bsus = bsus;
            return this;
        }

        /**
         * @param bsus Information about the BSU volume to create.
         * 
         * @return builder
         * 
         */
        public Builder bsus(List<GetImageBlockDeviceMappingBsusArgs> bsus) {
            return bsus(Output.of(bsus));
        }

        /**
         * @param bsus Information about the BSU volume to create.
         * 
         * @return builder
         * 
         */
        public Builder bsus(GetImageBlockDeviceMappingBsusArgs... bsus) {
            return bsus(List.of(bsus));
        }

        /**
         * @param deviceName The device name for the volume. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The device name for the volume. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param virtualDeviceName The name of the virtual device (`ephemeralN`).
         * 
         * @return builder
         * 
         */
        public Builder virtualDeviceName(Output<String> virtualDeviceName) {
            $.virtualDeviceName = virtualDeviceName;
            return this;
        }

        /**
         * @param virtualDeviceName The name of the virtual device (`ephemeralN`).
         * 
         * @return builder
         * 
         */
        public Builder virtualDeviceName(String virtualDeviceName) {
            return virtualDeviceName(Output.of(virtualDeviceName));
        }

        public GetImageBlockDeviceMappingArgs build() {
            $.bsus = Objects.requireNonNull($.bsus, "expected parameter 'bsus' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.virtualDeviceName = Objects.requireNonNull($.virtualDeviceName, "expected parameter 'virtualDeviceName' to be non-null");
            return $;
        }
    }

}
