// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumesLinkState extends com.pulumi.resources.ResourceArgs {

    public static final VolumesLinkState Empty = new VolumesLinkState();

    @Import(name="deleteOnVmTermination")
    private @Nullable Output<Boolean> deleteOnVmTermination;

    public Optional<Output<Boolean>> deleteOnVmTermination() {
        return Optional.ofNullable(this.deleteOnVmTermination);
    }

    /**
     * The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return The name of the device. For a root device, you must use `/dev/sda1`. For other volumes, you must use `/dev/sdX`, `/dev/sdXX`, `/dev/xvdX`, or `/dev/xvdXX` (where the first `X` is a letter between `b` and `z`, and the second `X` is a letter between `a` and `z`).
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    @Import(name="forceUnlink")
    private @Nullable Output<Boolean> forceUnlink;

    public Optional<Output<Boolean>> forceUnlink() {
        return Optional.ofNullable(this.forceUnlink);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The state of the attachment of the volume (`attaching` | `detaching` | `attached` | `detached`).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the attachment of the volume (`attaching` | `detaching` | `attached` | `detached`).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The ID of the VM you want to attach the volume to.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<String> vmId;

    /**
     * @return The ID of the VM you want to attach the volume to.
     * 
     */
    public Optional<Output<String>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    /**
     * The ID of the volume you want to attach.
     * 
     */
    @Import(name="volumeId")
    private @Nullable Output<String> volumeId;

    /**
     * @return The ID of the volume you want to attach.
     * 
     */
    public Optional<Output<String>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    private VolumesLinkState() {}

    private VolumesLinkState(VolumesLinkState $) {
        this.deleteOnVmTermination = $.deleteOnVmTermination;
        this.deviceName = $.deviceName;
        this.forceUnlink = $.forceUnlink;
        this.requestId = $.requestId;
        this.state = $.state;
        this.vmId = $.vmId;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumesLinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumesLinkState $;

        public Builder() {
            $ = new VolumesLinkState();
        }

        public Builder(VolumesLinkState defaults) {
            $ = new VolumesLinkState(Objects.requireNonNull(defaults));
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
        public Builder deviceName(@Nullable Output<String> deviceName) {
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

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param state The state of the attachment of the volume (`attaching` | `detaching` | `attached` | `detached`).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the attachment of the volume (`attaching` | `detaching` | `attached` | `detached`).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param vmId The ID of the VM you want to attach the volume to.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<String> vmId) {
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
        public Builder volumeId(@Nullable Output<String> volumeId) {
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

        public VolumesLinkState build() {
            return $;
        }
    }

}
