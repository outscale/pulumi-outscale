// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.DhcpOptionTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DhcpOptionState extends com.pulumi.resources.ResourceArgs {

    public static final DhcpOptionState Empty = new DhcpOptionState();

    /**
     * If true, the DHCP options set is a default one. If false, it is not.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return If true, the DHCP options set is a default one. If false, it is not.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * The ID of the DHCP options set.
     * 
     */
    @Import(name="dhcpOptionsSetId")
    private @Nullable Output<String> dhcpOptionsSetId;

    /**
     * @return The ID of the DHCP options set.
     * 
     */
    public Optional<Output<String>> dhcpOptionsSetId() {
        return Optional.ofNullable(this.dhcpOptionsSetId);
    }

    /**
     * Specify a domain name (for example, MyCompany.com). You can specify only one domain name. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return Specify a domain name (for example, MyCompany.com). You can specify only one domain name. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The IPs of domain name servers. If no IPs are specified, the `OutscaleProvidedDNS` value is set by default. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     * 
     */
    @Import(name="domainNameServers")
    private @Nullable Output<List<String>> domainNameServers;

    /**
     * @return The IPs of domain name servers. If no IPs are specified, the `OutscaleProvidedDNS` value is set by default. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     * 
     */
    public Optional<Output<List<String>>> domainNameServers() {
        return Optional.ofNullable(this.domainNameServers);
    }

    /**
     * The IPs of the log servers. You must specify at least one of the following parameters: `domain_name`, `domain_name_servers`, `log_servers`, or `ntp_servers`.
     * 
     */
    @Import(name="logServers")
    private @Nullable Output<List<String>> logServers;

    /**
     * @return The IPs of the log servers. You must specify at least one of the following parameters: `domain_name`, `domain_name_servers`, `log_servers`, or `ntp_servers`.
     * 
     */
    public Optional<Output<List<String>>> logServers() {
        return Optional.ofNullable(this.logServers);
    }

    /**
     * The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     * 
     */
    @Import(name="ntpServers")
    private @Nullable Output<List<String>> ntpServers;

    /**
     * @return The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
     * 
     */
    public Optional<Output<List<String>>> ntpServers() {
        return Optional.ofNullable(this.ntpServers);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * A tag to add to this resource. You can specify this argument several times.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DhcpOptionTagArgs>> tags;

    /**
     * @return A tag to add to this resource. You can specify this argument several times.
     * 
     */
    public Optional<Output<List<DhcpOptionTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DhcpOptionState() {}

    private DhcpOptionState(DhcpOptionState $) {
        this.default_ = $.default_;
        this.dhcpOptionsSetId = $.dhcpOptionsSetId;
        this.domainName = $.domainName;
        this.domainNameServers = $.domainNameServers;
        this.logServers = $.logServers;
        this.ntpServers = $.ntpServers;
        this.requestId = $.requestId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DhcpOptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DhcpOptionState $;

        public Builder() {
            $ = new DhcpOptionState();
        }

        public Builder(DhcpOptionState defaults) {
            $ = new DhcpOptionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ If true, the DHCP options set is a default one. If false, it is not.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ If true, the DHCP options set is a default one. If false, it is not.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param dhcpOptionsSetId The ID of the DHCP options set.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetId(@Nullable Output<String> dhcpOptionsSetId) {
            $.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * @param dhcpOptionsSetId The ID of the DHCP options set.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            return dhcpOptionsSetId(Output.of(dhcpOptionsSetId));
        }

        /**
         * @param domainName Specify a domain name (for example, MyCompany.com). You can specify only one domain name. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Specify a domain name (for example, MyCompany.com). You can specify only one domain name. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param domainNameServers The IPs of domain name servers. If no IPs are specified, the `OutscaleProvidedDNS` value is set by default. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
         * 
         * @return builder
         * 
         */
        public Builder domainNameServers(@Nullable Output<List<String>> domainNameServers) {
            $.domainNameServers = domainNameServers;
            return this;
        }

        /**
         * @param domainNameServers The IPs of domain name servers. If no IPs are specified, the `OutscaleProvidedDNS` value is set by default. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
         * 
         * @return builder
         * 
         */
        public Builder domainNameServers(List<String> domainNameServers) {
            return domainNameServers(Output.of(domainNameServers));
        }

        /**
         * @param domainNameServers The IPs of domain name servers. If no IPs are specified, the `OutscaleProvidedDNS` value is set by default. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
         * 
         * @return builder
         * 
         */
        public Builder domainNameServers(String... domainNameServers) {
            return domainNameServers(List.of(domainNameServers));
        }

        /**
         * @param logServers The IPs of the log servers. You must specify at least one of the following parameters: `domain_name`, `domain_name_servers`, `log_servers`, or `ntp_servers`.
         * 
         * @return builder
         * 
         */
        public Builder logServers(@Nullable Output<List<String>> logServers) {
            $.logServers = logServers;
            return this;
        }

        /**
         * @param logServers The IPs of the log servers. You must specify at least one of the following parameters: `domain_name`, `domain_name_servers`, `log_servers`, or `ntp_servers`.
         * 
         * @return builder
         * 
         */
        public Builder logServers(List<String> logServers) {
            return logServers(Output.of(logServers));
        }

        /**
         * @param logServers The IPs of the log servers. You must specify at least one of the following parameters: `domain_name`, `domain_name_servers`, `log_servers`, or `ntp_servers`.
         * 
         * @return builder
         * 
         */
        public Builder logServers(String... logServers) {
            return logServers(List.of(logServers));
        }

        /**
         * @param ntpServers The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(@Nullable Output<List<String>> ntpServers) {
            $.ntpServers = ntpServers;
            return this;
        }

        /**
         * @param ntpServers The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(List<String> ntpServers) {
            return ntpServers(Output.of(ntpServers));
        }

        /**
         * @param ntpServers The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: `DomainName`, `DomainNameServers`, or `NtpServers`.
         * 
         * @return builder
         * 
         */
        public Builder ntpServers(String... ntpServers) {
            return ntpServers(List.of(ntpServers));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<DhcpOptionTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<DhcpOptionTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A tag to add to this resource. You can specify this argument several times.
         * 
         * @return builder
         * 
         */
        public Builder tags(DhcpOptionTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DhcpOptionState build() {
            return $;
        }
    }

}
