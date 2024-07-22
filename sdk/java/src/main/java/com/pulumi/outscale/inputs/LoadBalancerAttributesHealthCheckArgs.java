// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerAttributesHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerAttributesHealthCheckArgs Empty = new LoadBalancerAttributesHealthCheckArgs();

    /**
     * The number of seconds between two pings (between `5` and `600` both included).
     * 
     */
    @Import(name="checkInterval")
    private @Nullable Output<Integer> checkInterval;

    /**
     * @return The number of seconds between two pings (between `5` and `600` both included).
     * 
     */
    public Optional<Output<Integer>> checkInterval() {
        return Optional.ofNullable(this.checkInterval);
    }

    /**
     * The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
     * 
     */
    @Import(name="healthyThreshold")
    private @Nullable Output<Integer> healthyThreshold;

    /**
     * @return The number of consecutive successful pings before considering the VM as healthy (between `2` and `10` both included).
     * 
     */
    public Optional<Output<Integer>> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * If you use the HTTP or HTTPS protocols, the ping path.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return If you use the HTTP or HTTPS protocols, the ping path.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
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
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between `2` and `60` both included).
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
     * 
     */
    @Import(name="unhealthyThreshold")
    private @Nullable Output<Integer> unhealthyThreshold;

    /**
     * @return The number of consecutive failed pings before considering the VM as unhealthy (between `2` and `10` both included).
     * 
     */
    public Optional<Output<Integer>> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    private LoadBalancerAttributesHealthCheckArgs() {}

    private LoadBalancerAttributesHealthCheckArgs(LoadBalancerAttributesHealthCheckArgs $) {
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
    public static Builder builder(LoadBalancerAttributesHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerAttributesHealthCheckArgs $;

        public Builder() {
            $ = new LoadBalancerAttributesHealthCheckArgs();
        }

        public Builder(LoadBalancerAttributesHealthCheckArgs defaults) {
            $ = new LoadBalancerAttributesHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkInterval The number of seconds between two pings (between `5` and `600` both included).
         * 
         * @return builder
         * 
         */
        public Builder checkInterval(@Nullable Output<Integer> checkInterval) {
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
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
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
        public Builder path(@Nullable Output<String> path) {
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
        public Builder timeout(@Nullable Output<Integer> timeout) {
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
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
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

        public LoadBalancerAttributesHealthCheckArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
