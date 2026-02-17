import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet
        numbers.add(2);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(12);
        numbers.add(3);

        // Find and print numbers less than 7
        System.out.println("Numbers less than 7:");

        // Method 1: Using headSet() (most efficient for TreeSets)
        for (Integer num : numbers.headSet(7)) { // headSet(7) EXCLUDES 7
            System.out.print(num + " ");
        }
        System.out.println(); // Newline for clarity

        // Method 2: Using enhanced for loop with conditional (less efficient)
        System.out.println("Numbers less than 7 (alternative method):");
        for(Integer num : numbers) {
            if(num < 7) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


    }
}
