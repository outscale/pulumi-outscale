// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Net peerings.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Peering-Connections.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netpeering).
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
//			_, err := outscale.GetNetPeerings(ctx, &outscale.GetNetPeeringsArgs{
//				Filters: []outscale.GetNetPeeringsFilter{
//					{
//						Name: "source_net_net_ids",
//						Values: []string{
//							"vpc-12345678",
//						},
//					},
//					{
//						Name: "state_names",
//						Values: []string{
//							"active",
//							"pending-acceptance",
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
func GetNetPeerings(ctx *pulumi.Context, args *GetNetPeeringsArgs, opts ...pulumi.InvokeOption) (*GetNetPeeringsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetPeeringsResult
	err := ctx.Invoke("outscale:index/getNetPeerings:getNetPeerings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetPeerings.
type GetNetPeeringsArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetNetPeeringsFilter `pulumi:"filters"`
}

// A collection of values returned by getNetPeerings.
type GetNetPeeringsResult struct {
	Filters []GetNetPeeringsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Information about one or more Net peerings.
	NetPeerings []GetNetPeeringsNetPeering `pulumi:"netPeerings"`
	RequestId   string                     `pulumi:"requestId"`
}

func GetNetPeeringsOutput(ctx *pulumi.Context, args GetNetPeeringsOutputArgs, opts ...pulumi.InvokeOption) GetNetPeeringsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetPeeringsResult, error) {
			args := v.(GetNetPeeringsArgs)
			r, err := GetNetPeerings(ctx, &args, opts...)
			var s GetNetPeeringsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetPeeringsResultOutput)
}

// A collection of arguments for invoking getNetPeerings.
type GetNetPeeringsOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetNetPeeringsFilterArrayInput `pulumi:"filters"`
}

func (GetNetPeeringsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetPeeringsArgs)(nil)).Elem()
}

// A collection of values returned by getNetPeerings.
type GetNetPeeringsResultOutput struct{ *pulumi.OutputState }

func (GetNetPeeringsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetPeeringsResult)(nil)).Elem()
}

func (o GetNetPeeringsResultOutput) ToGetNetPeeringsResultOutput() GetNetPeeringsResultOutput {
	return o
}

func (o GetNetPeeringsResultOutput) ToGetNetPeeringsResultOutputWithContext(ctx context.Context) GetNetPeeringsResultOutput {
	return o
}

func (o GetNetPeeringsResultOutput) Filters() GetNetPeeringsFilterArrayOutput {
	return o.ApplyT(func(v GetNetPeeringsResult) []GetNetPeeringsFilter { return v.Filters }).(GetNetPeeringsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetPeeringsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetPeeringsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Information about one or more Net peerings.
func (o GetNetPeeringsResultOutput) NetPeerings() GetNetPeeringsNetPeeringArrayOutput {
	return o.ApplyT(func(v GetNetPeeringsResult) []GetNetPeeringsNetPeering { return v.NetPeerings }).(GetNetPeeringsNetPeeringArrayOutput)
}

func (o GetNetPeeringsResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetPeeringsResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetPeeringsResultOutput{})
}