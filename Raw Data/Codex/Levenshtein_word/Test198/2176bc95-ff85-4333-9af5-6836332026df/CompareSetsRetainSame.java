import java.util.HashSet;
import java.util.Set;

public class CompareSetsRetainSame {

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


        // Retain only the elements that are the same in both sets (intersection)
        set1.retainAll(set2);


        // Print the resulting set (elements common to both original sets)
        System.out.println("Common elements: " + set1); 
    }
}
