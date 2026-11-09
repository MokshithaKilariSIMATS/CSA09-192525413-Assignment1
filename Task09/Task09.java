interface Chargeable {
    double calculateCharge(int hours);
}

abstract class ParkingVehicle implements Chargeable {
    protected String number;

    ParkingVehicle(String number) {
        this.number = number;
    }

    abstract String getVehicleType();

    void displayVehicle() {
        System.out.println("Vehicle Number : " + number);
        System.out.println("Vehicle Type   : " + getVehicleType());
    }
}

class Car extends ParkingVehicle {
    Car(String number) {
        super(number);
    }

    @Override
    String getVehicleType() {
        return "Car";
    }

    @Override
    public double calculateCharge(int hours) {
        return 50 + (hours - 1) * 30;
    }
}

public class Task09 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 09: Abstraction and Interface");
        System.out.println();

        ParkingVehicle car = new Car("TN-09-AB-1234");
        car.displayVehicle();

        int hours = 4;
        System.out.println("Parking Hours  : " + hours);
        System.out.printf("Parking Charge : Rs.%.2f%n", car.calculateCharge(hours));

        System.out.println("\nResult: Abstract class and Chargeable interface implemented successfully.");
    }
}