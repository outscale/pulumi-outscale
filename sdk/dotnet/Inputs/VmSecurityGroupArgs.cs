// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VmSecurityGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the security group.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The name of the security group.
        /// </summary>
        [Input("securityGroupName")]
        public Input<string>? SecurityGroupName { get; set; }

        public VmSecurityGroupArgs()
        {
        }
        public static new VmSecurityGroupArgs Empty => new VmSecurityGroupArgs();
    }
}
