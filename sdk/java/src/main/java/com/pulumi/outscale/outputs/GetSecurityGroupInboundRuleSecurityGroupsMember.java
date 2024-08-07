// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecurityGroupInboundRuleSecurityGroupsMember {
    /**
     * @return The account ID that owns the source or destination security group.
     * 
     */
    private String accountId;
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

    private GetSecurityGroupInboundRuleSecurityGroupsMember() {}
    /**
     * @return The account ID that owns the source or destination security group.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
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

    public static Builder builder(GetSecurityGroupInboundRuleSecurityGroupsMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String securityGroupId;
        private String securityGroupName;
        public Builder() {}
        public Builder(GetSecurityGroupInboundRuleSecurityGroupsMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.securityGroupName = defaults.securityGroupName;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
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
        public GetSecurityGroupInboundRuleSecurityGroupsMember build() {
            final var o = new GetSecurityGroupInboundRuleSecurityGroupsMember();
            o.accountId = accountId;
            o.securityGroupId = securityGroupId;
            o.securityGroupName = securityGroupName;
            return o;
        }
    }
}
