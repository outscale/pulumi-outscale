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
    'GetServerCertificatesResult',
    'AwaitableGetServerCertificatesResult',
    'get_server_certificates',
    'get_server_certificates_output',
]

@pulumi.output_type
class GetServerCertificatesResult:
    """
    A collection of values returned by getServerCertificates.
    """
    def __init__(__self__, filters=None, id=None, request_id=None, server_certificates=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_id and not isinstance(request_id, str):
            raise TypeError("Expected argument 'request_id' to be a str")
        pulumi.set(__self__, "request_id", request_id)
        if server_certificates and not isinstance(server_certificates, list):
            raise TypeError("Expected argument 'server_certificates' to be a list")
        pulumi.set(__self__, "server_certificates", server_certificates)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetServerCertificatesFilterResult']]:
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
    @pulumi.getter(name="serverCertificates")
    def server_certificates(self) -> Sequence['outputs.GetServerCertificatesServerCertificateResult']:
        """
        Information about one or more server certificates.
        """
        return pulumi.get(self, "server_certificates")


class AwaitableGetServerCertificatesResult(GetServerCertificatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServerCertificatesResult(
            filters=self.filters,
            id=self.id,
            request_id=self.request_id,
            server_certificates=self.server_certificates)


def get_server_certificates(filters: Optional[Sequence[pulumi.InputType['GetServerCertificatesFilterArgs']]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServerCertificatesResult:
    """
    Provides information about server certificates.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).

    ## Example Usage
    ### Read specific server certificates

    ```python
    import pulumi
    import pulumi_outscale as outscale

    server_certificates01 = outscale.get_server_certificates(filters=[outscale.GetServerCertificatesFilterArgs(
        name="paths",
        values=[
            "<PATH01>",
            "<PATH02>",
        ],
    )])
    ```
    ### Read all server certificates

    ```python
    import pulumi
    import pulumi_outscale as outscale

    all_server_certificates = outscale.get_server_certificates()
    ```


    :param Sequence[pulumi.InputType['GetServerCertificatesFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('outscale:index/getServerCertificates:getServerCertificates', __args__, opts=opts, typ=GetServerCertificatesResult).value

    return AwaitableGetServerCertificatesResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        request_id=pulumi.get(__ret__, 'request_id'),
        server_certificates=pulumi.get(__ret__, 'server_certificates'))


@_utilities.lift_output_func(get_server_certificates)
def get_server_certificates_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetServerCertificatesFilterArgs']]]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServerCertificatesResult]:
    """
    Provides information about server certificates.

    For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).\\
    For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).

    ## Example Usage
    ### Read specific server certificates

    ```python
    import pulumi
    import pulumi_outscale as outscale

    server_certificates01 = outscale.get_server_certificates(filters=[outscale.GetServerCertificatesFilterArgs(
        name="paths",
        values=[
            "<PATH01>",
            "<PATH02>",
        ],
    )])
    ```
    ### Read all server certificates

    ```python
    import pulumi
    import pulumi_outscale as outscale

    all_server_certificates = outscale.get_server_certificates()
    ```


    :param Sequence[pulumi.InputType['GetServerCertificatesFilterArgs']] filters: A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
    """
    ...
