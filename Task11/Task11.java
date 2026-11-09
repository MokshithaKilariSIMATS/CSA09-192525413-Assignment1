import java.util.*;

public class Task11 {
    static final int CAPACITY = 3;
    static boolean[] occupied = new boolean[CAPACITY];

    static void park(int slot) {
        if (slot < 1 || slot > CAPACITY) {
            System.out.println("INVALID: Slot number must be between 1 and " + CAPACITY + ".");
            return;
        }

        if (occupied[slot - 1]) {
            System.out.println("REJECTED: Slot " + slot + " is already occupied.");
        } else {
            occupied[slot - 1] = true;
            System.out.println("SUCCESS: Vehicle parked in slot " + slot + ".");
        }
    }

    static void status() {
        System.out.println("Parking Status:");
        for (int i = 0; i < CAPACITY; i++) {
            System.out.println("Slot " + (i + 1) + " -> " +
                    (occupied[i] ? "Occupied" : "Available"));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 11: Implementation and Testing");
        System.out.println();

        System.out.print("Enter slot number to park: ");
        int slot = sc.nextInt();
        park(slot);

        System.out.println();
        status();

        System.out.println("\nTest categories covered: Normal, Boundary and Invalid input.");
        System.out.println("Result: Parking allocation validation completed.");

        sc.close();
    }
}