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

// Manages a Net peering.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Peering-Connections.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netpeering).
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
//			_, err := outscale.NewNet(ctx, "net01", &outscale.NetArgs{
//				IpRange: pulumi.String("10.10.0.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = outscale.NewNet(ctx, "net02", &outscale.NetArgs{
//				IpRange: pulumi.String("10.31.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Peer Nets
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
//			_, err := outscale.NewNetPeering(ctx, "netPeering01", &outscale.NetPeeringArgs{
//				AccepterNetId: pulumi.Any(outscale_net.Net01.Net_id),
//				SourceNetId:   pulumi.Any(outscale_net.Net02.Net_id),
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
// A Net peering can be imported using its ID. For exampleconsole
//
// ```sh
//
//	$ pulumi import outscale:index/netPeering:NetPeering ImportedNetPeering pcx-12345678
//
// ```
type NetPeering struct {
	pulumi.CustomResourceState

	// The ID of the Net you want to connect with.
	AccepterNetId pulumi.StringOutput `pulumi:"accepterNetId"`
	// Information about the accepter Net.
	AccepterNets NetPeeringAccepterNetArrayOutput `pulumi:"accepterNets"`
	// The ID of the Net peering.
	NetPeeringId       pulumi.StringOutput `pulumi:"netPeeringId"`
	RequestId          pulumi.StringOutput `pulumi:"requestId"`
	SourceNetAccountId pulumi.StringOutput `pulumi:"sourceNetAccountId"`
	// The ID of the Net you send the peering request from.
	SourceNetId pulumi.StringOutput `pulumi:"sourceNetId"`
	// Information about the source Net.
	SourceNets NetPeeringSourceNetArrayOutput `pulumi:"sourceNets"`
	// Information about the state of the Net peering.
	States NetPeeringStateTypeArrayOutput `pulumi:"states"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags NetPeeringTagArrayOutput `pulumi:"tags"`
}

// NewNetPeering registers a new resource with the given unique name, arguments, and options.
func NewNetPeering(ctx *pulumi.Context,
	name string, args *NetPeeringArgs, opts ...pulumi.ResourceOption) (*NetPeering, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccepterNetId == nil {
		return nil, errors.New("invalid value for required argument 'AccepterNetId'")
	}
	if args.SourceNetId == nil {
		return nil, errors.New("invalid value for required argument 'SourceNetId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NetPeering
	err := ctx.RegisterResource("outscale:index/netPeering:NetPeering", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetPeering gets an existing NetPeering resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetPeering(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetPeeringState, opts ...pulumi.ResourceOption) (*NetPeering, error) {
	var resource NetPeering
	err := ctx.ReadResource("outscale:index/netPeering:NetPeering", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetPeering resources.
type netPeeringState struct {
	// The ID of the Net you want to connect with.
	AccepterNetId *string `pulumi:"accepterNetId"`
	// Information about the accepter Net.
	AccepterNets []NetPeeringAccepterNet `pulumi:"accepterNets"`
	// The ID of the Net peering.
	NetPeeringId       *string `pulumi:"netPeeringId"`
	RequestId          *string `pulumi:"requestId"`
	SourceNetAccountId *string `pulumi:"sourceNetAccountId"`
	// The ID of the Net you send the peering request from.
	SourceNetId *string `pulumi:"sourceNetId"`
	// Information about the source Net.
	SourceNets []NetPeeringSourceNet `pulumi:"sourceNets"`
	// Information about the state of the Net peering.
	States []NetPeeringStateType `pulumi:"states"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags []NetPeeringTag `pulumi:"tags"`
}

type NetPeeringState struct {
	// The ID of the Net you want to connect with.
	AccepterNetId pulumi.StringPtrInput
	// Information about the accepter Net.
	AccepterNets NetPeeringAccepterNetArrayInput
	// The ID of the Net peering.
	NetPeeringId       pulumi.StringPtrInput
	RequestId          pulumi.StringPtrInput
	SourceNetAccountId pulumi.StringPtrInput
	// The ID of the Net you send the peering request from.
	SourceNetId pulumi.StringPtrInput
	// Information about the source Net.
	SourceNets NetPeeringSourceNetArrayInput
	// Information about the state of the Net peering.
	States NetPeeringStateTypeArrayInput
	// A tag to add to this resource. You can specify this argument several times.
	Tags NetPeeringTagArrayInput
}

func (NetPeeringState) ElementType() reflect.Type {
	return reflect.TypeOf((*netPeeringState)(nil)).Elem()
}

type netPeeringArgs struct {
	// The ID of the Net you want to connect with.
	AccepterNetId      string  `pulumi:"accepterNetId"`
	SourceNetAccountId *string `pulumi:"sourceNetAccountId"`
	// The ID of the Net you send the peering request from.
	SourceNetId string `pulumi:"sourceNetId"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags []NetPeeringTag `pulumi:"tags"`
}

// The set of arguments for constructing a NetPeering resource.
type NetPeeringArgs struct {
	// The ID of the Net you want to connect with.
	AccepterNetId      pulumi.StringInput
	SourceNetAccountId pulumi.StringPtrInput
	// The ID of the Net you send the peering request from.
	SourceNetId pulumi.StringInput
	// A tag to add to this resource. You can specify this argument several times.
	Tags NetPeeringTagArrayInput
}

func (NetPeeringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*netPeeringArgs)(nil)).Elem()
}

type NetPeeringInput interface {
	pulumi.Input

	ToNetPeeringOutput() NetPeeringOutput
	ToNetPeeringOutputWithContext(ctx context.Context) NetPeeringOutput
}

func (*NetPeering) ElementType() reflect.Type {
	return reflect.TypeOf((**NetPeering)(nil)).Elem()
}

func (i *NetPeering) ToNetPeeringOutput() NetPeeringOutput {
	return i.ToNetPeeringOutputWithContext(context.Background())
}

func (i *NetPeering) ToNetPeeringOutputWithContext(ctx context.Context) NetPeeringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetPeeringOutput)
}

// NetPeeringArrayInput is an input type that accepts NetPeeringArray and NetPeeringArrayOutput values.
// You can construct a concrete instance of `NetPeeringArrayInput` via:
//
//	NetPeeringArray{ NetPeeringArgs{...} }
type NetPeeringArrayInput interface {
	pulumi.Input

	ToNetPeeringArrayOutput() NetPeeringArrayOutput
	ToNetPeeringArrayOutputWithContext(context.Context) NetPeeringArrayOutput
}

type NetPeeringArray []NetPeeringInput

func (NetPeeringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetPeering)(nil)).Elem()
}

func (i NetPeeringArray) ToNetPeeringArrayOutput() NetPeeringArrayOutput {
	return i.ToNetPeeringArrayOutputWithContext(context.Background())
}

func (i NetPeeringArray) ToNetPeeringArrayOutputWithContext(ctx context.Context) NetPeeringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetPeeringArrayOutput)
}

// NetPeeringMapInput is an input type that accepts NetPeeringMap and NetPeeringMapOutput values.
// You can construct a concrete instance of `NetPeeringMapInput` via:
//
//	NetPeeringMap{ "key": NetPeeringArgs{...} }
type NetPeeringMapInput interface {
	pulumi.Input

	ToNetPeeringMapOutput() NetPeeringMapOutput
	ToNetPeeringMapOutputWithContext(context.Context) NetPeeringMapOutput
}

type NetPeeringMap map[string]NetPeeringInput

func (NetPeeringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetPeering)(nil)).Elem()
}

func (i NetPeeringMap) ToNetPeeringMapOutput() NetPeeringMapOutput {
	return i.ToNetPeeringMapOutputWithContext(context.Background())
}

func (i NetPeeringMap) ToNetPeeringMapOutputWithContext(ctx context.Context) NetPeeringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetPeeringMapOutput)
}

type NetPeeringOutput struct{ *pulumi.OutputState }

func (NetPeeringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetPeering)(nil)).Elem()
}

func (o NetPeeringOutput) ToNetPeeringOutput() NetPeeringOutput {
	return o
}

func (o NetPeeringOutput) ToNetPeeringOutputWithContext(ctx context.Context) NetPeeringOutput {
	return o
}

// The ID of the Net you want to connect with.
func (o NetPeeringOutput) AccepterNetId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetPeering) pulumi.StringOutput { return v.AccepterNetId }).(pulumi.StringOutput)
}

// Information about the accepter Net.
func (o NetPeeringOutput) AccepterNets() NetPeeringAccepterNetArrayOutput {
	return o.ApplyT(func(v *NetPeering) NetPeeringAccepterNetArrayOutput { return v.AccepterNets }).(NetPeeringAccepterNetArrayOutput)
}

// The ID of the Net peering.
func (o NetPeeringOutput) NetPeeringId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetPeering) pulumi.StringOutput { return v.NetPeeringId }).(pulumi.StringOutput)
}

func (o NetPeeringOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetPeering) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

func (o NetPeeringOutput) SourceNetAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetPeering) pulumi.StringOutput { return v.SourceNetAccountId }).(pulumi.StringOutput)
}

// The ID of the Net you send the peering request from.
func (o NetPeeringOutput) SourceNetId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetPeering) pulumi.StringOutput { return v.SourceNetId }).(pulumi.StringOutput)
}

// Information about the source Net.
func (o NetPeeringOutput) SourceNets() NetPeeringSourceNetArrayOutput {
	return o.ApplyT(func(v *NetPeering) NetPeeringSourceNetArrayOutput { return v.SourceNets }).(NetPeeringSourceNetArrayOutput)
}

// Information about the state of the Net peering.
func (o NetPeeringOutput) States() NetPeeringStateTypeArrayOutput {
	return o.ApplyT(func(v *NetPeering) NetPeeringStateTypeArrayOutput { return v.States }).(NetPeeringStateTypeArrayOutput)
}

// A tag to add to this resource. You can specify this argument several times.
func (o NetPeeringOutput) Tags() NetPeeringTagArrayOutput {
	return o.ApplyT(func(v *NetPeering) NetPeeringTagArrayOutput { return v.Tags }).(NetPeeringTagArrayOutput)
}

type NetPeeringArrayOutput struct{ *pulumi.OutputState }

func (NetPeeringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetPeering)(nil)).Elem()
}

func (o NetPeeringArrayOutput) ToNetPeeringArrayOutput() NetPeeringArrayOutput {
	return o
}

func (o NetPeeringArrayOutput) ToNetPeeringArrayOutputWithContext(ctx context.Context) NetPeeringArrayOutput {
	return o
}

func (o NetPeeringArrayOutput) Index(i pulumi.IntInput) NetPeeringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetPeering {
		return vs[0].([]*NetPeering)[vs[1].(int)]
	}).(NetPeeringOutput)
}

type NetPeeringMapOutput struct{ *pulumi.OutputState }

func (NetPeeringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetPeering)(nil)).Elem()
}

func (o NetPeeringMapOutput) ToNetPeeringMapOutput() NetPeeringMapOutput {
	return o
}

func (o NetPeeringMapOutput) ToNetPeeringMapOutputWithContext(ctx context.Context) NetPeeringMapOutput {
	return o
}

func (o NetPeeringMapOutput) MapIndex(k pulumi.StringInput) NetPeeringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetPeering {
		return vs[0].(map[string]*NetPeering)[vs[1].(string)]
	}).(NetPeeringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetPeeringInput)(nil)).Elem(), &NetPeering{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetPeeringArrayInput)(nil)).Elem(), NetPeeringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetPeeringMapInput)(nil)).Elem(), NetPeeringMap{})
	pulumi.RegisterOutputType(NetPeeringOutput{})
	pulumi.RegisterOutputType(NetPeeringArrayOutput{})
	pulumi.RegisterOutputType(NetPeeringMapOutput{})
}