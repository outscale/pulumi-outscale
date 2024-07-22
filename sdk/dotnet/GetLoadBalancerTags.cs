// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale
{
    public static class GetLoadBalancerTags
    {
        public static Task<GetLoadBalancerTagsResult> InvokeAsync(GetLoadBalancerTagsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLoadBalancerTagsResult>("outscale:index/getLoadBalancerTags:getLoadBalancerTags", args ?? new GetLoadBalancerTagsArgs(), options.WithDefaults());

        public static Output<GetLoadBalancerTagsResult> Invoke(GetLoadBalancerTagsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLoadBalancerTagsResult>("outscale:index/getLoadBalancerTags:getLoadBalancerTags", args ?? new GetLoadBalancerTagsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadBalancerTagsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetLoadBalancerTagsFilterArgs>? _filters;
        public List<Inputs.GetLoadBalancerTagsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetLoadBalancerTagsFilterArgs>());
            set => _filters = value;
        }

        [Input("loadBalancerNames")]
        private List<string>? _loadBalancerNames;
        public List<string> LoadBalancerNames
        {
            get => _loadBalancerNames ?? (_loadBalancerNames = new List<string>());
            set => _loadBalancerNames = value;
        }

        public GetLoadBalancerTagsArgs()
        {
        }
        public static new GetLoadBalancerTagsArgs Empty => new GetLoadBalancerTagsArgs();
    }

    public sealed class GetLoadBalancerTagsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetLoadBalancerTagsFilterInputArgs>? _filters;
        public InputList<Inputs.GetLoadBalancerTagsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetLoadBalancerTagsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("loadBalancerNames")]
        private InputList<string>? _loadBalancerNames;
        public InputList<string> LoadBalancerNames
        {
            get => _loadBalancerNames ?? (_loadBalancerNames = new InputList<string>());
            set => _loadBalancerNames = value;
        }

        public GetLoadBalancerTagsInvokeArgs()
        {
        }
        public static new GetLoadBalancerTagsInvokeArgs Empty => new GetLoadBalancerTagsInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadBalancerTagsResult
    {
        public readonly ImmutableArray<Outputs.GetLoadBalancerTagsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> LoadBalancerNames;
        public readonly string RequestId;
        public readonly ImmutableArray<Outputs.GetLoadBalancerTagsTagResult> Tags;

        [OutputConstructor]
        private GetLoadBalancerTagsResult(
            ImmutableArray<Outputs.GetLoadBalancerTagsFilterResult> filters,

            string id,

            ImmutableArray<string> loadBalancerNames,

            string requestId,

            ImmutableArray<Outputs.GetLoadBalancerTagsTagResult> tags)
        {
            Filters = filters;
            Id = id;
            LoadBalancerNames = loadBalancerNames;
            RequestId = requestId;
            Tags = tags;
        }
    }
}
