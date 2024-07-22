// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class LoadBalancerPolicyHealthCheckGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of seconds between two pings (between `5` and `600` both included).
        /// </summary>
        [Input("checkInterval")]
        public Input<int>? CheckInterval { get; set; }

        /// <summary>
        /// The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
        /// </summary>
        [Input("healthyThreshold")]
        public Input<int>? HealthyThreshold { get; set; }

        /// <summary>
        /// If you use the HTTP or HTTPS protocols, the ping path.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The port number (between `1` and `65535`, both included).
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The protocol for the URL of the VM (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
        /// </summary>
        [Input("unhealthyThreshold")]
        public Input<int>? UnhealthyThreshold { get; set; }

        public LoadBalancerPolicyHealthCheckGetArgs()
        {
        }
        public static new LoadBalancerPolicyHealthCheckGetArgs Empty => new LoadBalancerPolicyHealthCheckGetArgs();
    }
}
