// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetSecurityGroupInboundRuleSecurityGroupsMember;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecurityGroupInboundRule {
    /**
     * @return The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
     * 
     */
    private Integer fromPortRange;
    /**
     * @return The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    private String ipProtocol;
    /**
     * @return One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    private List<String> ipRanges;
    private List<String> prefixListIds;
    /**
     * @return Information about one or more source or destination security groups.
     * 
     */
    private List<GetSecurityGroupInboundRuleSecurityGroupsMember> securityGroupsMembers;
    /**
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP code number.
     * 
     */
    private Integer toPortRange;

    private GetSecurityGroupInboundRule() {}
    /**
     * @return The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
     * 
     */
    public Integer fromPortRange() {
        return this.fromPortRange;
    }
    /**
     * @return The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    public String ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * @return One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    public List<String> ipRanges() {
        return this.ipRanges;
    }
    public List<String> prefixListIds() {
        return this.prefixListIds;
    }
    /**
     * @return Information about one or more source or destination security groups.
     * 
     */
    public List<GetSecurityGroupInboundRuleSecurityGroupsMember> securityGroupsMembers() {
        return this.securityGroupsMembers;
    }
    /**
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP code number.
     * 
     */
    public Integer toPortRange() {
        return this.toPortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityGroupInboundRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer fromPortRange;
        private String ipProtocol;
        private List<String> ipRanges;
        private List<String> prefixListIds;
        private List<GetSecurityGroupInboundRuleSecurityGroupsMember> securityGroupsMembers;
        private Integer toPortRange;
        public Builder() {}
        public Builder(GetSecurityGroupInboundRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPortRange = defaults.fromPortRange;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ipRanges = defaults.ipRanges;
    	      this.prefixListIds = defaults.prefixListIds;
    	      this.securityGroupsMembers = defaults.securityGroupsMembers;
    	      this.toPortRange = defaults.toPortRange;
        }

        @CustomType.Setter
        public Builder fromPortRange(Integer fromPortRange) {
            this.fromPortRange = Objects.requireNonNull(fromPortRange);
            return this;
        }
        @CustomType.Setter
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder ipRanges(List<String> ipRanges) {
            this.ipRanges = Objects.requireNonNull(ipRanges);
            return this;
        }
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }
        @CustomType.Setter
        public Builder prefixListIds(List<String> prefixListIds) {
            this.prefixListIds = Objects.requireNonNull(prefixListIds);
            return this;
        }
        public Builder prefixListIds(String... prefixListIds) {
            return prefixListIds(List.of(prefixListIds));
        }
        @CustomType.Setter
        public Builder securityGroupsMembers(List<GetSecurityGroupInboundRuleSecurityGroupsMember> securityGroupsMembers) {
            this.securityGroupsMembers = Objects.requireNonNull(securityGroupsMembers);
            return this;
        }
        public Builder securityGroupsMembers(GetSecurityGroupInboundRuleSecurityGroupsMember... securityGroupsMembers) {
            return securityGroupsMembers(List.of(securityGroupsMembers));
        }
        @CustomType.Setter
        public Builder toPortRange(Integer toPortRange) {
            this.toPortRange = Objects.requireNonNull(toPortRange);
            return this;
        }
        public GetSecurityGroupInboundRule build() {
            final var o = new GetSecurityGroupInboundRule();
            o.fromPortRange = fromPortRange;
            o.ipProtocol = ipProtocol;
            o.ipRanges = ipRanges;
            o.prefixListIds = prefixListIds;
            o.securityGroupsMembers = securityGroupsMembers;
            o.toPortRange = toPortRange;
            return o;
        }
    }
}