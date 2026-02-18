import java.util.HashSet;
import java.util.Set;

public class RemoveAllHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Print the initial HashSet
        System.out.println("Initial HashSet: " + hashSet);

        // Remove all elements from the HashSet
        hashSet.clear();


        // Print the HashSet after removing all elements
        System.out.println("HashSet after removing all elements: " + hashSet); 
    }
}
