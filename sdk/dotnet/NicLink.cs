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
    /// Manages a NIC link.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-FNIs.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-nic).
    /// 
    /// ## Example Usage
    /// ### Required resources
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
    ///     });
    /// 
    ///     var subnet01 = new Outscale.Subnet("subnet01", new()
    ///     {
    ///         SubregionName = $"{@var.Region}a",
    ///         IpRange = "10.0.0.0/16",
    ///         NetId = net01.NetId,
    ///     });
    /// 
    ///     var vm01 = new Outscale.Vm("vm01", new()
    ///     {
    ///         ImageId = @var.Image_id,
    ///         VmType = @var.Vm_type,
    ///         KeypairName = @var.Keypair_name,
    ///         SubnetId = subnet01.SubnetId,
    ///     });
    /// 
    ///     var nic01 = new Outscale.Nic("nic01", new()
    ///     {
    ///         SubnetId = subnet01.SubnetId,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Link a NIC to a VM
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var nicLink01 = new Outscale.NicLink("nicLink01", new()
    ///     {
    ///         DeviceNumber = 1,
    ///         VmId = outscale_vm.Vm01.Vm_id,
    ///         NicId = outscale_nic.Nic01.Nic_id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A NIC link can be imported using the NIC ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/nicLink:NicLink ImportedNicLink eni-12345678
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/nicLink:NicLink")]
    public partial class NicLink : global::Pulumi.CustomResource
    {
        [Output("deleteOnVmDeletion")]
        public Output<bool> DeleteOnVmDeletion { get; private set; } = null!;

        /// <summary>
        /// The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        /// </summary>
        [Output("deviceNumber")]
        public Output<int> DeviceNumber { get; private set; } = null!;

        /// <summary>
        /// The ID of the NIC attachment.
        /// </summary>
        [Output("linkNicId")]
        public Output<string> LinkNicId { get; private set; } = null!;

        /// <summary>
        /// The ID of the NIC you want to attach.
        /// </summary>
        [Output("nicId")]
        public Output<string> NicId { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        [Output("vmAccountId")]
        public Output<string> VmAccountId { get; private set; } = null!;

        /// <summary>
        /// The ID of the VM to which you want to attach the NIC.
        /// </summary>
        [Output("vmId")]
        public Output<string> VmId { get; private set; } = null!;


        /// <summary>
        /// Create a NicLink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NicLink(string name, NicLinkArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/nicLink:NicLink", name, args ?? new NicLinkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NicLink(string name, Input<string> id, NicLinkState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/nicLink:NicLink", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NicLink resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NicLink Get(string name, Input<string> id, NicLinkState? state = null, CustomResourceOptions? options = null)
        {
            return new NicLink(name, id, state, options);
        }
    }

    public sealed class NicLinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        /// </summary>
        [Input("deviceNumber", required: true)]
        public Input<int> DeviceNumber { get; set; } = null!;

        /// <summary>
        /// The ID of the NIC you want to attach.
        /// </summary>
        [Input("nicId", required: true)]
        public Input<string> NicId { get; set; } = null!;

        /// <summary>
        /// The ID of the VM to which you want to attach the NIC.
        /// </summary>
        [Input("vmId", required: true)]
        public Input<string> VmId { get; set; } = null!;

        public NicLinkArgs()
        {
        }
        public static new NicLinkArgs Empty => new NicLinkArgs();
    }

    public sealed class NicLinkState : global::Pulumi.ResourceArgs
    {
        [Input("deleteOnVmDeletion")]
        public Input<bool>? DeleteOnVmDeletion { get; set; }

        /// <summary>
        /// The index of the VM device for the NIC attachment (between `1` and `7`, both included).
        /// </summary>
        [Input("deviceNumber")]
        public Input<int>? DeviceNumber { get; set; }

        /// <summary>
        /// The ID of the NIC attachment.
        /// </summary>
        [Input("linkNicId")]
        public Input<string>? LinkNicId { get; set; }

        /// <summary>
        /// The ID of the NIC you want to attach.
        /// </summary>
        [Input("nicId")]
        public Input<string>? NicId { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("vmAccountId")]
        public Input<string>? VmAccountId { get; set; }

        /// <summary>
        /// The ID of the VM to which you want to attach the NIC.
        /// </summary>
        [Input("vmId")]
        public Input<string>? VmId { get; set; }

        public NicLinkState()
        {
        }
        public static new NicLinkState Empty => new NicLinkState();
    }
}
