// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outscale

import (
	"context"
	"reflect"

	"errors"
	"github.com/outscale/pulumi-outscale/sdk/go/outscale/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a load balancer policy.
//
// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\
// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancerpolicy).
//
// ## Example Usage
// ### Create a load balancer policy based on browser
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
//			_, err := outscale.NewLoadBalancer(ctx, "loadBalancer01", &outscale.LoadBalancerArgs{
//				Listeners: outscale.LoadBalancerListenerArray{
//					&outscale.LoadBalancerListenerArgs{
//						BackendPort:          pulumi.Int(8080),
//						BackendProtocol:      pulumi.String("HTTP"),
//						LoadBalancerPort:     pulumi.Int(8080),
//						LoadBalancerProtocol: pulumi.String("HTTP"),
//					},
//				},
//				LoadBalancerName: pulumi.String("terraform-lb-for-browser-policy"),
//				SubregionNames: pulumi.StringArray{
//					pulumi.String("eu-west-2a"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = outscale.NewLoadBalancerPolicy(ctx, "loadBalancerPolicy01", &outscale.LoadBalancerPolicyArgs{
//				LoadBalancerName: pulumi.String("terraform-lb-for-browser-policy"),
//				PolicyName:       pulumi.String("terraform-lb-browser-policy"),
//				PolicyType:       pulumi.String("load_balancer"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Create a load balancer policy based on application cookie
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/outscale/pulumi-outscale/sdk/go/outscale"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			loadBalancer02, err := outscale.NewLoadBalancer(ctx, "loadBalancer02", &outscale.LoadBalancerArgs{
//				LoadBalancerName: pulumi.String("terraform-lb-for-app-policy"),
//				SubregionNames: pulumi.StringArray{
//					pulumi.String(fmt.Sprintf("%vb", _var.Region)),
//				},
//				Listeners: outscale.LoadBalancerListenerArray{
//					&outscale.LoadBalancerListenerArgs{
//						LoadBalancerPort:     pulumi.Int(80),
//						LoadBalancerProtocol: pulumi.String("TCP"),
//						BackendPort:          pulumi.Int(80),
//						BackendProtocol:      pulumi.String("TCP"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = outscale.NewLoadBalancerPolicy(ctx, "loadBalancerPolicy02", &outscale.LoadBalancerPolicyArgs{
//				LoadBalancerName: loadBalancer02.LoadBalancerName,
//				PolicyName:       pulumi.String("terraform-lb-app-policy"),
//				PolicyType:       pulumi.String("app"),
//				CookieName:       pulumi.String("cookie01"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				loadBalancer02,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type LoadBalancerPolicy struct {
	pulumi.CustomResourceState

	// Information about access logs.
	AccessLogs LoadBalancerPolicyAccessLogArrayOutput `pulumi:"accessLogs"`
	// The stickiness policies defined for the load balancer.
	ApplicationStickyCookiePolicies LoadBalancerPolicyApplicationStickyCookiePolicyArrayOutput `pulumi:"applicationStickyCookiePolicies"`
	// One or more IDs of back-end VMs for the load balancer.
	BackendVmIds           pulumi.StringArrayOutput `pulumi:"backendVmIds"`
	CookieExpirationPeriod pulumi.IntOutput         `pulumi:"cookieExpirationPeriod"`
	// The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
	CookieName pulumi.StringOutput `pulumi:"cookieName"`
	// The DNS name of the load balancer.
	DnsName pulumi.StringOutput `pulumi:"dnsName"`
	// Information about the health check configuration.
	HealthChecks LoadBalancerPolicyHealthCheckArrayOutput `pulumi:"healthChecks"`
	// The listeners for the load balancer.
	Listeners LoadBalancerPolicyListenerArrayOutput `pulumi:"listeners"`
	// The name of the load balancer for which you want to create a policy.
	LoadBalancerName pulumi.StringOutput `pulumi:"loadBalancerName"`
	// The policies defined for the load balancer.
	LoadBalancerStickyCookiePolicies LoadBalancerPolicyLoadBalancerStickyCookiePolicyArrayOutput `pulumi:"loadBalancerStickyCookiePolicies"`
	// The type of load balancer. Valid only for load balancers in a Net.<br />
	// If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
	// If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
	LoadBalancerType pulumi.StringOutput `pulumi:"loadBalancerType"`
	// The ID of the Net for the load balancer.
	NetId pulumi.StringOutput `pulumi:"netId"`
	// The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
	PolicyName pulumi.StringOutput `pulumi:"policyName"`
	// The type of stickiness policy you want to create: `app` or `loadBalancer`.
	PolicyType     pulumi.StringOutput `pulumi:"policyType"`
	PublicIp       pulumi.StringOutput `pulumi:"publicIp"`
	RequestId      pulumi.StringOutput `pulumi:"requestId"`
	SecuredCookies pulumi.BoolOutput   `pulumi:"securedCookies"`
	// One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	// Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
	// To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
	SourceSecurityGroups LoadBalancerPolicySourceSecurityGroupArrayOutput `pulumi:"sourceSecurityGroups"`
	// The ID of the Subnet in which the load balancer was created.
	Subnets pulumi.StringArrayOutput `pulumi:"subnets"`
	// The ID of the Subregion in which the load balancer was created.
	SubregionNames pulumi.StringArrayOutput `pulumi:"subregionNames"`
	// One or more tags associated with the load balancer.
	Tags LoadBalancerPolicyTagArrayOutput `pulumi:"tags"`
}

// NewLoadBalancerPolicy registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancerPolicy(ctx *pulumi.Context,
	name string, args *LoadBalancerPolicyArgs, opts ...pulumi.ResourceOption) (*LoadBalancerPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LoadBalancerName == nil {
		return nil, errors.New("invalid value for required argument 'LoadBalancerName'")
	}
	if args.PolicyName == nil {
		return nil, errors.New("invalid value for required argument 'PolicyName'")
	}
	if args.PolicyType == nil {
		return nil, errors.New("invalid value for required argument 'PolicyType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadBalancerPolicy
	err := ctx.RegisterResource("outscale:index/loadBalancerPolicy:LoadBalancerPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancerPolicy gets an existing LoadBalancerPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancerPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerPolicyState, opts ...pulumi.ResourceOption) (*LoadBalancerPolicy, error) {
	var resource LoadBalancerPolicy
	err := ctx.ReadResource("outscale:index/loadBalancerPolicy:LoadBalancerPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancerPolicy resources.
type loadBalancerPolicyState struct {
	// Information about access logs.
	AccessLogs []LoadBalancerPolicyAccessLog `pulumi:"accessLogs"`
	// The stickiness policies defined for the load balancer.
	ApplicationStickyCookiePolicies []LoadBalancerPolicyApplicationStickyCookiePolicy `pulumi:"applicationStickyCookiePolicies"`
	// One or more IDs of back-end VMs for the load balancer.
	BackendVmIds           []string `pulumi:"backendVmIds"`
	CookieExpirationPeriod *int     `pulumi:"cookieExpirationPeriod"`
	// The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
	CookieName *string `pulumi:"cookieName"`
	// The DNS name of the load balancer.
	DnsName *string `pulumi:"dnsName"`
	// Information about the health check configuration.
	HealthChecks []LoadBalancerPolicyHealthCheck `pulumi:"healthChecks"`
	// The listeners for the load balancer.
	Listeners []LoadBalancerPolicyListener `pulumi:"listeners"`
	// The name of the load balancer for which you want to create a policy.
	LoadBalancerName *string `pulumi:"loadBalancerName"`
	// The policies defined for the load balancer.
	LoadBalancerStickyCookiePolicies []LoadBalancerPolicyLoadBalancerStickyCookiePolicy `pulumi:"loadBalancerStickyCookiePolicies"`
	// The type of load balancer. Valid only for load balancers in a Net.<br />
	// If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
	// If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
	LoadBalancerType *string `pulumi:"loadBalancerType"`
	// The ID of the Net for the load balancer.
	NetId *string `pulumi:"netId"`
	// The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
	PolicyName *string `pulumi:"policyName"`
	// The type of stickiness policy you want to create: `app` or `loadBalancer`.
	PolicyType     *string `pulumi:"policyType"`
	PublicIp       *string `pulumi:"publicIp"`
	RequestId      *string `pulumi:"requestId"`
	SecuredCookies *bool   `pulumi:"securedCookies"`
	// One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
	SecurityGroups []string `pulumi:"securityGroups"`
	// Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
	// To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
	SourceSecurityGroups []LoadBalancerPolicySourceSecurityGroup `pulumi:"sourceSecurityGroups"`
	// The ID of the Subnet in which the load balancer was created.
	Subnets []string `pulumi:"subnets"`
	// The ID of the Subregion in which the load balancer was created.
	SubregionNames []string `pulumi:"subregionNames"`
	// One or more tags associated with the load balancer.
	Tags []LoadBalancerPolicyTag `pulumi:"tags"`
}

type LoadBalancerPolicyState struct {
	// Information about access logs.
	AccessLogs LoadBalancerPolicyAccessLogArrayInput
	// The stickiness policies defined for the load balancer.
	ApplicationStickyCookiePolicies LoadBalancerPolicyApplicationStickyCookiePolicyArrayInput
	// One or more IDs of back-end VMs for the load balancer.
	BackendVmIds           pulumi.StringArrayInput
	CookieExpirationPeriod pulumi.IntPtrInput
	// The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
	CookieName pulumi.StringPtrInput
	// The DNS name of the load balancer.
	DnsName pulumi.StringPtrInput
	// Information about the health check configuration.
	HealthChecks LoadBalancerPolicyHealthCheckArrayInput
	// The listeners for the load balancer.
	Listeners LoadBalancerPolicyListenerArrayInput
	// The name of the load balancer for which you want to create a policy.
	LoadBalancerName pulumi.StringPtrInput
	// The policies defined for the load balancer.
	LoadBalancerStickyCookiePolicies LoadBalancerPolicyLoadBalancerStickyCookiePolicyArrayInput
	// The type of load balancer. Valid only for load balancers in a Net.<br />
	// If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
	// If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
	LoadBalancerType pulumi.StringPtrInput
	// The ID of the Net for the load balancer.
	NetId pulumi.StringPtrInput
	// The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
	PolicyName pulumi.StringPtrInput
	// The type of stickiness policy you want to create: `app` or `loadBalancer`.
	PolicyType     pulumi.StringPtrInput
	PublicIp       pulumi.StringPtrInput
	RequestId      pulumi.StringPtrInput
	SecuredCookies pulumi.BoolPtrInput
	// One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
	SecurityGroups pulumi.StringArrayInput
	// Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
	// To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
	SourceSecurityGroups LoadBalancerPolicySourceSecurityGroupArrayInput
	// The ID of the Subnet in which the load balancer was created.
	Subnets pulumi.StringArrayInput
	// The ID of the Subregion in which the load balancer was created.
	SubregionNames pulumi.StringArrayInput
	// One or more tags associated with the load balancer.
	Tags LoadBalancerPolicyTagArrayInput
}

func (LoadBalancerPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerPolicyState)(nil)).Elem()
}

type loadBalancerPolicyArgs struct {
	// Information about access logs.
	AccessLogs []LoadBalancerPolicyAccessLog `pulumi:"accessLogs"`
	// One or more IDs of back-end VMs for the load balancer.
	BackendVmIds           []string `pulumi:"backendVmIds"`
	CookieExpirationPeriod *int     `pulumi:"cookieExpirationPeriod"`
	// The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
	CookieName *string `pulumi:"cookieName"`
	// The name of the load balancer for which you want to create a policy.
	LoadBalancerName string `pulumi:"loadBalancerName"`
	// The type of load balancer. Valid only for load balancers in a Net.<br />
	// If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
	// If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
	LoadBalancerType *string `pulumi:"loadBalancerType"`
	// The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
	PolicyName string `pulumi:"policyName"`
	// The type of stickiness policy you want to create: `app` or `loadBalancer`.
	PolicyType string `pulumi:"policyType"`
	// One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
	SecurityGroups []string `pulumi:"securityGroups"`
	// The ID of the Subnet in which the load balancer was created.
	Subnets []string `pulumi:"subnets"`
	// The ID of the Subregion in which the load balancer was created.
	SubregionNames []string `pulumi:"subregionNames"`
	// One or more tags associated with the load balancer.
	Tags []LoadBalancerPolicyTag `pulumi:"tags"`
}

// The set of arguments for constructing a LoadBalancerPolicy resource.
type LoadBalancerPolicyArgs struct {
	// Information about access logs.
	AccessLogs LoadBalancerPolicyAccessLogArrayInput
	// One or more IDs of back-end VMs for the load balancer.
	BackendVmIds           pulumi.StringArrayInput
	CookieExpirationPeriod pulumi.IntPtrInput
	// The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
	CookieName pulumi.StringPtrInput
	// The name of the load balancer for which you want to create a policy.
	LoadBalancerName pulumi.StringInput
	// The type of load balancer. Valid only for load balancers in a Net.<br />
	// If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
	// If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
	LoadBalancerType pulumi.StringPtrInput
	// The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
	PolicyName pulumi.StringInput
	// The type of stickiness policy you want to create: `app` or `loadBalancer`.
	PolicyType pulumi.StringInput
	// One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
	SecurityGroups pulumi.StringArrayInput
	// The ID of the Subnet in which the load balancer was created.
	Subnets pulumi.StringArrayInput
	// The ID of the Subregion in which the load balancer was created.
	SubregionNames pulumi.StringArrayInput
	// One or more tags associated with the load balancer.
	Tags LoadBalancerPolicyTagArrayInput
}

func (LoadBalancerPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerPolicyArgs)(nil)).Elem()
}

type LoadBalancerPolicyInput interface {
	pulumi.Input

	ToLoadBalancerPolicyOutput() LoadBalancerPolicyOutput
	ToLoadBalancerPolicyOutputWithContext(ctx context.Context) LoadBalancerPolicyOutput
}

func (*LoadBalancerPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancerPolicy)(nil)).Elem()
}

func (i *LoadBalancerPolicy) ToLoadBalancerPolicyOutput() LoadBalancerPolicyOutput {
	return i.ToLoadBalancerPolicyOutputWithContext(context.Background())
}

func (i *LoadBalancerPolicy) ToLoadBalancerPolicyOutputWithContext(ctx context.Context) LoadBalancerPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPolicyOutput)
}

// LoadBalancerPolicyArrayInput is an input type that accepts LoadBalancerPolicyArray and LoadBalancerPolicyArrayOutput values.
// You can construct a concrete instance of `LoadBalancerPolicyArrayInput` via:
//
//	LoadBalancerPolicyArray{ LoadBalancerPolicyArgs{...} }
type LoadBalancerPolicyArrayInput interface {
	pulumi.Input

	ToLoadBalancerPolicyArrayOutput() LoadBalancerPolicyArrayOutput
	ToLoadBalancerPolicyArrayOutputWithContext(context.Context) LoadBalancerPolicyArrayOutput
}

type LoadBalancerPolicyArray []LoadBalancerPolicyInput

func (LoadBalancerPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancerPolicy)(nil)).Elem()
}

func (i LoadBalancerPolicyArray) ToLoadBalancerPolicyArrayOutput() LoadBalancerPolicyArrayOutput {
	return i.ToLoadBalancerPolicyArrayOutputWithContext(context.Background())
}

func (i LoadBalancerPolicyArray) ToLoadBalancerPolicyArrayOutputWithContext(ctx context.Context) LoadBalancerPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPolicyArrayOutput)
}

// LoadBalancerPolicyMapInput is an input type that accepts LoadBalancerPolicyMap and LoadBalancerPolicyMapOutput values.
// You can construct a concrete instance of `LoadBalancerPolicyMapInput` via:
//
//	LoadBalancerPolicyMap{ "key": LoadBalancerPolicyArgs{...} }
type LoadBalancerPolicyMapInput interface {
	pulumi.Input

	ToLoadBalancerPolicyMapOutput() LoadBalancerPolicyMapOutput
	ToLoadBalancerPolicyMapOutputWithContext(context.Context) LoadBalancerPolicyMapOutput
}

type LoadBalancerPolicyMap map[string]LoadBalancerPolicyInput

func (LoadBalancerPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancerPolicy)(nil)).Elem()
}

func (i LoadBalancerPolicyMap) ToLoadBalancerPolicyMapOutput() LoadBalancerPolicyMapOutput {
	return i.ToLoadBalancerPolicyMapOutputWithContext(context.Background())
}

func (i LoadBalancerPolicyMap) ToLoadBalancerPolicyMapOutputWithContext(ctx context.Context) LoadBalancerPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPolicyMapOutput)
}

type LoadBalancerPolicyOutput struct{ *pulumi.OutputState }

func (LoadBalancerPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancerPolicy)(nil)).Elem()
}

func (o LoadBalancerPolicyOutput) ToLoadBalancerPolicyOutput() LoadBalancerPolicyOutput {
	return o
}

func (o LoadBalancerPolicyOutput) ToLoadBalancerPolicyOutputWithContext(ctx context.Context) LoadBalancerPolicyOutput {
	return o
}

// Information about access logs.
func (o LoadBalancerPolicyOutput) AccessLogs() LoadBalancerPolicyAccessLogArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) LoadBalancerPolicyAccessLogArrayOutput { return v.AccessLogs }).(LoadBalancerPolicyAccessLogArrayOutput)
}

// The stickiness policies defined for the load balancer.
func (o LoadBalancerPolicyOutput) ApplicationStickyCookiePolicies() LoadBalancerPolicyApplicationStickyCookiePolicyArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) LoadBalancerPolicyApplicationStickyCookiePolicyArrayOutput {
		return v.ApplicationStickyCookiePolicies
	}).(LoadBalancerPolicyApplicationStickyCookiePolicyArrayOutput)
}

// One or more IDs of back-end VMs for the load balancer.
func (o LoadBalancerPolicyOutput) BackendVmIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringArrayOutput { return v.BackendVmIds }).(pulumi.StringArrayOutput)
}

func (o LoadBalancerPolicyOutput) CookieExpirationPeriod() pulumi.IntOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.IntOutput { return v.CookieExpirationPeriod }).(pulumi.IntOutput)
}

// The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
func (o LoadBalancerPolicyOutput) CookieName() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.CookieName }).(pulumi.StringOutput)
}

// The DNS name of the load balancer.
func (o LoadBalancerPolicyOutput) DnsName() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.DnsName }).(pulumi.StringOutput)
}

// Information about the health check configuration.
func (o LoadBalancerPolicyOutput) HealthChecks() LoadBalancerPolicyHealthCheckArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) LoadBalancerPolicyHealthCheckArrayOutput { return v.HealthChecks }).(LoadBalancerPolicyHealthCheckArrayOutput)
}

// The listeners for the load balancer.
func (o LoadBalancerPolicyOutput) Listeners() LoadBalancerPolicyListenerArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) LoadBalancerPolicyListenerArrayOutput { return v.Listeners }).(LoadBalancerPolicyListenerArrayOutput)
}

// The name of the load balancer for which you want to create a policy.
func (o LoadBalancerPolicyOutput) LoadBalancerName() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.LoadBalancerName }).(pulumi.StringOutput)
}

// The policies defined for the load balancer.
func (o LoadBalancerPolicyOutput) LoadBalancerStickyCookiePolicies() LoadBalancerPolicyLoadBalancerStickyCookiePolicyArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) LoadBalancerPolicyLoadBalancerStickyCookiePolicyArrayOutput {
		return v.LoadBalancerStickyCookiePolicies
	}).(LoadBalancerPolicyLoadBalancerStickyCookiePolicyArrayOutput)
}

// The type of load balancer. Valid only for load balancers in a Net.<br />
// If `loadBalancerType` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
// If `loadBalancerType` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
func (o LoadBalancerPolicyOutput) LoadBalancerType() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.LoadBalancerType }).(pulumi.StringOutput)
}

// The ID of the Net for the load balancer.
func (o LoadBalancerPolicyOutput) NetId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.NetId }).(pulumi.StringOutput)
}

// The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
func (o LoadBalancerPolicyOutput) PolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.PolicyName }).(pulumi.StringOutput)
}

// The type of stickiness policy you want to create: `app` or `loadBalancer`.
func (o LoadBalancerPolicyOutput) PolicyType() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.PolicyType }).(pulumi.StringOutput)
}

func (o LoadBalancerPolicyOutput) PublicIp() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.PublicIp }).(pulumi.StringOutput)
}

func (o LoadBalancerPolicyOutput) RequestId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringOutput { return v.RequestId }).(pulumi.StringOutput)
}

func (o LoadBalancerPolicyOutput) SecuredCookies() pulumi.BoolOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.BoolOutput { return v.SecuredCookies }).(pulumi.BoolOutput)
}

// One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
func (o LoadBalancerPolicyOutput) SecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringArrayOutput { return v.SecurityGroups }).(pulumi.StringArrayOutput)
}

// Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
// To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
func (o LoadBalancerPolicyOutput) SourceSecurityGroups() LoadBalancerPolicySourceSecurityGroupArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) LoadBalancerPolicySourceSecurityGroupArrayOutput {
		return v.SourceSecurityGroups
	}).(LoadBalancerPolicySourceSecurityGroupArrayOutput)
}

// The ID of the Subnet in which the load balancer was created.
func (o LoadBalancerPolicyOutput) Subnets() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringArrayOutput { return v.Subnets }).(pulumi.StringArrayOutput)
}

// The ID of the Subregion in which the load balancer was created.
func (o LoadBalancerPolicyOutput) SubregionNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) pulumi.StringArrayOutput { return v.SubregionNames }).(pulumi.StringArrayOutput)
}

// One or more tags associated with the load balancer.
func (o LoadBalancerPolicyOutput) Tags() LoadBalancerPolicyTagArrayOutput {
	return o.ApplyT(func(v *LoadBalancerPolicy) LoadBalancerPolicyTagArrayOutput { return v.Tags }).(LoadBalancerPolicyTagArrayOutput)
}

type LoadBalancerPolicyArrayOutput struct{ *pulumi.OutputState }

func (LoadBalancerPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancerPolicy)(nil)).Elem()
}

func (o LoadBalancerPolicyArrayOutput) ToLoadBalancerPolicyArrayOutput() LoadBalancerPolicyArrayOutput {
	return o
}

func (o LoadBalancerPolicyArrayOutput) ToLoadBalancerPolicyArrayOutputWithContext(ctx context.Context) LoadBalancerPolicyArrayOutput {
	return o
}

func (o LoadBalancerPolicyArrayOutput) Index(i pulumi.IntInput) LoadBalancerPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadBalancerPolicy {
		return vs[0].([]*LoadBalancerPolicy)[vs[1].(int)]
	}).(LoadBalancerPolicyOutput)
}

type LoadBalancerPolicyMapOutput struct{ *pulumi.OutputState }

func (LoadBalancerPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancerPolicy)(nil)).Elem()
}

func (o LoadBalancerPolicyMapOutput) ToLoadBalancerPolicyMapOutput() LoadBalancerPolicyMapOutput {
	return o
}

func (o LoadBalancerPolicyMapOutput) ToLoadBalancerPolicyMapOutputWithContext(ctx context.Context) LoadBalancerPolicyMapOutput {
	return o
}

func (o LoadBalancerPolicyMapOutput) MapIndex(k pulumi.StringInput) LoadBalancerPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadBalancerPolicy {
		return vs[0].(map[string]*LoadBalancerPolicy)[vs[1].(string)]
	}).(LoadBalancerPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerPolicyInput)(nil)).Elem(), &LoadBalancerPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerPolicyArrayInput)(nil)).Elem(), LoadBalancerPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerPolicyMapInput)(nil)).Elem(), LoadBalancerPolicyMap{})
	pulumi.RegisterOutputType(LoadBalancerPolicyOutput{})
	pulumi.RegisterOutputType(LoadBalancerPolicyArrayOutput{})
	pulumi.RegisterOutputType(LoadBalancerPolicyMapOutput{})
}