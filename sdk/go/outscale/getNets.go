// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Nets.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-net).
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
//			_, err := outscale.GetNets(ctx, &outscale.GetNetsArgs{
//				Filters: []outscale.GetNetsFilter{
//					{
//						Name: "net_ids",
//						Values: []string{
//							"vpc-12345678",
//							"vpc-87654321",
//						},
//					},
//					{
//						Name: "ip_ranges",
//						Values: []string{
//							"10.0.0.0/16",
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
func GetNets(ctx *pulumi.Context, args *GetNetsArgs, opts ...pulumi.InvokeOption) (*GetNetsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetsResult
	err := ctx.Invoke("outscale:index/getNets:getNets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNets.
type GetNetsArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetNetsFilter `pulumi:"filters"`
	// The ID of the Net.
	NetIds []string `pulumi:"netIds"`
}

// A collection of values returned by getNets.
type GetNetsResult struct {
	Filters []GetNetsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the Net.
	NetIds []string `pulumi:"netIds"`
	// Information about the described Nets.
	Nets      []GetNetsNet `pulumi:"nets"`
	RequestId string       `pulumi:"requestId"`
}

func GetNetsOutput(ctx *pulumi.Context, args GetNetsOutputArgs, opts ...pulumi.InvokeOption) GetNetsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetsResult, error) {
			args := v.(GetNetsArgs)
			r, err := GetNets(ctx, &args, opts...)
			var s GetNetsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetsResultOutput)
}

// A collection of arguments for invoking getNets.
type GetNetsOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetNetsFilterArrayInput `pulumi:"filters"`
	// The ID of the Net.
	NetIds pulumi.StringArrayInput `pulumi:"netIds"`
}

func (GetNetsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetsArgs)(nil)).Elem()
}

// A collection of values returned by getNets.
type GetNetsResultOutput struct{ *pulumi.OutputState }

func (GetNetsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetsResult)(nil)).Elem()
}

func (o GetNetsResultOutput) ToGetNetsResultOutput() GetNetsResultOutput {
	return o
}

func (o GetNetsResultOutput) ToGetNetsResultOutputWithContext(ctx context.Context) GetNetsResultOutput {
	return o
}

func (o GetNetsResultOutput) Filters() GetNetsFilterArrayOutput {
	return o.ApplyT(func(v GetNetsResult) []GetNetsFilter { return v.Filters }).(GetNetsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the Net.
func (o GetNetsResultOutput) NetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNetsResult) []string { return v.NetIds }).(pulumi.StringArrayOutput)
}

// Information about the described Nets.
func (o GetNetsResultOutput) Nets() GetNetsNetArrayOutput {
	return o.ApplyT(func(v GetNetsResult) []GetNetsNet { return v.Nets }).(GetNetsNetArrayOutput)
}

func (o GetNetsResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetsResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetsResultOutput{})
}
