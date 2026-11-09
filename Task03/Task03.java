import java.util.*;

public class Task03 {
    static int[] slots = {101, 102, 103, 104, 105};
    static boolean[] occupied = {true, false, true, false, false};

    static int findAvailableSlot() {
        for (int i = 0; i < slots.length; i++) {
            if (!occupied[i]) return slots[i];
        }
        return -1;
    }

    static double calculateFee(int hours) {
        if (hours <= 1) return 20.0;
        return 20.0 + (hours - 1) * 30.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 03: Control Logic, Allocation and Fee Calculation");
        System.out.println();

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        if (hours <= 0) {
            System.out.println("Invalid parking duration.");
            return;
        }

        int slot = findAvailableSlot();

        if (slot == -1) {
            System.out.println("Parking Full.");
        } else {
            double fee = calculateFee(hours);
            System.out.println("Allocated Slot  : " + slot);
            System.out.println("Parking Hours   : " + hours);
            System.out.printf("Parking Fee     : Rs.%.2f%n", fee);

            for (int i = 0; i < slots.length; i++) {
                if (slots[i] == slot) occupied[i] = true;
            }

            System.out.println("Status          : Parking confirmed.");
        }

        sc.close();
    }
}