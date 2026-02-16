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

        // Convert HashSet to TreeSet (natural ordering)
        Set<String> treeSet = new TreeSet<>(hashSet); 

        // Print the TreeSet (elements will be sorted)
        System.out.println("TreeSet: " + treeSet);


        // Example with custom ordering (e.g., reverse alphabetical)  
        Set<String> reverseTreeSet = new TreeSet<>((s1, s2) -> s2.compareTo(s1)); // Comparator for reverse order
        reverseTreeSet.addAll(hashSet); // Add all elements from hashSet
        System.out.println("Reverse TreeSet: " + reverseTreeSet);

         // Example with integers
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(5);
        integerHashSet.add(2);
        integerHashSet.add(8);
        integerHashSet.add(1);

        Set<Integer> integerTreeSet = new TreeSet<>(integerHashSet);
        System.out.println("Integer TreeSet: " + integerTreeSet);


    }
}
