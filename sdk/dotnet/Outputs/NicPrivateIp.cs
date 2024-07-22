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
    public sealed class NicPrivateIp
    {
        /// <summary>
        /// If true, the IP is the primary private IP of the NIC.
        /// </summary>
        public readonly bool? IsPrimary;
        /// <summary>
        /// Information about the public IP association.
        /// </summary>
        public readonly ImmutableArray<Outputs.NicPrivateIpLinkPublicIp> LinkPublicIps;
        /// <summary>
        /// The name of the private DNS.
        /// </summary>
        public readonly string? PrivateDnsName;
        /// <summary>
        /// The private IP of the NIC.
        /// </summary>
        public readonly string? PrivateIp;

        [OutputConstructor]
        private NicPrivateIp(
            bool? isPrimary,

            ImmutableArray<Outputs.NicPrivateIpLinkPublicIp> linkPublicIps,

            string? privateDnsName,

            string? privateIp)
        {
            IsPrimary = isPrimary;
            LinkPublicIps = linkPublicIps;
            PrivateDnsName = privateDnsName;
            PrivateIp = privateIp;
        }
    }
}
