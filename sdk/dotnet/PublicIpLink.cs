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
    /// Manages a public IP link.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-EIPs.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-publicip).
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
    ///     var publicIp01 = new Outscale.PublicIp("publicIp01");
    /// 
    ///     var vm01 = new Outscale.Vm("vm01", new()
    ///     {
    ///         ImageId = @var.Image_id,
    ///         VmType = @var.Vm_type,
    ///         KeypairName = @var.Keypair_name,
    ///         SecurityGroupIds = new[]
    ///         {
    ///             @var.Security_group_id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Link a public IP address to a VM
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var publicIpLink01 = new Outscale.PublicIpLink("publicIpLink01", new()
    ///     {
    ///         VmId = outscale_vm.Vm01.Vm_id,
    ///         PublicIp = outscale_public_ip.Public_ip01.Public_ip,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A public IP link can be imported using the public IP or the public IP link ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/publicIpLink:PublicIpLink ImportedPublicIpLink eipassoc-12345678
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/publicIpLink:PublicIpLink")]
    public partial class PublicIpLink : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
        /// </summary>
        [Output("allowRelink")]
        public Output<bool?> AllowRelink { get; private set; } = null!;

        /// <summary>
        /// (Net only) The ID representing the association of the public IP with the VM or the NIC.
        /// </summary>
        [Output("linkPublicIpId")]
        public Output<string> LinkPublicIpId { get; private set; } = null!;

        [Output("nicAccountId")]
        public Output<string> NicAccountId { get; private set; } = null!;

        /// <summary>
        /// (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vm_id` parameter instead. You cannot specify both parameters at the same time.
        /// </summary>
        [Output("nicId")]
        public Output<string> NicId { get; private set; } = null!;

        /// <summary>
        /// (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
        /// </summary>
        [Output("privateIp")]
        public Output<string> PrivateIp { get; private set; } = null!;

        /// <summary>
        /// The public IP. This parameter is required unless you use the `public_ip_id` parameter.
        /// </summary>
        [Output("publicIp")]
        public Output<string> PublicIp { get; private set; } = null!;

        /// <summary>
        /// The allocation ID of the public IP. This parameter is required unless you use the `public_ip` parameter.
        /// </summary>
        [Output("publicIpId")]
        public Output<string> PublicIpId { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableArray<Outputs.PublicIpLinkTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the VM.&lt;br /&gt;- In the public Cloud, this parameter is required.&lt;br /&gt;- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nic_id` parameter instead. You cannot specify both parameters at the same time.
        /// </summary>
        [Output("vmId")]
        public Output<string> VmId { get; private set; } = null!;


        /// <summary>
        /// Create a PublicIpLink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PublicIpLink(string name, PublicIpLinkArgs? args = null, CustomResourceOptions? options = null)
            : base("outscale:index/publicIpLink:PublicIpLink", name, args ?? new PublicIpLinkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PublicIpLink(string name, Input<string> id, PublicIpLinkState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/publicIpLink:PublicIpLink", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PublicIpLink resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PublicIpLink Get(string name, Input<string> id, PublicIpLinkState? state = null, CustomResourceOptions? options = null)
        {
            return new PublicIpLink(name, id, state, options);
        }
    }

    public sealed class PublicIpLinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
        /// </summary>
        [Input("allowRelink")]
        public Input<bool>? AllowRelink { get; set; }

        /// <summary>
        /// (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vm_id` parameter instead. You cannot specify both parameters at the same time.
        /// </summary>
        [Input("nicId")]
        public Input<string>? NicId { get; set; }

        /// <summary>
        /// (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        /// <summary>
        /// The public IP. This parameter is required unless you use the `public_ip_id` parameter.
        /// </summary>
        [Input("publicIp")]
        public Input<string>? PublicIp { get; set; }

        /// <summary>
        /// The allocation ID of the public IP. This parameter is required unless you use the `public_ip` parameter.
        /// </summary>
        [Input("publicIpId")]
        public Input<string>? PublicIpId { get; set; }

        /// <summary>
        /// The ID of the VM.&lt;br /&gt;- In the public Cloud, this parameter is required.&lt;br /&gt;- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nic_id` parameter instead. You cannot specify both parameters at the same time.
        /// </summary>
        [Input("vmId")]
        public Input<string>? VmId { get; set; }

        public PublicIpLinkArgs()
        {
        }
        public static new PublicIpLinkArgs Empty => new PublicIpLinkArgs();
    }

    public sealed class PublicIpLinkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
        /// </summary>
        [Input("allowRelink")]
        public Input<bool>? AllowRelink { get; set; }

        /// <summary>
        /// (Net only) The ID representing the association of the public IP with the VM or the NIC.
        /// </summary>
        [Input("linkPublicIpId")]
        public Input<string>? LinkPublicIpId { get; set; }

        [Input("nicAccountId")]
        public Input<string>? NicAccountId { get; set; }

        /// <summary>
        /// (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vm_id` parameter instead. You cannot specify both parameters at the same time.
        /// </summary>
        [Input("nicId")]
        public Input<string>? NicId { get; set; }

        /// <summary>
        /// (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        /// <summary>
        /// The public IP. This parameter is required unless you use the `public_ip_id` parameter.
        /// </summary>
        [Input("publicIp")]
        public Input<string>? PublicIp { get; set; }

        /// <summary>
        /// The allocation ID of the public IP. This parameter is required unless you use the `public_ip` parameter.
        /// </summary>
        [Input("publicIpId")]
        public Input<string>? PublicIpId { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        [Input("tags")]
        private InputList<Inputs.PublicIpLinkTagGetArgs>? _tags;
        public InputList<Inputs.PublicIpLinkTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.PublicIpLinkTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the VM.&lt;br /&gt;- In the public Cloud, this parameter is required.&lt;br /&gt;- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nic_id` parameter instead. You cannot specify both parameters at the same time.
        /// </summary>
        [Input("vmId")]
        public Input<string>? VmId { get; set; }

        public PublicIpLinkState()
        {
        }
        public static new PublicIpLinkState Empty => new PublicIpLinkState();
    }
}
