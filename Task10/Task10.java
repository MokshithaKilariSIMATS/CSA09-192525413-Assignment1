package task10;

class ParkingAccount {
    private String owner;
    private String vehicleNumber;

    ParkingAccount(String owner, String vehicleNumber) {
        this.owner = owner;
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void display() {
        System.out.println("Owner          : " + owner);
        System.out.println("Vehicle Number : " + vehicleNumber);
    }
}

public class Task10 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 10: Package and Encapsulation");
        System.out.println();

        ParkingAccount account =
            new ParkingAccount("Mokshitha", "TN-09-AB-1234");

        account.display();

        System.out.println("\nPrivate fields are accessed through public getter methods.");
        System.out.println("Package Name   : task10");
        System.out.println("Result: Package organization and encapsulation demonstrated.");
    }
}