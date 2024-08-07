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

__all__ = ['RouteTableArgs', 'RouteTable']

@pulumi.input_type
class RouteTableArgs:
    def __init__(__self__, *,
                 net_id: pulumi.Input[str],
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableTagArgs']]]] = None):
        """
        The set of arguments for constructing a RouteTable resource.
        :param pulumi.Input[str] net_id: The ID of the Net for which you want to create a route table.
        :param pulumi.Input[Sequence[pulumi.Input['RouteTableTagArgs']]] tags: A tag to add to this resource. You can specify this argument several times.
        """
        pulumi.set(__self__, "net_id", net_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> pulumi.Input[str]:
        """
        The ID of the Net for which you want to create a route table.
        """
        return pulumi.get(self, "net_id")

    @net_id.setter
    def net_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "net_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableTagArgs']]]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _RouteTableState:
    def __init__(__self__, *,
                 link_route_tables: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableLinkRouteTableArgs']]]] = None,
                 net_id: Optional[pulumi.Input[str]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 route_propagating_virtual_gateways: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRoutePropagatingVirtualGatewayArgs']]]] = None,
                 route_table_id: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering RouteTable resources.
        :param pulumi.Input[Sequence[pulumi.Input['RouteTableLinkRouteTableArgs']]] link_route_tables: One or more associations between the route table and Subnets.
        :param pulumi.Input[str] net_id: The ID of the Net for which you want to create a route table.
        :param pulumi.Input[Sequence[pulumi.Input['RouteTableRoutePropagatingVirtualGatewayArgs']]] route_propagating_virtual_gateways: Information about virtual gateways propagating routes.
        :param pulumi.Input[str] route_table_id: The ID of the route table.
        :param pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]] routes: One or more routes in the route table.
        :param pulumi.Input[Sequence[pulumi.Input['RouteTableTagArgs']]] tags: A tag to add to this resource. You can specify this argument several times.
        """
        if link_route_tables is not None:
            pulumi.set(__self__, "link_route_tables", link_route_tables)
        if net_id is not None:
            pulumi.set(__self__, "net_id", net_id)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)
        if route_propagating_virtual_gateways is not None:
            pulumi.set(__self__, "route_propagating_virtual_gateways", route_propagating_virtual_gateways)
        if route_table_id is not None:
            pulumi.set(__self__, "route_table_id", route_table_id)
        if routes is not None:
            pulumi.set(__self__, "routes", routes)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="linkRouteTables")
    def link_route_tables(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableLinkRouteTableArgs']]]]:
        """
        One or more associations between the route table and Subnets.
        """
        return pulumi.get(self, "link_route_tables")

    @link_route_tables.setter
    def link_route_tables(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableLinkRouteTableArgs']]]]):
        pulumi.set(self, "link_route_tables", value)

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Net for which you want to create a route table.
        """
        return pulumi.get(self, "net_id")

    @net_id.setter
    def net_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "net_id", value)

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "request_id")

    @request_id.setter
    def request_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_id", value)

    @property
    @pulumi.getter(name="routePropagatingVirtualGateways")
    def route_propagating_virtual_gateways(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRoutePropagatingVirtualGatewayArgs']]]]:
        """
        Information about virtual gateways propagating routes.
        """
        return pulumi.get(self, "route_propagating_virtual_gateways")

    @route_propagating_virtual_gateways.setter
    def route_propagating_virtual_gateways(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRoutePropagatingVirtualGatewayArgs']]]]):
        pulumi.set(self, "route_propagating_virtual_gateways", value)

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the route table.
        """
        return pulumi.get(self, "route_table_id")

    @route_table_id.setter
    def route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_table_id", value)

    @property
    @pulumi.getter
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]]:
        """
        One or more routes in the route table.
        """
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableRouteArgs']]]]):
        pulumi.set(self, "routes", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableTagArgs']]]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RouteTableTagArgs']]]]):
        pulumi.set(self, "tags", value)


class RouteTable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 net_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableTagArgs']]]]] = None,
                 __props__=None):
        """
        Manages a route table.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).

        ## Example Usage
        ### Required resource

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net01 = outscale.Net("net01", ip_range="10.0.0.0/16")
        ```
        ### Create a route table

        ```python
        import pulumi
        import pulumi_outscale as outscale

        route_table01 = outscale.RouteTable("routeTable01", net_id=outscale_net["net01"]["net_id"])
        ```

        ## Import

        A route table can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/routeTable:RouteTable ImportedRouteTable rtb-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] net_id: The ID of the Net for which you want to create a route table.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableTagArgs']]]] tags: A tag to add to this resource. You can specify this argument several times.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteTableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a route table.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Route-Tables.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-routetable).

        ## Example Usage
        ### Required resource

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net01 = outscale.Net("net01", ip_range="10.0.0.0/16")
        ```
        ### Create a route table

        ```python
        import pulumi
        import pulumi_outscale as outscale

        route_table01 = outscale.RouteTable("routeTable01", net_id=outscale_net["net01"]["net_id"])
        ```

        ## Import

        A route table can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/routeTable:RouteTable ImportedRouteTable rtb-12345678
        ```

        :param str resource_name: The name of the resource.
        :param RouteTableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteTableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 net_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableTagArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouteTableArgs.__new__(RouteTableArgs)

            if net_id is None and not opts.urn:
                raise TypeError("Missing required property 'net_id'")
            __props__.__dict__["net_id"] = net_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["link_route_tables"] = None
            __props__.__dict__["request_id"] = None
            __props__.__dict__["route_propagating_virtual_gateways"] = None
            __props__.__dict__["route_table_id"] = None
            __props__.__dict__["routes"] = None
        super(RouteTable, __self__).__init__(
            'outscale:index/routeTable:RouteTable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            link_route_tables: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableLinkRouteTableArgs']]]]] = None,
            net_id: Optional[pulumi.Input[str]] = None,
            request_id: Optional[pulumi.Input[str]] = None,
            route_propagating_virtual_gateways: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRoutePropagatingVirtualGatewayArgs']]]]] = None,
            route_table_id: Optional[pulumi.Input[str]] = None,
            routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRouteArgs']]]]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableTagArgs']]]]] = None) -> 'RouteTable':
        """
        Get an existing RouteTable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableLinkRouteTableArgs']]]] link_route_tables: One or more associations between the route table and Subnets.
        :param pulumi.Input[str] net_id: The ID of the Net for which you want to create a route table.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRoutePropagatingVirtualGatewayArgs']]]] route_propagating_virtual_gateways: Information about virtual gateways propagating routes.
        :param pulumi.Input[str] route_table_id: The ID of the route table.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableRouteArgs']]]] routes: One or more routes in the route table.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RouteTableTagArgs']]]] tags: A tag to add to this resource. You can specify this argument several times.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteTableState.__new__(_RouteTableState)

        __props__.__dict__["link_route_tables"] = link_route_tables
        __props__.__dict__["net_id"] = net_id
        __props__.__dict__["request_id"] = request_id
        __props__.__dict__["route_propagating_virtual_gateways"] = route_propagating_virtual_gateways
        __props__.__dict__["route_table_id"] = route_table_id
        __props__.__dict__["routes"] = routes
        __props__.__dict__["tags"] = tags
        return RouteTable(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="linkRouteTables")
    def link_route_tables(self) -> pulumi.Output[Sequence['outputs.RouteTableLinkRouteTable']]:
        """
        One or more associations between the route table and Subnets.
        """
        return pulumi.get(self, "link_route_tables")

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> pulumi.Output[str]:
        """
        The ID of the Net for which you want to create a route table.
        """
        return pulumi.get(self, "net_id")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="routePropagatingVirtualGateways")
    def route_propagating_virtual_gateways(self) -> pulumi.Output[Sequence['outputs.RouteTableRoutePropagatingVirtualGateway']]:
        """
        Information about virtual gateways propagating routes.
        """
        return pulumi.get(self, "route_propagating_virtual_gateways")

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> pulumi.Output[str]:
        """
        The ID of the route table.
        """
        return pulumi.get(self, "route_table_id")

    @property
    @pulumi.getter
    def routes(self) -> pulumi.Output[Sequence['outputs.RouteTableRoute']]:
        """
        One or more routes in the route table.
        """
        return pulumi.get(self, "routes")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.RouteTableTag']]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

