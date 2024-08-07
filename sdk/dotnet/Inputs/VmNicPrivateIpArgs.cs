// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VmNicPrivateIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the IP is the primary private IP of the NIC.
        /// </summary>
        [Input("isPrimary")]
        public Input<bool>? IsPrimary { get; set; }

        [Input("linkPublicIps")]
        private InputList<Inputs.VmNicPrivateIpLinkPublicIpArgs>? _linkPublicIps;

        /// <summary>
        /// Information about the public IP associated with the NIC.
        /// </summary>
        public InputList<Inputs.VmNicPrivateIpLinkPublicIpArgs> LinkPublicIps
        {
            get => _linkPublicIps ?? (_linkPublicIps = new InputList<Inputs.VmNicPrivateIpLinkPublicIpArgs>());
            set => _linkPublicIps = value;
        }

        /// <summary>
        /// The name of the private DNS.
        /// </summary>
        [Input("privateDnsName")]
        public Input<string>? PrivateDnsName { get; set; }

        /// <summary>
        /// The private IP of the NIC.
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        public VmNicPrivateIpArgs()
        {
        }
        public static new VmNicPrivateIpArgs Empty => new VmNicPrivateIpArgs();
    }
}
