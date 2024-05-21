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
    'GetClientGatewaysResult',
    'AwaitableGetClientGatewaysResult',
    'get_client_gateways',
    'get_client_gateways_output',
]

@pulumi.output_type
class GetClientGatewaysResult:
    """
    A collection of values returned by getClientGateways.
    """
    def __init__(__self__, client_gateway_ids=None, client_gateways=None, filters=None, id=None, request_id=None):
        if client_gateway_ids and not isinstance(client_gateway_ids, list):
            raise TypeError("Expected argument 'client_gateway_ids' to be a list")
        pulumi.set(__self__, "client_gateway_ids", client_gateway_ids)
        if client_gateways and not isinstance(client_gateways, list):
            raise TypeError("Expected argument 'client_gateways' to be a list")
        pulumi.set(__self__, "client_gateways", client_gateways)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)

    @property
    @pulumi.getter(name="clientGatewayIds")
    def client_gateway_ids(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "client_gateway_ids")

    @property
    @pulumi.getter(name="clientGateways")
    def client_gateways(self) -> Sequence['outputs.GetClientGatewaysClientGatewayResult']:
        """
        Information about one or more client gateways.
        """
        return pulumi.get(self, "client_gateways")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetClientGatewaysFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")


class AwaitableGetClientGatewaysResult(GetClientGatewaysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClientGatewaysResult(
            client_gateway_ids=self.client_gateway_ids,
            client_gateways=self.client_gateways,
            filters=self.filters,
            id=self.id,
            request_id=self.request_id)


def get_client_gateways(client_gateway_ids: Optional[Sequence[str]] = None,
                        filters: Optional[Sequence[pulumi.InputType['GetClientGatewaysFilterArgs']]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClientGatewaysResult:
    """
    Provides information about client gateways.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Customer-Gateways.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-clientgateway).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    client_gateways01 = outscale.get_client_gateways(filters=[
        outscale.GetClientGatewaysFilterArgs(
            name="bgp_asns",
            values=["65000"],
        ),
        outscale.GetClientGatewaysFilterArgs(
            name="public_ips",
            values=[
                "111.11.111.1",
                "222.22.222.2",
            ],
        ),
    ])
    ```


    :param Sequence[str] client_gateway_ids: The IDs of the client gateways.
    :param Sequence[pulumi.InputType['GetClientGatewaysFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['clientGatewayIds'] = client_gateway_ids
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getClientGateways:getClientGateways', __args__, opts=opts, typ=GetClientGatewaysResult).value

    return AwaitableGetClientGatewaysResult(
        client_gateway_ids=pulumi.get(__ret__, 'client_gateway_ids'),
        client_gateways=pulumi.get(__ret__, 'client_gateways'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        request_id=pulumi.get(__ret__, 'request_id'))


@_utilities.lift_output_func(get_client_gateways)
def get_client_gateways_output(client_gateway_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetClientGatewaysFilterArgs']]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClientGatewaysResult]:
    """
    Provides information about client gateways.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Customer-Gateways.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-clientgateway).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    client_gateways01 = outscale.get_client_gateways(filters=[
        outscale.GetClientGatewaysFilterArgs(
            name="bgp_asns",
            values=["65000"],
        ),
        outscale.GetClientGatewaysFilterArgs(
            name="public_ips",
            values=[
                "111.11.111.1",
                "222.22.222.2",
            ],
        ),
    ])
    ```


    :param Sequence[str] client_gateway_ids: The IDs of the client gateways.
    :param Sequence[pulumi.InputType['GetClientGatewaysFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...