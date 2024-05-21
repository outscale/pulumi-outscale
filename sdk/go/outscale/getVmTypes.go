// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about VM types.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/Instance-Types.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmtypes).
//
// ## Example Usage
// ### All types of VMs
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
//			_, err := outscale.GetVmTypes(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### VMs optimized for Block Storage Unit (BSU)
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
//			_, err := outscale.GetVmTypes(ctx, &outscale.GetVmTypesArgs{
//				Filters: []outscale.GetVmTypesFilter{
//					{
//						Name: "bsu_optimized",
//						Values: []string{
//							"true",
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
// ### Specific VM type
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
//			_, err := outscale.GetVmTypes(ctx, &outscale.GetVmTypesArgs{
//				Filters: []outscale.GetVmTypesFilter{
//					{
//						Name: "vm_type_names",
//						Values: []string{
//							"m3.large",
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
func GetVmTypes(ctx *pulumi.Context, args *GetVmTypesArgs, opts ...pulumi.InvokeOption) (*GetVmTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVmTypesResult
	err := ctx.Invoke("outscale:index/getVmTypes:getVmTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVmTypes.
type GetVmTypesArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetVmTypesFilter `pulumi:"filters"`
}

// A collection of values returned by getVmTypes.
type GetVmTypesResult struct {
	Filters []GetVmTypesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	RequestId string `pulumi:"requestId"`
	// Information about one or more VM types.
	VmTypes []GetVmTypesVmType `pulumi:"vmTypes"`
}

func GetVmTypesOutput(ctx *pulumi.Context, args GetVmTypesOutputArgs, opts ...pulumi.InvokeOption) GetVmTypesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVmTypesResult, error) {
			args := v.(GetVmTypesArgs)
			r, err := GetVmTypes(ctx, &args, opts...)
			var s GetVmTypesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVmTypesResultOutput)
}

// A collection of arguments for invoking getVmTypes.
type GetVmTypesOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetVmTypesFilterArrayInput `pulumi:"filters"`
}

func (GetVmTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVmTypesArgs)(nil)).Elem()
}

// A collection of values returned by getVmTypes.
type GetVmTypesResultOutput struct{ *pulumi.OutputState }

func (GetVmTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVmTypesResult)(nil)).Elem()
}

func (o GetVmTypesResultOutput) ToGetVmTypesResultOutput() GetVmTypesResultOutput {
	return o
}

func (o GetVmTypesResultOutput) ToGetVmTypesResultOutputWithContext(ctx context.Context) GetVmTypesResultOutput {
	return o
}

func (o GetVmTypesResultOutput) Filters() GetVmTypesFilterArrayOutput {
	return o.ApplyT(func(v GetVmTypesResult) []GetVmTypesFilter { return v.Filters }).(GetVmTypesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVmTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVmTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVmTypesResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVmTypesResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// Information about one or more VM types.
func (o GetVmTypesResultOutput) VmTypes() GetVmTypesVmTypeArrayOutput {
	return o.ApplyT(func(v GetVmTypesResult) []GetVmTypesVmType { return v.VmTypes }).(GetVmTypesVmTypeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVmTypesResultOutput{})
}