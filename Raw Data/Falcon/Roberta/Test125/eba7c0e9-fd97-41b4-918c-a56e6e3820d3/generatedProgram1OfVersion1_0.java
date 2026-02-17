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
        set2.add("grape");
        set2.add("kiwi");
        set2.add("mango");

        // Method 1: Using retainAll() (modifies the original set)
        System.out.println("Method 1: Using retainAll()");

        Set<String> intersection1 = new HashSet<>(set1); // Create a copy to avoid modifying set1
        intersection1.retainAll(set2); 

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection (retainAll): " + intersection1);


        // Method 2: Using a loop and contains() (doesn't modify original sets)
        System.out.println("\nMethod 2: Using a loop and contains()");

        Set<String> intersection2 = new HashSet<>();
        for (String element : set1) {
            if (set2.contains(element)) {
                intersection2.add(element);
            }
        }

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection (loop and contains): " + intersection2);



        //Method 3: Java 8 Streams (doesn't modify original sets and concise)
        System.out.println("\nMethod 3: Using Java 8 Streams");


        Set<String> intersection3 = set1.stream()
                .filter(set2::contains)
                .collect(java.util.stream.Collectors.toSet());


        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection (Streams): " + intersection3);


    }
}
