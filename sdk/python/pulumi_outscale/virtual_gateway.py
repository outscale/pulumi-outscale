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

__all__ = ['VirtualGatewayArgs', 'VirtualGateway']

@pulumi.input_type
class VirtualGatewayArgs:
    def __init__(__self__, *,
                 connection_type: pulumi.Input[str],
                 net_to_virtual_gateway_links: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayNetToVirtualGatewayLinkArgs']]]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayTagArgs']]]] = None,
                 virtual_gateway_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VirtualGateway resource.
        :param pulumi.Input[str] connection_type: The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
        :param pulumi.Input[Sequence[pulumi.Input['VirtualGatewayNetToVirtualGatewayLinkArgs']]] net_to_virtual_gateway_links: The Net to which the virtual gateway is attached.
        :param pulumi.Input[str] state: The state of the virtual gateway (`pending` \\| `available` \\| `deleting` \\| `deleted`).
        :param pulumi.Input[Sequence[pulumi.Input['VirtualGatewayTagArgs']]] tags: A tag to add to this resource. You can specify this argument several times.
        :param pulumi.Input[str] virtual_gateway_id: The ID of the virtual gateway.
        """
        pulumi.set(__self__, "connection_type", connection_type)
        if net_to_virtual_gateway_links is not None:
            pulumi.set(__self__, "net_to_virtual_gateway_links", net_to_virtual_gateway_links)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if virtual_gateway_id is not None:
            pulumi.set(__self__, "virtual_gateway_id", virtual_gateway_id)

    @property
    @pulumi.getter(name="connectionType")
    def connection_type(self) -> pulumi.Input[str]:
        """
        The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
        """
        return pulumi.get(self, "connection_type")

    @connection_type.setter
    def connection_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "connection_type", value)

    @property
    @pulumi.getter(name="netToVirtualGatewayLinks")
    def net_to_virtual_gateway_links(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayNetToVirtualGatewayLinkArgs']]]]:
        """
        The Net to which the virtual gateway is attached.
        """
        return pulumi.get(self, "net_to_virtual_gateway_links")

    @net_to_virtual_gateway_links.setter
    def net_to_virtual_gateway_links(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayNetToVirtualGatewayLinkArgs']]]]):
        pulumi.set(self, "net_to_virtual_gateway_links", value)

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "request_id")

    @request_id.setter
    def request_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the virtual gateway (`pending` \\| `available` \\| `deleting` \\| `deleted`).
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayTagArgs']]]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="virtualGatewayId")
    def virtual_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the virtual gateway.
        """
        return pulumi.get(self, "virtual_gateway_id")

    @virtual_gateway_id.setter
    def virtual_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "virtual_gateway_id", value)


@pulumi.input_type
class _VirtualGatewayState:
    def __init__(__self__, *,
                 connection_type: Optional[pulumi.Input[str]] = None,
                 net_to_virtual_gateway_links: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayNetToVirtualGatewayLinkArgs']]]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayTagArgs']]]] = None,
                 virtual_gateway_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VirtualGateway resources.
        :param pulumi.Input[str] connection_type: The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
        :param pulumi.Input[Sequence[pulumi.Input['VirtualGatewayNetToVirtualGatewayLinkArgs']]] net_to_virtual_gateway_links: The Net to which the virtual gateway is attached.
        :param pulumi.Input[str] state: The state of the virtual gateway (`pending` \\| `available` \\| `deleting` \\| `deleted`).
        :param pulumi.Input[Sequence[pulumi.Input['VirtualGatewayTagArgs']]] tags: A tag to add to this resource. You can specify this argument several times.
        :param pulumi.Input[str] virtual_gateway_id: The ID of the virtual gateway.
        """
        if connection_type is not None:
            pulumi.set(__self__, "connection_type", connection_type)
        if net_to_virtual_gateway_links is not None:
            pulumi.set(__self__, "net_to_virtual_gateway_links", net_to_virtual_gateway_links)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if virtual_gateway_id is not None:
            pulumi.set(__self__, "virtual_gateway_id", virtual_gateway_id)

    @property
    @pulumi.getter(name="connectionType")
    def connection_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
        """
        return pulumi.get(self, "connection_type")

    @connection_type.setter
    def connection_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_type", value)

    @property
    @pulumi.getter(name="netToVirtualGatewayLinks")
    def net_to_virtual_gateway_links(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayNetToVirtualGatewayLinkArgs']]]]:
        """
        The Net to which the virtual gateway is attached.
        """
        return pulumi.get(self, "net_to_virtual_gateway_links")

    @net_to_virtual_gateway_links.setter
    def net_to_virtual_gateway_links(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayNetToVirtualGatewayLinkArgs']]]]):
        pulumi.set(self, "net_to_virtual_gateway_links", value)

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "request_id")

    @request_id.setter
    def request_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the virtual gateway (`pending` \\| `available` \\| `deleting` \\| `deleted`).
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayTagArgs']]]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualGatewayTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="virtualGatewayId")
    def virtual_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the virtual gateway.
        """
        return pulumi.get(self, "virtual_gateway_id")

    @virtual_gateway_id.setter
    def virtual_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "virtual_gateway_id", value)


class VirtualGateway(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_type: Optional[pulumi.Input[str]] = None,
                 net_to_virtual_gateway_links: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayNetToVirtualGatewayLinkArgs']]]]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayTagArgs']]]]] = None,
                 virtual_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a virtual gateway.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Virtual-Private-Gateways.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-virtualgateway).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_outscale as outscale

        virtual_gateway01 = outscale.VirtualGateway("virtualGateway01",
            connection_type="ipsec.1",
            tags=[outscale.VirtualGatewayTagArgs(
                key="name",
                value="terraform-virtual-gateway",
            )])
        ```

        ## Import

        A virtual gateway can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/virtualGateway:VirtualGateway ImportedVirtualGateway vgw-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_type: The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayNetToVirtualGatewayLinkArgs']]]] net_to_virtual_gateway_links: The Net to which the virtual gateway is attached.
        :param pulumi.Input[str] state: The state of the virtual gateway (`pending` \\| `available` \\| `deleting` \\| `deleted`).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayTagArgs']]]] tags: A tag to add to this resource. You can specify this argument several times.
        :param pulumi.Input[str] virtual_gateway_id: The ID of the virtual gateway.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VirtualGatewayArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a virtual gateway.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Virtual-Private-Gateways.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-virtualgateway).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_outscale as outscale

        virtual_gateway01 = outscale.VirtualGateway("virtualGateway01",
            connection_type="ipsec.1",
            tags=[outscale.VirtualGatewayTagArgs(
                key="name",
                value="terraform-virtual-gateway",
            )])
        ```

        ## Import

        A virtual gateway can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/virtualGateway:VirtualGateway ImportedVirtualGateway vgw-12345678
        ```

        :param str resource_name: The name of the resource.
        :param VirtualGatewayArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VirtualGatewayArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_type: Optional[pulumi.Input[str]] = None,
                 net_to_virtual_gateway_links: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayNetToVirtualGatewayLinkArgs']]]]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayTagArgs']]]]] = None,
                 virtual_gateway_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VirtualGatewayArgs.__new__(VirtualGatewayArgs)

            if connection_type is None and not opts.urn:
                raise TypeError("Missing required property 'connection_type'")
            __props__.__dict__["connection_type"] = connection_type
            __props__.__dict__["net_to_virtual_gateway_links"] = net_to_virtual_gateway_links
            __props__.__dict__["request_id"] = request_id
            __props__.__dict__["state"] = state
            __props__.__dict__["tags"] = tags
            __props__.__dict__["virtual_gateway_id"] = virtual_gateway_id
        super(VirtualGateway, __self__).__init__(
            'outscale:index/virtualGateway:VirtualGateway',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connection_type: Optional[pulumi.Input[str]] = None,
            net_to_virtual_gateway_links: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayNetToVirtualGatewayLinkArgs']]]]] = None,
            request_id: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayTagArgs']]]]] = None,
            virtual_gateway_id: Optional[pulumi.Input[str]] = None) -> 'VirtualGateway':
        """
        Get an existing VirtualGateway resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_type: The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayNetToVirtualGatewayLinkArgs']]]] net_to_virtual_gateway_links: The Net to which the virtual gateway is attached.
        :param pulumi.Input[str] state: The state of the virtual gateway (`pending` \\| `available` \\| `deleting` \\| `deleted`).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VirtualGatewayTagArgs']]]] tags: A tag to add to this resource. You can specify this argument several times.
        :param pulumi.Input[str] virtual_gateway_id: The ID of the virtual gateway.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VirtualGatewayState.__new__(_VirtualGatewayState)

        __props__.__dict__["connection_type"] = connection_type
        __props__.__dict__["net_to_virtual_gateway_links"] = net_to_virtual_gateway_links
        __props__.__dict__["request_id"] = request_id
        __props__.__dict__["state"] = state
        __props__.__dict__["tags"] = tags
        __props__.__dict__["virtual_gateway_id"] = virtual_gateway_id
        return VirtualGateway(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionType")
    def connection_type(self) -> pulumi.Output[str]:
        """
        The type of VPN connection supported by the virtual gateway (only `ipsec.1` is supported).
        """
        return pulumi.get(self, "connection_type")

    @property
    @pulumi.getter(name="netToVirtualGatewayLinks")
    def net_to_virtual_gateway_links(self) -> pulumi.Output[Sequence['outputs.VirtualGatewayNetToVirtualGatewayLink']]:
        """
        The Net to which the virtual gateway is attached.
        """
        return pulumi.get(self, "net_to_virtual_gateway_links")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The state of the virtual gateway (`pending` \\| `available` \\| `deleting` \\| `deleted`).
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.VirtualGatewayTag']]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="virtualGatewayId")
    def virtual_gateway_id(self) -> pulumi.Output[str]:
        """
        The ID of the virtual gateway.
        """
        return pulumi.get(self, "virtual_gateway_id")

