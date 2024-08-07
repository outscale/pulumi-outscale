// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetVolumeFilter;
import com.pulumi.outscale.outputs.GetVolumeLinkedVolume;
import com.pulumi.outscale.outputs.GetVolumeTag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVolumeResult {
    /**
     * @return The date and time of creation of the volume.
     * 
     */
    private String creationDate;
    private @Nullable List<GetVolumeFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The number of I/O operations per second (IOPS):&lt;br /&gt;- For `io1` volumes, the number of provisioned IOPS.&lt;br /&gt;- For `gp2` volumes, the baseline performance of the volume.
     * 
     */
    private Integer iops;
    /**
     * @return Information about your volume attachment.
     * 
     */
    private List<GetVolumeLinkedVolume> linkedVolumes;
    private @Nullable String requestId;
    /**
     * @return The size of the volume, in gibibytes (GiB).
     * 
     */
    private Integer size;
    /**
     * @return The snapshot from which the volume was created.
     * 
     */
    private String snapshotId;
    /**
     * @return The state of the volume (`creating` \| `available` \| `in-use` \| `updating` \| `deleting` \| `error`).
     * 
     */
    private String state;
    /**
     * @return The Subregion in which the volume was created.
     * 
     */
    private String subregionName;
    /**
     * @return One or more tags associated with the volume.
     * 
     */
    private List<GetVolumeTag> tags;
    /**
     * @return The ID of the volume.
     * 
     */
    private @Nullable String volumeId;
    /**
     * @return The type of the volume (`standard` \| `gp2` \| `io1`).
     * 
     */
    private String volumeType;

    private GetVolumeResult() {}
    /**
     * @return The date and time of creation of the volume.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    public List<GetVolumeFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The number of I/O operations per second (IOPS):&lt;br /&gt;- For `io1` volumes, the number of provisioned IOPS.&lt;br /&gt;- For `gp2` volumes, the baseline performance of the volume.
     * 
     */
    public Integer iops() {
        return this.iops;
    }
    /**
     * @return Information about your volume attachment.
     * 
     */
    public List<GetVolumeLinkedVolume> linkedVolumes() {
        return this.linkedVolumes;
    }
    public Optional<String> requestId() {
        return Optional.ofNullable(this.requestId);
    }
    /**
     * @return The size of the volume, in gibibytes (GiB).
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The snapshot from which the volume was created.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * @return The state of the volume (`creating` \| `available` \| `in-use` \| `updating` \| `deleting` \| `error`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The Subregion in which the volume was created.
     * 
     */
    public String subregionName() {
        return this.subregionName;
    }
    /**
     * @return One or more tags associated with the volume.
     * 
     */
    public List<GetVolumeTag> tags() {
        return this.tags;
    }
    /**
     * @return The ID of the volume.
     * 
     */
    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }
    /**
     * @return The type of the volume (`standard` \| `gp2` \| `io1`).
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String creationDate;
        private @Nullable List<GetVolumeFilter> filters;
        private String id;
        private Integer iops;
        private List<GetVolumeLinkedVolume> linkedVolumes;
        private @Nullable String requestId;
        private Integer size;
        private String snapshotId;
        private String state;
        private String subregionName;
        private List<GetVolumeTag> tags;
        private @Nullable String volumeId;
        private String volumeType;
        public Builder() {}
        public Builder(GetVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.iops = defaults.iops;
    	      this.linkedVolumes = defaults.linkedVolumes;
    	      this.requestId = defaults.requestId;
    	      this.size = defaults.size;
    	      this.snapshotId = defaults.snapshotId;
    	      this.state = defaults.state;
    	      this.subregionName = defaults.subregionName;
    	      this.tags = defaults.tags;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetVolumeFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVolumeFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        @CustomType.Setter
        public Builder linkedVolumes(List<GetVolumeLinkedVolume> linkedVolumes) {
            this.linkedVolumes = Objects.requireNonNull(linkedVolumes);
            return this;
        }
        public Builder linkedVolumes(GetVolumeLinkedVolume... linkedVolumes) {
            return linkedVolumes(List.of(linkedVolumes));
        }
        @CustomType.Setter
        public Builder requestId(@Nullable String requestId) {
            this.requestId = requestId;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subregionName(String subregionName) {
            this.subregionName = Objects.requireNonNull(subregionName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetVolumeTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetVolumeTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetVolumeResult build() {
            final var o = new GetVolumeResult();
            o.creationDate = creationDate;
            o.filters = filters;
            o.id = id;
            o.iops = iops;
            o.linkedVolumes = linkedVolumes;
            o.requestId = requestId;
            o.size = size;
            o.snapshotId = snapshotId;
            o.state = state;
            o.subregionName = subregionName;
            o.tags = tags;
            o.volumeId = volumeId;
            o.volumeType = volumeType;
            return o;
        }
    }
}
