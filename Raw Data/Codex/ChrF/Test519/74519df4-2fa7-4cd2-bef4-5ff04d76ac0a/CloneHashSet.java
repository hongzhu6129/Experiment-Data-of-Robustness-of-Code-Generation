import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> originalHashSet = new HashSet<>();

        // Add some elements to the original HashSet
        originalHashSet.add("Apple");
        originalHashSet.add("Banana");
        originalHashSet.add("Orange");

        // Clone the HashSet using the constructor
        HashSet<String> clonedHashSet = new HashSet<>(originalHashSet);


        // Print the original and cloned HashSets to verify
        System.out.println("Original HashSet: " + originalHashSet);
        System.out.println("Cloned HashSet: " + clonedHashSet);


        //  Demonstrate that changes to the clone don't affect the original
        clonedHashSet.add("Grape"); 

        System.out.println("Original HashSet after modification to clone: " + originalHashSet);
        System.out.println("Cloned HashSet after modification: " + clonedHashSet);


        // Another way to clone (less efficient as it iterates):
        HashSet<String> anotherClonedSet = new HashSet<>();
        for (String element : originalHashSet) {
            anotherClonedSet.add(element);
        }

        System.out.println("Another Cloned HashSet: " + anotherClonedSet);


    }
}
