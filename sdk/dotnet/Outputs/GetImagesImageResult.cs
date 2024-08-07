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
    public sealed class GetImagesImageResult
    {
        /// <summary>
        /// The account alias of the owner of the OMI.
        /// </summary>
        public readonly string AccountAlias;
        /// <summary>
        /// The account ID of the owner of the OMI.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The architecture of the OMI (by default, `i386`).
        /// </summary>
        public readonly string Architecture;
        /// <summary>
        /// One or more block device mappings.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImagesImageBlockDeviceMappingResult> BlockDeviceMappings;
        /// <summary>
        /// The date and time of creation of the OMI, in ISO 8601 date-time format.
        /// </summary>
        public readonly string CreationDate;
        /// <summary>
        /// The description of the OMI.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The location of the bucket where the OMI files are stored.
        /// </summary>
        public readonly string FileLocation;
        /// <summary>
        /// The ID of the OMI.
        /// </summary>
        public readonly string ImageId;
        /// <summary>
        /// The name of the OMI.
        /// </summary>
        public readonly string ImageName;
        /// <summary>
        /// The type of the OMI.
        /// </summary>
        public readonly string ImageType;
        /// <summary>
        /// Permissions for the resource.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImagesImagePermissionsToLaunchResult> PermissionsToLaunches;
        /// <summary>
        /// The product codes associated with the OMI.
        /// </summary>
        public readonly ImmutableArray<string> ProductCodes;
        /// <summary>
        /// The name of the root device.
        /// </summary>
        public readonly string RootDeviceName;
        /// <summary>
        /// The type of root device used by the OMI (always `bsu`).
        /// </summary>
        public readonly string RootDeviceType;
        /// <summary>
        /// The state of the OMI (`pending` \| `available` \| `failed`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Information about the change of state.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImagesImageStateCommentResult> StateComments;
        /// <summary>
        /// The key/value combinations of the tags associated with the OMIs, in the following format: `TAGKEY=TAGVALUE`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImagesImageTagResult> Tags;

        [OutputConstructor]
        private GetImagesImageResult(
            string accountAlias,

            string accountId,

            string architecture,

            ImmutableArray<Outputs.GetImagesImageBlockDeviceMappingResult> blockDeviceMappings,

            string creationDate,

            string description,

            string fileLocation,

            string imageId,

            string imageName,

            string imageType,

            ImmutableArray<Outputs.GetImagesImagePermissionsToLaunchResult> permissionsToLaunches,

            ImmutableArray<string> productCodes,

            string rootDeviceName,

            string rootDeviceType,

            string state,

            ImmutableArray<Outputs.GetImagesImageStateCommentResult> stateComments,

            ImmutableArray<Outputs.GetImagesImageTagResult> tags)
        {
            AccountAlias = accountAlias;
            AccountId = accountId;
            Architecture = architecture;
            BlockDeviceMappings = blockDeviceMappings;
            CreationDate = creationDate;
            Description = description;
            FileLocation = fileLocation;
            ImageId = imageId;
            ImageName = imageName;
            ImageType = imageType;
            PermissionsToLaunches = permissionsToLaunches;
            ProductCodes = productCodes;
            RootDeviceName = rootDeviceName;
            RootDeviceType = rootDeviceType;
            State = state;
            StateComments = stateComments;
            Tags = tags;
        }
    }
}
