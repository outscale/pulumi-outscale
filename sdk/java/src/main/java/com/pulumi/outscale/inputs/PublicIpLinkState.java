// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.PublicIpLinkTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublicIpLinkState extends com.pulumi.resources.ResourceArgs {

    public static final PublicIpLinkState Empty = new PublicIpLinkState();

    /**
     * If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
     * 
     */
    @Import(name="allowRelink")
    private @Nullable Output<Boolean> allowRelink;

    /**
     * @return If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
     * 
     */
    public Optional<Output<Boolean>> allowRelink() {
        return Optional.ofNullable(this.allowRelink);
    }

    /**
     * (Net only) The ID representing the association of the public IP with the VM or the NIC.
     * 
     */
    @Import(name="linkPublicIpId")
    private @Nullable Output<String> linkPublicIpId;

    /**
     * @return (Net only) The ID representing the association of the public IP with the VM or the NIC.
     * 
     */
    public Optional<Output<String>> linkPublicIpId() {
        return Optional.ofNullable(this.linkPublicIpId);
    }

    @Import(name="nicAccountId")
    private @Nullable Output<String> nicAccountId;

    public Optional<Output<String>> nicAccountId() {
        return Optional.ofNullable(this.nicAccountId);
    }

    /**
     * (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vm_id` parameter instead. You cannot specify both parameters at the same time.
     * 
     */
    @Import(name="nicId")
    private @Nullable Output<String> nicId;

    /**
     * @return (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vm_id` parameter instead. You cannot specify both parameters at the same time.
     * 
     */
    public Optional<Output<String>> nicId() {
        return Optional.ofNullable(this.nicId);
    }

    /**
     * (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
     * 
     */
    @Import(name="privateIp")
    private @Nullable Output<String> privateIp;

    /**
     * @return (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
     * 
     */
    public Optional<Output<String>> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }

    /**
     * The public IP. This parameter is required unless you use the `public_ip_id` parameter.
     * 
     */
    @Import(name="publicIp")
    private @Nullable Output<String> publicIp;

    /**
     * @return The public IP. This parameter is required unless you use the `public_ip_id` parameter.
     * 
     */
    public Optional<Output<String>> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }

    /**
     * The allocation ID of the public IP. This parameter is required unless you use the `public_ip` parameter.
     * 
     */
    @Import(name="publicIpId")
    private @Nullable Output<String> publicIpId;

    /**
     * @return The allocation ID of the public IP. This parameter is required unless you use the `public_ip` parameter.
     * 
     */
    public Optional<Output<String>> publicIpId() {
        return Optional.ofNullable(this.publicIpId);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="tags")
    private @Nullable Output<List<PublicIpLinkTagArgs>> tags;

    public Optional<Output<List<PublicIpLinkTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the VM.&lt;br /&gt;- In the public Cloud, this parameter is required.&lt;br /&gt;- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nic_id` parameter instead. You cannot specify both parameters at the same time.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<String> vmId;

    /**
     * @return The ID of the VM.&lt;br /&gt;- In the public Cloud, this parameter is required.&lt;br /&gt;- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nic_id` parameter instead. You cannot specify both parameters at the same time.
     * 
     */
    public Optional<Output<String>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private PublicIpLinkState() {}

    private PublicIpLinkState(PublicIpLinkState $) {
        this.allowRelink = $.allowRelink;
        this.linkPublicIpId = $.linkPublicIpId;
        this.nicAccountId = $.nicAccountId;
        this.nicId = $.nicId;
        this.privateIp = $.privateIp;
        this.publicIp = $.publicIp;
        this.publicIpId = $.publicIpId;
        this.requestId = $.requestId;
        this.tags = $.tags;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicIpLinkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicIpLinkState $;

        public Builder() {
            $ = new PublicIpLinkState();
        }

        public Builder(PublicIpLinkState defaults) {
            $ = new PublicIpLinkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowRelink If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
         * 
         * @return builder
         * 
         */
        public Builder allowRelink(@Nullable Output<Boolean> allowRelink) {
            $.allowRelink = allowRelink;
            return this;
        }

        /**
         * @param allowRelink If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
         * 
         * @return builder
         * 
         */
        public Builder allowRelink(Boolean allowRelink) {
            return allowRelink(Output.of(allowRelink));
        }

        /**
         * @param linkPublicIpId (Net only) The ID representing the association of the public IP with the VM or the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIpId(@Nullable Output<String> linkPublicIpId) {
            $.linkPublicIpId = linkPublicIpId;
            return this;
        }

        /**
         * @param linkPublicIpId (Net only) The ID representing the association of the public IP with the VM or the NIC.
         * 
         * @return builder
         * 
         */
        public Builder linkPublicIpId(String linkPublicIpId) {
            return linkPublicIpId(Output.of(linkPublicIpId));
        }

        public Builder nicAccountId(@Nullable Output<String> nicAccountId) {
            $.nicAccountId = nicAccountId;
            return this;
        }

        public Builder nicAccountId(String nicAccountId) {
            return nicAccountId(Output.of(nicAccountId));
        }

        /**
         * @param nicId (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vm_id` parameter instead. You cannot specify both parameters at the same time.
         * 
         * @return builder
         * 
         */
        public Builder nicId(@Nullable Output<String> nicId) {
            $.nicId = nicId;
            return this;
        }

        /**
         * @param nicId (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the `vm_id` parameter instead. You cannot specify both parameters at the same time.
         * 
         * @return builder
         * 
         */
        public Builder nicId(String nicId) {
            return nicId(Output.of(nicId));
        }

        /**
         * @param privateIp (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
         * 
         * @return builder
         * 
         */
        public Builder privateIp(@Nullable Output<String> privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        /**
         * @param privateIp (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
         * 
         * @return builder
         * 
         */
        public Builder privateIp(String privateIp) {
            return privateIp(Output.of(privateIp));
        }

        /**
         * @param publicIp The public IP. This parameter is required unless you use the `public_ip_id` parameter.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(@Nullable Output<String> publicIp) {
            $.publicIp = publicIp;
            return this;
        }

        /**
         * @param publicIp The public IP. This parameter is required unless you use the `public_ip_id` parameter.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(String publicIp) {
            return publicIp(Output.of(publicIp));
        }

        /**
         * @param publicIpId The allocation ID of the public IP. This parameter is required unless you use the `public_ip` parameter.
         * 
         * @return builder
         * 
         */
        public Builder publicIpId(@Nullable Output<String> publicIpId) {
            $.publicIpId = publicIpId;
            return this;
        }

        /**
         * @param publicIpId The allocation ID of the public IP. This parameter is required unless you use the `public_ip` parameter.
         * 
         * @return builder
         * 
         */
        public Builder publicIpId(String publicIpId) {
            return publicIpId(Output.of(publicIpId));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder tags(@Nullable Output<List<PublicIpLinkTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<PublicIpLinkTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(PublicIpLinkTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param vmId The ID of the VM.&lt;br /&gt;- In the public Cloud, this parameter is required.&lt;br /&gt;- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nic_id` parameter instead. You cannot specify both parameters at the same time.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<String> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The ID of the VM.&lt;br /&gt;- In the public Cloud, this parameter is required.&lt;br /&gt;- In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the `nic_id` parameter instead. You cannot specify both parameters at the same time.
         * 
         * @return builder
         * 
         */
        public Builder vmId(String vmId) {
            return vmId(Output.of(vmId));
        }

        public PublicIpLinkState build() {
            return $;
        }
    }

}
