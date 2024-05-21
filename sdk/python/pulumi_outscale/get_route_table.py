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
    'GetRouteTableResult',
    'AwaitableGetRouteTableResult',
    'get_route_table',
    'get_route_table_output',
]

@pulumi.output_type
class GetRouteTableResult:
    """
    A collection of values returned by getRouteTable.
    """
    def __init__(__self__, filters=None, id=None, link_route_tables=None, net_id=None, request_id=None, route_propagating_virtual_gateways=None, route_table_id=None, routes=None, tags=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if link_route_tables and not isinstance(link_route_tables, list):
            raise TypeError("Expected argument 'link_route_tables' to be a list")
        pulumi.set(__self__, "link_route_tables", link_route_tables)
        if net_id and not isinstance(net_id, str):
            raise TypeError("Expected argument 'net_id' to be a str")
        pulumi.set(__self__, "net_id", net_id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if route_propagating_virtual_gateways and not isinstance(route_propagating_virtual_gateways, list):
            raise TypeError("Expected argument 'route_propagating_virtual_gateways' to be a list")
        pulumi.set(__self__, "route_propagating_virtual_gateways", route_propagating_virtual_gateways)
        if route_table_id and not isinstance(route_table_id, str):
            raise TypeError("Expected argument 'route_table_id' to be a str")
        pulumi.set(__self__, "route_table_id", route_table_id)
        if routes and not isinstance(routes, list):
            raise TypeError("Expected argument 'routes' to be a list")
        pulumi.set(__self__, "routes", routes)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetRouteTableFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="linkRouteTables")
    def link_route_tables(self) -> Sequence['outputs.GetRouteTableLinkRouteTableResult']:
        """
        One or more associations between the route table and Subnets.
        """
        return pulumi.get(self, "link_route_tables")

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> str:
        """
        The ID of the Net for the route table.
        """
        return pulumi.get(self, "net_id")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="routePropagatingVirtualGateways")
    def route_propagating_virtual_gateways(self) -> Sequence['outputs.GetRouteTableRoutePropagatingVirtualGatewayResult']:
        """
        Information about virtual gateways propagating routes.
        """
        return pulumi.get(self, "route_propagating_virtual_gateways")

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> str:
        """
        The ID of the route table.
        """
        return pulumi.get(self, "route_table_id")

    @property
    @pulumi.getter
    def routes(self) -> Sequence['outputs.GetRouteTableRouteResult']:
        """
        One or more routes in the route table.
        """
        return pulumi.get(self, "routes")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetRouteTableTagResult']:
        """
        One or more tags associated with the route table.
        """
        return pulumi.get(self, "tags")


class AwaitableGetRouteTableResult(GetRouteTableResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRouteTableResult(
            filters=self.filters,
            id=self.id,
            link_route_tables=self.link_route_tables,
            net_id=self.net_id,
            request_id=self.request_id,
            route_propagating_virtual_gateways=self.route_propagating_virtual_gateways,
            route_table_id=self.route_table_id,
            routes=self.routes,
            tags=self.tags)


def get_route_table(filters: Optional[Sequence[pulumi.InputType['GetRouteTableFilterArgs']]] = None,
                    route_table_id: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRouteTableResult:
    """
    Provides information about a route table.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    route_table01 = outscale.get_route_table(filters=[outscale.GetRouteTableFilterArgs(
        name="route_table_ids",
        values=["rtb-12345678"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetRouteTableFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str route_table_id: The ID of the route table.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['routeTableId'] = route_table_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getRouteTable:getRouteTable', __args__, opts=opts, typ=GetRouteTableResult).value

    return AwaitableGetRouteTableResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        link_route_tables=pulumi.get(__ret__, 'link_route_tables'),
        net_id=pulumi.get(__ret__, 'net_id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        route_propagating_virtual_gateways=pulumi.get(__ret__, 'route_propagating_virtual_gateways'),
        route_table_id=pulumi.get(__ret__, 'route_table_id'),
        routes=pulumi.get(__ret__, 'routes'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_route_table)
def get_route_table_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetRouteTableFilterArgs']]]]] = None,
                           route_table_id: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRouteTableResult]:
    """
    Provides information about a route table.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    route_table01 = outscale.get_route_table(filters=[outscale.GetRouteTableFilterArgs(
        name="route_table_ids",
        values=["rtb-12345678"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetRouteTableFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str route_table_id: The ID of the route table.
    """
    ...