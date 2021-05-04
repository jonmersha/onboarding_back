package com.coopay.onboarding.entity;

import com.coopay.soap.apioperation.CustomerCreateResponse;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_cccount")
public class CustomerAccount {
    //customer information
    @Id
    private String transactionId;
    private String authStatus;
    private boolean customerAuthorized;
    private String email;
    private String mobileNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String accountNumber;
    private String accountCategory;
    private boolean accountLinkAuthorized;
    private String accountCreator;
    private String signatureImageName;
    private String personImageName;
    private String idImageName;
    
    private boolean signatureImageUploaded;
    private boolean customerImmageUploaded;
    
    
    



    public boolean isSignatureImageUploaded() {
		return signatureImageUploaded;
	}

	public void setSignatureImageUploaded(boolean signatureImageUploaded) {
		this.signatureImageUploaded = signatureImageUploaded;
	}

	public boolean isCustomerImmageUploaded() {
		return customerImmageUploaded;
	}

	public void setCustomerImmageUploaded(boolean customerImmageUploaded) {
		this.customerImmageUploaded = customerImmageUploaded;
	}

	public CustomerAccount(CustomerCreateResponse customer) {
        this.transactionId=customer.getTransactionId();
        this.email=customer.getEmail();
        this.customerAuthorized=customer.isCustomerAuthorized();
        this.mobileNumber=customer.getMobileNumber();
        this.firstName=customer.getShortName();
        this.lastName=customer.getLastName();
        this.middleName=customer.getMiddleName();
        this.authStatus=customer.getAuthStatus();
    }

    public String getSignatureImageName() {
        return signatureImageName;
    }

    public void setSignatureImageName(String signatureImageName) {
        this.signatureImageName = signatureImageName;
    }

    public String getPersonImageName() {
        return personImageName;
    }

    public void setPersonImageName(String personImageName) {
        this.personImageName = personImageName;
    }

    public String getIdImageName() {
        return idImageName;
    }

    public void setIdImageName(String idImageName) {
        this.idImageName = idImageName;
    }

    public CustomerAccount() {
    }

    public String getAuthStatus() {
        return authStatus;
    }
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isCustomerAuthorized() {
        return customerAuthorized;
    }

    public void setCustomerAuthorized(boolean customerAuthorized) {
        this.customerAuthorized = customerAuthorized;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }

    public boolean isAccountLinkAuthorized() {
        return accountLinkAuthorized;
    }

    public void setAccountLinkAuthorized(boolean accountLinkAuthorized) {
        this.accountLinkAuthorized = accountLinkAuthorized;
    }

    public String getAccountCreator() {
        return accountCreator;
    }

    public void setAccountCreator(String accountCreator) {
        this.accountCreator = accountCreator;
    }
}
