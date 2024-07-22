// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotPermissionsToCreateVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotPermissionsToCreateVolumeArgs Empty = new SnapshotPermissionsToCreateVolumeArgs();

    /**
     * The account ID of the owner of the snapshot.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account ID of the owner of the snapshot.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * A global permission for all accounts.&lt;br /&gt;
     * (Request) Set this parameter to true to make the resource public (if the parent parameter is `Additions`) or to make the resource private (if the parent parameter is `Removals`).&lt;br /&gt;
     * (Response) If true, the resource is public. If false, the resource is private.
     * 
     */
    @Import(name="globalPermission")
    private @Nullable Output<Boolean> globalPermission;

    /**
     * @return A global permission for all accounts.&lt;br /&gt;
     * (Request) Set this parameter to true to make the resource public (if the parent parameter is `Additions`) or to make the resource private (if the parent parameter is `Removals`).&lt;br /&gt;
     * (Response) If true, the resource is public. If false, the resource is private.
     * 
     */
    public Optional<Output<Boolean>> globalPermission() {
        return Optional.ofNullable(this.globalPermission);
    }

    private SnapshotPermissionsToCreateVolumeArgs() {}

    private SnapshotPermissionsToCreateVolumeArgs(SnapshotPermissionsToCreateVolumeArgs $) {
        this.accountId = $.accountId;
        this.globalPermission = $.globalPermission;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotPermissionsToCreateVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotPermissionsToCreateVolumeArgs $;

        public Builder() {
            $ = new SnapshotPermissionsToCreateVolumeArgs();
        }

        public Builder(SnapshotPermissionsToCreateVolumeArgs defaults) {
            $ = new SnapshotPermissionsToCreateVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID of the owner of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID of the owner of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param globalPermission A global permission for all accounts.&lt;br /&gt;
         * (Request) Set this parameter to true to make the resource public (if the parent parameter is `Additions`) or to make the resource private (if the parent parameter is `Removals`).&lt;br /&gt;
         * (Response) If true, the resource is public. If false, the resource is private.
         * 
         * @return builder
         * 
         */
        public Builder globalPermission(@Nullable Output<Boolean> globalPermission) {
            $.globalPermission = globalPermission;
            return this;
        }

        /**
         * @param globalPermission A global permission for all accounts.&lt;br /&gt;
         * (Request) Set this parameter to true to make the resource public (if the parent parameter is `Additions`) or to make the resource private (if the parent parameter is `Removals`).&lt;br /&gt;
         * (Response) If true, the resource is public. If false, the resource is private.
         * 
         * @return builder
         * 
         */
        public Builder globalPermission(Boolean globalPermission) {
            return globalPermission(Output.of(globalPermission));
        }

        public SnapshotPermissionsToCreateVolumeArgs build() {
            return $;
        }
    }

}
