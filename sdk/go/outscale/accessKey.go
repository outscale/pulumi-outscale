// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := outscale.NewAccessKey(ctx, "accessKey01", &outscale.AccessKeyArgs{
//				ExpirationDate: pulumi.String("2023-01-01"),
//				State:          pulumi.String("ACTIVE"),
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
// An access key can be imported using its ID. For exampleconsole
//
// ```sh
//
//	$ pulumi import outscale:index/accessKey:AccessKey ImportedAccessKey ABCDEFGHIJ0123456789
//
// ```
type AccessKey struct {
	pulumi.CustomResourceState

	// The ID of the access key.
	AccessKeyId pulumi.StringOutput `pulumi:"accessKeyId"`
	// The date and time (UTC) of creation of the access key.
	CreationDate pulumi.StringOutput `pulumi:"creationDate"`
	// The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
	ExpirationDate pulumi.StringPtrOutput `pulumi:"expirationDate"`
	// The date and time (UTC) of the last modification of the access key.
	LastModificationDate pulumi.StringOutput `pulumi:"lastModificationDate"`
	RequestId            pulumi.StringOutput `pulumi:"requestId"`
	// The access key that enables you to send requests.
	SecretKey pulumi.StringOutput `pulumi:"secretKey"`
	// The state for the access key (`ACTIVE` | `INACTIVE`).
	State pulumi.StringPtrOutput `pulumi:"state"`
}

// NewAccessKey registers a new resource with the given unique name, arguments, and options.
func NewAccessKey(ctx *pulumi.Context,
	name string, args *AccessKeyArgs, opts ...pulumi.ResourceOption) (*AccessKey, error) {
	if args == nil {
		args = &AccessKeyArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessKey
	err := ctx.RegisterResource("outscale:index/accessKey:AccessKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessKey gets an existing AccessKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessKeyState, opts ...pulumi.ResourceOption) (*AccessKey, error) {
	var resource AccessKey
	err := ctx.ReadResource("outscale:index/accessKey:AccessKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessKey resources.
type accessKeyState struct {
	// The ID of the access key.
	AccessKeyId *string `pulumi:"accessKeyId"`
	// The date and time (UTC) of creation of the access key.
	CreationDate *string `pulumi:"creationDate"`
	// The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
	ExpirationDate *string `pulumi:"expirationDate"`
	// The date and time (UTC) of the last modification of the access key.
	LastModificationDate *string `pulumi:"lastModificationDate"`
	RequestId            *string `pulumi:"requestId"`
	// The access key that enables you to send requests.
	SecretKey *string `pulumi:"secretKey"`
	// The state for the access key (`ACTIVE` | `INACTIVE`).
	State *string `pulumi:"state"`
}

type AccessKeyState struct {
	// The ID of the access key.
	AccessKeyId pulumi.StringPtrInput
	// The date and time (UTC) of creation of the access key.
	CreationDate pulumi.StringPtrInput
	// The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
	ExpirationDate pulumi.StringPtrInput
	// The date and time (UTC) of the last modification of the access key.
	LastModificationDate pulumi.StringPtrInput
	RequestId            pulumi.StringPtrInput
	// The access key that enables you to send requests.
	SecretKey pulumi.StringPtrInput
	// The state for the access key (`ACTIVE` | `INACTIVE`).
	State pulumi.StringPtrInput
}

func (AccessKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessKeyState)(nil)).Elem()
}

type accessKeyArgs struct {
	// The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
	ExpirationDate *string `pulumi:"expirationDate"`
	// The state for the access key (`ACTIVE` | `INACTIVE`).
	State *string `pulumi:"state"`
}

// The set of arguments for constructing a AccessKey resource.
type AccessKeyArgs struct {
	// The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
	ExpirationDate pulumi.StringPtrInput
	// The state for the access key (`ACTIVE` | `INACTIVE`).
	State pulumi.StringPtrInput
}

func (AccessKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessKeyArgs)(nil)).Elem()
}

type AccessKeyInput interface {
	pulumi.Input

	ToAccessKeyOutput() AccessKeyOutput
	ToAccessKeyOutputWithContext(ctx context.Context) AccessKeyOutput
}

func (*AccessKey) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessKey)(nil)).Elem()
}

func (i *AccessKey) ToAccessKeyOutput() AccessKeyOutput {
	return i.ToAccessKeyOutputWithContext(context.Background())
}

func (i *AccessKey) ToAccessKeyOutputWithContext(ctx context.Context) AccessKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessKeyOutput)
}

// AccessKeyArrayInput is an input type that accepts AccessKeyArray and AccessKeyArrayOutput values.
// You can construct a concrete instance of `AccessKeyArrayInput` via:
//
//	AccessKeyArray{ AccessKeyArgs{...} }
type AccessKeyArrayInput interface {
	pulumi.Input

	ToAccessKeyArrayOutput() AccessKeyArrayOutput
	ToAccessKeyArrayOutputWithContext(context.Context) AccessKeyArrayOutput
}

type AccessKeyArray []AccessKeyInput

func (AccessKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessKey)(nil)).Elem()
}

func (i AccessKeyArray) ToAccessKeyArrayOutput() AccessKeyArrayOutput {
	return i.ToAccessKeyArrayOutputWithContext(context.Background())
}

func (i AccessKeyArray) ToAccessKeyArrayOutputWithContext(ctx context.Context) AccessKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessKeyArrayOutput)
}

// AccessKeyMapInput is an input type that accepts AccessKeyMap and AccessKeyMapOutput values.
// You can construct a concrete instance of `AccessKeyMapInput` via:
//
//	AccessKeyMap{ "key": AccessKeyArgs{...} }
type AccessKeyMapInput interface {
	pulumi.Input

	ToAccessKeyMapOutput() AccessKeyMapOutput
	ToAccessKeyMapOutputWithContext(context.Context) AccessKeyMapOutput
}

type AccessKeyMap map[string]AccessKeyInput

func (AccessKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessKey)(nil)).Elem()
}

func (i AccessKeyMap) ToAccessKeyMapOutput() AccessKeyMapOutput {
	return i.ToAccessKeyMapOutputWithContext(context.Background())
}

func (i AccessKeyMap) ToAccessKeyMapOutputWithContext(ctx context.Context) AccessKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessKeyMapOutput)
}

type AccessKeyOutput struct{ *pulumi.OutputState }

func (AccessKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessKey)(nil)).Elem()
}

func (o AccessKeyOutput) ToAccessKeyOutput() AccessKeyOutput {
	return o
}

func (o AccessKeyOutput) ToAccessKeyOutputWithContext(ctx context.Context) AccessKeyOutput {
	return o
}

// The ID of the access key.
func (o AccessKeyOutput) AccessKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessKey) pulumi.StringOutput { return v.AccessKeyId }).(pulumi.StringOutput)
}

// The date and time (UTC) of creation of the access key.
func (o AccessKeyOutput) CreationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessKey) pulumi.StringOutput { return v.CreationDate }).(pulumi.StringOutput)
}

// The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
func (o AccessKeyOutput) ExpirationDate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessKey) pulumi.StringPtrOutput { return v.ExpirationDate }).(pulumi.StringPtrOutput)
}

// The date and time (UTC) of the last modification of the access key.
func (o AccessKeyOutput) LastModificationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessKey) pulumi.StringOutput { return v.LastModificationDate }).(pulumi.StringOutput)
}

func (o AccessKeyOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessKey) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

// The access key that enables you to send requests.
func (o AccessKeyOutput) SecretKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessKey) pulumi.StringOutput { return v.SecretKey }).(pulumi.StringOutput)
}

// The state for the access key (`ACTIVE` | `INACTIVE`).
func (o AccessKeyOutput) State() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessKey) pulumi.StringPtrOutput { return v.State }).(pulumi.StringPtrOutput)
}

type AccessKeyArrayOutput struct{ *pulumi.OutputState }

func (AccessKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessKey)(nil)).Elem()
}

func (o AccessKeyArrayOutput) ToAccessKeyArrayOutput() AccessKeyArrayOutput {
	return o
}

func (o AccessKeyArrayOutput) ToAccessKeyArrayOutputWithContext(ctx context.Context) AccessKeyArrayOutput {
	return o
}

func (o AccessKeyArrayOutput) Index(i pulumi.IntInput) AccessKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessKey {
		return vs[0].([]*AccessKey)[vs[1].(int)]
	}).(AccessKeyOutput)
}

type AccessKeyMapOutput struct{ *pulumi.OutputState }

func (AccessKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessKey)(nil)).Elem()
}

func (o AccessKeyMapOutput) ToAccessKeyMapOutput() AccessKeyMapOutput {
	return o
}

func (o AccessKeyMapOutput) ToAccessKeyMapOutputWithContext(ctx context.Context) AccessKeyMapOutput {
	return o
}

func (o AccessKeyMapOutput) MapIndex(k pulumi.StringInput) AccessKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessKey {
		return vs[0].(map[string]*AccessKey)[vs[1].(string)]
	}).(AccessKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessKeyInput)(nil)).Elem(), &AccessKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessKeyArrayInput)(nil)).Elem(), AccessKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessKeyMapInput)(nil)).Elem(), AccessKeyMap{})
	pulumi.RegisterOutputType(AccessKeyOutput{})
	pulumi.RegisterOutputType(AccessKeyArrayOutput{})
	pulumi.RegisterOutputType(AccessKeyMapOutput{})
}
