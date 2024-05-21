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
    public sealed class GetCasCaResult
    {
        /// <summary>
        /// The fingerprint of the CA.
        /// </summary>
        public readonly string CaFingerprint;
        /// <summary>
        /// The ID of the CA.
        /// </summary>
        public readonly string CaId;
        /// <summary>
        /// The description of the CA.
        /// </summary>
        public readonly string Description;

        [OutputConstructor]
        private GetCasCaResult(
            string caFingerprint,

            string caId,

            string description)
        {
            CaFingerprint = caFingerprint;
            CaId = caId;
            Description = description;
        }
    }
}