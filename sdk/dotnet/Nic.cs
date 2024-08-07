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
    /// Manages a network interface card (NIC).
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
    ///         SubregionName = "eu-west-2a",
    ///         IpRange = "10.0.0.0/18",
    ///         NetId = net01.NetId,
    ///     });
    /// 
    ///     var securityGroup01 = new Outscale.SecurityGroup("securityGroup01", new()
    ///     {
    ///         Description = "Terraform security group for nic with private IPs",
    ///         SecurityGroupName = "terraform-security-group-nic-ips",
    ///         NetId = net01.NetId,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a NIC
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var nic01 = new Outscale.Nic("nic01", new()
    ///     {
    ///         SubnetId = outscale_subnet.Subnet01.Subnet_id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a NIC with private IP addresses
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var nic02 = new Outscale.Nic("nic02", new()
    ///     {
    ///         Description = "Terraform nic with private IPs",
    ///         SubnetId = outscale_subnet.Subnet01.Subnet_id,
    ///         SecurityGroupIds = new[]
    ///         {
    ///             outscale_security_group.Security_group01.Security_group_id,
    ///         },
    ///         PrivateIps = new[]
    ///         {
    ///             new Outscale.Inputs.NicPrivateIpArgs
    ///             {
    ///                 IsPrimary = true,
    ///                 PrivateIp = "10.0.0.1",
    ///             },
    ///             new Outscale.Inputs.NicPrivateIpArgs
    ///             {
    ///                 IsPrimary = false,
    ///                 PrivateIp = "10.0.0.2",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A NIC can be imported using its ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/nic:Nic ImportedNic eni-12345678
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/nic:Nic")]
    public partial class Nic : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account ID of the owner of the NIC.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// A description for the NIC.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        /// </summary>
        [Output("isSourceDestChecked")]
        public Output<bool> IsSourceDestChecked { get; private set; } = null!;

        /// <summary>
        /// Information about the NIC attachment.
        /// </summary>
        [Output("linkNics")]
        public Output<ImmutableArray<Outputs.NicLinkNic>> LinkNics { get; private set; } = null!;

        /// <summary>
        /// Information about the public IP association.
        /// </summary>
        [Output("linkPublicIps")]
        public Output<ImmutableArray<Outputs.NicLinkPublicIp>> LinkPublicIps { get; private set; } = null!;

        /// <summary>
        /// The Media Access Control (MAC) address of the NIC.
        /// </summary>
        [Output("macAddress")]
        public Output<string> MacAddress { get; private set; } = null!;

        /// <summary>
        /// The ID of the Net for the NIC.
        /// </summary>
        [Output("netId")]
        public Output<string> NetId { get; private set; } = null!;

        /// <summary>
        /// The ID of the NIC.
        /// </summary>
        [Output("nicId")]
        public Output<string> NicId { get; private set; } = null!;

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
        /// The primary private IP for the NIC.&lt;br /&gt;
        /// This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.&lt;br /&gt;
        /// If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        /// </summary>
        [Output("privateIps")]
        public Output<ImmutableArray<Outputs.NicPrivateIp>> PrivateIps { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        [Output("requesterManaged")]
        public Output<bool> RequesterManaged { get; private set; } = null!;

        /// <summary>
        /// One or more IDs of security groups for the NIC.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// One or more IDs of security groups for the NIC.
        /// </summary>
        [Output("securityGroups")]
        public Output<ImmutableArray<Outputs.NicSecurityGroup>> SecurityGroups { get; private set; } = null!;

        /// <summary>
        /// The state of the NIC (`available` \| `attaching` \| `in-use` \| `detaching`).
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The ID of the Subnet in which you want to create the NIC.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;

        /// <summary>
        /// The Subregion in which the NIC is located.
        /// </summary>
        [Output("subregionName")]
        public Output<string> SubregionName { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.NicTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Nic resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Nic(string name, NicArgs args, CustomResourceOptions? options = null)
            : base("outscale:index/nic:Nic", name, args ?? new NicArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Nic(string name, Input<string> id, NicState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/nic:Nic", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Nic resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Nic Get(string name, Input<string> id, NicState? state = null, CustomResourceOptions? options = null)
        {
            return new Nic(name, id, state, options);
        }
    }

    public sealed class NicArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description for the NIC.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The private IP of the NIC.
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        [Input("privateIps")]
        private InputList<Inputs.NicPrivateIpArgs>? _privateIps;

        /// <summary>
        /// The primary private IP for the NIC.&lt;br /&gt;
        /// This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.&lt;br /&gt;
        /// If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        /// </summary>
        public InputList<Inputs.NicPrivateIpArgs> PrivateIps
        {
            get => _privateIps ?? (_privateIps = new InputList<Inputs.NicPrivateIpArgs>());
            set => _privateIps = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more IDs of security groups for the NIC.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// The ID of the Subnet in which you want to create the NIC.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.NicTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.NicTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.NicTagArgs>());
            set => _tags = value;
        }

        public NicArgs()
        {
        }
        public static new NicArgs Empty => new NicArgs();
    }

    public sealed class NicState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID of the owner of the NIC.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// A description for the NIC.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
        /// </summary>
        [Input("isSourceDestChecked")]
        public Input<bool>? IsSourceDestChecked { get; set; }

        [Input("linkNics")]
        private InputList<Inputs.NicLinkNicGetArgs>? _linkNics;

        /// <summary>
        /// Information about the NIC attachment.
        /// </summary>
        public InputList<Inputs.NicLinkNicGetArgs> LinkNics
        {
            get => _linkNics ?? (_linkNics = new InputList<Inputs.NicLinkNicGetArgs>());
            set => _linkNics = value;
        }

        [Input("linkPublicIps")]
        private InputList<Inputs.NicLinkPublicIpGetArgs>? _linkPublicIps;

        /// <summary>
        /// Information about the public IP association.
        /// </summary>
        public InputList<Inputs.NicLinkPublicIpGetArgs> LinkPublicIps
        {
            get => _linkPublicIps ?? (_linkPublicIps = new InputList<Inputs.NicLinkPublicIpGetArgs>());
            set => _linkPublicIps = value;
        }

        /// <summary>
        /// The Media Access Control (MAC) address of the NIC.
        /// </summary>
        [Input("macAddress")]
        public Input<string>? MacAddress { get; set; }

        /// <summary>
        /// The ID of the Net for the NIC.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        /// <summary>
        /// The ID of the NIC.
        /// </summary>
        [Input("nicId")]
        public Input<string>? NicId { get; set; }

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
        private InputList<Inputs.NicPrivateIpGetArgs>? _privateIps;

        /// <summary>
        /// The primary private IP for the NIC.&lt;br /&gt;
        /// This IP must be within the IP range of the Subnet that you specify with the `subnet_id` attribute.&lt;br /&gt;
        /// If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet.
        /// </summary>
        public InputList<Inputs.NicPrivateIpGetArgs> PrivateIps
        {
            get => _privateIps ?? (_privateIps = new InputList<Inputs.NicPrivateIpGetArgs>());
            set => _privateIps = value;
        }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        [Input("requesterManaged")]
        public Input<bool>? RequesterManaged { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// One or more IDs of security groups for the NIC.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("securityGroups")]
        private InputList<Inputs.NicSecurityGroupGetArgs>? _securityGroups;

        /// <summary>
        /// One or more IDs of security groups for the NIC.
        /// </summary>
        public InputList<Inputs.NicSecurityGroupGetArgs> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<Inputs.NicSecurityGroupGetArgs>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The state of the NIC (`available` \| `attaching` \| `in-use` \| `detaching`).
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The ID of the Subnet in which you want to create the NIC.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// The Subregion in which the NIC is located.
        /// </summary>
        [Input("subregionName")]
        public Input<string>? SubregionName { get; set; }

        [Input("tags")]
        private InputList<Inputs.NicTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.NicTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.NicTagGetArgs>());
            set => _tags = value;
        }

        public NicState()
        {
        }
        public static new NicState Empty => new NicState();
    }
}
