# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AccessKeyArgs', 'AccessKey']

@pulumi.input_type
class AccessKeyArgs:
    def __init__(__self__, *,
                 expiration_date: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessKey resource.
        :param pulumi.Input[str] expiration_date: The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
        :param pulumi.Input[str] state: The state for the access key (`ACTIVE` | `INACTIVE`).
        """
        if expiration_date is not None:
            pulumi.set(__self__, "expiration_date", expiration_date)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
        """
        return pulumi.get(self, "expiration_date")

    @expiration_date.setter
    def expiration_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_date", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state for the access key (`ACTIVE` | `INACTIVE`).
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


@pulumi.input_type
class _AccessKeyState:
    def __init__(__self__, *,
                 access_key_id: Optional[pulumi.Input[str]] = None,
                 creation_date: Optional[pulumi.Input[str]] = None,
                 expiration_date: Optional[pulumi.Input[str]] = None,
                 last_modification_date: Optional[pulumi.Input[str]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessKey resources.
        :param pulumi.Input[str] access_key_id: The ID of the access key.
        :param pulumi.Input[str] creation_date: The date and time (UTC) of creation of the access key.
        :param pulumi.Input[str] expiration_date: The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
        :param pulumi.Input[str] last_modification_date: The date and time (UTC) of the last modification of the access key.
        :param pulumi.Input[str] secret_key: The access key that enables you to send requests.
        :param pulumi.Input[str] state: The state for the access key (`ACTIVE` | `INACTIVE`).
        """
        if access_key_id is not None:
            pulumi.set(__self__, "access_key_id", access_key_id)
        if creation_date is not None:
            pulumi.set(__self__, "creation_date", creation_date)
        if expiration_date is not None:
            pulumi.set(__self__, "expiration_date", expiration_date)
        if last_modification_date is not None:
            pulumi.set(__self__, "last_modification_date", last_modification_date)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)
        if secret_key is not None:
            pulumi.set(__self__, "secret_key", secret_key)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the access key.
        """
        return pulumi.get(self, "access_key_id")

    @access_key_id.setter
    def access_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key_id", value)

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time (UTC) of creation of the access key.
        """
        return pulumi.get(self, "creation_date")

    @creation_date.setter
    def creation_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_date", value)

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
        """
        return pulumi.get(self, "expiration_date")

    @expiration_date.setter
    def expiration_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_date", value)

    @property
    @pulumi.getter(name="lastModificationDate")
    def last_modification_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time (UTC) of the last modification of the access key.
        """
        return pulumi.get(self, "last_modification_date")

    @last_modification_date.setter
    def last_modification_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modification_date", value)

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "request_id")

    @request_id.setter
    def request_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_id", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[pulumi.Input[str]]:
        """
        The access key that enables you to send requests.
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_key", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state for the access key (`ACTIVE` | `INACTIVE`).
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


class AccessKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 expiration_date: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_outscale as outscale

        access_key01 = outscale.AccessKey("accessKey01",
            expiration_date="2023-01-01",
            state="ACTIVE")
        ```

        ## Import

        An access key can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/accessKey:AccessKey ImportedAccessKey ABCDEFGHIJ0123456789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] expiration_date: The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
        :param pulumi.Input[str] state: The state for the access key (`ACTIVE` | `INACTIVE`).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AccessKeyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_outscale as outscale

        access_key01 = outscale.AccessKey("accessKey01",
            expiration_date="2023-01-01",
            state="ACTIVE")
        ```

        ## Import

        An access key can be imported using its ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/accessKey:AccessKey ImportedAccessKey ABCDEFGHIJ0123456789
        ```

        :param str resource_name: The name of the resource.
        :param AccessKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 expiration_date: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessKeyArgs.__new__(AccessKeyArgs)

            __props__.__dict__["expiration_date"] = expiration_date
            __props__.__dict__["state"] = state
            __props__.__dict__["access_key_id"] = None
            __props__.__dict__["creation_date"] = None
            __props__.__dict__["last_modification_date"] = None
            __props__.__dict__["request_id"] = None
            __props__.__dict__["secret_key"] = None
        super(AccessKey, __self__).__init__(
            'outscale:index/accessKey:AccessKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_key_id: Optional[pulumi.Input[str]] = None,
            creation_date: Optional[pulumi.Input[str]] = None,
            expiration_date: Optional[pulumi.Input[str]] = None,
            last_modification_date: Optional[pulumi.Input[str]] = None,
            request_id: Optional[pulumi.Input[str]] = None,
            secret_key: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None) -> 'AccessKey':
        """
        Get an existing AccessKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key_id: The ID of the access key.
        :param pulumi.Input[str] creation_date: The date and time (UTC) of creation of the access key.
        :param pulumi.Input[str] expiration_date: The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
        :param pulumi.Input[str] last_modification_date: The date and time (UTC) of the last modification of the access key.
        :param pulumi.Input[str] secret_key: The access key that enables you to send requests.
        :param pulumi.Input[str] state: The state for the access key (`ACTIVE` | `INACTIVE`).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessKeyState.__new__(_AccessKeyState)

        __props__.__dict__["access_key_id"] = access_key_id
        __props__.__dict__["creation_date"] = creation_date
        __props__.__dict__["expiration_date"] = expiration_date
        __props__.__dict__["last_modification_date"] = last_modification_date
        __props__.__dict__["request_id"] = request_id
        __props__.__dict__["secret_key"] = secret_key
        __props__.__dict__["state"] = state
        return AccessKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> pulumi.Output[str]:
        """
        The ID of the access key.
        """
        return pulumi.get(self, "access_key_id")

    @property
    @pulumi.getter(name="creationDate")
    def creation_date(self) -> pulumi.Output[str]:
        """
        The date and time (UTC) of creation of the access key.
        """
        return pulumi.get(self, "creation_date")

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> pulumi.Output[Optional[str]]:
        """
        The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, `2020-06-14T00:00:00.000Z`, or `2020-06-14`). To remove an existing expiration date, use the method without specifying this parameter.
        """
        return pulumi.get(self, "expiration_date")

    @property
    @pulumi.getter(name="lastModificationDate")
    def last_modification_date(self) -> pulumi.Output[str]:
        """
        The date and time (UTC) of the last modification of the access key.
        """
        return pulumi.get(self, "last_modification_date")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> pulumi.Output[str]:
        """
        The access key that enables you to send requests.
        """
        return pulumi.get(self, "secret_key")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[Optional[str]]:
        """
        The state for the access key (`ACTIVE` | `INACTIVE`).
        """
        return pulumi.get(self, "state")

