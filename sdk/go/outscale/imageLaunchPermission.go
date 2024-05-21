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

// Manages an image launch permission.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updateimage).
//
// ## Example Usage
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
//			_, err := outscale.NewImageLaunchPermission(ctx, "image01", &outscale.ImageLaunchPermissionArgs{
//				ImageId: pulumi.String("ami-12345678"),
//				PermissionAdditions: &outscale.ImageLaunchPermissionPermissionAdditionsArgs{
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
//			_, err := outscale.NewImageLaunchPermission(ctx, "image02", &outscale.ImageLaunchPermissionArgs{
//				ImageId: pulumi.String("ami-12345678"),
//				PermissionRemovals: &outscale.ImageLaunchPermissionPermissionRemovalsArgs{
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
type ImageLaunchPermission struct {
	pulumi.CustomResourceState

	// The description of the OMI.
	Description pulumi.StringOutput `pulumi:"description"`
	// The ID of the OMI you want to modify.
	ImageId pulumi.StringOutput `pulumi:"imageId"`
	// Information about the users to whom you want to give permissions for the resource.
	PermissionAdditions ImageLaunchPermissionPermissionAdditionsPtrOutput `pulumi:"permissionAdditions"`
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionRemovals ImageLaunchPermissionPermissionRemovalsPtrOutput `pulumi:"permissionRemovals"`
	// Permissions for the resource.
	PermissionsToLaunches ImageLaunchPermissionPermissionsToLaunchArrayOutput `pulumi:"permissionsToLaunches"`
	RequestId             pulumi.StringOutput                                 `pulumi:"requestId"`
}

// NewImageLaunchPermission registers a new resource with the given unique name, arguments, and options.
func NewImageLaunchPermission(ctx *pulumi.Context,
	name string, args *ImageLaunchPermissionArgs, opts ...pulumi.ResourceOption) (*ImageLaunchPermission, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ImageId == nil {
		return nil, errors.New("invalid value for required argument 'ImageId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ImageLaunchPermission
	err := ctx.RegisterResource("outscale:index/imageLaunchPermission:ImageLaunchPermission", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImageLaunchPermission gets an existing ImageLaunchPermission resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImageLaunchPermission(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImageLaunchPermissionState, opts ...pulumi.ResourceOption) (*ImageLaunchPermission, error) {
	var resource ImageLaunchPermission
	err := ctx.ReadResource("outscale:index/imageLaunchPermission:ImageLaunchPermission", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ImageLaunchPermission resources.
type imageLaunchPermissionState struct {
	// The description of the OMI.
	Description *string `pulumi:"description"`
	// The ID of the OMI you want to modify.
	ImageId *string `pulumi:"imageId"`
	// Information about the users to whom you want to give permissions for the resource.
	PermissionAdditions *ImageLaunchPermissionPermissionAdditions `pulumi:"permissionAdditions"`
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionRemovals *ImageLaunchPermissionPermissionRemovals `pulumi:"permissionRemovals"`
	// Permissions for the resource.
	PermissionsToLaunches []ImageLaunchPermissionPermissionsToLaunch `pulumi:"permissionsToLaunches"`
	RequestId             *string                                    `pulumi:"requestId"`
}

type ImageLaunchPermissionState struct {
	// The description of the OMI.
	Description pulumi.StringPtrInput
	// The ID of the OMI you want to modify.
	ImageId pulumi.StringPtrInput
	// Information about the users to whom you want to give permissions for the resource.
	PermissionAdditions ImageLaunchPermissionPermissionAdditionsPtrInput
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionRemovals ImageLaunchPermissionPermissionRemovalsPtrInput
	// Permissions for the resource.
	PermissionsToLaunches ImageLaunchPermissionPermissionsToLaunchArrayInput
	RequestId             pulumi.StringPtrInput
}

func (ImageLaunchPermissionState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageLaunchPermissionState)(nil)).Elem()
}

type imageLaunchPermissionArgs struct {
	// The ID of the OMI you want to modify.
	ImageId string `pulumi:"imageId"`
	// Information about the users to whom you want to give permissions for the resource.
	PermissionAdditions *ImageLaunchPermissionPermissionAdditions `pulumi:"permissionAdditions"`
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionRemovals *ImageLaunchPermissionPermissionRemovals `pulumi:"permissionRemovals"`
}

// The set of arguments for constructing a ImageLaunchPermission resource.
type ImageLaunchPermissionArgs struct {
	// The ID of the OMI you want to modify.
	ImageId pulumi.StringInput
	// Information about the users to whom you want to give permissions for the resource.
	PermissionAdditions ImageLaunchPermissionPermissionAdditionsPtrInput
	// Information about the users from whom you want to remove permissions for the resource.
	PermissionRemovals ImageLaunchPermissionPermissionRemovalsPtrInput
}

func (ImageLaunchPermissionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imageLaunchPermissionArgs)(nil)).Elem()
}

type ImageLaunchPermissionInput interface {
	pulumi.Input

	ToImageLaunchPermissionOutput() ImageLaunchPermissionOutput
	ToImageLaunchPermissionOutputWithContext(ctx context.Context) ImageLaunchPermissionOutput
}

func (*ImageLaunchPermission) ElementType() reflect.Type {
	return reflect.TypeOf((**ImageLaunchPermission)(nil)).Elem()
}

func (i *ImageLaunchPermission) ToImageLaunchPermissionOutput() ImageLaunchPermissionOutput {
	return i.ToImageLaunchPermissionOutputWithContext(context.Background())
}

func (i *ImageLaunchPermission) ToImageLaunchPermissionOutputWithContext(ctx context.Context) ImageLaunchPermissionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageLaunchPermissionOutput)
}

// ImageLaunchPermissionArrayInput is an input type that accepts ImageLaunchPermissionArray and ImageLaunchPermissionArrayOutput values.
// You can construct a concrete instance of `ImageLaunchPermissionArrayInput` via:
//
//	ImageLaunchPermissionArray{ ImageLaunchPermissionArgs{...} }
type ImageLaunchPermissionArrayInput interface {
	pulumi.Input

	ToImageLaunchPermissionArrayOutput() ImageLaunchPermissionArrayOutput
	ToImageLaunchPermissionArrayOutputWithContext(context.Context) ImageLaunchPermissionArrayOutput
}

type ImageLaunchPermissionArray []ImageLaunchPermissionInput

func (ImageLaunchPermissionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImageLaunchPermission)(nil)).Elem()
}

func (i ImageLaunchPermissionArray) ToImageLaunchPermissionArrayOutput() ImageLaunchPermissionArrayOutput {
	return i.ToImageLaunchPermissionArrayOutputWithContext(context.Background())
}

func (i ImageLaunchPermissionArray) ToImageLaunchPermissionArrayOutputWithContext(ctx context.Context) ImageLaunchPermissionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageLaunchPermissionArrayOutput)
}

// ImageLaunchPermissionMapInput is an input type that accepts ImageLaunchPermissionMap and ImageLaunchPermissionMapOutput values.
// You can construct a concrete instance of `ImageLaunchPermissionMapInput` via:
//
//	ImageLaunchPermissionMap{ "key": ImageLaunchPermissionArgs{...} }
type ImageLaunchPermissionMapInput interface {
	pulumi.Input

	ToImageLaunchPermissionMapOutput() ImageLaunchPermissionMapOutput
	ToImageLaunchPermissionMapOutputWithContext(context.Context) ImageLaunchPermissionMapOutput
}

type ImageLaunchPermissionMap map[string]ImageLaunchPermissionInput

func (ImageLaunchPermissionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImageLaunchPermission)(nil)).Elem()
}

func (i ImageLaunchPermissionMap) ToImageLaunchPermissionMapOutput() ImageLaunchPermissionMapOutput {
	return i.ToImageLaunchPermissionMapOutputWithContext(context.Background())
}

func (i ImageLaunchPermissionMap) ToImageLaunchPermissionMapOutputWithContext(ctx context.Context) ImageLaunchPermissionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageLaunchPermissionMapOutput)
}

type ImageLaunchPermissionOutput struct{ *pulumi.OutputState }

func (ImageLaunchPermissionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ImageLaunchPermission)(nil)).Elem()
}

func (o ImageLaunchPermissionOutput) ToImageLaunchPermissionOutput() ImageLaunchPermissionOutput {
	return o
}

func (o ImageLaunchPermissionOutput) ToImageLaunchPermissionOutputWithContext(ctx context.Context) ImageLaunchPermissionOutput {
	return o
}

// The description of the OMI.
func (o ImageLaunchPermissionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageLaunchPermission) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The ID of the OMI you want to modify.
func (o ImageLaunchPermissionOutput) ImageId() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageLaunchPermission) pulumi.StringOutput { return v.ImageId }).(pulumi.StringOutput)
}

// Information about the users to whom you want to give permissions for the resource.
func (o ImageLaunchPermissionOutput) PermissionAdditions() ImageLaunchPermissionPermissionAdditionsPtrOutput {
	return o.ApplyT(func(v *ImageLaunchPermission) ImageLaunchPermissionPermissionAdditionsPtrOutput {
		return v.PermissionAdditions
	}).(ImageLaunchPermissionPermissionAdditionsPtrOutput)
}

// Information about the users from whom you want to remove permissions for the resource.
func (o ImageLaunchPermissionOutput) PermissionRemovals() ImageLaunchPermissionPermissionRemovalsPtrOutput {
	return o.ApplyT(func(v *ImageLaunchPermission) ImageLaunchPermissionPermissionRemovalsPtrOutput {
		return v.PermissionRemovals
	}).(ImageLaunchPermissionPermissionRemovalsPtrOutput)
}

// Permissions for the resource.
func (o ImageLaunchPermissionOutput) PermissionsToLaunches() ImageLaunchPermissionPermissionsToLaunchArrayOutput {
	return o.ApplyT(func(v *ImageLaunchPermission) ImageLaunchPermissionPermissionsToLaunchArrayOutput {
		return v.PermissionsToLaunches
	}).(ImageLaunchPermissionPermissionsToLaunchArrayOutput)
}

func (o ImageLaunchPermissionOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageLaunchPermission) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

type ImageLaunchPermissionArrayOutput struct{ *pulumi.OutputState }

func (ImageLaunchPermissionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImageLaunchPermission)(nil)).Elem()
}

func (o ImageLaunchPermissionArrayOutput) ToImageLaunchPermissionArrayOutput() ImageLaunchPermissionArrayOutput {
	return o
}

func (o ImageLaunchPermissionArrayOutput) ToImageLaunchPermissionArrayOutputWithContext(ctx context.Context) ImageLaunchPermissionArrayOutput {
	return o
}

func (o ImageLaunchPermissionArrayOutput) Index(i pulumi.IntInput) ImageLaunchPermissionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ImageLaunchPermission {
		return vs[0].([]*ImageLaunchPermission)[vs[1].(int)]
	}).(ImageLaunchPermissionOutput)
}

type ImageLaunchPermissionMapOutput struct{ *pulumi.OutputState }

func (ImageLaunchPermissionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImageLaunchPermission)(nil)).Elem()
}

func (o ImageLaunchPermissionMapOutput) ToImageLaunchPermissionMapOutput() ImageLaunchPermissionMapOutput {
	return o
}

func (o ImageLaunchPermissionMapOutput) ToImageLaunchPermissionMapOutputWithContext(ctx context.Context) ImageLaunchPermissionMapOutput {
	return o
}

func (o ImageLaunchPermissionMapOutput) MapIndex(k pulumi.StringInput) ImageLaunchPermissionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ImageLaunchPermission {
		return vs[0].(map[string]*ImageLaunchPermission)[vs[1].(string)]
	}).(ImageLaunchPermissionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ImageLaunchPermissionInput)(nil)).Elem(), &ImageLaunchPermission{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageLaunchPermissionArrayInput)(nil)).Elem(), ImageLaunchPermissionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageLaunchPermissionMapInput)(nil)).Elem(), ImageLaunchPermissionMap{})
	pulumi.RegisterOutputType(ImageLaunchPermissionOutput{})
	pulumi.RegisterOutputType(ImageLaunchPermissionArrayOutput{})
	pulumi.RegisterOutputType(ImageLaunchPermissionMapOutput{})
}