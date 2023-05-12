package com.sb;

import java.util.ArrayList;

public class Dealership {
    private ArrayList <Vehicles> vehicles;
    private String dealName;
    private String dealAddress;
    private String dealPhone;

    // Constructor - Make sure to edit
    public Dealership(String dealName, String dealAddress, String dealPhone) {
        this.dealName = dealName;
        this.dealAddress = dealAddress;
        this.dealPhone = dealPhone;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealAddress() {
        return dealAddress;
    }

    public void setDealAddress(String dealAddress) {
        this.dealAddress = dealAddress;
    }

    public String getDealPhone() {
        return dealPhone;
    }

    public void setDealPhone(String dealPhone) {
        this.dealPhone = dealPhone;
    }
}

