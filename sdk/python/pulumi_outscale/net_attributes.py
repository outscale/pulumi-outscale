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

__all__ = ['NetAttributesArgs', 'NetAttributes']

@pulumi.input_type
class NetAttributesArgs:
    def __init__(__self__, *,
                 net_id: pulumi.Input[str],
                 dhcp_options_set_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NetAttributes resource.
        :param pulumi.Input[str] net_id: The ID of the Net.
        :param pulumi.Input[str] dhcp_options_set_id: The ID of the DHCP options set (or `default` if you want to associate the default one).
        """
        pulumi.set(__self__, "net_id", net_id)
        if dhcp_options_set_id is not None:
            pulumi.set(__self__, "dhcp_options_set_id", dhcp_options_set_id)

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> pulumi.Input[str]:
        """
        The ID of the Net.
        """
        return pulumi.get(self, "net_id")

    @net_id.setter
    def net_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "net_id", value)

    @property
    @pulumi.getter(name="dhcpOptionsSetId")
    def dhcp_options_set_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the DHCP options set (or `default` if you want to associate the default one).
        """
        return pulumi.get(self, "dhcp_options_set_id")

    @dhcp_options_set_id.setter
    def dhcp_options_set_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_options_set_id", value)


@pulumi.input_type
class _NetAttributesState:
    def __init__(__self__, *,
                 dhcp_options_set_id: Optional[pulumi.Input[str]] = None,
                 ip_range: Optional[pulumi.Input[str]] = None,
                 net_id: Optional[pulumi.Input[str]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['NetAttributesTagArgs']]]] = None,
                 tenancy: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetAttributes resources.
        :param pulumi.Input[str] dhcp_options_set_id: The ID of the DHCP options set (or `default` if you want to associate the default one).
        :param pulumi.Input[str] ip_range: The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
        :param pulumi.Input[str] net_id: The ID of the Net.
        :param pulumi.Input[str] state: The state of the Net (`pending` \\| `available` \\| `deleted`).
        :param pulumi.Input[Sequence[pulumi.Input['NetAttributesTagArgs']]] tags: One or more tags associated with the Net.
        :param pulumi.Input[str] tenancy: The VM tenancy in a Net.
        """
        if dhcp_options_set_id is not None:
            pulumi.set(__self__, "dhcp_options_set_id", dhcp_options_set_id)
        if ip_range is not None:
            pulumi.set(__self__, "ip_range", ip_range)
        if net_id is not None:
            pulumi.set(__self__, "net_id", net_id)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tenancy is not None:
            pulumi.set(__self__, "tenancy", tenancy)

    @property
    @pulumi.getter(name="dhcpOptionsSetId")
    def dhcp_options_set_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the DHCP options set (or `default` if you want to associate the default one).
        """
        return pulumi.get(self, "dhcp_options_set_id")

    @dhcp_options_set_id.setter
    def dhcp_options_set_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_options_set_id", value)

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> Optional[pulumi.Input[str]]:
        """
        The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
        """
        return pulumi.get(self, "ip_range")

    @ip_range.setter
    def ip_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_range", value)

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Net.
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
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the Net (`pending` \\| `available` \\| `deleted`).
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetAttributesTagArgs']]]]:
        """
        One or more tags associated with the Net.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetAttributesTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def tenancy(self) -> Optional[pulumi.Input[str]]:
        """
        The VM tenancy in a Net.
        """
        return pulumi.get(self, "tenancy")

    @tenancy.setter
    def tenancy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenancy", value)


class NetAttributes(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dhcp_options_set_id: Optional[pulumi.Input[str]] = None,
                 net_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages the attributes of a Net.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-DHCP-Options.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updatenet).

        ## Example Usage
        ### Required resource

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net01 = outscale.Net("net01", ip_range="10.0.0.0/16")
        ```
        ### Associate a DHCP option set to a Net

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net_attributes01 = outscale.NetAttributes("netAttributes01",
            net_id=outscale_net["net01"]["net_id"],
            dhcp_options_set_id=var["dhcp_options_set_id"])
        ```

        ## Import

        A Net attribute can be imported using the Net ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/netAttributes:NetAttributes ImportedNet vpc-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dhcp_options_set_id: The ID of the DHCP options set (or `default` if you want to associate the default one).
        :param pulumi.Input[str] net_id: The ID of the Net.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetAttributesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages the attributes of a Net.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-DHCP-Options.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#updatenet).

        ## Example Usage
        ### Required resource

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net01 = outscale.Net("net01", ip_range="10.0.0.0/16")
        ```
        ### Associate a DHCP option set to a Net

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net_attributes01 = outscale.NetAttributes("netAttributes01",
            net_id=outscale_net["net01"]["net_id"],
            dhcp_options_set_id=var["dhcp_options_set_id"])
        ```

        ## Import

        A Net attribute can be imported using the Net ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/netAttributes:NetAttributes ImportedNet vpc-12345678
        ```

        :param str resource_name: The name of the resource.
        :param NetAttributesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetAttributesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dhcp_options_set_id: Optional[pulumi.Input[str]] = None,
                 net_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetAttributesArgs.__new__(NetAttributesArgs)

            __props__.__dict__["dhcp_options_set_id"] = dhcp_options_set_id
            if net_id is None and not opts.urn:
                raise TypeError("Missing required property 'net_id'")
            __props__.__dict__["net_id"] = net_id
            __props__.__dict__["ip_range"] = None
            __props__.__dict__["request_id"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["tags"] = None
            __props__.__dict__["tenancy"] = None
        super(NetAttributes, __self__).__init__(
            'outscale:index/netAttributes:NetAttributes',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dhcp_options_set_id: Optional[pulumi.Input[str]] = None,
            ip_range: Optional[pulumi.Input[str]] = None,
            net_id: Optional[pulumi.Input[str]] = None,
            request_id: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetAttributesTagArgs']]]]] = None,
            tenancy: Optional[pulumi.Input[str]] = None) -> 'NetAttributes':
        """
        Get an existing NetAttributes resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dhcp_options_set_id: The ID of the DHCP options set (or `default` if you want to associate the default one).
        :param pulumi.Input[str] ip_range: The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
        :param pulumi.Input[str] net_id: The ID of the Net.
        :param pulumi.Input[str] state: The state of the Net (`pending` \\| `available` \\| `deleted`).
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetAttributesTagArgs']]]] tags: One or more tags associated with the Net.
        :param pulumi.Input[str] tenancy: The VM tenancy in a Net.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetAttributesState.__new__(_NetAttributesState)

        __props__.__dict__["dhcp_options_set_id"] = dhcp_options_set_id
        __props__.__dict__["ip_range"] = ip_range
        __props__.__dict__["net_id"] = net_id
        __props__.__dict__["request_id"] = request_id
        __props__.__dict__["state"] = state
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tenancy"] = tenancy
        return NetAttributes(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dhcpOptionsSetId")
    def dhcp_options_set_id(self) -> pulumi.Output[str]:
        """
        The ID of the DHCP options set (or `default` if you want to associate the default one).
        """
        return pulumi.get(self, "dhcp_options_set_id")

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> pulumi.Output[str]:
        """
        The IP range for the Net, in CIDR notation (for example, `10.0.0.0/16`).
        """
        return pulumi.get(self, "ip_range")

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> pulumi.Output[str]:
        """
        The ID of the Net.
        """
        return pulumi.get(self, "net_id")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The state of the Net (`pending` \\| `available` \\| `deleted`).
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Sequence['outputs.NetAttributesTag']]:
        """
        One or more tags associated with the Net.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def tenancy(self) -> pulumi.Output[str]:
        """
        The VM tenancy in a Net.
        """
        return pulumi.get(self, "tenancy")

