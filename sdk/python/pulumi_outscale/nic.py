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

__all__ = ['NicArgs', 'Nic']

@pulumi.input_type
class NicArgs:
    def __init__(__self__, *,
                 subnet_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 private_ips: Optional[pulumi.Input[Sequence[pulumi.Input['NicPrivateIpArgs']]]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['NicTagArgs']]]] = None):
        """
        The set of arguments for constructing a Nic resource.
        :param pulumi.Input[str] subnet_id: The ID of the Subnet in which you want to create the NIC.
        :param pulumi.Input[str] description: A description for the NIC.
        :param pulumi.Input[str] private_ip: The private IP of the NIC.
        :param pulumi.Input[Sequence[pulumi.Input['NicPrivateIpArgs']]] private_ips: The primary private IP for the NIC.<br />
               This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.<br />
               If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more IDs of security groups for the NIC.
        :param pulumi.Input[Sequence[pulumi.Input['NicTagArgs']]] tags: A tag to add to this resource. You can specify this argument several times.
        """
        pulumi.set(__self__, "subnet_id", subnet_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if private_ip is not None:
            pulumi.set(__self__, "private_ip", private_ip)
        if private_ips is not None:
            pulumi.set(__self__, "private_ips", private_ips)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Input[str]:
        """
        The ID of the Subnet in which you want to create the NIC.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subnet_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the NIC.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The private IP of the NIC.
        """
        return pulumi.get(self, "private_ip")

    @private_ip.setter
    def private_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_ip", value)

    @property
    @pulumi.getter(name="privateIps")
    def private_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NicPrivateIpArgs']]]]:
        """
        The primary private IP for the NIC.<br />
        This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.<br />
        If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        """
        return pulumi.get(self, "private_ips")

    @private_ips.setter
    def private_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NicPrivateIpArgs']]]]):
        pulumi.set(self, "private_ips", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        One or more IDs of security groups for the NIC.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NicTagArgs']]]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NicTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _NicState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_source_dest_checked: Optional[pulumi.Input[bool]] = None,
                 link_nic: Optional[pulumi.Input['NicLinkNicArgs']] = None,
                 link_public_ip: Optional[pulumi.Input['NicLinkPublicIpArgs']] = None,
                 mac_address: Optional[pulumi.Input[str]] = None,
                 net_id: Optional[pulumi.Input[str]] = None,
                 nic_id: Optional[pulumi.Input[str]] = None,
                 private_dns_name: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 private_ips: Optional[pulumi.Input[Sequence[pulumi.Input['NicPrivateIpArgs']]]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 requester_managed: Optional[pulumi.Input[bool]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input['NicSecurityGroupArgs']]]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 subregion_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['NicTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering Nic resources.
        :param pulumi.Input[str] account_id: The account ID of the owner of the NIC.
        :param pulumi.Input[str] description: A description for the NIC.
        :param pulumi.Input[bool] is_source_dest_checked: (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        :param pulumi.Input['NicLinkNicArgs'] link_nic: Information about the NIC attachment.
        :param pulumi.Input['NicLinkPublicIpArgs'] link_public_ip: Information about the public IP association.
        :param pulumi.Input[str] mac_address: The Media Access Control (MAC) address of the NIC.
        :param pulumi.Input[str] net_id: The ID of the Net for the NIC.
        :param pulumi.Input[str] nic_id: The ID of the NIC.
        :param pulumi.Input[str] private_dns_name: The name of the private DNS.
        :param pulumi.Input[str] private_ip: The private IP of the NIC.
        :param pulumi.Input[Sequence[pulumi.Input['NicPrivateIpArgs']]] private_ips: The primary private IP for the NIC.<br />
               This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.<br />
               If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more IDs of security groups for the NIC.
        :param pulumi.Input[Sequence[pulumi.Input['NicSecurityGroupArgs']]] security_groups: One or more IDs of security groups for the NIC.
        :param pulumi.Input[str] state: The state of the NIC (`available` \\| `attaching` \\| `in-use` \\| `detaching`).
        :param pulumi.Input[str] subnet_id: The ID of the Subnet in which you want to create the NIC.
        :param pulumi.Input[str] subregion_name: The Subregion in which the NIC is located.
        :param pulumi.Input[Sequence[pulumi.Input['NicTagArgs']]] tags: A tag to add to this resource. You can specify this argument several times.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if is_source_dest_checked is not None:
            pulumi.set(__self__, "is_source_dest_checked", is_source_dest_checked)
        if link_nic is not None:
            pulumi.set(__self__, "link_nic", link_nic)
        if link_public_ip is not None:
            pulumi.set(__self__, "link_public_ip", link_public_ip)
        if mac_address is not None:
            pulumi.set(__self__, "mac_address", mac_address)
        if net_id is not None:
            pulumi.set(__self__, "net_id", net_id)
        if nic_id is not None:
            pulumi.set(__self__, "nic_id", nic_id)
        if private_dns_name is not None:
            pulumi.set(__self__, "private_dns_name", private_dns_name)
        if private_ip is not None:
            pulumi.set(__self__, "private_ip", private_ip)
        if private_ips is not None:
            pulumi.set(__self__, "private_ips", private_ips)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)
        if requester_managed is not None:
            pulumi.set(__self__, "requester_managed", requester_managed)
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if security_groups is not None:
            pulumi.set(__self__, "security_groups", security_groups)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if subnet_id is not None:
            pulumi.set(__self__, "subnet_id", subnet_id)
        if subregion_name is not None:
            pulumi.set(__self__, "subregion_name", subregion_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account ID of the owner of the NIC.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for the NIC.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="isSourceDestChecked")
    def is_source_dest_checked(self) -> Optional[pulumi.Input[bool]]:
        """
        (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        """
        return pulumi.get(self, "is_source_dest_checked")

    @is_source_dest_checked.setter
    def is_source_dest_checked(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_source_dest_checked", value)

    @property
    @pulumi.getter(name="linkNic")
    def link_nic(self) -> Optional[pulumi.Input['NicLinkNicArgs']]:
        """
        Information about the NIC attachment.
        """
        return pulumi.get(self, "link_nic")

    @link_nic.setter
    def link_nic(self, value: Optional[pulumi.Input['NicLinkNicArgs']]):
        pulumi.set(self, "link_nic", value)

    @property
    @pulumi.getter(name="linkPublicIp")
    def link_public_ip(self) -> Optional[pulumi.Input['NicLinkPublicIpArgs']]:
        """
        Information about the public IP association.
        """
        return pulumi.get(self, "link_public_ip")

    @link_public_ip.setter
    def link_public_ip(self, value: Optional[pulumi.Input['NicLinkPublicIpArgs']]):
        pulumi.set(self, "link_public_ip", value)

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> Optional[pulumi.Input[str]]:
        """
        The Media Access Control (MAC) address of the NIC.
        """
        return pulumi.get(self, "mac_address")

    @mac_address.setter
    def mac_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mac_address", value)

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Net for the NIC.
        """
        return pulumi.get(self, "net_id")

    @net_id.setter
    def net_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "net_id", value)

    @property
    @pulumi.getter(name="nicId")
    def nic_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the NIC.
        """
        return pulumi.get(self, "nic_id")

    @nic_id.setter
    def nic_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nic_id", value)

    @property
    @pulumi.getter(name="privateDnsName")
    def private_dns_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the private DNS.
        """
        return pulumi.get(self, "private_dns_name")

    @private_dns_name.setter
    def private_dns_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_dns_name", value)

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The private IP of the NIC.
        """
        return pulumi.get(self, "private_ip")

    @private_ip.setter
    def private_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_ip", value)

    @property
    @pulumi.getter(name="privateIps")
    def private_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NicPrivateIpArgs']]]]:
        """
        The primary private IP for the NIC.<br />
        This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.<br />
        If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        """
        return pulumi.get(self, "private_ips")

    @private_ips.setter
    def private_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NicPrivateIpArgs']]]]):
        pulumi.set(self, "private_ips", value)

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "request_id")

    @request_id.setter
    def request_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_id", value)

    @property
    @pulumi.getter(name="requesterManaged")
    def requester_managed(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "requester_managed")

    @requester_managed.setter
    def requester_managed(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "requester_managed", value)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        One or more IDs of security groups for the NIC.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NicSecurityGroupArgs']]]]:
        """
        One or more IDs of security groups for the NIC.
        """
        return pulumi.get(self, "security_groups")

    @security_groups.setter
    def security_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NicSecurityGroupArgs']]]]):
        pulumi.set(self, "security_groups", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the NIC (`available` \\| `attaching` \\| `in-use` \\| `detaching`).
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Subnet in which you want to create the NIC.
        """
        return pulumi.get(self, "subnet_id")

    @subnet_id.setter
    def subnet_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet_id", value)

    @property
    @pulumi.getter(name="subregionName")
    def subregion_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Subregion in which the NIC is located.
        """
        return pulumi.get(self, "subregion_name")

    @subregion_name.setter
    def subregion_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subregion_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NicTagArgs']]]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NicTagArgs']]]]):
        pulumi.set(self, "tags", value)


class Nic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 private_ips: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicPrivateIpArgs']]]]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicTagArgs']]]]] = None,
                 __props__=None):
        """
        Manages a network interface card (NIC).

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-FNIs.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-nic).

        ## Example Usage
        ### Required resources

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net01 = outscale.Net("net01", ip_range="10.0.0.0/16")
        subnet01 = outscale.Subnet("subnet01",
            subregion_name="eu-west-2a",
            ip_range="10.0.0.0/18",
            net_id=net01.net_id)
        security_group01 = outscale.SecurityGroup("securityGroup01",
            description="Terraform security group for nic with private IPs",
            security_group_name="terraform-security-group-nic-ips",
            net_id=net01.net_id)
        ```
        ### Create a NIC

        ```python
        import pulumi
        import pulumi_outscale as outscale

        nic01 = outscale.Nic("nic01", subnet_id=outscale_subnet["subnet01"]["subnet_id"])
        ```
        ### Create a NIC with private IP addresses

        ```python
        import pulumi
        import pulumi_outscale as outscale

        nic02 = outscale.Nic("nic02",
            description="Terraform nic with private IPs",
            subnet_id=outscale_subnet["subnet01"]["subnet_id"],
            security_group_ids=[outscale_security_group["security_group01"]["security_group_id"]],
            private_ips=[
                outscale.NicPrivateIpArgs(
                    is_primary=True,
                    private_ip="10.0.0.1",
                ),
                outscale.NicPrivateIpArgs(
                    is_primary=False,
                    private_ip="10.0.0.2",
                ),
            ])
        ```

        ## Import

        A NIC can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/nic:Nic ImportedNic eni-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description for the NIC.
        :param pulumi.Input[str] private_ip: The private IP of the NIC.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicPrivateIpArgs']]]] private_ips: The primary private IP for the NIC.<br />
               This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.<br />
               If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more IDs of security groups for the NIC.
        :param pulumi.Input[str] subnet_id: The ID of the Subnet in which you want to create the NIC.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicTagArgs']]]] tags: A tag to add to this resource. You can specify this argument several times.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a network interface card (NIC).

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-FNIs.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-nic).

        ## Example Usage
        ### Required resources

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net01 = outscale.Net("net01", ip_range="10.0.0.0/16")
        subnet01 = outscale.Subnet("subnet01",
            subregion_name="eu-west-2a",
            ip_range="10.0.0.0/18",
            net_id=net01.net_id)
        security_group01 = outscale.SecurityGroup("securityGroup01",
            description="Terraform security group for nic with private IPs",
            security_group_name="terraform-security-group-nic-ips",
            net_id=net01.net_id)
        ```
        ### Create a NIC

        ```python
        import pulumi
        import pulumi_outscale as outscale

        nic01 = outscale.Nic("nic01", subnet_id=outscale_subnet["subnet01"]["subnet_id"])
        ```
        ### Create a NIC with private IP addresses

        ```python
        import pulumi
        import pulumi_outscale as outscale

        nic02 = outscale.Nic("nic02",
            description="Terraform nic with private IPs",
            subnet_id=outscale_subnet["subnet01"]["subnet_id"],
            security_group_ids=[outscale_security_group["security_group01"]["security_group_id"]],
            private_ips=[
                outscale.NicPrivateIpArgs(
                    is_primary=True,
                    private_ip="10.0.0.1",
                ),
                outscale.NicPrivateIpArgs(
                    is_primary=False,
                    private_ip="10.0.0.2",
                ),
            ])
        ```

        ## Import

        A NIC can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/nic:Nic ImportedNic eni-12345678
        ```

        :param str resource_name: The name of the resource.
        :param NicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 private_ips: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicPrivateIpArgs']]]]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicTagArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NicArgs.__new__(NicArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["private_ip"] = private_ip
            __props__.__dict__["private_ips"] = private_ips
            __props__.__dict__["security_group_ids"] = security_group_ids
            if subnet_id is None and not opts.urn:
                raise TypeError("Missing required property 'subnet_id'")
            __props__.__dict__["subnet_id"] = subnet_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["account_id"] = None
            __props__.__dict__["is_source_dest_checked"] = None
            __props__.__dict__["link_nic"] = None
            __props__.__dict__["link_public_ip"] = None
            __props__.__dict__["mac_address"] = None
            __props__.__dict__["net_id"] = None
            __props__.__dict__["nic_id"] = None
            __props__.__dict__["private_dns_name"] = None
            __props__.__dict__["request_id"] = None
            __props__.__dict__["requester_managed"] = None
            __props__.__dict__["security_groups"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["subregion_name"] = None
        super(Nic, __self__).__init__(
            'outscale:index/nic:Nic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            is_source_dest_checked: Optional[pulumi.Input[bool]] = None,
            link_nic: Optional[pulumi.Input[pulumi.InputType['NicLinkNicArgs']]] = None,
            link_public_ip: Optional[pulumi.Input[pulumi.InputType['NicLinkPublicIpArgs']]] = None,
            mac_address: Optional[pulumi.Input[str]] = None,
            net_id: Optional[pulumi.Input[str]] = None,
            nic_id: Optional[pulumi.Input[str]] = None,
            private_dns_name: Optional[pulumi.Input[str]] = None,
            private_ip: Optional[pulumi.Input[str]] = None,
            private_ips: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicPrivateIpArgs']]]]] = None,
            request_id: Optional[pulumi.Input[str]] = None,
            requester_managed: Optional[pulumi.Input[bool]] = None,
            security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicSecurityGroupArgs']]]]] = None,
            state: Optional[pulumi.Input[str]] = None,
            subnet_id: Optional[pulumi.Input[str]] = None,
            subregion_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicTagArgs']]]]] = None) -> 'Nic':
        """
        Get an existing Nic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account ID of the owner of the NIC.
        :param pulumi.Input[str] description: A description for the NIC.
        :param pulumi.Input[bool] is_source_dest_checked: (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        :param pulumi.Input[pulumi.InputType['NicLinkNicArgs']] link_nic: Information about the NIC attachment.
        :param pulumi.Input[pulumi.InputType['NicLinkPublicIpArgs']] link_public_ip: Information about the public IP association.
        :param pulumi.Input[str] mac_address: The Media Access Control (MAC) address of the NIC.
        :param pulumi.Input[str] net_id: The ID of the Net for the NIC.
        :param pulumi.Input[str] nic_id: The ID of the NIC.
        :param pulumi.Input[str] private_dns_name: The name of the private DNS.
        :param pulumi.Input[str] private_ip: The private IP of the NIC.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicPrivateIpArgs']]]] private_ips: The primary private IP for the NIC.<br />
               This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.<br />
               If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more IDs of security groups for the NIC.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicSecurityGroupArgs']]]] security_groups: One or more IDs of security groups for the NIC.
        :param pulumi.Input[str] state: The state of the NIC (`available` \\| `attaching` \\| `in-use` \\| `detaching`).
        :param pulumi.Input[str] subnet_id: The ID of the Subnet in which you want to create the NIC.
        :param pulumi.Input[str] subregion_name: The Subregion in which the NIC is located.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NicTagArgs']]]] tags: A tag to add to this resource. You can specify this argument several times.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NicState.__new__(_NicState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["description"] = description
        __props__.__dict__["is_source_dest_checked"] = is_source_dest_checked
        __props__.__dict__["link_nic"] = link_nic
        __props__.__dict__["link_public_ip"] = link_public_ip
        __props__.__dict__["mac_address"] = mac_address
        __props__.__dict__["net_id"] = net_id
        __props__.__dict__["nic_id"] = nic_id
        __props__.__dict__["private_dns_name"] = private_dns_name
        __props__.__dict__["private_ip"] = private_ip
        __props__.__dict__["private_ips"] = private_ips
        __props__.__dict__["request_id"] = request_id
        __props__.__dict__["requester_managed"] = requester_managed
        __props__.__dict__["security_group_ids"] = security_group_ids
        __props__.__dict__["security_groups"] = security_groups
        __props__.__dict__["state"] = state
        __props__.__dict__["subnet_id"] = subnet_id
        __props__.__dict__["subregion_name"] = subregion_name
        __props__.__dict__["tags"] = tags
        return Nic(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account ID of the owner of the NIC.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        A description for the NIC.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="isSourceDestChecked")
    def is_source_dest_checked(self) -> pulumi.Output[bool]:
        """
        (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        """
        return pulumi.get(self, "is_source_dest_checked")

    @property
    @pulumi.getter(name="linkNic")
    def link_nic(self) -> pulumi.Output['outputs.NicLinkNic']:
        """
        Information about the NIC attachment.
        """
        return pulumi.get(self, "link_nic")

    @property
    @pulumi.getter(name="linkPublicIp")
    def link_public_ip(self) -> pulumi.Output['outputs.NicLinkPublicIp']:
        """
        Information about the public IP association.
        """
        return pulumi.get(self, "link_public_ip")

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> pulumi.Output[str]:
        """
        The Media Access Control (MAC) address of the NIC.
        """
        return pulumi.get(self, "mac_address")

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> pulumi.Output[str]:
        """
        The ID of the Net for the NIC.
        """
        return pulumi.get(self, "net_id")

    @property
    @pulumi.getter(name="nicId")
    def nic_id(self) -> pulumi.Output[str]:
        """
        The ID of the NIC.
        """
        return pulumi.get(self, "nic_id")

    @property
    @pulumi.getter(name="privateDnsName")
    def private_dns_name(self) -> pulumi.Output[str]:
        """
        The name of the private DNS.
        """
        return pulumi.get(self, "private_dns_name")

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> pulumi.Output[str]:
        """
        The private IP of the NIC.
        """
        return pulumi.get(self, "private_ip")

    @property
    @pulumi.getter(name="privateIps")
    def private_ips(self) -> pulumi.Output[Sequence['outputs.NicPrivateIp']]:
        """
        The primary private IP for the NIC.<br />
        This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.<br />
        If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        """
        return pulumi.get(self, "private_ips")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="requesterManaged")
    def requester_managed(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "requester_managed")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        One or more IDs of security groups for the NIC.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> pulumi.Output[Sequence['outputs.NicSecurityGroup']]:
        """
        One or more IDs of security groups for the NIC.
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The state of the NIC (`available` \\| `attaching` \\| `in-use` \\| `detaching`).
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> pulumi.Output[str]:
        """
        The ID of the Subnet in which you want to create the NIC.
        """
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter(name="subregionName")
    def subregion_name(self) -> pulumi.Output[str]:
        """
        The Subregion in which the NIC is located.
        """
        return pulumi.get(self, "subregion_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.NicTag']]]:
        """
        A tag to add to this resource. You can specify this argument several times.
        """
        return pulumi.get(self, "tags")

