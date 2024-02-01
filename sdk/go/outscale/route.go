// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"errors"
	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a route.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-route).
//
// ## Example Usage
//
// ## Import
//
// A route can be imported using the route table ID and the destination IP range. For exampleconsole
//
// ```sh
//
//	$ pulumi import outscale:index/route:Route outscale_routeImportedRoute rtb-12345678_10.0.0.0/0
//
// ```
type Route struct {
	pulumi.CustomResourceState

	// By default or if set to true, waits for the route to be in the `active` state to declare its successful creation.<br />If false, the created route is in the `active` state if available, or the `blackhole` state if not available.
	AwaitActiveState pulumi.BoolPtrOutput `pulumi:"awaitActiveState"`
	// The method used to create the route.
	CreationMethod pulumi.StringOutput `pulumi:"creationMethod"`
	// The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
	DestinationIpRange pulumi.StringOutput `pulumi:"destinationIpRange"`
	// The ID of the OUTSCALE service.
	DestinationServiceId pulumi.StringOutput `pulumi:"destinationServiceId"`
	// The ID of an Internet service or virtual gateway attached to your Net.
	GatewayId      pulumi.StringPtrOutput `pulumi:"gatewayId"`
	NatAccessPoint pulumi.StringOutput    `pulumi:"natAccessPoint"`
	// The ID of a NAT service.
	NatServiceId pulumi.StringPtrOutput `pulumi:"natServiceId"`
	// The ID of a Net peering.
	NetPeeringId pulumi.StringPtrOutput `pulumi:"netPeeringId"`
	// The ID of a NIC.
	NicId     pulumi.StringOutput `pulumi:"nicId"`
	RequestId pulumi.StringOutput `pulumi:"requestId"`
	// The ID of the route table for which you want to create a route.
	RouteTableId pulumi.StringOutput `pulumi:"routeTableId"`
	// The state of a route in the route table (always `active`).
	State pulumi.StringOutput `pulumi:"state"`
	// The account ID of the owner of the VM.
	VmAccountId pulumi.StringOutput `pulumi:"vmAccountId"`
	// The ID of a NAT VM in your Net (attached to exactly one NIC).
	VmId pulumi.StringOutput `pulumi:"vmId"`
}

// NewRoute registers a new resource with the given unique name, arguments, and options.
func NewRoute(ctx *pulumi.Context,
	name string, args *RouteArgs, opts ...pulumi.ResourceOption) (*Route, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationIpRange == nil {
		return nil, errors.New("invalid value for required argument 'DestinationIpRange'")
	}
	if args.RouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'RouteTableId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Route
	err := ctx.RegisterResource("outscale:index/route:Route", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoute gets an existing Route resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteState, opts ...pulumi.ResourceOption) (*Route, error) {
	var resource Route
	err := ctx.ReadResource("outscale:index/route:Route", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Route resources.
type routeState struct {
	// By default or if set to true, waits for the route to be in the `active` state to declare its successful creation.<br />If false, the created route is in the `active` state if available, or the `blackhole` state if not available.
	AwaitActiveState *bool `pulumi:"awaitActiveState"`
	// The method used to create the route.
	CreationMethod *string `pulumi:"creationMethod"`
	// The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
	DestinationIpRange *string `pulumi:"destinationIpRange"`
	// The ID of the OUTSCALE service.
	DestinationServiceId *string `pulumi:"destinationServiceId"`
	// The ID of an Internet service or virtual gateway attached to your Net.
	GatewayId      *string `pulumi:"gatewayId"`
	NatAccessPoint *string `pulumi:"natAccessPoint"`
	// The ID of a NAT service.
	NatServiceId *string `pulumi:"natServiceId"`
	// The ID of a Net peering.
	NetPeeringId *string `pulumi:"netPeeringId"`
	// The ID of a NIC.
	NicId     *string `pulumi:"nicId"`
	RequestId *string `pulumi:"requestId"`
	// The ID of the route table for which you want to create a route.
	RouteTableId *string `pulumi:"routeTableId"`
	// The state of a route in the route table (always `active`).
	State *string `pulumi:"state"`
	// The account ID of the owner of the VM.
	VmAccountId *string `pulumi:"vmAccountId"`
	// The ID of a NAT VM in your Net (attached to exactly one NIC).
	VmId *string `pulumi:"vmId"`
}

type RouteState struct {
	// By default or if set to true, waits for the route to be in the `active` state to declare its successful creation.<br />If false, the created route is in the `active` state if available, or the `blackhole` state if not available.
	AwaitActiveState pulumi.BoolPtrInput
	// The method used to create the route.
	CreationMethod pulumi.StringPtrInput
	// The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
	DestinationIpRange pulumi.StringPtrInput
	// The ID of the OUTSCALE service.
	DestinationServiceId pulumi.StringPtrInput
	// The ID of an Internet service or virtual gateway attached to your Net.
	GatewayId      pulumi.StringPtrInput
	NatAccessPoint pulumi.StringPtrInput
	// The ID of a NAT service.
	NatServiceId pulumi.StringPtrInput
	// The ID of a Net peering.
	NetPeeringId pulumi.StringPtrInput
	// The ID of a NIC.
	NicId     pulumi.StringPtrInput
	RequestId pulumi.StringPtrInput
	// The ID of the route table for which you want to create a route.
	RouteTableId pulumi.StringPtrInput
	// The state of a route in the route table (always `active`).
	State pulumi.StringPtrInput
	// The account ID of the owner of the VM.
	VmAccountId pulumi.StringPtrInput
	// The ID of a NAT VM in your Net (attached to exactly one NIC).
	VmId pulumi.StringPtrInput
}

func (RouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeState)(nil)).Elem()
}

type routeArgs struct {
	// By default or if set to true, waits for the route to be in the `active` state to declare its successful creation.<br />If false, the created route is in the `active` state if available, or the `blackhole` state if not available.
	AwaitActiveState *bool `pulumi:"awaitActiveState"`
	// The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
	DestinationIpRange string `pulumi:"destinationIpRange"`
	// The ID of an Internet service or virtual gateway attached to your Net.
	GatewayId *string `pulumi:"gatewayId"`
	// The ID of a NAT service.
	NatServiceId *string `pulumi:"natServiceId"`
	// The ID of a Net peering.
	NetPeeringId *string `pulumi:"netPeeringId"`
	// The ID of a NIC.
	NicId *string `pulumi:"nicId"`
	// The ID of the route table for which you want to create a route.
	RouteTableId string `pulumi:"routeTableId"`
	// The ID of a NAT VM in your Net (attached to exactly one NIC).
	VmId *string `pulumi:"vmId"`
}

// The set of arguments for constructing a Route resource.
type RouteArgs struct {
	// By default or if set to true, waits for the route to be in the `active` state to declare its successful creation.<br />If false, the created route is in the `active` state if available, or the `blackhole` state if not available.
	AwaitActiveState pulumi.BoolPtrInput
	// The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
	DestinationIpRange pulumi.StringInput
	// The ID of an Internet service or virtual gateway attached to your Net.
	GatewayId pulumi.StringPtrInput
	// The ID of a NAT service.
	NatServiceId pulumi.StringPtrInput
	// The ID of a Net peering.
	NetPeeringId pulumi.StringPtrInput
	// The ID of a NIC.
	NicId pulumi.StringPtrInput
	// The ID of the route table for which you want to create a route.
	RouteTableId pulumi.StringInput
	// The ID of a NAT VM in your Net (attached to exactly one NIC).
	VmId pulumi.StringPtrInput
}

func (RouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeArgs)(nil)).Elem()
}

type RouteInput interface {
	pulumi.Input

	ToRouteOutput() RouteOutput
	ToRouteOutputWithContext(ctx context.Context) RouteOutput
}

func (*Route) ElementType() reflect.Type {
	return reflect.TypeOf((**Route)(nil)).Elem()
}

func (i *Route) ToRouteOutput() RouteOutput {
	return i.ToRouteOutputWithContext(context.Background())
}

func (i *Route) ToRouteOutputWithContext(ctx context.Context) RouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteOutput)
}

func (i *Route) ToOutput(ctx context.Context) pulumix.Output[*Route] {
	return pulumix.Output[*Route]{
		OutputState: i.ToRouteOutputWithContext(ctx).OutputState,
	}
}

// RouteArrayInput is an input type that accepts RouteArray and RouteArrayOutput values.
// You can construct a concrete instance of `RouteArrayInput` via:
//
//	RouteArray{ RouteArgs{...} }
type RouteArrayInput interface {
	pulumi.Input

	ToRouteArrayOutput() RouteArrayOutput
	ToRouteArrayOutputWithContext(context.Context) RouteArrayOutput
}

type RouteArray []RouteInput

func (RouteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Route)(nil)).Elem()
}

func (i RouteArray) ToRouteArrayOutput() RouteArrayOutput {
	return i.ToRouteArrayOutputWithContext(context.Background())
}

func (i RouteArray) ToRouteArrayOutputWithContext(ctx context.Context) RouteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteArrayOutput)
}

func (i RouteArray) ToOutput(ctx context.Context) pulumix.Output[[]*Route] {
	return pulumix.Output[[]*Route]{
		OutputState: i.ToRouteArrayOutputWithContext(ctx).OutputState,
	}
}

// RouteMapInput is an input type that accepts RouteMap and RouteMapOutput values.
// You can construct a concrete instance of `RouteMapInput` via:
//
//	RouteMap{ "key": RouteArgs{...} }
type RouteMapInput interface {
	pulumi.Input

	ToRouteMapOutput() RouteMapOutput
	ToRouteMapOutputWithContext(context.Context) RouteMapOutput
}

type RouteMap map[string]RouteInput

func (RouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Route)(nil)).Elem()
}

func (i RouteMap) ToRouteMapOutput() RouteMapOutput {
	return i.ToRouteMapOutputWithContext(context.Background())
}

func (i RouteMap) ToRouteMapOutputWithContext(ctx context.Context) RouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteMapOutput)
}

func (i RouteMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Route] {
	return pulumix.Output[map[string]*Route]{
		OutputState: i.ToRouteMapOutputWithContext(ctx).OutputState,
	}
}

type RouteOutput struct{ *pulumi.OutputState }

func (RouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Route)(nil)).Elem()
}

func (o RouteOutput) ToRouteOutput() RouteOutput {
	return o
}

func (o RouteOutput) ToRouteOutputWithContext(ctx context.Context) RouteOutput {
	return o
}

func (o RouteOutput) ToOutput(ctx context.Context) pulumix.Output[*Route] {
	return pulumix.Output[*Route]{
		OutputState: o.OutputState,
	}
}

// By default or if set to true, waits for the route to be in the `active` state to declare its successful creation.<br />If false, the created route is in the `active` state if available, or the `blackhole` state if not available.
func (o RouteOutput) AwaitActiveState() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Route) pulumi.BoolPtrOutput { return v.AwaitActiveState }).(pulumi.BoolPtrOutput)
}

// The method used to create the route.
func (o RouteOutput) CreationMethod() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.CreationMethod }).(pulumi.StringOutput)
}

// The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
func (o RouteOutput) DestinationIpRange() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.DestinationIpRange }).(pulumi.StringOutput)
}

// The ID of the OUTSCALE service.
func (o RouteOutput) DestinationServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.DestinationServiceId }).(pulumi.StringOutput)
}

// The ID of an Internet service or virtual gateway attached to your Net.
func (o RouteOutput) GatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Route) pulumi.StringPtrOutput { return v.GatewayId }).(pulumi.StringPtrOutput)
}

func (o RouteOutput) NatAccessPoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.NatAccessPoint }).(pulumi.StringOutput)
}

// The ID of a NAT service.
func (o RouteOutput) NatServiceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Route) pulumi.StringPtrOutput { return v.NatServiceId }).(pulumi.StringPtrOutput)
}

// The ID of a Net peering.
func (o RouteOutput) NetPeeringId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Route) pulumi.StringPtrOutput { return v.NetPeeringId }).(pulumi.StringPtrOutput)
}

// The ID of a NIC.
func (o RouteOutput) NicId() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.NicId }).(pulumi.StringOutput)
}

func (o RouteOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// The ID of the route table for which you want to create a route.
func (o RouteOutput) RouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.RouteTableId }).(pulumi.StringOutput)
}

// The state of a route in the route table (always `active`).
func (o RouteOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The account ID of the owner of the VM.
func (o RouteOutput) VmAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.VmAccountId }).(pulumi.StringOutput)
}

// The ID of a NAT VM in your Net (attached to exactly one NIC).
func (o RouteOutput) VmId() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.VmId }).(pulumi.StringOutput)
}

type RouteArrayOutput struct{ *pulumi.OutputState }

func (RouteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Route)(nil)).Elem()
}

func (o RouteArrayOutput) ToRouteArrayOutput() RouteArrayOutput {
	return o
}

func (o RouteArrayOutput) ToRouteArrayOutputWithContext(ctx context.Context) RouteArrayOutput {
	return o
}

func (o RouteArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Route] {
	return pulumix.Output[[]*Route]{
		OutputState: o.OutputState,
	}
}

func (o RouteArrayOutput) Index(i pulumi.IntInput) RouteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Route {
		return vs[0].([]*Route)[vs[1].(int)]
	}).(RouteOutput)
}

type RouteMapOutput struct{ *pulumi.OutputState }

func (RouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Route)(nil)).Elem()
}

func (o RouteMapOutput) ToRouteMapOutput() RouteMapOutput {
	return o
}

func (o RouteMapOutput) ToRouteMapOutputWithContext(ctx context.Context) RouteMapOutput {
	return o
}

func (o RouteMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Route] {
	return pulumix.Output[map[string]*Route]{
		OutputState: o.OutputState,
	}
}

func (o RouteMapOutput) MapIndex(k pulumi.StringInput) RouteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Route {
		return vs[0].(map[string]*Route)[vs[1].(string)]
	}).(RouteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouteInput)(nil)).Elem(), &Route{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteArrayInput)(nil)).Elem(), RouteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteMapInput)(nil)).Elem(), RouteMap{})
	pulumi.RegisterOutputType(RouteOutput{})
	pulumi.RegisterOutputType(RouteArrayOutput{})
	pulumi.RegisterOutputType(RouteMapOutput{})
}
