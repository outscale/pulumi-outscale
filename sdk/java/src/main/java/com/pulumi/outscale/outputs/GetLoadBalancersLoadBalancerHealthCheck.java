// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersLoadBalancerHealthCheck {
    /**
     * @return The number of seconds between two pings (between `5` and `600` both included).
     * 
     */
    private Integer checkInterval;
    /**
     * @return The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
     * 
     */
    private Integer healthyThreshold;
    /**
     * @return If you use the HTTP or HTTPS protocols, the ping path.
     * 
     */
    private String path;
    /**
     * @return The port number (between `1` and `65535`, both included).
     * 
     */
    private Integer port;
    /**
     * @return The protocol for the URL of the VM (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
     * 
     */
    private String protocol;
    /**
     * @return The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
     * 
     */
    private Integer timeout;
    /**
     * @return The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
     * 
     */
    private Integer unhealthyThreshold;

    private GetLoadBalancersLoadBalancerHealthCheck() {}
    /**
     * @return The number of seconds between two pings (between `5` and `600` both included).
     * 
     */
    public Integer checkInterval() {
        return this.checkInterval;
    }
    /**
     * @return The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
     * 
     */
    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * @return If you use the HTTP or HTTPS protocols, the ping path.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The port number (between `1` and `65535`, both included).
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The protocol for the URL of the VM (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }
    /**
     * @return The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
     * 
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersLoadBalancerHealthCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer checkInterval;
        private Integer healthyThreshold;
        private String path;
        private Integer port;
        private String protocol;
        private Integer timeout;
        private Integer unhealthyThreshold;
        public Builder() {}
        public Builder(GetLoadBalancersLoadBalancerHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        @CustomType.Setter
        public Builder checkInterval(Integer checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }
        @CustomType.Setter
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        @CustomType.Setter
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public GetLoadBalancersLoadBalancerHealthCheck build() {
            final var o = new GetLoadBalancersLoadBalancerHealthCheck();
            o.checkInterval = checkInterval;
            o.healthyThreshold = healthyThreshold;
            o.path = path;
            o.port = port;
            o.protocol = protocol;
            o.timeout = timeout;
            o.unhealthyThreshold = unhealthyThreshold;
            return o;
        }
    }
}
