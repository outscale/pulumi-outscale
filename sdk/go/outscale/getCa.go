// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Certificate Authority (CA).
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-API-Access-Rules.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-ca).
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
//			_, err := outscale.LookupCa(ctx, &outscale.LookupCaArgs{
//				Filters: []outscale.GetCaFilter{
//					{
//						Name: "ca_ids",
//						Values: []string{
//							"ca-12345678",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupCa(ctx *pulumi.Context, args *LookupCaArgs, opts ...pulumi.InvokeOption) (*LookupCaResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCaResult
	err := ctx.Invoke("outscale:index/getCa:getCa", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCa.
type LookupCaArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetCaFilter `pulumi:"filters"`
}

// A collection of values returned by getCa.
type LookupCaResult struct {
	// The fingerprint of the CA.
	CaFingerprint string `pulumi:"caFingerprint"`
	// The ID of the CA.
	CaId  string `pulumi:"caId"`
	CaPem string `pulumi:"caPem"`
	// The description of the CA.
	Description string        `pulumi:"description"`
	Filters     []GetCaFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	RequestId string `pulumi:"requestId"`
}

func LookupCaOutput(ctx *pulumi.Context, args LookupCaOutputArgs, opts ...pulumi.InvokeOption) LookupCaResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCaResult, error) {
			args := v.(LookupCaArgs)
			r, err := LookupCa(ctx, &args, opts...)
			var s LookupCaResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupCaResultOutput)
}

// A collection of arguments for invoking getCa.
type LookupCaOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetCaFilterArrayInput `pulumi:"filters"`
}

func (LookupCaOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCaArgs)(nil)).Elem()
}

// A collection of values returned by getCa.
type LookupCaResultOutput struct{ *pulumi.OutputState }

func (LookupCaResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCaResult)(nil)).Elem()
}

func (o LookupCaResultOutput) ToLookupCaResultOutput() LookupCaResultOutput {
	return o
}

func (o LookupCaResultOutput) ToLookupCaResultOutputWithContext(ctx context.Context) LookupCaResultOutput {
	return o
}

// The fingerprint of the CA.
func (o LookupCaResultOutput) CaFingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCaResult) string { return v.CaFingerprint }).(pulumi.StringOutput)
}

// The ID of the CA.
func (o LookupCaResultOutput) CaId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCaResult) string { return v.CaId }).(pulumi.StringOutput)
}

func (o LookupCaResultOutput) CaPem() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCaResult) string { return v.CaPem }).(pulumi.StringOutput)
}

// The description of the CA.
func (o LookupCaResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCaResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupCaResultOutput) Filters() GetCaFilterArrayOutput {
	return o.ApplyT(func(v LookupCaResult) []GetCaFilter { return v.Filters }).(GetCaFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCaResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCaResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupCaResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCaResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCaResultOutput{})
}
