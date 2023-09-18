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
    'GetSnapshotResult',
    'AwaitableGetSnapshotResult',
    'get_snapshot',
    'get_snapshot_output',
]

@pulumi.output_type
class GetSnapshotResult:
    """
    A collection of values returned by getSnapshot.
    """
    def __init__(__self__, account_alias=None, account_id=None, creation_date=None, description=None, filters=None, id=None, permissions_to_create_volumes=None, progress=None, request_id=None, snapshot_id=None, state=None, tags=None, volume_id=None, volume_size=None):
        if account_alias and not isinstance(account_alias, str):
            raise TypeError("Expected argument 'account_alias' to be a str")
        pulumi.set(__self__, "account_alias", account_alias)
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if creation_date and not isinstance(creation_date, str):
            raise TypeError("Expected argument 'creation_date' to be a str")
        pulumi.set(__self__, "creation_date", creation_date)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if permissions_to_create_volumes and not isinstance(permissions_to_create_volumes, list):
            raise TypeError("Expected argument 'permissions_to_create_volumes' to be a list")
        pulumi.set(__self__, "permissions_to_create_volumes", permissions_to_create_volumes)
        if progress and not isinstance(progress, int):
            raise TypeError("Expected argument 'progress' to be a int")
        pulumi.set(__self__, "progress", progress)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if snapshot_id and not isinstance(snapshot_id, str):
            raise TypeError("Expected argument 'snapshot_id' to be a str")
        pulumi.set(__self__, "snapshot_id", snapshot_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if volume_id and not isinstance(volume_id, str):
            raise TypeError("Expected argument 'volume_id' to be a str")
        pulumi.set(__self__, "volume_id", volume_id)
        if volume_size and not isinstance(volume_size, int):
            raise TypeError("Expected argument 'volume_size' to be a int")
        pulumi.set(__self__, "volume_size", volume_size)

    @property
    @pulumi.getter(name="accountAlias")
    def account_alias(self) -> str:
        """
        The account alias of the owner of the snapshot.
        """
        return pulumi.get(self, "account_alias")

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account ID of the owner of the snapshot.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> str:
        """
        The date and time of creation of the snapshot.
        """
        return pulumi.get(self, "creation_date")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the snapshot.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetSnapshotFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="permissionsToCreateVolumes")
    def permissions_to_create_volumes(self) -> Sequence['outputs.GetSnapshotPermissionsToCreateVolumeResult']:
        """
        Information about the users who have permissions for the resource.
        """
        return pulumi.get(self, "permissions_to_create_volumes")

    @property
    @pulumi.getter
    def progress(self) -> int:
        """
        The progress of the snapshot, as a percentage.
        """
        return pulumi.get(self, "progress")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> str:
        """
        The ID of the snapshot.
        """
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        The state of the snapshot (`in-queue` \\| `completed` \\| `error`).
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> Sequence['outputs.GetSnapshotTagResult']:
        """
        One or more tags associated with the snapshot.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="volumeId")
    def volume_id(self) -> str:
        """
        The ID of the volume used to create the snapshot.
        """
        return pulumi.get(self, "volume_id")

    @property
    @pulumi.getter(name="volumeSize")
    def volume_size(self) -> int:
        """
        The size of the volume used to create the snapshot, in gibibytes (GiB).
        """
        return pulumi.get(self, "volume_size")


class AwaitableGetSnapshotResult(GetSnapshotResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSnapshotResult(
            account_alias=self.account_alias,
            account_id=self.account_id,
            creation_date=self.creation_date,
            description=self.description,
            filters=self.filters,
            id=self.id,
            permissions_to_create_volumes=self.permissions_to_create_volumes,
            progress=self.progress,
            request_id=self.request_id,
            snapshot_id=self.snapshot_id,
            state=self.state,
            tags=self.tags,
            volume_id=self.volume_id,
            volume_size=self.volume_size)


def get_snapshot(account_id: Optional[str] = None,
                 filters: Optional[Sequence[pulumi.InputType['GetSnapshotFilterArgs']]] = None,
                 snapshot_id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSnapshotResult:
    """
    Provides information about a snapshot.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-snapshot).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    snapshot01 = outscale.get_snapshot(filters=[outscale.GetSnapshotFilterArgs(
        name="snapshot_ids",
        values=["snap-12345678"],
    )])
    ```


    :param str account_id: The account ID of the owner of the snapshot.
    :param Sequence[pulumi.InputType['GetSnapshotFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str snapshot_id: The ID of the snapshot.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['filters'] = filters
    __args__['snapshotId'] = snapshot_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getSnapshot:getSnapshot', __args__, opts=opts, typ=GetSnapshotResult).value

    return AwaitableGetSnapshotResult(
        account_alias=pulumi.get(__ret__, 'account_alias'),
        account_id=pulumi.get(__ret__, 'account_id'),
        creation_date=pulumi.get(__ret__, 'creation_date'),
        description=pulumi.get(__ret__, 'description'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        permissions_to_create_volumes=pulumi.get(__ret__, 'permissions_to_create_volumes'),
        progress=pulumi.get(__ret__, 'progress'),
        request_id=pulumi.get(__ret__, 'request_id'),
        snapshot_id=pulumi.get(__ret__, 'snapshot_id'),
        state=pulumi.get(__ret__, 'state'),
        tags=pulumi.get(__ret__, 'tags'),
        volume_id=pulumi.get(__ret__, 'volume_id'),
        volume_size=pulumi.get(__ret__, 'volume_size'))


@_utilities.lift_output_func(get_snapshot)
def get_snapshot_output(account_id: Optional[pulumi.Input[Optional[str]]] = None,
                        filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetSnapshotFilterArgs']]]]] = None,
                        snapshot_id: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSnapshotResult]:
    """
    Provides information about a snapshot.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Snapshots.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-snapshot).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    snapshot01 = outscale.get_snapshot(filters=[outscale.GetSnapshotFilterArgs(
        name="snapshot_ids",
        values=["snap-12345678"],
    )])
    ```


    :param str account_id: The account ID of the owner of the snapshot.
    :param Sequence[pulumi.InputType['GetSnapshotFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param str snapshot_id: The ID of the snapshot.
    """
    ...
