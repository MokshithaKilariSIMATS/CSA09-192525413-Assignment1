class Vehicle {
    protected String number;
    protected String owner;

    Vehicle(String number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    void showType() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    Car(String number, String owner) {
        super(number, owner);
    }

    @Override
    void showType() {
        System.out.println("Car");
    }
}

class Bike extends Vehicle {
    Bike(String number, String owner) {
        super(number, owner);
    }

    @Override
    void showType() {
        System.out.println("Bike");
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(String number, String owner) {
        super(number, owner);
    }

    @Override
    void showType() {
        System.out.println("Electric Vehicle");
    }
}

public class Task06 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 06: Inheritance Hierarchy");
        System.out.println();

        Vehicle v1 = new Car("TN-09-AB-1234", "Mokshitha");
        Vehicle v2 = new Bike("TN-09-BB-5678", "Arjun");
        Vehicle v3 = new ElectricVehicle("TN-09-EV-9001", "Priya");

        System.out.println("Vehicle 1 Type: ");
        v1.showType();
        System.out.println("Vehicle 2 Type: ");
        v2.showType();
        System.out.println("Vehicle 3 Type: ");
        v3.showType();

        System.out.println("\nHierarchy: Vehicle -> Car / Bike / ElectricVehicle");
        System.out.println("Result: Inheritance hierarchy implemented successfully.");
    }
}