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
    'GetNetPeeringResult',
    'AwaitableGetNetPeeringResult',
    'get_net_peering',
    'get_net_peering_output',
]

@pulumi.output_type
class GetNetPeeringResult:
    """
    A collection of values returned by getNetPeering.
    """
    def __init__(__self__, accepter_net=None, filters=None, id=None, net_peering_id=None, request_id=None, source_net=None, state=None, tags=None):
        if accepter_net and not isinstance(accepter_net, dict):
            raise TypeError("Expected argument 'accepter_net' to be a dict")
        pulumi.set(__self__, "accepter_net", accepter_net)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if net_peering_id and not isinstance(net_peering_id, str):
            raise TypeError("Expected argument 'net_peering_id' to be a str")
        pulumi.set(__self__, "net_peering_id", net_peering_id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if source_net and not isinstance(source_net, dict):
            raise TypeError("Expected argument 'source_net' to be a dict")
        pulumi.set(__self__, "source_net", source_net)
        if state and not isinstance(state, dict):
            raise TypeError("Expected argument 'state' to be a dict")
        pulumi.set(__self__, "state", state)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accepterNet")
    def accepter_net(self) -> 'outputs.GetNetPeeringAccepterNetResult':
        """
        Information about the accepter Net.
        """
        return pulumi.get(self, "accepter_net")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetNetPeeringFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="netPeeringId")
    def net_peering_id(self) -> str:
        """
        The ID of the Net peering.
        """
        return pulumi.get(self, "net_peering_id")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="sourceNet")
    def source_net(self) -> 'outputs.GetNetPeeringSourceNetResult':
        """
        Information about the source Net.
        """
        return pulumi.get(self, "source_net")

    @property
    @pulumi.getter
    def state(self) -> 'outputs.GetNetPeeringStateResult':
        """
        Information about the state of the Net peering.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetNetPeeringTagResult']:
        """
        One or more tags associated with the Net peering.
        """
        return pulumi.get(self, "tags")


class AwaitableGetNetPeeringResult(GetNetPeeringResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetPeeringResult(
            accepter_net=self.accepter_net,
            filters=self.filters,
            id=self.id,
            net_peering_id=self.net_peering_id,
            request_id=self.request_id,
            source_net=self.source_net,
            state=self.state,
            tags=self.tags)


def get_net_peering(filters: Optional[Sequence[pulumi.InputType['GetNetPeeringFilterArgs']]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetPeeringResult:
    """
    Provides information about a Net peering.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Peering-Connections.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netpeering).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    net_peering01 = outscale.get_net_peering(filters=[outscale.GetNetPeeringFilterArgs(
        name="net_peering_ids",
        values=["pcx-12345678"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetNetPeeringFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getNetPeering:getNetPeering', __args__, opts=opts, typ=GetNetPeeringResult).value

    return AwaitableGetNetPeeringResult(
        accepter_net=pulumi.get(__ret__, 'accepter_net'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        net_peering_id=pulumi.get(__ret__, 'net_peering_id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        source_net=pulumi.get(__ret__, 'source_net'),
        state=pulumi.get(__ret__, 'state'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_net_peering)
def get_net_peering_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetNetPeeringFilterArgs']]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNetPeeringResult]:
    """
    Provides information about a Net peering.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-VPC-Peering-Connections.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-netpeering).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    net_peering01 = outscale.get_net_peering(filters=[outscale.GetNetPeeringFilterArgs(
        name="net_peering_ids",
        values=["pcx-12345678"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetNetPeeringFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...
