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
    public sealed class GetVmNicPrivateIpLinkPublicIpResult
    {
        /// <summary>
        /// The name of the public DNS.
        /// </summary>
        public readonly string PublicDnsName;
        /// <summary>
        /// The public IP of the VM.
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// The account ID of the owner of the public IP.
        /// </summary>
        public readonly string PublicIpAccountId;

        [OutputConstructor]
        private GetVmNicPrivateIpLinkPublicIpResult(
            string publicDnsName,

            string publicIp,

            string publicIpAccountId)
        {
            PublicDnsName = publicDnsName;
            PublicIp = publicIp;
            PublicIpAccountId = publicIpAccountId;
        }
    }
}
