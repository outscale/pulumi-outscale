// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about image export tasks.
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
//			_, err := outscale.GetImageExportTasks(ctx, &outscale.GetImageExportTasksArgs{
//				Filters: []outscale.GetImageExportTasksFilter{
//					{
//						Name: "task_ids",
//						Values: []string{
//							"image-export-12345678",
//							"image-export-87654321",
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
func GetImageExportTasks(ctx *pulumi.Context, args *GetImageExportTasksArgs, opts ...pulumi.InvokeOption) (*GetImageExportTasksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetImageExportTasksResult
	err := ctx.Invoke("outscale:index/getImageExportTasks:getImageExportTasks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImageExportTasks.
type GetImageExportTasksArgs struct {
	DryRun *bool `pulumi:"dryRun"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetImageExportTasksFilter `pulumi:"filters"`
}

// A collection of values returned by getImageExportTasks.
type GetImageExportTasksResult struct {
	DryRun  bool                        `pulumi:"dryRun"`
	Filters []GetImageExportTasksFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Information about one or more image export tasks.
	ImageExportTasks []GetImageExportTasksImageExportTask `pulumi:"imageExportTasks"`
	RequestId        string                               `pulumi:"requestId"`
}

func GetImageExportTasksOutput(ctx *pulumi.Context, args GetImageExportTasksOutputArgs, opts ...pulumi.InvokeOption) GetImageExportTasksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetImageExportTasksResult, error) {
			args := v.(GetImageExportTasksArgs)
			r, err := GetImageExportTasks(ctx, &args, opts...)
			var s GetImageExportTasksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetImageExportTasksResultOutput)
}

// A collection of arguments for invoking getImageExportTasks.
type GetImageExportTasksOutputArgs struct {
	DryRun pulumi.BoolPtrInput `pulumi:"dryRun"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetImageExportTasksFilterArrayInput `pulumi:"filters"`
}

func (GetImageExportTasksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImageExportTasksArgs)(nil)).Elem()
}

// A collection of values returned by getImageExportTasks.
type GetImageExportTasksResultOutput struct{ *pulumi.OutputState }

func (GetImageExportTasksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImageExportTasksResult)(nil)).Elem()
}

func (o GetImageExportTasksResultOutput) ToGetImageExportTasksResultOutput() GetImageExportTasksResultOutput {
	return o
}

func (o GetImageExportTasksResultOutput) ToGetImageExportTasksResultOutputWithContext(ctx context.Context) GetImageExportTasksResultOutput {
	return o
}

func (o GetImageExportTasksResultOutput) DryRun() pulumi.BoolOutput {
	return o.ApplyT(func(v GetImageExportTasksResult) bool { return v.DryRun }).(pulumi.BoolOutput)
}

func (o GetImageExportTasksResultOutput) Filters() GetImageExportTasksFilterArrayOutput {
	return o.ApplyT(func(v GetImageExportTasksResult) []GetImageExportTasksFilter { return v.Filters }).(GetImageExportTasksFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetImageExportTasksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageExportTasksResult) string { return v.Id }).(pulumi.StringOutput)
}

// Information about one or more image export tasks.
func (o GetImageExportTasksResultOutput) ImageExportTasks() GetImageExportTasksImageExportTaskArrayOutput {
	return o.ApplyT(func(v GetImageExportTasksResult) []GetImageExportTasksImageExportTask { return v.ImageExportTasks }).(GetImageExportTasksImageExportTaskArrayOutput)
}

func (o GetImageExportTasksResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetImageExportTasksResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetImageExportTasksResultOutput{})
}
