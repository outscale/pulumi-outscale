// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetNetPeeringsNetPeeringAccepterNet;
import com.pulumi.outscale.outputs.GetNetPeeringsNetPeeringSourceNet;
import com.pulumi.outscale.outputs.GetNetPeeringsNetPeeringState;
import com.pulumi.outscale.outputs.GetNetPeeringsNetPeeringTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetPeeringsNetPeering {
    /**
     * @return Information about the accepter Net.
     * 
     */
    private List<GetNetPeeringsNetPeeringAccepterNet> accepterNets;
    /**
     * @return The ID of the Net peering.
     * 
     */
    private String netPeeringId;
    /**
     * @return Information about the source Net.
     * 
     */
    private List<GetNetPeeringsNetPeeringSourceNet> sourceNets;
    /**
     * @return Information about the state of the Net peering.
     * 
     */
    private List<GetNetPeeringsNetPeeringState> states;
    /**
     * @return The key/value combinations of the tags associated with the Net peerings, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    private List<GetNetPeeringsNetPeeringTag> tags;

    private GetNetPeeringsNetPeering() {}
    /**
     * @return Information about the accepter Net.
     * 
     */
    public List<GetNetPeeringsNetPeeringAccepterNet> accepterNets() {
        return this.accepterNets;
    }
    /**
     * @return The ID of the Net peering.
     * 
     */
    public String netPeeringId() {
        return this.netPeeringId;
    }
    /**
     * @return Information about the source Net.
     * 
     */
    public List<GetNetPeeringsNetPeeringSourceNet> sourceNets() {
        return this.sourceNets;
    }
    /**
     * @return Information about the state of the Net peering.
     * 
     */
    public List<GetNetPeeringsNetPeeringState> states() {
        return this.states;
    }
    /**
     * @return The key/value combinations of the tags associated with the Net peerings, in the following format: `TAGKEY=TAGVALUE`.
     * 
     */
    public List<GetNetPeeringsNetPeeringTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetPeeringsNetPeering defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetNetPeeringsNetPeeringAccepterNet> accepterNets;
        private String netPeeringId;
        private List<GetNetPeeringsNetPeeringSourceNet> sourceNets;
        private List<GetNetPeeringsNetPeeringState> states;
        private List<GetNetPeeringsNetPeeringTag> tags;
        public Builder() {}
        public Builder(GetNetPeeringsNetPeering defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepterNets = defaults.accepterNets;
    	      this.netPeeringId = defaults.netPeeringId;
    	      this.sourceNets = defaults.sourceNets;
    	      this.states = defaults.states;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder accepterNets(List<GetNetPeeringsNetPeeringAccepterNet> accepterNets) {
            this.accepterNets = Objects.requireNonNull(accepterNets);
            return this;
        }
        public Builder accepterNets(GetNetPeeringsNetPeeringAccepterNet... accepterNets) {
            return accepterNets(List.of(accepterNets));
        }
        @CustomType.Setter
        public Builder netPeeringId(String netPeeringId) {
            this.netPeeringId = Objects.requireNonNull(netPeeringId);
            return this;
        }
        @CustomType.Setter
        public Builder sourceNets(List<GetNetPeeringsNetPeeringSourceNet> sourceNets) {
            this.sourceNets = Objects.requireNonNull(sourceNets);
            return this;
        }
        public Builder sourceNets(GetNetPeeringsNetPeeringSourceNet... sourceNets) {
            return sourceNets(List.of(sourceNets));
        }
        @CustomType.Setter
        public Builder states(List<GetNetPeeringsNetPeeringState> states) {
            this.states = Objects.requireNonNull(states);
            return this;
        }
        public Builder states(GetNetPeeringsNetPeeringState... states) {
            return states(List.of(states));
        }
        @CustomType.Setter
        public Builder tags(List<GetNetPeeringsNetPeeringTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetNetPeeringsNetPeeringTag... tags) {
            return tags(List.of(tags));
        }
        public GetNetPeeringsNetPeering build() {
            final var o = new GetNetPeeringsNetPeering();
            o.accepterNets = accepterNets;
            o.netPeeringId = netPeeringId;
            o.sourceNets = sourceNets;
            o.states = states;
            o.tags = tags;
            return o;
        }
    }
}