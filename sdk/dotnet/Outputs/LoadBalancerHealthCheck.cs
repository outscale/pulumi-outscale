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
    public sealed class LoadBalancerHealthCheck
    {
        /// <summary>
        /// The number of seconds between two pings (between `5` and `600` both included).
        /// </summary>
        public readonly int? CheckInterval;
        /// <summary>
        /// The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
        /// </summary>
        public readonly int? HealthyThreshold;
        /// <summary>
        /// If you use the HTTP or HTTPS protocols, the ping path.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// The port number (between `1` and `65535`, both included).
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The protocol for the URL of the VM (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
        /// </summary>
        public readonly int? Timeout;
        /// <summary>
        /// The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
        /// </summary>
        public readonly int? UnhealthyThreshold;

        [OutputConstructor]
        private LoadBalancerHealthCheck(
            int? checkInterval,

            int? healthyThreshold,

            string? path,

            int? port,

            string? protocol,

            int? timeout,

            int? unhealthyThreshold)
        {
            CheckInterval = checkInterval;
            HealthyThreshold = healthyThreshold;
            Path = path;
            Port = port;
            Protocol = protocol;
            Timeout = timeout;
            UnhealthyThreshold = unhealthyThreshold;
        }
    }
}
