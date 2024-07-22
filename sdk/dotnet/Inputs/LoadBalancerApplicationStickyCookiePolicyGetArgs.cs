// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class LoadBalancerApplicationStickyCookiePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the application cookie used for stickiness.
        /// </summary>
        [Input("cookieName")]
        public Input<string>? CookieName { get; set; }

        /// <summary>
        /// The name of the stickiness policy.
        /// </summary>
        [Input("policyName")]
        public Input<string>? PolicyName { get; set; }

        public LoadBalancerApplicationStickyCookiePolicyGetArgs()
        {
        }
        public static new LoadBalancerApplicationStickyCookiePolicyGetArgs Empty => new LoadBalancerApplicationStickyCookiePolicyGetArgs();
    }
}
