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

// Manages a flexible GPU link.
//
// When linking a flexible GPU to a VM, the VM will automatically be stopped and started again.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
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
//			_, err := outscale.NewVm(ctx, "vm01", &outscale.VmArgs{
//				ImageId:                pulumi.Any(ami_12345678),
//				VmType:                 pulumi.Any(t2.Small),
//				KeypairName:            pulumi.Any(_var.Keypair_name),
//				PlacementSubregionName: pulumi.String("eu-west-2a"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = outscale.NewFlexibleGpu(ctx, "flexibleGpu01", &outscale.FlexibleGpuArgs{
//				ModelName:          pulumi.Any(_var.Model_name),
//				Generation:         pulumi.String("v4"),
//				SubregionName:      pulumi.String("eu-west-2a"),
//				DeleteOnVmDeletion: pulumi.Bool(true),
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
// A flexible GPU link can be imported using the flexible GPU ID. For exampleconsole
//
// ```sh
//
//	$ pulumi import outscale:index/flexibleGpuLink:FlexibleGpuLink imported_link_fgpu fgpu-12345678
//
// ```
type FlexibleGpuLink struct {
	pulumi.CustomResourceState

	FlexibleGpuIds pulumi.StringArrayOutput `pulumi:"flexibleGpuIds"`
	RequestId      pulumi.StringOutput      `pulumi:"requestId"`
	// The ID of the VM you want to attach the fGPU to.
	VmId pulumi.StringOutput `pulumi:"vmId"`
}

// NewFlexibleGpuLink registers a new resource with the given unique name, arguments, and options.
func NewFlexibleGpuLink(ctx *pulumi.Context,
	name string, args *FlexibleGpuLinkArgs, opts ...pulumi.ResourceOption) (*FlexibleGpuLink, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FlexibleGpuIds == nil {
		return nil, errors.New("invalid value for required argument 'FlexibleGpuIds'")
	}
	if args.VmId == nil {
		return nil, errors.New("invalid value for required argument 'VmId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FlexibleGpuLink
	err := ctx.RegisterResource("outscale:index/flexibleGpuLink:FlexibleGpuLink", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFlexibleGpuLink gets an existing FlexibleGpuLink resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFlexibleGpuLink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FlexibleGpuLinkState, opts ...pulumi.ResourceOption) (*FlexibleGpuLink, error) {
	var resource FlexibleGpuLink
	err := ctx.ReadResource("outscale:index/flexibleGpuLink:FlexibleGpuLink", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FlexibleGpuLink resources.
type flexibleGpuLinkState struct {
	FlexibleGpuIds []string `pulumi:"flexibleGpuIds"`
	RequestId      *string  `pulumi:"requestId"`
	// The ID of the VM you want to attach the fGPU to.
	VmId *string `pulumi:"vmId"`
}

type FlexibleGpuLinkState struct {
	FlexibleGpuIds pulumi.StringArrayInput
	RequestId      pulumi.StringPtrInput
	// The ID of the VM you want to attach the fGPU to.
	VmId pulumi.StringPtrInput
}

func (FlexibleGpuLinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*flexibleGpuLinkState)(nil)).Elem()
}

type flexibleGpuLinkArgs struct {
	FlexibleGpuIds []string `pulumi:"flexibleGpuIds"`
	// The ID of the VM you want to attach the fGPU to.
	VmId string `pulumi:"vmId"`
}

// The set of arguments for constructing a FlexibleGpuLink resource.
type FlexibleGpuLinkArgs struct {
	FlexibleGpuIds pulumi.StringArrayInput
	// The ID of the VM you want to attach the fGPU to.
	VmId pulumi.StringInput
}

func (FlexibleGpuLinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*flexibleGpuLinkArgs)(nil)).Elem()
}

type FlexibleGpuLinkInput interface {
	pulumi.Input

	ToFlexibleGpuLinkOutput() FlexibleGpuLinkOutput
	ToFlexibleGpuLinkOutputWithContext(ctx context.Context) FlexibleGpuLinkOutput
}

func (*FlexibleGpuLink) ElementType() reflect.Type {
	return reflect.TypeOf((**FlexibleGpuLink)(nil)).Elem()
}

func (i *FlexibleGpuLink) ToFlexibleGpuLinkOutput() FlexibleGpuLinkOutput {
	return i.ToFlexibleGpuLinkOutputWithContext(context.Background())
}

func (i *FlexibleGpuLink) ToFlexibleGpuLinkOutputWithContext(ctx context.Context) FlexibleGpuLinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlexibleGpuLinkOutput)
}

// FlexibleGpuLinkArrayInput is an input type that accepts FlexibleGpuLinkArray and FlexibleGpuLinkArrayOutput values.
// You can construct a concrete instance of `FlexibleGpuLinkArrayInput` via:
//
//	FlexibleGpuLinkArray{ FlexibleGpuLinkArgs{...} }
type FlexibleGpuLinkArrayInput interface {
	pulumi.Input

	ToFlexibleGpuLinkArrayOutput() FlexibleGpuLinkArrayOutput
	ToFlexibleGpuLinkArrayOutputWithContext(context.Context) FlexibleGpuLinkArrayOutput
}

type FlexibleGpuLinkArray []FlexibleGpuLinkInput

func (FlexibleGpuLinkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlexibleGpuLink)(nil)).Elem()
}

func (i FlexibleGpuLinkArray) ToFlexibleGpuLinkArrayOutput() FlexibleGpuLinkArrayOutput {
	return i.ToFlexibleGpuLinkArrayOutputWithContext(context.Background())
}

func (i FlexibleGpuLinkArray) ToFlexibleGpuLinkArrayOutputWithContext(ctx context.Context) FlexibleGpuLinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlexibleGpuLinkArrayOutput)
}

// FlexibleGpuLinkMapInput is an input type that accepts FlexibleGpuLinkMap and FlexibleGpuLinkMapOutput values.
// You can construct a concrete instance of `FlexibleGpuLinkMapInput` via:
//
//	FlexibleGpuLinkMap{ "key": FlexibleGpuLinkArgs{...} }
type FlexibleGpuLinkMapInput interface {
	pulumi.Input

	ToFlexibleGpuLinkMapOutput() FlexibleGpuLinkMapOutput
	ToFlexibleGpuLinkMapOutputWithContext(context.Context) FlexibleGpuLinkMapOutput
}

type FlexibleGpuLinkMap map[string]FlexibleGpuLinkInput

func (FlexibleGpuLinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlexibleGpuLink)(nil)).Elem()
}

func (i FlexibleGpuLinkMap) ToFlexibleGpuLinkMapOutput() FlexibleGpuLinkMapOutput {
	return i.ToFlexibleGpuLinkMapOutputWithContext(context.Background())
}

func (i FlexibleGpuLinkMap) ToFlexibleGpuLinkMapOutputWithContext(ctx context.Context) FlexibleGpuLinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlexibleGpuLinkMapOutput)
}

type FlexibleGpuLinkOutput struct{ *pulumi.OutputState }

func (FlexibleGpuLinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FlexibleGpuLink)(nil)).Elem()
}

func (o FlexibleGpuLinkOutput) ToFlexibleGpuLinkOutput() FlexibleGpuLinkOutput {
	return o
}

func (o FlexibleGpuLinkOutput) ToFlexibleGpuLinkOutputWithContext(ctx context.Context) FlexibleGpuLinkOutput {
	return o
}

func (o FlexibleGpuLinkOutput) FlexibleGpuIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FlexibleGpuLink) pulumi.StringArrayOutput { return v.FlexibleGpuIds }).(pulumi.StringArrayOutput)
}

func (o FlexibleGpuLinkOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *FlexibleGpuLink) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// The ID of the VM you want to attach the fGPU to.
func (o FlexibleGpuLinkOutput) VmId() pulumi.StringOutput {
	return o.ApplyT(func(v *FlexibleGpuLink) pulumi.StringOutput { return v.VmId }).(pulumi.StringOutput)
}

type FlexibleGpuLinkArrayOutput struct{ *pulumi.OutputState }

func (FlexibleGpuLinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlexibleGpuLink)(nil)).Elem()
}

func (o FlexibleGpuLinkArrayOutput) ToFlexibleGpuLinkArrayOutput() FlexibleGpuLinkArrayOutput {
	return o
}

func (o FlexibleGpuLinkArrayOutput) ToFlexibleGpuLinkArrayOutputWithContext(ctx context.Context) FlexibleGpuLinkArrayOutput {
	return o
}

func (o FlexibleGpuLinkArrayOutput) Index(i pulumi.IntInput) FlexibleGpuLinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FlexibleGpuLink {
		return vs[0].([]*FlexibleGpuLink)[vs[1].(int)]
	}).(FlexibleGpuLinkOutput)
}

type FlexibleGpuLinkMapOutput struct{ *pulumi.OutputState }

func (FlexibleGpuLinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlexibleGpuLink)(nil)).Elem()
}

func (o FlexibleGpuLinkMapOutput) ToFlexibleGpuLinkMapOutput() FlexibleGpuLinkMapOutput {
	return o
}

func (o FlexibleGpuLinkMapOutput) ToFlexibleGpuLinkMapOutputWithContext(ctx context.Context) FlexibleGpuLinkMapOutput {
	return o
}

func (o FlexibleGpuLinkMapOutput) MapIndex(k pulumi.StringInput) FlexibleGpuLinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FlexibleGpuLink {
		return vs[0].(map[string]*FlexibleGpuLink)[vs[1].(string)]
	}).(FlexibleGpuLinkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FlexibleGpuLinkInput)(nil)).Elem(), &FlexibleGpuLink{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlexibleGpuLinkArrayInput)(nil)).Elem(), FlexibleGpuLinkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlexibleGpuLinkMapInput)(nil)).Elem(), FlexibleGpuLinkMap{})
	pulumi.RegisterOutputType(FlexibleGpuLinkOutput{})
	pulumi.RegisterOutputType(FlexibleGpuLinkArrayOutput{})
	pulumi.RegisterOutputType(FlexibleGpuLinkMapOutput{})
}
