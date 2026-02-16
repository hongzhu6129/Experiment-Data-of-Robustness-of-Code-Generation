import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create the original HashSet
        HashSet<String> originalHashSet = new HashSet<>();
        originalHashSet.add("Apple");
        originalHashSet.add("Banana");
        originalHashSet.add("Orange");

        // Clone the HashSet using the constructor
        HashSet<String> clonedHashSet = new HashSet<>(originalHashSet);


        // Print the original and cloned HashSets to verify
        System.out.println("Original HashSet: " + originalHashSet);
        System.out.println("Cloned HashSet: " + clonedHashSet);


        // Demonstrate that they are independent (modifying one doesn't affect the other)
        clonedHashSet.add("Grape");

        System.out.println("\nAfter adding 'Grape' to the cloned set:");
        System.out.println("Original HashSet: " + originalHashSet);
        System.out.println("Cloned HashSet: " + clonedHashSet);


         //Clone using addAll()
        HashSet<String> anotherClonedSet = new HashSet<>();
        anotherClonedSet.addAll(originalHashSet);

        System.out.println("\nAnother cloned set using addAll(): " + anotherClonedSet);
    }
}
