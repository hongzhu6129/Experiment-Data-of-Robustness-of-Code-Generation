import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> originalHashSet = new HashSet<>();

        // Add some elements to the original HashSet
        originalHashSet.add("Apple");
        originalHashSet.add("Banana");
        originalHashSet.add("Orange");
        originalHashSet.add("Mango");


        // Method 1: Using the constructor
        HashSet<String> clonedHashSet1 = new HashSet<>(originalHashSet);


        // Method 2: Using the clone() method (less preferred as it returns Object)
        HashSet<String> clonedHashSet2 = (HashSet<String>) originalHashSet.clone(); // Cast required



        // Print the original and cloned HashSets to verify
        System.out.println("Original HashSet: " + originalHashSet);
        System.out.println("Cloned HashSet (Constructor): " + clonedHashSet1);
        System.out.println("Cloned HashSet (clone() method): " + clonedHashSet2);



        // Demonstrate that changes to the clone don't affect the original (and vice versa)
        clonedHashSet1.remove("Banana");
        originalHashSet.add("Grape");


        System.out.println("\nAfter modifications:");
        System.out.println("Original HashSet: " + originalHashSet);
        System.out.println("Cloned HashSet (Constructor): " + clonedHashSet1);




    }
}
