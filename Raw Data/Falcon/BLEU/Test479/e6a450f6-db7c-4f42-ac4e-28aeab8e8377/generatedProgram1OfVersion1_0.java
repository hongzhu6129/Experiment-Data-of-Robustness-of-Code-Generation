import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

    public static void main(String[] args) {

        // 1. Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grape");

        System.out.println("HashSet: " + hashSet); // Notice: no guaranteed order

        // 2. Convert HashSet to TreeSet (natural ordering)
        Set<String> treeSet = new TreeSet<>(hashSet); 

        System.out.println("TreeSet (natural ordering): " + treeSet); // Sorted alphabetically


        // 3.  Convert HashSet to TreeSet (custom ordering - example with integers)
        Set<Integer> numbersHashSet = new HashSet<>();
        numbersHashSet.add(5);
        numbersHashSet.add(1);
        numbersHashSet.add(10);
        numbersHashSet.add(2);


        // Using a Comparator (lambda expression for reverse order)
        Set<Integer> numbersTreeSet = new TreeSet<>((a, b) -> b.compareTo(a)); // Reverse order
        numbersTreeSet.addAll(numbersHashSet);

        System.out.println("TreeSet of numbers (reverse order): " + numbersTreeSet);


        // 4.  Illustrating that TreeSet maintains uniqueness like HashSet:
        treeSet.add("Apple"); // Trying to add a duplicate
        System.out.println("TreeSet after adding a duplicate: " + treeSet); // No change, duplicates are ignored.


        //Important Considerations:
        System.out.println("\nImportant Considerations:");
        System.out.println("- TreeSets store elements in a sorted order (either natural or custom).");
        System.out.println("- TreeSets do not allow null elements (unless using a custom Comparator that handles nulls), while HashSets allow one null.");
        System.out.println("- TreeSets offer efficient retrieval of elements in sorted order (e.g., using methods like first(), last()).");
        System.out.println("- The conversion process involves creating a new TreeSet and populating it with the elements of the HashSet. It doesn't modify the original HashSet.");

    }
}
