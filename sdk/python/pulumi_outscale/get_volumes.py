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
    'GetVolumesResult',
    'AwaitableGetVolumesResult',
    'get_volumes',
    'get_volumes_output',
]

@pulumi.output_type
class GetVolumesResult:
    """
    A collection of values returned by getVolumes.
    """
    def __init__(__self__, filters=None, id=None, request_id=None, volume_id=None, volumes=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if volume_id and not isinstance(volume_id, str):
            raise TypeError("Expected argument 'volume_id' to be a str")
        pulumi.set(__self__, "volume_id", volume_id)
        if volumes and not isinstance(volumes, list):
            raise TypeError("Expected argument 'volumes' to be a list")
        pulumi.set(__self__, "volumes", volumes)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetVolumesFilterResult']]:
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
    def request_id(self) -> Optional[str]:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> Optional[str]:
        """
        The ID of the volume.
        """
        return pulumi.get(self, "volume_id")

    @property
    @pulumi.getter
    def volumes(self) -> Sequence['outputs.GetVolumesVolumeResult']:
        """
        Information about one or more volumes.
        """
        return pulumi.get(self, "volumes")


class AwaitableGetVolumesResult(GetVolumesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVolumesResult(
            filters=self.filters,
            id=self.id,
            request_id=self.request_id,
            volume_id=self.volume_id,
            volumes=self.volumes)


def get_volumes(filters: Optional[Sequence[pulumi.InputType['GetVolumesFilterArgs']]] = None,
                request_id: Optional[str] = None,
                volume_id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVolumesResult:
    """
    Provides information about volumes.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Volumes.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-volume).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    outscale_volumes01 = outscale.get_volumes(filters=[
        outscale.GetVolumesFilterArgs(
            name="volume_states",
            values=["in-use"],
        ),
        outscale.GetVolumesFilterArgs(
            name="volume_types",
            values=[
                "gp2",
                "io1",
            ],
        ),
    ])
    ```


    :param Sequence[pulumi.InputType['GetVolumesFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str volume_id: The ID of the volume.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['requestId'] = request_id
    __args__['volumeId'] = volume_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getVolumes:getVolumes', __args__, opts=opts, typ=GetVolumesResult).value

    return AwaitableGetVolumesResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        volume_id=pulumi.get(__ret__, 'volume_id'),
        volumes=pulumi.get(__ret__, 'volumes'))


@_utilities.lift_output_func(get_volumes)
def get_volumes_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetVolumesFilterArgs']]]]] = None,
                       request_id: Optional[pulumi.Input[Optional[str]]] = None,
                       volume_id: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVolumesResult]:
    """
    Provides information about volumes.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Volumes.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-volume).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    outscale_volumes01 = outscale.get_volumes(filters=[
        outscale.GetVolumesFilterArgs(
            name="volume_states",
            values=["in-use"],
        ),
        outscale.GetVolumesFilterArgs(
            name="volume_types",
            values=[
                "gp2",
                "io1",
            ],
        ),
    ])
    ```


    :param Sequence[pulumi.InputType['GetVolumesFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str volume_id: The ID of the volume.
    """
    ...
