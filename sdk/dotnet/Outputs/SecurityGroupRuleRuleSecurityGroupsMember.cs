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
    public sealed class SecurityGroupRuleRuleSecurityGroupsMember
    {
        /// <summary>
        /// The account ID that owns the source or destination security group.
        /// </summary>
        public readonly string? AccountId;
        /// <summary>
        /// The ID of the security group for which you want to create a rule.
        /// </summary>
        public readonly string? SecurityGroupId;
        /// <summary>
        /// (Public Cloud only) The name of a source or destination security group that you want to link to the security group of the rule.
        /// </summary>
        public readonly string? SecurityGroupName;

        [OutputConstructor]
        private SecurityGroupRuleRuleSecurityGroupsMember(
            string? accountId,

            string? securityGroupId,

            string? securityGroupName)
        {
            AccountId = accountId;
            SecurityGroupId = securityGroupId;
            SecurityGroupName = securityGroupName;
        }
    }
}
