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
    /// Manages a volume.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Volumes.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-volume).
    /// 
    /// ## Example Usage
    /// ### Creating an io1 volume
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
    ///         Iops = 100,
    ///         Size = 10,
    ///         SubregionName = $"{@var.Region}a",
    ///         VolumeType = "io1",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Creating a snapshot before volume deletion
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
    ///         Size = 40,
    ///         SubregionName = $"{@var.Region}a",
    ///         TerminationSnapshotName = "deleting_volume_snap",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A volume can be imported using its ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/volume:Volume ImportedVolume vol-12345678
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/volume:Volume")]
    public partial class Volume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The date and time of creation of the volume.
        /// </summary>
        [Output("creationDate")]
        public Output<string> CreationDate { get; private set; } = null!;

        /// <summary>
        /// The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
        /// </summary>
        [Output("iops")]
        public Output<int> Iops { get; private set; } = null!;

        /// <summary>
        /// Information about your volume attachment.
        /// </summary>
        [Output("linkedVolumes")]
        public Output<ImmutableArray<Outputs.VolumeLinkedVolume>> LinkedVolumes { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The size of the volume, in gibibytes (GiB). The maximum allowed size for a volume is 14901 GiB. This parameter is required if the volume is not created from a snapshot (`snapshot_id` unspecified).
        /// </summary>
        [Output("size")]
        public Output<int> Size { get; private set; } = null!;

        /// <summary>
        /// The ID of the snapshot from which you want to create the volume.
        /// </summary>
        [Output("snapshotId")]
        public Output<string> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// The state of the volume (`creating` \| `available` \| `in-use` \| `updating` \| `deleting` \| `error`).
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The Subregion in which you want to create the volume.
        /// </summary>
        [Output("subregionName")]
        public Output<string> SubregionName { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.VolumeTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Whether you want to create a snapshot before the volume deletion.
        /// </summary>
        [Output("terminationSnapshotName")]
        public Output<string?> TerminationSnapshotName { get; private set; } = null!;

        /// <summary>
        /// The ID of the volume.
        /// </summary>
        [Output("volumeId")]
        public Output<string> VolumeId { get; private set; } = null!;

        /// <summary>
        /// The type of volume you want to create (`io1` \| `gp2` \| `standard`). If not specified, a `standard` volume is created.&lt;br /&gt;
        /// For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
        /// </summary>
        [Output("volumeType")]
        public Output<string> VolumeType { get; private set; } = null!;


        /// <summary>
        /// Create a Volume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Volume(string name, VolumeArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/volume:Volume", name, args ?? new VolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Volume(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/volume:Volume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Volume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Volume Get(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new Volume(name, id, state, options);
        }
    }

    public sealed class VolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
        /// </summary>
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        /// <summary>
        /// The size of the volume, in gibibytes (GiB). The maximum allowed size for a volume is 14901 GiB. This parameter is required if the volume is not created from a snapshot (`snapshot_id` unspecified).
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The ID of the snapshot from which you want to create the volume.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The Subregion in which you want to create the volume.
        /// </summary>
        [Input("subregionName", required: true)]
        public Input<string> SubregionName { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.VolumeTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.VolumeTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.VolumeTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether you want to create a snapshot before the volume deletion.
        /// </summary>
        [Input("terminationSnapshotName")]
        public Input<string>? TerminationSnapshotName { get; set; }

        /// <summary>
        /// The type of volume you want to create (`io1` \| `gp2` \| `standard`). If not specified, a `standard` volume is created.&lt;br /&gt;
        /// For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public VolumeArgs()
        {
        }
        public static new VolumeArgs Empty => new VolumeArgs();
    }

    public sealed class VolumeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time of creation of the volume.
        /// </summary>
        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        /// <summary>
        /// The number of I/O operations per second (IOPS). This parameter must be specified only if you create an `io1` volume. The maximum number of IOPS allowed for `io1` volumes is `13000` with a maximum performance ratio of 300 IOPS per gibibyte.
        /// </summary>
        [Input("iops")]
        public Input<int>? Iops { get; set; }

        [Input("linkedVolumes")]
        private InputList<Inputs.VolumeLinkedVolumeGetArgs>? _linkedVolumes;

        /// <summary>
        /// Information about your volume attachment.
        /// </summary>
        public InputList<Inputs.VolumeLinkedVolumeGetArgs> LinkedVolumes
        {
            get => _linkedVolumes ?? (_linkedVolumes = new InputList<Inputs.VolumeLinkedVolumeGetArgs>());
            set => _linkedVolumes = value;
        }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The size of the volume, in gibibytes (GiB). The maximum allowed size for a volume is 14901 GiB. This parameter is required if the volume is not created from a snapshot (`snapshot_id` unspecified).
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The ID of the snapshot from which you want to create the volume.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The state of the volume (`creating` \| `available` \| `in-use` \| `updating` \| `deleting` \| `error`).
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The Subregion in which you want to create the volume.
        /// </summary>
        [Input("subregionName")]
        public Input<string>? SubregionName { get; set; }

        [Input("tags")]
        private InputList<Inputs.VolumeTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.VolumeTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.VolumeTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether you want to create a snapshot before the volume deletion.
        /// </summary>
        [Input("terminationSnapshotName")]
        public Input<string>? TerminationSnapshotName { get; set; }

        /// <summary>
        /// The ID of the volume.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        /// <summary>
        /// The type of volume you want to create (`io1` \| `gp2` \| `standard`). If not specified, a `standard` volume is created.&lt;br /&gt;
        /// For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public VolumeState()
        {
        }
        public static new VolumeState Empty => new VolumeState();
    }
}