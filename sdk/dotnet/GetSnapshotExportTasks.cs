// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetSnapshotExportTasks
    {
        /// <summary>
        /// Provides information about snapshot export tasks.
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
        ///     var snapshotExportTasks01 = Outscale.GetSnapshotExportTasks.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSnapshotExportTasksFilterInputArgs
        ///             {
        ///                 Name = "task_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "snap-export-12345678",
        ///                     "snap-export-87654321",
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
        public static Task<GetSnapshotExportTasksResult> InvokeAsync(GetSnapshotExportTasksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSnapshotExportTasksResult>("outscale:index/getSnapshotExportTasks:getSnapshotExportTasks", args ?? new GetSnapshotExportTasksArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about snapshot export tasks.
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
        ///     var snapshotExportTasks01 = Outscale.GetSnapshotExportTasks.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Outscale.Inputs.GetSnapshotExportTasksFilterInputArgs
        ///             {
        ///                 Name = "task_ids",
        ///                 Values = new[]
        ///                 {
        ///                     "snap-export-12345678",
        ///                     "snap-export-87654321",
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
        public static Output<GetSnapshotExportTasksResult> Invoke(GetSnapshotExportTasksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnapshotExportTasksResult>("outscale:index/getSnapshotExportTasks:getSnapshotExportTasks", args ?? new GetSnapshotExportTasksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSnapshotExportTasksArgs : global::Pulumi.InvokeArgs
    {
        [Input("dryRun")]
        public bool? DryRun { get; set; }

        [Input("filters")]
        private List<Inputs.GetSnapshotExportTasksFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetSnapshotExportTasksFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetSnapshotExportTasksFilterArgs>());
            set => _filters = value;
        }

        public GetSnapshotExportTasksArgs()
        {
        }
        public static new GetSnapshotExportTasksArgs Empty => new GetSnapshotExportTasksArgs();
    }

    public sealed class GetSnapshotExportTasksInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        [Input("filters")]
        private InputList<Inputs.GetSnapshotExportTasksFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetSnapshotExportTasksFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetSnapshotExportTasksFilterInputArgs>());
            set => _filters = value;
        }

        public GetSnapshotExportTasksInvokeArgs()
        {
        }
        public static new GetSnapshotExportTasksInvokeArgs Empty => new GetSnapshotExportTasksInvokeArgs();
    }


    [OutputType]
    public sealed class GetSnapshotExportTasksResult
    {
        public readonly bool DryRun;
        public readonly ImmutableArray<Outputs.GetSnapshotExportTasksFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string RequestId;
        /// <summary>
        /// Information about one or more snapshot export tasks.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSnapshotExportTasksSnapshotExportTaskResult> SnapshotExportTasks;

        [OutputConstructor]
        private GetSnapshotExportTasksResult(
            bool dryRun,

            ImmutableArray<Outputs.GetSnapshotExportTasksFilterResult> filters,

            string id,

            string requestId,

            ImmutableArray<Outputs.GetSnapshotExportTasksSnapshotExportTaskResult> snapshotExportTasks)
        {
            DryRun = dryRun;
            Filters = filters;
            Id = id;
            RequestId = requestId;
            SnapshotExportTasks = snapshotExportTasks;
        }
    }
}
