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


        System.out.println("Original HashSet: " + hashSet);  // Notice: No guaranteed order


        // 2. Convert HashSet to TreeSet (Method 1: Using TreeSet constructor)
        Set<String> treeSet1 = new TreeSet<>(hashSet);


        System.out.println("TreeSet (using constructor): " + treeSet1); // Sorted!



        // 3. Convert HashSet to TreeSet (Method 2: Adding elements individually)
        Set<String> treeSet2 = new TreeSet<>();
        for (String fruit : hashSet) {
            treeSet2.add(fruit);
        }

        System.out.println("TreeSet (adding elements): " + treeSet2);  // Also sorted!



        // Example with Integers:
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(5);
        integerHashSet.add(2);
        integerHashSet.add(8);
        integerHashSet.add(1);

        Set<Integer> integerTreeSet = new TreeSet<>(integerHashSet); // Using constructor for brevity

        System.out.println("Integer HashSet: " + integerHashSet);
        System.out.println("Integer TreeSet: " + integerTreeSet); // Numbers will be sorted numerically.


        // Important Note on Sorting and Comparability:
        // For custom objects, you'll need to ensure they implement the Comparable interface or provide a Comparator
        // to the TreeSet constructor to define how they should be sorted.  Otherwise, you'll get a runtime error.

    }
}
