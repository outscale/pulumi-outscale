// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about the health of one or more back-end VMs registered with a specific load balancer.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmshealth).
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
//			_, err := outscale.GetLoadBalancerVmHealth(ctx, &outscale.GetLoadBalancerVmHealthArgs{
//				BackendVmIds: []string{
//					"i-12345678",
//					"i-87654321",
//				},
//				LoadBalancerName: "load_balancer01",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLoadBalancerVmHealth(ctx *pulumi.Context, args *GetLoadBalancerVmHealthArgs, opts ...pulumi.InvokeOption) (*GetLoadBalancerVmHealthResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLoadBalancerVmHealthResult
	err := ctx.Invoke("outscale:index/getLoadBalancerVmHealth:getLoadBalancerVmHealth", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancerVmHealth.
type GetLoadBalancerVmHealthArgs struct {
	// One or more IDs of back-end VMs.
	BackendVmIds []string                        `pulumi:"backendVmIds"`
	Filters      []GetLoadBalancerVmHealthFilter `pulumi:"filters"`
	// The name of the load balancer.
	LoadBalancerName string `pulumi:"loadBalancerName"`
}

// A collection of values returned by getLoadBalancerVmHealth.
type GetLoadBalancerVmHealthResult struct {
	// Information about the health of one or more back-end VMs.
	BackendVmHealths []GetLoadBalancerVmHealthBackendVmHealth `pulumi:"backendVmHealths"`
	BackendVmIds     []string                                 `pulumi:"backendVmIds"`
	Filters          []GetLoadBalancerVmHealthFilter          `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id               string `pulumi:"id"`
	LoadBalancerName string `pulumi:"loadBalancerName"`
	RequestId        string `pulumi:"requestId"`
}

func GetLoadBalancerVmHealthOutput(ctx *pulumi.Context, args GetLoadBalancerVmHealthOutputArgs, opts ...pulumi.InvokeOption) GetLoadBalancerVmHealthResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLoadBalancerVmHealthResult, error) {
			args := v.(GetLoadBalancerVmHealthArgs)
			r, err := GetLoadBalancerVmHealth(ctx, &args, opts...)
			var s GetLoadBalancerVmHealthResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetLoadBalancerVmHealthResultOutput)
}

// A collection of arguments for invoking getLoadBalancerVmHealth.
type GetLoadBalancerVmHealthOutputArgs struct {
	// One or more IDs of back-end VMs.
	BackendVmIds pulumi.StringArrayInput                 `pulumi:"backendVmIds"`
	Filters      GetLoadBalancerVmHealthFilterArrayInput `pulumi:"filters"`
	// The name of the load balancer.
	LoadBalancerName pulumi.StringInput `pulumi:"loadBalancerName"`
}

func (GetLoadBalancerVmHealthOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLoadBalancerVmHealthArgs)(nil)).Elem()
}

// A collection of values returned by getLoadBalancerVmHealth.
type GetLoadBalancerVmHealthResultOutput struct{ *pulumi.OutputState }

func (GetLoadBalancerVmHealthResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLoadBalancerVmHealthResult)(nil)).Elem()
}

func (o GetLoadBalancerVmHealthResultOutput) ToGetLoadBalancerVmHealthResultOutput() GetLoadBalancerVmHealthResultOutput {
	return o
}

func (o GetLoadBalancerVmHealthResultOutput) ToGetLoadBalancerVmHealthResultOutputWithContext(ctx context.Context) GetLoadBalancerVmHealthResultOutput {
	return o
}

// Information about the health of one or more back-end VMs.
func (o GetLoadBalancerVmHealthResultOutput) BackendVmHealths() GetLoadBalancerVmHealthBackendVmHealthArrayOutput {
	return o.ApplyT(func(v GetLoadBalancerVmHealthResult) []GetLoadBalancerVmHealthBackendVmHealth {
		return v.BackendVmHealths
	}).(GetLoadBalancerVmHealthBackendVmHealthArrayOutput)
}

func (o GetLoadBalancerVmHealthResultOutput) BackendVmIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLoadBalancerVmHealthResult) []string { return v.BackendVmIds }).(pulumi.StringArrayOutput)
}

func (o GetLoadBalancerVmHealthResultOutput) Filters() GetLoadBalancerVmHealthFilterArrayOutput {
	return o.ApplyT(func(v GetLoadBalancerVmHealthResult) []GetLoadBalancerVmHealthFilter { return v.Filters }).(GetLoadBalancerVmHealthFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLoadBalancerVmHealthResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLoadBalancerVmHealthResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLoadBalancerVmHealthResultOutput) LoadBalancerName() pulumi.StringOutput {
	return o.ApplyT(func(v GetLoadBalancerVmHealthResult) string { return v.LoadBalancerName }).(pulumi.StringOutput)
}

func (o GetLoadBalancerVmHealthResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetLoadBalancerVmHealthResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLoadBalancerVmHealthResultOutput{})
}
