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
    public sealed class LoadBalancerPolicyAccessLog
    {
        /// <summary>
        /// If true, access logs are enabled for your load balancer. If false, they are not. If you set this to true in your request, the `osu_bucket_name` parameter is required.
        /// </summary>
        public readonly bool? IsEnabled;
        /// <summary>
        /// The name of the OOS bucket for the access logs.
        /// </summary>
        public readonly string? OsuBucketName;
        /// <summary>
        /// The path to the folder of the access logs in your OOS bucket (by default, the `root` level of your bucket).
        /// </summary>
        public readonly string? OsuBucketPrefix;
        /// <summary>
        /// The time interval for the publication of access logs in the OOS bucket, in minutes. This value can be either `5` or `60` (by default, `60`).
        /// </summary>
        public readonly int? PublicationInterval;

        [OutputConstructor]
        private LoadBalancerPolicyAccessLog(
            bool? isEnabled,

            string? osuBucketName,

            string? osuBucketPrefix,

            int? publicationInterval)
        {
            IsEnabled = isEnabled;
            OsuBucketName = osuBucketName;
            OsuBucketPrefix = osuBucketPrefix;
            PublicationInterval = publicationInterval;
        }
    }
}
