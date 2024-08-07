// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetServerCertificate
    {
        /// <summary>
        /// Provides information about a server certificate.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).
        /// </summary>
        public static Task<GetServerCertificateResult> InvokeAsync(GetServerCertificateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServerCertificateResult>("outscale:index/getServerCertificate:getServerCertificate", args ?? new GetServerCertificateArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a server certificate.
        /// 
        /// For more information on this resource, see the [User Guide](https://docs.outscale.com/en/userguide/About-Server-Certificates-in-EIM.html).  
        /// For more information on this resource actions, see the [API documentation](https://docs.outscale.com/api#3ds-outscale-api-servercertificate).
        /// </summary>
        public static Output<GetServerCertificateResult> Invoke(GetServerCertificateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServerCertificateResult>("outscale:index/getServerCertificate:getServerCertificate", args ?? new GetServerCertificateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServerCertificateArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetServerCertificateFilterArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public List<Inputs.GetServerCertificateFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetServerCertificateFilterArgs>());
            set => _filters = value;
        }

        public GetServerCertificateArgs()
        {
        }
        public static new GetServerCertificateArgs Empty => new GetServerCertificateArgs();
    }

    public sealed class GetServerCertificateInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetServerCertificateFilterInputArgs>? _filters;

        /// <summary>
        /// A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
        /// </summary>
        public InputList<Inputs.GetServerCertificateFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetServerCertificateFilterInputArgs>());
            set => _filters = value;
        }

        public GetServerCertificateInvokeArgs()
        {
        }
        public static new GetServerCertificateInvokeArgs Empty => new GetServerCertificateInvokeArgs();
    }


    [OutputType]
    public sealed class GetServerCertificateResult
    {
        /// <summary>
        /// The date at which the server certificate expires.
        /// </summary>
        public readonly string ExpirationDate;
        public readonly ImmutableArray<Outputs.GetServerCertificateFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the server certificate.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
        /// </summary>
        public readonly string Orn;
        /// <summary>
        /// The path to the server certificate.
        /// </summary>
        public readonly string Path;
        public readonly string RequestId;
        /// <summary>
        /// The date at which the server certificate has been uploaded.
        /// </summary>
        public readonly string UploadDate;

        [OutputConstructor]
        private GetServerCertificateResult(
            string expirationDate,

            ImmutableArray<Outputs.GetServerCertificateFilterResult> filters,

            string id,

            string name,

            string orn,

            string path,

            string requestId,

            string uploadDate)
        {
            ExpirationDate = expirationDate;
            Filters = filters;
            Id = id;
            Name = name;
            Orn = orn;
            Path = path;
            RequestId = requestId;
            UploadDate = uploadDate;
        }
    }
}
