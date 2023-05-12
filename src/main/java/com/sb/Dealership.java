package com.sb;

import java.util.ArrayList;
import java.util.*;

public class Dealership {
    private ArrayList <Vehicles> inventory;
    private String dealName;
    private String dealAddress;
    private String dealPhone;

    // Constructor - Make sure to edit
    public Dealership(String dealName, String dealAddress, String dealPhone) {
        this.dealName = dealName;
        this.dealAddress = dealAddress;
        this.dealPhone = dealPhone;
        this.inventory = new ArrayList<>();
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

    // Custom Methods
    public ArrayList<Vehicles> getAllVehicles(){
        return this.inventory;
    }
    public void addVehicles(Vehicles vehicles){
        this.inventory.add(vehicles);
    }
    public void removeVehicles(Vehicles vehicles){

    }

//    public void getVehiclesByPrice(float min, float max){
//
//    }
//    public void getVehiclesByMakeModel(String make, String model){
//
//    }
//    public void getVehiclesByYear(int min, int max){
//
//    }
//    public void getVehiclesByColor(String color){
//
//    }
//    public void getVehiclesByMileage(int min, int max){
//
//    }
//    public void getVehiclesByType(String vehicleType){
//
//    }




}

