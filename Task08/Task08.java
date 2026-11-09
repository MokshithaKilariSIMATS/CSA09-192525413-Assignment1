class Vehicle {
    void calculateParkingFee(int hours) {
        System.out.println("Generic vehicle fee.");
    }
}

class Car extends Vehicle {
    @Override
    void calculateParkingFee(int hours) {
        System.out.println("Car fee for " + hours + " hour(s): Rs." + (50 + (hours - 1) * 30));
    }
}

class Bike extends Vehicle {
    @Override
    void calculateParkingFee(int hours) {
        System.out.println("Bike fee for " + hours + " hour(s): Rs." + (20 + (hours - 1) * 15));
    }
}

class ElectricVehicle extends Vehicle {
    @Override
    void calculateParkingFee(int hours) {
        System.out.println("EV fee for " + hours + " hour(s): Rs." + (30 + (hours - 1) * 20));
    }
}

public class Task08 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 08: Runtime Polymorphism");
        System.out.println();

        Vehicle[] vehicles = {
            new Car(),
            new Bike(),
            new ElectricVehicle()
        };

        for (Vehicle v : vehicles) {
            v.calculateParkingFee(3);
        }

        System.out.println("\nResult: One parent reference type invokes different overridden methods at runtime.");
    }
}