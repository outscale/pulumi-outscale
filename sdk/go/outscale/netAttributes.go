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

// Manages the attributes of a Net.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-DHCP-Options.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updatenet).
//
// ## Example Usage
// ### Required resource
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
//			_, err := outscale.NewNet(ctx, "net01", &outscale.NetArgs{
//				IpRange: pulumi.String("10.0.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Associate a DHCP option set to a Net
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
//			_, err := outscale.NewNetAttributes(ctx, "netAttributes01", &outscale.NetAttributesArgs{
//				NetId:            pulumi.Any(outscale_net.Net01.Net_id),
//				DhcpOptionsSetId: pulumi.Any(_var.Dhcp_options_set_id),
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
// A Net attribute can be imported using the Net ID. For exampleconsole
//
// ```sh
//
//	$ pulumi import outscale:index/netAttributes:NetAttributes ImportedNet vpc-12345678
//
// ```
type NetAttributes struct {
	pulumi.CustomResourceState

	// The ID of the DHCP options set (or `default` if you want to associate the default one).
	DhcpOptionsSetId pulumi.StringOutput `pulumi:"dhcpOptionsSetId"`
	// The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
	IpRange pulumi.StringOutput `pulumi:"ipRange"`
	// The ID of the Net.
	NetId     pulumi.StringOutput `pulumi:"netId"`
	RequestId pulumi.StringOutput `pulumi:"requestId"`
	// The state of the Net (`pending` \| `available` \| `deleted`).
	State pulumi.StringOutput `pulumi:"state"`
	// One or more tags associated with the Net.
	Tags NetAttributesTagArrayOutput `pulumi:"tags"`
	// The VM tenancy in a Net.
	Tenancy pulumi.StringOutput `pulumi:"tenancy"`
}

// NewNetAttributes registers a new resource with the given unique name, arguments, and options.
func NewNetAttributes(ctx *pulumi.Context,
	name string, args *NetAttributesArgs, opts ...pulumi.ResourceOption) (*NetAttributes, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetId == nil {
		return nil, errors.New("invalid value for required argument 'NetId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NetAttributes
	err := ctx.RegisterResource("outscale:index/netAttributes:NetAttributes", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetAttributes gets an existing NetAttributes resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetAttributes(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetAttributesState, opts ...pulumi.ResourceOption) (*NetAttributes, error) {
	var resource NetAttributes
	err := ctx.ReadResource("outscale:index/netAttributes:NetAttributes", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetAttributes resources.
type netAttributesState struct {
	// The ID of the DHCP options set (or `default` if you want to associate the default one).
	DhcpOptionsSetId *string `pulumi:"dhcpOptionsSetId"`
	// The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
	IpRange *string `pulumi:"ipRange"`
	// The ID of the Net.
	NetId     *string `pulumi:"netId"`
	RequestId *string `pulumi:"requestId"`
	// The state of the Net (`pending` \| `available` \| `deleted`).
	State *string `pulumi:"state"`
	// One or more tags associated with the Net.
	Tags []NetAttributesTag `pulumi:"tags"`
	// The VM tenancy in a Net.
	Tenancy *string `pulumi:"tenancy"`
}

type NetAttributesState struct {
	// The ID of the DHCP options set (or `default` if you want to associate the default one).
	DhcpOptionsSetId pulumi.StringPtrInput
	// The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
	IpRange pulumi.StringPtrInput
	// The ID of the Net.
	NetId     pulumi.StringPtrInput
	RequestId pulumi.StringPtrInput
	// The state of the Net (`pending` \| `available` \| `deleted`).
	State pulumi.StringPtrInput
	// One or more tags associated with the Net.
	Tags NetAttributesTagArrayInput
	// The VM tenancy in a Net.
	Tenancy pulumi.StringPtrInput
}

func (NetAttributesState) ElementType() reflect.Type {
	return reflect.TypeOf((*netAttributesState)(nil)).Elem()
}

type netAttributesArgs struct {
	// The ID of the DHCP options set (or `default` if you want to associate the default one).
	DhcpOptionsSetId *string `pulumi:"dhcpOptionsSetId"`
	// The ID of the Net.
	NetId string `pulumi:"netId"`
}

// The set of arguments for constructing a NetAttributes resource.
type NetAttributesArgs struct {
	// The ID of the DHCP options set (or `default` if you want to associate the default one).
	DhcpOptionsSetId pulumi.StringPtrInput
	// The ID of the Net.
	NetId pulumi.StringInput
}

func (NetAttributesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*netAttributesArgs)(nil)).Elem()
}

type NetAttributesInput interface {
	pulumi.Input

	ToNetAttributesOutput() NetAttributesOutput
	ToNetAttributesOutputWithContext(ctx context.Context) NetAttributesOutput
}

func (*NetAttributes) ElementType() reflect.Type {
	return reflect.TypeOf((**NetAttributes)(nil)).Elem()
}

func (i *NetAttributes) ToNetAttributesOutput() NetAttributesOutput {
	return i.ToNetAttributesOutputWithContext(context.Background())
}

func (i *NetAttributes) ToNetAttributesOutputWithContext(ctx context.Context) NetAttributesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetAttributesOutput)
}

// NetAttributesArrayInput is an input type that accepts NetAttributesArray and NetAttributesArrayOutput values.
// You can construct a concrete instance of `NetAttributesArrayInput` via:
//
//	NetAttributesArray{ NetAttributesArgs{...} }
type NetAttributesArrayInput interface {
	pulumi.Input

	ToNetAttributesArrayOutput() NetAttributesArrayOutput
	ToNetAttributesArrayOutputWithContext(context.Context) NetAttributesArrayOutput
}

type NetAttributesArray []NetAttributesInput

func (NetAttributesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetAttributes)(nil)).Elem()
}

func (i NetAttributesArray) ToNetAttributesArrayOutput() NetAttributesArrayOutput {
	return i.ToNetAttributesArrayOutputWithContext(context.Background())
}

func (i NetAttributesArray) ToNetAttributesArrayOutputWithContext(ctx context.Context) NetAttributesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetAttributesArrayOutput)
}

// NetAttributesMapInput is an input type that accepts NetAttributesMap and NetAttributesMapOutput values.
// You can construct a concrete instance of `NetAttributesMapInput` via:
//
//	NetAttributesMap{ "key": NetAttributesArgs{...} }
type NetAttributesMapInput interface {
	pulumi.Input

	ToNetAttributesMapOutput() NetAttributesMapOutput
	ToNetAttributesMapOutputWithContext(context.Context) NetAttributesMapOutput
}

type NetAttributesMap map[string]NetAttributesInput

func (NetAttributesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetAttributes)(nil)).Elem()
}

func (i NetAttributesMap) ToNetAttributesMapOutput() NetAttributesMapOutput {
	return i.ToNetAttributesMapOutputWithContext(context.Background())
}

func (i NetAttributesMap) ToNetAttributesMapOutputWithContext(ctx context.Context) NetAttributesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetAttributesMapOutput)
}

type NetAttributesOutput struct{ *pulumi.OutputState }

func (NetAttributesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetAttributes)(nil)).Elem()
}

func (o NetAttributesOutput) ToNetAttributesOutput() NetAttributesOutput {
	return o
}

func (o NetAttributesOutput) ToNetAttributesOutputWithContext(ctx context.Context) NetAttributesOutput {
	return o
}

// The ID of the DHCP options set (or `default` if you want to associate the default one).
func (o NetAttributesOutput) DhcpOptionsSetId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetAttributes) pulumi.StringOutput { return v.DhcpOptionsSetId }).(pulumi.StringOutput)
}

// The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
func (o NetAttributesOutput) IpRange() pulumi.StringOutput {
	return o.ApplyT(func(v *NetAttributes) pulumi.StringOutput { return v.IpRange }).(pulumi.StringOutput)
}

// The ID of the Net.
func (o NetAttributesOutput) NetId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetAttributes) pulumi.StringOutput { return v.NetId }).(pulumi.StringOutput)
}

func (o NetAttributesOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetAttributes) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// The state of the Net (`pending` \| `available` \| `deleted`).
func (o NetAttributesOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *NetAttributes) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// One or more tags associated with the Net.
func (o NetAttributesOutput) Tags() NetAttributesTagArrayOutput {
	return o.ApplyT(func(v *NetAttributes) NetAttributesTagArrayOutput { return v.Tags }).(NetAttributesTagArrayOutput)
}

// The VM tenancy in a Net.
func (o NetAttributesOutput) Tenancy() pulumi.StringOutput {
	return o.ApplyT(func(v *NetAttributes) pulumi.StringOutput { return v.Tenancy }).(pulumi.StringOutput)
}

type NetAttributesArrayOutput struct{ *pulumi.OutputState }

func (NetAttributesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetAttributes)(nil)).Elem()
}

func (o NetAttributesArrayOutput) ToNetAttributesArrayOutput() NetAttributesArrayOutput {
	return o
}

func (o NetAttributesArrayOutput) ToNetAttributesArrayOutputWithContext(ctx context.Context) NetAttributesArrayOutput {
	return o
}

func (o NetAttributesArrayOutput) Index(i pulumi.IntInput) NetAttributesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetAttributes {
		return vs[0].([]*NetAttributes)[vs[1].(int)]
	}).(NetAttributesOutput)
}

type NetAttributesMapOutput struct{ *pulumi.OutputState }

func (NetAttributesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetAttributes)(nil)).Elem()
}

func (o NetAttributesMapOutput) ToNetAttributesMapOutput() NetAttributesMapOutput {
	return o
}

func (o NetAttributesMapOutput) ToNetAttributesMapOutputWithContext(ctx context.Context) NetAttributesMapOutput {
	return o
}

func (o NetAttributesMapOutput) MapIndex(k pulumi.StringInput) NetAttributesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetAttributes {
		return vs[0].(map[string]*NetAttributes)[vs[1].(string)]
	}).(NetAttributesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetAttributesInput)(nil)).Elem(), &NetAttributes{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetAttributesArrayInput)(nil)).Elem(), NetAttributesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetAttributesMapInput)(nil)).Elem(), NetAttributesMap{})
	pulumi.RegisterOutputType(NetAttributesOutput{})
	pulumi.RegisterOutputType(NetAttributesArrayOutput{})
	pulumi.RegisterOutputType(NetAttributesMapOutput{})
}