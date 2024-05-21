// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about the flexible GPU catalog.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readflexiblegpucatalog).
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
//			_, err := outscale.GetFlexibleGpuCatalog(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetFlexibleGpuCatalog(ctx *pulumi.Context, args *GetFlexibleGpuCatalogArgs, opts ...pulumi.InvokeOption) (*GetFlexibleGpuCatalogResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFlexibleGpuCatalogResult
	err := ctx.Invoke("outscale:index/getFlexibleGpuCatalog:getFlexibleGpuCatalog", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFlexibleGpuCatalog.
type GetFlexibleGpuCatalogArgs struct {
	Filters []GetFlexibleGpuCatalogFilter `pulumi:"filters"`
}

// A collection of values returned by getFlexibleGpuCatalog.
type GetFlexibleGpuCatalogResult struct {
	Filters []GetFlexibleGpuCatalogFilter `pulumi:"filters"`
	// Information about one or more fGPUs available in the public catalog.
	FlexibleGpuCatalogs []GetFlexibleGpuCatalogFlexibleGpuCatalog `pulumi:"flexibleGpuCatalogs"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	RequestId string `pulumi:"requestId"`
}

func GetFlexibleGpuCatalogOutput(ctx *pulumi.Context, args GetFlexibleGpuCatalogOutputArgs, opts ...pulumi.InvokeOption) GetFlexibleGpuCatalogResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFlexibleGpuCatalogResult, error) {
			args := v.(GetFlexibleGpuCatalogArgs)
			r, err := GetFlexibleGpuCatalog(ctx, &args, opts...)
			var s GetFlexibleGpuCatalogResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFlexibleGpuCatalogResultOutput)
}

// A collection of arguments for invoking getFlexibleGpuCatalog.
type GetFlexibleGpuCatalogOutputArgs struct {
	Filters GetFlexibleGpuCatalogFilterArrayInput `pulumi:"filters"`
}

func (GetFlexibleGpuCatalogOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFlexibleGpuCatalogArgs)(nil)).Elem()
}

// A collection of values returned by getFlexibleGpuCatalog.
type GetFlexibleGpuCatalogResultOutput struct{ *pulumi.OutputState }

func (GetFlexibleGpuCatalogResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFlexibleGpuCatalogResult)(nil)).Elem()
}

func (o GetFlexibleGpuCatalogResultOutput) ToGetFlexibleGpuCatalogResultOutput() GetFlexibleGpuCatalogResultOutput {
	return o
}

func (o GetFlexibleGpuCatalogResultOutput) ToGetFlexibleGpuCatalogResultOutputWithContext(ctx context.Context) GetFlexibleGpuCatalogResultOutput {
	return o
}

func (o GetFlexibleGpuCatalogResultOutput) Filters() GetFlexibleGpuCatalogFilterArrayOutput {
	return o.ApplyT(func(v GetFlexibleGpuCatalogResult) []GetFlexibleGpuCatalogFilter { return v.Filters }).(GetFlexibleGpuCatalogFilterArrayOutput)
}

// Information about one or more fGPUs available in the public catalog.
func (o GetFlexibleGpuCatalogResultOutput) FlexibleGpuCatalogs() GetFlexibleGpuCatalogFlexibleGpuCatalogArrayOutput {
	return o.ApplyT(func(v GetFlexibleGpuCatalogResult) []GetFlexibleGpuCatalogFlexibleGpuCatalog {
		return v.FlexibleGpuCatalogs
	}).(GetFlexibleGpuCatalogFlexibleGpuCatalogArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFlexibleGpuCatalogResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexibleGpuCatalogResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetFlexibleGpuCatalogResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlexibleGpuCatalogResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFlexibleGpuCatalogResultOutput{})
}