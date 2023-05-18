package com.sb;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {

    @Test
    void getAllVehicles_should_returnAllVehicles() {
        // Arrange
        Dealership dealership = new Dealership("", "", "");

        Vehicle vehicle1 = new Vehicle(1352846,2007, "Volkswagen", "Routan", "van", "silver", 223_658, 2105.68);
        Vehicle vehicle2 = new Vehicle(7316582,2015, "Honda", "Civic", "car", "white", 128_589, 42_000);
        Vehicle vehicle3 = new Vehicle(1945877,2020, "Hyundai", "Elantra", "car", "red", 20_000,65_000);

        ArrayList<Vehicle> expected = new ArrayList<>();

        expected.add(vehicle1);
        expected.add(vehicle2);
        expected.add(vehicle3);

        dealership.addVehicle(vehicle1);
        dealership.addVehicle(vehicle2);
        dealership.addVehicle(vehicle3);

        // Act
        ArrayList<Vehicle> actual = dealership.getAllVehicles();

        // Assert
        assertEquals(expected, actual);


    }

    @Test
    void addVehicles() {
    }

}