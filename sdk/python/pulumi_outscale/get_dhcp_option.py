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
    'GetDhcpOptionResult',
    'AwaitableGetDhcpOptionResult',
    'get_dhcp_option',
    'get_dhcp_option_output',
]

@pulumi.output_type
class GetDhcpOptionResult:
    """
    A collection of values returned by getDhcpOption.
    """
    def __init__(__self__, default=None, dhcp_options_set_id=None, domain_name=None, domain_name_servers=None, filters=None, id=None, log_servers=None, ntp_servers=None, request_id=None, tags=None):
        if default and not isinstance(default, bool):
            raise TypeError("Expected argument 'default' to be a bool")
        pulumi.set(__self__, "default", default)
        if dhcp_options_set_id and not isinstance(dhcp_options_set_id, str):
            raise TypeError("Expected argument 'dhcp_options_set_id' to be a str")
        pulumi.set(__self__, "dhcp_options_set_id", dhcp_options_set_id)
        if domain_name and not isinstance(domain_name, str):
            raise TypeError("Expected argument 'domain_name' to be a str")
        pulumi.set(__self__, "domain_name", domain_name)
        if domain_name_servers and not isinstance(domain_name_servers, list):
            raise TypeError("Expected argument 'domain_name_servers' to be a list")
        pulumi.set(__self__, "domain_name_servers", domain_name_servers)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if log_servers and not isinstance(log_servers, list):
            raise TypeError("Expected argument 'log_servers' to be a list")
        pulumi.set(__self__, "log_servers", log_servers)
        if ntp_servers and not isinstance(ntp_servers, list):
            raise TypeError("Expected argument 'ntp_servers' to be a list")
        pulumi.set(__self__, "ntp_servers", ntp_servers)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def default(self) -> bool:
        """
        If true, the DHCP options set is a default one. If false, it is not.
        """
        return pulumi.get(self, "default")

    @property
    @pulumi.getter(name="dhcpOptionsSetId")
    def dhcp_options_set_id(self) -> str:
        """
        The ID of the DHCP options set.
        """
        return pulumi.get(self, "dhcp_options_set_id")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        The domain name.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="domainNameServers")
    def domain_name_servers(self) -> Sequence[str]:
        """
        One or more IPs for the domain name servers.
        """
        return pulumi.get(self, "domain_name_servers")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetDhcpOptionFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="logServers")
    def log_servers(self) -> Sequence[str]:
        """
        One or more IPs for the log servers.
        """
        return pulumi.get(self, "log_servers")

    @property
    @pulumi.getter(name="ntpServers")
    def ntp_servers(self) -> Sequence[str]:
        """
        One or more IPs for the NTP servers.
        """
        return pulumi.get(self, "ntp_servers")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetDhcpOptionTagResult']:
        """
        One or more tags associated with the DHCP options set.
        """
        return pulumi.get(self, "tags")


class AwaitableGetDhcpOptionResult(GetDhcpOptionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDhcpOptionResult(
            default=self.default,
            dhcp_options_set_id=self.dhcp_options_set_id,
            domain_name=self.domain_name,
            domain_name_servers=self.domain_name_servers,
            filters=self.filters,
            id=self.id,
            log_servers=self.log_servers,
            ntp_servers=self.ntp_servers,
            request_id=self.request_id,
            tags=self.tags)


def get_dhcp_option(filters: Optional[Sequence[pulumi.InputType['GetDhcpOptionFilterArgs']]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDhcpOptionResult:
    """
    Provides information about a DHCP option.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-DHCP-Options.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-dhcpoption).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    dhcp_option01 = outscale.get_dhcp_option(filters=[outscale.GetDhcpOptionFilterArgs(
        name="dhcp_options_set_id",
        values=["dopt-12345678"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetDhcpOptionFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getDhcpOption:getDhcpOption', __args__, opts=opts, typ=GetDhcpOptionResult).value

    return AwaitableGetDhcpOptionResult(
        default=pulumi.get(__ret__, 'default'),
        dhcp_options_set_id=pulumi.get(__ret__, 'dhcp_options_set_id'),
        domain_name=pulumi.get(__ret__, 'domain_name'),
        domain_name_servers=pulumi.get(__ret__, 'domain_name_servers'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        log_servers=pulumi.get(__ret__, 'log_servers'),
        ntp_servers=pulumi.get(__ret__, 'ntp_servers'),
        request_id=pulumi.get(__ret__, 'request_id'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_dhcp_option)
def get_dhcp_option_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetDhcpOptionFilterArgs']]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDhcpOptionResult]:
    """
    Provides information about a DHCP option.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-DHCP-Options.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-dhcpoption).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    dhcp_option01 = outscale.get_dhcp_option(filters=[outscale.GetDhcpOptionFilterArgs(
        name="dhcp_options_set_id",
        values=["dopt-12345678"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetDhcpOptionFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...
