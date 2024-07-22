// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class NetAttributesTagGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key of the tag, with a minimum of 1 character.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The value of the tag, between 0 and 255 characters.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public NetAttributesTagGetArgs()
        {
        }
        public static new NetAttributesTagGetArgs Empty => new NetAttributesTagGetArgs();
    }
}
