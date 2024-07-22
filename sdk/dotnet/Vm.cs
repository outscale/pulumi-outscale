// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    /// <summary>
    /// Manages a virtual machine (VM).
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Instances.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-vm).
    /// 
    /// ## Example Usage
    /// ### Optional resource
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var keypair01 = new Outscale.Keypair("keypair01", new()
    ///     {
    ///         KeypairName = "terraform-keypair-for-vm",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a VM with block device mappings
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var vm02 = new Outscale.Vm("vm02", new()
    ///     {
    ///         ImageId = @var.Image_id,
    ///         VmType = @var.Vm_type,
    ///         KeypairName = @var.Keypair_name,
    ///         BlockDeviceMappings = new[]
    ///         {
    ///             new Outscale.Inputs.VmBlockDeviceMappingArgs
    ///             {
    ///                 DeviceName = "/dev/sda1",
    ///                 Bsu = new Outscale.Inputs.VmBlockDeviceMappingBsuArgs
    ///                 {
    ///                     VolumeSize = 15,
    ///                     VolumeType = "gp2",
    ///                     SnapshotId = @var.Snapshot_id,
    ///                 },
    ///             },
    ///             new Outscale.Inputs.VmBlockDeviceMappingArgs
    ///             {
    ///                 DeviceName = "/dev/sdb",
    ///                 Bsu = new Outscale.Inputs.VmBlockDeviceMappingBsuArgs
    ///                 {
    ///                     VolumeSize = 22,
    ///                     VolumeType = "io1",
    ///                     Iops = 150,
    ///                     DeleteOnVmDeletion = true,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a VM in a Net with a network
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var net01 = new Outscale.Net("net01", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.NetTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-net-for-vm",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var subnet01 = new Outscale.Subnet("subnet01", new()
    ///     {
    ///         NetId = net01.NetId,
    ///         IpRange = "10.0.0.0/24",
    ///         SubregionName = "eu-west-2b",
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.SubnetTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-subnet-for-vm",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var securityGroup01 = new Outscale.SecurityGroup("securityGroup01", new()
    ///     {
    ///         Description = "Terraform security group for VM",
    ///         SecurityGroupName = "terraform-security-group-for-vm",
    ///         NetId = net01.NetId,
    ///     });
    /// 
    ///     var internetService01 = new Outscale.InternetService("internetService01");
    /// 
    ///     var routeTable01 = new Outscale.RouteTable("routeTable01", new()
    ///     {
    ///         NetId = net01.NetId,
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.RouteTableTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-route-table-for-vm",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var routeTableLink01 = new Outscale.RouteTableLink("routeTableLink01", new()
    ///     {
    ///         RouteTableId = routeTable01.RouteTableId,
    ///         SubnetId = subnet01.SubnetId,
    ///     });
    /// 
    ///     var internetServiceLink01 = new Outscale.InternetServiceLink("internetServiceLink01", new()
    ///     {
    ///         InternetServiceId = internetService01.InternetServiceId,
    ///         NetId = net01.NetId,
    ///     });
    /// 
    ///     var route01 = new Outscale.Route("route01", new()
    ///     {
    ///         GatewayId = internetService01.InternetServiceId,
    ///         DestinationIpRange = "0.0.0.0/0",
    ///         RouteTableId = routeTable01.RouteTableId,
    ///     });
    /// 
    ///     var vm03 = new Outscale.Vm("vm03", new()
    ///     {
    ///         ImageId = @var.Image_id,
    ///         VmType = @var.Vm_type,
    ///         KeypairName = @var.Keypair_name,
    ///         SecurityGroupIds = new[]
    ///         {
    ///             securityGroup01.SecurityGroupId,
    ///         },
    ///         SubnetId = subnet01.SubnetId,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a VM with a NIC
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var net02 = new Outscale.Net("net02", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.NetTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-net-for-vm-with-nic",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var subnet02 = new Outscale.Subnet("subnet02", new()
    ///     {
    ///         NetId = net02.NetId,
    ///         IpRange = "10.0.0.0/24",
    ///         SubregionName = "eu-west-2a",
    ///         Tags = new[]
    ///         {
    ///             new Outscale.Inputs.SubnetTagArgs
    ///             {
    ///                 Key = "name",
    ///                 Value = "terraform-subnet-for-vm-with-nic",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var nic01 = new Outscale.Nic("nic01", new()
    ///     {
    ///         SubnetId = subnet02.SubnetId,
    ///     });
    /// 
    ///     var vm04 = new Outscale.Vm("vm04", new()
    ///     {
    ///         ImageId = @var.Image_id,
    ///         VmType = "c4.large",
    ///         KeypairName = @var.Keypair_name,
    ///         PrimaryNics = new[]
    ///         {
    ///             new Outscale.Inputs.VmPrimaryNicArgs
    ///             {
    ///                 NicId = nic01.NicId,
    ///                 DeviceNumber = 0,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A VM can be imported using its ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/vm:Vm ImportedVm i-12345678
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/vm:Vm")]
    public partial class Vm : global::Pulumi.CustomResource
    {
        [Output("adminPassword")]
        public Output<string> AdminPassword { get; private set; } = null!;

        /// <summary>
        /// The architecture of the VM (`i386` \| `x86_64`).
        /// </summary>
        [Output("architecture")]
        public Output<string> Architecture { get; private set; } = null!;

        /// <summary>
        /// One or more block device mappings.
        /// </summary>
        [Output("blockDeviceMappings")]
        public Output<ImmutableArray<Outputs.VmBlockDeviceMapping>> BlockDeviceMappings { get; private set; } = null!;

        /// <summary>
        /// The block device mapping of the VM.
        /// </summary>
        [Output("blockDeviceMappingsCreateds")]
        public Output<ImmutableArray<Outputs.VmBlockDeviceMappingsCreated>> BlockDeviceMappingsCreateds { get; private set; } = null!;

        [Output("bsuOptimized")]
        public Output<bool> BsuOptimized { get; private set; } = null!;

        /// <summary>
        /// A unique identifier which enables you to manage the idempotency.
        /// </summary>
        [Output("clientToken")]
        public Output<string> ClientToken { get; private set; } = null!;

        /// <summary>
        /// The date and time of creation of the VM.
        /// </summary>
        [Output("creationDate")]
        public Output<string> CreationDate { get; private set; } = null!;

        /// <summary>
        /// If true, you cannot delete the VM unless you change this parameter back to false.
        /// </summary>
        [Output("deletionProtection")]
        public Output<bool> DeletionProtection { get; private set; } = null!;

        /// <summary>
        /// (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `admin_password` attribute.
        /// </summary>
        [Output("getAdminPassword")]
        public Output<bool?> GetAdminPassword { get; private set; } = null!;

        /// <summary>
        /// The hypervisor type of the VMs (`ovm` \| `xen`).
        /// </summary>
        [Output("hypervisor")]
        public Output<string> Hypervisor { get; private set; } = null!;

        /// <summary>
        /// The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
        /// </summary>
        [Output("imageId")]
        public Output<string> ImageId { get; private set; } = null!;

        /// <summary>
        /// (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        /// </summary>
        [Output("isSourceDestChecked")]
        public Output<bool> IsSourceDestChecked { get; private set; } = null!;

        /// <summary>
        /// The name of the keypair.
        /// </summary>
        [Output("keypairName")]
        public Output<string> KeypairName { get; private set; } = null!;

        /// <summary>
        /// The number for the VM when launching a group of several VMs (for example, `0`, `1`, `2`, and so on).
        /// </summary>
        [Output("launchNumber")]
        public Output<int> LaunchNumber { get; private set; } = null!;

        /// <summary>
        /// (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
        /// </summary>
        [Output("nestedVirtualization")]
        public Output<bool?> NestedVirtualization { get; private set; } = null!;

        /// <summary>
        /// The ID of the Net for the NIC.
        /// </summary>
        [Output("netId")]
        public Output<string> NetId { get; private set; } = null!;

        /// <summary>
        /// One or more NICs. If you specify this parameter, you must not specify the `subnet_id` and `subregion_name` parameters. To define a NIC as the primary network interface of the VM, use the `primary_nic` argument.
        /// </summary>
        [Output("nics")]
        public Output<ImmutableArray<Outputs.VmNic>> Nics { get; private set; } = null!;

        /// <summary>
        /// Indicates the operating system (OS) of the VM.
        /// </summary>
        [Output("osFamily")]
        public Output<string> OsFamily { get; private set; } = null!;

        /// <summary>
        /// The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
        /// </summary>
        [Output("performance")]
        public Output<string> Performance { get; private set; } = null!;

        /// <summary>
        /// The name of the Subregion where the VM is placed.
        /// </summary>
        [Output("placementSubregionName")]
        public Output<string> PlacementSubregionName { get; private set; } = null!;

        /// <summary>
        /// The tenancy of the VM (`default` | `dedicated`).
        /// </summary>
        [Output("placementTenancy")]
        public Output<string> PlacementTenancy { get; private set; } = null!;

        /// <summary>
        /// The primary network interface of the VM.
        /// </summary>
        [Output("primaryNics")]
        public Output<ImmutableArray<Outputs.VmPrimaryNic>> PrimaryNics { get; private set; } = null!;

        /// <summary>
        /// The name of the private DNS.
        /// </summary>
        [Output("privateDnsName")]
        public Output<string> PrivateDnsName { get; private set; } = null!;

        /// <summary>
        /// The private IP of the NIC.
        /// </summary>
        [Output("privateIp")]
        public Output<string> PrivateIp { get; private set; } = null!;

        /// <summary>
        /// One or more private IPs of the VM.
        /// </summary>
        [Output("privateIps")]
        public Output<ImmutableArray<string>> PrivateIps { get; private set; } = null!;

        /// <summary>
        /// The product codes associated with the OMI used to create the VM.
        /// </summary>
        [Output("productCodes")]
        public Output<ImmutableArray<string>> ProductCodes { get; private set; } = null!;

        /// <summary>
        /// The name of the public DNS.
        /// </summary>
        [Output("publicDnsName")]
        public Output<string> PublicDnsName { get; private set; } = null!;

        /// <summary>
        /// The public IP of the VM.
        /// </summary>
        [Output("publicIp")]
        public Output<string> PublicIp { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The reservation ID of the VM.
        /// </summary>
        [Output("reservationId")]
        public Output<string> ReservationId { get; private set; } = null!;

        /// <summary>
        /// The name of the root device for the VM (for example, `/dev/vda1`).
        /// </summary>
        [Output("rootDeviceName")]
        public Output<string> RootDeviceName { get; private set; } = null!;

        /// <summary>
        /// The type of root device used by the VM (always `bsu`).
        /// </summary>
        [Output("rootDeviceType")]
        public Output<string> RootDeviceType { get; private set; } = null!;

        /// <summary>
        /// One or more IDs of security group for the VMs.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// One or more names of security groups for the VMs.
        /// </summary>
        [Output("securityGroupNames")]
        public Output<ImmutableArray<string>> SecurityGroupNames { get; private set; } = null!;

        /// <summary>
        /// One or more security groups associated with the VM.
        /// </summary>
        [Output("securityGroups")]
        public Output<ImmutableArray<Outputs.VmSecurityGroup>> SecurityGroups { get; private set; } = null!;

        /// <summary>
        /// The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
        /// </summary>
        [Output("state")]
        public Output<string?> State { get; private set; } = null!;

        /// <summary>
        /// The reason explaining the current state of the VM.
        /// </summary>
        [Output("stateReason")]
        public Output<string> StateReason { get; private set; } = null!;

        /// <summary>
        /// The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.VmTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;

        /// <summary>
        /// The ID of the VM.
        /// </summary>
        [Output("vmId")]
        public Output<string> VmId { get; private set; } = null!;

        /// <summary>
        /// The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
        /// </summary>
        [Output("vmInitiatedShutdownBehavior")]
        public Output<string> VmInitiatedShutdownBehavior { get; private set; } = null!;

        /// <summary>
        /// The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.&lt;br /&gt; For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
        /// </summary>
        [Output("vmType")]
        public Output<string> VmType { get; private set; } = null!;


        /// <summary>
        /// Create a Vm resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Vm(string name, VmArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/vm:Vm", name, args ?? new VmArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Vm(string name, Input<string> id, VmState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/vm:Vm", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Vm resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Vm Get(string name, Input<string> id, VmState? state = null, CustomResourceOptions? options = null)
        {
            return new Vm(name, id, state, options);
        }
    }

    public sealed class VmArgs : global::Pulumi.ResourceArgs
    {
        [Input("blockDeviceMappings")]
        private InputList<Inputs.VmBlockDeviceMappingArgs>? _blockDeviceMappings;

        /// <summary>
        /// One or more block device mappings.
        /// </summary>
        public InputList<Inputs.VmBlockDeviceMappingArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.VmBlockDeviceMappingArgs>());
            set => _blockDeviceMappings = value;
        }

        [Input("bsuOptimized")]
        public Input<bool>? BsuOptimized { get; set; }

        /// <summary>
        /// If true, you cannot delete the VM unless you change this parameter back to false.
        /// </summary>
        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        /// <summary>
        /// (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `admin_password` attribute.
        /// </summary>
        [Input("getAdminPassword")]
        public Input<bool>? GetAdminPassword { get; set; }

        /// <summary>
        /// The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
        /// </summary>
        [Input("imageId", required: true)]
        public Input<string> ImageId { get; set; } = null!;

        /// <summary>
        /// (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        /// </summary>
        [Input("isSourceDestChecked")]
        public Input<bool>? IsSourceDestChecked { get; set; }

        /// <summary>
        /// The name of the keypair.
        /// </summary>
        [Input("keypairName")]
        public Input<string>? KeypairName { get; set; }

        /// <summary>
        /// (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
        /// </summary>
        [Input("nestedVirtualization")]
        public Input<bool>? NestedVirtualization { get; set; }

        [Input("nics")]
        private InputList<Inputs.VmNicArgs>? _nics;

        /// <summary>
        /// One or more NICs. If you specify this parameter, you must not specify the `subnet_id` and `subregion_name` parameters. To define a NIC as the primary network interface of the VM, use the `primary_nic` argument.
        /// </summary>
        public InputList<Inputs.VmNicArgs> Nics
        {
            get => _nics ?? (_nics = new InputList<Inputs.VmNicArgs>());
            set => _nics = value;
        }

        /// <summary>
        /// The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
        /// </summary>
        [Input("performance")]
        public Input<string>? Performance { get; set; }

        /// <summary>
        /// The name of the Subregion where the VM is placed.
        /// </summary>
        [Input("placementSubregionName")]
        public Input<string>? PlacementSubregionName { get; set; }

        /// <summary>
        /// The tenancy of the VM (`default` | `dedicated`).
        /// </summary>
        [Input("placementTenancy")]
        public Input<string>? PlacementTenancy { get; set; }

        [Input("primaryNics")]
        private InputList<Inputs.VmPrimaryNicArgs>? _primaryNics;

        /// <summary>
        /// The primary network interface of the VM.
        /// </summary>
        public InputList<Inputs.VmPrimaryNicArgs> PrimaryNics
        {
            get => _primaryNics ?? (_primaryNics = new InputList<Inputs.VmPrimaryNicArgs>());
            set => _primaryNics = value;
        }

        [Input("privateIps")]
        private InputList<string>? _privateIps;

        /// <summary>
        /// One or more private IPs of the VM.
        /// </summary>
        public InputList<string> PrivateIps
        {
            get => _privateIps ?? (_privateIps = new InputList<string>());
            set => _privateIps = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more IDs of security group for the VMs.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("securityGroupNames")]
        private InputList<string>? _securityGroupNames;

        /// <summary>
        /// One or more names of security groups for the VMs.
        /// </summary>
        public InputList<string> SecurityGroupNames
        {
            get => _securityGroupNames ?? (_securityGroupNames = new InputList<string>());
            set => _securityGroupNames = value;
        }

        /// <summary>
        /// The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        [Input("tags")]
        private InputList<Inputs.VmTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.VmTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.VmTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// The ID of the VM.
        /// </summary>
        [Input("vmId")]
        public Input<string>? VmId { get; set; }

        /// <summary>
        /// The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
        /// </summary>
        [Input("vmInitiatedShutdownBehavior")]
        public Input<string>? VmInitiatedShutdownBehavior { get; set; }

        /// <summary>
        /// The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.&lt;br /&gt; For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
        /// </summary>
        [Input("vmType")]
        public Input<string>? VmType { get; set; }

        public VmArgs()
        {
        }
        public static new VmArgs Empty => new VmArgs();
    }

    public sealed class VmState : global::Pulumi.ResourceArgs
    {
        [Input("adminPassword")]
        public Input<string>? AdminPassword { get; set; }

        /// <summary>
        /// The architecture of the VM (`i386` \| `x86_64`).
        /// </summary>
        [Input("architecture")]
        public Input<string>? Architecture { get; set; }

        [Input("blockDeviceMappings")]
        private InputList<Inputs.VmBlockDeviceMappingGetArgs>? _blockDeviceMappings;

        /// <summary>
        /// One or more block device mappings.
        /// </summary>
        public InputList<Inputs.VmBlockDeviceMappingGetArgs> BlockDeviceMappings
        {
            get => _blockDeviceMappings ?? (_blockDeviceMappings = new InputList<Inputs.VmBlockDeviceMappingGetArgs>());
            set => _blockDeviceMappings = value;
        }

        [Input("blockDeviceMappingsCreateds")]
        private InputList<Inputs.VmBlockDeviceMappingsCreatedGetArgs>? _blockDeviceMappingsCreateds;

        /// <summary>
        /// The block device mapping of the VM.
        /// </summary>
        public InputList<Inputs.VmBlockDeviceMappingsCreatedGetArgs> BlockDeviceMappingsCreateds
        {
            get => _blockDeviceMappingsCreateds ?? (_blockDeviceMappingsCreateds = new InputList<Inputs.VmBlockDeviceMappingsCreatedGetArgs>());
            set => _blockDeviceMappingsCreateds = value;
        }

        [Input("bsuOptimized")]
        public Input<bool>? BsuOptimized { get; set; }

        /// <summary>
        /// A unique identifier which enables you to manage the idempotency.
        /// </summary>
        [Input("clientToken")]
        public Input<string>? ClientToken { get; set; }

        /// <summary>
        /// The date and time of creation of the VM.
        /// </summary>
        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        /// <summary>
        /// If true, you cannot delete the VM unless you change this parameter back to false.
        /// </summary>
        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        /// <summary>
        /// (Windows VM only) If true, waits for the administrator password of the VM to become available in order to retrieve the VM. The password is exported to the `admin_password` attribute.
        /// </summary>
        [Input("getAdminPassword")]
        public Input<bool>? GetAdminPassword { get; set; }

        /// <summary>
        /// The hypervisor type of the VMs (`ovm` \| `xen`).
        /// </summary>
        [Input("hypervisor")]
        public Input<string>? Hypervisor { get; set; }

        /// <summary>
        /// The ID of the OMI used to create the VM. You can find the list of OMIs by calling the [ReadImages](https://docs.outscale.com/api#readimages) method.
        /// </summary>
        [Input("imageId")]
        public Input<string>? ImageId { get; set; }

        /// <summary>
        /// (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        /// </summary>
        [Input("isSourceDestChecked")]
        public Input<bool>? IsSourceDestChecked { get; set; }

        /// <summary>
        /// The name of the keypair.
        /// </summary>
        [Input("keypairName")]
        public Input<string>? KeypairName { get; set; }

        /// <summary>
        /// The number for the VM when launching a group of several VMs (for example, `0`, `1`, `2`, and so on).
        /// </summary>
        [Input("launchNumber")]
        public Input<int>? LaunchNumber { get; set; }

        /// <summary>
        /// (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
        /// </summary>
        [Input("nestedVirtualization")]
        public Input<bool>? NestedVirtualization { get; set; }

        /// <summary>
        /// The ID of the Net for the NIC.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        [Input("nics")]
        private InputList<Inputs.VmNicGetArgs>? _nics;

        /// <summary>
        /// One or more NICs. If you specify this parameter, you must not specify the `subnet_id` and `subregion_name` parameters. To define a NIC as the primary network interface of the VM, use the `primary_nic` argument.
        /// </summary>
        public InputList<Inputs.VmNicGetArgs> Nics
        {
            get => _nics ?? (_nics = new InputList<Inputs.VmNicGetArgs>());
            set => _nics = value;
        }

        /// <summary>
        /// Indicates the operating system (OS) of the VM.
        /// </summary>
        [Input("osFamily")]
        public Input<string>? OsFamily { get; set; }

        /// <summary>
        /// The performance of the VM (`medium` | `high` | `highest`). Updating this parameter will trigger a stop/start of the VM.
        /// </summary>
        [Input("performance")]
        public Input<string>? Performance { get; set; }

        /// <summary>
        /// The name of the Subregion where the VM is placed.
        /// </summary>
        [Input("placementSubregionName")]
        public Input<string>? PlacementSubregionName { get; set; }

        /// <summary>
        /// The tenancy of the VM (`default` | `dedicated`).
        /// </summary>
        [Input("placementTenancy")]
        public Input<string>? PlacementTenancy { get; set; }

        [Input("primaryNics")]
        private InputList<Inputs.VmPrimaryNicGetArgs>? _primaryNics;

        /// <summary>
        /// The primary network interface of the VM.
        /// </summary>
        public InputList<Inputs.VmPrimaryNicGetArgs> PrimaryNics
        {
            get => _primaryNics ?? (_primaryNics = new InputList<Inputs.VmPrimaryNicGetArgs>());
            set => _primaryNics = value;
        }

        /// <summary>
        /// The name of the private DNS.
        /// </summary>
        [Input("privateDnsName")]
        public Input<string>? PrivateDnsName { get; set; }

        /// <summary>
        /// The private IP of the NIC.
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        [Input("privateIps")]
        private InputList<string>? _privateIps;

        /// <summary>
        /// One or more private IPs of the VM.
        /// </summary>
        public InputList<string> PrivateIps
        {
            get => _privateIps ?? (_privateIps = new InputList<string>());
            set => _privateIps = value;
        }

        [Input("productCodes")]
        private InputList<string>? _productCodes;

        /// <summary>
        /// The product codes associated with the OMI used to create the VM.
        /// </summary>
        public InputList<string> ProductCodes
        {
            get => _productCodes ?? (_productCodes = new InputList<string>());
            set => _productCodes = value;
        }

        /// <summary>
        /// The name of the public DNS.
        /// </summary>
        [Input("publicDnsName")]
        public Input<string>? PublicDnsName { get; set; }

        /// <summary>
        /// The public IP of the VM.
        /// </summary>
        [Input("publicIp")]
        public Input<string>? PublicIp { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The reservation ID of the VM.
        /// </summary>
        [Input("reservationId")]
        public Input<string>? ReservationId { get; set; }

        /// <summary>
        /// The name of the root device for the VM (for example, `/dev/vda1`).
        /// </summary>
        [Input("rootDeviceName")]
        public Input<string>? RootDeviceName { get; set; }

        /// <summary>
        /// The type of root device used by the VM (always `bsu`).
        /// </summary>
        [Input("rootDeviceType")]
        public Input<string>? RootDeviceType { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more IDs of security group for the VMs.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("securityGroupNames")]
        private InputList<string>? _securityGroupNames;

        /// <summary>
        /// One or more names of security groups for the VMs.
        /// </summary>
        public InputList<string> SecurityGroupNames
        {
            get => _securityGroupNames ?? (_securityGroupNames = new InputList<string>());
            set => _securityGroupNames = value;
        }

        [Input("securityGroups")]
        private InputList<Inputs.VmSecurityGroupGetArgs>? _securityGroups;

        /// <summary>
        /// One or more security groups associated with the VM.
        /// </summary>
        public InputList<Inputs.VmSecurityGroupGetArgs> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<Inputs.VmSecurityGroupGetArgs>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The state of the VM (`running` | `stopped`). If set to `stopped`, the VM is stopped regardless of the value of the `vm_initiated_shutdown_behavior` argument.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The reason explaining the current state of the VM.
        /// </summary>
        [Input("stateReason")]
        public Input<string>? StateReason { get; set; }

        /// <summary>
        /// The ID of the Subnet in which you want to create the VM. If you specify this parameter, you must not specify the `nics` parameter.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        [Input("tags")]
        private InputList<Inputs.VmTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.VmTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.VmTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Data or script used to add a specific configuration to the VM. It must be Base64-encoded, either directly or using the base64encode. Updating this parameter will trigger a stop/start of the VM.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        /// <summary>
        /// The ID of the VM.
        /// </summary>
        [Input("vmId")]
        public Input<string>? VmId { get; set; }

        /// <summary>
        /// The VM behavior when you stop it. By default or if set to `stop`, the VM stops. If set to `restart`, the VM stops then automatically restarts. If set to `terminate`, the VM stops and is terminated.
        /// </summary>
        [Input("vmInitiatedShutdownBehavior")]
        public Input<string>? VmInitiatedShutdownBehavior { get; set; }

        /// <summary>
        /// The type of VM (`t2.small` by default). Updating this parameter will trigger a stop/start of the VM.&lt;br /&gt; For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
        /// </summary>
        [Input("vmType")]
        public Input<string>? VmType { get; set; }

        public VmState()
        {
        }
        public static new VmState Empty => new VmState();
    }
}
