// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about route tables.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).
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
//			_, err := outscale.GetRouteTables(ctx, &outscale.GetRouteTablesArgs{
//				Filters: []outscale.GetRouteTablesFilter{
//					{
//						Name: "net_ids",
//						Values: []string{
//							"vpc-12345678",
//							"vpc-87654321",
//						},
//					},
//					{
//						Name: "link_route_table_main",
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
func GetRouteTables(ctx *pulumi.Context, args *GetRouteTablesArgs, opts ...pulumi.InvokeOption) (*GetRouteTablesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRouteTablesResult
	err := ctx.Invoke("outscale:index/getRouteTables:getRouteTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteTables.
type GetRouteTablesArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetRouteTablesFilter `pulumi:"filters"`
	// The ID of the route table.
	RouteTableIds []string `pulumi:"routeTableIds"`
}

// A collection of values returned by getRouteTables.
type GetRouteTablesResult struct {
	Filters []GetRouteTablesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	RequestId string `pulumi:"requestId"`
	// The ID of the route table.
	RouteTableIds []string `pulumi:"routeTableIds"`
	// Information about one or more route tables.
	RouteTables []GetRouteTablesRouteTable `pulumi:"routeTables"`
}

func GetRouteTablesOutput(ctx *pulumi.Context, args GetRouteTablesOutputArgs, opts ...pulumi.InvokeOption) GetRouteTablesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRouteTablesResult, error) {
			args := v.(GetRouteTablesArgs)
			r, err := GetRouteTables(ctx, &args, opts...)
			var s GetRouteTablesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetRouteTablesResultOutput)
}

// A collection of arguments for invoking getRouteTables.
type GetRouteTablesOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetRouteTablesFilterArrayInput `pulumi:"filters"`
	// The ID of the route table.
	RouteTableIds pulumi.StringArrayInput `pulumi:"routeTableIds"`
}

func (GetRouteTablesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteTablesArgs)(nil)).Elem()
}

// A collection of values returned by getRouteTables.
type GetRouteTablesResultOutput struct{ *pulumi.OutputState }

func (GetRouteTablesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteTablesResult)(nil)).Elem()
}

func (o GetRouteTablesResultOutput) ToGetRouteTablesResultOutput() GetRouteTablesResultOutput {
	return o
}

func (o GetRouteTablesResultOutput) ToGetRouteTablesResultOutputWithContext(ctx context.Context) GetRouteTablesResultOutput {
	return o
}

func (o GetRouteTablesResultOutput) Filters() GetRouteTablesFilterArrayOutput {
	return o.ApplyT(func(v GetRouteTablesResult) []GetRouteTablesFilter { return v.Filters }).(GetRouteTablesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRouteTablesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteTablesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRouteTablesResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteTablesResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// The ID of the route table.
func (o GetRouteTablesResultOutput) RouteTableIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRouteTablesResult) []string { return v.RouteTableIds }).(pulumi.StringArrayOutput)
}

// Information about one or more route tables.
func (o GetRouteTablesResultOutput) RouteTables() GetRouteTablesRouteTableArrayOutput {
	return o.ApplyT(func(v GetRouteTablesResult) []GetRouteTablesRouteTable { return v.RouteTables }).(GetRouteTablesRouteTableArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRouteTablesResultOutput{})
}