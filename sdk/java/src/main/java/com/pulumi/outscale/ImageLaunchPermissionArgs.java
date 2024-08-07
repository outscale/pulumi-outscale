// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.ImageLaunchPermissionPermissionAdditionsArgs;
import com.pulumi.outscale.inputs.ImageLaunchPermissionPermissionRemovalsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageLaunchPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageLaunchPermissionArgs Empty = new ImageLaunchPermissionArgs();

    /**
     * The ID of the OMI you want to modify.
     * 
     */
    @Import(name="imageId", required=true)
    private Output<String> imageId;

    /**
     * @return The ID of the OMI you want to modify.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
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

    private ImageLaunchPermissionArgs() {}

    private ImageLaunchPermissionArgs(ImageLaunchPermissionArgs $) {
        this.imageId = $.imageId;
        this.permissionAdditions = $.permissionAdditions;
        this.permissionRemovals = $.permissionRemovals;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageLaunchPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageLaunchPermissionArgs $;

        public Builder() {
            $ = new ImageLaunchPermissionArgs();
        }

        public Builder(ImageLaunchPermissionArgs defaults) {
            $ = new ImageLaunchPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageId The ID of the OMI you want to modify.
         * 
         * @return builder
         * 
         */
        public Builder imageId(Output<String> imageId) {
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

        public ImageLaunchPermissionArgs build() {
            $.imageId = Objects.requireNonNull($.imageId, "expected parameter 'imageId' to be non-null");
            return $;
        }
    }

}
