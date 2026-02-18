import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");
        hashSet.add("Mango");

        // Convert HashSet to TreeSet
        Set<String> treeSet = new TreeSet<>(hashSet); 

        // Print the TreeSet (elements will be sorted)
        System.out.println("TreeSet: " + treeSet); 
    }
}
