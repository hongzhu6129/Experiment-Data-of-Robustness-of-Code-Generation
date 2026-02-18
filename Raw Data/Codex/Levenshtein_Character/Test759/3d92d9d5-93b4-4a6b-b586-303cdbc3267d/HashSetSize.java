import java.util.HashSet;
import java.util.Set;

public class HashSetSize {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();

        // Add some elements
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("date"); // Adding a duplicate won't increase size

        // Get the number of elements (size)
        int size = hashSet.size();

        // Print the size
        System.out.println("The size of the HashSet is: " + size); 
    }
}
