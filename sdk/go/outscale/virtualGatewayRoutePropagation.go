// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"errors"
	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a virtual gateway route propagation.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Routing-Configuration-for-VPN-Connections.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updateroutepropagation).
//
// ## Example Usage
// ### Required resources
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
//			virtualGateway01, err := outscale.NewVirtualGateway(ctx, "virtualGateway01", &outscale.VirtualGatewayArgs{
//				ConnectionType: pulumi.String("ipsec.1"),
//			})
//			if err != nil {
//				return err
//			}
//			net01, err := outscale.NewNet(ctx, "net01", &outscale.NetArgs{
//				IpRange: pulumi.String("10.0.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = outscale.NewRouteTable(ctx, "routeTable01", &outscale.RouteTableArgs{
//				NetId: net01.NetId,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = outscale.NewVirtualGatewayLink(ctx, "virtualGatewayLink01", &outscale.VirtualGatewayLinkArgs{
//				VirtualGatewayId: virtualGateway01.VirtualGatewayId,
//				NetId:            net01.NetId,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Activate the propagation of routes to a route table of a Net by a virtual gateway
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
//			_, err := outscale.NewVirtualGatewayRoutePropagation(ctx, "virtualGatewayRoutePropagation01", &outscale.VirtualGatewayRoutePropagationArgs{
//				Enable:           pulumi.Bool(true),
//				VirtualGatewayId: pulumi.Any(outscale_virtual_gateway.Virtual_gateway01.Virtual_gateway_id),
//				RouteTableId:     pulumi.Any(outscale_route_table.Route_table01.Route_table_id),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				outscale_virtual_gateway_link.Virtual_gateway_link01,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type VirtualGatewayRoutePropagation struct {
	pulumi.CustomResourceState

	// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
	Enable    pulumi.BoolOutput   `pulumi:"enable"`
	RequestId pulumi.StringOutput `pulumi:"requestId"`
	// The ID of the route table.
	RouteTableId pulumi.StringOutput `pulumi:"routeTableId"`
	// The ID of the virtual gateway.
	VirtualGatewayId pulumi.StringOutput `pulumi:"virtualGatewayId"`
}

// NewVirtualGatewayRoutePropagation registers a new resource with the given unique name, arguments, and options.
func NewVirtualGatewayRoutePropagation(ctx *pulumi.Context,
	name string, args *VirtualGatewayRoutePropagationArgs, opts ...pulumi.ResourceOption) (*VirtualGatewayRoutePropagation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enable == nil {
		return nil, errors.New("invalid value for required argument 'Enable'")
	}
	if args.RouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'RouteTableId'")
	}
	if args.VirtualGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'VirtualGatewayId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualGatewayRoutePropagation
	err := ctx.RegisterResource("outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualGatewayRoutePropagation gets an existing VirtualGatewayRoutePropagation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualGatewayRoutePropagation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualGatewayRoutePropagationState, opts ...pulumi.ResourceOption) (*VirtualGatewayRoutePropagation, error) {
	var resource VirtualGatewayRoutePropagation
	err := ctx.ReadResource("outscale:index/virtualGatewayRoutePropagation:VirtualGatewayRoutePropagation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualGatewayRoutePropagation resources.
type virtualGatewayRoutePropagationState struct {
	// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
	Enable    *bool   `pulumi:"enable"`
	RequestId *string `pulumi:"requestId"`
	// The ID of the route table.
	RouteTableId *string `pulumi:"routeTableId"`
	// The ID of the virtual gateway.
	VirtualGatewayId *string `pulumi:"virtualGatewayId"`
}

type VirtualGatewayRoutePropagationState struct {
	// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
	Enable    pulumi.BoolPtrInput
	RequestId pulumi.StringPtrInput
	// The ID of the route table.
	RouteTableId pulumi.StringPtrInput
	// The ID of the virtual gateway.
	VirtualGatewayId pulumi.StringPtrInput
}

func (VirtualGatewayRoutePropagationState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualGatewayRoutePropagationState)(nil)).Elem()
}

type virtualGatewayRoutePropagationArgs struct {
	// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
	Enable bool `pulumi:"enable"`
	// The ID of the route table.
	RouteTableId string `pulumi:"routeTableId"`
	// The ID of the virtual gateway.
	VirtualGatewayId string `pulumi:"virtualGatewayId"`
}

// The set of arguments for constructing a VirtualGatewayRoutePropagation resource.
type VirtualGatewayRoutePropagationArgs struct {
	// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
	Enable pulumi.BoolInput
	// The ID of the route table.
	RouteTableId pulumi.StringInput
	// The ID of the virtual gateway.
	VirtualGatewayId pulumi.StringInput
}

func (VirtualGatewayRoutePropagationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualGatewayRoutePropagationArgs)(nil)).Elem()
}

type VirtualGatewayRoutePropagationInput interface {
	pulumi.Input

	ToVirtualGatewayRoutePropagationOutput() VirtualGatewayRoutePropagationOutput
	ToVirtualGatewayRoutePropagationOutputWithContext(ctx context.Context) VirtualGatewayRoutePropagationOutput
}

func (*VirtualGatewayRoutePropagation) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualGatewayRoutePropagation)(nil)).Elem()
}

func (i *VirtualGatewayRoutePropagation) ToVirtualGatewayRoutePropagationOutput() VirtualGatewayRoutePropagationOutput {
	return i.ToVirtualGatewayRoutePropagationOutputWithContext(context.Background())
}

func (i *VirtualGatewayRoutePropagation) ToVirtualGatewayRoutePropagationOutputWithContext(ctx context.Context) VirtualGatewayRoutePropagationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualGatewayRoutePropagationOutput)
}

// VirtualGatewayRoutePropagationArrayInput is an input type that accepts VirtualGatewayRoutePropagationArray and VirtualGatewayRoutePropagationArrayOutput values.
// You can construct a concrete instance of `VirtualGatewayRoutePropagationArrayInput` via:
//
//	VirtualGatewayRoutePropagationArray{ VirtualGatewayRoutePropagationArgs{...} }
type VirtualGatewayRoutePropagationArrayInput interface {
	pulumi.Input

	ToVirtualGatewayRoutePropagationArrayOutput() VirtualGatewayRoutePropagationArrayOutput
	ToVirtualGatewayRoutePropagationArrayOutputWithContext(context.Context) VirtualGatewayRoutePropagationArrayOutput
}

type VirtualGatewayRoutePropagationArray []VirtualGatewayRoutePropagationInput

func (VirtualGatewayRoutePropagationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualGatewayRoutePropagation)(nil)).Elem()
}

func (i VirtualGatewayRoutePropagationArray) ToVirtualGatewayRoutePropagationArrayOutput() VirtualGatewayRoutePropagationArrayOutput {
	return i.ToVirtualGatewayRoutePropagationArrayOutputWithContext(context.Background())
}

func (i VirtualGatewayRoutePropagationArray) ToVirtualGatewayRoutePropagationArrayOutputWithContext(ctx context.Context) VirtualGatewayRoutePropagationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualGatewayRoutePropagationArrayOutput)
}

// VirtualGatewayRoutePropagationMapInput is an input type that accepts VirtualGatewayRoutePropagationMap and VirtualGatewayRoutePropagationMapOutput values.
// You can construct a concrete instance of `VirtualGatewayRoutePropagationMapInput` via:
//
//	VirtualGatewayRoutePropagationMap{ "key": VirtualGatewayRoutePropagationArgs{...} }
type VirtualGatewayRoutePropagationMapInput interface {
	pulumi.Input

	ToVirtualGatewayRoutePropagationMapOutput() VirtualGatewayRoutePropagationMapOutput
	ToVirtualGatewayRoutePropagationMapOutputWithContext(context.Context) VirtualGatewayRoutePropagationMapOutput
}

type VirtualGatewayRoutePropagationMap map[string]VirtualGatewayRoutePropagationInput

func (VirtualGatewayRoutePropagationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualGatewayRoutePropagation)(nil)).Elem()
}

func (i VirtualGatewayRoutePropagationMap) ToVirtualGatewayRoutePropagationMapOutput() VirtualGatewayRoutePropagationMapOutput {
	return i.ToVirtualGatewayRoutePropagationMapOutputWithContext(context.Background())
}

func (i VirtualGatewayRoutePropagationMap) ToVirtualGatewayRoutePropagationMapOutputWithContext(ctx context.Context) VirtualGatewayRoutePropagationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualGatewayRoutePropagationMapOutput)
}

type VirtualGatewayRoutePropagationOutput struct{ *pulumi.OutputState }

func (VirtualGatewayRoutePropagationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualGatewayRoutePropagation)(nil)).Elem()
}

func (o VirtualGatewayRoutePropagationOutput) ToVirtualGatewayRoutePropagationOutput() VirtualGatewayRoutePropagationOutput {
	return o
}

func (o VirtualGatewayRoutePropagationOutput) ToVirtualGatewayRoutePropagationOutputWithContext(ctx context.Context) VirtualGatewayRoutePropagationOutput {
	return o
}

// If true, a virtual gateway can propagate routes to a specified route table of a Net. If false, the propagation is disabled.
func (o VirtualGatewayRoutePropagationOutput) Enable() pulumi.BoolOutput {
	return o.ApplyT(func(v *VirtualGatewayRoutePropagation) pulumi.BoolOutput { return v.Enable }).(pulumi.BoolOutput)
}

func (o VirtualGatewayRoutePropagationOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualGatewayRoutePropagation) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// The ID of the route table.
func (o VirtualGatewayRoutePropagationOutput) RouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualGatewayRoutePropagation) pulumi.StringOutput { return v.RouteTableId }).(pulumi.StringOutput)
}

// The ID of the virtual gateway.
func (o VirtualGatewayRoutePropagationOutput) VirtualGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualGatewayRoutePropagation) pulumi.StringOutput { return v.VirtualGatewayId }).(pulumi.StringOutput)
}

type VirtualGatewayRoutePropagationArrayOutput struct{ *pulumi.OutputState }

func (VirtualGatewayRoutePropagationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualGatewayRoutePropagation)(nil)).Elem()
}

func (o VirtualGatewayRoutePropagationArrayOutput) ToVirtualGatewayRoutePropagationArrayOutput() VirtualGatewayRoutePropagationArrayOutput {
	return o
}

func (o VirtualGatewayRoutePropagationArrayOutput) ToVirtualGatewayRoutePropagationArrayOutputWithContext(ctx context.Context) VirtualGatewayRoutePropagationArrayOutput {
	return o
}

func (o VirtualGatewayRoutePropagationArrayOutput) Index(i pulumi.IntInput) VirtualGatewayRoutePropagationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualGatewayRoutePropagation {
		return vs[0].([]*VirtualGatewayRoutePropagation)[vs[1].(int)]
	}).(VirtualGatewayRoutePropagationOutput)
}

type VirtualGatewayRoutePropagationMapOutput struct{ *pulumi.OutputState }

func (VirtualGatewayRoutePropagationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualGatewayRoutePropagation)(nil)).Elem()
}

func (o VirtualGatewayRoutePropagationMapOutput) ToVirtualGatewayRoutePropagationMapOutput() VirtualGatewayRoutePropagationMapOutput {
	return o
}

func (o VirtualGatewayRoutePropagationMapOutput) ToVirtualGatewayRoutePropagationMapOutputWithContext(ctx context.Context) VirtualGatewayRoutePropagationMapOutput {
	return o
}

func (o VirtualGatewayRoutePropagationMapOutput) MapIndex(k pulumi.StringInput) VirtualGatewayRoutePropagationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualGatewayRoutePropagation {
		return vs[0].(map[string]*VirtualGatewayRoutePropagation)[vs[1].(string)]
	}).(VirtualGatewayRoutePropagationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualGatewayRoutePropagationInput)(nil)).Elem(), &VirtualGatewayRoutePropagation{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualGatewayRoutePropagationArrayInput)(nil)).Elem(), VirtualGatewayRoutePropagationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualGatewayRoutePropagationMapInput)(nil)).Elem(), VirtualGatewayRoutePropagationMap{})
	pulumi.RegisterOutputType(VirtualGatewayRoutePropagationOutput{})
	pulumi.RegisterOutputType(VirtualGatewayRoutePropagationArrayOutput{})
	pulumi.RegisterOutputType(VirtualGatewayRoutePropagationMapOutput{})
}