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

__all__ = [
    'GetPulicCatalogResult',
    'AwaitableGetPulicCatalogResult',
    'get_pulic_catalog',
    'get_pulic_catalog_output',
]

@pulumi.output_type
class GetPulicCatalogResult:
    """
    A collection of values returned by getPulicCatalog.
    """
    def __init__(__self__, catalogs=None, id=None, request_id=None):
        if catalogs and not isinstance(catalogs, list):
            raise TypeError("Expected argument 'catalogs' to be a list")
        pulumi.set(__self__, "catalogs", catalogs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)

    @property
    @pulumi.getter
    def catalogs(self) -> Sequence['outputs.GetPulicCatalogCatalogResult']:
        return pulumi.get(self, "catalogs")

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


class AwaitableGetPulicCatalogResult(GetPulicCatalogResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPulicCatalogResult(
            catalogs=self.catalogs,
            id=self.id,
            request_id=self.request_id)


def get_pulic_catalog(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPulicCatalogResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getPulicCatalog:getPulicCatalog', __args__, opts=opts, typ=GetPulicCatalogResult).value

    return AwaitableGetPulicCatalogResult(
        catalogs=pulumi.get(__ret__, 'catalogs'),
        id=pulumi.get(__ret__, 'id'),
        request_id=pulumi.get(__ret__, 'request_id'))


@_utilities.lift_output_func(get_pulic_catalog)
def get_pulic_catalog_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPulicCatalogResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...