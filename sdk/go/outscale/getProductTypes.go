// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides information about product types.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/Software-Licenses.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-producttype).
//
// ## Example Usage
func GetProductTypes(ctx *pulumi.Context, args *GetProductTypesArgs, opts ...pulumi.InvokeOption) (*GetProductTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProductTypesResult
	err := ctx.Invoke("outscale:index/getProductTypes:getProductTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProductTypes.
type GetProductTypesArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetProductTypesFilter `pulumi:"filters"`
}

// A collection of values returned by getProductTypes.
type GetProductTypesResult struct {
	Filters []GetProductTypesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Information about one or more product types.
	ProductTypes []GetProductTypesProductType `pulumi:"productTypes"`
	RequestId    string                       `pulumi:"requestId"`
}

func GetProductTypesOutput(ctx *pulumi.Context, args GetProductTypesOutputArgs, opts ...pulumi.InvokeOption) GetProductTypesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProductTypesResult, error) {
			args := v.(GetProductTypesArgs)
			r, err := GetProductTypes(ctx, &args, opts...)
			var s GetProductTypesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProductTypesResultOutput)
}

// A collection of arguments for invoking getProductTypes.
type GetProductTypesOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetProductTypesFilterArrayInput `pulumi:"filters"`
}

func (GetProductTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductTypesArgs)(nil)).Elem()
}

// A collection of values returned by getProductTypes.
type GetProductTypesResultOutput struct{ *pulumi.OutputState }

func (GetProductTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductTypesResult)(nil)).Elem()
}

func (o GetProductTypesResultOutput) ToGetProductTypesResultOutput() GetProductTypesResultOutput {
	return o
}

func (o GetProductTypesResultOutput) ToGetProductTypesResultOutputWithContext(ctx context.Context) GetProductTypesResultOutput {
	return o
}

func (o GetProductTypesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetProductTypesResult] {
	return pulumix.Output[GetProductTypesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetProductTypesResultOutput) Filters() GetProductTypesFilterArrayOutput {
	return o.ApplyT(func(v GetProductTypesResult) []GetProductTypesFilter { return v.Filters }).(GetProductTypesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetProductTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Information about one or more product types.
func (o GetProductTypesResultOutput) ProductTypes() GetProductTypesProductTypeArrayOutput {
	return o.ApplyT(func(v GetProductTypesResult) []GetProductTypesProductType { return v.ProductTypes }).(GetProductTypesProductTypeArrayOutput)
}

func (o GetProductTypesResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductTypesResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProductTypesResultOutput{})
}
