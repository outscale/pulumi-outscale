// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetLoadBalancerHealthCheckArgs Empty = new GetLoadBalancerHealthCheckArgs();

    /**
     * The number of seconds between two pings (between `5` and `600` both included).
     * 
     */
    @Import(name="checkInterval", required=true)
    private Output<Integer> checkInterval;

    /**
     * @return The number of seconds between two pings (between `5` and `600` both included).
     * 
     */
    public Output<Integer> checkInterval() {
        return this.checkInterval;
    }

    /**
     * The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
     * 
     */
    @Import(name="healthyThreshold", required=true)
    private Output<Integer> healthyThreshold;

    /**
     * @return The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
     * 
     */
    public Output<Integer> healthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * If you use the HTTP or HTTPS protocols, the ping path.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return If you use the HTTP or HTTPS protocols, the ping path.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The port number (between `1` and `65535`, both included).
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port number (between `1` and `65535`, both included).
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The protocol for the URL of the VM (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The protocol for the URL of the VM (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
     * 
     */
    @Import(name="timeout", required=true)
    private Output<Integer> timeout;

    /**
     * @return The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
     * 
     */
    public Output<Integer> timeout() {
        return this.timeout;
    }

    /**
     * The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
     * 
     */
    @Import(name="unhealthyThreshold", required=true)
    private Output<Integer> unhealthyThreshold;

    /**
     * @return The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
     * 
     */
    public Output<Integer> unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    private GetLoadBalancerHealthCheckArgs() {}

    private GetLoadBalancerHealthCheckArgs(GetLoadBalancerHealthCheckArgs $) {
        this.checkInterval = $.checkInterval;
        this.healthyThreshold = $.healthyThreshold;
        this.path = $.path;
        this.port = $.port;
        this.protocol = $.protocol;
        this.timeout = $.timeout;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerHealthCheckArgs $;

        public Builder() {
            $ = new GetLoadBalancerHealthCheckArgs();
        }

        public Builder(GetLoadBalancerHealthCheckArgs defaults) {
            $ = new GetLoadBalancerHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkInterval The number of seconds between two pings (between `5` and `600` both included).
         * 
         * @return builder
         * 
         */
        public Builder checkInterval(Output<Integer> checkInterval) {
            $.checkInterval = checkInterval;
            return this;
        }

        /**
         * @param checkInterval The number of seconds between two pings (between `5` and `600` both included).
         * 
         * @return builder
         * 
         */
        public Builder checkInterval(Integer checkInterval) {
            return checkInterval(Output.of(checkInterval));
        }

        /**
         * @param healthyThreshold The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(Output<Integer> healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * @param healthyThreshold The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            return healthyThreshold(Output.of(healthyThreshold));
        }

        /**
         * @param path If you use the HTTP or HTTPS protocols, the ping path.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path If you use the HTTP or HTTPS protocols, the ping path.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The port number (between `1` and `65535`, both included).
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number (between `1` and `65535`, both included).
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The protocol for the URL of the VM (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol for the URL of the VM (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param timeout The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
         * 
         * @return builder
         * 
         */
        public Builder timeout(Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param unhealthyThreshold The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(Output<Integer> unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * @param unhealthyThreshold The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            return unhealthyThreshold(Output.of(unhealthyThreshold));
        }

        public GetLoadBalancerHealthCheckArgs build() {
            $.checkInterval = Objects.requireNonNull($.checkInterval, "expected parameter 'checkInterval' to be non-null");
            $.healthyThreshold = Objects.requireNonNull($.healthyThreshold, "expected parameter 'healthyThreshold' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.timeout = Objects.requireNonNull($.timeout, "expected parameter 'timeout' to be non-null");
            $.unhealthyThreshold = Objects.requireNonNull($.unhealthyThreshold, "expected parameter 'unhealthyThreshold' to be non-null");
            return $;
        }
    }

}
