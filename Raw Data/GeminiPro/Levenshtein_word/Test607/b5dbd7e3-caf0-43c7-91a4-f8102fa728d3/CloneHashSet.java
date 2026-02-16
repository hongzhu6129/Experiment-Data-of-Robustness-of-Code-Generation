import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("apple");
        originalSet.add("banana");
        originalSet.add("orange");

        // Clone the HashSet using the constructor
        HashSet<String> clonedSet = new HashSet<>(originalSet);


        // Print the original and cloned sets to verify
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);

        // Demonstrate that changes to the cloned set do not affect the original set
        clonedSet.add("grape");

        System.out.println("Original HashSet after modification to clone: " + originalSet);
        System.out.println("Cloned HashSet after modification: " + clonedSet);
    }
}
