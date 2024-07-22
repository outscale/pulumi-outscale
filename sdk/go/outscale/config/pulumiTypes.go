// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type Endpoints struct {
	Api *string `pulumi:"api"`
}

// EndpointsInput is an input type that accepts EndpointsArgs and EndpointsOutput values.
// You can construct a concrete instance of `EndpointsInput` via:
//
//	EndpointsArgs{...}
type EndpointsInput interface {
	pulumi.Input

	ToEndpointsOutput() EndpointsOutput
	ToEndpointsOutputWithContext(context.Context) EndpointsOutput
}

type EndpointsArgs struct {
	Api pulumi.StringPtrInput `pulumi:"api"`
}

func (EndpointsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*Endpoints)(nil)).Elem()
}

func (i EndpointsArgs) ToEndpointsOutput() EndpointsOutput {
	return i.ToEndpointsOutputWithContext(context.Background())
}

func (i EndpointsArgs) ToEndpointsOutputWithContext(ctx context.Context) EndpointsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsOutput)
}

// EndpointsArrayInput is an input type that accepts EndpointsArray and EndpointsArrayOutput values.
// You can construct a concrete instance of `EndpointsArrayInput` via:
//
//	EndpointsArray{ EndpointsArgs{...} }
type EndpointsArrayInput interface {
	pulumi.Input

	ToEndpointsArrayOutput() EndpointsArrayOutput
	ToEndpointsArrayOutputWithContext(context.Context) EndpointsArrayOutput
}

type EndpointsArray []EndpointsInput

func (EndpointsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Endpoints)(nil)).Elem()
}

func (i EndpointsArray) ToEndpointsArrayOutput() EndpointsArrayOutput {
	return i.ToEndpointsArrayOutputWithContext(context.Background())
}

func (i EndpointsArray) ToEndpointsArrayOutputWithContext(ctx context.Context) EndpointsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointsArrayOutput)
}

type EndpointsOutput struct{ *pulumi.OutputState }

func (EndpointsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Endpoints)(nil)).Elem()
}

func (o EndpointsOutput) ToEndpointsOutput() EndpointsOutput {
	return o
}

func (o EndpointsOutput) ToEndpointsOutputWithContext(ctx context.Context) EndpointsOutput {
	return o
}

func (o EndpointsOutput) Api() pulumi.StringPtrOutput {
	return o.ApplyT(func(v Endpoints) *string { return v.Api }).(pulumi.StringPtrOutput)
}

type EndpointsArrayOutput struct{ *pulumi.OutputState }

func (EndpointsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Endpoints)(nil)).Elem()
}

func (o EndpointsArrayOutput) ToEndpointsArrayOutput() EndpointsArrayOutput {
	return o
}

func (o EndpointsArrayOutput) ToEndpointsArrayOutputWithContext(ctx context.Context) EndpointsArrayOutput {
	return o
}

func (o EndpointsArrayOutput) Index(i pulumi.IntInput) EndpointsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Endpoints {
		return vs[0].([]Endpoints)[vs[1].(int)]
	}).(EndpointsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointsInput)(nil)).Elem(), EndpointsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointsArrayInput)(nil)).Elem(), EndpointsArray{})
	pulumi.RegisterOutputType(EndpointsOutput{})
	pulumi.RegisterOutputType(EndpointsArrayOutput{})
}
