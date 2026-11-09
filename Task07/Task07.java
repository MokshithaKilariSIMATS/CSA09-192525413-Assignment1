class ParkingVehicle {
    String number;

    ParkingVehicle(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ParkingVehicle{number='" + number + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ParkingVehicle)) return false;
        ParkingVehicle other = (ParkingVehicle) obj;
        return number.equals(other.number);
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }
}

class ElectricVehicle extends ParkingVehicle {
    int batteryLevel;

    ElectricVehicle(String number, int batteryLevel) {
        super(number);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "ElectricVehicle{number='" + number +
               "', batteryLevel=" + batteryLevel + "%}";
    }
}

public class Task07 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 07: Overriding and Object Methods");
        System.out.println();

        ParkingVehicle v1 = new ParkingVehicle("TN-09-AB-1234");
        ParkingVehicle v2 = new ParkingVehicle("TN-09-AB-1234");
        ElectricVehicle ev = new ElectricVehicle("TN-09-EV-9001", 78);

        System.out.println("toString(): " + v1);
        System.out.println("Overridden toString(): " + ev);
        System.out.println("v1 equals v2: " + v1.equals(v2));
        System.out.println("v1 hashCode : " + v1.hashCode());
        System.out.println("ev hashCode : " + ev.hashCode());

        System.out.println("\nResult: @Override, toString(), equals() and hashCode() demonstrated.");
    }
}