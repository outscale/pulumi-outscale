// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Inputs
{

    public sealed class ImageLaunchPermissionPermissionAdditionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountIds")]
        private InputList<string>? _accountIds;

        /// <summary>
        /// The account ID of one or more users from whom you want to remove permissions.
        /// </summary>
        public InputList<string> AccountIds
        {
            get => _accountIds ?? (_accountIds = new InputList<string>());
            set => _accountIds = value;
        }

        /// <summary>
        /// If true, the resource is public. If false, the resource is private.
        /// </summary>
        [Input("globalPermission")]
        public Input<string>? GlobalPermission { get; set; }

        public ImageLaunchPermissionPermissionAdditionsGetArgs()
        {
        }
        public static new ImageLaunchPermissionPermissionAdditionsGetArgs Empty => new ImageLaunchPermissionPermissionAdditionsGetArgs();
    }
}
