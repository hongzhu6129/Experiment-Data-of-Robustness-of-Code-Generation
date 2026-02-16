import java.util.HashSet;
import java.util.Set;

public class SetComparison {

    public static void main(String[] args) {
        // Create two sets
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        set1.add("date");

        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("cherry");
        set2.add("grape");
        set2.add("fig");


        // Retain only the common elements in set1
        set1.retainAll(set2);


        // Print the updated set1 (containing only common elements)
        System.out.println("Common elements: " + set1); 
    }
}
