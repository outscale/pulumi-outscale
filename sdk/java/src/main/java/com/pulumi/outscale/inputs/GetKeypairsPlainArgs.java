// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.outscale.inputs.GetKeypairsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeypairsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeypairsPlainArgs Empty = new GetKeypairsPlainArgs();

    /**
     * A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetKeypairsFilter> filters;

    /**
     * @return A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
     * 
     */
    public Optional<List<GetKeypairsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The names of the keypairs.
     * 
     */
    @Import(name="keypairNames")
    private @Nullable List<String> keypairNames;

    /**
     * @return The names of the keypairs.
     * 
     */
    public Optional<List<String>> keypairNames() {
        return Optional.ofNullable(this.keypairNames);
    }

    private GetKeypairsPlainArgs() {}

    private GetKeypairsPlainArgs(GetKeypairsPlainArgs $) {
        this.filters = $.filters;
        this.keypairNames = $.keypairNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeypairsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeypairsPlainArgs $;

        public Builder() {
            $ = new GetKeypairsPlainArgs();
        }

        public Builder(GetKeypairsPlainArgs defaults) {
            $ = new GetKeypairsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetKeypairsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A combination of a filter name and one or more filter values. You can specify this argument for as many filter names as you need. The filter name can be any of the following:
         * 
         * @return builder
         * 
         */
        public Builder filters(GetKeypairsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param keypairNames The names of the keypairs.
         * 
         * @return builder
         * 
         */
        public Builder keypairNames(@Nullable List<String> keypairNames) {
            $.keypairNames = keypairNames;
            return this;
        }

        /**
         * @param keypairNames The names of the keypairs.
         * 
         * @return builder
         * 
         */
        public Builder keypairNames(String... keypairNames) {
            return keypairNames(List.of(keypairNames));
        }

        public GetKeypairsPlainArgs build() {
            return $;
        }
    }

}
