// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class SecurityGroupRuleRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
        /// </summary>
        [Input("fromPortRange")]
        public Input<int>? FromPortRange { get; set; }

        /// <summary>
        /// The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
        /// </summary>
        [Input("ipProtocol")]
        public Input<string>? IpProtocol { get; set; }

        [Input("ipRanges")]
        private InputList<string>? _ipRanges;

        /// <summary>
        /// One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        public InputList<string> IpRanges
        {
            get => _ipRanges ?? (_ipRanges = new InputList<string>());
            set => _ipRanges = value;
        }

        [Input("securityGroupsMembers")]
        private InputList<Inputs.SecurityGroupRuleRuleSecurityGroupsMemberGetArgs>? _securityGroupsMembers;

        /// <summary>
        /// Information about one or more source or destination security groups.
        /// </summary>
        public InputList<Inputs.SecurityGroupRuleRuleSecurityGroupsMemberGetArgs> SecurityGroupsMembers
        {
            get => _securityGroupsMembers ?? (_securityGroupsMembers = new InputList<Inputs.SecurityGroupRuleRuleSecurityGroupsMemberGetArgs>());
            set => _securityGroupsMembers = value;
        }

        [Input("serviceIds")]
        private InputList<string>? _serviceIds;

        /// <summary>
        /// One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](https://docs.outscale.com/api#readnetaccesspointservices).
        /// </summary>
        public InputList<string> ServiceIds
        {
            get => _serviceIds ?? (_serviceIds = new InputList<string>());
            set => _serviceIds = value;
        }

        /// <summary>
        /// The end of the port range for the TCP and UDP protocols, or an ICMP code number. If you specify this parameter, you cannot specify the `rules` parameter and its subparameters.
        /// </summary>
        [Input("toPortRange")]
        public Input<int>? ToPortRange { get; set; }

        public SecurityGroupRuleRuleGetArgs()
        {
        }
        public static new SecurityGroupRuleRuleGetArgs Empty => new SecurityGroupRuleRuleGetArgs();
    }
}
