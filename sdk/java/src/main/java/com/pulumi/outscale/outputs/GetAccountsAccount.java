// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.outscale.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountsAccount {
    /**
     * @return The ID of the account.
     * 
     */
    private String accountId;
    /**
     * @return One or more additional email addresses for the account. These addresses are used for notifications only.
     * 
     */
    private List<String> additionalEmails;
    /**
     * @return The city of the account owner.
     * 
     */
    private String city;
    /**
     * @return The name of the company for the account.
     * 
     */
    private String companyName;
    /**
     * @return The country of the account owner.
     * 
     */
    private String country;
    /**
     * @return The ID of the customer.
     * 
     */
    private String customerId;
    /**
     * @return The main email address for the account. This address is used for your credentials and for notifications.
     * 
     */
    private String email;
    /**
     * @return The first name of the account owner.
     * 
     */
    private String firstName;
    /**
     * @return The job title of the account owner.
     * 
     */
    private String jobTitle;
    /**
     * @return The last name of the account owner.
     * 
     */
    private String lastName;
    /**
     * @return The mobile phone number of the account owner.
     * 
     */
    private String mobileNumber;
    /**
     * @return The landline phone number of the account owner.
     * 
     */
    private String phoneNumber;
    /**
     * @return The state/province of the account.
     * 
     */
    private String stateProvince;
    /**
     * @return The value added tax (VAT) number for the account.
     * 
     */
    private String vatNumber;
    /**
     * @return The ZIP code of the city.
     * 
     */
    private String zipCode;

    private GetAccountsAccount() {}
    /**
     * @return The ID of the account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return One or more additional email addresses for the account. These addresses are used for notifications only.
     * 
     */
    public List<String> additionalEmails() {
        return this.additionalEmails;
    }
    /**
     * @return The city of the account owner.
     * 
     */
    public String city() {
        return this.city;
    }
    /**
     * @return The name of the company for the account.
     * 
     */
    public String companyName() {
        return this.companyName;
    }
    /**
     * @return The country of the account owner.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return The ID of the customer.
     * 
     */
    public String customerId() {
        return this.customerId;
    }
    /**
     * @return The main email address for the account. This address is used for your credentials and for notifications.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The first name of the account owner.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return The job title of the account owner.
     * 
     */
    public String jobTitle() {
        return this.jobTitle;
    }
    /**
     * @return The last name of the account owner.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return The mobile phone number of the account owner.
     * 
     */
    public String mobileNumber() {
        return this.mobileNumber;
    }
    /**
     * @return The landline phone number of the account owner.
     * 
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }
    /**
     * @return The state/province of the account.
     * 
     */
    public String stateProvince() {
        return this.stateProvince;
    }
    /**
     * @return The value added tax (VAT) number for the account.
     * 
     */
    public String vatNumber() {
        return this.vatNumber;
    }
    /**
     * @return The ZIP code of the city.
     * 
     */
    public String zipCode() {
        return this.zipCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private List<String> additionalEmails;
        private String city;
        private String companyName;
        private String country;
        private String customerId;
        private String email;
        private String firstName;
        private String jobTitle;
        private String lastName;
        private String mobileNumber;
        private String phoneNumber;
        private String stateProvince;
        private String vatNumber;
        private String zipCode;
        public Builder() {}
        public Builder(GetAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.additionalEmails = defaults.additionalEmails;
    	      this.city = defaults.city;
    	      this.companyName = defaults.companyName;
    	      this.country = defaults.country;
    	      this.customerId = defaults.customerId;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.jobTitle = defaults.jobTitle;
    	      this.lastName = defaults.lastName;
    	      this.mobileNumber = defaults.mobileNumber;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.stateProvince = defaults.stateProvince;
    	      this.vatNumber = defaults.vatNumber;
    	      this.zipCode = defaults.zipCode;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder additionalEmails(List<String> additionalEmails) {
            this.additionalEmails = Objects.requireNonNull(additionalEmails);
            return this;
        }
        public Builder additionalEmails(String... additionalEmails) {
            return additionalEmails(List.of(additionalEmails));
        }
        @CustomType.Setter
        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        @CustomType.Setter
        public Builder companyName(String companyName) {
            this.companyName = Objects.requireNonNull(companyName);
            return this;
        }
        @CustomType.Setter
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        @CustomType.Setter
        public Builder customerId(String customerId) {
            this.customerId = Objects.requireNonNull(customerId);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        @CustomType.Setter
        public Builder jobTitle(String jobTitle) {
            this.jobTitle = Objects.requireNonNull(jobTitle);
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        @CustomType.Setter
        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = Objects.requireNonNull(mobileNumber);
            return this;
        }
        @CustomType.Setter
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        @CustomType.Setter
        public Builder stateProvince(String stateProvince) {
            this.stateProvince = Objects.requireNonNull(stateProvince);
            return this;
        }
        @CustomType.Setter
        public Builder vatNumber(String vatNumber) {
            this.vatNumber = Objects.requireNonNull(vatNumber);
            return this;
        }
        @CustomType.Setter
        public Builder zipCode(String zipCode) {
            this.zipCode = Objects.requireNonNull(zipCode);
            return this;
        }
        public GetAccountsAccount build() {
            final var o = new GetAccountsAccount();
            o.accountId = accountId;
            o.additionalEmails = additionalEmails;
            o.city = city;
            o.companyName = companyName;
            o.country = country;
            o.customerId = customerId;
            o.email = email;
            o.firstName = firstName;
            o.jobTitle = jobTitle;
            o.lastName = lastName;
            o.mobileNumber = mobileNumber;
            o.phoneNumber = phoneNumber;
            o.stateProvince = stateProvince;
            o.vatNumber = vatNumber;
            o.zipCode = zipCode;
            return o;
        }
    }
}
