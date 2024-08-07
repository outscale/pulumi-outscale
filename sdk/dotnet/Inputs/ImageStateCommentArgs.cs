// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class ImageStateCommentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The code of the change of state.
        /// </summary>
        [Input("stateCode")]
        public Input<string>? StateCode { get; set; }

        /// <summary>
        /// A message explaining the change of state.
        /// </summary>
        [Input("stateMessage")]
        public Input<string>? StateMessage { get; set; }

        public ImageStateCommentArgs()
        {
        }
        public static new ImageStateCommentArgs Empty => new ImageStateCommentArgs();
    }
}
