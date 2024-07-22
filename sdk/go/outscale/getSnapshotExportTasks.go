// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about snapshot export tasks.
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
//			_, err := outscale.GetSnapshotExportTasks(ctx, &outscale.GetSnapshotExportTasksArgs{
//				Filters: []outscale.GetSnapshotExportTasksFilter{
//					{
//						Name: "task_ids",
//						Values: []string{
//							"snap-export-12345678",
//							"snap-export-87654321",
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
func GetSnapshotExportTasks(ctx *pulumi.Context, args *GetSnapshotExportTasksArgs, opts ...pulumi.InvokeOption) (*GetSnapshotExportTasksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSnapshotExportTasksResult
	err := ctx.Invoke("outscale:index/getSnapshotExportTasks:getSnapshotExportTasks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshotExportTasks.
type GetSnapshotExportTasksArgs struct {
	DryRun *bool `pulumi:"dryRun"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetSnapshotExportTasksFilter `pulumi:"filters"`
}

// A collection of values returned by getSnapshotExportTasks.
type GetSnapshotExportTasksResult struct {
	DryRun  bool                           `pulumi:"dryRun"`
	Filters []GetSnapshotExportTasksFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	RequestId string `pulumi:"requestId"`
	// Information about one or more snapshot export tasks.
	SnapshotExportTasks []GetSnapshotExportTasksSnapshotExportTask `pulumi:"snapshotExportTasks"`
}

func GetSnapshotExportTasksOutput(ctx *pulumi.Context, args GetSnapshotExportTasksOutputArgs, opts ...pulumi.InvokeOption) GetSnapshotExportTasksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSnapshotExportTasksResult, error) {
			args := v.(GetSnapshotExportTasksArgs)
			r, err := GetSnapshotExportTasks(ctx, &args, opts...)
			var s GetSnapshotExportTasksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSnapshotExportTasksResultOutput)
}

// A collection of arguments for invoking getSnapshotExportTasks.
type GetSnapshotExportTasksOutputArgs struct {
	DryRun pulumi.BoolPtrInput `pulumi:"dryRun"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetSnapshotExportTasksFilterArrayInput `pulumi:"filters"`
}

func (GetSnapshotExportTasksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotExportTasksArgs)(nil)).Elem()
}

// A collection of values returned by getSnapshotExportTasks.
type GetSnapshotExportTasksResultOutput struct{ *pulumi.OutputState }

func (GetSnapshotExportTasksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotExportTasksResult)(nil)).Elem()
}

func (o GetSnapshotExportTasksResultOutput) ToGetSnapshotExportTasksResultOutput() GetSnapshotExportTasksResultOutput {
	return o
}

func (o GetSnapshotExportTasksResultOutput) ToGetSnapshotExportTasksResultOutputWithContext(ctx context.Context) GetSnapshotExportTasksResultOutput {
	return o
}

func (o GetSnapshotExportTasksResultOutput) DryRun() pulumi.BoolOutput {
	return o.ApplyT(func(v GetSnapshotExportTasksResult) bool { return v.DryRun }).(pulumi.BoolOutput)
}

func (o GetSnapshotExportTasksResultOutput) Filters() GetSnapshotExportTasksFilterArrayOutput {
	return o.ApplyT(func(v GetSnapshotExportTasksResult) []GetSnapshotExportTasksFilter { return v.Filters }).(GetSnapshotExportTasksFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSnapshotExportTasksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotExportTasksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSnapshotExportTasksResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotExportTasksResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// Information about one or more snapshot export tasks.
func (o GetSnapshotExportTasksResultOutput) SnapshotExportTasks() GetSnapshotExportTasksSnapshotExportTaskArrayOutput {
	return o.ApplyT(func(v GetSnapshotExportTasksResult) []GetSnapshotExportTasksSnapshotExportTask {
		return v.SnapshotExportTasks
	}).(GetSnapshotExportTasksSnapshotExportTaskArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSnapshotExportTasksResultOutput{})
}
