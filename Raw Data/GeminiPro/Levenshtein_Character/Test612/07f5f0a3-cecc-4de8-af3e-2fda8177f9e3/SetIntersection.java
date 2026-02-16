import java.util.HashSet;
import java.util.Set;

public class SetIntersection {

    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        // Retain elements that are the same in both sets (Intersection)
        set1.retainAll(set2); // Modifies set1 directly


        // Print the intersection (elements common to both sets)
        System.out.println("Intersection of the two sets: " + set1); 
    }
}
