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
    public sealed class GetNetsFilterResult
    {
        public readonly string Name;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetNetsFilterResult(
            string name,

            ImmutableArray<string> values)
        {
            Name = name;
            Values = values;
        }
    }
}
