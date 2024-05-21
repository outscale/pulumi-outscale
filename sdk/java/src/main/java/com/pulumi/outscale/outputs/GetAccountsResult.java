// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetAccountsAccount;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountsResult {
    /**
     * @return The list of the accounts.
     * 
     */
    private List<GetAccountsAccount> accounts;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String requestId;

    private GetAccountsResult() {}
    /**
     * @return The list of the accounts.
     * 
     */
    public List<GetAccountsAccount> accounts() {
        return this.accounts;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String requestId() {
        return this.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAccountsAccount> accounts;
        private String id;
        private String requestId;
        public Builder() {}
        public Builder(GetAccountsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.id = defaults.id;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder accounts(List<GetAccountsAccount> accounts) {
            this.accounts = Objects.requireNonNull(accounts);
            return this;
        }
        public Builder accounts(GetAccountsAccount... accounts) {
            return accounts(List.of(accounts));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        public GetAccountsResult build() {
            final var o = new GetAccountsResult();
            o.accounts = accounts;
            o.id = id;
            o.requestId = requestId;
            return o;
        }
    }
}