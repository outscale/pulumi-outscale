// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancersLoadBalancerListener {
    /**
     * @return The port on which the back-end VM is listening (between `1` and `65535`, both included).
     * 
     */
    private Integer backendPort;
    /**
     * @return The protocol for routing traffic to back-end VMs (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
     * 
     */
    private String backendProtocol;
    /**
     * @return The port on which the load balancer is listening (between `1` and `65535`, both included).
     * 
     */
    private Integer loadBalancerPort;
    /**
     * @return The routing protocol (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
     * 
     */
    private String loadBalancerProtocol;
    /**
     * @return The names of the policies. If there are no policies enabled, the list is empty.
     * 
     */
    private List<String> policyNames;
    /**
     * @return The OUTSCALE Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; OUTSCALE Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
     * 
     */
    private String serverCertificateId;

    private GetLoadBalancersLoadBalancerListener() {}
    /**
     * @return The port on which the back-end VM is listening (between `1` and `65535`, both included).
     * 
     */
    public Integer backendPort() {
        return this.backendPort;
    }
    /**
     * @return The protocol for routing traffic to back-end VMs (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
     * 
     */
    public String backendProtocol() {
        return this.backendProtocol;
    }
    /**
     * @return The port on which the load balancer is listening (between `1` and `65535`, both included).
     * 
     */
    public Integer loadBalancerPort() {
        return this.loadBalancerPort;
    }
    /**
     * @return The routing protocol (`HTTP` \| `HTTPS` \| `TCP` \| `SSL`).
     * 
     */
    public String loadBalancerProtocol() {
        return this.loadBalancerProtocol;
    }
    /**
     * @return The names of the policies. If there are no policies enabled, the list is empty.
     * 
     */
    public List<String> policyNames() {
        return this.policyNames;
    }
    /**
     * @return The OUTSCALE Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; OUTSCALE Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
     * 
     */
    public String serverCertificateId() {
        return this.serverCertificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancersLoadBalancerListener defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer backendPort;
        private String backendProtocol;
        private Integer loadBalancerPort;
        private String loadBalancerProtocol;
        private List<String> policyNames;
        private String serverCertificateId;
        public Builder() {}
        public Builder(GetLoadBalancersLoadBalancerListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.backendProtocol = defaults.backendProtocol;
    	      this.loadBalancerPort = defaults.loadBalancerPort;
    	      this.loadBalancerProtocol = defaults.loadBalancerProtocol;
    	      this.policyNames = defaults.policyNames;
    	      this.serverCertificateId = defaults.serverCertificateId;
        }

        @CustomType.Setter
        public Builder backendPort(Integer backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }
        @CustomType.Setter
        public Builder backendProtocol(String backendProtocol) {
            this.backendProtocol = Objects.requireNonNull(backendProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerPort(Integer loadBalancerPort) {
            this.loadBalancerPort = Objects.requireNonNull(loadBalancerPort);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerProtocol(String loadBalancerProtocol) {
            this.loadBalancerProtocol = Objects.requireNonNull(loadBalancerProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder policyNames(List<String> policyNames) {
            this.policyNames = Objects.requireNonNull(policyNames);
            return this;
        }
        public Builder policyNames(String... policyNames) {
            return policyNames(List.of(policyNames));
        }
        @CustomType.Setter
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = Objects.requireNonNull(serverCertificateId);
            return this;
        }
        public GetLoadBalancersLoadBalancerListener build() {
            final var o = new GetLoadBalancersLoadBalancerListener();
            o.backendPort = backendPort;
            o.backendProtocol = backendProtocol;
            o.loadBalancerPort = loadBalancerPort;
            o.loadBalancerProtocol = loadBalancerProtocol;
            o.policyNames = policyNames;
            o.serverCertificateId = serverCertificateId;
            return o;
        }
    }
}