// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancerTagsTagResult
    {
        public readonly string Key;
        public readonly string LoadBalancerName;
        public readonly string Value;

        [OutputConstructor]
        private GetLoadBalancerTagsTagResult(
            string key,

            string loadBalancerName,

            string value)
        {
            Key = key;
            LoadBalancerName = loadBalancerName;
            Value = value;
        }
    }
}
