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

// Manages a virtual gateway.
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
//			_, err := outscale.NewVirtualGateway(ctx, "virtualGateway01", &outscale.VirtualGatewayArgs{
//				ConnectionType: pulumi.String("ipsec.1"),
//				Tags: outscale.VirtualGatewayTagArray{
//					&outscale.VirtualGatewayTagArgs{
//						Key:   pulumi.String("name"),
//						Value: pulumi.String("terraform-virtual-gateway"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// A virtual gateway can be imported using its ID. For exampleconsole
//
// ```sh
//
//	$ pulumi import outscale:index/virtualGateway:VirtualGateway ImportedVirtualGateway vgw-12345678
//
// ```
type VirtualGateway struct {
	pulumi.CustomResourceState

	// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
	ConnectionType pulumi.StringOutput `pulumi:"connectionType"`
	// The Net to which the virtual gateway is attached.
	NetToVirtualGatewayLinks VirtualGatewayNetToVirtualGatewayLinkArrayOutput `pulumi:"netToVirtualGatewayLinks"`
	RequestId                pulumi.StringOutput                              `pulumi:"requestId"`
	// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State pulumi.StringOutput `pulumi:"state"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags VirtualGatewayTagArrayOutput `pulumi:"tags"`
	// The ID of the virtual gateway.
	VirtualGatewayId pulumi.StringOutput `pulumi:"virtualGatewayId"`
}

// NewVirtualGateway registers a new resource with the given unique name, arguments, and options.
func NewVirtualGateway(ctx *pulumi.Context,
	name string, args *VirtualGatewayArgs, opts ...pulumi.ResourceOption) (*VirtualGateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionType == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualGateway
	err := ctx.RegisterResource("outscale:index/virtualGateway:VirtualGateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualGateway gets an existing VirtualGateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualGatewayState, opts ...pulumi.ResourceOption) (*VirtualGateway, error) {
	var resource VirtualGateway
	err := ctx.ReadResource("outscale:index/virtualGateway:VirtualGateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualGateway resources.
type virtualGatewayState struct {
	// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
	ConnectionType *string `pulumi:"connectionType"`
	// The Net to which the virtual gateway is attached.
	NetToVirtualGatewayLinks []VirtualGatewayNetToVirtualGatewayLink `pulumi:"netToVirtualGatewayLinks"`
	RequestId                *string                                 `pulumi:"requestId"`
	// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State *string `pulumi:"state"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags []VirtualGatewayTag `pulumi:"tags"`
	// The ID of the virtual gateway.
	VirtualGatewayId *string `pulumi:"virtualGatewayId"`
}

type VirtualGatewayState struct {
	// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
	ConnectionType pulumi.StringPtrInput
	// The Net to which the virtual gateway is attached.
	NetToVirtualGatewayLinks VirtualGatewayNetToVirtualGatewayLinkArrayInput
	RequestId                pulumi.StringPtrInput
	// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State pulumi.StringPtrInput
	// A tag to add to this resource. You can specify this argument several times.
	Tags VirtualGatewayTagArrayInput
	// The ID of the virtual gateway.
	VirtualGatewayId pulumi.StringPtrInput
}

func (VirtualGatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualGatewayState)(nil)).Elem()
}

type virtualGatewayArgs struct {
	// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
	ConnectionType string `pulumi:"connectionType"`
	// The Net to which the virtual gateway is attached.
	NetToVirtualGatewayLinks []VirtualGatewayNetToVirtualGatewayLink `pulumi:"netToVirtualGatewayLinks"`
	RequestId                *string                                 `pulumi:"requestId"`
	// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State *string `pulumi:"state"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags []VirtualGatewayTag `pulumi:"tags"`
	// The ID of the virtual gateway.
	VirtualGatewayId *string `pulumi:"virtualGatewayId"`
}

// The set of arguments for constructing a VirtualGateway resource.
type VirtualGatewayArgs struct {
	// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
	ConnectionType pulumi.StringInput
	// The Net to which the virtual gateway is attached.
	NetToVirtualGatewayLinks VirtualGatewayNetToVirtualGatewayLinkArrayInput
	RequestId                pulumi.StringPtrInput
	// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
	State pulumi.StringPtrInput
	// A tag to add to this resource. You can specify this argument several times.
	Tags VirtualGatewayTagArrayInput
	// The ID of the virtual gateway.
	VirtualGatewayId pulumi.StringPtrInput
}

func (VirtualGatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualGatewayArgs)(nil)).Elem()
}

type VirtualGatewayInput interface {
	pulumi.Input

	ToVirtualGatewayOutput() VirtualGatewayOutput
	ToVirtualGatewayOutputWithContext(ctx context.Context) VirtualGatewayOutput
}

func (*VirtualGateway) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualGateway)(nil)).Elem()
}

func (i *VirtualGateway) ToVirtualGatewayOutput() VirtualGatewayOutput {
	return i.ToVirtualGatewayOutputWithContext(context.Background())
}

func (i *VirtualGateway) ToVirtualGatewayOutputWithContext(ctx context.Context) VirtualGatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualGatewayOutput)
}

// VirtualGatewayArrayInput is an input type that accepts VirtualGatewayArray and VirtualGatewayArrayOutput values.
// You can construct a concrete instance of `VirtualGatewayArrayInput` via:
//
//	VirtualGatewayArray{ VirtualGatewayArgs{...} }
type VirtualGatewayArrayInput interface {
	pulumi.Input

	ToVirtualGatewayArrayOutput() VirtualGatewayArrayOutput
	ToVirtualGatewayArrayOutputWithContext(context.Context) VirtualGatewayArrayOutput
}

type VirtualGatewayArray []VirtualGatewayInput

func (VirtualGatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualGateway)(nil)).Elem()
}

func (i VirtualGatewayArray) ToVirtualGatewayArrayOutput() VirtualGatewayArrayOutput {
	return i.ToVirtualGatewayArrayOutputWithContext(context.Background())
}

func (i VirtualGatewayArray) ToVirtualGatewayArrayOutputWithContext(ctx context.Context) VirtualGatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualGatewayArrayOutput)
}

// VirtualGatewayMapInput is an input type that accepts VirtualGatewayMap and VirtualGatewayMapOutput values.
// You can construct a concrete instance of `VirtualGatewayMapInput` via:
//
//	VirtualGatewayMap{ "key": VirtualGatewayArgs{...} }
type VirtualGatewayMapInput interface {
	pulumi.Input

	ToVirtualGatewayMapOutput() VirtualGatewayMapOutput
	ToVirtualGatewayMapOutputWithContext(context.Context) VirtualGatewayMapOutput
}

type VirtualGatewayMap map[string]VirtualGatewayInput

func (VirtualGatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualGateway)(nil)).Elem()
}

func (i VirtualGatewayMap) ToVirtualGatewayMapOutput() VirtualGatewayMapOutput {
	return i.ToVirtualGatewayMapOutputWithContext(context.Background())
}

func (i VirtualGatewayMap) ToVirtualGatewayMapOutputWithContext(ctx context.Context) VirtualGatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualGatewayMapOutput)
}

type VirtualGatewayOutput struct{ *pulumi.OutputState }

func (VirtualGatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualGateway)(nil)).Elem()
}

func (o VirtualGatewayOutput) ToVirtualGatewayOutput() VirtualGatewayOutput {
	return o
}

func (o VirtualGatewayOutput) ToVirtualGatewayOutputWithContext(ctx context.Context) VirtualGatewayOutput {
	return o
}

// The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
func (o VirtualGatewayOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualGateway) pulumi.StringOutput { return v.ConnectionType }).(pulumi.StringOutput)
}

// The Net to which the virtual gateway is attached.
func (o VirtualGatewayOutput) NetToVirtualGatewayLinks() VirtualGatewayNetToVirtualGatewayLinkArrayOutput {
	return o.ApplyT(func(v *VirtualGateway) VirtualGatewayNetToVirtualGatewayLinkArrayOutput {
		return v.NetToVirtualGatewayLinks
	}).(VirtualGatewayNetToVirtualGatewayLinkArrayOutput)
}

func (o VirtualGatewayOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualGateway) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// The state of the virtual gateway (`pending` \| `available` \| `deleting` \| `deleted`).
func (o VirtualGatewayOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualGateway) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// A tag to add to this resource. You can specify this argument several times.
func (o VirtualGatewayOutput) Tags() VirtualGatewayTagArrayOutput {
	return o.ApplyT(func(v *VirtualGateway) VirtualGatewayTagArrayOutput { return v.Tags }).(VirtualGatewayTagArrayOutput)
}

// The ID of the virtual gateway.
func (o VirtualGatewayOutput) VirtualGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualGateway) pulumi.StringOutput { return v.VirtualGatewayId }).(pulumi.StringOutput)
}

type VirtualGatewayArrayOutput struct{ *pulumi.OutputState }

func (VirtualGatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualGateway)(nil)).Elem()
}

func (o VirtualGatewayArrayOutput) ToVirtualGatewayArrayOutput() VirtualGatewayArrayOutput {
	return o
}

func (o VirtualGatewayArrayOutput) ToVirtualGatewayArrayOutputWithContext(ctx context.Context) VirtualGatewayArrayOutput {
	return o
}

func (o VirtualGatewayArrayOutput) Index(i pulumi.IntInput) VirtualGatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualGateway {
		return vs[0].([]*VirtualGateway)[vs[1].(int)]
	}).(VirtualGatewayOutput)
}

type VirtualGatewayMapOutput struct{ *pulumi.OutputState }

func (VirtualGatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualGateway)(nil)).Elem()
}

func (o VirtualGatewayMapOutput) ToVirtualGatewayMapOutput() VirtualGatewayMapOutput {
	return o
}

func (o VirtualGatewayMapOutput) ToVirtualGatewayMapOutputWithContext(ctx context.Context) VirtualGatewayMapOutput {
	return o
}

func (o VirtualGatewayMapOutput) MapIndex(k pulumi.StringInput) VirtualGatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualGateway {
		return vs[0].(map[string]*VirtualGateway)[vs[1].(string)]
	}).(VirtualGatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualGatewayInput)(nil)).Elem(), &VirtualGateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualGatewayArrayInput)(nil)).Elem(), VirtualGatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualGatewayMapInput)(nil)).Elem(), VirtualGatewayMap{})
	pulumi.RegisterOutputType(VirtualGatewayOutput{})
	pulumi.RegisterOutputType(VirtualGatewayArrayOutput{})
	pulumi.RegisterOutputType(VirtualGatewayMapOutput{})
}
