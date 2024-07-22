// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetFlexibleGpuFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetFlexibleGpuResult {
    /**
     * @return If true, the fGPU is deleted when the VM is terminated.
     * 
     */
    private Boolean deleteOnVmDeletion;
    private @Nullable List<GetFlexibleGpuFilter> filters;
    /**
     * @return The ID of the fGPU.
     * 
     */
    private String flexibleGpuId;
    /**
     * @return The compatible processor generation.
     * 
     */
    private String generation;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The model of fGPU. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     * 
     */
    private String modelName;
    private String requestId;
    /**
     * @return The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
     * 
     */
    private String state;
    /**
     * @return The Subregion where the fGPU is located.
     * 
     */
    private String subregionName;
    /**
     * @return The ID of the VM the fGPU is attached to, if any.
     * 
     */
    private String vmId;

    private GetFlexibleGpuResult() {}
    /**
     * @return If true, the fGPU is deleted when the VM is terminated.
     * 
     */
    public Boolean deleteOnVmDeletion() {
        return this.deleteOnVmDeletion;
    }
    public List<GetFlexibleGpuFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The ID of the fGPU.
     * 
     */
    public String flexibleGpuId() {
        return this.flexibleGpuId;
    }
    /**
     * @return The compatible processor generation.
     * 
     */
    public String generation() {
        return this.generation;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The model of fGPU. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     * 
     */
    public String modelName() {
        return this.modelName;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The Subregion where the fGPU is located.
     * 
     */
    public String subregionName() {
        return this.subregionName;
    }
    /**
     * @return The ID of the VM the fGPU is attached to, if any.
     * 
     */
    public String vmId() {
        return this.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlexibleGpuResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deleteOnVmDeletion;
        private @Nullable List<GetFlexibleGpuFilter> filters;
        private String flexibleGpuId;
        private String generation;
        private String id;
        private String modelName;
        private String requestId;
        private String state;
        private String subregionName;
        private String vmId;
        public Builder() {}
        public Builder(GetFlexibleGpuResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnVmDeletion = defaults.deleteOnVmDeletion;
    	      this.filters = defaults.filters;
    	      this.flexibleGpuId = defaults.flexibleGpuId;
    	      this.generation = defaults.generation;
    	      this.id = defaults.id;
    	      this.modelName = defaults.modelName;
    	      this.requestId = defaults.requestId;
    	      this.state = defaults.state;
    	      this.subregionName = defaults.subregionName;
    	      this.vmId = defaults.vmId;
        }

        @CustomType.Setter
        public Builder deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
            this.deleteOnVmDeletion = Objects.requireNonNull(deleteOnVmDeletion);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetFlexibleGpuFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetFlexibleGpuFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder flexibleGpuId(String flexibleGpuId) {
            this.flexibleGpuId = Objects.requireNonNull(flexibleGpuId);
            return this;
        }
        @CustomType.Setter
        public Builder generation(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder modelName(String modelName) {
            this.modelName = Objects.requireNonNull(modelName);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
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
        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public GetFlexibleGpuResult build() {
            final var o = new GetFlexibleGpuResult();
            o.deleteOnVmDeletion = deleteOnVmDeletion;
            o.filters = filters;
            o.flexibleGpuId = flexibleGpuId;
            o.generation = generation;
            o.id = id;
            o.modelName = modelName;
            o.requestId = requestId;
            o.state = state;
            o.subregionName = subregionName;
            o.vmId = vmId;
            return o;
        }
    }
}
