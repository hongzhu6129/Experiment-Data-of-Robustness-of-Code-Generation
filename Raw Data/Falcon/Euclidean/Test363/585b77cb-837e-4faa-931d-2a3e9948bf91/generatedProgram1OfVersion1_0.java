import java.util.HashSet;
import java.util.Set;

public class CompareHashSets {

    public static void main(String[] args) {
        // Create two HashSets
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // Populate the sets with some data
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        set2.add("banana");
        set2.add("orange");
        set2.add("grape");


        // 1. Check if sets are equal (contain the same elements)
        System.out.println("Are set1 and set2 equal? " + set1.equals(set2));  // Output: false


        // 2. Check if one set is a subset of another
        System.out.println("Is set1 a subset of set2? " + set2.containsAll(set1)); // Output: false
        System.out.println("Is set2 a subset of set1? " + set1.containsAll(set2)); // Output: false

        Set<String> subset = new HashSet<>();
        subset.add("banana");
        subset.add("orange");
        System.out.println("Is subset a subset of set1? " + set1.containsAll(subset)); // Output: true



        // 3. Find the intersection (common elements) of two sets
        Set<String> intersection = new HashSet<>(set1); // Create a copy to avoid modifying set1
        intersection.retainAll(set2); // retainAll modifies the set to keep only common elements
        System.out.println("Intersection of set1 and set2: " + intersection); // Output: [orange, banana]


        // 4. Find the union (all elements from both sets) of two sets
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2: " + union); // Output: [orange, apple, grape, banana]



        // 5. Find the difference (elements in set1 but not in set2)
        Set<String> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Elements in set1 but not in set2: " + difference1); // Output: [apple]


        // 6. Find the difference (elements in set2 but not in set1)
        Set<String> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Elements in set2 but not in set1: " + difference2); // Output: [grape]


        //  Disjoint Sets (no common elements)

        Set<String> disjointSet = new HashSet<>();
        disjointSet.add("kiwi");
        disjointSet.add("mango");

        System.out.println("Are set1 and disjointSet disjoint? " + java.util.Collections.disjoint(set1, disjointSet)); // Output: true
        System.out.println("Are set1 and set2 disjoint? " + java.util.Collections.disjoint(set1, set2)); // Output: false


    }
}
