import java.util.TreeSet;

public class CompareTreeSets {

    public static void main(String[] args) {
        // Create two TreeSets
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("banana");
        set2.add("grape");
        set2.add("orange");


        // 1. Check if sets are equal (contain exactly the same elements)
        boolean isEqual = set1.equals(set2);
        System.out.println("Sets are equal: " + isEqual);


        // 2. Find common elements (intersection)
        TreeSet<String> intersection = new TreeSet<>(set1); // Create a copy to avoid modifying the original
        intersection.retainAll(set2); 
        System.out.println("Common elements: " + intersection);



        // 3. Find the union of the two sets
        TreeSet<String> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of sets: " + union);


        // 4. Find elements present in set1 but not in set2 (difference)
        TreeSet<String> difference1 = new TreeSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Elements in set1 but not in set2: " + difference1);



        // 5. Find elements present in set2 but not in set1 (difference)
         TreeSet<String> difference2 = new TreeSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Elements in set2 but not in set1: " + difference2);


        // 6. Check if set1 is a subset of set2
        boolean isSubset1 = set2.containsAll(set1);
        System.out.println("set1 is a subset of set2: " + isSubset1);

        // 7. Check if set2 is a subset of set1
        boolean isSubset2 = set1.containsAll(set2);
        System.out.println("set2 is a subset of set1: " + isSubset2);



    }
}
