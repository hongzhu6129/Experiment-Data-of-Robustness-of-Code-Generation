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


        // Method 1: Using retainAll() (modifies set1)
        //set1.retainAll(set2);  // This modifies set1 directly. Uncomment to use.
        //System.out.println("Intersection (modifying set1): " + set1);


        // Method 2:  Creating a new set for the intersection (set1 remains unchanged)
        Set<String> intersection = new HashSet<>(set1); // Create a copy to avoid modifying set1
        intersection.retainAll(set2);
        System.out.println("Intersection (new set): " + intersection);



    }
}
