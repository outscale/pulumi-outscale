// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetPublicIpFilter;
import com.pulumi.outscale.outputs.GetPublicIpTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPublicIpResult {
    private @Nullable List<GetPublicIpFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
     * 
     */
    private String linkPublicIpId;
    /**
     * @return The account ID of the owner of the NIC.
     * 
     */
    private String nicAccountId;
    /**
     * @return The ID of the NIC the public IP is associated with (if any).
     * 
     */
    private String nicId;
    /**
     * @return The private IP associated with the public IP.
     * 
     */
    private String privateIp;
    /**
     * @return The public IP.
     * 
     */
    private String publicIp;
    /**
     * @return The allocation ID of the public IP.
     * 
     */
    private String publicIpId;
    private String requestId;
    /**
     * @return One or more tags associated with the public IP.
     * 
     */
    private List<GetPublicIpTag> tags;
    /**
     * @return The ID of the VM the public IP is associated with (if any).
     * 
     */
    private String vmId;

    private GetPublicIpResult() {}
    public List<GetPublicIpFilter> filters() {
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
     * @return (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
     * 
     */
    public String linkPublicIpId() {
        return this.linkPublicIpId;
    }
    /**
     * @return The account ID of the owner of the NIC.
     * 
     */
    public String nicAccountId() {
        return this.nicAccountId;
    }
    /**
     * @return The ID of the NIC the public IP is associated with (if any).
     * 
     */
    public String nicId() {
        return this.nicId;
    }
    /**
     * @return The private IP associated with the public IP.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return The public IP.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    /**
     * @return The allocation ID of the public IP.
     * 
     */
    public String publicIpId() {
        return this.publicIpId;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return One or more tags associated with the public IP.
     * 
     */
    public List<GetPublicIpTag> tags() {
        return this.tags;
    }
    /**
     * @return The ID of the VM the public IP is associated with (if any).
     * 
     */
    public String vmId() {
        return this.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIpResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetPublicIpFilter> filters;
        private String id;
        private String linkPublicIpId;
        private String nicAccountId;
        private String nicId;
        private String privateIp;
        private String publicIp;
        private String publicIpId;
        private String requestId;
        private List<GetPublicIpTag> tags;
        private String vmId;
        public Builder() {}
        public Builder(GetPublicIpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.linkPublicIpId = defaults.linkPublicIpId;
    	      this.nicAccountId = defaults.nicAccountId;
    	      this.nicId = defaults.nicId;
    	      this.privateIp = defaults.privateIp;
    	      this.publicIp = defaults.publicIp;
    	      this.publicIpId = defaults.publicIpId;
    	      this.requestId = defaults.requestId;
    	      this.tags = defaults.tags;
    	      this.vmId = defaults.vmId;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetPublicIpFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetPublicIpFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder linkPublicIpId(String linkPublicIpId) {
            this.linkPublicIpId = Objects.requireNonNull(linkPublicIpId);
            return this;
        }
        @CustomType.Setter
        public Builder nicAccountId(String nicAccountId) {
            this.nicAccountId = Objects.requireNonNull(nicAccountId);
            return this;
        }
        @CustomType.Setter
        public Builder nicId(String nicId) {
            this.nicId = Objects.requireNonNull(nicId);
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpId(String publicIpId) {
            this.publicIpId = Objects.requireNonNull(publicIpId);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetPublicIpTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetPublicIpTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public GetPublicIpResult build() {
            final var o = new GetPublicIpResult();
            o.filters = filters;
            o.id = id;
            o.linkPublicIpId = linkPublicIpId;
            o.nicAccountId = nicAccountId;
            o.nicId = nicId;
            o.privateIp = privateIp;
            o.publicIp = publicIp;
            o.publicIpId = publicIpId;
            o.requestId = requestId;
            o.tags = tags;
            o.vmId = vmId;
            return o;
        }
    }
}
