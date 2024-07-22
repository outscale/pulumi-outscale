// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final ServerCertificateState Empty = new ServerCertificateState();

    /**
     * The PEM-encoded X509 certificate.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return The PEM-encoded X509 certificate.
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * The PEM-encoded intermediate certification authorities.
     * 
     */
    @Import(name="chain")
    private @Nullable Output<String> chain;

    /**
     * @return The PEM-encoded intermediate certification authorities.
     * 
     */
    public Optional<Output<String>> chain() {
        return Optional.ofNullable(this.chain);
    }

    @Import(name="dryRun")
    private @Nullable Output<String> dryRun;

    public Optional<Output<String>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The date at which the server certificate expires.
     * 
     */
    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    /**
     * @return The date at which the server certificate expires.
     * 
     */
    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
     * 
     */
    @Import(name="orn")
    private @Nullable Output<String> orn;

    /**
     * @return The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
     * 
     */
    public Optional<Output<String>> orn() {
        return Optional.ofNullable(this.orn);
    }

    /**
     * The path to the server certificate, set to a slash (/) if not specified.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path to the server certificate, set to a slash (/) if not specified.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The PEM-encoded private key matching the certificate.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The PEM-encoded private key matching the certificate.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The date at which the server certificate has been uploaded.
     * 
     */
    @Import(name="uploadDate")
    private @Nullable Output<String> uploadDate;

    /**
     * @return The date at which the server certificate has been uploaded.
     * 
     */
    public Optional<Output<String>> uploadDate() {
        return Optional.ofNullable(this.uploadDate);
    }

    private ServerCertificateState() {}

    private ServerCertificateState(ServerCertificateState $) {
        this.body = $.body;
        this.chain = $.chain;
        this.dryRun = $.dryRun;
        this.expirationDate = $.expirationDate;
        this.name = $.name;
        this.orn = $.orn;
        this.path = $.path;
        this.privateKey = $.privateKey;
        this.requestId = $.requestId;
        this.uploadDate = $.uploadDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerCertificateState $;

        public Builder() {
            $ = new ServerCertificateState();
        }

        public Builder(ServerCertificateState defaults) {
            $ = new ServerCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param body The PEM-encoded X509 certificate.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body The PEM-encoded X509 certificate.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param chain The PEM-encoded intermediate certification authorities.
         * 
         * @return builder
         * 
         */
        public Builder chain(@Nullable Output<String> chain) {
            $.chain = chain;
            return this;
        }

        /**
         * @param chain The PEM-encoded intermediate certification authorities.
         * 
         * @return builder
         * 
         */
        public Builder chain(String chain) {
            return chain(Output.of(chain));
        }

        public Builder dryRun(@Nullable Output<String> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        public Builder dryRun(String dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param expirationDate The date at which the server certificate expires.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param expirationDate The date at which the server certificate expires.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        /**
         * @param name A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (=), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orn The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
         * 
         * @return builder
         * 
         */
        public Builder orn(@Nullable Output<String> orn) {
            $.orn = orn;
            return this;
        }

        /**
         * @param orn The Outscale Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; Outscale Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
         * 
         * @return builder
         * 
         */
        public Builder orn(String orn) {
            return orn(Output.of(orn));
        }

        /**
         * @param path The path to the server certificate, set to a slash (/) if not specified.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to the server certificate, set to a slash (/) if not specified.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param privateKey The PEM-encoded private key matching the certificate.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The PEM-encoded private key matching the certificate.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param uploadDate The date at which the server certificate has been uploaded.
         * 
         * @return builder
         * 
         */
        public Builder uploadDate(@Nullable Output<String> uploadDate) {
            $.uploadDate = uploadDate;
            return this;
        }

        /**
         * @param uploadDate The date at which the server certificate has been uploaded.
         * 
         * @return builder
         * 
         */
        public Builder uploadDate(String uploadDate) {
            return uploadDate(Output.of(uploadDate));
        }

        public ServerCertificateState build() {
            return $;
        }
    }

}
