// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFlexibleGpuCatalogFlexibleGpuCatalog {
    /**
     * @return The generations of VMs that the fGPU is compatible with.
     * 
     */
    private List<String> generations;
    /**
     * @return The maximum number of VM vCores that the fGPU is compatible with.
     * 
     */
    private Integer maxCpu;
    /**
     * @return The maximum amount of VM memory that the fGPU is compatible with.
     * 
     */
    private Integer maxRam;
    /**
     * @return The model of fGPU.
     * 
     */
    private String modelName;
    /**
     * @return The amount of video RAM (VRAM) of the fGPU.
     * 
     */
    private Integer vRam;

    private GetFlexibleGpuCatalogFlexibleGpuCatalog() {}
    /**
     * @return The generations of VMs that the fGPU is compatible with.
     * 
     */
    public List<String> generations() {
        return this.generations;
    }
    /**
     * @return The maximum number of VM vCores that the fGPU is compatible with.
     * 
     */
    public Integer maxCpu() {
        return this.maxCpu;
    }
    /**
     * @return The maximum amount of VM memory that the fGPU is compatible with.
     * 
     */
    public Integer maxRam() {
        return this.maxRam;
    }
    /**
     * @return The model of fGPU.
     * 
     */
    public String modelName() {
        return this.modelName;
    }
    /**
     * @return The amount of video RAM (VRAM) of the fGPU.
     * 
     */
    public Integer vRam() {
        return this.vRam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlexibleGpuCatalogFlexibleGpuCatalog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> generations;
        private Integer maxCpu;
        private Integer maxRam;
        private String modelName;
        private Integer vRam;
        public Builder() {}
        public Builder(GetFlexibleGpuCatalogFlexibleGpuCatalog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.generations = defaults.generations;
    	      this.maxCpu = defaults.maxCpu;
    	      this.maxRam = defaults.maxRam;
    	      this.modelName = defaults.modelName;
    	      this.vRam = defaults.vRam;
        }

        @CustomType.Setter
        public Builder generations(List<String> generations) {
            this.generations = Objects.requireNonNull(generations);
            return this;
        }
        public Builder generations(String... generations) {
            return generations(List.of(generations));
        }
        @CustomType.Setter
        public Builder maxCpu(Integer maxCpu) {
            this.maxCpu = Objects.requireNonNull(maxCpu);
            return this;
        }
        @CustomType.Setter
        public Builder maxRam(Integer maxRam) {
            this.maxRam = Objects.requireNonNull(maxRam);
            return this;
        }
        @CustomType.Setter
        public Builder modelName(String modelName) {
            this.modelName = Objects.requireNonNull(modelName);
            return this;
        }
        @CustomType.Setter
        public Builder vRam(Integer vRam) {
            this.vRam = Objects.requireNonNull(vRam);
            return this;
        }
        public GetFlexibleGpuCatalogFlexibleGpuCatalog build() {
            final var o = new GetFlexibleGpuCatalogFlexibleGpuCatalog();
            o.generations = generations;
            o.maxCpu = maxCpu;
            o.maxRam = maxRam;
            o.modelName = modelName;
            o.vRam = vRam;
            return o;
        }
    }
}