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
    public sealed class GetImageTagResult
    {
        /// <summary>
        /// The key of the tag, with a minimum of 1 character.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The value of the tag, between 0 and 255 characters.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetImageTagResult(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}
