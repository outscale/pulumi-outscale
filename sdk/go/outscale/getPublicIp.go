// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a public IP.
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
//			_, err := outscale.LookupPublicIp(ctx, &outscale.LookupPublicIpArgs{
//				Filters: []outscale.GetPublicIpFilter{
//					{
//						Name: "public_ips",
//						Values: []string{
//							"111.11.111.1",
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
func LookupPublicIp(ctx *pulumi.Context, args *LookupPublicIpArgs, opts ...pulumi.InvokeOption) (*LookupPublicIpResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPublicIpResult
	err := ctx.Invoke("outscale:index/getPublicIp:getPublicIp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPublicIp.
type LookupPublicIpArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetPublicIpFilter `pulumi:"filters"`
	// The public IP.
	PublicIp *string `pulumi:"publicIp"`
	// The allocation ID of the public IP.
	PublicIpId *string `pulumi:"publicIpId"`
}

// A collection of values returned by getPublicIp.
type LookupPublicIpResult struct {
	Filters []GetPublicIpFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
	LinkPublicIpId string `pulumi:"linkPublicIpId"`
	// The account ID of the owner of the NIC.
	NicAccountId string `pulumi:"nicAccountId"`
	// The ID of the NIC the public IP is associated with (if any).
	NicId string `pulumi:"nicId"`
	// The private IP associated with the public IP.
	PrivateIp string `pulumi:"privateIp"`
	// The public IP.
	PublicIp string `pulumi:"publicIp"`
	// The allocation ID of the public IP.
	PublicIpId string `pulumi:"publicIpId"`
	RequestId  string `pulumi:"requestId"`
	// One or more tags associated with the public IP.
	Tags []GetPublicIpTag `pulumi:"tags"`
	// The ID of the VM the public IP is associated with (if any).
	VmId string `pulumi:"vmId"`
}

func LookupPublicIpOutput(ctx *pulumi.Context, args LookupPublicIpOutputArgs, opts ...pulumi.InvokeOption) LookupPublicIpResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPublicIpResult, error) {
			args := v.(LookupPublicIpArgs)
			r, err := LookupPublicIp(ctx, &args, opts...)
			var s LookupPublicIpResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPublicIpResultOutput)
}

// A collection of arguments for invoking getPublicIp.
type LookupPublicIpOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetPublicIpFilterArrayInput `pulumi:"filters"`
	// The public IP.
	PublicIp pulumi.StringPtrInput `pulumi:"publicIp"`
	// The allocation ID of the public IP.
	PublicIpId pulumi.StringPtrInput `pulumi:"publicIpId"`
}

func (LookupPublicIpOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPublicIpArgs)(nil)).Elem()
}

// A collection of values returned by getPublicIp.
type LookupPublicIpResultOutput struct{ *pulumi.OutputState }

func (LookupPublicIpResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPublicIpResult)(nil)).Elem()
}

func (o LookupPublicIpResultOutput) ToLookupPublicIpResultOutput() LookupPublicIpResultOutput {
	return o
}

func (o LookupPublicIpResultOutput) ToLookupPublicIpResultOutputWithContext(ctx context.Context) LookupPublicIpResultOutput {
	return o
}

func (o LookupPublicIpResultOutput) Filters() GetPublicIpFilterArrayOutput {
	return o.ApplyT(func(v LookupPublicIpResult) []GetPublicIpFilter { return v.Filters }).(GetPublicIpFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPublicIpResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required in a Net) The ID representing the association of the public IP with the VM or the NIC.
func (o LookupPublicIpResultOutput) LinkPublicIpId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.LinkPublicIpId }).(pulumi.StringOutput)
}

// The account ID of the owner of the NIC.
func (o LookupPublicIpResultOutput) NicAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.NicAccountId }).(pulumi.StringOutput)
}

// The ID of the NIC the public IP is associated with (if any).
func (o LookupPublicIpResultOutput) NicId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.NicId }).(pulumi.StringOutput)
}

// The private IP associated with the public IP.
func (o LookupPublicIpResultOutput) PrivateIp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.PrivateIp }).(pulumi.StringOutput)
}

// The public IP.
func (o LookupPublicIpResultOutput) PublicIp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.PublicIp }).(pulumi.StringOutput)
}

// The allocation ID of the public IP.
func (o LookupPublicIpResultOutput) PublicIpId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.PublicIpId }).(pulumi.StringOutput)
}

func (o LookupPublicIpResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// One or more tags associated with the public IP.
func (o LookupPublicIpResultOutput) Tags() GetPublicIpTagArrayOutput {
	return o.ApplyT(func(v LookupPublicIpResult) []GetPublicIpTag { return v.Tags }).(GetPublicIpTagArrayOutput)
}

// The ID of the VM the public IP is associated with (if any).
func (o LookupPublicIpResultOutput) VmId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPublicIpResult) string { return v.VmId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPublicIpResultOutput{})
}
