# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetLoadBalancerResult',
    'AwaitableGetLoadBalancerResult',
    'get_load_balancer',
    'get_load_balancer_output',
]

@pulumi.output_type
class GetLoadBalancerResult:
    """
    A collection of values returned by getLoadBalancer.
    """
    def __init__(__self__, access_logs=None, application_sticky_cookie_policies=None, backend_vm_ids=None, dns_name=None, filters=None, health_checks=None, id=None, listeners=None, load_balancer_name=None, load_balancer_sticky_cookie_policies=None, load_balancer_type=None, net_id=None, public_ip=None, request_id=None, secured_cookies=None, security_groups=None, source_security_groups=None, subnets=None, subregion_names=None, tags=None):
        if access_logs and not isinstance(access_logs, list):
            raise TypeError("Expected argument 'access_logs' to be a list")
        pulumi.set(__self__, "access_logs", access_logs)
        if application_sticky_cookie_policies and not isinstance(application_sticky_cookie_policies, list):
            raise TypeError("Expected argument 'application_sticky_cookie_policies' to be a list")
        pulumi.set(__self__, "application_sticky_cookie_policies", application_sticky_cookie_policies)
        if backend_vm_ids and not isinstance(backend_vm_ids, list):
            raise TypeError("Expected argument 'backend_vm_ids' to be a list")
        pulumi.set(__self__, "backend_vm_ids", backend_vm_ids)
        if dns_name and not isinstance(dns_name, str):
            raise TypeError("Expected argument 'dns_name' to be a str")
        pulumi.set(__self__, "dns_name", dns_name)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if health_checks and not isinstance(health_checks, list):
            raise TypeError("Expected argument 'health_checks' to be a list")
        pulumi.set(__self__, "health_checks", health_checks)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if listeners and not isinstance(listeners, list):
            raise TypeError("Expected argument 'listeners' to be a list")
        pulumi.set(__self__, "listeners", listeners)
        if load_balancer_name and not isinstance(load_balancer_name, str):
            raise TypeError("Expected argument 'load_balancer_name' to be a str")
        pulumi.set(__self__, "load_balancer_name", load_balancer_name)
        if load_balancer_sticky_cookie_policies and not isinstance(load_balancer_sticky_cookie_policies, list):
            raise TypeError("Expected argument 'load_balancer_sticky_cookie_policies' to be a list")
        pulumi.set(__self__, "load_balancer_sticky_cookie_policies", load_balancer_sticky_cookie_policies)
        if load_balancer_type and not isinstance(load_balancer_type, str):
            raise TypeError("Expected argument 'load_balancer_type' to be a str")
        pulumi.set(__self__, "load_balancer_type", load_balancer_type)
        if net_id and not isinstance(net_id, str):
            raise TypeError("Expected argument 'net_id' to be a str")
        pulumi.set(__self__, "net_id", net_id)
        if public_ip and not isinstance(public_ip, str):
            raise TypeError("Expected argument 'public_ip' to be a str")
        pulumi.set(__self__, "public_ip", public_ip)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if secured_cookies and not isinstance(secured_cookies, bool):
            raise TypeError("Expected argument 'secured_cookies' to be a bool")
        pulumi.set(__self__, "secured_cookies", secured_cookies)
        if security_groups and not isinstance(security_groups, list):
            raise TypeError("Expected argument 'security_groups' to be a list")
        pulumi.set(__self__, "security_groups", security_groups)
        if source_security_groups and not isinstance(source_security_groups, list):
            raise TypeError("Expected argument 'source_security_groups' to be a list")
        pulumi.set(__self__, "source_security_groups", source_security_groups)
        if subnets and not isinstance(subnets, list):
            raise TypeError("Expected argument 'subnets' to be a list")
        pulumi.set(__self__, "subnets", subnets)
        if subregion_names and not isinstance(subregion_names, list):
            raise TypeError("Expected argument 'subregion_names' to be a list")
        pulumi.set(__self__, "subregion_names", subregion_names)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accessLogs")
    def access_logs(self) -> Sequence['outputs.GetLoadBalancerAccessLogResult']:
        """
        Information about access logs.
        """
        return pulumi.get(self, "access_logs")

    @property
    @pulumi.getter(name="applicationStickyCookiePolicies")
    def application_sticky_cookie_policies(self) -> Sequence['outputs.GetLoadBalancerApplicationStickyCookiePolicyResult']:
        """
        The stickiness policies defined for the load balancer.
        """
        return pulumi.get(self, "application_sticky_cookie_policies")

    @property
    @pulumi.getter(name="backendVmIds")
    def backend_vm_ids(self) -> Sequence[str]:
        """
        One or more IDs of back-end VMs for the load balancer.
        """
        return pulumi.get(self, "backend_vm_ids")

    @property
    @pulumi.getter(name="dnsName")
    def dns_name(self) -> str:
        """
        The DNS name of the load balancer.
        """
        return pulumi.get(self, "dns_name")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetLoadBalancerFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter(name="healthChecks")
    def health_checks(self) -> Sequence['outputs.GetLoadBalancerHealthCheckResult']:
        """
        Information about the health check configuration.
        """
        return pulumi.get(self, "health_checks")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def listeners(self) -> Sequence['outputs.GetLoadBalancerListenerResult']:
        """
        The listeners for the load balancer.
        """
        return pulumi.get(self, "listeners")

    @property
    @pulumi.getter(name="loadBalancerName")
    def load_balancer_name(self) -> str:
        """
        The name of the load balancer.
        """
        return pulumi.get(self, "load_balancer_name")

    @property
    @pulumi.getter(name="loadBalancerStickyCookiePolicies")
    def load_balancer_sticky_cookie_policies(self) -> Sequence['outputs.GetLoadBalancerLoadBalancerStickyCookiePolicyResult']:
        """
        The policies defined for the load balancer.
        """
        return pulumi.get(self, "load_balancer_sticky_cookie_policies")

    @property
    @pulumi.getter(name="loadBalancerType")
    def load_balancer_type(self) -> str:
        """
        The type of load balancer. Valid only for load balancers in a Net.<br />
        If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
        If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
        """
        return pulumi.get(self, "load_balancer_type")

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> str:
        """
        The ID of the Net for the load balancer.
        """
        return pulumi.get(self, "net_id")

    @property
    @pulumi.getter(name="publicIp")
    def public_ip(self) -> str:
        """
        (internet-facing only) The public IP associated with the load balancer.
        """
        return pulumi.get(self, "public_ip")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="securedCookies")
    def secured_cookies(self) -> bool:
        """
        Whether secure cookies are enabled for the load balancer.
        """
        return pulumi.get(self, "secured_cookies")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Sequence[str]:
        """
        One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter(name="sourceSecurityGroups")
    def source_security_groups(self) -> Sequence['outputs.GetLoadBalancerSourceSecurityGroupResult']:
        """
        Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br />
        To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
        """
        return pulumi.get(self, "source_security_groups")

    @property
    @pulumi.getter
    def subnets(self) -> Sequence[str]:
        """
        The ID of the Subnet in which the load balancer was created.
        """
        return pulumi.get(self, "subnets")

    @property
    @pulumi.getter(name="subregionNames")
    def subregion_names(self) -> Sequence[str]:
        """
        The ID of the Subregion in which the load balancer was created.
        """
        return pulumi.get(self, "subregion_names")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetLoadBalancerTagResult']:
        """
        One or more tags associated with the load balancer.
        """
        return pulumi.get(self, "tags")


class AwaitableGetLoadBalancerResult(GetLoadBalancerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLoadBalancerResult(
            access_logs=self.access_logs,
            application_sticky_cookie_policies=self.application_sticky_cookie_policies,
            backend_vm_ids=self.backend_vm_ids,
            dns_name=self.dns_name,
            filters=self.filters,
            health_checks=self.health_checks,
            id=self.id,
            listeners=self.listeners,
            load_balancer_name=self.load_balancer_name,
            load_balancer_sticky_cookie_policies=self.load_balancer_sticky_cookie_policies,
            load_balancer_type=self.load_balancer_type,
            net_id=self.net_id,
            public_ip=self.public_ip,
            request_id=self.request_id,
            secured_cookies=self.secured_cookies,
            security_groups=self.security_groups,
            source_security_groups=self.source_security_groups,
            subnets=self.subnets,
            subregion_names=self.subregion_names,
            tags=self.tags)


def get_load_balancer(access_logs: Optional[Sequence[pulumi.InputType['GetLoadBalancerAccessLogArgs']]] = None,
                      backend_vm_ids: Optional[Sequence[str]] = None,
                      dns_name: Optional[str] = None,
                      filters: Optional[Sequence[pulumi.InputType['GetLoadBalancerFilterArgs']]] = None,
                      health_checks: Optional[Sequence[pulumi.InputType['GetLoadBalancerHealthCheckArgs']]] = None,
                      listeners: Optional[Sequence[pulumi.InputType['GetLoadBalancerListenerArgs']]] = None,
                      load_balancer_name: Optional[str] = None,
                      load_balancer_type: Optional[str] = None,
                      net_id: Optional[str] = None,
                      security_groups: Optional[Sequence[str]] = None,
                      subnets: Optional[Sequence[str]] = None,
                      tags: Optional[Sequence[pulumi.InputType['GetLoadBalancerTagArgs']]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLoadBalancerResult:
    """
    Provides information about a load balancer.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancer).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    load_balancer01 = outscale.get_load_balancer(filters=[outscale.GetLoadBalancerFilterArgs(
        name="load_balancer_names",
        values=["load_balancer01"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetLoadBalancerAccessLogArgs']] access_logs: Information about access logs.
    :param Sequence[str] backend_vm_ids: One or more IDs of back-end VMs for the load balancer.
    :param str dns_name: The DNS name of the load balancer.
    :param Sequence[pulumi.InputType['GetLoadBalancerFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param Sequence[pulumi.InputType['GetLoadBalancerHealthCheckArgs']] health_checks: Information about the health check configuration.
    :param Sequence[pulumi.InputType['GetLoadBalancerListenerArgs']] listeners: The listeners for the load balancer.
    :param str load_balancer_name: The name of the load balancer.
    :param str load_balancer_type: The type of load balancer. Valid only for load balancers in a Net.<br />
           If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
           If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
    :param str net_id: The ID of the Net for the load balancer.
    :param Sequence[str] security_groups: One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
    :param Sequence[str] subnets: The ID of the Subnet in which the load balancer was created.
    :param Sequence[pulumi.InputType['GetLoadBalancerTagArgs']] tags: One or more tags associated with the load balancer.
    """
    __args__ = dict()
    __args__['accessLogs'] = access_logs
    __args__['backendVmIds'] = backend_vm_ids
    __args__['dnsName'] = dns_name
    __args__['filters'] = filters
    __args__['healthChecks'] = health_checks
    __args__['listeners'] = listeners
    __args__['loadBalancerName'] = load_balancer_name
    __args__['loadBalancerType'] = load_balancer_type
    __args__['netId'] = net_id
    __args__['securityGroups'] = security_groups
    __args__['subnets'] = subnets
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getLoadBalancer:getLoadBalancer', __args__, opts=opts, typ=GetLoadBalancerResult).value

    return AwaitableGetLoadBalancerResult(
        access_logs=pulumi.get(__ret__, 'access_logs'),
        application_sticky_cookie_policies=pulumi.get(__ret__, 'application_sticky_cookie_policies'),
        backend_vm_ids=pulumi.get(__ret__, 'backend_vm_ids'),
        dns_name=pulumi.get(__ret__, 'dns_name'),
        filters=pulumi.get(__ret__, 'filters'),
        health_checks=pulumi.get(__ret__, 'health_checks'),
        id=pulumi.get(__ret__, 'id'),
        listeners=pulumi.get(__ret__, 'listeners'),
        load_balancer_name=pulumi.get(__ret__, 'load_balancer_name'),
        load_balancer_sticky_cookie_policies=pulumi.get(__ret__, 'load_balancer_sticky_cookie_policies'),
        load_balancer_type=pulumi.get(__ret__, 'load_balancer_type'),
        net_id=pulumi.get(__ret__, 'net_id'),
        public_ip=pulumi.get(__ret__, 'public_ip'),
        request_id=pulumi.get(__ret__, 'request_id'),
        secured_cookies=pulumi.get(__ret__, 'secured_cookies'),
        security_groups=pulumi.get(__ret__, 'security_groups'),
        source_security_groups=pulumi.get(__ret__, 'source_security_groups'),
        subnets=pulumi.get(__ret__, 'subnets'),
        subregion_names=pulumi.get(__ret__, 'subregion_names'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_load_balancer)
def get_load_balancer_output(access_logs: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetLoadBalancerAccessLogArgs']]]]] = None,
                             backend_vm_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                             dns_name: Optional[pulumi.Input[Optional[str]]] = None,
                             filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetLoadBalancerFilterArgs']]]]] = None,
                             health_checks: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetLoadBalancerHealthCheckArgs']]]]] = None,
                             listeners: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetLoadBalancerListenerArgs']]]]] = None,
                             load_balancer_name: Optional[pulumi.Input[Optional[str]]] = None,
                             load_balancer_type: Optional[pulumi.Input[Optional[str]]] = None,
                             net_id: Optional[pulumi.Input[Optional[str]]] = None,
                             security_groups: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                             subnets: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                             tags: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetLoadBalancerTagArgs']]]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLoadBalancerResult]:
    """
    Provides information about a load balancer.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Load-Balancers.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-loadbalancer).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    load_balancer01 = outscale.get_load_balancer(filters=[outscale.GetLoadBalancerFilterArgs(
        name="load_balancer_names",
        values=["load_balancer01"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetLoadBalancerAccessLogArgs']] access_logs: Information about access logs.
    :param Sequence[str] backend_vm_ids: One or more IDs of back-end VMs for the load balancer.
    :param str dns_name: The DNS name of the load balancer.
    :param Sequence[pulumi.InputType['GetLoadBalancerFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param Sequence[pulumi.InputType['GetLoadBalancerHealthCheckArgs']] health_checks: Information about the health check configuration.
    :param Sequence[pulumi.InputType['GetLoadBalancerListenerArgs']] listeners: The listeners for the load balancer.
    :param str load_balancer_name: The name of the load balancer.
    :param str load_balancer_type: The type of load balancer. Valid only for load balancers in a Net.<br />
           If `load_balancer_type` is `internet-facing`, the load balancer has a public DNS name that resolves to a public IP.<br />
           If `load_balancer_type` is `internal`, the load balancer has a public DNS name that resolves to a private IP.
    :param str net_id: The ID of the Net for the load balancer.
    :param Sequence[str] security_groups: One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
    :param Sequence[str] subnets: The ID of the Subnet in which the load balancer was created.
    :param Sequence[pulumi.InputType['GetLoadBalancerTagArgs']] tags: One or more tags associated with the load balancer.
    """
    ...
