import java.util.*;

class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
    }
}

class ParkingSlot {
    int slotNumber;
    String floor;
    boolean occupied;

    ParkingSlot(int slotNumber, String floor) {
        this.slotNumber = slotNumber;
        this.floor = floor;
    }

    void display() {
        System.out.println("Slot Number    : " + slotNumber);
        System.out.println("Floor          : " + floor);
        System.out.println("Status         : " + (occupied ? "Occupied" : "Available"));
    }
}

class ParkingTicket {
    String ticketId;
    Vehicle vehicle;
    ParkingSlot slot;

    ParkingTicket(String ticketId, Vehicle vehicle, ParkingSlot slot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.slot = slot;
    }

    void display() {
        System.out.println("Ticket ID      : " + ticketId);
        vehicle.display();
        slot.display();
    }
}

public class Task01 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 01: Object Identification and Responsibilities");
        System.out.println();

        Vehicle v = new Vehicle("TN-09-AB-1234", "Mokshitha", "Car");
        ParkingSlot s = new ParkingSlot(101, "Ground Floor");
        s.occupied = true;
        ParkingTicket t = new ParkingTicket("T1001", v, s);

        t.display();
        System.out.println("\nResult: Vehicle, ParkingSlot and ParkingTicket objects created successfully.");
    }
}