import java.util.HashSet;
import java.util.Set;

public class EmptyHashSet {

    public static void main(String[] args) {

        // Create a HashSet of strings
        Set<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        // Print the initial HashSet
        System.out.println("Initial HashSet: " + hashSet);

        // Method 1: Using clear()
        hashSet.clear(); 
        System.out.println("HashSet after clear(): " + hashSet);


        // Repopulate for demonstration of the second method
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        // Method 2: Using removeAll() with the HashSet itself
        hashSet.removeAll(hashSet);  // Removes all elements present in the set itself
        System.out.println("HashSet after removeAll(): " + hashSet);



        // Important Note about creating an empty HashSet:
        // If you need a *new* empty HashSet rather than emptying an existing one,
        // simply create a new instance:

        Set<String> newEmptyHashSet = new HashSet<>();
        System.out.println("A brand new empty HashSet: " + newEmptyHashSet);

    }
}
