// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.OutboundRuleRuleSecurityGroupsMember;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OutboundRuleRule {
    private @Nullable Integer fromPortRange;
    private @Nullable String ipProtocol;
    private @Nullable List<String> ipRanges;
    private @Nullable List<OutboundRuleRuleSecurityGroupsMember> securityGroupsMembers;
    private @Nullable List<String> serviceIds;
    private @Nullable Integer toPortRange;

    private OutboundRuleRule() {}
    public Optional<Integer> fromPortRange() {
        return Optional.ofNullable(this.fromPortRange);
    }
    public Optional<String> ipProtocol() {
        return Optional.ofNullable(this.ipProtocol);
    }
    public List<String> ipRanges() {
        return this.ipRanges == null ? List.of() : this.ipRanges;
    }
    public List<OutboundRuleRuleSecurityGroupsMember> securityGroupsMembers() {
        return this.securityGroupsMembers == null ? List.of() : this.securityGroupsMembers;
    }
    public List<String> serviceIds() {
        return this.serviceIds == null ? List.of() : this.serviceIds;
    }
    public Optional<Integer> toPortRange() {
        return Optional.ofNullable(this.toPortRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutboundRuleRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer fromPortRange;
        private @Nullable String ipProtocol;
        private @Nullable List<String> ipRanges;
        private @Nullable List<OutboundRuleRuleSecurityGroupsMember> securityGroupsMembers;
        private @Nullable List<String> serviceIds;
        private @Nullable Integer toPortRange;
        public Builder() {}
        public Builder(OutboundRuleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPortRange = defaults.fromPortRange;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ipRanges = defaults.ipRanges;
    	      this.securityGroupsMembers = defaults.securityGroupsMembers;
    	      this.serviceIds = defaults.serviceIds;
    	      this.toPortRange = defaults.toPortRange;
        }

        @CustomType.Setter
        public Builder fromPortRange(@Nullable Integer fromPortRange) {
            this.fromPortRange = fromPortRange;
            return this;
        }
        @CustomType.Setter
        public Builder ipProtocol(@Nullable String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder ipRanges(@Nullable List<String> ipRanges) {
            this.ipRanges = ipRanges;
            return this;
        }
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }
        @CustomType.Setter
        public Builder securityGroupsMembers(@Nullable List<OutboundRuleRuleSecurityGroupsMember> securityGroupsMembers) {
            this.securityGroupsMembers = securityGroupsMembers;
            return this;
        }
        public Builder securityGroupsMembers(OutboundRuleRuleSecurityGroupsMember... securityGroupsMembers) {
            return securityGroupsMembers(List.of(securityGroupsMembers));
        }
        @CustomType.Setter
        public Builder serviceIds(@Nullable List<String> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }
        public Builder serviceIds(String... serviceIds) {
            return serviceIds(List.of(serviceIds));
        }
        @CustomType.Setter
        public Builder toPortRange(@Nullable Integer toPortRange) {
            this.toPortRange = toPortRange;
            return this;
        }
        public OutboundRuleRule build() {
            final var o = new OutboundRuleRule();
            o.fromPortRange = fromPortRange;
            o.ipProtocol = ipProtocol;
            o.ipRanges = ipRanges;
            o.securityGroupsMembers = securityGroupsMembers;
            o.serviceIds = serviceIds;
            o.toPortRange = toPortRange;
            return o;
        }
    }
}
