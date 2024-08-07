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
    public sealed class GetProductTypesProductTypeResult
    {
        /// <summary>
        /// The description of the product type.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the product type.
        /// </summary>
        public readonly string ProductTypeId;
        /// <summary>
        /// The vendor of the product type.
        /// </summary>
        public readonly string Vendor;

        [OutputConstructor]
        private GetProductTypesProductTypeResult(
            string description,

            string productTypeId,

            string vendor)
        {
            Description = description;
            ProductTypeId = productTypeId;
            Vendor = vendor;
        }
    }
}
