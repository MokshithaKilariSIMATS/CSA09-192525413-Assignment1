class ParkingVehicle {
    String number;
    String owner;
    String type;
    double hourlyRate;

    ParkingVehicle() {
        this("UNKNOWN", "UNKNOWN", "Car", 30.0);
    }

    ParkingVehicle(String number, String owner) {
        this(number, owner, "Car", 30.0);
    }

    ParkingVehicle(String number, String owner, String type, double hourlyRate) {
        this.number = number;
        this.owner = owner;
        this.type = type;
        this.hourlyRate = hourlyRate;
    }

    void display() {
        System.out.println("Vehicle Number : " + number);
        System.out.println("Owner          : " + owner);
        System.out.println("Type           : " + type);
        System.out.println("Hourly Rate    : Rs." + hourlyRate);
    }
}

public class Task04 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 04: Constructors and Constructor Chaining");
        System.out.println();

        ParkingVehicle v1 = new ParkingVehicle();
        ParkingVehicle v2 = new ParkingVehicle("TN-09-AB-1234", "Mokshitha");
        ParkingVehicle v3 = new ParkingVehicle("TN-09-CD-5678", "Arjun", "Bike", 15.0);

        System.out.println("Default Constructor:");
        v1.display();

        System.out.println("\nTwo-Argument Constructor:");
        v2.display();

        System.out.println("\nParameterized Constructor:");
        v3.display();

        System.out.println("\nResult: Constructor overloading and constructor chaining demonstrated.");
    }
}