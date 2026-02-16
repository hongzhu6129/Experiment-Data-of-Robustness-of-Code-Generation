import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> originalSet = new HashSet<>();

        // Add elements to the original HashSet
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Orange");
        originalSet.add("Grape");

        // Clone the HashSet using the constructor
        HashSet<String> clonedSet = new HashSet<>(originalSet);


        // Print the original HashSet
        System.out.println("Original HashSet: " + originalSet);

        // Print the cloned HashSet
        System.out.println("Cloned HashSet: " + clonedSet);


        //  Demonstrate that changes to the clone do not affect the original
        clonedSet.remove("Banana");
        System.out.println("Original HashSet after modification to clone: " + originalSet);
        System.out.println("Cloned HashSet after modification: " + clonedSet);



    }
}
