// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.OutboundRuleRuleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutboundRuleState extends com.pulumi.resources.ResourceArgs {

    public static final OutboundRuleState Empty = new OutboundRuleState();

    @Import(name="flow")
    private @Nullable Output<String> flow;

    public Optional<Output<String>> flow() {
        return Optional.ofNullable(this.flow);
    }

    @Import(name="fromPortRange")
    private @Nullable Output<Integer> fromPortRange;

    public Optional<Output<Integer>> fromPortRange() {
        return Optional.ofNullable(this.fromPortRange);
    }

    @Import(name="ipProtocol")
    private @Nullable Output<String> ipProtocol;

    public Optional<Output<String>> ipProtocol() {
        return Optional.ofNullable(this.ipProtocol);
    }

    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    @Import(name="netId")
    private @Nullable Output<String> netId;

    public Optional<Output<String>> netId() {
        return Optional.ofNullable(this.netId);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="rules")
    private @Nullable Output<List<OutboundRuleRuleArgs>> rules;

    public Optional<Output<List<OutboundRuleRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    @Import(name="securityGroupAccountIdToLink")
    private @Nullable Output<String> securityGroupAccountIdToLink;

    public Optional<Output<String>> securityGroupAccountIdToLink() {
        return Optional.ofNullable(this.securityGroupAccountIdToLink);
    }

    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    @Import(name="securityGroupName")
    private @Nullable Output<String> securityGroupName;

    public Optional<Output<String>> securityGroupName() {
        return Optional.ofNullable(this.securityGroupName);
    }

    @Import(name="securityGroupNameToLink")
    private @Nullable Output<String> securityGroupNameToLink;

    public Optional<Output<String>> securityGroupNameToLink() {
        return Optional.ofNullable(this.securityGroupNameToLink);
    }

    @Import(name="toPortRange")
    private @Nullable Output<Integer> toPortRange;

    public Optional<Output<Integer>> toPortRange() {
        return Optional.ofNullable(this.toPortRange);
    }

    private OutboundRuleState() {}

    private OutboundRuleState(OutboundRuleState $) {
        this.flow = $.flow;
        this.fromPortRange = $.fromPortRange;
        this.ipProtocol = $.ipProtocol;
        this.ipRange = $.ipRange;
        this.netId = $.netId;
        this.requestId = $.requestId;
        this.rules = $.rules;
        this.securityGroupAccountIdToLink = $.securityGroupAccountIdToLink;
        this.securityGroupId = $.securityGroupId;
        this.securityGroupName = $.securityGroupName;
        this.securityGroupNameToLink = $.securityGroupNameToLink;
        this.toPortRange = $.toPortRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutboundRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutboundRuleState $;

        public Builder() {
            $ = new OutboundRuleState();
        }

        public Builder(OutboundRuleState defaults) {
            $ = new OutboundRuleState(Objects.requireNonNull(defaults));
        }

        public Builder flow(@Nullable Output<String> flow) {
            $.flow = flow;
            return this;
        }

        public Builder flow(String flow) {
            return flow(Output.of(flow));
        }

        public Builder fromPortRange(@Nullable Output<Integer> fromPortRange) {
            $.fromPortRange = fromPortRange;
            return this;
        }

        public Builder fromPortRange(Integer fromPortRange) {
            return fromPortRange(Output.of(fromPortRange));
        }

        public Builder ipProtocol(@Nullable Output<String> ipProtocol) {
            $.ipProtocol = ipProtocol;
            return this;
        }

        public Builder ipProtocol(String ipProtocol) {
            return ipProtocol(Output.of(ipProtocol));
        }

        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        public Builder netId(@Nullable Output<String> netId) {
            $.netId = netId;
            return this;
        }

        public Builder netId(String netId) {
            return netId(Output.of(netId));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder rules(@Nullable Output<List<OutboundRuleRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<OutboundRuleRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(OutboundRuleRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder securityGroupAccountIdToLink(@Nullable Output<String> securityGroupAccountIdToLink) {
            $.securityGroupAccountIdToLink = securityGroupAccountIdToLink;
            return this;
        }

        public Builder securityGroupAccountIdToLink(String securityGroupAccountIdToLink) {
            return securityGroupAccountIdToLink(Output.of(securityGroupAccountIdToLink));
        }

        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        public Builder securityGroupName(@Nullable Output<String> securityGroupName) {
            $.securityGroupName = securityGroupName;
            return this;
        }

        public Builder securityGroupName(String securityGroupName) {
            return securityGroupName(Output.of(securityGroupName));
        }

        public Builder securityGroupNameToLink(@Nullable Output<String> securityGroupNameToLink) {
            $.securityGroupNameToLink = securityGroupNameToLink;
            return this;
        }

        public Builder securityGroupNameToLink(String securityGroupNameToLink) {
            return securityGroupNameToLink(Output.of(securityGroupNameToLink));
        }

        public Builder toPortRange(@Nullable Output<Integer> toPortRange) {
            $.toPortRange = toPortRange;
            return this;
        }

        public Builder toPortRange(Integer toPortRange) {
            return toPortRange(Output.of(toPortRange));
        }

        public OutboundRuleState build() {
            return $;
        }
    }

}
