package com.coopay.onboarding.model;

public class Branch {
    private int id;
    private String branchCode;
    private String branchName;
    private String phoneNumber;
    private String branchEmail;
    private String city;
    private double latitudePoint;
    private double longitudePoint;


    public String getBranchEmail() {
        return branchEmail;
    }

    public void setBranchEmail(String branchEmail) {
        this.branchEmail = branchEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLatitudePoint() {
        return latitudePoint;
    }

    public void setLatitudePoint(double latitudePoint) {
        this.latitudePoint = latitudePoint;
    }

    public double getLongitudePoint() {
        return longitudePoint;
    }

    public void setLongitudePoint(double longitudePoint) {
        this.longitudePoint = longitudePoint;
    }
}
