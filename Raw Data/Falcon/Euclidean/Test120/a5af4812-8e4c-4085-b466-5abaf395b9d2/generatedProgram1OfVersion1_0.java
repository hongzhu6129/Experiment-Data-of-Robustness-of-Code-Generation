import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Convert HashSet to TreeSet (sorted order)
        TreeSet<String> treeSet = new TreeSet<>(hashSet); 

        // Print the TreeSet elements
        System.out.println("TreeSet elements (sorted): " + treeSet);


        // Example with Integers:
        HashSet<Integer> hashSetInt = new HashSet<>();
        hashSetInt.add(5);
        hashSetInt.add(2);
        hashSetInt.add(8);
        hashSetInt.add(1);

        TreeSet<Integer> treeSetInt = new TreeSet<>(hashSetInt);
        System.out.println("TreeSet of Integers (sorted): " + treeSetInt);
    }
}
