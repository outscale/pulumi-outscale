// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a VPN connection.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPN-Connections.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vpnconnection).
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
//			_, err := outscale.LookupVpnConnection(ctx, &outscale.LookupVpnConnectionArgs{
//				Filters: []outscale.GetVpnConnectionFilter{
//					{
//						Name: "vpn_connection_ids",
//						Values: []string{
//							"vpn-12345678",
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
func LookupVpnConnection(ctx *pulumi.Context, args *LookupVpnConnectionArgs, opts ...pulumi.InvokeOption) (*LookupVpnConnectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVpnConnectionResult
	err := ctx.Invoke("outscale:index/getVpnConnection:getVpnConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpnConnection.
type LookupVpnConnectionArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetVpnConnectionFilter `pulumi:"filters"`
	// If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
	StaticRoutesOnly *bool `pulumi:"staticRoutesOnly"`
	// The ID of the VPN connection.
	VpnConnectionId *string `pulumi:"vpnConnectionId"`
}

// A collection of values returned by getVpnConnection.
type LookupVpnConnectionResult struct {
	// Example configuration for the client gateway.
	ClientGatewayConfiguration string `pulumi:"clientGatewayConfiguration"`
	// The ID of the client gateway used on the client end of the connection.
	ClientGatewayId string `pulumi:"clientGatewayId"`
	// The type of VPN connection (always `ipsec.1`).
	ConnectionType string                   `pulumi:"connectionType"`
	Filters        []GetVpnConnectionFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	RequestId string `pulumi:"requestId"`
	// Information about one or more static routes associated with the VPN connection, if any.
	Routes []GetVpnConnectionRouteType `pulumi:"routes"`
	// The state of the IPSEC tunnel (`UP` \| `DOWN`).
	State string `pulumi:"state"`
	// If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
	StaticRoutesOnly *bool `pulumi:"staticRoutesOnly"`
	// One or more tags associated with the VPN connection.
	Tags []GetVpnConnectionTag `pulumi:"tags"`
	// Information about the current state of one or more of the VPN tunnels.
	VgwTelemetries []GetVpnConnectionVgwTelemetry `pulumi:"vgwTelemetries"`
	// The ID of the virtual gateway used on the OUTSCALE end of the connection.
	VirtualGatewayId string `pulumi:"virtualGatewayId"`
	// The ID of the VPN connection.
	VpnConnectionId *string `pulumi:"vpnConnectionId"`
}

func LookupVpnConnectionOutput(ctx *pulumi.Context, args LookupVpnConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupVpnConnectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVpnConnectionResult, error) {
			args := v.(LookupVpnConnectionArgs)
			r, err := LookupVpnConnection(ctx, &args, opts...)
			var s LookupVpnConnectionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVpnConnectionResultOutput)
}

// A collection of arguments for invoking getVpnConnection.
type LookupVpnConnectionOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetVpnConnectionFilterArrayInput `pulumi:"filters"`
	// If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
	StaticRoutesOnly pulumi.BoolPtrInput `pulumi:"staticRoutesOnly"`
	// The ID of the VPN connection.
	VpnConnectionId pulumi.StringPtrInput `pulumi:"vpnConnectionId"`
}

func (LookupVpnConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVpnConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getVpnConnection.
type LookupVpnConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupVpnConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVpnConnectionResult)(nil)).Elem()
}

func (o LookupVpnConnectionResultOutput) ToLookupVpnConnectionResultOutput() LookupVpnConnectionResultOutput {
	return o
}

func (o LookupVpnConnectionResultOutput) ToLookupVpnConnectionResultOutputWithContext(ctx context.Context) LookupVpnConnectionResultOutput {
	return o
}

// Example configuration for the client gateway.
func (o LookupVpnConnectionResultOutput) ClientGatewayConfiguration() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) string { return v.ClientGatewayConfiguration }).(pulumi.StringOutput)
}

// The ID of the client gateway used on the client end of the connection.
func (o LookupVpnConnectionResultOutput) ClientGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) string { return v.ClientGatewayId }).(pulumi.StringOutput)
}

// The type of VPN connection (always `ipsec.1`).
func (o LookupVpnConnectionResultOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) string { return v.ConnectionType }).(pulumi.StringOutput)
}

func (o LookupVpnConnectionResultOutput) Filters() GetVpnConnectionFilterArrayOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) []GetVpnConnectionFilter { return v.Filters }).(GetVpnConnectionFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVpnConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupVpnConnectionResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// Information about one or more static routes associated with the VPN connection, if any.
func (o LookupVpnConnectionResultOutput) Routes() GetVpnConnectionRouteTypeArrayOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) []GetVpnConnectionRouteType { return v.Routes }).(GetVpnConnectionRouteTypeArrayOutput)
}

// The state of the IPSEC tunnel (`UP` \| `DOWN`).
func (o LookupVpnConnectionResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) string { return v.State }).(pulumi.StringOutput)
}

// If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](https://docs.outscale.com/api#createvpnconnectionroute) and [DeleteVpnConnectionRoute](https://docs.outscale.com/api#deletevpnconnectionroute).
func (o LookupVpnConnectionResultOutput) StaticRoutesOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) *bool { return v.StaticRoutesOnly }).(pulumi.BoolPtrOutput)
}

// One or more tags associated with the VPN connection.
func (o LookupVpnConnectionResultOutput) Tags() GetVpnConnectionTagArrayOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) []GetVpnConnectionTag { return v.Tags }).(GetVpnConnectionTagArrayOutput)
}

// Information about the current state of one or more of the VPN tunnels.
func (o LookupVpnConnectionResultOutput) VgwTelemetries() GetVpnConnectionVgwTelemetryArrayOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) []GetVpnConnectionVgwTelemetry { return v.VgwTelemetries }).(GetVpnConnectionVgwTelemetryArrayOutput)
}

// The ID of the virtual gateway used on the OUTSCALE end of the connection.
func (o LookupVpnConnectionResultOutput) VirtualGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) string { return v.VirtualGatewayId }).(pulumi.StringOutput)
}

// The ID of the VPN connection.
func (o LookupVpnConnectionResultOutput) VpnConnectionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVpnConnectionResult) *string { return v.VpnConnectionId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVpnConnectionResultOutput{})
}
