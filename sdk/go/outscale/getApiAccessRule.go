// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about an API access rule.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-API-Access-Rules.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-apiaccessrule).
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
//			_, err := outscale.LookupApiAccessRule(ctx, &outscale.LookupApiAccessRuleArgs{
//				Filters: []outscale.GetApiAccessRuleFilter{
//					{
//						Name: "api_access_rule_ids",
//						Values: []string{
//							"aar-12345678",
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
func LookupApiAccessRule(ctx *pulumi.Context, args *LookupApiAccessRuleArgs, opts ...pulumi.InvokeOption) (*LookupApiAccessRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApiAccessRuleResult
	err := ctx.Invoke("outscale:index/getApiAccessRule:getApiAccessRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApiAccessRule.
type LookupApiAccessRuleArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters []GetApiAccessRuleFilter `pulumi:"filters"`
}

// A collection of values returned by getApiAccessRule.
type LookupApiAccessRuleResult struct {
	// The ID of the API access rule.
	ApiAccessRuleId string `pulumi:"apiAccessRuleId"`
	// One or more IDs of Client Certificate Authorities (CAs) used for the API access rule.
	CaIds []string `pulumi:"caIds"`
	// One or more Client Certificate Common Names (CNs).
	Cns []string `pulumi:"cns"`
	// The description of the API access rule.
	Description string                   `pulumi:"description"`
	Filters     []GetApiAccessRuleFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// One or more IP ranges used for the API access rule, in CIDR notation (for example, `192.0.2.0/16`).
	IpRanges  []string `pulumi:"ipRanges"`
	RequestId string   `pulumi:"requestId"`
}

func LookupApiAccessRuleOutput(ctx *pulumi.Context, args LookupApiAccessRuleOutputArgs, opts ...pulumi.InvokeOption) LookupApiAccessRuleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApiAccessRuleResult, error) {
			args := v.(LookupApiAccessRuleArgs)
			r, err := LookupApiAccessRule(ctx, &args, opts...)
			var s LookupApiAccessRuleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApiAccessRuleResultOutput)
}

// A collection of arguments for invoking getApiAccessRule.
type LookupApiAccessRuleOutputArgs struct {
	// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
	Filters GetApiAccessRuleFilterArrayInput `pulumi:"filters"`
}

func (LookupApiAccessRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApiAccessRuleArgs)(nil)).Elem()
}

// A collection of values returned by getApiAccessRule.
type LookupApiAccessRuleResultOutput struct{ *pulumi.OutputState }

func (LookupApiAccessRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApiAccessRuleResult)(nil)).Elem()
}

func (o LookupApiAccessRuleResultOutput) ToLookupApiAccessRuleResultOutput() LookupApiAccessRuleResultOutput {
	return o
}

func (o LookupApiAccessRuleResultOutput) ToLookupApiAccessRuleResultOutputWithContext(ctx context.Context) LookupApiAccessRuleResultOutput {
	return o
}

// The ID of the API access rule.
func (o LookupApiAccessRuleResultOutput) ApiAccessRuleId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiAccessRuleResult) string { return v.ApiAccessRuleId }).(pulumi.StringOutput)
}

// One or more IDs of Client Certificate Authorities (CAs) used for the API access rule.
func (o LookupApiAccessRuleResultOutput) CaIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApiAccessRuleResult) []string { return v.CaIds }).(pulumi.StringArrayOutput)
}

// One or more Client Certificate Common Names (CNs).
func (o LookupApiAccessRuleResultOutput) Cns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApiAccessRuleResult) []string { return v.Cns }).(pulumi.StringArrayOutput)
}

// The description of the API access rule.
func (o LookupApiAccessRuleResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiAccessRuleResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupApiAccessRuleResultOutput) Filters() GetApiAccessRuleFilterArrayOutput {
	return o.ApplyT(func(v LookupApiAccessRuleResult) []GetApiAccessRuleFilter { return v.Filters }).(GetApiAccessRuleFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApiAccessRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiAccessRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// One or more IP ranges used for the API access rule, in CIDR notation (for example, `192.0.2.0/16`).
func (o LookupApiAccessRuleResultOutput) IpRanges() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApiAccessRuleResult) []string { return v.IpRanges }).(pulumi.StringArrayOutput)
}

func (o LookupApiAccessRuleResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApiAccessRuleResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApiAccessRuleResultOutput{})
}
