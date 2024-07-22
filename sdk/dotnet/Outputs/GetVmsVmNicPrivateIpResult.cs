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
    public sealed class GetVmsVmNicPrivateIpResult
    {
        /// <summary>
        /// If true, the IP is the primary private IP of the NIC.
        /// </summary>
        public readonly bool IsPrimary;
        /// <summary>
        /// Information about the public IP associated with the NIC.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVmsVmNicPrivateIpLinkPublicIpResult> LinkPublicIps;
        /// <summary>
        /// The name of the private DNS.
        /// </summary>
        public readonly string PrivateDnsName;
        /// <summary>
        /// The primary private IP of the VM.
        /// </summary>
        public readonly string PrivateIp;

        [OutputConstructor]
        private GetVmsVmNicPrivateIpResult(
            bool isPrimary,

            ImmutableArray<Outputs.GetVmsVmNicPrivateIpLinkPublicIpResult> linkPublicIps,

            string privateDnsName,

            string privateIp)
        {
            IsPrimary = isPrimary;
            LinkPublicIps = linkPublicIps;
            PrivateDnsName = privateDnsName;
            PrivateIp = privateIp;
        }
    }
}
