package com.coopay.security;

import com.coopay.onboarding.entity.BankOfficer;

public class LoginData {
    private String userName;
    private String firstName;
    private String middleName;
    private String branchCode;
    

    public LoginData() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public LoginData(BankOfficer bankOfficer) {
    	this.userName=bankOfficer.getMobileNumber();
        this.firstName=bankOfficer.getFirstName();
        this.middleName=bankOfficer.getMiddleName();
        this.branchCode=bankOfficer.getBranchCode();


    }
}
