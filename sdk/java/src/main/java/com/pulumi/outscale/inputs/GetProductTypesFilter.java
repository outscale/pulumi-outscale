// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetProductTypesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetProductTypesFilter Empty = new GetProductTypesFilter();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetProductTypesFilter() {}

    private GetProductTypesFilter(GetProductTypesFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductTypesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductTypesFilter $;

        public Builder() {
            $ = new GetProductTypesFilter();
        }

        public Builder(GetProductTypesFilter defaults) {
            $ = new GetProductTypesFilter(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetProductTypesFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
