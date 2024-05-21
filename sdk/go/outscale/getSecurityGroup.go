// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a security group.
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
//			_, err := outscale.LookupSecurityGroup(ctx, &outscale.LookupSecurityGroupArgs{
//				Filters: []outscale.GetSecurityGroupFilter{
//					{
//						Name: "security_group_ids",
//						Values: []string{
//							"sg-12345678",
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
func LookupSecurityGroup(ctx *pulumi.Context, args *LookupSecurityGroupArgs, opts ...pulumi.InvokeOption) (*LookupSecurityGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSecurityGroupResult
	err := ctx.Invoke("outscale:index/getSecurityGroup:getSecurityGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecurityGroup.
type LookupSecurityGroupArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetSecurityGroupFilter `pulumi:"filters"`
	// The ID of the security group.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The name of the security group.
	SecurityGroupName *string `pulumi:"securityGroupName"`
}

// A collection of values returned by getSecurityGroup.
type LookupSecurityGroupResult struct {
	// The account ID that owns the source or destination security group.
	AccountId string `pulumi:"accountId"`
	// The description of the security group.
	Description string                   `pulumi:"description"`
	Filters     []GetSecurityGroupFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The inbound rules associated with the security group.
	InboundRules []GetSecurityGroupInboundRule `pulumi:"inboundRules"`
	// The ID of the Net for the security group.
	NetId string `pulumi:"netId"`
	// The outbound rules associated with the security group.
	OutboundRules []GetSecurityGroupOutboundRule `pulumi:"outboundRules"`
	RequestId     string                         `pulumi:"requestId"`
	// The ID of the security group.
	SecurityGroupId string `pulumi:"securityGroupId"`
	// The name of the security group.
	SecurityGroupName string `pulumi:"securityGroupName"`
	// One or more tags associated with the security group.
	Tags []GetSecurityGroupTag `pulumi:"tags"`
}

func LookupSecurityGroupOutput(ctx *pulumi.Context, args LookupSecurityGroupOutputArgs, opts ...pulumi.InvokeOption) LookupSecurityGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSecurityGroupResult, error) {
			args := v.(LookupSecurityGroupArgs)
			r, err := LookupSecurityGroup(ctx, &args, opts...)
			var s LookupSecurityGroupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSecurityGroupResultOutput)
}

// A collection of arguments for invoking getSecurityGroup.
type LookupSecurityGroupOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetSecurityGroupFilterArrayInput `pulumi:"filters"`
	// The ID of the security group.
	SecurityGroupId pulumi.StringPtrInput `pulumi:"securityGroupId"`
	// The name of the security group.
	SecurityGroupName pulumi.StringPtrInput `pulumi:"securityGroupName"`
}

func (LookupSecurityGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecurityGroupArgs)(nil)).Elem()
}

// A collection of values returned by getSecurityGroup.
type LookupSecurityGroupResultOutput struct{ *pulumi.OutputState }

func (LookupSecurityGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecurityGroupResult)(nil)).Elem()
}

func (o LookupSecurityGroupResultOutput) ToLookupSecurityGroupResultOutput() LookupSecurityGroupResultOutput {
	return o
}

func (o LookupSecurityGroupResultOutput) ToLookupSecurityGroupResultOutputWithContext(ctx context.Context) LookupSecurityGroupResultOutput {
	return o
}

// The account ID that owns the source or destination security group.
func (o LookupSecurityGroupResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The description of the security group.
func (o LookupSecurityGroupResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupSecurityGroupResultOutput) Filters() GetSecurityGroupFilterArrayOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) []GetSecurityGroupFilter { return v.Filters }).(GetSecurityGroupFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSecurityGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// The inbound rules associated with the security group.
func (o LookupSecurityGroupResultOutput) InboundRules() GetSecurityGroupInboundRuleArrayOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) []GetSecurityGroupInboundRule { return v.InboundRules }).(GetSecurityGroupInboundRuleArrayOutput)
}

// The ID of the Net for the security group.
func (o LookupSecurityGroupResultOutput) NetId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) string { return v.NetId }).(pulumi.StringOutput)
}

// The outbound rules associated with the security group.
func (o LookupSecurityGroupResultOutput) OutboundRules() GetSecurityGroupOutboundRuleArrayOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) []GetSecurityGroupOutboundRule { return v.OutboundRules }).(GetSecurityGroupOutboundRuleArrayOutput)
}

func (o LookupSecurityGroupResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) string { return v.RequestId }).(pulumi.StringOutput)
}

// The ID of the security group.
func (o LookupSecurityGroupResultOutput) SecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) string { return v.SecurityGroupId }).(pulumi.StringOutput)
}

// The name of the security group.
func (o LookupSecurityGroupResultOutput) SecurityGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) string { return v.SecurityGroupName }).(pulumi.StringOutput)
}

// One or more tags associated with the security group.
func (o LookupSecurityGroupResultOutput) Tags() GetSecurityGroupTagArrayOutput {
	return o.ApplyT(func(v LookupSecurityGroupResult) []GetSecurityGroupTag { return v.Tags }).(GetSecurityGroupTagArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSecurityGroupResultOutput{})
}