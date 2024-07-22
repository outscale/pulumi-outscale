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
    public sealed class GetImageExportTaskOsuExportResult
    {
        /// <summary>
        /// The format of the export disk (`qcow2` \| `raw`).
        /// </summary>
        public readonly string DiskImageFormat;
        /// <summary>
        /// The name of the OOS bucket the OMI is exported to.
        /// </summary>
        public readonly string OsuBucket;
        /// <summary>
        /// The URL of the manifest file.
        /// </summary>
        public readonly string OsuManifestUrl;
        /// <summary>
        /// The prefix for the key of the OOS object corresponding to the image.
        /// </summary>
        public readonly string OsuPrefix;

        [OutputConstructor]
        private GetImageExportTaskOsuExportResult(
            string diskImageFormat,

            string osuBucket,

            string osuManifestUrl,

            string osuPrefix)
        {
            DiskImageFormat = diskImageFormat;
            OsuBucket = osuBucket;
            OsuManifestUrl = osuManifestUrl;
            OsuPrefix = osuPrefix;
        }
    }
}
