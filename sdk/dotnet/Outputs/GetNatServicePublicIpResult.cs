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
    public sealed class GetNatServicePublicIpResult
    {
        /// <summary>
        /// The public IP associated with the NAT service.
        /// </summary>
        public readonly string PublicIp;
        /// <summary>
        /// The allocation ID of the public IP associated with the NAT service.
        /// </summary>
        public readonly string PublicIpId;

        [OutputConstructor]
        private GetNatServicePublicIpResult(
            string publicIp,

            string publicIpId)
        {
            PublicIp = publicIp;
            PublicIpId = publicIpId;
        }
    }
}
