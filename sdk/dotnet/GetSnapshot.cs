// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetSnapshot
    {
        /// <summary>
        /// Provides information about a snapshot.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-snapshot).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Outscale = Pulumi.Outscale;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot01 = Outscale.GetSnapshot.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSnapshotFilterInputArgs
        ///             {
        ///                 Name = "snapshot_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "snap-12345678",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSnapshotResult> InvokeAsync(GetSnapshotArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSnapshotResult>("outscale:index/getSnapshot:getSnapshot", args ?? new GetSnapshotArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a snapshot.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-snapshot).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Outscale = Pulumi.Outscale;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot01 = Outscale.GetSnapshot.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSnapshotFilterInputArgs
        ///             {
        ///                 Name = "snapshot_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "snap-12345678",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSnapshotResult> Invoke(GetSnapshotInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnapshotResult>("outscale:index/getSnapshot:getSnapshot", args ?? new GetSnapshotInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSnapshotArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account ID of the owner of the snapshot.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        [Input("filters")]
        private List<Inputs.GetSnapshotFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetSnapshotFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetSnapshotFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the snapshot.
        /// </summary>
        [Input("snapshotId")]
        public string? SnapshotId { get; set; }

        public GetSnapshotArgs()
        {
        }
        public static new GetSnapshotArgs Empty => new GetSnapshotArgs();
    }

    public sealed class GetSnapshotInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account ID of the owner of the snapshot.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("filters")]
        private InputList<Inputs.GetSnapshotFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetSnapshotFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetSnapshotFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The ID of the snapshot.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        public GetSnapshotInvokeArgs()
        {
        }
        public static new GetSnapshotInvokeArgs Empty => new GetSnapshotInvokeArgs();
    }


    [OutputType]
    public sealed class GetSnapshotResult
    {
        /// <summary>
        /// The account alias of the owner of the snapshot.
        /// </summary>
        public readonly string AccountAlias;
        /// <summary>
        /// The account ID of the owner of the snapshot.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The date and time of creation of the snapshot.
        /// </summary>
        public readonly string CreationDate;
        /// <summary>
        /// The description of the snapshot.
        /// </summary>
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetSnapshotFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Permissions for the resource.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSnapshotPermissionsToCreateVolumeResult> PermissionsToCreateVolumes;
        /// <summary>
        /// The progress of the snapshot, as a percentage.
        /// </summary>
        public readonly int Progress;
        public readonly string RequestId;
        /// <summary>
        /// The ID of the snapshot.
        /// </summary>
        public readonly string SnapshotId;
        /// <summary>
        /// The state of the snapshot (`in-queue` \| `completed` \| `error`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// One or more tags associated with the snapshot.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSnapshotTagResult> Tags;
        /// <summary>
        /// The ID of the volume used to create the snapshot.
        /// </summary>
        public readonly string VolumeId;
        /// <summary>
        /// The size of the volume used to create the snapshot, in gibibytes (GiB).
        /// </summary>
        public readonly int VolumeSize;

        [OutputConstructor]
        private GetSnapshotResult(
            string accountAlias,

            string accountId,

            string creationDate,

            string description,

            ImmutableArray<Outputs.GetSnapshotFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetSnapshotPermissionsToCreateVolumeResult> permissionsToCreateVolumes,

            int progress,

            string requestId,

            string snapshotId,

            string state,

            ImmutableArray<Outputs.GetSnapshotTagResult> tags,

            string volumeId,

            int volumeSize)
        {
            AccountAlias = accountAlias;
            AccountId = accountId;
            CreationDate = creationDate;
            Description = description;
            Filters = filters;
            Id = id;
            PermissionsToCreateVolumes = permissionsToCreateVolumes;
            Progress = progress;
            RequestId = requestId;
            SnapshotId = snapshotId;
            State = state;
            Tags = tags;
            VolumeId = volumeId;
            VolumeSize = volumeSize;
        }
    }
}
