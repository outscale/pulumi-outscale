// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServerCertificatesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetServerCertificatesFilter Empty = new GetServerCertificatesFilter();

    /**
     * The name of the server certificate.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the server certificate.
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetServerCertificatesFilter() {}

    private GetServerCertificatesFilter(GetServerCertificatesFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerCertificatesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerCertificatesFilter $;

        public Builder() {
            $ = new GetServerCertificatesFilter();
        }

        public Builder(GetServerCertificatesFilter defaults) {
            $ = new GetServerCertificatesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the server certificate.
         * 
         * @return builder
         * 
         */
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

        public GetServerCertificatesFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}