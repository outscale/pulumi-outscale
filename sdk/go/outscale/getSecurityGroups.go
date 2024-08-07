// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about security groups.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Security-Groups.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-securitygroup).
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
//			_, err := outscale.GetSecurityGroups(ctx, &outscale.GetSecurityGroupsArgs{
//				Filters: []outscale.GetSecurityGroupsFilter{
//					{
//						Name: "net_ids",
//						Values: []string{
//							"sg-12345678",
//							"sg-87654321",
//						},
//					},
//					{
//						Name: "inbound_rule_ip_ranges",
//						Values: []string{
//							"111.11.111.1/32",
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
func GetSecurityGroups(ctx *pulumi.Context, args *GetSecurityGroupsArgs, opts ...pulumi.InvokeOption) (*GetSecurityGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSecurityGroupsResult
	err := ctx.Invoke("outscale:index/getSecurityGroups:getSecurityGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecurityGroups.
type GetSecurityGroupsArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetSecurityGroupsFilter `pulumi:"filters"`
	// The IDs of the security groups.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The names of the security groups.
	SecurityGroupNames []string `pulumi:"securityGroupNames"`
}

// A collection of values returned by getSecurityGroups.
type GetSecurityGroupsResult struct {
	Filters []GetSecurityGroupsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id                 string   `pulumi:"id"`
	RequestId          string   `pulumi:"requestId"`
	SecurityGroupIds   []string `pulumi:"securityGroupIds"`
	SecurityGroupNames []string `pulumi:"securityGroupNames"`
	// Information about one or more security groups.
	SecurityGroups []GetSecurityGroupsSecurityGroup `pulumi:"securityGroups"`
}

func GetSecurityGroupsOutput(ctx *pulumi.Context, args GetSecurityGroupsOutputArgs, opts ...pulumi.InvokeOption) GetSecurityGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSecurityGroupsResult, error) {
			args := v.(GetSecurityGroupsArgs)
			r, err := GetSecurityGroups(ctx, &args, opts...)
			var s GetSecurityGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSecurityGroupsResultOutput)
}

// A collection of arguments for invoking getSecurityGroups.
type GetSecurityGroupsOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetSecurityGroupsFilterArrayInput `pulumi:"filters"`
	// The IDs of the security groups.
	SecurityGroupIds pulumi.StringArrayInput `pulumi:"securityGroupIds"`
	// The names of the security groups.
	SecurityGroupNames pulumi.StringArrayInput `pulumi:"securityGroupNames"`
}

func (GetSecurityGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecurityGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getSecurityGroups.
type GetSecurityGroupsResultOutput struct{ *pulumi.OutputState }

func (GetSecurityGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecurityGroupsResult)(nil)).Elem()
}

func (o GetSecurityGroupsResultOutput) ToGetSecurityGroupsResultOutput() GetSecurityGroupsResultOutput {
	return o
}

func (o GetSecurityGroupsResultOutput) ToGetSecurityGroupsResultOutputWithContext(ctx context.Context) GetSecurityGroupsResultOutput {
	return o
}

func (o GetSecurityGroupsResultOutput) Filters() GetSecurityGroupsFilterArrayOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) []GetSecurityGroupsFilter { return v.Filters }).(GetSecurityGroupsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSecurityGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSecurityGroupsResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func (o GetSecurityGroupsResultOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) []string { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

func (o GetSecurityGroupsResultOutput) SecurityGroupNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) []string { return v.SecurityGroupNames }).(pulumi.StringArrayOutput)
}

// Information about one or more security groups.
func (o GetSecurityGroupsResultOutput) SecurityGroups() GetSecurityGroupsSecurityGroupArrayOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) []GetSecurityGroupsSecurityGroup { return v.SecurityGroups }).(GetSecurityGroupsSecurityGroupArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecurityGroupsResultOutput{})
}
