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
    public sealed class ImageExportTaskOsuExportOsuApiKey
    {
        /// <summary>
        /// The API key of the OOS account that enables you to access the bucket.
        /// </summary>
        public readonly string ApiKeyId;
        /// <summary>
        /// The secret key of the OOS account that enables you to access the bucket.
        /// </summary>
        public readonly string SecretKey;

        [OutputConstructor]
        private ImageExportTaskOsuExportOsuApiKey(
            string apiKeyId,

            string secretKey)
        {
            ApiKeyId = apiKeyId;
            SecretKey = secretKey;
        }
    }
}