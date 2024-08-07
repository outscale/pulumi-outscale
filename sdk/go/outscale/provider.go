// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the outscale package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The Access Key ID for API operations
	AccessKeyId pulumi.StringPtrOutput `pulumi:"accessKeyId"`
	// The Region for API operations.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// The Secret Key ID for API operations.
	SecretKeyId pulumi.StringPtrOutput `pulumi:"secretKeyId"`
	// The path to your x509 cert
	X509CertPath pulumi.StringPtrOutput `pulumi:"x509CertPath"`
	// The path to your x509 key
	X509KeyPath pulumi.StringPtrOutput `pulumi:"x509KeyPath"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.AccessKeyId == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "OUTSCALE_ACCESSKEYID"); d != nil {
			args.AccessKeyId = pulumi.StringPtr(d.(string))
		}
	}
	if args.Region == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "OUTSCALE_REGION"); d != nil {
			args.Region = pulumi.StringPtr(d.(string))
		}
	}
	if args.SecretKeyId == nil {
		if d := internal.GetEnvOrDefault(nil, nil, "OUTSCALE_SECRETKEYID"); d != nil {
			args.SecretKeyId = pulumi.StringPtr(d.(string))
		}
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:outscale", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The Access Key ID for API operations
	AccessKeyId *string            `pulumi:"accessKeyId"`
	Endpoints   []ProviderEndpoint `pulumi:"endpoints"`
	// tls insecure connection
	Insecure *bool `pulumi:"insecure"`
	// The Region for API operations.
	Region *string `pulumi:"region"`
	// The Secret Key ID for API operations.
	SecretKeyId *string `pulumi:"secretKeyId"`
	// The path to your x509 cert
	X509CertPath *string `pulumi:"x509CertPath"`
	// The path to your x509 key
	X509KeyPath *string `pulumi:"x509KeyPath"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The Access Key ID for API operations
	AccessKeyId pulumi.StringPtrInput
	Endpoints   ProviderEndpointArrayInput
	// tls insecure connection
	Insecure pulumi.BoolPtrInput
	// The Region for API operations.
	Region pulumi.StringPtrInput
	// The Secret Key ID for API operations.
	SecretKeyId pulumi.StringPtrInput
	// The path to your x509 cert
	X509CertPath pulumi.StringPtrInput
	// The path to your x509 key
	X509KeyPath pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// The Access Key ID for API operations
func (o ProviderOutput) AccessKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.AccessKeyId }).(pulumi.StringPtrOutput)
}

// The Region for API operations.
func (o ProviderOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// The Secret Key ID for API operations.
func (o ProviderOutput) SecretKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.SecretKeyId }).(pulumi.StringPtrOutput)
}

// The path to your x509 cert
func (o ProviderOutput) X509CertPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.X509CertPath }).(pulumi.StringPtrOutput)
}

// The path to your x509 key
func (o ProviderOutput) X509KeyPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.X509KeyPath }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
