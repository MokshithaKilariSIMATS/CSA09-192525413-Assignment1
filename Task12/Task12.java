import java.util.*;

abstract class Vehicle {
    String number;

    Vehicle(String number) {
        this.number = number;
    }

    abstract String getType();
}

class Car extends Vehicle {
    Car(String number) { super(number); }
    String getType() { return "Car"; }
}

class Bike extends Vehicle {
    Bike(String number) { super(number); }
    String getType() { return "Bike"; }
}

class ElectricBike extends Vehicle {
    ElectricBike(String number) { super(number); }
    String getType() { return "E-Bike"; }
}

class DeliveryVan extends Vehicle {
    DeliveryVan(String number) { super(number); }
    String getType() { return "Delivery Van"; }
}

public class Task12 {
    static int[][] floors = {
        {101, 102, 103, 104},
        {201, 202, 203},
        {301, 302, 303, 304, 305},
        {401, 402},
        {501, 502, 503}
    };

    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 12: Changed Requirements");
        System.out.println();

        Vehicle[] vehicles = {
            new Car("TN-09-CA-1001"),
            new ElectricBike("TN-09-EB-2002"),
            new DeliveryVan("TN-09-DV-3003")
        };

        System.out.println("Supported Vehicle Types:");
        for (Vehicle v : vehicles) {
            System.out.println("- " + v.getType() + " : " + v.number);
        }

        System.out.println("\nVisitor Day Pass : ENABLED");
        System.out.println("Five Floors       : ENABLED");
        System.out.println("Unequal Capacities: ENABLED");

        System.out.println("\nFloor Capacities:");
        for (int i = 0; i < floors.length; i++) {
            System.out.println("Floor " + (i + 1) + " -> " + floors[i].length + " slots");
        }

        System.out.println("\nDecision: MODIFY");
        System.out.println("Result: Changed requirements incorporated into the parking model.");
    }
}