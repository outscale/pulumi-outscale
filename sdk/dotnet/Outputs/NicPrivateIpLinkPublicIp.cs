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
    public sealed class NicPrivateIpLinkPublicIp
    {
        /// <summary>
        /// (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
        /// </summary>
        public readonly string? LinkPublicIpId;
        /// <summary>
        /// The name of the public DNS.
        /// </summary>
        public readonly string? PublicDnsName;
        /// <summary>
        /// The public IP associated with the NIC.
        /// </summary>
        public readonly string? PublicIp;
        /// <summary>
        /// The account ID of the owner of the public IP.
        /// </summary>
        public readonly string? PublicIpAccountId;
        /// <summary>
        /// The allocation ID of the public IP.
        /// </summary>
        public readonly string? PublicIpId;

        [OutputConstructor]
        private NicPrivateIpLinkPublicIp(
            string? linkPublicIpId,

            string? publicDnsName,

            string? publicIp,

            string? publicIpAccountId,

            string? publicIpId)
        {
            LinkPublicIpId = linkPublicIpId;
            PublicDnsName = publicDnsName;
            PublicIp = publicIp;
            PublicIpAccountId = publicIpAccountId;
            PublicIpId = publicIpId;
        }
    }
}
