// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Subnets.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-subnet).
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
//			_, err := outscale.GetSubnets(ctx, &outscale.GetSubnetsArgs{
//				Filters: []outscale.GetSubnetsFilter{
//					{
//						Name: "states",
//						Values: []string{
//							"available",
//						},
//					},
//					{
//						Name: "subregion_names",
//						Values: []string{
//							"eu-west-2a",
//							"eu-west-2b",
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
func GetSubnets(ctx *pulumi.Context, args *GetSubnetsArgs, opts ...pulumi.InvokeOption) (*GetSubnetsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSubnetsResult
	err := ctx.Invoke("outscale:index/getSubnets:getSubnets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubnets.
type GetSubnetsArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetSubnetsFilter `pulumi:"filters"`
	// The IDs of the Subnets.
	SubnetIds []string `pulumi:"subnetIds"`
}

// A collection of values returned by getSubnets.
type GetSubnetsResult struct {
	Filters []GetSubnetsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	RequestId string   `pulumi:"requestId"`
	SubnetIds []string `pulumi:"subnetIds"`
	// Information about one or more Subnets.
	Subnets []GetSubnetsSubnet `pulumi:"subnets"`
}

func GetSubnetsOutput(ctx *pulumi.Context, args GetSubnetsOutputArgs, opts ...pulumi.InvokeOption) GetSubnetsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSubnetsResult, error) {
			args := v.(GetSubnetsArgs)
			r, err := GetSubnets(ctx, &args, opts...)
			var s GetSubnetsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSubnetsResultOutput)
}

// A collection of arguments for invoking getSubnets.
type GetSubnetsOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetSubnetsFilterArrayInput `pulumi:"filters"`
	// The IDs of the Subnets.
	SubnetIds pulumi.StringArrayInput `pulumi:"subnetIds"`
}

func (GetSubnetsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubnetsArgs)(nil)).Elem()
}

// A collection of values returned by getSubnets.
type GetSubnetsResultOutput struct{ *pulumi.OutputState }

func (GetSubnetsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubnetsResult)(nil)).Elem()
}

func (o GetSubnetsResultOutput) ToGetSubnetsResultOutput() GetSubnetsResultOutput {
	return o
}

func (o GetSubnetsResultOutput) ToGetSubnetsResultOutputWithContext(ctx context.Context) GetSubnetsResultOutput {
	return o
}

func (o GetSubnetsResultOutput) Filters() GetSubnetsFilterArrayOutput {
	return o.ApplyT(func(v GetSubnetsResult) []GetSubnetsFilter { return v.Filters }).(GetSubnetsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSubnetsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSubnetsResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubnetsResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func (o GetSubnetsResultOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSubnetsResult) []string { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// Information about one or more Subnets.
func (o GetSubnetsResultOutput) Subnets() GetSubnetsSubnetArrayOutput {
	return o.ApplyT(func(v GetSubnetsResult) []GetSubnetsSubnet { return v.Subnets }).(GetSubnetsSubnetArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSubnetsResultOutput{})
}
