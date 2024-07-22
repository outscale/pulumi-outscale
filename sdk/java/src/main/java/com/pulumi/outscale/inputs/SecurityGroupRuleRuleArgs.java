// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.SecurityGroupRuleRuleSecurityGroupsMemberArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityGroupRuleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupRuleRuleArgs Empty = new SecurityGroupRuleRuleArgs();

    /**
     * The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
     * 
     */
    @Import(name="fromPortRange")
    private @Nullable Output<Integer> fromPortRange;

    /**
     * @return The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
     * 
     */
    public Optional<Output<Integer>> fromPortRange() {
        return Optional.ofNullable(this.fromPortRange);
    }

    /**
     * The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    @Import(name="ipProtocol")
    private @Nullable Output<String> ipProtocol;

    /**
     * @return The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * 
     */
    public Optional<Output<String>> ipProtocol() {
        return Optional.ofNullable(this.ipProtocol);
    }

    /**
     * One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    @Import(name="ipRanges")
    private @Nullable Output<List<String>> ipRanges;

    /**
     * @return One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
     * 
     */
    public Optional<Output<List<String>>> ipRanges() {
        return Optional.ofNullable(this.ipRanges);
    }

    /**
     * Information about one or more source or destination security groups.
     * 
     */
    @Import(name="securityGroupsMembers")
    private @Nullable Output<List<SecurityGroupRuleRuleSecurityGroupsMemberArgs>> securityGroupsMembers;

    /**
     * @return Information about one or more source or destination security groups.
     * 
     */
    public Optional<Output<List<SecurityGroupRuleRuleSecurityGroupsMemberArgs>>> securityGroupsMembers() {
        return Optional.ofNullable(this.securityGroupsMembers);
    }

    /**
     * One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](https://docs.outscale.com/api#readnetaccesspointservices).
     * 
     */
    @Import(name="serviceIds")
    private @Nullable Output<List<String>> serviceIds;

    /**
     * @return One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](https://docs.outscale.com/api#readnetaccesspointservices).
     * 
     */
    public Optional<Output<List<String>>> serviceIds() {
        return Optional.ofNullable(this.serviceIds);
    }

    /**
     * The end of the port range for the TCP and UDP protocols, or an ICMP code number. If you specify this parameter, you cannot specify the `rules` parameter and its subparameters.
     * 
     */
    @Import(name="toPortRange")
    private @Nullable Output<Integer> toPortRange;

    /**
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP code number. If you specify this parameter, you cannot specify the `rules` parameter and its subparameters.
     * 
     */
    public Optional<Output<Integer>> toPortRange() {
        return Optional.ofNullable(this.toPortRange);
    }

    private SecurityGroupRuleRuleArgs() {}

    private SecurityGroupRuleRuleArgs(SecurityGroupRuleRuleArgs $) {
        this.fromPortRange = $.fromPortRange;
        this.ipProtocol = $.ipProtocol;
        this.ipRanges = $.ipRanges;
        this.securityGroupsMembers = $.securityGroupsMembers;
        this.serviceIds = $.serviceIds;
        this.toPortRange = $.toPortRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityGroupRuleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityGroupRuleRuleArgs $;

        public Builder() {
            $ = new SecurityGroupRuleRuleArgs();
        }

        public Builder(SecurityGroupRuleRuleArgs defaults) {
            $ = new SecurityGroupRuleRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fromPortRange The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
         * 
         * @return builder
         * 
         */
        public Builder fromPortRange(@Nullable Output<Integer> fromPortRange) {
            $.fromPortRange = fromPortRange;
            return this;
        }

        /**
         * @param fromPortRange The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
         * 
         * @return builder
         * 
         */
        public Builder fromPortRange(Integer fromPortRange) {
            return fromPortRange(Output.of(fromPortRange));
        }

        /**
         * @param ipProtocol The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(@Nullable Output<String> ipProtocol) {
            $.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * @param ipProtocol The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(String ipProtocol) {
            return ipProtocol(Output.of(ipProtocol));
        }

        /**
         * @param ipRanges One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
         * 
         * @return builder
         * 
         */
        public Builder ipRanges(@Nullable Output<List<String>> ipRanges) {
            $.ipRanges = ipRanges;
            return this;
        }

        /**
         * @param ipRanges One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
         * 
         * @return builder
         * 
         */
        public Builder ipRanges(List<String> ipRanges) {
            return ipRanges(Output.of(ipRanges));
        }

        /**
         * @param ipRanges One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
         * 
         * @return builder
         * 
         */
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }

        /**
         * @param securityGroupsMembers Information about one or more source or destination security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupsMembers(@Nullable Output<List<SecurityGroupRuleRuleSecurityGroupsMemberArgs>> securityGroupsMembers) {
            $.securityGroupsMembers = securityGroupsMembers;
            return this;
        }

        /**
         * @param securityGroupsMembers Information about one or more source or destination security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupsMembers(List<SecurityGroupRuleRuleSecurityGroupsMemberArgs> securityGroupsMembers) {
            return securityGroupsMembers(Output.of(securityGroupsMembers));
        }

        /**
         * @param securityGroupsMembers Information about one or more source or destination security groups.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupsMembers(SecurityGroupRuleRuleSecurityGroupsMemberArgs... securityGroupsMembers) {
            return securityGroupsMembers(List.of(securityGroupsMembers));
        }

        /**
         * @param serviceIds One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](https://docs.outscale.com/api#readnetaccesspointservices).
         * 
         * @return builder
         * 
         */
        public Builder serviceIds(@Nullable Output<List<String>> serviceIds) {
            $.serviceIds = serviceIds;
            return this;
        }

        /**
         * @param serviceIds One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](https://docs.outscale.com/api#readnetaccesspointservices).
         * 
         * @return builder
         * 
         */
        public Builder serviceIds(List<String> serviceIds) {
            return serviceIds(Output.of(serviceIds));
        }

        /**
         * @param serviceIds One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](https://docs.outscale.com/api#readnetaccesspointservices).
         * 
         * @return builder
         * 
         */
        public Builder serviceIds(String... serviceIds) {
            return serviceIds(List.of(serviceIds));
        }

        /**
         * @param toPortRange The end of the port range for the TCP and UDP protocols, or an ICMP code number. If you specify this parameter, you cannot specify the `rules` parameter and its subparameters.
         * 
         * @return builder
         * 
         */
        public Builder toPortRange(@Nullable Output<Integer> toPortRange) {
            $.toPortRange = toPortRange;
            return this;
        }

        /**
         * @param toPortRange The end of the port range for the TCP and UDP protocols, or an ICMP code number. If you specify this parameter, you cannot specify the `rules` parameter and its subparameters.
         * 
         * @return builder
         * 
         */
        public Builder toPortRange(Integer toPortRange) {
            return toPortRange(Output.of(toPortRange));
        }

        public SecurityGroupRuleRuleArgs build() {
            return $;
        }
    }

}
