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
    public sealed class GetPulicCatalogCatalogResult
    {
        public readonly ImmutableArray<Outputs.GetPulicCatalogCatalogEntryResult> Entries;

        [OutputConstructor]
        private GetPulicCatalogCatalogResult(ImmutableArray<Outputs.GetPulicCatalogCatalogEntryResult> entries)
        {
            Entries = entries;
        }
    }
}
