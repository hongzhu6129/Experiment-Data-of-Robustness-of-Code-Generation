import java.util.HashSet;

public class HashSetClone {

    public static void main(String[] args) {

        // Create a HashSet with some initial elements
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("apple");
        originalSet.add("banana");
        originalSet.add("orange");

        // Method 1: Using the constructor
        HashSet<String> clonedSet1 = new HashSet<>(originalSet);

        // Method 2: Using the clone() method (Less common and potentially unsafe with mutable objects within the HashSet)
        HashSet<String> clonedSet2 = (HashSet<String>) originalSet.clone();


        // Print the original and cloned sets
        System.out.println("Original Set: " + originalSet);
        System.out.println("Cloned Set 1 (Constructor): " + clonedSet1);
        System.out.println("Cloned Set 2 (clone() method): " + clonedSet2);


        // Demonstrate that changes to the cloned set don't affect the original set
        clonedSet1.add("grape");
        System.out.println("\nAfter adding 'grape' to Cloned Set 1:");
        System.out.println("Original Set: " + originalSet);
        System.out.println("Cloned Set 1: " + clonedSet1);


         // Demonstrate potential issues with clone() when storing mutable objects
        HashSet<StringBuilder> mutableSet = new HashSet<>();
        StringBuilder sb1 = new StringBuilder("hello");
        mutableSet.add(sb1);

        HashSet<StringBuilder> clonedMutableSet = (HashSet<StringBuilder>) mutableSet.clone();

        // Modifying the StringBuilder in the original set ALSO affects the cloned set!
        sb1.append(" world"); 
        System.out.println("\nDemonstrating shallow copy with mutable objects:");
        System.out.println("Original Mutable Set: " + mutableSet);
        System.out.println("Cloned Mutable Set: " + clonedMutableSet);  // "world" appears here too!



        // BEST PRACTICE for Cloning with Mutable Objects: Deep Copy (Manual cloning of each element)
        HashSet<StringBuilder> deepClonedSet = new HashSet<>();
        for(StringBuilder sb : mutableSet) {
            deepClonedSet.add(new StringBuilder(sb.toString())); // Create new StringBuilder objects
        }

        //Now modifying original won't affect the deep copy
        sb1.append("!");
        System.out.println("\nDemonstrating deep copy with mutable objects:");
        System.out.println("Original Mutable Set: " + mutableSet);
        System.out.println("Deep Cloned Set: " + deepClonedSet); // "!" does NOT appear here


    }
}
