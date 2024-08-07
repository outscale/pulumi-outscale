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
    public sealed class SnapshotAttributesPermissionsToCreateVolumeAdditions
    {
        /// <summary>
        /// The account ID of one or more users from whom you want to remove permissions.
        /// </summary>
        public readonly ImmutableArray<string> AccountIds;
        /// <summary>
        /// If true, the resource is public. If false, the resource is private.
        /// </summary>
        public readonly bool? GlobalPermission;

        [OutputConstructor]
        private SnapshotAttributesPermissionsToCreateVolumeAdditions(
            ImmutableArray<string> accountIds,

            bool? globalPermission)
        {
            AccountIds = accountIds;
            GlobalPermission = globalPermission;
        }
    }
}
