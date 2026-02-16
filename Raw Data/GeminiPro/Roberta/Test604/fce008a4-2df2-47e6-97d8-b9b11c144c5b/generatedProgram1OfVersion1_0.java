import java.util.Collections;
import java.util.HashSet;

public class HashSetMinimum {

    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Find the minimum element using Collections.min()
        if (!numbers.isEmpty()) {
            Integer min = Collections.min(numbers);
            System.out.println("Minimum element: " + min);
        } else {
            System.out.println("HashSet is empty.");
        }



        // Example with other data types (e.g., String)
        HashSet<String> strings = new HashSet<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");

        if (!strings.isEmpty()) {
            String minString = Collections.min(strings);
            System.out.println("Minimum string (lexicographically): " + minString);
        } else {
            System.out.println("String HashSet is empty.");

        }
    }
}
