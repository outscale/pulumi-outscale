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

// Manages a Subnet.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-subnet).
//
// ## Example Usage
//
// ## Import
//
// A subnet can be imported using its ID. For exampleconsole
//
// ```sh
//
//	$ pulumi import outscale:index/subnet:Subnet ImportedSubnet subnet-12345678
//
// ```
type Subnet struct {
	pulumi.CustomResourceState

	// The number of available IPs in the Subnets.
	AvailableIpsCount pulumi.IntOutput `pulumi:"availableIpsCount"`
	// The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).<br />
	// The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
	IpRange pulumi.StringOutput `pulumi:"ipRange"`
	// If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
	MapPublicIpOnLaunch pulumi.BoolPtrOutput `pulumi:"mapPublicIpOnLaunch"`
	// The ID of the Net for which you want to create a Subnet.
	NetId     pulumi.StringOutput `pulumi:"netId"`
	RequestId pulumi.StringOutput `pulumi:"requestId"`
	// The state of the Subnet (`pending` \| `available` \| `deleted`).
	State pulumi.StringOutput `pulumi:"state"`
	// The ID of the Subnet.
	SubnetId pulumi.StringOutput `pulumi:"subnetId"`
	// The name of the Subregion in which you want to create the Subnet.
	SubregionName pulumi.StringOutput `pulumi:"subregionName"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags SubnetTagArrayOutput `pulumi:"tags"`
}

// NewSubnet registers a new resource with the given unique name, arguments, and options.
func NewSubnet(ctx *pulumi.Context,
	name string, args *SubnetArgs, opts ...pulumi.ResourceOption) (*Subnet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IpRange == nil {
		return nil, errors.New("invalid value for required argument 'IpRange'")
	}
	if args.NetId == nil {
		return nil, errors.New("invalid value for required argument 'NetId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Subnet
	err := ctx.RegisterResource("outscale:index/subnet:Subnet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubnet gets an existing Subnet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubnet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubnetState, opts ...pulumi.ResourceOption) (*Subnet, error) {
	var resource Subnet
	err := ctx.ReadResource("outscale:index/subnet:Subnet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Subnet resources.
type subnetState struct {
	// The number of available IPs in the Subnets.
	AvailableIpsCount *int `pulumi:"availableIpsCount"`
	// The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).<br />
	// The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
	IpRange *string `pulumi:"ipRange"`
	// If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
	MapPublicIpOnLaunch *bool `pulumi:"mapPublicIpOnLaunch"`
	// The ID of the Net for which you want to create a Subnet.
	NetId     *string `pulumi:"netId"`
	RequestId *string `pulumi:"requestId"`
	// The state of the Subnet (`pending` \| `available` \| `deleted`).
	State *string `pulumi:"state"`
	// The ID of the Subnet.
	SubnetId *string `pulumi:"subnetId"`
	// The name of the Subregion in which you want to create the Subnet.
	SubregionName *string `pulumi:"subregionName"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags []SubnetTag `pulumi:"tags"`
}

type SubnetState struct {
	// The number of available IPs in the Subnets.
	AvailableIpsCount pulumi.IntPtrInput
	// The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).<br />
	// The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
	IpRange pulumi.StringPtrInput
	// If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
	MapPublicIpOnLaunch pulumi.BoolPtrInput
	// The ID of the Net for which you want to create a Subnet.
	NetId     pulumi.StringPtrInput
	RequestId pulumi.StringPtrInput
	// The state of the Subnet (`pending` \| `available` \| `deleted`).
	State pulumi.StringPtrInput
	// The ID of the Subnet.
	SubnetId pulumi.StringPtrInput
	// The name of the Subregion in which you want to create the Subnet.
	SubregionName pulumi.StringPtrInput
	// A tag to add to this resource. You can specify this argument several times.
	Tags SubnetTagArrayInput
}

func (SubnetState) ElementType() reflect.Type {
	return reflect.TypeOf((*subnetState)(nil)).Elem()
}

type subnetArgs struct {
	// The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).<br />
	// The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
	IpRange string `pulumi:"ipRange"`
	// If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
	MapPublicIpOnLaunch *bool `pulumi:"mapPublicIpOnLaunch"`
	// The ID of the Net for which you want to create a Subnet.
	NetId string `pulumi:"netId"`
	// The name of the Subregion in which you want to create the Subnet.
	SubregionName *string `pulumi:"subregionName"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags []SubnetTag `pulumi:"tags"`
}

// The set of arguments for constructing a Subnet resource.
type SubnetArgs struct {
	// The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).<br />
	// The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
	IpRange pulumi.StringInput
	// If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
	MapPublicIpOnLaunch pulumi.BoolPtrInput
	// The ID of the Net for which you want to create a Subnet.
	NetId pulumi.StringInput
	// The name of the Subregion in which you want to create the Subnet.
	SubregionName pulumi.StringPtrInput
	// A tag to add to this resource. You can specify this argument several times.
	Tags SubnetTagArrayInput
}

func (SubnetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subnetArgs)(nil)).Elem()
}

type SubnetInput interface {
	pulumi.Input

	ToSubnetOutput() SubnetOutput
	ToSubnetOutputWithContext(ctx context.Context) SubnetOutput
}

func (*Subnet) ElementType() reflect.Type {
	return reflect.TypeOf((**Subnet)(nil)).Elem()
}

func (i *Subnet) ToSubnetOutput() SubnetOutput {
	return i.ToSubnetOutputWithContext(context.Background())
}

func (i *Subnet) ToSubnetOutputWithContext(ctx context.Context) SubnetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetOutput)
}

func (i *Subnet) ToOutput(ctx context.Context) pulumix.Output[*Subnet] {
	return pulumix.Output[*Subnet]{
		OutputState: i.ToSubnetOutputWithContext(ctx).OutputState,
	}
}

// SubnetArrayInput is an input type that accepts SubnetArray and SubnetArrayOutput values.
// You can construct a concrete instance of `SubnetArrayInput` via:
//
//	SubnetArray{ SubnetArgs{...} }
type SubnetArrayInput interface {
	pulumi.Input

	ToSubnetArrayOutput() SubnetArrayOutput
	ToSubnetArrayOutputWithContext(context.Context) SubnetArrayOutput
}

type SubnetArray []SubnetInput

func (SubnetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subnet)(nil)).Elem()
}

func (i SubnetArray) ToSubnetArrayOutput() SubnetArrayOutput {
	return i.ToSubnetArrayOutputWithContext(context.Background())
}

func (i SubnetArray) ToSubnetArrayOutputWithContext(ctx context.Context) SubnetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetArrayOutput)
}

func (i SubnetArray) ToOutput(ctx context.Context) pulumix.Output[[]*Subnet] {
	return pulumix.Output[[]*Subnet]{
		OutputState: i.ToSubnetArrayOutputWithContext(ctx).OutputState,
	}
}

// SubnetMapInput is an input type that accepts SubnetMap and SubnetMapOutput values.
// You can construct a concrete instance of `SubnetMapInput` via:
//
//	SubnetMap{ "key": SubnetArgs{...} }
type SubnetMapInput interface {
	pulumi.Input

	ToSubnetMapOutput() SubnetMapOutput
	ToSubnetMapOutputWithContext(context.Context) SubnetMapOutput
}

type SubnetMap map[string]SubnetInput

func (SubnetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subnet)(nil)).Elem()
}

func (i SubnetMap) ToSubnetMapOutput() SubnetMapOutput {
	return i.ToSubnetMapOutputWithContext(context.Background())
}

func (i SubnetMap) ToSubnetMapOutputWithContext(ctx context.Context) SubnetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubnetMapOutput)
}

func (i SubnetMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Subnet] {
	return pulumix.Output[map[string]*Subnet]{
		OutputState: i.ToSubnetMapOutputWithContext(ctx).OutputState,
	}
}

type SubnetOutput struct{ *pulumi.OutputState }

func (SubnetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Subnet)(nil)).Elem()
}

func (o SubnetOutput) ToSubnetOutput() SubnetOutput {
	return o
}

func (o SubnetOutput) ToSubnetOutputWithContext(ctx context.Context) SubnetOutput {
	return o
}

func (o SubnetOutput) ToOutput(ctx context.Context) pulumix.Output[*Subnet] {
	return pulumix.Output[*Subnet]{
		OutputState: o.OutputState,
	}
}

// The number of available IPs in the Subnets.
func (o SubnetOutput) AvailableIpsCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Subnet) pulumi.IntOutput { return v.AvailableIpsCount }).(pulumi.IntOutput)
}

// The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).<br />
// The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
func (o SubnetOutput) IpRange() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.IpRange }).(pulumi.StringOutput)
}

// If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
func (o SubnetOutput) MapPublicIpOnLaunch() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Subnet) pulumi.BoolPtrOutput { return v.MapPublicIpOnLaunch }).(pulumi.BoolPtrOutput)
}

// The ID of the Net for which you want to create a Subnet.
func (o SubnetOutput) NetId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.NetId }).(pulumi.StringOutput)
}

func (o SubnetOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// The state of the Subnet (`pending` \| `available` \| `deleted`).
func (o SubnetOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The ID of the Subnet.
func (o SubnetOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.SubnetId }).(pulumi.StringOutput)
}

// The name of the Subregion in which you want to create the Subnet.
func (o SubnetOutput) SubregionName() pulumi.StringOutput {
	return o.ApplyT(func(v *Subnet) pulumi.StringOutput { return v.SubregionName }).(pulumi.StringOutput)
}

// A tag to add to this resource. You can specify this argument several times.
func (o SubnetOutput) Tags() SubnetTagArrayOutput {
	return o.ApplyT(func(v *Subnet) SubnetTagArrayOutput { return v.Tags }).(SubnetTagArrayOutput)
}

type SubnetArrayOutput struct{ *pulumi.OutputState }

func (SubnetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subnet)(nil)).Elem()
}

func (o SubnetArrayOutput) ToSubnetArrayOutput() SubnetArrayOutput {
	return o
}

func (o SubnetArrayOutput) ToSubnetArrayOutputWithContext(ctx context.Context) SubnetArrayOutput {
	return o
}

func (o SubnetArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Subnet] {
	return pulumix.Output[[]*Subnet]{
		OutputState: o.OutputState,
	}
}

func (o SubnetArrayOutput) Index(i pulumi.IntInput) SubnetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Subnet {
		return vs[0].([]*Subnet)[vs[1].(int)]
	}).(SubnetOutput)
}

type SubnetMapOutput struct{ *pulumi.OutputState }

func (SubnetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subnet)(nil)).Elem()
}

func (o SubnetMapOutput) ToSubnetMapOutput() SubnetMapOutput {
	return o
}

func (o SubnetMapOutput) ToSubnetMapOutputWithContext(ctx context.Context) SubnetMapOutput {
	return o
}

func (o SubnetMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Subnet] {
	return pulumix.Output[map[string]*Subnet]{
		OutputState: o.OutputState,
	}
}

func (o SubnetMapOutput) MapIndex(k pulumi.StringInput) SubnetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Subnet {
		return vs[0].(map[string]*Subnet)[vs[1].(string)]
	}).(SubnetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetInput)(nil)).Elem(), &Subnet{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetArrayInput)(nil)).Elem(), SubnetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubnetMapInput)(nil)).Elem(), SubnetMap{})
	pulumi.RegisterOutputType(SubnetOutput{})
	pulumi.RegisterOutputType(SubnetArrayOutput{})
	pulumi.RegisterOutputType(SubnetMapOutput{})
}
