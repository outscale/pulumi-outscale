// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetQuotaFilter;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetQuotaResult {
    /**
     * @return The account ID of the owner of the quotas.
     * 
     */
    private String accountId;
    /**
     * @return The description of the quota.
     * 
     */
    private String description;
    private @Nullable List<GetQuotaFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The maximum value of the quota for the OUTSCALE user account (if there is no limit, `0`).
     * 
     */
    private Integer maxValue;
    /**
     * @return The unique name of the quota.
     * 
     */
    private String name;
    /**
     * @return The group name of the quota.
     * 
     */
    private String quotaCollection;
    /**
     * @return The resource ID if it is a resource-specific quota, `global` if it is not.
     * 
     */
    private String quotaType;
    private String requestId;
    /**
     * @return The description of the quota.
     * 
     */
    private String shortDescription;
    /**
     * @return The limit value currently used by the OUTSCALE user account.
     * 
     */
    private Integer usedValue;

    private GetQuotaResult() {}
    /**
     * @return The account ID of the owner of the quotas.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The description of the quota.
     * 
     */
    public String description() {
        return this.description;
    }
    public List<GetQuotaFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The maximum value of the quota for the OUTSCALE user account (if there is no limit, `0`).
     * 
     */
    public Integer maxValue() {
        return this.maxValue;
    }
    /**
     * @return The unique name of the quota.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The group name of the quota.
     * 
     */
    public String quotaCollection() {
        return this.quotaCollection;
    }
    /**
     * @return The resource ID if it is a resource-specific quota, `global` if it is not.
     * 
     */
    public String quotaType() {
        return this.quotaType;
    }
    public String requestId() {
        return this.requestId;
    }
    /**
     * @return The description of the quota.
     * 
     */
    public String shortDescription() {
        return this.shortDescription;
    }
    /**
     * @return The limit value currently used by the OUTSCALE user account.
     * 
     */
    public Integer usedValue() {
        return this.usedValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuotaResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String description;
        private @Nullable List<GetQuotaFilter> filters;
        private String id;
        private Integer maxValue;
        private String name;
        private String quotaCollection;
        private String quotaType;
        private String requestId;
        private String shortDescription;
        private Integer usedValue;
        public Builder() {}
        public Builder(GetQuotaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.maxValue = defaults.maxValue;
    	      this.name = defaults.name;
    	      this.quotaCollection = defaults.quotaCollection;
    	      this.quotaType = defaults.quotaType;
    	      this.requestId = defaults.requestId;
    	      this.shortDescription = defaults.shortDescription;
    	      this.usedValue = defaults.usedValue;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetQuotaFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetQuotaFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder maxValue(Integer maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder quotaCollection(String quotaCollection) {
            this.quotaCollection = Objects.requireNonNull(quotaCollection);
            return this;
        }
        @CustomType.Setter
        public Builder quotaType(String quotaType) {
            this.quotaType = Objects.requireNonNull(quotaType);
            return this;
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        @CustomType.Setter
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }
        @CustomType.Setter
        public Builder usedValue(Integer usedValue) {
            this.usedValue = Objects.requireNonNull(usedValue);
            return this;
        }
        public GetQuotaResult build() {
            final var o = new GetQuotaResult();
            o.accountId = accountId;
            o.description = description;
            o.filters = filters;
            o.id = id;
            o.maxValue = maxValue;
            o.name = name;
            o.quotaCollection = quotaCollection;
            o.quotaType = quotaType;
            o.requestId = requestId;
            o.shortDescription = shortDescription;
            o.usedValue = usedValue;
            return o;
        }
    }
}
