// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class VmNicPrivateIpGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the IP is the primary private IP of the NIC.
        /// </summary>
        [Input("isPrimary")]
        public Input<bool>? IsPrimary { get; set; }

        [Input("linkPublicIps")]
        private InputList<Inputs.VmNicPrivateIpLinkPublicIpGetArgs>? _linkPublicIps;

        /// <summary>
        /// Information about the public IP associated with the NIC.
        /// </summary>
        public InputList<Inputs.VmNicPrivateIpLinkPublicIpGetArgs> LinkPublicIps
        {
            get => _linkPublicIps ?? (_linkPublicIps = new InputList<Inputs.VmNicPrivateIpLinkPublicIpGetArgs>());
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

        public VmNicPrivateIpGetArgs()
        {
        }
        public static new VmNicPrivateIpGetArgs Empty => new VmNicPrivateIpGetArgs();
    }
}