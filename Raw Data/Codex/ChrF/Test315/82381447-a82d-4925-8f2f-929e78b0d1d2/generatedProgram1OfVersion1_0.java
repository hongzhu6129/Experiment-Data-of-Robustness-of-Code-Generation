import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Convert HashSet to TreeSet (natural ordering)
        Set<String> treeSet = new TreeSet<>(hashSet); 

        // Print the TreeSet (elements will be sorted)
        System.out.println("TreeSet: " + treeSet);


        // Example with Integers (demonstrating sorting)
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(5);
        integerHashSet.add(1);
        integerHashSet.add(8);
        integerHashSet.add(3);

        Set<Integer> integerTreeSet = new TreeSet<>(integerHashSet);
        System.out.println("Integer TreeSet: " + integerTreeSet);


        // Example with a custom Comparator (for different sorting logic - not required for basic conversion, but shown for completeness)
        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Banana");
        hashSet2.add("Apple");
        hashSet2.add("Orange");
        hashSet2.add("Grape");

        // Sort by string length (descending)
        Set<String> treeSetByLength = new TreeSet<>((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        treeSetByLength.addAll(hashSet2); //  addAll is better than adding one by one
        System.out.println("TreeSet sorted by length (descending): " + treeSetByLength);



    }
}
