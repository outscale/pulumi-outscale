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
    'GetNicResult',
    'AwaitableGetNicResult',
    'get_nic',
    'get_nic_output',
]

@pulumi.output_type
class GetNicResult:
    """
    A collection of values returned by getNic.
    """
    def __init__(__self__, account_id=None, description=None, filters=None, id=None, is_source_dest_checked=None, link_nic=None, link_public_ip=None, mac_address=None, net_id=None, nic_id=None, private_dns_name=None, private_ip=None, private_ips=None, request_id=None, requester_managed=None, security_group_ids=None, security_groups=None, state=None, subnet_id=None, subregion_name=None, tags=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_source_dest_checked and not isinstance(is_source_dest_checked, bool):
            raise TypeError("Expected argument 'is_source_dest_checked' to be a bool")
        pulumi.set(__self__, "is_source_dest_checked", is_source_dest_checked)
        if link_nic and not isinstance(link_nic, dict):
            raise TypeError("Expected argument 'link_nic' to be a dict")
        pulumi.set(__self__, "link_nic", link_nic)
        if link_public_ip and not isinstance(link_public_ip, dict):
            raise TypeError("Expected argument 'link_public_ip' to be a dict")
        pulumi.set(__self__, "link_public_ip", link_public_ip)
        if mac_address and not isinstance(mac_address, str):
            raise TypeError("Expected argument 'mac_address' to be a str")
        pulumi.set(__self__, "mac_address", mac_address)
        if net_id and not isinstance(net_id, str):
            raise TypeError("Expected argument 'net_id' to be a str")
        pulumi.set(__self__, "net_id", net_id)
        if nic_id and not isinstance(nic_id, str):
            raise TypeError("Expected argument 'nic_id' to be a str")
        pulumi.set(__self__, "nic_id", nic_id)
        if private_dns_name and not isinstance(private_dns_name, str):
            raise TypeError("Expected argument 'private_dns_name' to be a str")
        pulumi.set(__self__, "private_dns_name", private_dns_name)
        if private_ip and not isinstance(private_ip, str):
            raise TypeError("Expected argument 'private_ip' to be a str")
        pulumi.set(__self__, "private_ip", private_ip)
        if private_ips and not isinstance(private_ips, list):
            raise TypeError("Expected argument 'private_ips' to be a list")
        pulumi.set(__self__, "private_ips", private_ips)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if requester_managed and not isinstance(requester_managed, bool):
            raise TypeError("Expected argument 'requester_managed' to be a bool")
        pulumi.set(__self__, "requester_managed", requester_managed)
        if security_group_ids and not isinstance(security_group_ids, list):
            raise TypeError("Expected argument 'security_group_ids' to be a list")
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        if security_groups and not isinstance(security_groups, list):
            raise TypeError("Expected argument 'security_groups' to be a list")
        pulumi.set(__self__, "security_groups", security_groups)
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
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetNicFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isSourceDestChecked")
    def is_source_dest_checked(self) -> bool:
        return pulumi.get(self, "is_source_dest_checked")

    @property
    @pulumi.getter(name="linkNic")
    def link_nic(self) -> 'outputs.GetNicLinkNicResult':
        return pulumi.get(self, "link_nic")

    @property
    @pulumi.getter(name="linkPublicIp")
    def link_public_ip(self) -> 'outputs.GetNicLinkPublicIpResult':
        return pulumi.get(self, "link_public_ip")

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> str:
        return pulumi.get(self, "mac_address")

    @property
    @pulumi.getter(name="netId")
    def net_id(self) -> str:
        return pulumi.get(self, "net_id")

    @property
    @pulumi.getter(name="nicId")
    def nic_id(self) -> str:
        return pulumi.get(self, "nic_id")

    @property
    @pulumi.getter(name="privateDnsName")
    def private_dns_name(self) -> str:
        return pulumi.get(self, "private_dns_name")

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> str:
        return pulumi.get(self, "private_ip")

    @property
    @pulumi.getter(name="privateIps")
    def private_ips(self) -> Sequence['outputs.GetNicPrivateIpResult']:
        return pulumi.get(self, "private_ips")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="requesterManaged")
    def requester_managed(self) -> bool:
        return pulumi.get(self, "requester_managed")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Sequence[str]:
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Sequence['outputs.GetNicSecurityGroupResult']:
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="subnetId")
    def subnet_id(self) -> str:
        return pulumi.get(self, "subnet_id")

    @property
    @pulumi.getter(name="subregionName")
    def subregion_name(self) -> str:
        return pulumi.get(self, "subregion_name")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetNicTagResult']:
        return pulumi.get(self, "tags")


class AwaitableGetNicResult(GetNicResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNicResult(
            account_id=self.account_id,
            description=self.description,
            filters=self.filters,
            id=self.id,
            is_source_dest_checked=self.is_source_dest_checked,
            link_nic=self.link_nic,
            link_public_ip=self.link_public_ip,
            mac_address=self.mac_address,
            net_id=self.net_id,
            nic_id=self.nic_id,
            private_dns_name=self.private_dns_name,
            private_ip=self.private_ip,
            private_ips=self.private_ips,
            request_id=self.request_id,
            requester_managed=self.requester_managed,
            security_group_ids=self.security_group_ids,
            security_groups=self.security_groups,
            state=self.state,
            subnet_id=self.subnet_id,
            subregion_name=self.subregion_name,
            tags=self.tags)


def get_nic(filters: Optional[Sequence[pulumi.InputType['GetNicFilterArgs']]] = None,
            nic_id: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNicResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['nicId'] = nic_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getNic:getNic', __args__, opts=opts, typ=GetNicResult).value

    return AwaitableGetNicResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        description=pulumi.get(__ret__, 'description'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        is_source_dest_checked=pulumi.get(__ret__, 'is_source_dest_checked'),
        link_nic=pulumi.get(__ret__, 'link_nic'),
        link_public_ip=pulumi.get(__ret__, 'link_public_ip'),
        mac_address=pulumi.get(__ret__, 'mac_address'),
        net_id=pulumi.get(__ret__, 'net_id'),
        nic_id=pulumi.get(__ret__, 'nic_id'),
        private_dns_name=pulumi.get(__ret__, 'private_dns_name'),
        private_ip=pulumi.get(__ret__, 'private_ip'),
        private_ips=pulumi.get(__ret__, 'private_ips'),
        request_id=pulumi.get(__ret__, 'request_id'),
        requester_managed=pulumi.get(__ret__, 'requester_managed'),
        security_group_ids=pulumi.get(__ret__, 'security_group_ids'),
        security_groups=pulumi.get(__ret__, 'security_groups'),
        state=pulumi.get(__ret__, 'state'),
        subnet_id=pulumi.get(__ret__, 'subnet_id'),
        subregion_name=pulumi.get(__ret__, 'subregion_name'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_nic)
def get_nic_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetNicFilterArgs']]]]] = None,
                   nic_id: Optional[pulumi.Input[Optional[str]]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNicResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...