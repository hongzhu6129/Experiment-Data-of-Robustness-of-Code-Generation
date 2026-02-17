import java.util.HashSet;
import java.util.Set;

public class SetComparison {

    public static void main(String[] args) {
        // Create two sets
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


        // Retain common elements in set1 (modifies set1 directly)
        set1.retainAll(set2); 

        // Print the updated set1 (containing only common elements)
        System.out.println("Common elements: " + set1);


        // Demonstrating with Integer sets:
        Set<Integer> numSet1 = new HashSet<>();
        numSet1.add(1);
        numSet1.add(2);
        numSet1.add(3);

        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(2);
        numSet2.add(3);
        numSet2.add(4);

        numSet1.retainAll(numSet2);
        System.out.println("Common integer elements: " + numSet1);

    }
}
