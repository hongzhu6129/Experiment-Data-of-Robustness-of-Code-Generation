import java.util.HashSet;
import java.util.Set;

public class SetComparison {

    public static void main(String[] args) {
        // Create two sets
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");
        set1.add("grape");

        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("orange");
        set2.add("kiwi");
        set2.add("mango");

        // Retain elements that are the same in both sets
        set1.retainAll(set2); // modifies set1 directly

        // Print the common elements
        System.out.println("Common elements: " + set1); 
    }
}
