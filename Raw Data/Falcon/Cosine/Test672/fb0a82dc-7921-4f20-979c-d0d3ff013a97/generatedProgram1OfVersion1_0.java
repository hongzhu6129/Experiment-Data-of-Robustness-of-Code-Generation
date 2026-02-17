import java.util.TreeSet;

public class FarFromSeven {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(12);
        numbers.add(15);


        // Find numbers greater than 7 (farther from 0 in the positive direction)
        System.out.println("Numbers greater than 7:");
        for (Integer num : numbers.tailSet(8)) { // tailSet(8) gets numbers >= 8 (strictly greater than 7)
            System.out.print(num + " ");
        }
        System.out.println();

        // Find numbers less than 7 (farther from 0 in the negative direction, if applicable)
        System.out.println("Numbers less than 7:");
        for (Integer num : numbers.headSet(7)) { // headset(7) gets numbers strictly less than 7
             System.out.print(num + " ");
        }
        System.out.println();


        // More generally, to find numbers "far from 7" (absolute difference greater than a threshold):
        int threshold = 2; // Example: Find numbers whose absolute difference from 7 is greater than 2

        System.out.println("Numbers whose absolute difference from 7 is greater than " + threshold + ":");
        for (Integer num : numbers) {
            if (Math.abs(num - 7) > threshold) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


    }
}
