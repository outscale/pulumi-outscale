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


public final class FlexibleGpuArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleGpuArgs Empty = new FlexibleGpuArgs();

    /**
     * If true, the fGPU is deleted when the VM is terminated.
     * 
     */
    @Import(name="deleteOnVmDeletion")
    private @Nullable Output<Boolean> deleteOnVmDeletion;

    /**
     * @return If true, the fGPU is deleted when the VM is terminated.
     * 
     */
    public Optional<Output<Boolean>> deleteOnVmDeletion() {
        return Optional.ofNullable(this.deleteOnVmDeletion);
    }

    /**
     * The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    /**
     * @return The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
     * 
     */
    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     * 
     */
    @Import(name="modelName", required=true)
    private Output<String> modelName;

    /**
     * @return The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     * 
     */
    public Output<String> modelName() {
        return this.modelName;
    }

    /**
     * The Subregion in which you want to create the fGPU.
     * 
     */
    @Import(name="subregionName", required=true)
    private Output<String> subregionName;

    /**
     * @return The Subregion in which you want to create the fGPU.
     * 
     */
    public Output<String> subregionName() {
        return this.subregionName;
    }

    private FlexibleGpuArgs() {}

    private FlexibleGpuArgs(FlexibleGpuArgs $) {
        this.deleteOnVmDeletion = $.deleteOnVmDeletion;
        this.generation = $.generation;
        this.modelName = $.modelName;
        this.subregionName = $.subregionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleGpuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleGpuArgs $;

        public Builder() {
            $ = new FlexibleGpuArgs();
        }

        public Builder(FlexibleGpuArgs defaults) {
            $ = new FlexibleGpuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteOnVmDeletion If true, the fGPU is deleted when the VM is terminated.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnVmDeletion(@Nullable Output<Boolean> deleteOnVmDeletion) {
            $.deleteOnVmDeletion = deleteOnVmDeletion;
            return this;
        }

        /**
         * @param deleteOnVmDeletion If true, the fGPU is deleted when the VM is terminated.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
            return deleteOnVmDeletion(Output.of(deleteOnVmDeletion));
        }

        /**
         * @param generation The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](https://docs.outscale.com/api#readflexiblegpucatalog) for the specified model of fGPU).
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param modelName The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
         * 
         * @return builder
         * 
         */
        public Builder modelName(Output<String> modelName) {
            $.modelName = modelName;
            return this;
        }

        /**
         * @param modelName The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
         * 
         * @return builder
         * 
         */
        public Builder modelName(String modelName) {
            return modelName(Output.of(modelName));
        }

        /**
         * @param subregionName The Subregion in which you want to create the fGPU.
         * 
         * @return builder
         * 
         */
        public Builder subregionName(Output<String> subregionName) {
            $.subregionName = subregionName;
            return this;
        }

        /**
         * @param subregionName The Subregion in which you want to create the fGPU.
         * 
         * @return builder
         * 
         */
        public Builder subregionName(String subregionName) {
            return subregionName(Output.of(subregionName));
        }

        public FlexibleGpuArgs build() {
            $.modelName = Objects.requireNonNull($.modelName, "expected parameter 'modelName' to be non-null");
            $.subregionName = Objects.requireNonNull($.subregionName, "expected parameter 'subregionName' to be non-null");
            return $;
        }
    }

}
