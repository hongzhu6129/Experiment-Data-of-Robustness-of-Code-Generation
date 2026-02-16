import java.util.HashSet;
import java.util.Set;

public class RetainSameElements {

    public static void main(String[] args) {
        // Example sets
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


        // Retain only the common elements in set1
        set1.retainAll(set2);


        // Print the corrected set1 (containing only common elements)
        System.out.println("Common elements: " + set1); 
    }
}
