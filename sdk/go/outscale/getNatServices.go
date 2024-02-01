// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides information about NAT services.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-NAT-Gateways.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-natservice).
func GetNatServices(ctx *pulumi.Context, args *GetNatServicesArgs, opts ...pulumi.InvokeOption) (*GetNatServicesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNatServicesResult
	err := ctx.Invoke("outscale:index/getNatServices:getNatServices", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNatServices.
type GetNatServicesArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetNatServicesFilter `pulumi:"filters"`
	// The IDs of the NAT services.
	NatServiceIds []string `pulumi:"natServiceIds"`
}

// A collection of values returned by getNatServices.
type GetNatServicesResult struct {
	Filters []GetNatServicesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id            string   `pulumi:"id"`
	NatServiceIds []string `pulumi:"natServiceIds"`
	// Information about one or more NAT services.
	NatServices []GetNatServicesNatService `pulumi:"natServices"`
	RequestId   string                     `pulumi:"requestId"`
}

func GetNatServicesOutput(ctx *pulumi.Context, args GetNatServicesOutputArgs, opts ...pulumi.InvokeOption) GetNatServicesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNatServicesResult, error) {
			args := v.(GetNatServicesArgs)
			r, err := GetNatServices(ctx, &args, opts...)
			var s GetNatServicesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNatServicesResultOutput)
}

// A collection of arguments for invoking getNatServices.
type GetNatServicesOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetNatServicesFilterArrayInput `pulumi:"filters"`
	// The IDs of the NAT services.
	NatServiceIds pulumi.StringArrayInput `pulumi:"natServiceIds"`
}

func (GetNatServicesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNatServicesArgs)(nil)).Elem()
}

// A collection of values returned by getNatServices.
type GetNatServicesResultOutput struct{ *pulumi.OutputState }

func (GetNatServicesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNatServicesResult)(nil)).Elem()
}

func (o GetNatServicesResultOutput) ToGetNatServicesResultOutput() GetNatServicesResultOutput {
	return o
}

func (o GetNatServicesResultOutput) ToGetNatServicesResultOutputWithContext(ctx context.Context) GetNatServicesResultOutput {
	return o
}

func (o GetNatServicesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetNatServicesResult] {
	return pulumix.Output[GetNatServicesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetNatServicesResultOutput) Filters() GetNatServicesFilterArrayOutput {
	return o.ApplyT(func(v GetNatServicesResult) []GetNatServicesFilter { return v.Filters }).(GetNatServicesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNatServicesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNatServicesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNatServicesResultOutput) NatServiceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNatServicesResult) []string { return v.NatServiceIds }).(pulumi.StringArrayOutput)
}

// Information about one or more NAT services.
func (o GetNatServicesResultOutput) NatServices() GetNatServicesNatServiceArrayOutput {
	return o.ApplyT(func(v GetNatServicesResult) []GetNatServicesNatService { return v.NatServices }).(GetNatServicesNatServiceArrayOutput)
}

func (o GetNatServicesResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNatServicesResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNatServicesResultOutput{})
}
