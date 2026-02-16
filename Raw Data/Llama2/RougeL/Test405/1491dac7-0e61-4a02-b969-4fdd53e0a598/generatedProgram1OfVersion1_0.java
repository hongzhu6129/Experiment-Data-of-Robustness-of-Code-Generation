import java.util.HashSet;
import java.util.Set;

public class SetIntersection {

    public static void main(String[] args) {
        // Create two sample sets
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


        // Method 1: Using retainAll() - modifies set1 in place
        System.out.println("Method 1: Using retainAll()");

        Set<String> originalSet1 = new HashSet<>(set1); // Create a copy for demonstration

        originalSet1.retainAll(set2); 

        System.out.println("Original Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection (modifies set1): " + originalSet1);



        // Method 2: Using a new set for the intersection - doesn't modify original sets
        System.out.println("\nMethod 2: Using a new set");

        Set<String> intersection = new HashSet<>(set1); // Start with a copy of set1
        intersection.retainAll(set2); // Keep only elements also present in set2

        System.out.println("Original Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection (new set): " + intersection);



        // Method 3: Iterative approach (less efficient, but demonstrates logic)
        System.out.println("\nMethod 3: Iterative approach");
        Set<String> intersectionIterative = new HashSet<>();

        for (String element : set1) {
            if (set2.contains(element)) {
                intersectionIterative.add(element);
            }
        }

        System.out.println("Original Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection (iterative): " + intersectionIterative);


    }
}
