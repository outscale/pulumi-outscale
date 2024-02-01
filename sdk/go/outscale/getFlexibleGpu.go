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

// Provides information about a flexible GPU.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).
func LookupFlexibleGpu(ctx *pulumi.Context, args *LookupFlexibleGpuArgs, opts ...pulumi.InvokeOption) (*LookupFlexibleGpuResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFlexibleGpuResult
	err := ctx.Invoke("outscale:index/getFlexibleGpu:getFlexibleGpu", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFlexibleGpu.
type LookupFlexibleGpuArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetFlexibleGpuFilter `pulumi:"filters"`
}

// A collection of values returned by getFlexibleGpu.
type LookupFlexibleGpuResult struct {
	// If true, the fGPU is deleted when the VM is terminated.
	DeleteOnVmDeletion bool                   `pulumi:"deleteOnVmDeletion"`
	Filters            []GetFlexibleGpuFilter `pulumi:"filters"`
	// The ID of the fGPU.
	FlexibleGpuId string `pulumi:"flexibleGpuId"`
	// The compatible processor generation.
	Generation string `pulumi:"generation"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The model of fGPU. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
	ModelName string `pulumi:"modelName"`
	RequestId string `pulumi:"requestId"`
	// The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
	State string `pulumi:"state"`
	// The Subregion where the fGPU is located.
	SubregionName string `pulumi:"subregionName"`
	// The ID of the VM the fGPU is attached to, if any.
	VmId string `pulumi:"vmId"`
}

func LookupFlexibleGpuOutput(ctx *pulumi.Context, args LookupFlexibleGpuOutputArgs, opts ...pulumi.InvokeOption) LookupFlexibleGpuResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFlexibleGpuResult, error) {
			args := v.(LookupFlexibleGpuArgs)
			r, err := LookupFlexibleGpu(ctx, &args, opts...)
			var s LookupFlexibleGpuResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFlexibleGpuResultOutput)
}

// A collection of arguments for invoking getFlexibleGpu.
type LookupFlexibleGpuOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetFlexibleGpuFilterArrayInput `pulumi:"filters"`
}

func (LookupFlexibleGpuOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlexibleGpuArgs)(nil)).Elem()
}

// A collection of values returned by getFlexibleGpu.
type LookupFlexibleGpuResultOutput struct{ *pulumi.OutputState }

func (LookupFlexibleGpuResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlexibleGpuResult)(nil)).Elem()
}

func (o LookupFlexibleGpuResultOutput) ToLookupFlexibleGpuResultOutput() LookupFlexibleGpuResultOutput {
	return o
}

func (o LookupFlexibleGpuResultOutput) ToLookupFlexibleGpuResultOutputWithContext(ctx context.Context) LookupFlexibleGpuResultOutput {
	return o
}

func (o LookupFlexibleGpuResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupFlexibleGpuResult] {
	return pulumix.Output[LookupFlexibleGpuResult]{
		OutputState: o.OutputState,
	}
}

// If true, the fGPU is deleted when the VM is terminated.
func (o LookupFlexibleGpuResultOutput) DeleteOnVmDeletion() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) bool { return v.DeleteOnVmDeletion }).(pulumi.BoolOutput)
}

func (o LookupFlexibleGpuResultOutput) Filters() GetFlexibleGpuFilterArrayOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) []GetFlexibleGpuFilter { return v.Filters }).(GetFlexibleGpuFilterArrayOutput)
}

// The ID of the fGPU.
func (o LookupFlexibleGpuResultOutput) FlexibleGpuId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) string { return v.FlexibleGpuId }).(pulumi.StringOutput)
}

// The compatible processor generation.
func (o LookupFlexibleGpuResultOutput) Generation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) string { return v.Generation }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFlexibleGpuResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) string { return v.Id }).(pulumi.StringOutput)
}

// The model of fGPU. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
func (o LookupFlexibleGpuResultOutput) ModelName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) string { return v.ModelName }).(pulumi.StringOutput)
}

func (o LookupFlexibleGpuResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// The state of the fGPU (`allocated` \| `attaching` \| `attached` \| `detaching`).
func (o LookupFlexibleGpuResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) string { return v.State }).(pulumi.StringOutput)
}

// The Subregion where the fGPU is located.
func (o LookupFlexibleGpuResultOutput) SubregionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) string { return v.SubregionName }).(pulumi.StringOutput)
}

// The ID of the VM the fGPU is attached to, if any.
func (o LookupFlexibleGpuResultOutput) VmId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlexibleGpuResult) string { return v.VmId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFlexibleGpuResultOutput{})
}
