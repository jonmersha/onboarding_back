package com.coopay.security;

public class RequestCredentials {
    private String branchCode;

    private String userName;

    private String password;

    public RequestCredentials() {
    }

    public RequestCredentials(String branchCode, String userName, String password) {
        this.branchCode = branchCode;
        this.userName = userName;
        this.password = password;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
