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
    'GetSubregionsResult',
    'AwaitableGetSubregionsResult',
    'get_subregions',
    'get_subregions_output',
]

@pulumi.output_type
class GetSubregionsResult:
    """
    A collection of values returned by getSubregions.
    """
    def __init__(__self__, filters=None, id=None, request_id=None, subregions=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if subregions and not isinstance(subregions, list):
            raise TypeError("Expected argument 'subregions' to be a list")
        pulumi.set(__self__, "subregions", subregions)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetSubregionsFilterResult']]:
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

    @property
    @pulumi.getter
    def subregions(self) -> Sequence['outputs.GetSubregionsSubregionResult']:
        """
        Information about one or more Subregions.
        """
        return pulumi.get(self, "subregions")


class AwaitableGetSubregionsResult(GetSubregionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubregionsResult(
            filters=self.filters,
            id=self.id,
            request_id=self.request_id,
            subregions=self.subregions)


def get_subregions(filters: Optional[Sequence[pulumi.InputType['GetSubregionsFilterArgs']]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubregionsResult:
    """
    Provides information about subregions.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Regions-Endpoints-and-Availability-Zones.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readsubregions).

    ## Example Usage
    ### List a specific Subregion in the current Region

    ```python
    import pulumi
    import pulumi_outscale as outscale

    subregions01 = outscale.get_subregions(filters=[outscale.GetSubregionsFilterArgs(
        name="subregion_names",
        values=["eu-west-2a"],
    )])
    ```
    ### List two specific Subregions in the current Region

    ```python
    import pulumi
    import pulumi_outscale as outscale

    subregions02 = outscale.get_subregions(filters=[outscale.GetSubregionsFilterArgs(
        name="subregion_names",
        values=[
            "eu-west-2a",
            "eu-west-2b",
        ],
    )])
    ```
    ### List all accessible Subregions in the current Region

    ```python
    import pulumi
    import pulumi_outscale as outscale

    all_subregions = outscale.get_subregions()
    ```


    :param Sequence[pulumi.InputType['GetSubregionsFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getSubregions:getSubregions', __args__, opts=opts, typ=GetSubregionsResult).value

    return AwaitableGetSubregionsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        subregions=pulumi.get(__ret__, 'subregions'))


@_utilities.lift_output_func(get_subregions)
def get_subregions_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetSubregionsFilterArgs']]]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSubregionsResult]:
    """
    Provides information about subregions.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Regions-Endpoints-and-Availability-Zones.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readsubregions).

    ## Example Usage
    ### List a specific Subregion in the current Region

    ```python
    import pulumi
    import pulumi_outscale as outscale

    subregions01 = outscale.get_subregions(filters=[outscale.GetSubregionsFilterArgs(
        name="subregion_names",
        values=["eu-west-2a"],
    )])
    ```
    ### List two specific Subregions in the current Region

    ```python
    import pulumi
    import pulumi_outscale as outscale

    subregions02 = outscale.get_subregions(filters=[outscale.GetSubregionsFilterArgs(
        name="subregion_names",
        values=[
            "eu-west-2a",
            "eu-west-2b",
        ],
    )])
    ```
    ### List all accessible Subregions in the current Region

    ```python
    import pulumi
    import pulumi_outscale as outscale

    all_subregions = outscale.get_subregions()
    ```


    :param Sequence[pulumi.InputType['GetSubregionsFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...
