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


        // Demonstrate that changes to the clone don't affect the original
        clonedHashSet.remove("Banana");
        System.out.println("Cloned HashSet after removing Banana: " + clonedHashSet);
        System.out.println("Original HashSet (unaffected): " + originalHashSet);


        // Another way to clone (Less efficient for large sets)
        HashSet<String> anotherClone = new HashSet<>();
        for (String element : originalHashSet) {
            anotherClone.add(element);
        }

        System.out.println("Another Cloned HashSet: " + anotherClone);

    }
}
