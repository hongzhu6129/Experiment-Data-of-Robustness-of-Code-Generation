import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Convert HashSet to TreeSet (maintains sorted order)
        Set<String> treeSet = new TreeSet<>(hashSet);


        // Print the TreeSet (notice the sorted order)
        System.out.println("TreeSet: " + treeSet);


        //Demonstrating with Integers
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(5);
        integerHashSet.add(1);
        integerHashSet.add(10);
        integerHashSet.add(3);

        Set<Integer> integerTreeSet = new TreeSet<>(integerHashSet);
        System.out.println("TreeSet of Integers: " + integerTreeSet);

    }
}
