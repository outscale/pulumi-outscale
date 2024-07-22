// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a snapshot export task.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-snapshot).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/outscale/pulumi-outscale/sdk/go/outscale"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := outscale.LookupSnapshotExportTask(ctx, &outscale.LookupSnapshotExportTaskArgs{
//				Filters: []outscale.GetSnapshotExportTaskFilter{
//					{
//						Name: "task_ids",
//						Values: []string{
//							"snap-export-12345678",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSnapshotExportTask(ctx *pulumi.Context, args *LookupSnapshotExportTaskArgs, opts ...pulumi.InvokeOption) (*LookupSnapshotExportTaskResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSnapshotExportTaskResult
	err := ctx.Invoke("outscale:index/getSnapshotExportTask:getSnapshotExportTask", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshotExportTask.
type LookupSnapshotExportTaskArgs struct {
	DryRun *bool `pulumi:"dryRun"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetSnapshotExportTaskFilter `pulumi:"filters"`
}

// A collection of values returned by getSnapshotExportTask.
type LookupSnapshotExportTaskResult struct {
	// If the snapshot export task fails, an error message appears.
	Comment string                        `pulumi:"comment"`
	DryRun  bool                          `pulumi:"dryRun"`
	Filters []GetSnapshotExportTaskFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Information about the snapshot export task.
	OsuExports []GetSnapshotExportTaskOsuExport `pulumi:"osuExports"`
	// The progress of the snapshot export task, as a percentage.
	Progress  int    `pulumi:"progress"`
	RequestId string `pulumi:"requestId"`
	// The ID of the snapshot to be exported.
	SnapshotId string `pulumi:"snapshotId"`
	// The state of the snapshot export task (`pending` \| `active` \| `completed` \| `failed`).
	State string `pulumi:"state"`
	// One or more tags associated with the snapshot export task.
	Tags []GetSnapshotExportTaskTag `pulumi:"tags"`
	// The ID of the snapshot export task.
	TaskId string `pulumi:"taskId"`
}

func LookupSnapshotExportTaskOutput(ctx *pulumi.Context, args LookupSnapshotExportTaskOutputArgs, opts ...pulumi.InvokeOption) LookupSnapshotExportTaskResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSnapshotExportTaskResult, error) {
			args := v.(LookupSnapshotExportTaskArgs)
			r, err := LookupSnapshotExportTask(ctx, &args, opts...)
			var s LookupSnapshotExportTaskResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSnapshotExportTaskResultOutput)
}

// A collection of arguments for invoking getSnapshotExportTask.
type LookupSnapshotExportTaskOutputArgs struct {
	DryRun pulumi.BoolPtrInput `pulumi:"dryRun"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetSnapshotExportTaskFilterArrayInput `pulumi:"filters"`
}

func (LookupSnapshotExportTaskOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnapshotExportTaskArgs)(nil)).Elem()
}

// A collection of values returned by getSnapshotExportTask.
type LookupSnapshotExportTaskResultOutput struct{ *pulumi.OutputState }

func (LookupSnapshotExportTaskResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnapshotExportTaskResult)(nil)).Elem()
}

func (o LookupSnapshotExportTaskResultOutput) ToLookupSnapshotExportTaskResultOutput() LookupSnapshotExportTaskResultOutput {
	return o
}

func (o LookupSnapshotExportTaskResultOutput) ToLookupSnapshotExportTaskResultOutputWithContext(ctx context.Context) LookupSnapshotExportTaskResultOutput {
	return o
}

// If the snapshot export task fails, an error message appears.
func (o LookupSnapshotExportTaskResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) string { return v.Comment }).(pulumi.StringOutput)
}

func (o LookupSnapshotExportTaskResultOutput) DryRun() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) bool { return v.DryRun }).(pulumi.BoolOutput)
}

func (o LookupSnapshotExportTaskResultOutput) Filters() GetSnapshotExportTaskFilterArrayOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) []GetSnapshotExportTaskFilter { return v.Filters }).(GetSnapshotExportTaskFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSnapshotExportTaskResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) string { return v.Id }).(pulumi.StringOutput)
}

// Information about the snapshot export task.
func (o LookupSnapshotExportTaskResultOutput) OsuExports() GetSnapshotExportTaskOsuExportArrayOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) []GetSnapshotExportTaskOsuExport { return v.OsuExports }).(GetSnapshotExportTaskOsuExportArrayOutput)
}

// The progress of the snapshot export task, as a percentage.
func (o LookupSnapshotExportTaskResultOutput) Progress() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) int { return v.Progress }).(pulumi.IntOutput)
}

func (o LookupSnapshotExportTaskResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// The ID of the snapshot to be exported.
func (o LookupSnapshotExportTaskResultOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) string { return v.SnapshotId }).(pulumi.StringOutput)
}

// The state of the snapshot export task (`pending` \| `active` \| `completed` \| `failed`).
func (o LookupSnapshotExportTaskResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) string { return v.State }).(pulumi.StringOutput)
}

// One or more tags associated with the snapshot export task.
func (o LookupSnapshotExportTaskResultOutput) Tags() GetSnapshotExportTaskTagArrayOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) []GetSnapshotExportTaskTag { return v.Tags }).(GetSnapshotExportTaskTagArrayOutput)
}

// The ID of the snapshot export task.
func (o LookupSnapshotExportTaskResultOutput) TaskId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnapshotExportTaskResult) string { return v.TaskId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSnapshotExportTaskResultOutput{})
}
