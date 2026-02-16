import java.util.HashSet;
import java.util.Set;

public class CompareSets {

    public static void main(String[] args) {
        // Example sets
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


        // Find common elements (intersection)
        Set<String> commonElements = new HashSet<>(set1); // Create a copy to avoid modifying original set
        commonElements.retainAll(set2); // retainAll modifies the set to keep only the common elements.

        System.out.println("Common elements:");
        if (commonElements.isEmpty()) {
            System.out.println("None");
        } else {
            for (String element : commonElements) {
                System.out.println(element);
            }
        }


        //Other set operations if needed within main method
        //-----------------------------------------------

        // Union: all elements in both sets (no duplicates)
        /*Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("\nUnion:");
        System.out.println(union);*/



        // Difference (set1 - set2): elements in set1 but not in set2
        /*Set<String> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2); 
        System.out.println("\nDifference (set1 - set2):");
        System.out.println(difference1);*/

        // Difference (set2 - set1): elements in set2 but not in set1
        /*Set<String> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("\nDifference (set2 - set1):");
        System.out.println(difference2);*/


    }
}
