// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetDhcpOptionsDhcpOptionTag;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDhcpOptionsDhcpOption {
    /**
     * @return If true, lists all default DHCP options set. If false, lists all non-default DHCP options set.
     * 
     */
    private Boolean default_;
    /**
     * @return The ID of the DHCP options set.
     * 
     */
    private String dhcpOptionsSetId;
    /**
     * @return The domain name.
     * 
     */
    private String domainName;
    /**
     * @return The IPs of the domain name servers used for the DHCP options sets.
     * 
     */
    private List<String> domainNameServers;
    /**
     * @return The IPs of the log servers used for the DHCP options sets.
     * 
     */
    private List<String> logServers;
    /**
     * @return The IPs of the Network Time Protocol (NTP) servers used for the DHCP options sets.
     * 
     */
    private List<String> ntpServers;
    /**
     * @return The key/value combinations of the tags associated with the DHCP options sets, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    private List<GetDhcpOptionsDhcpOptionTag> tags;

    private GetDhcpOptionsDhcpOption() {}
    /**
     * @return If true, lists all default DHCP options set. If false, lists all non-default DHCP options set.
     * 
     */
    public Boolean default_() {
        return this.default_;
    }
    /**
     * @return The ID of the DHCP options set.
     * 
     */
    public String dhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }
    /**
     * @return The domain name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The IPs of the domain name servers used for the DHCP options sets.
     * 
     */
    public List<String> domainNameServers() {
        return this.domainNameServers;
    }
    /**
     * @return The IPs of the log servers used for the DHCP options sets.
     * 
     */
    public List<String> logServers() {
        return this.logServers;
    }
    /**
     * @return The IPs of the Network Time Protocol (NTP) servers used for the DHCP options sets.
     * 
     */
    public List<String> ntpServers() {
        return this.ntpServers;
    }
    /**
     * @return The key/value combinations of the tags associated with the DHCP options sets, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    public List<GetDhcpOptionsDhcpOptionTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDhcpOptionsDhcpOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean default_;
        private String dhcpOptionsSetId;
        private String domainName;
        private List<String> domainNameServers;
        private List<String> logServers;
        private List<String> ntpServers;
        private List<GetDhcpOptionsDhcpOptionTag> tags;
        public Builder() {}
        public Builder(GetDhcpOptionsDhcpOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.dhcpOptionsSetId = defaults.dhcpOptionsSetId;
    	      this.domainName = defaults.domainName;
    	      this.domainNameServers = defaults.domainNameServers;
    	      this.logServers = defaults.logServers;
    	      this.ntpServers = defaults.ntpServers;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter("default")
        public Builder default_(Boolean default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        @CustomType.Setter
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = Objects.requireNonNull(dhcpOptionsSetId);
            return this;
        }
        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder domainNameServers(List<String> domainNameServers) {
            this.domainNameServers = Objects.requireNonNull(domainNameServers);
            return this;
        }
        public Builder domainNameServers(String... domainNameServers) {
            return domainNameServers(List.of(domainNameServers));
        }
        @CustomType.Setter
        public Builder logServers(List<String> logServers) {
            this.logServers = Objects.requireNonNull(logServers);
            return this;
        }
        public Builder logServers(String... logServers) {
            return logServers(List.of(logServers));
        }
        @CustomType.Setter
        public Builder ntpServers(List<String> ntpServers) {
            this.ntpServers = Objects.requireNonNull(ntpServers);
            return this;
        }
        public Builder ntpServers(String... ntpServers) {
            return ntpServers(List.of(ntpServers));
        }
        @CustomType.Setter
        public Builder tags(List<GetDhcpOptionsDhcpOptionTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetDhcpOptionsDhcpOptionTag... tags) {
            return tags(List.of(tags));
        }
        public GetDhcpOptionsDhcpOption build() {
            final var o = new GetDhcpOptionsDhcpOption();
            o.default_ = default_;
            o.dhcpOptionsSetId = dhcpOptionsSetId;
            o.domainName = domainName;
            o.domainNameServers = domainNameServers;
            o.logServers = logServers;
            o.ntpServers = ntpServers;
            o.tags = tags;
            return o;
        }
    }
}
