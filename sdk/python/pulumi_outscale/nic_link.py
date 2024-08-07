# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['NicLinkArgs', 'NicLink']

@pulumi.input_type
class NicLinkArgs:
    def __init__(__self__, *,
                 device_number: pulumi.Input[int],
                 nic_id: pulumi.Input[str],
                 vm_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a NicLink resource.
        :param pulumi.Input[int] device_number: The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        :param pulumi.Input[str] nic_id: The ID of the NIC you want to attach.
        :param pulumi.Input[str] vm_id: The ID of the VM to which you want to attach the NIC.
        """
        pulumi.set(__self__, "device_number", device_number)
        pulumi.set(__self__, "nic_id", nic_id)
        pulumi.set(__self__, "vm_id", vm_id)

    @property
    @pulumi.getter(name="deviceNumber")
    def device_number(self) -> pulumi.Input[int]:
        """
        The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        """
        return pulumi.get(self, "device_number")

    @device_number.setter
    def device_number(self, value: pulumi.Input[int]):
        pulumi.set(self, "device_number", value)

    @property
    @pulumi.getter(name="nicId")
    def nic_id(self) -> pulumi.Input[str]:
        """
        The ID of the NIC you want to attach.
        """
        return pulumi.get(self, "nic_id")

    @nic_id.setter
    def nic_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "nic_id", value)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> pulumi.Input[str]:
        """
        The ID of the VM to which you want to attach the NIC.
        """
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vm_id", value)


@pulumi.input_type
class _NicLinkState:
    def __init__(__self__, *,
                 delete_on_vm_deletion: Optional[pulumi.Input[bool]] = None,
                 device_number: Optional[pulumi.Input[int]] = None,
                 link_nic_id: Optional[pulumi.Input[str]] = None,
                 nic_id: Optional[pulumi.Input[str]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 vm_account_id: Optional[pulumi.Input[str]] = None,
                 vm_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NicLink resources.
        :param pulumi.Input[int] device_number: The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        :param pulumi.Input[str] link_nic_id: The ID of the NIC attachment.
        :param pulumi.Input[str] nic_id: The ID of the NIC you want to attach.
        :param pulumi.Input[str] vm_id: The ID of the VM to which you want to attach the NIC.
        """
        if delete_on_vm_deletion is not None:
            pulumi.set(__self__, "delete_on_vm_deletion", delete_on_vm_deletion)
        if device_number is not None:
            pulumi.set(__self__, "device_number", device_number)
        if link_nic_id is not None:
            pulumi.set(__self__, "link_nic_id", link_nic_id)
        if nic_id is not None:
            pulumi.set(__self__, "nic_id", nic_id)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if vm_account_id is not None:
            pulumi.set(__self__, "vm_account_id", vm_account_id)
        if vm_id is not None:
            pulumi.set(__self__, "vm_id", vm_id)

    @property
    @pulumi.getter(name="deleteOnVmDeletion")
    def delete_on_vm_deletion(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "delete_on_vm_deletion")

    @delete_on_vm_deletion.setter
    def delete_on_vm_deletion(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_on_vm_deletion", value)

    @property
    @pulumi.getter(name="deviceNumber")
    def device_number(self) -> Optional[pulumi.Input[int]]:
        """
        The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        """
        return pulumi.get(self, "device_number")

    @device_number.setter
    def device_number(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "device_number", value)

    @property
    @pulumi.getter(name="linkNicId")
    def link_nic_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the NIC attachment.
        """
        return pulumi.get(self, "link_nic_id")

    @link_nic_id.setter
    def link_nic_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "link_nic_id", value)

    @property
    @pulumi.getter(name="nicId")
    def nic_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the NIC you want to attach.
        """
        return pulumi.get(self, "nic_id")

    @nic_id.setter
    def nic_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nic_id", value)

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "request_id")

    @request_id.setter
    def request_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter(name="vmAccountId")
    def vm_account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "vm_account_id")

    @vm_account_id.setter
    def vm_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vm_account_id", value)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VM to which you want to attach the NIC.
        """
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vm_id", value)


class NicLink(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_number: Optional[pulumi.Input[int]] = None,
                 nic_id: Optional[pulumi.Input[str]] = None,
                 vm_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a NIC link.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-FNIs.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-nic).

        ## Example Usage
        ### Required resources

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net01 = outscale.Net("net01", ip_range="10.0.0.0/16")
        subnet01 = outscale.Subnet("subnet01",
            subregion_name=f"{var['region']}a",
            ip_range="10.0.0.0/16",
            net_id=net01.net_id)
        vm01 = outscale.Vm("vm01",
            image_id=var["image_id"],
            vm_type=var["vm_type"],
            keypair_name=var["keypair_name"],
            subnet_id=subnet01.subnet_id)
        nic01 = outscale.Nic("nic01", subnet_id=subnet01.subnet_id)
        ```
        ### Link a NIC to a VM

        ```python
        import pulumi
        import pulumi_outscale as outscale

        nic_link01 = outscale.NicLink("nicLink01",
            device_number=1,
            vm_id=outscale_vm["vm01"]["vm_id"],
            nic_id=outscale_nic["nic01"]["nic_id"])
        ```

        ## Import

        A NIC link can be imported using the NIC ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/nicLink:NicLink ImportedNicLink eni-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] device_number: The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        :param pulumi.Input[str] nic_id: The ID of the NIC you want to attach.
        :param pulumi.Input[str] vm_id: The ID of the VM to which you want to attach the NIC.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NicLinkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a NIC link.

        For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-FNIs.html).\\
        For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-nic).

        ## Example Usage
        ### Required resources

        ```python
        import pulumi
        import pulumi_outscale as outscale

        net01 = outscale.Net("net01", ip_range="10.0.0.0/16")
        subnet01 = outscale.Subnet("subnet01",
            subregion_name=f"{var['region']}a",
            ip_range="10.0.0.0/16",
            net_id=net01.net_id)
        vm01 = outscale.Vm("vm01",
            image_id=var["image_id"],
            vm_type=var["vm_type"],
            keypair_name=var["keypair_name"],
            subnet_id=subnet01.subnet_id)
        nic01 = outscale.Nic("nic01", subnet_id=subnet01.subnet_id)
        ```
        ### Link a NIC to a VM

        ```python
        import pulumi
        import pulumi_outscale as outscale

        nic_link01 = outscale.NicLink("nicLink01",
            device_number=1,
            vm_id=outscale_vm["vm01"]["vm_id"],
            nic_id=outscale_nic["nic01"]["nic_id"])
        ```

        ## Import

        A NIC link can be imported using the NIC ID. For exampleconsole

        ```sh
         $ pulumi import outscale:index/nicLink:NicLink ImportedNicLink eni-12345678
        ```

        :param str resource_name: The name of the resource.
        :param NicLinkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NicLinkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_number: Optional[pulumi.Input[int]] = None,
                 nic_id: Optional[pulumi.Input[str]] = None,
                 vm_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NicLinkArgs.__new__(NicLinkArgs)

            if device_number is None and not opts.urn:
                raise TypeError("Missing required property 'device_number'")
            __props__.__dict__["device_number"] = device_number
            if nic_id is None and not opts.urn:
                raise TypeError("Missing required property 'nic_id'")
            __props__.__dict__["nic_id"] = nic_id
            if vm_id is None and not opts.urn:
                raise TypeError("Missing required property 'vm_id'")
            __props__.__dict__["vm_id"] = vm_id
            __props__.__dict__["delete_on_vm_deletion"] = None
            __props__.__dict__["link_nic_id"] = None
            __props__.__dict__["request_id"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["vm_account_id"] = None
        super(NicLink, __self__).__init__(
            'outscale:index/nicLink:NicLink',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_on_vm_deletion: Optional[pulumi.Input[bool]] = None,
            device_number: Optional[pulumi.Input[int]] = None,
            link_nic_id: Optional[pulumi.Input[str]] = None,
            nic_id: Optional[pulumi.Input[str]] = None,
            request_id: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            vm_account_id: Optional[pulumi.Input[str]] = None,
            vm_id: Optional[pulumi.Input[str]] = None) -> 'NicLink':
        """
        Get an existing NicLink resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] device_number: The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        :param pulumi.Input[str] link_nic_id: The ID of the NIC attachment.
        :param pulumi.Input[str] nic_id: The ID of the NIC you want to attach.
        :param pulumi.Input[str] vm_id: The ID of the VM to which you want to attach the NIC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NicLinkState.__new__(_NicLinkState)

        __props__.__dict__["delete_on_vm_deletion"] = delete_on_vm_deletion
        __props__.__dict__["device_number"] = device_number
        __props__.__dict__["link_nic_id"] = link_nic_id
        __props__.__dict__["nic_id"] = nic_id
        __props__.__dict__["request_id"] = request_id
        __props__.__dict__["state"] = state
        __props__.__dict__["vm_account_id"] = vm_account_id
        __props__.__dict__["vm_id"] = vm_id
        return NicLink(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deleteOnVmDeletion")
    def delete_on_vm_deletion(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "delete_on_vm_deletion")

    @property
    @pulumi.getter(name="deviceNumber")
    def device_number(self) -> pulumi.Output[int]:
        """
        The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        """
        return pulumi.get(self, "device_number")

    @property
    @pulumi.getter(name="linkNicId")
    def link_nic_id(self) -> pulumi.Output[str]:
        """
        The ID of the NIC attachment.
        """
        return pulumi.get(self, "link_nic_id")

    @property
    @pulumi.getter(name="nicId")
    def nic_id(self) -> pulumi.Output[str]:
        """
        The ID of the NIC you want to attach.
        """
        return pulumi.get(self, "nic_id")

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "request_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="vmAccountId")
    def vm_account_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "vm_account_id")

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> pulumi.Output[str]:
        """
        The ID of the VM to which you want to attach the NIC.
        """
        return pulumi.get(self, "vm_id")

