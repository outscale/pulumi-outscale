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
    'GetNetAccessPointResult',
    'AwaitableGetNetAccessPointResult',
    'get_net_access_point',
    'get_net_access_point_output',
]

@pulumi.output_type
class GetNetAccessPointResult:
    """
    A collection of values returned by getNetAccessPoint.
    """
    def __init__(__self__, filters=None, id=None, net_access_point_id=None, net_id=None, request_id=None, route_table_ids=None, service_name=None, state=None, tags=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if net_access_point_id and not isinstance(net_access_point_id, str):
            raise TypeError("Expected argument 'net_access_point_id' to be a str")
        pulumi.set(__self__, "net_access_point_id", net_access_point_id)
        if net_id and not isinstance(net_id, str):
            raise TypeError("Expected argument 'net_id' to be a str")
        pulumi.set(__self__, "net_id", net_id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if route_table_ids and not isinstance(route_table_ids, list):
            raise TypeError("Expected argument 'route_table_ids' to be a list")
        pulumi.set(__self__, "route_table_ids", route_table_ids)
        if service_name and not isinstance(service_name, str):
            raise TypeError("Expected argument 'service_name' to be a str")
        pulumi.set(__self__, "service_name", service_name)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetNetAccessPointFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="netAccessPointId")
    def net_access_point_id(self) -> str:
        """
        The ID of the Net access point.
        """
        return pulumi.get(self, "net_access_point_id")

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> str:
        """
        The ID of the Net with which the Net access point is associated.
        """
        return pulumi.get(self, "net_id")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="routeTableIds")
    def route_table_ids(self) -> Sequence[str]:
        """
        The ID of the route tables associated with the Net access point.
        """
        return pulumi.get(self, "route_table_ids")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> str:
        """
        The name of the service with which the Net access point is associated.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        The state of the Net access point (`pending` \\| `available` \\| `deleting` \\| `deleted`).
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetNetAccessPointTagResult']:
        """
        One or more tags associated with the Net access point.
        """
        return pulumi.get(self, "tags")


class AwaitableGetNetAccessPointResult(GetNetAccessPointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetAccessPointResult(
            filters=self.filters,
            id=self.id,
            net_access_point_id=self.net_access_point_id,
            net_id=self.net_id,
            request_id=self.request_id,
            route_table_ids=self.route_table_ids,
            service_name=self.service_name,
            state=self.state,
            tags=self.tags)


def get_net_access_point(filters: Optional[Sequence[pulumi.InputType['GetNetAccessPointFilterArgs']]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetAccessPointResult:
    """
    Provides information about a Net access point.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Endpoints.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netaccesspoint).

    ## Example Usage
    ### List a Net access point

    ```python
    import pulumi
    import pulumi_outscale as outscale

    net_access_point01 = outscale.get_net_access_point(filters=[outscale.GetNetAccessPointFilterArgs(
        name="net_access_point_ids",
        values=["vpce-12345678"],
    )])
    ```
    ### List a Net access point according to its Net and state

    ```python
    import pulumi
    import pulumi_outscale as outscale

    net_access_point02 = outscale.get_net_access_point(filters=[
        outscale.GetNetAccessPointFilterArgs(
            name="net_ids",
            values=["vpc-12345678"],
        ),
        outscale.GetNetAccessPointFilterArgs(
            name="states",
            values=["available"],
        ),
    ])
    ```


    :param Sequence[pulumi.InputType['GetNetAccessPointFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getNetAccessPoint:getNetAccessPoint', __args__, opts=opts, typ=GetNetAccessPointResult).value

    return AwaitableGetNetAccessPointResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        net_access_point_id=pulumi.get(__ret__, 'net_access_point_id'),
        net_id=pulumi.get(__ret__, 'net_id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        route_table_ids=pulumi.get(__ret__, 'route_table_ids'),
        service_name=pulumi.get(__ret__, 'service_name'),
        state=pulumi.get(__ret__, 'state'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_net_access_point)
def get_net_access_point_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetNetAccessPointFilterArgs']]]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNetAccessPointResult]:
    """
    Provides information about a Net access point.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Endpoints.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netaccesspoint).

    ## Example Usage
    ### List a Net access point

    ```python
    import pulumi
    import pulumi_outscale as outscale

    net_access_point01 = outscale.get_net_access_point(filters=[outscale.GetNetAccessPointFilterArgs(
        name="net_access_point_ids",
        values=["vpce-12345678"],
    )])
    ```
    ### List a Net access point according to its Net and state

    ```python
    import pulumi
    import pulumi_outscale as outscale

    net_access_point02 = outscale.get_net_access_point(filters=[
        outscale.GetNetAccessPointFilterArgs(
            name="net_ids",
            values=["vpc-12345678"],
        ),
        outscale.GetNetAccessPointFilterArgs(
            name="states",
            values=["available"],
        ),
    ])
    ```


    :param Sequence[pulumi.InputType['GetNetAccessPointFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...
