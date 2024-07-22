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
    public sealed class GetVmSecurityGroupResult
    {
        /// <summary>
        /// The ID of the security group.
        /// </summary>
        public readonly string SecurityGroupId;
        /// <summary>
        /// The name of the security group.
        /// </summary>
        public readonly string SecurityGroupName;

        [OutputConstructor]
        private GetVmSecurityGroupResult(
            string securityGroupId,

            string securityGroupName)
        {
            SecurityGroupId = securityGroupId;
            SecurityGroupName = securityGroupName;
        }
    }
}
