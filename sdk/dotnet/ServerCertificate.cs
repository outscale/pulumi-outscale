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
    /// Manages a server certificate.
    /// 
    /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).\
    /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using Outscale = Pulumi.Outscale;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var serverCertificate01 = new Outscale.ServerCertificate("serverCertificate01", new()
    ///     {
    ///         Body = File.ReadAllText("&lt;PATH&gt;"),
    ///         Chain = File.ReadAllText("&lt;PATH&gt;"),
    ///         PrivateKey = File.ReadAllText("&lt;PATH&gt;"),
    ///         Path = "&lt;PATH&gt;",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// A server certificate can be imported using its ID. For exampleconsole
    /// 
    /// ```sh
    ///  $ pulumi import outscale:index/serverCertificate:ServerCertificate ImportedServerCertificate 0123456789
    /// ```
    /// </summary>
    [OutscaleResourceType("outscale:index/serverCertificate:ServerCertificate")]
    public partial class ServerCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The PEM-encoded X509 certificate.
        /// </summary>
        [Output("body")]
        public Output<string?> Body { get; private set; } = null!;

        /// <summary>
        /// The PEM-encoded intermediate certification authorities.
        /// </summary>
        [Output("chain")]
        public Output<string?> Chain { get; private set; } = null!;

        [Output("dryRun")]
        public Output<string?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The date at which the server certificate expires.
        /// </summary>
        [Output("expirationDate")]
        public Output<string> ExpirationDate { get; private set; } = null!;

        /// <summary>
        /// A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        /// </summary>
        [Output("orn")]
        public Output<string> Orn { get; private set; } = null!;

        /// <summary>
        /// The path to the server certificate, set to a slash (/) if not specified.
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

        /// <summary>
        /// The PEM-encoded private key matching the certificate.
        /// </summary>
        [Output("privateKey")]
        public Output<string?> PrivateKey { get; private set; } = null!;

        [Output("requestId")]
        public Output<string> RequestId { get; private set; } = null!;

        /// <summary>
        /// The date at which the server certificate has been uploaded.
        /// </summary>
        [Output("uploadDate")]
        public Output<string> UploadDate { get; private set; } = null!;


        /// <summary>
        /// Create a ServerCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerCertificate(string name, ServerCertificateArgs? args = null, CustomResourceOptions? options = null)
            : base("outscale:index/serverCertificate:ServerCertificate", name, args ?? new ServerCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerCertificate(string name, Input<string> id, ServerCertificateState? state = null, CustomResourceOptions? options = null)
            : base("outscale:index/serverCertificate:ServerCertificate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServerCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerCertificate Get(string name, Input<string> id, ServerCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerCertificate(name, id, state, options);
        }
    }

    public sealed class ServerCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The PEM-encoded X509 certificate.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        /// <summary>
        /// The PEM-encoded intermediate certification authorities.
        /// </summary>
        [Input("chain")]
        public Input<string>? Chain { get; set; }

        [Input("dryRun")]
        public Input<string>? DryRun { get; set; }

        /// <summary>
        /// A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The path to the server certificate, set to a slash (/) if not specified.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The PEM-encoded private key matching the certificate.
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        public ServerCertificateArgs()
        {
        }
        public static new ServerCertificateArgs Empty => new ServerCertificateArgs();
    }

    public sealed class ServerCertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The PEM-encoded X509 certificate.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        /// <summary>
        /// The PEM-encoded intermediate certification authorities.
        /// </summary>
        [Input("chain")]
        public Input<string>? Chain { get; set; }

        [Input("dryRun")]
        public Input<string>? DryRun { get; set; }

        /// <summary>
        /// The date at which the server certificate expires.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        /// </summary>
        [Input("orn")]
        public Input<string>? Orn { get; set; }

        /// <summary>
        /// The path to the server certificate, set to a slash (/) if not specified.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The PEM-encoded private key matching the certificate.
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        [Input("requestId")]
        public Input<string>? RequestId { get; set; }

        /// <summary>
        /// The date at which the server certificate has been uploaded.
        /// </summary>
        [Input("uploadDate")]
        public Input<string>? UploadDate { get; set; }

        public ServerCertificateState()
        {
        }
        public static new ServerCertificateState Empty => new ServerCertificateState();
    }
}
