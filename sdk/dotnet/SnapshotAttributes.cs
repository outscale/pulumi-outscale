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
    /// Manages snapshot attributes.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updatesnapshot).
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
    ///         SubregionName = "eu-west-2a",
    ///         Size = 40,
    ///     });
    /// 
    ///     var snapshot01 = new Outscale.Snapshot("snapshot01", new()
    ///     {
    ///         VolumeId = volume01.VolumeId,
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.SnapshotTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-snapshot-test",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Add permissions
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var snapshotAttributes01 = new Outscale.SnapshotAttributes("snapshotAttributes01", new()
    ///     {
    ///         SnapshotId = outscale_snapshot.Snapshot01.Snapshot_id,
    ///         PermissionsToCreateVolumeAdditions = new Outscale.Inputs.SnapshotAttributesPermissionsToCreateVolumeAdditionsArgs
    ///         {
    ///             AccountIds = new[]
    ///             {
    ///                 "012345678910",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Remove permissions
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var snapshotAttributes02 = new Outscale.SnapshotAttributes("snapshotAttributes02", new()
    ///     {
    ///         SnapshotId = outscale_snapshot.Snapshot01.Snapshot_id,
    ///         PermissionsToCreateVolumeRemovals = new[]
    ///         {
    ///             new Outscale.Inputs.SnapshotAttributesPermissionsToCreateVolumeRemovalArgs
    ///             {
    ///                 AccountIds = new[]
    ///                 {
    ///                     "012345678910",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/snapshotAttributes:SnapshotAttributes")]
    public partial class SnapshotAttributes : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account ID of the owner of the snapshot.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Information about the users to whom you want to give permissions for the resource.
        /// </summary>
        [Output("permissionsToCreateVolumeAdditions")]
        public Output<Outputs.SnapshotAttributesPermissionsToCreateVolumeAdditions?> PermissionsToCreateVolumeAdditions { get; private set; } = null!;

        /// <summary>
        /// Information about the users from whom you want to remove permissions for the resource.
        /// </summary>
        [Output("permissionsToCreateVolumeRemovals")]
        public Output<ImmutableArray<Outputs.SnapshotAttributesPermissionsToCreateVolumeRemoval>> PermissionsToCreateVolumeRemovals { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The ID of the snapshot.
        /// </summary>
        [Output("snapshotId")]
        public Output<string> SnapshotId { get; private set; } = null!;


        /// <summary>
        /// Create a SnapshotAttributes resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SnapshotAttributes(string name, SnapshotAttributesArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/snapshotAttributes:SnapshotAttributes", name, args ?? new SnapshotAttributesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SnapshotAttributes(string name, Input<string> id, SnapshotAttributesState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/snapshotAttributes:SnapshotAttributes", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SnapshotAttributes resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SnapshotAttributes Get(string name, Input<string> id, SnapshotAttributesState? state = null, CustomResourceOptions? options = null)
        {
            return new SnapshotAttributes(name, id, state, options);
        }
    }

    public sealed class SnapshotAttributesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Information about the users to whom you want to give permissions for the resource.
        /// </summary>
        [Input("permissionsToCreateVolumeAdditions")]
        public Input<Inputs.SnapshotAttributesPermissionsToCreateVolumeAdditionsArgs>? PermissionsToCreateVolumeAdditions { get; set; }

        [Input("permissionsToCreateVolumeRemovals")]
        private InputList<Inputs.SnapshotAttributesPermissionsToCreateVolumeRemovalArgs>? _permissionsToCreateVolumeRemovals;

        /// <summary>
        /// Information about the users from whom you want to remove permissions for the resource.
        /// </summary>
        public InputList<Inputs.SnapshotAttributesPermissionsToCreateVolumeRemovalArgs> PermissionsToCreateVolumeRemovals
        {
            get => _permissionsToCreateVolumeRemovals ?? (_permissionsToCreateVolumeRemovals = new InputList<Inputs.SnapshotAttributesPermissionsToCreateVolumeRemovalArgs>());
            set => _permissionsToCreateVolumeRemovals = value;
        }

        /// <summary>
        /// The ID of the snapshot.
        /// </summary>
        [Input("snapshotId", required: true)]
        public Input<string> SnapshotId { get; set; } = null!;

        public SnapshotAttributesArgs()
        {
        }
        public static new SnapshotAttributesArgs Empty => new SnapshotAttributesArgs();
    }

    public sealed class SnapshotAttributesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID of the owner of the snapshot.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Information about the users to whom you want to give permissions for the resource.
        /// </summary>
        [Input("permissionsToCreateVolumeAdditions")]
        public Input<Inputs.SnapshotAttributesPermissionsToCreateVolumeAdditionsGetArgs>? PermissionsToCreateVolumeAdditions { get; set; }

        [Input("permissionsToCreateVolumeRemovals")]
        private InputList<Inputs.SnapshotAttributesPermissionsToCreateVolumeRemovalGetArgs>? _permissionsToCreateVolumeRemovals;

        /// <summary>
        /// Information about the users from whom you want to remove permissions for the resource.
        /// </summary>
        public InputList<Inputs.SnapshotAttributesPermissionsToCreateVolumeRemovalGetArgs> PermissionsToCreateVolumeRemovals
        {
            get => _permissionsToCreateVolumeRemovals ?? (_permissionsToCreateVolumeRemovals = new InputList<Inputs.SnapshotAttributesPermissionsToCreateVolumeRemovalGetArgs>());
            set => _permissionsToCreateVolumeRemovals = value;
        }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The ID of the snapshot.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public SnapshotAttributesState()
        {
        }
        public static new SnapshotAttributesState Empty => new SnapshotAttributesState();
    }
}