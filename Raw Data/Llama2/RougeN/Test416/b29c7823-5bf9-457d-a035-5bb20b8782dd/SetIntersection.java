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


        // Method 1: Using retainAll() (modifies set1 directly)
        set1.retainAll(set2); 
        System.out.println("Intersection (using retainAll): " + set1);


        // Method 2: Creating a new set for the intersection (set1 remains unchanged)
        Set<String> set1Copy = new HashSet<>(set1); // Create a copy to avoid modifying original
        Set<String> intersection = new HashSet<>();

        for (String element : set1Copy) {
            if (set2.contains(element)) {
                intersection.add(element);
            }
        }
        System.out.println("Intersection (using iteration): " + intersection);



       //Method 3: Java 8 Stream API (set1 remains unchanged)
        Set<String> set1Copy2 = new HashSet<>(set1);  //Avoid modifying original set
        Set<String> intersection2 = set1Copy2.stream()
                .filter(set2::contains)
                .collect(java.util.stream.Collectors.toSet());

        System.out.println("Intersection (using streams): " + intersection2);




    }
}
