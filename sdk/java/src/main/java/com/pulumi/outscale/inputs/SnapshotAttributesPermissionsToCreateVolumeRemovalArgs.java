// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotAttributesPermissionsToCreateVolumeRemovalArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotAttributesPermissionsToCreateVolumeRemovalArgs Empty = new SnapshotAttributesPermissionsToCreateVolumeRemovalArgs();

    /**
     * The account ID of one or more users from whom you want to remove permissions.
     * 
     */
    @Import(name="accountIds")
    private @Nullable Output<List<String>> accountIds;

    /**
     * @return The account ID of one or more users from whom you want to remove permissions.
     * 
     */
    public Optional<Output<List<String>>> accountIds() {
        return Optional.ofNullable(this.accountIds);
    }

    /**
     * If true, the resource is public. If false, the resource is private.
     * 
     */
    @Import(name="globalPermission")
    private @Nullable Output<Boolean> globalPermission;

    /**
     * @return If true, the resource is public. If false, the resource is private.
     * 
     */
    public Optional<Output<Boolean>> globalPermission() {
        return Optional.ofNullable(this.globalPermission);
    }

    private SnapshotAttributesPermissionsToCreateVolumeRemovalArgs() {}

    private SnapshotAttributesPermissionsToCreateVolumeRemovalArgs(SnapshotAttributesPermissionsToCreateVolumeRemovalArgs $) {
        this.accountIds = $.accountIds;
        this.globalPermission = $.globalPermission;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotAttributesPermissionsToCreateVolumeRemovalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotAttributesPermissionsToCreateVolumeRemovalArgs $;

        public Builder() {
            $ = new SnapshotAttributesPermissionsToCreateVolumeRemovalArgs();
        }

        public Builder(SnapshotAttributesPermissionsToCreateVolumeRemovalArgs defaults) {
            $ = new SnapshotAttributesPermissionsToCreateVolumeRemovalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountIds The account ID of one or more users from whom you want to remove permissions.
         * 
         * @return builder
         * 
         */
        public Builder accountIds(@Nullable Output<List<String>> accountIds) {
            $.accountIds = accountIds;
            return this;
        }

        /**
         * @param accountIds The account ID of one or more users from whom you want to remove permissions.
         * 
         * @return builder
         * 
         */
        public Builder accountIds(List<String> accountIds) {
            return accountIds(Output.of(accountIds));
        }

        /**
         * @param accountIds The account ID of one or more users from whom you want to remove permissions.
         * 
         * @return builder
         * 
         */
        public Builder accountIds(String... accountIds) {
            return accountIds(List.of(accountIds));
        }

        /**
         * @param globalPermission If true, the resource is public. If false, the resource is private.
         * 
         * @return builder
         * 
         */
        public Builder globalPermission(@Nullable Output<Boolean> globalPermission) {
            $.globalPermission = globalPermission;
            return this;
        }

        /**
         * @param globalPermission If true, the resource is public. If false, the resource is private.
         * 
         * @return builder
         * 
         */
        public Builder globalPermission(Boolean globalPermission) {
            return globalPermission(Output.of(globalPermission));
        }

        public SnapshotAttributesPermissionsToCreateVolumeRemovalArgs build() {
            return $;
        }
    }

}
