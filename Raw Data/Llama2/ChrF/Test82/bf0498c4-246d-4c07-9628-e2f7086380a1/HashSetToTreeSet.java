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


        // Example with Integer objects (demonstrates natural ordering for numbers)
        Set<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(5);
        numberHashSet.add(2);
        numberHashSet.add(8);
        numberHashSet.add(1);

        Set<Integer> numberTreeSet = new TreeSet<>(numberHashSet);
        System.out.println("TreeSet of numbers: " + numberTreeSet);


        // Example with a custom Comparator (for example, reverse order)
        Set<String> reverseTreeSet = new TreeSet<>((s1, s2) -> s2.compareTo(s1)); // Reverse alphabetical order
        reverseTreeSet.addAll(hashSet); // Add all elements from the original HashSet
        System.out.println("TreeSet in reverse order: " + reverseTreeSet);

    }
}
