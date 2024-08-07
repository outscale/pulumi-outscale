// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVmNicSecurityGroup {
    /**
     * @return The ID of the security group.
     * 
     */
    private String securityGroupId;
    /**
     * @return The name of the security group.
     * 
     */
    private String securityGroupName;

    private GetVmNicSecurityGroup() {}
    /**
     * @return The ID of the security group.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The name of the security group.
     * 
     */
    public String securityGroupName() {
        return this.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmNicSecurityGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String securityGroupId;
        private String securityGroupName;
        public Builder() {}
        public Builder(GetVmNicSecurityGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.securityGroupName = defaults.securityGroupName;
        }

        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupName(String securityGroupName) {
            this.securityGroupName = Objects.requireNonNull(securityGroupName);
            return this;
        }
        public GetVmNicSecurityGroup build() {
            final var o = new GetVmNicSecurityGroup();
            o.securityGroupId = securityGroupId;
            o.securityGroupName = securityGroupName;
            return o;
        }
    }
}
