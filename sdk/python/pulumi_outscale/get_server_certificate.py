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
    'GetServerCertificateResult',
    'AwaitableGetServerCertificateResult',
    'get_server_certificate',
    'get_server_certificate_output',
]

@pulumi.output_type
class GetServerCertificateResult:
    """
    A collection of values returned by getServerCertificate.
    """
    def __init__(__self__, expiration_date=None, filters=None, id=None, name=None, orn=None, path=None, request_id=None, upload_date=None):
        if expiration_date and not isinstance(expiration_date, str):
            raise TypeError("Expected argument 'expiration_date' to be a str")
        pulumi.set(__self__, "expiration_date", expiration_date)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if orn and not isinstance(orn, str):
            raise TypeError("Expected argument 'orn' to be a str")
        pulumi.set(__self__, "orn", orn)
        if path and not isinstance(path, str):
            raise TypeError("Expected argument 'path' to be a str")
        pulumi.set(__self__, "path", path)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if upload_date and not isinstance(upload_date, str):
            raise TypeError("Expected argument 'upload_date' to be a str")
        pulumi.set(__self__, "upload_date", upload_date)

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> str:
        """
        The date at which the server certificate expires.
        """
        return pulumi.get(self, "expiration_date")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetServerCertificateFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the server certificate.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def orn(self) -> str:
        """
        The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers > Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        """
        return pulumi.get(self, "orn")

    @property
    @pulumi.getter
    def path(self) -> str:
        """
        The path to the server certificate.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> str:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="uploadDate")
    def upload_date(self) -> str:
        """
        The date at which the server certificate has been uploaded.
        """
        return pulumi.get(self, "upload_date")


class AwaitableGetServerCertificateResult(GetServerCertificateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServerCertificateResult(
            expiration_date=self.expiration_date,
            filters=self.filters,
            id=self.id,
            name=self.name,
            orn=self.orn,
            path=self.path,
            request_id=self.request_id,
            upload_date=self.upload_date)


def get_server_certificate(filters: Optional[Sequence[pulumi.InputType['GetServerCertificateFilterArgs']]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServerCertificateResult:
    """
    Provides information about a server certificate.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).


    :param Sequence[pulumi.InputType['GetServerCertificateFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getServerCertificate:getServerCertificate', __args__, opts=opts, typ=GetServerCertificateResult).value

    return AwaitableGetServerCertificateResult(
        expiration_date=pulumi.get(__ret__, 'expiration_date'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        orn=pulumi.get(__ret__, 'orn'),
        path=pulumi.get(__ret__, 'path'),
        request_id=pulumi.get(__ret__, 'request_id'),
        upload_date=pulumi.get(__ret__, 'upload_date'))


@_utilities.lift_output_func(get_server_certificate)
def get_server_certificate_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetServerCertificateFilterArgs']]]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServerCertificateResult]:
    """
    Provides information about a server certificate.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).


    :param Sequence[pulumi.InputType['GetServerCertificateFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...
