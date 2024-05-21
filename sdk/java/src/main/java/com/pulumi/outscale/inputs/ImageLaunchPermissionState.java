// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.ImageLaunchPermissionPermissionAdditionsArgs;
import com.pulumi.outscale.inputs.ImageLaunchPermissionPermissionRemovalsArgs;
import com.pulumi.outscale.inputs.ImageLaunchPermissionPermissionsToLaunchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageLaunchPermissionState extends com.pulumi.resources.ResourceArgs {

    public static final ImageLaunchPermissionState Empty = new ImageLaunchPermissionState();

    /**
     * The description of the OMI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the OMI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the OMI you want to modify.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The ID of the OMI you want to modify.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * Information about the users to whom you want to give permissions for the resource.
     * 
     */
    @Import(name="permissionAdditions")
    private @Nullable Output<ImageLaunchPermissionPermissionAdditionsArgs> permissionAdditions;

    /**
     * @return Information about the users to whom you want to give permissions for the resource.
     * 
     */
    public Optional<Output<ImageLaunchPermissionPermissionAdditionsArgs>> permissionAdditions() {
        return Optional.ofNullable(this.permissionAdditions);
    }

    /**
     * Information about the users from whom you want to remove permissions for the resource.
     * 
     */
    @Import(name="permissionRemovals")
    private @Nullable Output<ImageLaunchPermissionPermissionRemovalsArgs> permissionRemovals;

    /**
     * @return Information about the users from whom you want to remove permissions for the resource.
     * 
     */
    public Optional<Output<ImageLaunchPermissionPermissionRemovalsArgs>> permissionRemovals() {
        return Optional.ofNullable(this.permissionRemovals);
    }

    /**
     * Permissions for the resource.
     * 
     */
    @Import(name="permissionsToLaunches")
    private @Nullable Output<List<ImageLaunchPermissionPermissionsToLaunchArgs>> permissionsToLaunches;

    /**
     * @return Permissions for the resource.
     * 
     */
    public Optional<Output<List<ImageLaunchPermissionPermissionsToLaunchArgs>>> permissionsToLaunches() {
        return Optional.ofNullable(this.permissionsToLaunches);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private ImageLaunchPermissionState() {}

    private ImageLaunchPermissionState(ImageLaunchPermissionState $) {
        this.description = $.description;
        this.imageId = $.imageId;
        this.permissionAdditions = $.permissionAdditions;
        this.permissionRemovals = $.permissionRemovals;
        this.permissionsToLaunches = $.permissionsToLaunches;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageLaunchPermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageLaunchPermissionState $;

        public Builder() {
            $ = new ImageLaunchPermissionState();
        }

        public Builder(ImageLaunchPermissionState defaults) {
            $ = new ImageLaunchPermissionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the OMI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the OMI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param imageId The ID of the OMI you want to modify.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The ID of the OMI you want to modify.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param permissionAdditions Information about the users to whom you want to give permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionAdditions(@Nullable Output<ImageLaunchPermissionPermissionAdditionsArgs> permissionAdditions) {
            $.permissionAdditions = permissionAdditions;
            return this;
        }

        /**
         * @param permissionAdditions Information about the users to whom you want to give permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionAdditions(ImageLaunchPermissionPermissionAdditionsArgs permissionAdditions) {
            return permissionAdditions(Output.of(permissionAdditions));
        }

        /**
         * @param permissionRemovals Information about the users from whom you want to remove permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionRemovals(@Nullable Output<ImageLaunchPermissionPermissionRemovalsArgs> permissionRemovals) {
            $.permissionRemovals = permissionRemovals;
            return this;
        }

        /**
         * @param permissionRemovals Information about the users from whom you want to remove permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionRemovals(ImageLaunchPermissionPermissionRemovalsArgs permissionRemovals) {
            return permissionRemovals(Output.of(permissionRemovals));
        }

        /**
         * @param permissionsToLaunches Permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionsToLaunches(@Nullable Output<List<ImageLaunchPermissionPermissionsToLaunchArgs>> permissionsToLaunches) {
            $.permissionsToLaunches = permissionsToLaunches;
            return this;
        }

        /**
         * @param permissionsToLaunches Permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionsToLaunches(List<ImageLaunchPermissionPermissionsToLaunchArgs> permissionsToLaunches) {
            return permissionsToLaunches(Output.of(permissionsToLaunches));
        }

        /**
         * @param permissionsToLaunches Permissions for the resource.
         * 
         * @return builder
         * 
         */
        public Builder permissionsToLaunches(ImageLaunchPermissionPermissionsToLaunchArgs... permissionsToLaunches) {
            return permissionsToLaunches(List.of(permissionsToLaunches));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public ImageLaunchPermissionState build() {
            return $;
        }
    }

}