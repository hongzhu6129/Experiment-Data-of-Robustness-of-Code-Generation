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

        // Print both HashSets to verify the cloning
        System.out.println("Original HashSet: " + originalHashSet);
        System.out.println("Cloned HashSet: " + clonedHashSet);


        // Demonstrate that changes to the clone do not affect the original
        clonedHashSet.add("Grape");

        System.out.println("Original HashSet after modification to clone: " + originalHashSet);
        System.out.println("Cloned HashSet after modification: " + clonedHashSet);


         // Another way - less common but demonstrates another approach: clone() method (needs casting)
         HashSet<String> anotherClone = (HashSet<String>) originalHashSet.clone();
         System.out.println("Another Cloned HashSet: " + anotherClone);


    }
}
