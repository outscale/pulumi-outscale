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
    public sealed class GetServerCertificatesServerCertificateResult
    {
        /// <summary>
        /// The date at which the server certificate expires.
        /// </summary>
        public readonly string ExpirationDate;
        /// <summary>
        /// The ID of the server certificate.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the server certificate.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        /// </summary>
        public readonly string Orn;
        /// <summary>
        /// The path to the server certificate.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// The date at which the server certificate has been uploaded.
        /// </summary>
        public readonly string UploadDate;

        [OutputConstructor]
        private GetServerCertificatesServerCertificateResult(
            string expirationDate,

            string id,

            string name,

            string orn,

            string path,

            string uploadDate)
        {
            ExpirationDate = expirationDate;
            Id = id;
            Name = name;
            Orn = orn;
            Path = path;
            UploadDate = uploadDate;
        }
    }
}
