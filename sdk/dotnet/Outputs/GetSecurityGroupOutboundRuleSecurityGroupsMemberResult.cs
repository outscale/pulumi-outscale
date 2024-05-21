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
    public sealed class GetSecurityGroupOutboundRuleSecurityGroupsMemberResult
    {
        /// <summary>
        /// The account ID that owns the source or destination security group.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The ID of the security group.
        /// </summary>
        public readonly string SecurityGroupId;
        /// <summary>
        /// The name of the security group.
        /// </summary>
        public readonly string SecurityGroupName;

        [OutputConstructor]
        private GetSecurityGroupOutboundRuleSecurityGroupsMemberResult(
            string accountId,

            string securityGroupId,

            string securityGroupName)
        {
            AccountId = accountId;
            SecurityGroupId = securityGroupId;
            SecurityGroupName = securityGroupName;
        }
    }
}