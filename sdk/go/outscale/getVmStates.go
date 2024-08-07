// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about VM states.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Instance-Lifecycle.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmsstate).
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
//			_, err := outscale.GetVmStates(ctx, &outscale.GetVmStatesArgs{
//				Filters: []outscale.GetVmStatesFilter{
//					{
//						Name: "vm_ids",
//						Values: []string{
//							"i-12345678",
//							"i-87654321",
//						},
//					},
//					{
//						Name: "vm_states",
//						Values: []string{
//							"running",
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
func GetVmStates(ctx *pulumi.Context, args *GetVmStatesArgs, opts ...pulumi.InvokeOption) (*GetVmStatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVmStatesResult
	err := ctx.Invoke("outscale:index/getVmStates:getVmStates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVmStates.
type GetVmStatesArgs struct {
	// If true, includes the status of all VMs. By default or if set to false, only includes the status of running VMs.
	AllVms *bool `pulumi:"allVms"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetVmStatesFilter `pulumi:"filters"`
	// One or more IDs of VMs.
	VmIds []string `pulumi:"vmIds"`
}

// A collection of values returned by getVmStates.
type GetVmStatesResult struct {
	AllVms  *bool               `pulumi:"allVms"`
	Filters []GetVmStatesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	RequestId string   `pulumi:"requestId"`
	VmIds     []string `pulumi:"vmIds"`
	// Information about one or more VM states.
	VmStates []GetVmStatesVmState `pulumi:"vmStates"`
}

func GetVmStatesOutput(ctx *pulumi.Context, args GetVmStatesOutputArgs, opts ...pulumi.InvokeOption) GetVmStatesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVmStatesResult, error) {
			args := v.(GetVmStatesArgs)
			r, err := GetVmStates(ctx, &args, opts...)
			var s GetVmStatesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVmStatesResultOutput)
}

// A collection of arguments for invoking getVmStates.
type GetVmStatesOutputArgs struct {
	// If true, includes the status of all VMs. By default or if set to false, only includes the status of running VMs.
	AllVms pulumi.BoolPtrInput `pulumi:"allVms"`
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetVmStatesFilterArrayInput `pulumi:"filters"`
	// One or more IDs of VMs.
	VmIds pulumi.StringArrayInput `pulumi:"vmIds"`
}

func (GetVmStatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVmStatesArgs)(nil)).Elem()
}

// A collection of values returned by getVmStates.
type GetVmStatesResultOutput struct{ *pulumi.OutputState }

func (GetVmStatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVmStatesResult)(nil)).Elem()
}

func (o GetVmStatesResultOutput) ToGetVmStatesResultOutput() GetVmStatesResultOutput {
	return o
}

func (o GetVmStatesResultOutput) ToGetVmStatesResultOutputWithContext(ctx context.Context) GetVmStatesResultOutput {
	return o
}

func (o GetVmStatesResultOutput) AllVms() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetVmStatesResult) *bool { return v.AllVms }).(pulumi.BoolPtrOutput)
}

func (o GetVmStatesResultOutput) Filters() GetVmStatesFilterArrayOutput {
	return o.ApplyT(func(v GetVmStatesResult) []GetVmStatesFilter { return v.Filters }).(GetVmStatesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVmStatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVmStatesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVmStatesResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVmStatesResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func (o GetVmStatesResultOutput) VmIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVmStatesResult) []string { return v.VmIds }).(pulumi.StringArrayOutput)
}

// Information about one or more VM states.
func (o GetVmStatesResultOutput) VmStates() GetVmStatesVmStateArrayOutput {
	return o.ApplyT(func(v GetVmStatesResult) []GetVmStatesVmState { return v.VmStates }).(GetVmStatesVmStateArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVmStatesResultOutput{})
}
