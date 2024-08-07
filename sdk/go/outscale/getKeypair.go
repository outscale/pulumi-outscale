// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a keypair.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Keypairs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-keypair).
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
//			_, err := outscale.LookupKeypair(ctx, &outscale.LookupKeypairArgs{
//				Filters: []outscale.GetKeypairFilter{
//					{
//						Name: "keypair_names",
//						Values: []string{
//							"terraform-keypair-01",
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
func LookupKeypair(ctx *pulumi.Context, args *LookupKeypairArgs, opts ...pulumi.InvokeOption) (*LookupKeypairResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupKeypairResult
	err := ctx.Invoke("outscale:index/getKeypair:getKeypair", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKeypair.
type LookupKeypairArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetKeypairFilter `pulumi:"filters"`
	// The name of the keypair.
	KeypairName *string `pulumi:"keypairName"`
}

// A collection of values returned by getKeypair.
type LookupKeypairResult struct {
	Filters []GetKeypairFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The MD5 public key fingerprint as specified in section 4 of RFC 4716.
	KeypairFingerprint string `pulumi:"keypairFingerprint"`
	// The name of the keypair.
	KeypairName string `pulumi:"keypairName"`
	RequestId   string `pulumi:"requestId"`
}

func LookupKeypairOutput(ctx *pulumi.Context, args LookupKeypairOutputArgs, opts ...pulumi.InvokeOption) LookupKeypairResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKeypairResult, error) {
			args := v.(LookupKeypairArgs)
			r, err := LookupKeypair(ctx, &args, opts...)
			var s LookupKeypairResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupKeypairResultOutput)
}

// A collection of arguments for invoking getKeypair.
type LookupKeypairOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetKeypairFilterArrayInput `pulumi:"filters"`
	// The name of the keypair.
	KeypairName pulumi.StringPtrInput `pulumi:"keypairName"`
}

func (LookupKeypairOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeypairArgs)(nil)).Elem()
}

// A collection of values returned by getKeypair.
type LookupKeypairResultOutput struct{ *pulumi.OutputState }

func (LookupKeypairResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeypairResult)(nil)).Elem()
}

func (o LookupKeypairResultOutput) ToLookupKeypairResultOutput() LookupKeypairResultOutput {
	return o
}

func (o LookupKeypairResultOutput) ToLookupKeypairResultOutputWithContext(ctx context.Context) LookupKeypairResultOutput {
	return o
}

func (o LookupKeypairResultOutput) Filters() GetKeypairFilterArrayOutput {
	return o.ApplyT(func(v LookupKeypairResult) []GetKeypairFilter { return v.Filters }).(GetKeypairFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupKeypairResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeypairResult) string { return v.Id }).(pulumi.StringOutput)
}

// The MD5 public key fingerprint as specified in section 4 of RFC 4716.
func (o LookupKeypairResultOutput) KeypairFingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeypairResult) string { return v.KeypairFingerprint }).(pulumi.StringOutput)
}

// The name of the keypair.
func (o LookupKeypairResultOutput) KeypairName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeypairResult) string { return v.KeypairName }).(pulumi.StringOutput)
}

func (o LookupKeypairResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeypairResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKeypairResultOutput{})
}
