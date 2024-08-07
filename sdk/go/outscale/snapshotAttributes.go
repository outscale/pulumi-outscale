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

// Manages snapshot attributes.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updatesnapshot).
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
//			volume01, err := outscale.NewVolume(ctx, "volume01", &outscale.VolumeArgs{
//				SubregionName: pulumi.String("eu-west-2a"),
//				Size:          pulumi.Int(40),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = outscale.NewSnapshot(ctx, "snapshot01", &outscale.SnapshotArgs{
//				VolumeId: volume01.VolumeId,
//				Tags: outscale.SnapshotTagArray{
//					&outscale.SnapshotTagArgs{
//						Key:   pulumi.String("name"),
//						Value: pulumi.String("terraform-snapshot-test"),
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
// ### Add permissions
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
//			_, err := outscale.NewSnapshotAttributes(ctx, "snapshotAttributes01", &outscale.SnapshotAttributesArgs{
//				SnapshotId: pulumi.Any(outscale_snapshot.Snapshot01.Snapshot_id),
//				PermissionsToCreateVolumeAdditions: &outscale.SnapshotAttributesPermissionsToCreateVolumeAdditionsArgs{
//					AccountIds: pulumi.StringArray{
//						pulumi.String("012345678910"),
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
// ### Remove permissions
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
//			_, err := outscale.NewSnapshotAttributes(ctx, "snapshotAttributes02", &outscale.SnapshotAttributesArgs{
//				SnapshotId: pulumi.Any(outscale_snapshot.Snapshot01.Snapshot_id),
//				PermissionsToCreateVolumeRemovals: outscale.SnapshotAttributesPermissionsToCreateVolumeRemovalArray{
//					&outscale.SnapshotAttributesPermissionsToCreateVolumeRemovalArgs{
//						AccountIds: pulumi.StringArray{
//							pulumi.String("012345678910"),
//						},
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
type SnapshotAttributes struct {
	pulumi.CustomResourceState

	// The account ID of the owner of the snapshot.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Information about the users to whom you want to give permissions for the resource.
	PermissionsToCreateVolumeAdditions SnapshotAttributesPermissionsToCreateVolumeAdditionsPtrOutput `pulumi:"permissionsToCreateVolumeAdditions"`
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionsToCreateVolumeRemovals SnapshotAttributesPermissionsToCreateVolumeRemovalArrayOutput `pulumi:"permissionsToCreateVolumeRemovals"`
	RequestId                         pulumi.StringOutput                                           `pulumi:"requestId"`
	// The ID of the snapshot.
	SnapshotId pulumi.StringOutput `pulumi:"snapshotId"`
}

// NewSnapshotAttributes registers a new resource with the given unique name, arguments, and options.
func NewSnapshotAttributes(ctx *pulumi.Context,
	name string, args *SnapshotAttributesArgs, opts ...pulumi.ResourceOption) (*SnapshotAttributes, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SnapshotId == nil {
		return nil, errors.New("invalid value for required argument 'SnapshotId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SnapshotAttributes
	err := ctx.RegisterResource("outscale:index/snapshotAttributes:SnapshotAttributes", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSnapshotAttributes gets an existing SnapshotAttributes resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSnapshotAttributes(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SnapshotAttributesState, opts ...pulumi.ResourceOption) (*SnapshotAttributes, error) {
	var resource SnapshotAttributes
	err := ctx.ReadResource("outscale:index/snapshotAttributes:SnapshotAttributes", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SnapshotAttributes resources.
type snapshotAttributesState struct {
	// The account ID of the owner of the snapshot.
	AccountId *string `pulumi:"accountId"`
	// Information about the users to whom you want to give permissions for the resource.
	PermissionsToCreateVolumeAdditions *SnapshotAttributesPermissionsToCreateVolumeAdditions `pulumi:"permissionsToCreateVolumeAdditions"`
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionsToCreateVolumeRemovals []SnapshotAttributesPermissionsToCreateVolumeRemoval `pulumi:"permissionsToCreateVolumeRemovals"`
	RequestId                         *string                                              `pulumi:"requestId"`
	// The ID of the snapshot.
	SnapshotId *string `pulumi:"snapshotId"`
}

type SnapshotAttributesState struct {
	// The account ID of the owner of the snapshot.
	AccountId pulumi.StringPtrInput
	// Information about the users to whom you want to give permissions for the resource.
	PermissionsToCreateVolumeAdditions SnapshotAttributesPermissionsToCreateVolumeAdditionsPtrInput
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionsToCreateVolumeRemovals SnapshotAttributesPermissionsToCreateVolumeRemovalArrayInput
	RequestId                         pulumi.StringPtrInput
	// The ID of the snapshot.
	SnapshotId pulumi.StringPtrInput
}

func (SnapshotAttributesState) ElementType() reflect.Type {
	return reflect.TypeOf((*snapshotAttributesState)(nil)).Elem()
}

type snapshotAttributesArgs struct {
	// Information about the users to whom you want to give permissions for the resource.
	PermissionsToCreateVolumeAdditions *SnapshotAttributesPermissionsToCreateVolumeAdditions `pulumi:"permissionsToCreateVolumeAdditions"`
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionsToCreateVolumeRemovals []SnapshotAttributesPermissionsToCreateVolumeRemoval `pulumi:"permissionsToCreateVolumeRemovals"`
	// The ID of the snapshot.
	SnapshotId string `pulumi:"snapshotId"`
}

// The set of arguments for constructing a SnapshotAttributes resource.
type SnapshotAttributesArgs struct {
	// Information about the users to whom you want to give permissions for the resource.
	PermissionsToCreateVolumeAdditions SnapshotAttributesPermissionsToCreateVolumeAdditionsPtrInput
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionsToCreateVolumeRemovals SnapshotAttributesPermissionsToCreateVolumeRemovalArrayInput
	// The ID of the snapshot.
	SnapshotId pulumi.StringInput
}

func (SnapshotAttributesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*snapshotAttributesArgs)(nil)).Elem()
}

type SnapshotAttributesInput interface {
	pulumi.Input

	ToSnapshotAttributesOutput() SnapshotAttributesOutput
	ToSnapshotAttributesOutputWithContext(ctx context.Context) SnapshotAttributesOutput
}

func (*SnapshotAttributes) ElementType() reflect.Type {
	return reflect.TypeOf((**SnapshotAttributes)(nil)).Elem()
}

func (i *SnapshotAttributes) ToSnapshotAttributesOutput() SnapshotAttributesOutput {
	return i.ToSnapshotAttributesOutputWithContext(context.Background())
}

func (i *SnapshotAttributes) ToSnapshotAttributesOutputWithContext(ctx context.Context) SnapshotAttributesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotAttributesOutput)
}

// SnapshotAttributesArrayInput is an input type that accepts SnapshotAttributesArray and SnapshotAttributesArrayOutput values.
// You can construct a concrete instance of `SnapshotAttributesArrayInput` via:
//
//	SnapshotAttributesArray{ SnapshotAttributesArgs{...} }
type SnapshotAttributesArrayInput interface {
	pulumi.Input

	ToSnapshotAttributesArrayOutput() SnapshotAttributesArrayOutput
	ToSnapshotAttributesArrayOutputWithContext(context.Context) SnapshotAttributesArrayOutput
}

type SnapshotAttributesArray []SnapshotAttributesInput

func (SnapshotAttributesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SnapshotAttributes)(nil)).Elem()
}

func (i SnapshotAttributesArray) ToSnapshotAttributesArrayOutput() SnapshotAttributesArrayOutput {
	return i.ToSnapshotAttributesArrayOutputWithContext(context.Background())
}

func (i SnapshotAttributesArray) ToSnapshotAttributesArrayOutputWithContext(ctx context.Context) SnapshotAttributesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotAttributesArrayOutput)
}

// SnapshotAttributesMapInput is an input type that accepts SnapshotAttributesMap and SnapshotAttributesMapOutput values.
// You can construct a concrete instance of `SnapshotAttributesMapInput` via:
//
//	SnapshotAttributesMap{ "key": SnapshotAttributesArgs{...} }
type SnapshotAttributesMapInput interface {
	pulumi.Input

	ToSnapshotAttributesMapOutput() SnapshotAttributesMapOutput
	ToSnapshotAttributesMapOutputWithContext(context.Context) SnapshotAttributesMapOutput
}

type SnapshotAttributesMap map[string]SnapshotAttributesInput

func (SnapshotAttributesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SnapshotAttributes)(nil)).Elem()
}

func (i SnapshotAttributesMap) ToSnapshotAttributesMapOutput() SnapshotAttributesMapOutput {
	return i.ToSnapshotAttributesMapOutputWithContext(context.Background())
}

func (i SnapshotAttributesMap) ToSnapshotAttributesMapOutputWithContext(ctx context.Context) SnapshotAttributesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotAttributesMapOutput)
}

type SnapshotAttributesOutput struct{ *pulumi.OutputState }

func (SnapshotAttributesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SnapshotAttributes)(nil)).Elem()
}

func (o SnapshotAttributesOutput) ToSnapshotAttributesOutput() SnapshotAttributesOutput {
	return o
}

func (o SnapshotAttributesOutput) ToSnapshotAttributesOutputWithContext(ctx context.Context) SnapshotAttributesOutput {
	return o
}

// The account ID of the owner of the snapshot.
func (o SnapshotAttributesOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *SnapshotAttributes) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Information about the users to whom you want to give permissions for the resource.
func (o SnapshotAttributesOutput) PermissionsToCreateVolumeAdditions() SnapshotAttributesPermissionsToCreateVolumeAdditionsPtrOutput {
	return o.ApplyT(func(v *SnapshotAttributes) SnapshotAttributesPermissionsToCreateVolumeAdditionsPtrOutput {
		return v.PermissionsToCreateVolumeAdditions
	}).(SnapshotAttributesPermissionsToCreateVolumeAdditionsPtrOutput)
}

// Information about the users from whom you want to remove permissions for the resource.
func (o SnapshotAttributesOutput) PermissionsToCreateVolumeRemovals() SnapshotAttributesPermissionsToCreateVolumeRemovalArrayOutput {
	return o.ApplyT(func(v *SnapshotAttributes) SnapshotAttributesPermissionsToCreateVolumeRemovalArrayOutput {
		return v.PermissionsToCreateVolumeRemovals
	}).(SnapshotAttributesPermissionsToCreateVolumeRemovalArrayOutput)
}

func (o SnapshotAttributesOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *SnapshotAttributes) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// The ID of the snapshot.
func (o SnapshotAttributesOutput) SnapshotId() pulumi.StringOutput {
	return o.ApplyT(func(v *SnapshotAttributes) pulumi.StringOutput { return v.SnapshotId }).(pulumi.StringOutput)
}

type SnapshotAttributesArrayOutput struct{ *pulumi.OutputState }

func (SnapshotAttributesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SnapshotAttributes)(nil)).Elem()
}

func (o SnapshotAttributesArrayOutput) ToSnapshotAttributesArrayOutput() SnapshotAttributesArrayOutput {
	return o
}

func (o SnapshotAttributesArrayOutput) ToSnapshotAttributesArrayOutputWithContext(ctx context.Context) SnapshotAttributesArrayOutput {
	return o
}

func (o SnapshotAttributesArrayOutput) Index(i pulumi.IntInput) SnapshotAttributesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SnapshotAttributes {
		return vs[0].([]*SnapshotAttributes)[vs[1].(int)]
	}).(SnapshotAttributesOutput)
}

type SnapshotAttributesMapOutput struct{ *pulumi.OutputState }

func (SnapshotAttributesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SnapshotAttributes)(nil)).Elem()
}

func (o SnapshotAttributesMapOutput) ToSnapshotAttributesMapOutput() SnapshotAttributesMapOutput {
	return o
}

func (o SnapshotAttributesMapOutput) ToSnapshotAttributesMapOutputWithContext(ctx context.Context) SnapshotAttributesMapOutput {
	return o
}

func (o SnapshotAttributesMapOutput) MapIndex(k pulumi.StringInput) SnapshotAttributesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SnapshotAttributes {
		return vs[0].(map[string]*SnapshotAttributes)[vs[1].(string)]
	}).(SnapshotAttributesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotAttributesInput)(nil)).Elem(), &SnapshotAttributes{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotAttributesArrayInput)(nil)).Elem(), SnapshotAttributesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotAttributesMapInput)(nil)).Elem(), SnapshotAttributesMap{})
	pulumi.RegisterOutputType(SnapshotAttributesOutput{})
	pulumi.RegisterOutputType(SnapshotAttributesArrayOutput{})
	pulumi.RegisterOutputType(SnapshotAttributesMapOutput{})
}
