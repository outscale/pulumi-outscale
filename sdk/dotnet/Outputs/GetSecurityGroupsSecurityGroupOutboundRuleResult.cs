// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Outputs
{

    [OutputType]
    public sealed class GetSecurityGroupsSecurityGroupOutboundRuleResult
    {
        /// <summary>
        /// The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
        /// </summary>
        public readonly int FromPortRange;
        /// <summary>
        /// The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
        /// </summary>
        public readonly string IpProtocol;
        /// <summary>
        /// One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        public readonly ImmutableArray<string> IpRanges;
        public readonly ImmutableArray<string> PrefixListIds;
        /// <summary>
        /// Information about one or more source or destination security groups.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityGroupsSecurityGroupOutboundRuleSecurityGroupsMemberResult> SecurityGroupsMembers;
        /// <summary>
        /// The end of the port range for the TCP and UDP protocols, or an ICMP code number.
        /// </summary>
        public readonly int ToPortRange;

        [OutputConstructor]
        private GetSecurityGroupsSecurityGroupOutboundRuleResult(
            int fromPortRange,

            string ipProtocol,

            ImmutableArray<string> ipRanges,

            ImmutableArray<string> prefixListIds,

            ImmutableArray<Outputs.GetSecurityGroupsSecurityGroupOutboundRuleSecurityGroupsMemberResult> securityGroupsMembers,

            int toPortRange)
        {
            FromPortRange = fromPortRange;
            IpProtocol = ipProtocol;
            IpRanges = ipRanges;
            PrefixListIds = prefixListIds;
            SecurityGroupsMembers = securityGroupsMembers;
            ToPortRange = toPortRange;
        }
    }
}
