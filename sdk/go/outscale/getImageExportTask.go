// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about an image export task.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).
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
//			_, err := outscale.LookupImageExportTask(ctx, &outscale.LookupImageExportTaskArgs{
//				Filters: []outscale.GetImageExportTaskFilter{
//					{
//						Name: "task_ids",
//						Values: []string{
//							"image-export-12345678",
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
func LookupImageExportTask(ctx *pulumi.Context, args *LookupImageExportTaskArgs, opts ...pulumi.InvokeOption) (*LookupImageExportTaskResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupImageExportTaskResult
	err := ctx.Invoke("outscale:index/getImageExportTask:getImageExportTask", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImageExportTask.
type LookupImageExportTaskArgs struct {
	DryRun *bool `pulumi:"dryRun"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetImageExportTaskFilter `pulumi:"filters"`
}

// A collection of values returned by getImageExportTask.
type LookupImageExportTaskResult struct {
	// If the OMI export task fails, an error message appears.
	Comment string                     `pulumi:"comment"`
	DryRun  bool                       `pulumi:"dryRun"`
	Filters []GetImageExportTaskFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the OMI to be exported.
	ImageId string `pulumi:"imageId"`
	// Information about the OMI export task.
	OsuExports []GetImageExportTaskOsuExport `pulumi:"osuExports"`
	// The progress of the OMI export task, as a percentage.
	Progress  int    `pulumi:"progress"`
	RequestId string `pulumi:"requestId"`
	// The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
	State string `pulumi:"state"`
	// One or more tags associated with the image export task.
	Tags []GetImageExportTaskTag `pulumi:"tags"`
	// The ID of the OMI export task.
	TaskId string `pulumi:"taskId"`
}

func LookupImageExportTaskOutput(ctx *pulumi.Context, args LookupImageExportTaskOutputArgs, opts ...pulumi.InvokeOption) LookupImageExportTaskResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupImageExportTaskResult, error) {
			args := v.(LookupImageExportTaskArgs)
			r, err := LookupImageExportTask(ctx, &args, opts...)
			var s LookupImageExportTaskResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupImageExportTaskResultOutput)
}

// A collection of arguments for invoking getImageExportTask.
type LookupImageExportTaskOutputArgs struct {
	DryRun pulumi.BoolPtrInput `pulumi:"dryRun"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetImageExportTaskFilterArrayInput `pulumi:"filters"`
}

func (LookupImageExportTaskOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupImageExportTaskArgs)(nil)).Elem()
}

// A collection of values returned by getImageExportTask.
type LookupImageExportTaskResultOutput struct{ *pulumi.OutputState }

func (LookupImageExportTaskResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupImageExportTaskResult)(nil)).Elem()
}

func (o LookupImageExportTaskResultOutput) ToLookupImageExportTaskResultOutput() LookupImageExportTaskResultOutput {
	return o
}

func (o LookupImageExportTaskResultOutput) ToLookupImageExportTaskResultOutputWithContext(ctx context.Context) LookupImageExportTaskResultOutput {
	return o
}

// If the OMI export task fails, an error message appears.
func (o LookupImageExportTaskResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) string { return v.Comment }).(pulumi.StringOutput)
}

func (o LookupImageExportTaskResultOutput) DryRun() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) bool { return v.DryRun }).(pulumi.BoolOutput)
}

func (o LookupImageExportTaskResultOutput) Filters() GetImageExportTaskFilterArrayOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) []GetImageExportTaskFilter { return v.Filters }).(GetImageExportTaskFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupImageExportTaskResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the OMI to be exported.
func (o LookupImageExportTaskResultOutput) ImageId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) string { return v.ImageId }).(pulumi.StringOutput)
}

// Information about the OMI export task.
func (o LookupImageExportTaskResultOutput) OsuExports() GetImageExportTaskOsuExportArrayOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) []GetImageExportTaskOsuExport { return v.OsuExports }).(GetImageExportTaskOsuExportArrayOutput)
}

// The progress of the OMI export task, as a percentage.
func (o LookupImageExportTaskResultOutput) Progress() pulumi.IntOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) int { return v.Progress }).(pulumi.IntOutput)
}

func (o LookupImageExportTaskResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// The state of the OMI export task (`pending/queued` \| `pending` \| `completed` \| `failed` \| `cancelled`).
func (o LookupImageExportTaskResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) string { return v.State }).(pulumi.StringOutput)
}

// One or more tags associated with the image export task.
func (o LookupImageExportTaskResultOutput) Tags() GetImageExportTaskTagArrayOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) []GetImageExportTaskTag { return v.Tags }).(GetImageExportTaskTagArrayOutput)
}

// The ID of the OMI export task.
func (o LookupImageExportTaskResultOutput) TaskId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageExportTaskResult) string { return v.TaskId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupImageExportTaskResultOutput{})
}
