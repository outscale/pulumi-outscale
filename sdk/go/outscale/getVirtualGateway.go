// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a virtual gateway.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Virtual-Private-Gateways.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-virtualgateway).
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
//			_, err := outscale.LookupVirtualGateway(ctx, &outscale.LookupVirtualGatewayArgs{
//				Filters: []outscale.GetVirtualGatewayFilter{
//					{
//						Name: "virtual_gateway_ids",
//						Values: []string{
//							"vgw-12345678",
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
func LookupVirtualGateway(ctx *pulumi.Context, args *LookupVirtualGatewayArgs, opts ...pulumi.InvokeOption) (*LookupVirtualGatewayResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVirtualGatewayResult
	err := ctx.Invoke("outscale:index/getVirtualGateway:getVirtualGateway", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVirtualGateway.
type LookupVirtualGatewayArgs struct {
	// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
	ConnectionType *string `pulumi:"connectionType"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetVirtualGatewayFilter `pulumi:"filters"`
	// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State *string `pulumi:"state"`
	// The ID of the virtual gateway.
	VirtualGatewayId *string `pulumi:"virtualGatewayId"`
}

// A collection of values returned by getVirtualGateway.
type LookupVirtualGatewayResult struct {
	// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
	ConnectionType string                    `pulumi:"connectionType"`
	Filters        []GetVirtualGatewayFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Net to which the virtual gateway is attached.
	NetToVirtualGatewayLinks []GetVirtualGatewayNetToVirtualGatewayLink `pulumi:"netToVirtualGatewayLinks"`
	RequestId                string                                     `pulumi:"requestId"`
	// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State string `pulumi:"state"`
	// One or more tags associated with the virtual gateway.
	Tags []GetVirtualGatewayTag `pulumi:"tags"`
	// The ID of the virtual gateway.
	VirtualGatewayId string `pulumi:"virtualGatewayId"`
}

func LookupVirtualGatewayOutput(ctx *pulumi.Context, args LookupVirtualGatewayOutputArgs, opts ...pulumi.InvokeOption) LookupVirtualGatewayResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVirtualGatewayResult, error) {
			args := v.(LookupVirtualGatewayArgs)
			r, err := LookupVirtualGateway(ctx, &args, opts...)
			var s LookupVirtualGatewayResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVirtualGatewayResultOutput)
}

// A collection of arguments for invoking getVirtualGateway.
type LookupVirtualGatewayOutputArgs struct {
	// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
	ConnectionType pulumi.StringPtrInput `pulumi:"connectionType"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetVirtualGatewayFilterArrayInput `pulumi:"filters"`
	// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State pulumi.StringPtrInput `pulumi:"state"`
	// The ID of the virtual gateway.
	VirtualGatewayId pulumi.StringPtrInput `pulumi:"virtualGatewayId"`
}

func (LookupVirtualGatewayOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVirtualGatewayArgs)(nil)).Elem()
}

// A collection of values returned by getVirtualGateway.
type LookupVirtualGatewayResultOutput struct{ *pulumi.OutputState }

func (LookupVirtualGatewayResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVirtualGatewayResult)(nil)).Elem()
}

func (o LookupVirtualGatewayResultOutput) ToLookupVirtualGatewayResultOutput() LookupVirtualGatewayResultOutput {
	return o
}

func (o LookupVirtualGatewayResultOutput) ToLookupVirtualGatewayResultOutputWithContext(ctx context.Context) LookupVirtualGatewayResultOutput {
	return o
}

// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
func (o LookupVirtualGatewayResultOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualGatewayResult) string { return v.ConnectionType }).(pulumi.StringOutput)
}

func (o LookupVirtualGatewayResultOutput) Filters() GetVirtualGatewayFilterArrayOutput {
	return o.ApplyT(func(v LookupVirtualGatewayResult) []GetVirtualGatewayFilter { return v.Filters }).(GetVirtualGatewayFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVirtualGatewayResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualGatewayResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Net to which the virtual gateway is attached.
func (o LookupVirtualGatewayResultOutput) NetToVirtualGatewayLinks() GetVirtualGatewayNetToVirtualGatewayLinkArrayOutput {
	return o.ApplyT(func(v LookupVirtualGatewayResult) []GetVirtualGatewayNetToVirtualGatewayLink {
		return v.NetToVirtualGatewayLinks
	}).(GetVirtualGatewayNetToVirtualGatewayLinkArrayOutput)
}

func (o LookupVirtualGatewayResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualGatewayResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
func (o LookupVirtualGatewayResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualGatewayResult) string { return v.State }).(pulumi.StringOutput)
}

// One or more tags associated with the virtual gateway.
func (o LookupVirtualGatewayResultOutput) Tags() GetVirtualGatewayTagArrayOutput {
	return o.ApplyT(func(v LookupVirtualGatewayResult) []GetVirtualGatewayTag { return v.Tags }).(GetVirtualGatewayTagArrayOutput)
}

// The ID of the virtual gateway.
func (o LookupVirtualGatewayResultOutput) VirtualGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVirtualGatewayResult) string { return v.VirtualGatewayId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVirtualGatewayResultOutput{})
}
