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
    'GetVmTypesResult',
    'AwaitableGetVmTypesResult',
    'get_vm_types',
    'get_vm_types_output',
]

@pulumi.output_type
class GetVmTypesResult:
    """
    A collection of values returned by getVmTypes.
    """
    def __init__(__self__, filters=None, id=None, request_id=None, vm_types=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if vm_types and not isinstance(vm_types, list):
            raise TypeError("Expected argument 'vm_types' to be a list")
        pulumi.set(__self__, "vm_types", vm_types)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetVmTypesFilterResult']]:
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
    @pulumi.getter(name="vmTypes")
    def vm_types(self) -> Sequence['outputs.GetVmTypesVmTypeResult']:
        """
        Information about one or more VM types.
        """
        return pulumi.get(self, "vm_types")


class AwaitableGetVmTypesResult(GetVmTypesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVmTypesResult(
            filters=self.filters,
            id=self.id,
            request_id=self.request_id,
            vm_types=self.vm_types)


def get_vm_types(filters: Optional[Sequence[pulumi.InputType['GetVmTypesFilterArgs']]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVmTypesResult:
    """
    Provides information about VM types.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/Instance-Types.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmtypes).

    ## Example Usage
    ### All types of VMs
    ```python
    import pulumi
    import pulumi_outscale as outscale

    all_vm_types = outscale.get_vm_types()
    ```
    ### VMs optimized for Block Storage Unit (BSU)
    ```python
    import pulumi
    import pulumi_outscale as outscale

    vm_types01 = outscale.get_vm_types(filters=[outscale.GetVmTypesFilterArgs(
        name="bsu_optimized",
        values=["true"],
    )])
    ```
    ### Specific VM type
    ```python
    import pulumi
    import pulumi_outscale as outscale

    vm_types02 = outscale.get_vm_types(filters=[outscale.GetVmTypesFilterArgs(
        name="vm_type_names",
        values=["m3.large"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetVmTypesFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getVmTypes:getVmTypes', __args__, opts=opts, typ=GetVmTypesResult).value

    return AwaitableGetVmTypesResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        vm_types=pulumi.get(__ret__, 'vm_types'))


@_utilities.lift_output_func(get_vm_types)
def get_vm_types_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetVmTypesFilterArgs']]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVmTypesResult]:
    """
    Provides information about VM types.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/Instance-Types.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#readvmtypes).

    ## Example Usage
    ### All types of VMs
    ```python
    import pulumi
    import pulumi_outscale as outscale

    all_vm_types = outscale.get_vm_types()
    ```
    ### VMs optimized for Block Storage Unit (BSU)
    ```python
    import pulumi
    import pulumi_outscale as outscale

    vm_types01 = outscale.get_vm_types(filters=[outscale.GetVmTypesFilterArgs(
        name="bsu_optimized",
        values=["true"],
    )])
    ```
    ### Specific VM type
    ```python
    import pulumi
    import pulumi_outscale as outscale

    vm_types02 = outscale.get_vm_types(filters=[outscale.GetVmTypesFilterArgs(
        name="vm_type_names",
        values=["m3.large"],
    )])
    ```


    :param Sequence[pulumi.InputType['GetVmTypesFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...
