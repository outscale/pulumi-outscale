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
    /// Manages an image export task.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).
    /// 
    /// ## Example Usage
    /// ### Required resource
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var image01 = new Outscale.Image("image01", new()
    ///     {
    ///         ImageName = "terraform-image-to-export",
    ///         VmId = "i-12345678",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create an image export task
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var imageExportTask01 = new Outscale.ImageExportTask("imageExportTask01", new()
    ///     {
    ///         ImageId = outscale_image.Image01.Image_id,
    ///         OsuExports = new[]
    ///         {
    ///             new Outscale.Inputs.ImageExportTaskOsuExportArgs
    ///             {
    ///                 DiskImageFormat = "qcow2",
    ///                 OsuBucket = "terraform-bucket",
    ///                 OsuPrefix = "new-export",
    ///                 OsuApiKeys = new[]
    ///                 {
    ///                     new Outscale.Inputs.ImageExportTaskOsuExportOsuApiKeyArgs
    ///                     {
    ///                         ApiKeyId = @var.Access_key_id,
    ///                         SecretKey = @var.Secret_key_id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.ImageExportTaskTagArgs
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
    [OutscaleResourceType("outscale:index/imageExportTask:ImageExportTask")]
    public partial class ImageExportTask : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If the OMI export task fails, an error message appears.
        /// </summary>
        [Output("comment")]
        public Output<string> Comment { get; private set; } = null!;

        /// <summary>
        /// The ID of the OMI to export.
        /// </summary>
        [Output("imageId")]
        public Output<string> ImageId { get; private set; } = null!;

        /// <summary>
        /// Information about the OOS export task to create.
        /// </summary>
        [Output("osuExports")]
        public Output<ImmutableArray<Outputs.ImageExportTaskOsuExport>> OsuExports { get; private set; } = null!;

        /// <summary>
        /// The progress of the OMI export task, as a percentage.
        /// </summary>
        [Output("progress")]
        public Output<int> Progress { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.ImageExportTaskTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the OMI export task.
        /// </summary>
        [Output("taskId")]
        public Output<string> TaskId { get; private set; } = null!;


        /// <summary>
        /// Create a ImageExportTask resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ImageExportTask(string name, ImageExportTaskArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/imageExportTask:ImageExportTask", name, args ?? new ImageExportTaskArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ImageExportTask(string name, Input<string> id, ImageExportTaskState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/imageExportTask:ImageExportTask", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ImageExportTask resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ImageExportTask Get(string name, Input<string> id, ImageExportTaskState? state = null, CustomResourceOptions? options = null)
        {
            return new ImageExportTask(name, id, state, options);
        }
    }

    public sealed class ImageExportTaskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the OMI to export.
        /// </summary>
        [Input("imageId", required: true)]
        public Input<string> ImageId { get; set; } = null!;

        [Input("osuExports", required: true)]
        private InputList<Inputs.ImageExportTaskOsuExportArgs>? _osuExports;

        /// <summary>
        /// Information about the OOS export task to create.
        /// </summary>
        public InputList<Inputs.ImageExportTaskOsuExportArgs> OsuExports
        {
            get => _osuExports ?? (_osuExports = new InputList<Inputs.ImageExportTaskOsuExportArgs>());
            set => _osuExports = value;
        }

        [Input("tags")]
        private InputList<Inputs.ImageExportTaskTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.ImageExportTaskTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ImageExportTaskTagArgs>());
            set => _tags = value;
        }

        public ImageExportTaskArgs()
        {
        }
        public static new ImageExportTaskArgs Empty => new ImageExportTaskArgs();
    }

    public sealed class ImageExportTaskState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If the OMI export task fails, an error message appears.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The ID of the OMI to export.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        [Input("osuExports")]
        private InputList<Inputs.ImageExportTaskOsuExportGetArgs>? _osuExports;

        /// <summary>
        /// Information about the OOS export task to create.
        /// </summary>
        public InputList<Inputs.ImageExportTaskOsuExportGetArgs> OsuExports
        {
            get => _osuExports ?? (_osuExports = new InputList<Inputs.ImageExportTaskOsuExportGetArgs>());
            set => _osuExports = value;
        }

        /// <summary>
        /// The progress of the OMI export task, as a percentage.
        /// </summary>
        [Input("progress")]
        public Input<int>? Progress { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputList<Inputs.ImageExportTaskTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.ImageExportTaskTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ImageExportTaskTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the OMI export task.
        /// </summary>
        [Input("taskId")]
        public Input<string>? TaskId { get; set; }

        public ImageExportTaskState()
        {
        }
        public static new ImageExportTaskState Empty => new ImageExportTaskState();
    }
}
