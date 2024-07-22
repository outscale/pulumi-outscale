// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NicLinkState extends com.pulumi.resources.ResourceArgs {

    public static final NicLinkState Empty = new NicLinkState();

    @Import(name="deleteOnVmDeletion")
    private @Nullable Output<Boolean> deleteOnVmDeletion;

    public Optional<Output<Boolean>> deleteOnVmDeletion() {
        return Optional.ofNullable(this.deleteOnVmDeletion);
    }

    /**
     * The index of the VM device for the NIC attachment (between `1` and `7`, both included).
     * 
     */
    @Import(name="deviceNumber")
    private @Nullable Output<Integer> deviceNumber;

    /**
     * @return The index of the VM device for the NIC attachment (between `1` and `7`, both included).
     * 
     */
    public Optional<Output<Integer>> deviceNumber() {
        return Optional.ofNullable(this.deviceNumber);
    }

    /**
     * The ID of the NIC attachment.
     * 
     */
    @Import(name="linkNicId")
    private @Nullable Output<String> linkNicId;

    /**
     * @return The ID of the NIC attachment.
     * 
     */
    public Optional<Output<String>> linkNicId() {
        return Optional.ofNullable(this.linkNicId);
    }

    /**
     * The ID of the NIC you want to attach.
     * 
     */
    @Import(name="nicId")
    private @Nullable Output<String> nicId;

    /**
     * @return The ID of the NIC you want to attach.
     * 
     */
    public Optional<Output<String>> nicId() {
        return Optional.ofNullable(this.nicId);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="vmAccountId")
    private @Nullable Output<String> vmAccountId;

    public Optional<Output<String>> vmAccountId() {
        return Optional.ofNullable(this.vmAccountId);
    }

    /**
     * The ID of the VM to which you want to attach the NIC.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<String> vmId;

    /**
     * @return The ID of the VM to which you want to attach the NIC.
     * 
     */
    public Optional<Output<String>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private NicLinkState() {}

    private NicLinkState(NicLinkState $) {
        this.deleteOnVmDeletion = $.deleteOnVmDeletion;
        this.deviceNumber = $.deviceNumber;
        this.linkNicId = $.linkNicId;
        this.nicId = $.nicId;
        this.requestId = $.requestId;
        this.state = $.state;
        this.vmAccountId = $.vmAccountId;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NicLinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NicLinkState $;

        public Builder() {
            $ = new NicLinkState();
        }

        public Builder(NicLinkState defaults) {
            $ = new NicLinkState(Objects.requireNonNull(defaults));
        }

        public Builder deleteOnVmDeletion(@Nullable Output<Boolean> deleteOnVmDeletion) {
            $.deleteOnVmDeletion = deleteOnVmDeletion;
            return this;
        }

        public Builder deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
            return deleteOnVmDeletion(Output.of(deleteOnVmDeletion));
        }

        /**
         * @param deviceNumber The index of the VM device for the NIC attachment (between `1` and `7`, both included).
         * 
         * @return builder
         * 
         */
        public Builder deviceNumber(@Nullable Output<Integer> deviceNumber) {
            $.deviceNumber = deviceNumber;
            return this;
        }

        /**
         * @param deviceNumber The index of the VM device for the NIC attachment (between `1` and `7`, both included).
         * 
         * @return builder
         * 
         */
        public Builder deviceNumber(Integer deviceNumber) {
            return deviceNumber(Output.of(deviceNumber));
        }

        /**
         * @param linkNicId The ID of the NIC attachment.
         * 
         * @return builder
         * 
         */
        public Builder linkNicId(@Nullable Output<String> linkNicId) {
            $.linkNicId = linkNicId;
            return this;
        }

        /**
         * @param linkNicId The ID of the NIC attachment.
         * 
         * @return builder
         * 
         */
        public Builder linkNicId(String linkNicId) {
            return linkNicId(Output.of(linkNicId));
        }

        /**
         * @param nicId The ID of the NIC you want to attach.
         * 
         * @return builder
         * 
         */
        public Builder nicId(@Nullable Output<String> nicId) {
            $.nicId = nicId;
            return this;
        }

        /**
         * @param nicId The ID of the NIC you want to attach.
         * 
         * @return builder
         * 
         */
        public Builder nicId(String nicId) {
            return nicId(Output.of(nicId));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder vmAccountId(@Nullable Output<String> vmAccountId) {
            $.vmAccountId = vmAccountId;
            return this;
        }

        public Builder vmAccountId(String vmAccountId) {
            return vmAccountId(Output.of(vmAccountId));
        }

        /**
         * @param vmId The ID of the VM to which you want to attach the NIC.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<String> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The ID of the VM to which you want to attach the NIC.
         * 
         * @return builder
         * 
         */
        public Builder vmId(String vmId) {
            return vmId(Output.of(vmId));
        }

        public NicLinkState build() {
            return $;
        }
    }

}
