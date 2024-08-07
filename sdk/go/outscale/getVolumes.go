// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about volumes.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Volumes.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-volume).
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
//			_, err := outscale.GetVolumes(ctx, &outscale.GetVolumesArgs{
//				Filters: []outscale.GetVolumesFilter{
//					{
//						Name: "volume_states",
//						Values: []string{
//							"in-use",
//						},
//					},
//					{
//						Name: "volume_types",
//						Values: []string{
//							"gp2",
//							"io1",
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
func GetVolumes(ctx *pulumi.Context, args *GetVolumesArgs, opts ...pulumi.InvokeOption) (*GetVolumesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVolumesResult
	err := ctx.Invoke("outscale:index/getVolumes:getVolumes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolumes.
type GetVolumesArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters   []GetVolumesFilter `pulumi:"filters"`
	RequestId *string            `pulumi:"requestId"`
	// The ID of the volume.
	VolumeId *string `pulumi:"volumeId"`
}

// A collection of values returned by getVolumes.
type GetVolumesResult struct {
	Filters []GetVolumesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string  `pulumi:"id"`
	RequestId *string `pulumi:"requestId"`
	// The ID of the volume.
	VolumeId *string `pulumi:"volumeId"`
	// Information about one or more volumes.
	Volumes []GetVolumesVolume `pulumi:"volumes"`
}

func GetVolumesOutput(ctx *pulumi.Context, args GetVolumesOutputArgs, opts ...pulumi.InvokeOption) GetVolumesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVolumesResult, error) {
			args := v.(GetVolumesArgs)
			r, err := GetVolumes(ctx, &args, opts...)
			var s GetVolumesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVolumesResultOutput)
}

// A collection of arguments for invoking getVolumes.
type GetVolumesOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters   GetVolumesFilterArrayInput `pulumi:"filters"`
	RequestId pulumi.StringPtrInput      `pulumi:"requestId"`
	// The ID of the volume.
	VolumeId pulumi.StringPtrInput `pulumi:"volumeId"`
}

func (GetVolumesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesArgs)(nil)).Elem()
}

// A collection of values returned by getVolumes.
type GetVolumesResultOutput struct{ *pulumi.OutputState }

func (GetVolumesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesResult)(nil)).Elem()
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutput() GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutputWithContext(ctx context.Context) GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) Filters() GetVolumesFilterArrayOutput {
	return o.ApplyT(func(v GetVolumesResult) []GetVolumesFilter { return v.Filters }).(GetVolumesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVolumesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVolumesResultOutput) RequestId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.RequestId }).(pulumi.StringPtrOutput)
}

// The ID of the volume.
func (o GetVolumesResultOutput) VolumeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.VolumeId }).(pulumi.StringPtrOutput)
}

// Information about one or more volumes.
func (o GetVolumesResultOutput) Volumes() GetVolumesVolumeArrayOutput {
	return o.ApplyT(func(v GetVolumesResult) []GetVolumesVolume { return v.Volumes }).(GetVolumesVolumeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVolumesResultOutput{})
}
