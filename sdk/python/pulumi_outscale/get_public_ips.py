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
    'GetPublicIpsResult',
    'AwaitableGetPublicIpsResult',
    'get_public_ips',
    'get_public_ips_output',
]

@pulumi.output_type
class GetPublicIpsResult:
    """
    A collection of values returned by getPublicIps.
    """
    def __init__(__self__, filters=None, id=None, public_ips=None, request_id=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if public_ips and not isinstance(public_ips, list):
            raise TypeError("Expected argument 'public_ips' to be a list")
        pulumi.set(__self__, "public_ips", public_ips)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetPublicIpsFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="publicIps")
    def public_ips(self) -> Sequence['outputs.GetPublicIpsPublicIpResult']:
        """
        Information about one or more public IPs.
        """
        return pulumi.get(self, "public_ips")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")


class AwaitableGetPublicIpsResult(GetPublicIpsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPublicIpsResult(
            filters=self.filters,
            id=self.id,
            public_ips=self.public_ips,
            request_id=self.request_id)


def get_public_ips(filters: Optional[Sequence[pulumi.InputType['GetPublicIpsFilterArgs']]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPublicIpsResult:
    """
    Provides information about public IPs.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-EIPs.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-publicip).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    public_ips01 = outscale.get_public_ips(filters=[outscale.GetPublicIpsFilterArgs(
        name="public_ips",
        values=[
            "111.11.111.1",
            "222.22.222.2",
        ],
    )])
    ```


    :param Sequence[pulumi.InputType['GetPublicIpsFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getPublicIps:getPublicIps', __args__, opts=opts, typ=GetPublicIpsResult).value

    return AwaitableGetPublicIpsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        public_ips=pulumi.get(__ret__, 'public_ips'),
        request_id=pulumi.get(__ret__, 'request_id'))


@_utilities.lift_output_func(get_public_ips)
def get_public_ips_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetPublicIpsFilterArgs']]]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPublicIpsResult]:
    """
    Provides information about public IPs.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-EIPs.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-publicip).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    public_ips01 = outscale.get_public_ips(filters=[outscale.GetPublicIpsFilterArgs(
        name="public_ips",
        values=[
            "111.11.111.1",
            "222.22.222.2",
        ],
    )])
    ```


    :param Sequence[pulumi.InputType['GetPublicIpsFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...