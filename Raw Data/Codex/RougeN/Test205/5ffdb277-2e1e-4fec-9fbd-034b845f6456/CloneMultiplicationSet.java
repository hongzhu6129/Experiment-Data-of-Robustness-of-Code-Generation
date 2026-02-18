import java.util.HashSet;

public class CloneMultiplicationSet {

    public static void main(String[] args) {
        // Create a HashSet to store multiplication table elements
        HashSet<Integer> multiplicationSet = new HashSet<>();

        // Populate the set with multiples of 2 up to 20 (example)
        for (int i = 1; i <= 10; i++) {
            multiplicationSet.add(2 * i);
        }

        // Clone the HashSet using the constructor
        HashSet<Integer> clonedSet = new HashSet<>(multiplicationSet);


        // Print the original and cloned sets to verify
        System.out.println("Original Set: " + multiplicationSet);
        System.out.println("Cloned Set: " + clonedSet);


        // Demonstrate that changes to the cloned set don't affect the original
        clonedSet.add(42); // Add an element to the cloned set
        System.out.println("Original Set after modification of cloned set: " + multiplicationSet);
        System.out.println("Cloned Set after modification: " + clonedSet);


    }
}
