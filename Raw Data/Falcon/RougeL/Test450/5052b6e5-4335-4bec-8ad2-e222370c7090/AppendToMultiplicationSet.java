import java.util.HashSet;
import java.util.Set;

public class AppendToMultiplicationSet {

    public static void main(String[] args) {
        // Example usage:
        Set<Integer> multiplicationSet = new HashSet<>();
        multiplicationSet.add(2);
        multiplicationSet.add(4);
        multiplicationSet.add(6);
        multiplicationSet.add(8);

        int elementToAdd = 10;

        // Append the element
        multiplicationSet.add(elementToAdd);


        // Print the updated set (optional, for verification)
        System.out.println("Updated Multiplication Set: " + multiplicationSet);


        // More robust example handling potential duplicates and showing how to build a 
        // multiplication set from scratch:
        Set<Integer> anotherSet = createMultiplicationSet(5, 2); // 2, 4, 6, 8, 10
        int anotherElement = 12;

        appendElement(anotherSet, anotherElement);
        System.out.println("Another Updated Set: " + anotherSet);


         // Example demonstrating that duplicates are not added.
        Set<Integer> setWithDuplicate = createMultiplicationSet(3,3); //3, 6, 9
        int duplicateElement = 6;

        appendElement(setWithDuplicate, duplicateElement);  // Attempting to add a duplicate (6)
        System.out.println("Set with Duplicate Attempt: " + setWithDuplicate); // Output will still be 3, 6, 9


    }



    // Helper function to create a basic multiplication set (for demonstration)
    public static Set<Integer> createMultiplicationSet(int numElements, int multiplier) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= numElements; i++) {
            set.add(i * multiplier);
        }
        return set;
    }

    // Helper function to append (this mainly highlights the use of add() which implicitly handles duplicates for Sets)
    public static void appendElement(Set<Integer> set, int element) {
        set.add(element); // Sets automatically handle duplicates; no need for explicit checks.

    }

}
