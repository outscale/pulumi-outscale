// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnapshotExportTaskOsuExport {
    /**
     * @return The format of the export disk (`qcow2` \| `raw`).
     * 
     */
    private String diskImageFormat;
    /**
     * @return The name of the OOS bucket the snapshot is exported to.
     * 
     */
    private String osuBucket;
    /**
     * @return The prefix for the key of the OOS object corresponding to the snapshot.
     * 
     */
    private String osuPrefix;

    private GetSnapshotExportTaskOsuExport() {}
    /**
     * @return The format of the export disk (`qcow2` \| `raw`).
     * 
     */
    public String diskImageFormat() {
        return this.diskImageFormat;
    }
    /**
     * @return The name of the OOS bucket the snapshot is exported to.
     * 
     */
    public String osuBucket() {
        return this.osuBucket;
    }
    /**
     * @return The prefix for the key of the OOS object corresponding to the snapshot.
     * 
     */
    public String osuPrefix() {
        return this.osuPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotExportTaskOsuExport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String diskImageFormat;
        private String osuBucket;
        private String osuPrefix;
        public Builder() {}
        public Builder(GetSnapshotExportTaskOsuExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskImageFormat = defaults.diskImageFormat;
    	      this.osuBucket = defaults.osuBucket;
    	      this.osuPrefix = defaults.osuPrefix;
        }

        @CustomType.Setter
        public Builder diskImageFormat(String diskImageFormat) {
            this.diskImageFormat = Objects.requireNonNull(diskImageFormat);
            return this;
        }
        @CustomType.Setter
        public Builder osuBucket(String osuBucket) {
            this.osuBucket = Objects.requireNonNull(osuBucket);
            return this;
        }
        @CustomType.Setter
        public Builder osuPrefix(String osuPrefix) {
            this.osuPrefix = Objects.requireNonNull(osuPrefix);
            return this;
        }
        public GetSnapshotExportTaskOsuExport build() {
            final var o = new GetSnapshotExportTaskOsuExport();
            o.diskImageFormat = diskImageFormat;
            o.osuBucket = osuBucket;
            o.osuPrefix = osuPrefix;
            return o;
        }
    }
}
