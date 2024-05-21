// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.outscale.outputs.GetImagesFilter;
import com.pulumi.outscale.outputs.GetImagesImage;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImagesResult {
    /**
     * @return One or more account IDs that the permission is associated with.
     * 
     */
    private @Nullable List<String> accountIds;
    private @Nullable List<GetImagesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable List<String> imageIds;
    /**
     * @return Information about one or more OMIs.
     * 
     */
    private List<GetImagesImage> images;
    private @Nullable List<String> permissions;
    private String requestId;

    private GetImagesResult() {}
    /**
     * @return One or more account IDs that the permission is associated with.
     * 
     */
    public List<String> accountIds() {
        return this.accountIds == null ? List.of() : this.accountIds;
    }
    public List<GetImagesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> imageIds() {
        return this.imageIds == null ? List.of() : this.imageIds;
    }
    /**
     * @return Information about one or more OMIs.
     * 
     */
    public List<GetImagesImage> images() {
        return this.images;
    }
    public List<String> permissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    public String requestId() {
        return this.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> accountIds;
        private @Nullable List<GetImagesFilter> filters;
        private String id;
        private @Nullable List<String> imageIds;
        private List<GetImagesImage> images;
        private @Nullable List<String> permissions;
        private String requestId;
        public Builder() {}
        public Builder(GetImagesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIds = defaults.accountIds;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.imageIds = defaults.imageIds;
    	      this.images = defaults.images;
    	      this.permissions = defaults.permissions;
    	      this.requestId = defaults.requestId;
        }

        @CustomType.Setter
        public Builder accountIds(@Nullable List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public Builder accountIds(String... accountIds) {
            return accountIds(List.of(accountIds));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetImagesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetImagesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder imageIds(@Nullable List<String> imageIds) {
            this.imageIds = imageIds;
            return this;
        }
        public Builder imageIds(String... imageIds) {
            return imageIds(List.of(imageIds));
        }
        @CustomType.Setter
        public Builder images(List<GetImagesImage> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }
        public Builder images(GetImagesImage... images) {
            return images(List.of(images));
        }
        @CustomType.Setter
        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder requestId(String requestId) {
            this.requestId = Objects.requireNonNull(requestId);
            return this;
        }
        public GetImagesResult build() {
            final var o = new GetImagesResult();
            o.accountIds = accountIds;
            o.filters = filters;
            o.id = id;
            o.imageIds = imageIds;
            o.images = images;
            o.permissions = permissions;
            o.requestId = requestId;
            return o;
        }
    }
}