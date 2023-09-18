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
    'GetAccessKeyResult',
    'AwaitableGetAccessKeyResult',
    'get_access_key',
    'get_access_key_output',
]

@pulumi.output_type
class GetAccessKeyResult:
    """
    A collection of values returned by getAccessKey.
    """
    def __init__(__self__, access_key_id=None, creation_date=None, expiration_date=None, filters=None, id=None, last_modification_date=None, request_id=None, state=None):
        if access_key_id and not isinstance(access_key_id, str):
            raise TypeError("Expected argument 'access_key_id' to be a str")
        pulumi.set(__self__, "access_key_id", access_key_id)
        if creation_date and not isinstance(creation_date, str):
            raise TypeError("Expected argument 'creation_date' to be a str")
        pulumi.set(__self__, "creation_date", creation_date)
        if expiration_date and not isinstance(expiration_date, str):
            raise TypeError("Expected argument 'expiration_date' to be a str")
        pulumi.set(__self__, "expiration_date", expiration_date)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if last_modification_date and not isinstance(last_modification_date, str):
            raise TypeError("Expected argument 'last_modification_date' to be a str")
        pulumi.set(__self__, "last_modification_date", last_modification_date)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> Optional[str]:
        """
        The ID of the access key.
        """
        return pulumi.get(self, "access_key_id")

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> str:
        """
        The date and time (UTC) of creation of the access key.
        """
        return pulumi.get(self, "creation_date")

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> str:
        """
        The date (UTC) at which the access key expires.
        """
        return pulumi.get(self, "expiration_date")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetAccessKeyFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastModificationDate")
    def last_modification_date(self) -> str:
        """
        The date and time (UTC) of the last modification of the access key.
        """
        return pulumi.get(self, "last_modification_date")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter
    def state(self) -> Optional[str]:
        """
        The state of the access key (`ACTIVE` if the key is valid for API calls, or `INACTIVE` if not).
        """
        return pulumi.get(self, "state")


class AwaitableGetAccessKeyResult(GetAccessKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessKeyResult(
            access_key_id=self.access_key_id,
            creation_date=self.creation_date,
            expiration_date=self.expiration_date,
            filters=self.filters,
            id=self.id,
            last_modification_date=self.last_modification_date,
            request_id=self.request_id,
            state=self.state)


def get_access_key(access_key_id: Optional[str] = None,
                   filters: Optional[Sequence[pulumi.InputType['GetAccessKeyFilterArgs']]] = None,
                   state: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessKeyResult:
    """
    Provides information about an access key.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Access-Keys.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-accesskey).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    access_key01 = outscale.get_access_key(filters=[outscale.GetAccessKeyFilterArgs(
        name="access_key_ids",
        values=["ABCDEFGHIJ0123456789"],
    )])
    ```


    :param str access_key_id: The ID of the access key.
    :param Sequence[pulumi.InputType['GetAccessKeyFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str state: The state of the access key (`ACTIVE` if the key is valid for API calls, or `INACTIVE` if not).
    """
    __args__ = dict()
    __args__['accessKeyId'] = access_key_id
    __args__['filters'] = filters
    __args__['state'] = state
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getAccessKey:getAccessKey', __args__, opts=opts, typ=GetAccessKeyResult).value

    return AwaitableGetAccessKeyResult(
        access_key_id=pulumi.get(__ret__, 'access_key_id'),
        creation_date=pulumi.get(__ret__, 'creation_date'),
        expiration_date=pulumi.get(__ret__, 'expiration_date'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        last_modification_date=pulumi.get(__ret__, 'last_modification_date'),
        request_id=pulumi.get(__ret__, 'request_id'),
        state=pulumi.get(__ret__, 'state'))


@_utilities.lift_output_func(get_access_key)
def get_access_key_output(access_key_id: Optional[pulumi.Input[Optional[str]]] = None,
                          filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetAccessKeyFilterArgs']]]]] = None,
                          state: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessKeyResult]:
    """
    Provides information about an access key.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Access-Keys.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-accesskey).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    access_key01 = outscale.get_access_key(filters=[outscale.GetAccessKeyFilterArgs(
        name="access_key_ids",
        values=["ABCDEFGHIJ0123456789"],
    )])
    ```


    :param str access_key_id: The ID of the access key.
    :param Sequence[pulumi.InputType['GetAccessKeyFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str state: The state of the access key (`ACTIVE` if the key is valid for API calls, or `INACTIVE` if not).
    """
    ...
