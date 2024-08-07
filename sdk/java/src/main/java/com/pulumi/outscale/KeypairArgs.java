// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeypairArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeypairArgs Empty = new KeypairArgs();

    /**
     * A unique name for the keypair, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
     * 
     */
    @Import(name="keypairName")
    private @Nullable Output<String> keypairName;

    /**
     * @return A unique name for the keypair, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
     * 
     */
    public Optional<Output<String>> keypairName() {
        return Optional.ofNullable(this.keypairName);
    }

    /**
     * The public key. It must be Base64-encoded.
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return The public key. It must be Base64-encoded.
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    private KeypairArgs() {}

    private KeypairArgs(KeypairArgs $) {
        this.keypairName = $.keypairName;
        this.publicKey = $.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeypairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeypairArgs $;

        public Builder() {
            $ = new KeypairArgs();
        }

        public Builder(KeypairArgs defaults) {
            $ = new KeypairArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keypairName A unique name for the keypair, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
         * 
         * @return builder
         * 
         */
        public Builder keypairName(@Nullable Output<String> keypairName) {
            $.keypairName = keypairName;
            return this;
        }

        /**
         * @param keypairName A unique name for the keypair, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
         * 
         * @return builder
         * 
         */
        public Builder keypairName(String keypairName) {
            return keypairName(Output.of(keypairName));
        }

        /**
         * @param publicKey The public key. It must be Base64-encoded.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The public key. It must be Base64-encoded.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        public KeypairArgs build() {
            return $;
        }
    }

}
