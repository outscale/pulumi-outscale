// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetTag
    {
        public static Task<GetTagResult> InvokeAsync(GetTagArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTagResult>("outscale:index/getTag:getTag", args ?? new GetTagArgs(), options.WithDefaults());

        public static Output<GetTagResult> Invoke(GetTagInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTagResult>("outscale:index/getTag:getTag", args ?? new GetTagInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTagArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetTagFilterArgs>? _filters;
        public List<Inputs.GetTagFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetTagFilterArgs>());
            set => _filters = value;
        }

        public GetTagArgs()
        {
        }
        public static new GetTagArgs Empty => new GetTagArgs();
    }

    public sealed class GetTagInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetTagFilterInputArgs>? _filters;
        public InputList<Inputs.GetTagFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetTagFilterInputArgs>());
            set => _filters = value;
        }

        public GetTagInvokeArgs()
        {
        }
        public static new GetTagInvokeArgs Empty => new GetTagInvokeArgs();
    }


    [OutputType]
    public sealed class GetTagResult
    {
        public readonly ImmutableArray<Outputs.GetTagFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Key;
        public readonly string ResourceId;
        public readonly string ResourceType;
        public readonly string Value;

        [OutputConstructor]
        private GetTagResult(
            ImmutableArray<Outputs.GetTagFilterResult> filters,

            string id,

            string key,

            string resourceId,

            string resourceType,

            string value)
        {
            Filters = filters;
            Id = id;
            Key = key;
            ResourceId = resourceId;
            ResourceType = resourceType;
            Value = value;
        }
    }
}