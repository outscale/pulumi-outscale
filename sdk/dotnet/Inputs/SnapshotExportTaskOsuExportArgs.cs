// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class SnapshotExportTaskOsuExportArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The format of the export disk (`qcow2` \| `raw`).
        /// </summary>
        [Input("diskImageFormat", required: true)]
        public Input<string> DiskImageFormat { get; set; } = null!;

        [Input("osuApiKeys")]
        private InputList<Inputs.SnapshotExportTaskOsuExportOsuApiKeyArgs>? _osuApiKeys;

        /// <summary>
        /// Information about the OOS API key.
        /// </summary>
        public InputList<Inputs.SnapshotExportTaskOsuExportOsuApiKeyArgs> OsuApiKeys
        {
            get => _osuApiKeys ?? (_osuApiKeys = new InputList<Inputs.SnapshotExportTaskOsuExportOsuApiKeyArgs>());
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

        public SnapshotExportTaskOsuExportArgs()
        {
        }
        public static new SnapshotExportTaskOsuExportArgs Empty => new SnapshotExportTaskOsuExportArgs();
    }
}
