// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.VmBlockDeviceMappingsCreatedBsusTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VmBlockDeviceMappingsCreatedBsusArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmBlockDeviceMappingsCreatedBsusArgs Empty = new VmBlockDeviceMappingsCreatedBsusArgs();

    /**
     * If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
     * 
     */
    @Import(name="deleteOnVmDeletion")
    private @Nullable Output<Boolean> deleteOnVmDeletion;

    /**
     * @return If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
     * 
     */
    public Optional<Output<Boolean>> deleteOnVmDeletion() {
        return Optional.ofNullable(this.deleteOnVmDeletion);
    }

    /**
     * The date and time of attachment of the volume to the VM, in ISO 8601 date-time format.
     * 
     */
    @Import(name="linkDate")
    private @Nullable Output<String> linkDate;

    /**
     * @return The date and time of attachment of the volume to the VM, in ISO 8601 date-time format.
     * 
     */
    public Optional<Output<String>> linkDate() {
        return Optional.ofNullable(this.linkDate);
    }

    /**
     * The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<VmBlockDeviceMappingsCreatedBsusTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<VmBlockDeviceMappingsCreatedBsusTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the volume.
     * 
     */
    @Import(name="volumeId")
    private @Nullable Output<String> volumeId;

    /**
     * @return The ID of the volume.
     * 
     */
    public Optional<Output<String>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    private VmBlockDeviceMappingsCreatedBsusArgs() {}

    private VmBlockDeviceMappingsCreatedBsusArgs(VmBlockDeviceMappingsCreatedBsusArgs $) {
        this.deleteOnVmDeletion = $.deleteOnVmDeletion;
        this.linkDate = $.linkDate;
        this.state = $.state;
        this.tags = $.tags;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmBlockDeviceMappingsCreatedBsusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmBlockDeviceMappingsCreatedBsusArgs $;

        public Builder() {
            $ = new VmBlockDeviceMappingsCreatedBsusArgs();
        }

        public Builder(VmBlockDeviceMappingsCreatedBsusArgs defaults) {
            $ = new VmBlockDeviceMappingsCreatedBsusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteOnVmDeletion If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
         * 
         * @return builder
         * 
         */
        public Builder deleteOnVmDeletion(@Nullable Output<Boolean> deleteOnVmDeletion) {
            $.deleteOnVmDeletion = deleteOnVmDeletion;
            return this;
        }

        /**
         * @param deleteOnVmDeletion If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
         * 
         * @return builder
         * 
         */
        public Builder deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
            return deleteOnVmDeletion(Output.of(deleteOnVmDeletion));
        }

        /**
         * @param linkDate The date and time of attachment of the volume to the VM, in ISO 8601 date-time format.
         * 
         * @return builder
         * 
         */
        public Builder linkDate(@Nullable Output<String> linkDate) {
            $.linkDate = linkDate;
            return this;
        }

        /**
         * @param linkDate The date and time of attachment of the volume to the VM, in ISO 8601 date-time format.
         * 
         * @return builder
         * 
         */
        public Builder linkDate(String linkDate) {
            return linkDate(Output.of(linkDate));
        }

        /**
         * @param state The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<VmBlockDeviceMappingsCreatedBsusTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<VmBlockDeviceMappingsCreatedBsusTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(VmBlockDeviceMappingsCreatedBsusTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param volumeId The ID of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(@Nullable Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId The ID of the volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public VmBlockDeviceMappingsCreatedBsusArgs build() {
            return $;
        }
    }

}