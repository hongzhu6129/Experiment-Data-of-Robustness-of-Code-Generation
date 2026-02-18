import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> originalHashSet = new HashSet<>();

        // Add elements to the original HashSet
        originalHashSet.add("Apple");
        originalHashSet.add("Banana");
        originalHashSet.add("Orange");
        originalHashSet.add("Grape");

        // Clone the HashSet using the constructor
        HashSet<String> clonedHashSet = new HashSet<>(originalHashSet);


        // Print the original HashSet
        System.out.println("Original HashSet: " + originalHashSet);

        // Print the cloned HashSet
        System.out.println("Cloned HashSet: " + clonedHashSet);


        //Modify the original HashSet to show they are independent
        originalHashSet.remove("Apple");

         // Print the original HashSet after modification
        System.out.println("Original HashSet after modification: " + originalHashSet);

        // Print the cloned HashSet (should be unchanged)
        System.out.println("Cloned HashSet after original modification: " + clonedHashSet);


    }
}
