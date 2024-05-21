// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a client gateway.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Customer-Gateways.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-clientgateway).
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
//			_, err := outscale.LookupClientGateway(ctx, &outscale.LookupClientGatewayArgs{
//				Filters: []outscale.GetClientGatewayFilter{
//					{
//						Name: "client_gateway_ids",
//						Values: []string{
//							"cgw-12345678",
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
func LookupClientGateway(ctx *pulumi.Context, args *LookupClientGatewayArgs, opts ...pulumi.InvokeOption) (*LookupClientGatewayResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClientGatewayResult
	err := ctx.Invoke("outscale:index/getClientGateway:getClientGateway", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClientGateway.
type LookupClientGatewayArgs struct {
	// The ID of the client gateway.
	ClientGatewayId *string `pulumi:"clientGatewayId"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetClientGatewayFilter `pulumi:"filters"`
}

// A collection of values returned by getClientGateway.
type LookupClientGatewayResult struct {
	// The Autonomous System Number (ASN) used by the Border Gateway Protocol (BGP) to find the path to your client gateway through the Internet.
	BgpAsn int `pulumi:"bgpAsn"`
	// The ID of the client gateway.
	ClientGatewayId *string `pulumi:"clientGatewayId"`
	// The type of communication tunnel used by the client gateway (only `ipsec.1` is supported).
	ConnectionType string                   `pulumi:"connectionType"`
	Filters        []GetClientGatewayFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The public IPv4 address of the client gateway (must be a fixed address into a NATed network).
	PublicIp  string `pulumi:"publicIp"`
	RequestId string `pulumi:"requestId"`
	// The state of the client gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State string `pulumi:"state"`
	// One or more tags associated with the client gateway.
	Tags []GetClientGatewayTag `pulumi:"tags"`
}

func LookupClientGatewayOutput(ctx *pulumi.Context, args LookupClientGatewayOutputArgs, opts ...pulumi.InvokeOption) LookupClientGatewayResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClientGatewayResult, error) {
			args := v.(LookupClientGatewayArgs)
			r, err := LookupClientGateway(ctx, &args, opts...)
			var s LookupClientGatewayResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClientGatewayResultOutput)
}

// A collection of arguments for invoking getClientGateway.
type LookupClientGatewayOutputArgs struct {
	// The ID of the client gateway.
	ClientGatewayId pulumi.StringPtrInput `pulumi:"clientGatewayId"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetClientGatewayFilterArrayInput `pulumi:"filters"`
}

func (LookupClientGatewayOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClientGatewayArgs)(nil)).Elem()
}

// A collection of values returned by getClientGateway.
type LookupClientGatewayResultOutput struct{ *pulumi.OutputState }

func (LookupClientGatewayResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClientGatewayResult)(nil)).Elem()
}

func (o LookupClientGatewayResultOutput) ToLookupClientGatewayResultOutput() LookupClientGatewayResultOutput {
	return o
}

func (o LookupClientGatewayResultOutput) ToLookupClientGatewayResultOutputWithContext(ctx context.Context) LookupClientGatewayResultOutput {
	return o
}

// The Autonomous System Number (ASN) used by the Border Gateway Protocol (BGP) to find the path to your client gateway through the Internet.
func (o LookupClientGatewayResultOutput) BgpAsn() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) int { return v.BgpAsn }).(pulumi.IntOutput)
}

// The ID of the client gateway.
func (o LookupClientGatewayResultOutput) ClientGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) *string { return v.ClientGatewayId }).(pulumi.StringPtrOutput)
}

// The type of communication tunnel used by the client gateway (only `ipsec.1` is supported).
func (o LookupClientGatewayResultOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) string { return v.ConnectionType }).(pulumi.StringOutput)
}

func (o LookupClientGatewayResultOutput) Filters() GetClientGatewayFilterArrayOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) []GetClientGatewayFilter { return v.Filters }).(GetClientGatewayFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClientGatewayResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) string { return v.Id }).(pulumi.StringOutput)
}

// The public IPv4 address of the client gateway (must be a fixed address into a NATed network).
func (o LookupClientGatewayResultOutput) PublicIp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) string { return v.PublicIp }).(pulumi.StringOutput)
}

func (o LookupClientGatewayResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// The state of the client gateway (`pending` \| `available` \| `deleting` \| `deleted`).
func (o LookupClientGatewayResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) string { return v.State }).(pulumi.StringOutput)
}

// One or more tags associated with the client gateway.
func (o LookupClientGatewayResultOutput) Tags() GetClientGatewayTagArrayOutput {
	return o.ApplyT(func(v LookupClientGatewayResult) []GetClientGatewayTag { return v.Tags }).(GetClientGatewayTagArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClientGatewayResultOutput{})
}