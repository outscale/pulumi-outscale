// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.SnapshotAttributesPermissionsToCreateVolumeAdditionsArgs;
import com.pulumi.outscale.inputs.SnapshotAttributesPermissionsToCreateVolumeRemovalArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotAttributesArgs Empty = new SnapshotAttributesArgs();

    /**
     * Information about the users to whom you want to give permissions for the resource.
     * 
     */
    @Import(name="permissionsToCreateVolumeAdditions")
    private @Nullable Output<SnapshotAttributesPermissionsToCreateVolumeAdditionsArgs> permissionsToCreateVolumeAdditions;

    /**
     * @return Information about the users to whom you want to give permissions for the resource.
     * 
     */
    public Optional<Output<SnapshotAttributesPermissionsToCreateVolumeAdditionsArgs>> permissionsToCreateVolumeAdditions() {
        return Optional.ofNullable(this.permissionsToCreateVolumeAdditions);
    }

    /**
     * Information about the users from whom you want to remove permissions for the resource.
     * 
     */
    @Import(name="permissionsToCreateVolumeRemovals")
    private @Nullable Output<List<SnapshotAttributesPermissionsToCreateVolumeRemovalArgs>> permissionsToCreateVolumeRemovals;

    /**
     * @return Information about the users from whom you want to remove permissions for the resource.
     * 
     */
    public Optional<Output<List<SnapshotAttributesPermissionsToCreateVolumeRemovalArgs>>> permissionsToCreateVolumeRemovals() {
        return Optional.ofNullable(this.permissionsToCreateVolumeRemovals);
    }

    /**
     * The ID of the snapshot.
     * 
     */
    @Import(name="snapshotId", required=true)
    private Output<String> snapshotId;

    /**
     * @return The ID of the snapshot.
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }

    private SnapshotAttributesArgs() {}

    private SnapshotAttributesArgs(SnapshotAttributesArgs $) {
        this.permissionsToCreateVolumeAdditions = $.permissionsToCreateVolumeAdditions;
        this.permissionsToCreateVolumeRemovals = $.permissionsToCreateVolumeRemovals;
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotAttributesArgs $;

        public Builder() {
            $ = new SnapshotAttributesArgs();
        }

        public Builder(SnapshotAttributesArgs defaults) {
            $ = new SnapshotAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissionsToCreateVolumeAdditions Information about the users to whom you want to give permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionsToCreateVolumeAdditions(@Nullable Output<SnapshotAttributesPermissionsToCreateVolumeAdditionsArgs> permissionsToCreateVolumeAdditions) {
            $.permissionsToCreateVolumeAdditions = permissionsToCreateVolumeAdditions;
            return this;
        }

        /**
         * @param permissionsToCreateVolumeAdditions Information about the users to whom you want to give permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionsToCreateVolumeAdditions(SnapshotAttributesPermissionsToCreateVolumeAdditionsArgs permissionsToCreateVolumeAdditions) {
            return permissionsToCreateVolumeAdditions(Output.of(permissionsToCreateVolumeAdditions));
        }

        /**
         * @param permissionsToCreateVolumeRemovals Information about the users from whom you want to remove permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionsToCreateVolumeRemovals(@Nullable Output<List<SnapshotAttributesPermissionsToCreateVolumeRemovalArgs>> permissionsToCreateVolumeRemovals) {
            $.permissionsToCreateVolumeRemovals = permissionsToCreateVolumeRemovals;
            return this;
        }

        /**
         * @param permissionsToCreateVolumeRemovals Information about the users from whom you want to remove permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionsToCreateVolumeRemovals(List<SnapshotAttributesPermissionsToCreateVolumeRemovalArgs> permissionsToCreateVolumeRemovals) {
            return permissionsToCreateVolumeRemovals(Output.of(permissionsToCreateVolumeRemovals));
        }

        /**
         * @param permissionsToCreateVolumeRemovals Information about the users from whom you want to remove permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionsToCreateVolumeRemovals(SnapshotAttributesPermissionsToCreateVolumeRemovalArgs... permissionsToCreateVolumeRemovals) {
            return permissionsToCreateVolumeRemovals(List.of(permissionsToCreateVolumeRemovals));
        }

        /**
         * @param snapshotId The ID of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The ID of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        public SnapshotAttributesArgs build() {
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            return $;
        }
    }

}