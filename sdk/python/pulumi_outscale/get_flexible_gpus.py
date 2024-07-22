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
    'GetFlexibleGpusResult',
    'AwaitableGetFlexibleGpusResult',
    'get_flexible_gpus',
    'get_flexible_gpus_output',
]

@pulumi.output_type
class GetFlexibleGpusResult:
    """
    A collection of values returned by getFlexibleGpus.
    """
    def __init__(__self__, filters=None, flexible_gpuses=None, id=None, request_id=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if flexible_gpuses and not isinstance(flexible_gpuses, list):
            raise TypeError("Expected argument 'flexible_gpuses' to be a list")
        pulumi.set(__self__, "flexible_gpuses", flexible_gpuses)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetFlexibleGpusFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter(name="flexibleGpuses")
    def flexible_gpuses(self) -> Sequence['outputs.GetFlexibleGpusFlexibleGpusResult']:
        """
        Information about one or more fGPUs.
        """
        return pulumi.get(self, "flexible_gpuses")

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


class AwaitableGetFlexibleGpusResult(GetFlexibleGpusResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlexibleGpusResult(
            filters=self.filters,
            flexible_gpuses=self.flexible_gpuses,
            id=self.id,
            request_id=self.request_id)


def get_flexible_gpus(filters: Optional[Sequence[pulumi.InputType['GetFlexibleGpusFilterArgs']]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlexibleGpusResult:
    """
    Provides information about flexible GPUs.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    flexible_gpus01 = outscale.get_flexible_gpus(filters=[
        outscale.GetFlexibleGpusFilterArgs(
            name="model_names",
            values=[
                "nvidia-p6",
                "nvidia-p100",
            ],
        ),
        outscale.GetFlexibleGpusFilterArgs(
            name="states",
            values=["attached"],
        ),
    ])
    ```


    :param Sequence[pulumi.InputType['GetFlexibleGpusFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getFlexibleGpus:getFlexibleGpus', __args__, opts=opts, typ=GetFlexibleGpusResult).value

    return AwaitableGetFlexibleGpusResult(
        filters=pulumi.get(__ret__, 'filters'),
        flexible_gpuses=pulumi.get(__ret__, 'flexible_gpuses'),
        id=pulumi.get(__ret__, 'id'),
        request_id=pulumi.get(__ret__, 'request_id'))


@_utilities.lift_output_func(get_flexible_gpus)
def get_flexible_gpus_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetFlexibleGpusFilterArgs']]]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFlexibleGpusResult]:
    """
    Provides information about flexible GPUs.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-flexiblegpu).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    flexible_gpus01 = outscale.get_flexible_gpus(filters=[
        outscale.GetFlexibleGpusFilterArgs(
            name="model_names",
            values=[
                "nvidia-p6",
                "nvidia-p100",
            ],
        ),
        outscale.GetFlexibleGpusFilterArgs(
            name="states",
            values=["attached"],
        ),
    ])
    ```


    :param Sequence[pulumi.InputType['GetFlexibleGpusFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...
