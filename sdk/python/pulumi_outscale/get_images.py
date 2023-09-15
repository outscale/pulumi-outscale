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
    'GetImagesResult',
    'AwaitableGetImagesResult',
    'get_images',
    'get_images_output',
]

@pulumi.output_type
class GetImagesResult:
    """
    A collection of values returned by getImages.
    """
    def __init__(__self__, account_ids=None, filters=None, id=None, image_ids=None, images=None, permissions=None, request_id=None):
        if account_ids and not isinstance(account_ids, list):
            raise TypeError("Expected argument 'account_ids' to be a list")
        pulumi.set(__self__, "account_ids", account_ids)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if image_ids and not isinstance(image_ids, list):
            raise TypeError("Expected argument 'image_ids' to be a list")
        pulumi.set(__self__, "image_ids", image_ids)
        if images and not isinstance(images, list):
            raise TypeError("Expected argument 'images' to be a list")
        pulumi.set(__self__, "images", images)
        if permissions and not isinstance(permissions, list):
            raise TypeError("Expected argument 'permissions' to be a list")
        pulumi.set(__self__, "permissions", permissions)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)

    @property
    @pulumi.getter(name="accountIds")
    def account_ids(self) -> Optional[Sequence[str]]:
        """
        The account ID of one or more users who have permissions for the resource.
        """
        return pulumi.get(self, "account_ids")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetImagesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imageIds")
    def image_ids(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "image_ids")

    @property
    @pulumi.getter
    def images(self) -> Sequence['outputs.GetImagesImageResult']:
        """
        Information about one or more OMIs.
        """
        return pulumi.get(self, "images")

    @property
    @pulumi.getter
    def permissions(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")


class AwaitableGetImagesResult(GetImagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImagesResult(
            account_ids=self.account_ids,
            filters=self.filters,
            id=self.id,
            image_ids=self.image_ids,
            images=self.images,
            permissions=self.permissions,
            request_id=self.request_id)


def get_images(account_ids: Optional[Sequence[str]] = None,
               filters: Optional[Sequence[pulumi.InputType['GetImagesFilterArgs']]] = None,
               image_ids: Optional[Sequence[str]] = None,
               permissions: Optional[Sequence[str]] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImagesResult:
    """
    Provides information about images.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    images01 = outscale.get_images(filters=[
        outscale.GetImagesFilterArgs(
            name="account_aliases",
            values=["Outscale"],
        ),
        outscale.GetImagesFilterArgs(
            name="image_names",
            values=[
                "Ubuntu*",
                "RockyLinux*",
            ],
        ),
    ])
    ```


    :param Sequence[str] account_ids: The account IDs of the owners of the OMIs. By default, all the OMIs for which you have launch permissions are described.
    :param Sequence[pulumi.InputType['GetImagesFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param Sequence[str] image_ids: The IDs of the OMIs.
    """
    __args__ = dict()
    __args__['accountIds'] = account_ids
    __args__['filters'] = filters
    __args__['imageIds'] = image_ids
    __args__['permissions'] = permissions
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getImages:getImages', __args__, opts=opts, typ=GetImagesResult).value

    return AwaitableGetImagesResult(
        account_ids=pulumi.get(__ret__, 'account_ids'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        image_ids=pulumi.get(__ret__, 'image_ids'),
        images=pulumi.get(__ret__, 'images'),
        permissions=pulumi.get(__ret__, 'permissions'),
        request_id=pulumi.get(__ret__, 'request_id'))


@_utilities.lift_output_func(get_images)
def get_images_output(account_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                      filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetImagesFilterArgs']]]]] = None,
                      image_ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                      permissions: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImagesResult]:
    """
    Provides information about images.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-OMIs.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-image).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_outscale as outscale

    images01 = outscale.get_images(filters=[
        outscale.GetImagesFilterArgs(
            name="account_aliases",
            values=["Outscale"],
        ),
        outscale.GetImagesFilterArgs(
            name="image_names",
            values=[
                "Ubuntu*",
                "RockyLinux*",
            ],
        ),
    ])
    ```


    :param Sequence[str] account_ids: The account IDs of the owners of the OMIs. By default, all the OMIs for which you have launch permissions are described.
    :param Sequence[pulumi.InputType['GetImagesFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    :param Sequence[str] image_ids: The IDs of the OMIs.
    """
    ...
