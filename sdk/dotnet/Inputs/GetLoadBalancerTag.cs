// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class GetLoadBalancerTagArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The key of the tag, with a minimum of 1 character.
        /// </summary>
        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        /// <summary>
        /// The value of the tag, between 0 and 255 characters.
        /// </summary>
        [Input("value", required: true)]
        public string Value { get; set; } = null!;

        public GetLoadBalancerTagArgs()
        {
        }
        public static new GetLoadBalancerTagArgs Empty => new GetLoadBalancerTagArgs();
    }
}