// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumesLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumesLinkArgs Empty = new VolumesLinkArgs();

    @Import(name="deleteOnVmTermination")
    private @Nullable Output<Boolean> deleteOnVmTermination;

    public Optional<Output<Boolean>> deleteOnVmTermination() {
        return Optional.ofNullable(this.deleteOnVmTermination);
    }

    /**
     * The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    @Import(name="forceUnlink")
    private @Nullable Output<Boolean> forceUnlink;

    public Optional<Output<Boolean>> forceUnlink() {
        return Optional.ofNullable(this.forceUnlink);
    }

    /**
     * The ID of the VM you want to attach the volume to.
     * 
     */
    @Import(name="vmId", required=true)
    private Output<String> vmId;

    /**
     * @return The ID of the VM you want to attach the volume to.
     * 
     */
    public Output<String> vmId() {
        return this.vmId;
    }

    /**
     * The ID of the volume you want to attach.
     * 
     */
    @Import(name="volumeId", required=true)
    private Output<String> volumeId;

    /**
     * @return The ID of the volume you want to attach.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    private VolumesLinkArgs() {}

    private VolumesLinkArgs(VolumesLinkArgs $) {
        this.deleteOnVmTermination = $.deleteOnVmTermination;
        this.deviceName = $.deviceName;
        this.forceUnlink = $.forceUnlink;
        this.vmId = $.vmId;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumesLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumesLinkArgs $;

        public Builder() {
            $ = new VolumesLinkArgs();
        }

        public Builder(VolumesLinkArgs defaults) {
            $ = new VolumesLinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteOnVmTermination(@Nullable Output<Boolean> deleteOnVmTermination) {
            $.deleteOnVmTermination = deleteOnVmTermination;
            return this;
        }

        public Builder deleteOnVmTermination(Boolean deleteOnVmTermination) {
            return deleteOnVmTermination(Output.of(deleteOnVmTermination));
        }

        /**
         * @param deviceName The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder forceUnlink(@Nullable Output<Boolean> forceUnlink) {
            $.forceUnlink = forceUnlink;
            return this;
        }

        public Builder forceUnlink(Boolean forceUnlink) {
            return forceUnlink(Output.of(forceUnlink));
        }

        /**
         * @param vmId The ID of the VM you want to attach the volume to.
         * 
         * @return builder
         * 
         */
        public Builder vmId(Output<String> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The ID of the VM you want to attach the volume to.
         * 
         * @return builder
         * 
         */
        public Builder vmId(String vmId) {
            return vmId(Output.of(vmId));
        }

        /**
         * @param volumeId The ID of the volume you want to attach.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId The ID of the volume you want to attach.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public VolumesLinkArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.vmId = Objects.requireNonNull($.vmId, "expected parameter 'vmId' to be non-null");
            $.volumeId = Objects.requireNonNull($.volumeId, "expected parameter 'volumeId' to be non-null");
            return $;
        }
    }

}
