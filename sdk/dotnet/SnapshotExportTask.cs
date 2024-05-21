// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    /// <summary>
    /// Manages a snapshot export task.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-snapshot).
    /// 
    /// ## Example Usage
    /// ### Required resources
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var volume01 = new Outscale.Volume("volume01", new()
    ///     {
    ///         SubregionName = $"{@var.Region}a",
    ///         Size = 40,
    ///     });
    /// 
    ///     var snapshot01 = new Outscale.Snapshot("snapshot01", new()
    ///     {
    ///         VolumeId = volume01.VolumeId,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a snapshot export task
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var snapshotExportTask01 = new Outscale.SnapshotExportTask("snapshotExportTask01", new()
    ///     {
    ///         SnapshotId = outscale_snapshot.Snapshot01.Snapshot_id,
    ///         OsuExports = new[]
    ///         {
    ///             new Outscale.Inputs.SnapshotExportTaskOsuExportArgs
    ///             {
    ///                 DiskImageFormat = "qcow2",
    ///                 OsuBucket = "terraform-bucket",
    ///                 OsuPrefix = "new-export",
    ///                 OsuApiKeys = new[]
    ///                 {
    ///                     new Outscale.Inputs.SnapshotExportTaskOsuExportOsuApiKeyArgs
    ///                     {
    ///                         ApiKeyId = @var.Access_key_id,
    ///                         SecretKey = @var.Secret_key_id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.SnapshotExportTaskTagArgs
    ///             {
    ///                 Key = "Name",
    ///                 Value = "terraform-snapshot-export-task",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/snapshotExportTask:SnapshotExportTask")]
    public partial class SnapshotExportTask : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If the snapshot export task fails, an error message appears.
        /// </summary>
        [Output("comment")]
        public Output<string> Comment { get; private set; } = null!;

        /// <summary>
        /// Information about the OOS export task to create.
        /// </summary>
        [Output("osuExports")]
        public Output<ImmutableArray<Outputs.SnapshotExportTaskOsuExport>> OsuExports { get; private set; } = null!;

        /// <summary>
        /// The progress of the snapshot export task, as a percentage.
        /// </summary>
        [Output("progress")]
        public Output<int> Progress { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The ID of the snapshot to export.
        /// </summary>
        [Output("snapshotId")]
        public Output<string> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// The state of the snapshot export task (`pending` \| `active` \| `completed` \| `failed`).
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.SnapshotExportTaskTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the snapshot export task.
        /// </summary>
        [Output("taskId")]
        public Output<string> TaskId { get; private set; } = null!;


        /// <summary>
        /// Create a SnapshotExportTask resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SnapshotExportTask(string name, SnapshotExportTaskArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/snapshotExportTask:SnapshotExportTask", name, args ?? new SnapshotExportTaskArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SnapshotExportTask(string name, Input<string> id, SnapshotExportTaskState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/snapshotExportTask:SnapshotExportTask", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SnapshotExportTask resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SnapshotExportTask Get(string name, Input<string> id, SnapshotExportTaskState? state = null, CustomResourceOptions? options = null)
        {
            return new SnapshotExportTask(name, id, state, options);
        }
    }

    public sealed class SnapshotExportTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("osuExports", required: true)]
        private InputList<Inputs.SnapshotExportTaskOsuExportArgs>? _osuExports;

        /// <summary>
        /// Information about the OOS export task to create.
        /// </summary>
        public InputList<Inputs.SnapshotExportTaskOsuExportArgs> OsuExports
        {
            get => _osuExports ?? (_osuExports = new InputList<Inputs.SnapshotExportTaskOsuExportArgs>());
            set => _osuExports = value;
        }

        /// <summary>
        /// The ID of the snapshot to export.
        /// </summary>
        [Input("snapshotId", required: true)]
        public Input<string> SnapshotId { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.SnapshotExportTaskTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.SnapshotExportTaskTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SnapshotExportTaskTagArgs>());
            set => _tags = value;
        }

        public SnapshotExportTaskArgs()
        {
        }
        public static new SnapshotExportTaskArgs Empty => new SnapshotExportTaskArgs();
    }

    public sealed class SnapshotExportTaskState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If the snapshot export task fails, an error message appears.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("osuExports")]
        private InputList<Inputs.SnapshotExportTaskOsuExportGetArgs>? _osuExports;

        /// <summary>
        /// Information about the OOS export task to create.
        /// </summary>
        public InputList<Inputs.SnapshotExportTaskOsuExportGetArgs> OsuExports
        {
            get => _osuExports ?? (_osuExports = new InputList<Inputs.SnapshotExportTaskOsuExportGetArgs>());
            set => _osuExports = value;
        }

        /// <summary>
        /// The progress of the snapshot export task, as a percentage.
        /// </summary>
        [Input("progress")]
        public Input<int>? Progress { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The ID of the snapshot to export.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The state of the snapshot export task (`pending` \| `active` \| `completed` \| `failed`).
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputList<Inputs.SnapshotExportTaskTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.SnapshotExportTaskTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SnapshotExportTaskTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the snapshot export task.
        /// </summary>
        [Input("taskId")]
        public Input<string>? TaskId { get; set; }

        public SnapshotExportTaskState()
        {
        }
        public static new SnapshotExportTaskState Empty => new SnapshotExportTaskState();
    }
}