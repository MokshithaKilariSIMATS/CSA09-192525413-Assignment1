import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("=== CAMPUS SMART-PARKING SYSTEM ===");
        System.out.println("Task 02: Data Types and Jagged Arrays");
        System.out.println();

        int floors = 5;
        String[] floorNames = {"Ground", "First", "Second", "Third", "Fourth"};

        // Different floors have different numbers of parking slots.
        int[][] parkingSlots = {
            {101, 102, 103, 104},
            {201, 202, 203},
            {301, 302, 303, 304, 305},
            {401, 402},
            {501, 502, 503}
        };

        boolean available = true;
        double hourlyRate = 40.50;
        char category = 'C';

        System.out.println("Floors           : " + floors);
        System.out.println("Hourly Rate      : Rs." + hourlyRate);
        System.out.println("Vehicle Category : " + category);
        System.out.println("Availability Flag: " + available);
        System.out.println("\nJagged Parking Layout:");

        for (int i = 0; i < parkingSlots.length; i++) {
            System.out.print(floorNames[i] + " Floor -> ");
            for (int slot : parkingSlots[i]) {
                System.out.print(slot + " ");
            }
            System.out.println();
        }

        System.out.println("\nResult: Primitive data types and a jagged array with unequal floor capacities were demonstrated.");
    }
}