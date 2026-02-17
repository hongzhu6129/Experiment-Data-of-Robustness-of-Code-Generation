import java.util.ArrayList;
import java.util.List;

public class TrackElementArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);
        numbers.add(30);

        // Element to track
        int target = 15;

        // Track the element using contains()
        boolean found = numbers.contains(target);

        if (found) {
            System.out.println(target + " is present in the ArrayList.");

            // Find the index of the element using indexOf()
            int index = numbers.indexOf(target);
            System.out.println("Index of " + target + ": " + index);


            // Find the last index of the element (if it appears multiple times) using lastIndexOf()
             int lastIndex = numbers.lastIndexOf(target); // Useful if duplicates are allowed
            System.out.println("Last index of " + target + ": " + lastIndex);



        } else {
            System.out.println(target + " is not present in the ArrayList.");
        }


        // Tracking all occurrences (if duplicates are allowed)
        target = 5; //  Demonstrate with another value that might have duplicates.
        System.out.print("Occurrences of " + target + " at indices: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Newline for formatting.



    }
}
