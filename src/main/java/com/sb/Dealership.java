package com.sb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

// Dealership will hold information about the dealership (name, address, …)
// and maintain a list of vehicles.
// It will also include the methods that search the list
// for matching vehicles and add/remove vehicles.

public class Dealership {
    private ArrayList<Vehicle> inventory;
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
    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory;
    }
    public void addVehicle(Vehicle vehicles) {
        this.inventory.add(vehicles);
        try {
            FileWriter fileWriter = new FileWriter("./src/main/java/com/sb/inventory.txt", true);
            fileWriter.write("\n" + vehicles.getVin() + "|" + vehicles.getYear() + "|" + vehicles.getMake() + "| " + vehicles.getModel() + " | " + vehicles.getVehicleType() + " | " + vehicles.getColor() + " | " + vehicles.getOdometer() + "|" + vehicles.getPrice());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void removeVehicles(int vehicleIndex){
        this.inventory.remove(vehicleIndex);
    }

    public ArrayList<Vehicle> getVehiclesByPrice(float min, float max) {
        ArrayList<Vehicle> vehiclesToDisplay = new ArrayList<>();

        for (Vehicle vehicle : this.inventory) {
            if (vehicle.getPrice() > min && vehicle.getPrice() < max) {
                vehiclesToDisplay.add(vehicle);
            }
        }
        return vehiclesToDisplay;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return new ArrayList<>();
    }
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return new ArrayList<>();
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color){
        return new ArrayList<>();
    }
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        return new ArrayList<>();
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Dealership{" +
                ", dealName='" + dealName + '\'' +
                ", dealAddress='" + dealAddress + '\'' +
                ", dealPhone='" + dealPhone + '\'' +
                "inventory=" + inventory +
                '}';
    }
}

