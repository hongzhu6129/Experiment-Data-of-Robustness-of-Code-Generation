import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create the original HashSet
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("apple");
        originalSet.add("banana");
        originalSet.add("orange");

        // Clone the HashSet using the constructor
        HashSet<String> clonedSet = new HashSet<>(originalSet);


        // Print both sets to verify the cloning
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);

        // Modify the cloned set to demonstrate they are independent
        clonedSet.add("grape");

        System.out.println("Original HashSet (after modification to clone): " + originalSet);
        System.out.println("Cloned HashSet (after modification): " + clonedSet);


        // Another way to clone (less efficient for large sets)
        HashSet<String> anotherClonedSet = new HashSet<>();
        for(String item : originalSet) {  // Iterate and add each element
            anotherClonedSet.add(item);
        }

        System.out.println("Another Cloned HashSet: " + anotherClonedSet);

    }
}
