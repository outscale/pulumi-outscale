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
    /// Manages an Internet service.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Internet-Gateways.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-internetservice).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var internetService01 = new Outscale.InternetService("internetService01");
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// An internet service can be imported using its ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/internetService:InternetService ImportedInternetService igw-12345678
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/internetService:InternetService")]
    public partial class InternetService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Internet service.
        /// </summary>
        [Output("internetServiceId")]
        public Output<string> InternetServiceId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Net attached to the Internet service.
        /// </summary>
        [Output("netId")]
        public Output<string> NetId { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The state of the attachment of the Internet service to the Net (always `available`).
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.InternetServiceTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a InternetService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InternetService(string name, InternetServiceArgs? args = null, CustomResourceOptions? options = null)
            : base("outscale:index/internetService:InternetService", name, args ?? new InternetServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InternetService(string name, Input<string> id, InternetServiceState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/internetService:InternetService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InternetService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InternetService Get(string name, Input<string> id, InternetServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new InternetService(name, id, state, options);
        }
    }

    public sealed class InternetServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("tags")]
        private InputList<Inputs.InternetServiceTagArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.InternetServiceTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.InternetServiceTagArgs>());
            set => _tags = value;
        }

        public InternetServiceArgs()
        {
        }
        public static new InternetServiceArgs Empty => new InternetServiceArgs();
    }

    public sealed class InternetServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Internet service.
        /// </summary>
        [Input("internetServiceId")]
        public Input<string>? InternetServiceId { get; set; }

        /// <summary>
        /// The ID of the Net attached to the Internet service.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The state of the attachment of the Internet service to the Net (always `available`).
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputList<Inputs.InternetServiceTagGetArgs>? _tags;

        /// <summary>
        /// A tag to add to this resource. You can specify this argument several times.
        /// </summary>
        public InputList<Inputs.InternetServiceTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.InternetServiceTagGetArgs>());
            set => _tags = value;
        }

        public InternetServiceState()
        {
        }
        public static new InternetServiceState Empty => new InternetServiceState();
    }
}