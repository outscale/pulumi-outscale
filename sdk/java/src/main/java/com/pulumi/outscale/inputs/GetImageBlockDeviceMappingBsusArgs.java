// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetImageBlockDeviceMappingBsusArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImageBlockDeviceMappingBsusArgs Empty = new GetImageBlockDeviceMappingBsusArgs();

    /**
     * By default or if set to true, the volume is deleted when terminating the VM. If false, the volume is not deleted when terminating the VM.
     * 
     */
    @Import(name="deleteOnVmDeletion", required=true)
    private Output<Boolean> deleteOnVmDeletion;

    /**
     * @return By default or if set to true, the volume is deleted when terminating the VM. If false, the volume is not deleted when terminating the VM.
     * 
     */
    public Output<Boolean> deleteOnVmDeletion() {
        return this.deleteOnVmDeletion;
    }

    /**
     * The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
     * 
     */
    @Import(name="iops", required=true)
    private Output<Integer> iops;

    /**
     * @return The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
     * 
     */
    public Output<Integer> iops() {
        return this.iops;
    }

    /**
     * The ID of the snapshot used to create the volume.
     * 
     */
    @Import(name="snapshotId", required=true)
    private Output<String> snapshotId;

    /**
     * @return The ID of the snapshot used to create the volume.
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }

    /**
     * The size of the volume, in gibibytes (GiB).&lt;br /&gt;
     * If you specify a snapshot ID, the volume size must be at least equal to the snapshot size.&lt;br /&gt;
     * If you specify a snapshot ID but no volume size, the volume is created with a size similar to the snapshot one.
     * 
     */
    @Import(name="volumeSize", required=true)
    private Output<Integer> volumeSize;

    /**
     * @return The size of the volume, in gibibytes (GiB).&lt;br /&gt;
     * If you specify a snapshot ID, the volume size must be at least equal to the snapshot size.&lt;br /&gt;
     * If you specify a snapshot ID but no volume size, the volume is created with a size similar to the snapshot one.
     * 
     */
    public Output<Integer> volumeSize() {
        return this.volumeSize;
    }

    /**
     * The type of the volume (`standard` \| `io1` \| `gp2`). If not specified in the request, a `standard` volume is created.&lt;br /&gt;
     * For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
     * 
     */
    @Import(name="volumeType", required=true)
    private Output<String> volumeType;

    /**
     * @return The type of the volume (`standard` \| `io1` \| `gp2`). If not specified in the request, a `standard` volume is created.&lt;br /&gt;
     * For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
     * 
     */
    public Output<String> volumeType() {
        return this.volumeType;
    }

    private GetImageBlockDeviceMappingBsusArgs() {}

    private GetImageBlockDeviceMappingBsusArgs(GetImageBlockDeviceMappingBsusArgs $) {
        this.deleteOnVmDeletion = $.deleteOnVmDeletion;
        this.iops = $.iops;
        this.snapshotId = $.snapshotId;
        this.volumeSize = $.volumeSize;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageBlockDeviceMappingBsusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageBlockDeviceMappingBsusArgs $;

        public Builder() {
            $ = new GetImageBlockDeviceMappingBsusArgs();
        }

        public Builder(GetImageBlockDeviceMappingBsusArgs defaults) {
            $ = new GetImageBlockDeviceMappingBsusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteOnVmDeletion By default or if set to true, the volume is deleted when terminating the VM. If false, the volume is not deleted when terminating the VM.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnVmDeletion(Output<Boolean> deleteOnVmDeletion) {
            $.deleteOnVmDeletion = deleteOnVmDeletion;
            return this;
        }

        /**
         * @param deleteOnVmDeletion By default or if set to true, the volume is deleted when terminating the VM. If false, the volume is not deleted when terminating the VM.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
            return deleteOnVmDeletion(Output.of(deleteOnVmDeletion));
        }

        /**
         * @param iops The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
         * 
         * @return builder
         * 
         */
        public Builder iops(Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param snapshotId The ID of the snapshot used to create the volume.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The ID of the snapshot used to create the volume.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param volumeSize The size of the volume, in gibibytes (GiB).&lt;br /&gt;
         * If you specify a snapshot ID, the volume size must be at least equal to the snapshot size.&lt;br /&gt;
         * If you specify a snapshot ID but no volume size, the volume is created with a size similar to the snapshot one.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(Output<Integer> volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        /**
         * @param volumeSize The size of the volume, in gibibytes (GiB).&lt;br /&gt;
         * If you specify a snapshot ID, the volume size must be at least equal to the snapshot size.&lt;br /&gt;
         * If you specify a snapshot ID but no volume size, the volume is created with a size similar to the snapshot one.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(Integer volumeSize) {
            return volumeSize(Output.of(volumeSize));
        }

        /**
         * @param volumeType The type of the volume (`standard` \| `io1` \| `gp2`). If not specified in the request, a `standard` volume is created.&lt;br /&gt;
         * For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
         * 
         * @return builder
         * 
         */
        public Builder volumeType(Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        /**
         * @param volumeType The type of the volume (`standard` \| `io1` \| `gp2`). If not specified in the request, a `standard` volume is created.&lt;br /&gt;
         * For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public GetImageBlockDeviceMappingBsusArgs build() {
            $.deleteOnVmDeletion = Objects.requireNonNull($.deleteOnVmDeletion, "expected parameter 'deleteOnVmDeletion' to be non-null");
            $.iops = Objects.requireNonNull($.iops, "expected parameter 'iops' to be non-null");
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            $.volumeSize = Objects.requireNonNull($.volumeSize, "expected parameter 'volumeSize' to be non-null");
            $.volumeType = Objects.requireNonNull($.volumeType, "expected parameter 'volumeType' to be non-null");
            return $;
        }
    }

}
