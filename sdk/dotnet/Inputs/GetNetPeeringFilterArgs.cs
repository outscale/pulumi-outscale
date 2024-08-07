// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class GetNetPeeringFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The state of the Net peering (`pending-acceptance` \| `active` \| `rejected` \| `failed` \| `expired` \| `deleted`).
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetNetPeeringFilterInputArgs()
        {
        }
        public static new GetNetPeeringFilterInputArgs Empty => new GetNetPeeringFilterInputArgs();
    }
}
