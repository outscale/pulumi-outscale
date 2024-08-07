// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.VmBlockDeviceMappingsCreatedBsusTag;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VmBlockDeviceMappingsCreatedBsus {
    /**
     * @return If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
     * 
     */
    private @Nullable Boolean deleteOnVmDeletion;
    /**
     * @return The date and time of attachment of the volume to the VM, in ISO 8601 date-time format.
     * 
     */
    private @Nullable String linkDate;
    /**
     * @return The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
     * 
     */
    private @Nullable String state;
    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    private @Nullable List<VmBlockDeviceMappingsCreatedBsusTag> tags;
    /**
     * @return The ID of the volume.
     * 
     */
    private @Nullable String volumeId;

    private VmBlockDeviceMappingsCreatedBsus() {}
    /**
     * @return If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](https://docs.outscale.com/api#updatenic).
     * 
     */
    public Optional<Boolean> deleteOnVmDeletion() {
        return Optional.ofNullable(this.deleteOnVmDeletion);
    }
    /**
     * @return The date and time of attachment of the volume to the VM, in ISO 8601 date-time format.
     * 
     */
    public Optional<String> linkDate() {
        return Optional.ofNullable(this.linkDate);
    }
    /**
     * @return The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public List<VmBlockDeviceMappingsCreatedBsusTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The ID of the volume.
     * 
     */
    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmBlockDeviceMappingsCreatedBsus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deleteOnVmDeletion;
        private @Nullable String linkDate;
        private @Nullable String state;
        private @Nullable List<VmBlockDeviceMappingsCreatedBsusTag> tags;
        private @Nullable String volumeId;
        public Builder() {}
        public Builder(VmBlockDeviceMappingsCreatedBsus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnVmDeletion = defaults.deleteOnVmDeletion;
    	      this.linkDate = defaults.linkDate;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.volumeId = defaults.volumeId;
        }

        @CustomType.Setter
        public Builder deleteOnVmDeletion(@Nullable Boolean deleteOnVmDeletion) {
            this.deleteOnVmDeletion = deleteOnVmDeletion;
            return this;
        }
        @CustomType.Setter
        public Builder linkDate(@Nullable String linkDate) {
            this.linkDate = linkDate;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<VmBlockDeviceMappingsCreatedBsusTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(VmBlockDeviceMappingsCreatedBsusTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public VmBlockDeviceMappingsCreatedBsus build() {
            final var o = new VmBlockDeviceMappingsCreatedBsus();
            o.deleteOnVmDeletion = deleteOnVmDeletion;
            o.linkDate = linkDate;
            o.state = state;
            o.tags = tags;
            o.volumeId = volumeId;
            return o;
        }
    }
}
