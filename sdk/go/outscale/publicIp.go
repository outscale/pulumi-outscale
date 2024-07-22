// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a public IP.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-EIPs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-publicip).
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
//			_, err := outscale.NewPublicIp(ctx, "publicIp01", nil)
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
// A public IP can be imported using its ID. For exampleconsole
//
// ```sh
//
//	$ pulumi import outscale:index/publicIp:PublicIp ImportedPublicIp eipalloc-12345678
//
// ```
type PublicIp struct {
	pulumi.CustomResourceState

	// (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
	LinkPublicIpId pulumi.StringOutput `pulumi:"linkPublicIpId"`
	// The account ID of the owner of the NIC.
	NicAccountId pulumi.StringOutput `pulumi:"nicAccountId"`
	// The ID of the NIC the public IP is associated with (if any).
	NicId pulumi.StringOutput `pulumi:"nicId"`
	// The private IP associated with the public IP.
	PrivateIp pulumi.StringOutput `pulumi:"privateIp"`
	// The public IP.
	PublicIp pulumi.StringOutput `pulumi:"publicIp"`
	// The allocation ID of the public IP.
	PublicIpId pulumi.StringOutput `pulumi:"publicIpId"`
	RequestId  pulumi.StringOutput `pulumi:"requestId"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags PublicIpTagArrayOutput `pulumi:"tags"`
	// The ID of the VM the public IP is associated with (if any).
	VmId pulumi.StringOutput `pulumi:"vmId"`
}

// NewPublicIp registers a new resource with the given unique name, arguments, and options.
func NewPublicIp(ctx *pulumi.Context,
	name string, args *PublicIpArgs, opts ...pulumi.ResourceOption) (*PublicIp, error) {
	if args == nil {
		args = &PublicIpArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PublicIp
	err := ctx.RegisterResource("outscale:index/publicIp:PublicIp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPublicIp gets an existing PublicIp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPublicIp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PublicIpState, opts ...pulumi.ResourceOption) (*PublicIp, error) {
	var resource PublicIp
	err := ctx.ReadResource("outscale:index/publicIp:PublicIp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PublicIp resources.
type publicIpState struct {
	// (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
	LinkPublicIpId *string `pulumi:"linkPublicIpId"`
	// The account ID of the owner of the NIC.
	NicAccountId *string `pulumi:"nicAccountId"`
	// The ID of the NIC the public IP is associated with (if any).
	NicId *string `pulumi:"nicId"`
	// The private IP associated with the public IP.
	PrivateIp *string `pulumi:"privateIp"`
	// The public IP.
	PublicIp *string `pulumi:"publicIp"`
	// The allocation ID of the public IP.
	PublicIpId *string `pulumi:"publicIpId"`
	RequestId  *string `pulumi:"requestId"`
	// A tag to add to this resource. You can specify this argument several times.
	Tags []PublicIpTag `pulumi:"tags"`
	// The ID of the VM the public IP is associated with (if any).
	VmId *string `pulumi:"vmId"`
}

type PublicIpState struct {
	// (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
	LinkPublicIpId pulumi.StringPtrInput
	// The account ID of the owner of the NIC.
	NicAccountId pulumi.StringPtrInput
	// The ID of the NIC the public IP is associated with (if any).
	NicId pulumi.StringPtrInput
	// The private IP associated with the public IP.
	PrivateIp pulumi.StringPtrInput
	// The public IP.
	PublicIp pulumi.StringPtrInput
	// The allocation ID of the public IP.
	PublicIpId pulumi.StringPtrInput
	RequestId  pulumi.StringPtrInput
	// A tag to add to this resource. You can specify this argument several times.
	Tags PublicIpTagArrayInput
	// The ID of the VM the public IP is associated with (if any).
	VmId pulumi.StringPtrInput
}

func (PublicIpState) ElementType() reflect.Type {
	return reflect.TypeOf((*publicIpState)(nil)).Elem()
}

type publicIpArgs struct {
	// A tag to add to this resource. You can specify this argument several times.
	Tags []PublicIpTag `pulumi:"tags"`
}

// The set of arguments for constructing a PublicIp resource.
type PublicIpArgs struct {
	// A tag to add to this resource. You can specify this argument several times.
	Tags PublicIpTagArrayInput
}

func (PublicIpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*publicIpArgs)(nil)).Elem()
}

type PublicIpInput interface {
	pulumi.Input

	ToPublicIpOutput() PublicIpOutput
	ToPublicIpOutputWithContext(ctx context.Context) PublicIpOutput
}

func (*PublicIp) ElementType() reflect.Type {
	return reflect.TypeOf((**PublicIp)(nil)).Elem()
}

func (i *PublicIp) ToPublicIpOutput() PublicIpOutput {
	return i.ToPublicIpOutputWithContext(context.Background())
}

func (i *PublicIp) ToPublicIpOutputWithContext(ctx context.Context) PublicIpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublicIpOutput)
}

// PublicIpArrayInput is an input type that accepts PublicIpArray and PublicIpArrayOutput values.
// You can construct a concrete instance of `PublicIpArrayInput` via:
//
//	PublicIpArray{ PublicIpArgs{...} }
type PublicIpArrayInput interface {
	pulumi.Input

	ToPublicIpArrayOutput() PublicIpArrayOutput
	ToPublicIpArrayOutputWithContext(context.Context) PublicIpArrayOutput
}

type PublicIpArray []PublicIpInput

func (PublicIpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PublicIp)(nil)).Elem()
}

func (i PublicIpArray) ToPublicIpArrayOutput() PublicIpArrayOutput {
	return i.ToPublicIpArrayOutputWithContext(context.Background())
}

func (i PublicIpArray) ToPublicIpArrayOutputWithContext(ctx context.Context) PublicIpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublicIpArrayOutput)
}

// PublicIpMapInput is an input type that accepts PublicIpMap and PublicIpMapOutput values.
// You can construct a concrete instance of `PublicIpMapInput` via:
//
//	PublicIpMap{ "key": PublicIpArgs{...} }
type PublicIpMapInput interface {
	pulumi.Input

	ToPublicIpMapOutput() PublicIpMapOutput
	ToPublicIpMapOutputWithContext(context.Context) PublicIpMapOutput
}

type PublicIpMap map[string]PublicIpInput

func (PublicIpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PublicIp)(nil)).Elem()
}

func (i PublicIpMap) ToPublicIpMapOutput() PublicIpMapOutput {
	return i.ToPublicIpMapOutputWithContext(context.Background())
}

func (i PublicIpMap) ToPublicIpMapOutputWithContext(ctx context.Context) PublicIpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublicIpMapOutput)
}

type PublicIpOutput struct{ *pulumi.OutputState }

func (PublicIpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PublicIp)(nil)).Elem()
}

func (o PublicIpOutput) ToPublicIpOutput() PublicIpOutput {
	return o
}

func (o PublicIpOutput) ToPublicIpOutputWithContext(ctx context.Context) PublicIpOutput {
	return o
}

// (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
func (o PublicIpOutput) LinkPublicIpId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIp) pulumi.StringOutput { return v.LinkPublicIpId }).(pulumi.StringOutput)
}

// The account ID of the owner of the NIC.
func (o PublicIpOutput) NicAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIp) pulumi.StringOutput { return v.NicAccountId }).(pulumi.StringOutput)
}

// The ID of the NIC the public IP is associated with (if any).
func (o PublicIpOutput) NicId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIp) pulumi.StringOutput { return v.NicId }).(pulumi.StringOutput)
}

// The private IP associated with the public IP.
func (o PublicIpOutput) PrivateIp() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIp) pulumi.StringOutput { return v.PrivateIp }).(pulumi.StringOutput)
}

// The public IP.
func (o PublicIpOutput) PublicIp() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIp) pulumi.StringOutput { return v.PublicIp }).(pulumi.StringOutput)
}

// The allocation ID of the public IP.
func (o PublicIpOutput) PublicIpId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIp) pulumi.StringOutput { return v.PublicIpId }).(pulumi.StringOutput)
}

func (o PublicIpOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIp) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// A tag to add to this resource. You can specify this argument several times.
func (o PublicIpOutput) Tags() PublicIpTagArrayOutput {
	return o.ApplyT(func(v *PublicIp) PublicIpTagArrayOutput { return v.Tags }).(PublicIpTagArrayOutput)
}

// The ID of the VM the public IP is associated with (if any).
func (o PublicIpOutput) VmId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIp) pulumi.StringOutput { return v.VmId }).(pulumi.StringOutput)
}

type PublicIpArrayOutput struct{ *pulumi.OutputState }

func (PublicIpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PublicIp)(nil)).Elem()
}

func (o PublicIpArrayOutput) ToPublicIpArrayOutput() PublicIpArrayOutput {
	return o
}

func (o PublicIpArrayOutput) ToPublicIpArrayOutputWithContext(ctx context.Context) PublicIpArrayOutput {
	return o
}

func (o PublicIpArrayOutput) Index(i pulumi.IntInput) PublicIpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PublicIp {
		return vs[0].([]*PublicIp)[vs[1].(int)]
	}).(PublicIpOutput)
}

type PublicIpMapOutput struct{ *pulumi.OutputState }

func (PublicIpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PublicIp)(nil)).Elem()
}

func (o PublicIpMapOutput) ToPublicIpMapOutput() PublicIpMapOutput {
	return o
}

func (o PublicIpMapOutput) ToPublicIpMapOutputWithContext(ctx context.Context) PublicIpMapOutput {
	return o
}

func (o PublicIpMapOutput) MapIndex(k pulumi.StringInput) PublicIpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PublicIp {
		return vs[0].(map[string]*PublicIp)[vs[1].(string)]
	}).(PublicIpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PublicIpInput)(nil)).Elem(), &PublicIp{})
	pulumi.RegisterInputType(reflect.TypeOf((*PublicIpArrayInput)(nil)).Elem(), PublicIpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PublicIpMapInput)(nil)).Elem(), PublicIpMap{})
	pulumi.RegisterOutputType(PublicIpOutput{})
	pulumi.RegisterOutputType(PublicIpArrayOutput{})
	pulumi.RegisterOutputType(PublicIpMapOutput{})
}
