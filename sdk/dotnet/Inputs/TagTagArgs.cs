// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class TagTagArgs : global::Pulumi.ResourceArgs
    {
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public TagTagArgs()
        {
        }
        public static new TagTagArgs Empty => new TagTagArgs();
    }
}