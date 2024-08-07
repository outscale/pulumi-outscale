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
    /// Manages a security group.
    /// 
    /// Security groups you create to use in a Net contain a default outbound rule that allows all outbound flows.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Security-Groups.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-securitygroup).
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
    ///     var net01 = new Outscale.Net("net01", new()
    ///     {
    ///         IpRange = "10.0.0.0/16",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a security group for a Net
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var securityGroup01 = new Outscale.SecurityGroup("securityGroup01", new()
    ///     {
    ///         Description = "Terraform security group",
    ///         SecurityGroupName = "terraform-security-group",
    ///         NetId = outscale_net.Net01.Net_id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create a security group for a Net without the default outbound rule
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var securityGroup02 = new Outscale.SecurityGroup("securityGroup02", new()
    ///     {
    ///         RemoveDefaultOutboundRule = true,
    ///         Description = "Terraform security group without outbound rule",
    ///         SecurityGroupName = "terraform-security-group-empty",
    ///         NetId = outscale_net.Net01.Net_id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A security group can be imported using its ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/securityGroup:SecurityGroup ImportedSecurityGroup sg-87654321
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/securityGroup:SecurityGroup")]
    public partial class SecurityGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account ID that owns the source or destination security group.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// A description for the security group, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The inbound rules associated with the security group.
        /// </summary>
        [Output("inboundRules")]
        public Output<ImmutableArray<Outputs.SecurityGroupInboundRule>> InboundRules { get; private set; } = null!;

        /// <summary>
        /// The ID of the Net for the security group.
        /// </summary>
        [Output("netId")]
        public Output<string> NetId { get; private set; } = null!;

        /// <summary>
        /// The outbound rules associated with the security group.
        /// </summary>
        [Output("outboundRules")]
        public Output<ImmutableArray<Outputs.SecurityGroupOutboundRule>> OutboundRules { get; private set; } = null!;

        /// <summary>
        /// (Net only) By default or if set to false, the security group is created with a default outbound rule allowing all outbound flows. If set to true, the security group is created without a default outbound rule. For an existing security group, setting this parameter to true deletes the security group and creates a new one.
        /// </summary>
        [Output("removeDefaultOutboundRule")]
        public Output<bool?> RemoveDefaultOutboundRule { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The ID of the security group.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// The name of the security group.&lt;br /&gt;
        /// This name must not start with `sg-`.&lt;/br&gt;
        /// This name must be unique and contain between 1 and 255 ASCII characters. Accented letters are not allowed.
        /// </summary>
        [Output("securityGroupName")]
        public Output<string> SecurityGroupName { get; private set; } = null!;

        [Output("tag")]
        public Output<ImmutableDictionary<string, object>?> Tag { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.SecurityGroupTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityGroup(string name, SecurityGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("outscale:index/securityGroup:SecurityGroup", name, args ?? new SecurityGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityGroup(string name, Input<string> id, SecurityGroupState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/securityGroup:SecurityGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityGroup Get(string name, Input<string> id, SecurityGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityGroup(name, id, state, options);
        }
    }

    public sealed class SecurityGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description for the security group, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID of the Net for the security group.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        /// <summary>
        /// (Net only) By default or if set to false, the security group is created with a default outbound rule allowing all outbound flows. If set to true, the security group is created without a default outbound rule. For an existing security group, setting this parameter to true deletes the security group and creates a new one.
        /// </summary>
        [Input("removeDefaultOutboundRule")]
        public Input<bool>? RemoveDefaultOutboundRule { get; set; }

        /// <summary>
        /// The name of the security group.&lt;br /&gt;
        /// This name must not start with `sg-`.&lt;/br&gt;
        /// This name must be unique and contain between 1 and 255 ASCII characters. Accented letters are not allowed.
        /// </summary>
        [Input("securityGroupName")]
        public Input<string>? SecurityGroupName { get; set; }

        [Input("tag")]
        private InputMap<object>? _tag;
        public InputMap<object> Tag
        {
            get => _tag ?? (_tag = new InputMap<object>());
            set => _tag = value;
        }

        [Input("tags")]
        private InputList<Inputs.SecurityGroupTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.SecurityGroupTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SecurityGroupTagArgs>());
            set => _tags = value;
        }

        public SecurityGroupArgs()
        {
        }
        public static new SecurityGroupArgs Empty => new SecurityGroupArgs();
    }

    public sealed class SecurityGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID that owns the source or destination security group.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// A description for the security group, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("inboundRules")]
        private InputList<Inputs.SecurityGroupInboundRuleGetArgs>? _inboundRules;

        /// <summary>
        /// The inbound rules associated with the security group.
        /// </summary>
        public InputList<Inputs.SecurityGroupInboundRuleGetArgs> InboundRules
        {
            get => _inboundRules ?? (_inboundRules = new InputList<Inputs.SecurityGroupInboundRuleGetArgs>());
            set => _inboundRules = value;
        }

        /// <summary>
        /// The ID of the Net for the security group.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        [Input("outboundRules")]
        private InputList<Inputs.SecurityGroupOutboundRuleGetArgs>? _outboundRules;

        /// <summary>
        /// The outbound rules associated with the security group.
        /// </summary>
        public InputList<Inputs.SecurityGroupOutboundRuleGetArgs> OutboundRules
        {
            get => _outboundRules ?? (_outboundRules = new InputList<Inputs.SecurityGroupOutboundRuleGetArgs>());
            set => _outboundRules = value;
        }

        /// <summary>
        /// (Net only) By default or if set to false, the security group is created with a default outbound rule allowing all outbound flows. If set to true, the security group is created without a default outbound rule. For an existing security group, setting this parameter to true deletes the security group and creates a new one.
        /// </summary>
        [Input("removeDefaultOutboundRule")]
        public Input<bool>? RemoveDefaultOutboundRule { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The ID of the security group.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The name of the security group.&lt;br /&gt;
        /// This name must not start with `sg-`.&lt;/br&gt;
        /// This name must be unique and contain between 1 and 255 ASCII characters. Accented letters are not allowed.
        /// </summary>
        [Input("securityGroupName")]
        public Input<string>? SecurityGroupName { get; set; }

        [Input("tag")]
        private InputMap<object>? _tag;
        public InputMap<object> Tag
        {
            get => _tag ?? (_tag = new InputMap<object>());
            set => _tag = value;
        }

        [Input("tags")]
        private InputList<Inputs.SecurityGroupTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.SecurityGroupTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.SecurityGroupTagGetArgs>());
            set => _tags = value;
        }

        public SecurityGroupState()
        {
        }
        public static new SecurityGroupState Empty => new SecurityGroupState();
    }
}
