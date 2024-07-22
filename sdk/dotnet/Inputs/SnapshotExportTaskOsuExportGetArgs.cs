// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class SnapshotExportTaskOsuExportGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The format of the export disk (`qcow2` \| `raw`).
        /// </summary>
        [Input("diskImageFormat", required: true)]
        public Input<string> DiskImageFormat { get; set; } = null!;

        [Input("osuApiKeys")]
        private InputList<Inputs.SnapshotExportTaskOsuExportOsuApiKeyGetArgs>? _osuApiKeys;

        /// <summary>
        /// Information about the OOS API key.
        /// </summary>
        public InputList<Inputs.SnapshotExportTaskOsuExportOsuApiKeyGetArgs> OsuApiKeys
        {
            get => _osuApiKeys ?? (_osuApiKeys = new InputList<Inputs.SnapshotExportTaskOsuExportOsuApiKeyGetArgs>());
            set => _osuApiKeys = value;
        }

        /// <summary>
        /// The name of the OOS bucket where you want to export the object.
        /// </summary>
        [Input("osuBucket", required: true)]
        public Input<string> OsuBucket { get; set; } = null!;

        /// <summary>
        /// The prefix for the key of the OOS object.
        /// </summary>
        [Input("osuPrefix")]
        public Input<string>? OsuPrefix { get; set; }

        public SnapshotExportTaskOsuExportGetArgs()
        {
        }
        public static new SnapshotExportTaskOsuExportGetArgs Empty => new SnapshotExportTaskOsuExportGetArgs();
    }
}
