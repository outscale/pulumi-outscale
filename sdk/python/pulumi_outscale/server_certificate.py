# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ServerCertificateArgs', 'ServerCertificate']

@pulumi.input_type
class ServerCertificateArgs:
    def __init__(__self__, *,
                 body: Optional[pulumi.Input[str]] = None,
                 chain: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServerCertificate resource.
        :param pulumi.Input[str] body: The PEM-encoded X509 certificate.
        :param pulumi.Input[str] chain: The PEM-encoded intermediate certification authorities.
        :param pulumi.Input[str] name: A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        :param pulumi.Input[str] path: The path to the server certificate, set to a slash (/) if not specified.
        :param pulumi.Input[str] private_key: The PEM-encoded private key matching the certificate.
        """
        if body is not None:
            pulumi.set(__self__, "body", body)
        if chain is not None:
            pulumi.set(__self__, "chain", chain)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)

    @property
    @pulumi.getter
    def body(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM-encoded X509 certificate.
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter
    def chain(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM-encoded intermediate certification authorities.
        """
        return pulumi.get(self, "chain")

    @chain.setter
    def chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "chain", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The path to the server certificate, set to a slash (/) if not specified.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM-encoded private key matching the certificate.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)


@pulumi.input_type
class _ServerCertificateState:
    def __init__(__self__, *,
                 body: Optional[pulumi.Input[str]] = None,
                 chain: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[str]] = None,
                 expiration_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 orn: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 upload_date: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServerCertificate resources.
        :param pulumi.Input[str] body: The PEM-encoded X509 certificate.
        :param pulumi.Input[str] chain: The PEM-encoded intermediate certification authorities.
        :param pulumi.Input[str] expiration_date: The date at which the server certificate expires.
        :param pulumi.Input[str] name: A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        :param pulumi.Input[str] orn: The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers > Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        :param pulumi.Input[str] path: The path to the server certificate, set to a slash (/) if not specified.
        :param pulumi.Input[str] private_key: The PEM-encoded private key matching the certificate.
        :param pulumi.Input[str] upload_date: The date at which the server certificate has been uploaded.
        """
        if body is not None:
            pulumi.set(__self__, "body", body)
        if chain is not None:
            pulumi.set(__self__, "chain", chain)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if expiration_date is not None:
            pulumi.set(__self__, "expiration_date", expiration_date)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if orn is not None:
            pulumi.set(__self__, "orn", orn)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)
        if upload_date is not None:
            pulumi.set(__self__, "upload_date", upload_date)

    @property
    @pulumi.getter
    def body(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM-encoded X509 certificate.
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter
    def chain(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM-encoded intermediate certification authorities.
        """
        return pulumi.get(self, "chain")

    @chain.setter
    def chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "chain", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date at which the server certificate expires.
        """
        return pulumi.get(self, "expiration_date")

    @expiration_date.setter
    def expiration_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_date", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def orn(self) -> Optional[pulumi.Input[str]]:
        """
        The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers > Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        """
        return pulumi.get(self, "orn")

    @orn.setter
    def orn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "orn", value)

    @property
    @pulumi.getter
    def path(self) -> Optional[pulumi.Input[str]]:
        """
        The path to the server certificate, set to a slash (/) if not specified.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM-encoded private key matching the certificate.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "request_id")

    @request_id.setter
    def request_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_id", value)

    @property
    @pulumi.getter(name="uploadDate")
    def upload_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date at which the server certificate has been uploaded.
        """
        return pulumi.get(self, "upload_date")

    @upload_date.setter
    def upload_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "upload_date", value)


class ServerCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 chain: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a server certificate.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_outscale as outscale

        server_certificate01 = outscale.ServerCertificate("serverCertificate01",
            body=(lambda path: open(path).read())("<PATH>"),
            chain=(lambda path: open(path).read())("<PATH>"),
            private_key=(lambda path: open(path).read())("<PATH>"),
            path="<PATH>")
        ```

        ## Import

        A server certificate can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/serverCertificate:ServerCertificate ImportedServerCertificate 0123456789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] body: The PEM-encoded X509 certificate.
        :param pulumi.Input[str] chain: The PEM-encoded intermediate certification authorities.
        :param pulumi.Input[str] name: A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        :param pulumi.Input[str] path: The path to the server certificate, set to a slash (/) if not specified.
        :param pulumi.Input[str] private_key: The PEM-encoded private key matching the certificate.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ServerCertificateArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a server certificate.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_outscale as outscale

        server_certificate01 = outscale.ServerCertificate("serverCertificate01",
            body=(lambda path: open(path).read())("<PATH>"),
            chain=(lambda path: open(path).read())("<PATH>"),
            private_key=(lambda path: open(path).read())("<PATH>"),
            path="<PATH>")
        ```

        ## Import

        A server certificate can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/serverCertificate:ServerCertificate ImportedServerCertificate 0123456789
        ```

        :param str resource_name: The name of the resource.
        :param ServerCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 chain: Optional[pulumi.Input[str]] = None,
                 dry_run: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 path: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerCertificateArgs.__new__(ServerCertificateArgs)

            __props__.__dict__["body"] = body
            __props__.__dict__["chain"] = chain
            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["name"] = name
            __props__.__dict__["path"] = path
            __props__.__dict__["private_key"] = private_key
            __props__.__dict__["expiration_date"] = None
            __props__.__dict__["orn"] = None
            __props__.__dict__["request_id"] = None
            __props__.__dict__["upload_date"] = None
        super(ServerCertificate, __self__).__init__(
            'outscale:index/serverCertificate:ServerCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            body: Optional[pulumi.Input[str]] = None,
            chain: Optional[pulumi.Input[str]] = None,
            dry_run: Optional[pulumi.Input[str]] = None,
            expiration_date: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            orn: Optional[pulumi.Input[str]] = None,
            path: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            request_id: Optional[pulumi.Input[str]] = None,
            upload_date: Optional[pulumi.Input[str]] = None) -> 'ServerCertificate':
        """
        Get an existing ServerCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] body: The PEM-encoded X509 certificate.
        :param pulumi.Input[str] chain: The PEM-encoded intermediate certification authorities.
        :param pulumi.Input[str] expiration_date: The date at which the server certificate expires.
        :param pulumi.Input[str] name: A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        :param pulumi.Input[str] orn: The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers > Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        :param pulumi.Input[str] path: The path to the server certificate, set to a slash (/) if not specified.
        :param pulumi.Input[str] private_key: The PEM-encoded private key matching the certificate.
        :param pulumi.Input[str] upload_date: The date at which the server certificate has been uploaded.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerCertificateState.__new__(_ServerCertificateState)

        __props__.__dict__["body"] = body
        __props__.__dict__["chain"] = chain
        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["expiration_date"] = expiration_date
        __props__.__dict__["name"] = name
        __props__.__dict__["orn"] = orn
        __props__.__dict__["path"] = path
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["request_id"] = request_id
        __props__.__dict__["upload_date"] = upload_date
        return ServerCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def body(self) -> pulumi.Output[Optional[str]]:
        """
        The PEM-encoded X509 certificate.
        """
        return pulumi.get(self, "body")

    @property
    @pulumi.getter
    def chain(self) -> pulumi.Output[Optional[str]]:
        """
        The PEM-encoded intermediate certification authorities.
        """
        return pulumi.get(self, "chain")

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> pulumi.Output[str]:
        """
        The date at which the server certificate expires.
        """
        return pulumi.get(self, "expiration_date")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def orn(self) -> pulumi.Output[str]:
        """
        The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers > Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        """
        return pulumi.get(self, "orn")

    @property
    @pulumi.getter
    def path(self) -> pulumi.Output[str]:
        """
        The path to the server certificate, set to a slash (/) if not specified.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[Optional[str]]:
        """
        The PEM-encoded private key matching the certificate.
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="uploadDate")
    def upload_date(self) -> pulumi.Output[str]:
        """
        The date at which the server certificate has been uploaded.
        """
        return pulumi.get(self, "upload_date")

