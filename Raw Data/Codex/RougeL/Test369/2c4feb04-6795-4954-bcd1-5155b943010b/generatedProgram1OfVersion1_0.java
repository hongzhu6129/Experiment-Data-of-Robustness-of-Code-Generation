import java.util.HashSet;

public class CompareHashSets {

    public static void main(String[] args) {
        // Create two HashSets
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // Populate set1
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        // Populate set2
        set2.add("banana");
        set2.add("orange");
        set2.add("grape");


        // 1. Check if sets are equal (contain exactly the same elements)
        boolean isEqual = set1.equals(set2);
        System.out.println("Sets are equal: " + isEqual);


        // 2. Check if set1 is a subset of set2
        boolean isSubset = set2.containsAll(set1); 
        System.out.println("set1 is a subset of set2: " + isSubset);

        // 3. Check if set2 is a subset of set1
        isSubset = set1.containsAll(set2);
        System.out.println("set2 is a subset of set1: " + isSubset);


        // 4. Find the common elements (intersection)
        HashSet<String> intersection = new HashSet<>(set1); // Create a copy to avoid modifying original
        intersection.retainAll(set2);  // retainAll modifies the set to keep only the common elements
        System.out.println("Common elements (intersection): " + intersection);



        // 5. Find the union of the two sets
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of sets: " + union);


        // 6. Find the difference (elements in set1 but not in set2)
        HashSet<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Elements in set1 but not in set2: " + difference);



         //7. Find the difference (elements in set2 but not in set1)
        HashSet<String> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Elements in set2 but not in set1: " + difference2);




    }
}
