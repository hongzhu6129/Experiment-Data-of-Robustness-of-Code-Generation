import java.util.HashSet;
import java.util.Set;

public class FindNumbersLessThan7 {

    public static void main(String[] args) {
        // Create a HashSet to simulate a "green set".  Sets don't inherently have colors,
        // so this is just conceptual. We use a HashSet for efficient lookups.
        Set<Integer> greenSet = new HashSet<>();

        // Populate the green set with some sample data.
        greenSet.add(3);
        greenSet.add(8);
        greenSet.add(5);
        greenSet.add(1);
        greenSet.add(10);
        greenSet.add(6);


        // Find and print the numbers less than 7 in the green set.
        System.out.print("Numbers less than 7 in the green set: ");
        for (Integer number : greenSet) {
            if (number < 7) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output.



        // More concise Java 8+ Stream approach (if you're allowed to use streams within main):
        System.out.print("Numbers less than 7 (using streams): ");
        greenSet.stream()
                .filter(n -> n < 7)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
