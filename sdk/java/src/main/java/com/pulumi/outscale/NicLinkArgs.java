// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NicLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final NicLinkArgs Empty = new NicLinkArgs();

    /**
     * The index of the VM device for the NIC attachment (between `1` and `7`, both included).
     * 
     */
    @Import(name="deviceNumber", required=true)
    private Output<Integer> deviceNumber;

    /**
     * @return The index of the VM device for the NIC attachment (between `1` and `7`, both included).
     * 
     */
    public Output<Integer> deviceNumber() {
        return this.deviceNumber;
    }

    /**
     * The ID of the NIC you want to attach.
     * 
     */
    @Import(name="nicId", required=true)
    private Output<String> nicId;

    /**
     * @return The ID of the NIC you want to attach.
     * 
     */
    public Output<String> nicId() {
        return this.nicId;
    }

    /**
     * The ID of the VM to which you want to attach the NIC.
     * 
     */
    @Import(name="vmId", required=true)
    private Output<String> vmId;

    /**
     * @return The ID of the VM to which you want to attach the NIC.
     * 
     */
    public Output<String> vmId() {
        return this.vmId;
    }

    private NicLinkArgs() {}

    private NicLinkArgs(NicLinkArgs $) {
        this.deviceNumber = $.deviceNumber;
        this.nicId = $.nicId;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NicLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NicLinkArgs $;

        public Builder() {
            $ = new NicLinkArgs();
        }

        public Builder(NicLinkArgs defaults) {
            $ = new NicLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceNumber The index of the VM device for the NIC attachment (between `1` and `7`, both included).
         * 
         * @return builder
         * 
         */
        public Builder deviceNumber(Output<Integer> deviceNumber) {
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
         * @param nicId The ID of the NIC you want to attach.
         * 
         * @return builder
         * 
         */
        public Builder nicId(Output<String> nicId) {
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

        /**
         * @param vmId The ID of the VM to which you want to attach the NIC.
         * 
         * @return builder
         * 
         */
        public Builder vmId(Output<String> vmId) {
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

        public NicLinkArgs build() {
            $.deviceNumber = Objects.requireNonNull($.deviceNumber, "expected parameter 'deviceNumber' to be non-null");
            $.nicId = Objects.requireNonNull($.nicId, "expected parameter 'nicId' to be non-null");
            $.vmId = Objects.requireNonNull($.vmId, "expected parameter 'vmId' to be non-null");
            return $;
        }
    }

}
