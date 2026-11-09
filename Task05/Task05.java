class ParkingCounter {
    static int totalVehicles = 0;
    int ticketNumber;

    ParkingCounter() {
        totalVehicles++;
        ticketNumber = totalVehicles;
    }

    void display() {
        System.out.println("Ticket Number : " + ticketNumber);
        System.out.println("Total Vehicles: " + totalVehicles);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collection candidate: Ticket " + ticketNumber);
        super.finalize();
    }
}

public class Task05 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 05: Static Members and Object Lifecycle");
        System.out.println();

        ParkingCounter p1 = new ParkingCounter();
        ParkingCounter p2 = new ParkingCounter();

        p1.display();
        System.out.println();
        p2.display();

        p1 = null;
        p2 = null;

        System.out.println("\nObjects released from active references.");
        System.gc();
        System.out.println("System.gc() requested.");
        System.out.println("Result: Static counter and object lifecycle concepts demonstrated.");
    }
}