// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about accounts.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Your-Account.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-account).
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
//			_, err := outscale.GetAccounts(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetAccounts(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAccountsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccountsResult
	err := ctx.Invoke("outscale:index/getAccounts:getAccounts", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAccounts.
type GetAccountsResult struct {
	// The list of the accounts.
	Accounts []GetAccountsAccount `pulumi:"accounts"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	RequestId string `pulumi:"requestId"`
}

func GetAccountsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetAccountsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetAccountsResult, error) {
		r, err := GetAccounts(ctx, opts...)
		var s GetAccountsResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetAccountsResultOutput)
}

// A collection of values returned by getAccounts.
type GetAccountsResultOutput struct{ *pulumi.OutputState }

func (GetAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountsResult)(nil)).Elem()
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutput() GetAccountsResultOutput {
	return o
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutputWithContext(ctx context.Context) GetAccountsResultOutput {
	return o
}

// The list of the accounts.
func (o GetAccountsResultOutput) Accounts() GetAccountsAccountArrayOutput {
	return o.ApplyT(func(v GetAccountsResult) []GetAccountsAccount { return v.Accounts }).(GetAccountsAccountArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAccountsResultOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountsResult) string { return v.RequestId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountsResultOutput{})
}
