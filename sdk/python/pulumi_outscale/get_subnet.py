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
    'GetSubnetResult',
    'AwaitableGetSubnetResult',
    'get_subnet',
    'get_subnet_output',
]

@pulumi.output_type
class GetSubnetResult:
    """
    A collection of values returned by getSubnet.
    """
    def __init__(__self__, available_ips_count=None, filters=None, id=None, ip_range=None, map_public_ip_on_launch=None, net_id=None, request_id=None, state=None, subnet_id=None, subregion_name=None, tags=None):
        if available_ips_count and not isinstance(available_ips_count, int):
            raise TypeError("Expected argument 'available_ips_count' to be a int")
        pulumi.set(__self__, "available_ips_count", available_ips_count)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_range and not isinstance(ip_range, str):
            raise TypeError("Expected argument 'ip_range' to be a str")
        pulumi.set(__self__, "ip_range", ip_range)
        if map_public_ip_on_launch and not isinstance(map_public_ip_on_launch, bool):
            raise TypeError("Expected argument 'map_public_ip_on_launch' to be a bool")
        pulumi.set(__self__, "map_public_ip_on_launch", map_public_ip_on_launch)
        if net_id and not isinstance(net_id, str):
            raise TypeError("Expected argument 'net_id' to be a str")
        pulumi.set(__self__, "net_id", net_id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if subnet_id and not isinstance(subnet_id, str):
            raise TypeError("Expected argument 'subnet_id' to be a str")
        pulumi.set(__self__, "subnet_id", subnet_id)
        if subregion_name and not isinstance(subregion_name, str):
            raise TypeError("Expected argument 'subregion_name' to be a str")
        pulumi.set(__self__, "subregion_name", subregion_name)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="availableIpsCount")
    def available_ips_count(self) -> int:
        """
        The number of available IPs in the Subnets.
        """
        return pulumi.get(self, "available_ips_count")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetSubnetFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> str:
        """
        The IP range in the Subnet, in CIDR notation (for example, `10.0.0.0/16`).
        """
        return pulumi.get(self, "ip_range")

    @property
    @pulumi.getter(name="mapPublicIpOnLaunch")
    def map_public_ip_on_launch(self) -> bool:
        """
        If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet.
        """
        return pulumi.get(self, "map_public_ip_on_launch")

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> str:
        """
        The ID of the Net in which the Subnet is.
        """
        return pulumi.get(self, "net_id")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        The state of the Subnet (`pending` \\| `available` \\| `deleted`).
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> str:
        """
        The ID of the Subnet.
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter(name="subregionName")
    def subregion_name(self) -> str:
        """
        The name of the Subregion in which the Subnet is located.
        """
        return pulumi.get(self, "subregion_name")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetSubnetTagResult']:
        """
        One or more tags associated with the Subnet.
        """
        return pulumi.get(self, "tags")


class AwaitableGetSubnetResult(GetSubnetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubnetResult(
            available_ips_count=self.available_ips_count,
            filters=self.filters,
            id=self.id,
            ip_range=self.ip_range,
            map_public_ip_on_launch=self.map_public_ip_on_launch,
            net_id=self.net_id,
            request_id=self.request_id,
            state=self.state,
            subnet_id=self.subnet_id,
            subregion_name=self.subregion_name,
            tags=self.tags)


def get_subnet(filters: Optional[Sequence[pulumi.InputType['GetSubnetFilterArgs']]] = None,
               subnet_id: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubnetResult:
    """
    Provides information about a Subnet.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-subnet).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    subnet01 = outscale.get_subnet(filters=[outscale.GetSubnetFilterArgs(
        name="net_ids",
        values=["vpc-12345678"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetSubnetFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str subnet_id: The ID of the Subnet.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['subnetId'] = subnet_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getSubnet:getSubnet', __args__, opts=opts, typ=GetSubnetResult).value

    return AwaitableGetSubnetResult(
        available_ips_count=pulumi.get(__ret__, 'available_ips_count'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        ip_range=pulumi.get(__ret__, 'ip_range'),
        map_public_ip_on_launch=pulumi.get(__ret__, 'map_public_ip_on_launch'),
        net_id=pulumi.get(__ret__, 'net_id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        state=pulumi.get(__ret__, 'state'),
        subnet_id=pulumi.get(__ret__, 'subnet_id'),
        subregion_name=pulumi.get(__ret__, 'subregion_name'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_subnet)
def get_subnet_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetSubnetFilterArgs']]]]] = None,
                      subnet_id: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSubnetResult]:
    """
    Provides information about a Subnet.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPCs.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-subnet).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    subnet01 = outscale.get_subnet(filters=[outscale.GetSubnetFilterArgs(
        name="net_ids",
        values=["vpc-12345678"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetSubnetFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str subnet_id: The ID of the Subnet.
    """
    ...
