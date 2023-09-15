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
    'GetVmStatesResult',
    'AwaitableGetVmStatesResult',
    'get_vm_states',
    'get_vm_states_output',
]

@pulumi.output_type
class GetVmStatesResult:
    """
    A collection of values returned by getVmStates.
    """
    def __init__(__self__, all_vms=None, filters=None, id=None, request_id=None, vm_ids=None, vm_states=None):
        if all_vms and not isinstance(all_vms, bool):
            raise TypeError("Expected argument 'all_vms' to be a bool")
        pulumi.set(__self__, "all_vms", all_vms)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if vm_ids and not isinstance(vm_ids, list):
            raise TypeError("Expected argument 'vm_ids' to be a list")
        pulumi.set(__self__, "vm_ids", vm_ids)
        if vm_states and not isinstance(vm_states, list):
            raise TypeError("Expected argument 'vm_states' to be a list")
        pulumi.set(__self__, "vm_states", vm_states)

    @property
    @pulumi.getter(name="allVms")
    def all_vms(self) -> Optional[bool]:
        return pulumi.get(self, "all_vms")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetVmStatesFilterResult']]:
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
    @pulumi.getter(name="vmIds")
    def vm_ids(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "vm_ids")

    @property
    @pulumi.getter(name="vmStates")
    def vm_states(self) -> Sequence['outputs.GetVmStatesVmStateResult']:
        return pulumi.get(self, "vm_states")


class AwaitableGetVmStatesResult(GetVmStatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVmStatesResult(
            all_vms=self.all_vms,
            filters=self.filters,
            id=self.id,
            request_id=self.request_id,
            vm_ids=self.vm_ids,
            vm_states=self.vm_states)


def get_vm_states(all_vms: Optional[bool] = None,
                  filters: Optional[Sequence[pulumi.InputType['GetVmStatesFilterArgs']]] = None,
                  vm_ids: Optional[Sequence[str]] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVmStatesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['allVms'] = all_vms
    __args__['filters'] = filters
    __args__['vmIds'] = vm_ids
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getVmStates:getVmStates', __args__, opts=opts, typ=GetVmStatesResult).value

    return AwaitableGetVmStatesResult(
        all_vms=pulumi.get(__ret__, 'all_vms'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        vm_ids=pulumi.get(__ret__, 'vm_ids'),
        vm_states=pulumi.get(__ret__, 'vm_states'))


@_utilities.lift_output_func(get_vm_states)
def get_vm_states_output(all_vms: Optional[pulumi.Input[Optional[bool]]] = None,
                         filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetVmStatesFilterArgs']]]]] = None,
                         vm_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVmStatesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...