import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create the original HashSet
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Orange");

        // Clone the HashSet using the constructor
        HashSet<String> clonedSet = new HashSet<>(originalSet); 

        // Print the original and cloned sets
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);

        // Demonstrate that the cloned set is independent
        clonedSet.add("Grape"); // Modify the cloned set
        System.out.println("Original HashSet after modification of clone: " + originalSet); // Original remains unchanged
        System.out.println("Cloned HashSet after modification: " + clonedSet);


        // Another cloning method using addAll
        HashSet<String> anotherClonedSet = new HashSet<>();
        anotherClonedSet.addAll(originalSet);

        System.out.println("Another Cloned HashSet: " + anotherClonedSet);



    }
}
