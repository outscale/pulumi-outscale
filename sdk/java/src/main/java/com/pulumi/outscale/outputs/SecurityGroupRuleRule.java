// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.SecurityGroupRuleRuleSecurityGroupsMember;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityGroupRuleRule {
    /**
     * @return The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
     * 
     */
    private @Nullable Integer fromPortRange;
    /**
     * @return The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    private @Nullable String ipProtocol;
    /**
     * @return One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    private @Nullable List<String> ipRanges;
    /**
     * @return Information about one or more source or destination security groups.
     * 
     */
    private @Nullable List<SecurityGroupRuleRuleSecurityGroupsMember> securityGroupsMembers;
    /**
     * @return One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](https://docs.outscale.com/api#readnetaccesspointservices).
     * 
     */
    private @Nullable List<String> serviceIds;
    /**
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP code number. If you specify this parameter, you cannot specify the `rules` parameter and its subparameters.
     * 
     */
    private @Nullable Integer toPortRange;

    private SecurityGroupRuleRule() {}
    /**
     * @return The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
     * 
     */
    public Optional<Integer> fromPortRange() {
        return Optional.ofNullable(this.fromPortRange);
    }
    /**
     * @return The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    public Optional<String> ipProtocol() {
        return Optional.ofNullable(this.ipProtocol);
    }
    /**
     * @return One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    public List<String> ipRanges() {
        return this.ipRanges == null ? List.of() : this.ipRanges;
    }
    /**
     * @return Information about one or more source or destination security groups.
     * 
     */
    public List<SecurityGroupRuleRuleSecurityGroupsMember> securityGroupsMembers() {
        return this.securityGroupsMembers == null ? List.of() : this.securityGroupsMembers;
    }
    /**
     * @return One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](https://docs.outscale.com/api#readnetaccesspointservices).
     * 
     */
    public List<String> serviceIds() {
        return this.serviceIds == null ? List.of() : this.serviceIds;
    }
    /**
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP code number. If you specify this parameter, you cannot specify the `rules` parameter and its subparameters.
     * 
     */
    public Optional<Integer> toPortRange() {
        return Optional.ofNullable(this.toPortRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupRuleRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer fromPortRange;
        private @Nullable String ipProtocol;
        private @Nullable List<String> ipRanges;
        private @Nullable List<SecurityGroupRuleRuleSecurityGroupsMember> securityGroupsMembers;
        private @Nullable List<String> serviceIds;
        private @Nullable Integer toPortRange;
        public Builder() {}
        public Builder(SecurityGroupRuleRule defaults) {
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
        public Builder securityGroupsMembers(@Nullable List<SecurityGroupRuleRuleSecurityGroupsMember> securityGroupsMembers) {
            this.securityGroupsMembers = securityGroupsMembers;
            return this;
        }
        public Builder securityGroupsMembers(SecurityGroupRuleRuleSecurityGroupsMember... securityGroupsMembers) {
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
        public SecurityGroupRuleRule build() {
            final var o = new SecurityGroupRuleRule();
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
