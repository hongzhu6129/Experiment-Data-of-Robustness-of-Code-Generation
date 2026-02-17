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


        //  Demonstrate that changes to the clone don't affect the original (and vice-versa)
        clonedHashSet.add("Mango");
        originalHashSet.add("Kiwi");

        System.out.println("Original HashSet after modification: " + originalHashSet);
        System.out.println("Cloned HashSet after modification: " + clonedHashSet);



    }
}
