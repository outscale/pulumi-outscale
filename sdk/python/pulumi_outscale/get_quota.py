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
    'GetQuotaResult',
    'AwaitableGetQuotaResult',
    'get_quota',
    'get_quota_output',
]

@pulumi.output_type
class GetQuotaResult:
    """
    A collection of values returned by getQuota.
    """
    def __init__(__self__, account_id=None, description=None, filters=None, id=None, max_value=None, name=None, quota_collection=None, quota_type=None, request_id=None, short_description=None, used_value=None):
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
        if max_value and not isinstance(max_value, int):
            raise TypeError("Expected argument 'max_value' to be a int")
        pulumi.set(__self__, "max_value", max_value)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if quota_collection and not isinstance(quota_collection, str):
            raise TypeError("Expected argument 'quota_collection' to be a str")
        pulumi.set(__self__, "quota_collection", quota_collection)
        if quota_type and not isinstance(quota_type, str):
            raise TypeError("Expected argument 'quota_type' to be a str")
        pulumi.set(__self__, "quota_type", quota_type)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if short_description and not isinstance(short_description, str):
            raise TypeError("Expected argument 'short_description' to be a str")
        pulumi.set(__self__, "short_description", short_description)
        if used_value and not isinstance(used_value, int):
            raise TypeError("Expected argument 'used_value' to be a int")
        pulumi.set(__self__, "used_value", used_value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account ID of the owner of the quotas.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the quota.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetQuotaFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="maxValue")
    def max_value(self) -> int:
        """
        The maximum value of the quota for the OUTSCALE user account (if there is no limit, `0`).
        """
        return pulumi.get(self, "max_value")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The unique name of the quota.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="quotaCollection")
    def quota_collection(self) -> str:
        """
        The group name of the quota.
        """
        return pulumi.get(self, "quota_collection")

    @property
    @pulumi.getter(name="quotaType")
    def quota_type(self) -> str:
        """
        The resource ID if it is a resource-specific quota, `global` if it is not.
        """
        return pulumi.get(self, "quota_type")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="shortDescription")
    def short_description(self) -> str:
        """
        The description of the quota.
        """
        return pulumi.get(self, "short_description")

    @property
    @pulumi.getter(name="usedValue")
    def used_value(self) -> int:
        """
        The limit value currently used by the OUTSCALE user account.
        """
        return pulumi.get(self, "used_value")


class AwaitableGetQuotaResult(GetQuotaResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetQuotaResult(
            account_id=self.account_id,
            description=self.description,
            filters=self.filters,
            id=self.id,
            max_value=self.max_value,
            name=self.name,
            quota_collection=self.quota_collection,
            quota_type=self.quota_type,
            request_id=self.request_id,
            short_description=self.short_description,
            used_value=self.used_value)


def get_quota(filters: Optional[Sequence[pulumi.InputType['GetQuotaFilterArgs']]] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetQuotaResult:
    """
    Provides information about a quota.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Your-Account.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readquotas).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    load_balancer_listeners_quota01 = outscale.get_quota(filters=[
        outscale.GetQuotaFilterArgs(
            name="collections",
            values=["LBU"],
        ),
        outscale.GetQuotaFilterArgs(
            name="quota_names",
            values=["lb_listeners_limit"],
        ),
        outscale.GetQuotaFilterArgs(
            name="quota_types",
            values=["global"],
        ),
        outscale.GetQuotaFilterArgs(
            name="short_descriptions",
            values=["Load Balancer Listeners Limit"],
        ),
    ])
    ```


    :param Sequence[pulumi.InputType['GetQuotaFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getQuota:getQuota', __args__, opts=opts, typ=GetQuotaResult).value

    return AwaitableGetQuotaResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        description=pulumi.get(__ret__, 'description'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        max_value=pulumi.get(__ret__, 'max_value'),
        name=pulumi.get(__ret__, 'name'),
        quota_collection=pulumi.get(__ret__, 'quota_collection'),
        quota_type=pulumi.get(__ret__, 'quota_type'),
        request_id=pulumi.get(__ret__, 'request_id'),
        short_description=pulumi.get(__ret__, 'short_description'),
        used_value=pulumi.get(__ret__, 'used_value'))


@_utilities.lift_output_func(get_quota)
def get_quota_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetQuotaFilterArgs']]]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetQuotaResult]:
    """
    Provides information about a quota.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Your-Account.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readquotas).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    load_balancer_listeners_quota01 = outscale.get_quota(filters=[
        outscale.GetQuotaFilterArgs(
            name="collections",
            values=["LBU"],
        ),
        outscale.GetQuotaFilterArgs(
            name="quota_names",
            values=["lb_listeners_limit"],
        ),
        outscale.GetQuotaFilterArgs(
            name="quota_types",
            values=["global"],
        ),
        outscale.GetQuotaFilterArgs(
            name="short_descriptions",
            values=["Load Balancer Listeners Limit"],
        ),
    ])
    ```


    :param Sequence[pulumi.InputType['GetQuotaFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...