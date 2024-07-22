// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class NetPeeringAccepterNetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID of the owner of the source Net.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The IP range for the source Net, in CIDR notation (for example, `10.0.0.0/16`).
        /// </summary>
        [Input("ipRange")]
        public Input<string>? IpRange { get; set; }

        /// <summary>
        /// The ID of the source Net.
        /// </summary>
        [Input("netId")]
        public Input<string>? NetId { get; set; }

        public NetPeeringAccepterNetArgs()
        {
        }
        public static new NetPeeringAccepterNetArgs Empty => new NetPeeringAccepterNetArgs();
    }
}
