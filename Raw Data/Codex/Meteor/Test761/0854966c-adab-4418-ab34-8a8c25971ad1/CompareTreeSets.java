import java.util.TreeSet;

public class CompareTreeSets {

    public static void main(String[] args) {
        // Create two TreeSets
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        // Populate the sets with some sample data
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);


        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);
        set2.add(70);

        // 1. Check if the sets are equal (contain exactly the same elements)
        boolean isEqual = set1.equals(set2);
        System.out.println("Are sets equal? " + isEqual);


        // 2. Find the common elements (intersection)
        TreeSet<Integer> intersection = new TreeSet<>(set1); // Create a copy to avoid modifying the original
        intersection.retainAll(set2);
        System.out.println("Common elements (intersection): " + intersection);

        // 3. Find the union of the sets (all elements from both sets)
        TreeSet<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of sets: " + union);



        // 4. Find the difference between set1 and set2 (elements in set1 but not in set2)

        TreeSet<Integer> difference1 = new TreeSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Elements in set1 but not in set2: " + difference1);

        // 5. Find the difference between set2 and set1 (elements in set2 but not in set1)
        TreeSet<Integer> difference2 = new TreeSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Elements in set2 but not in set1: " + difference2);


        // 6. Check if set1 is a subset of set2
        boolean isSubset1 = set2.containsAll(set1);
        System.out.println("Is set1 a subset of set2? " + isSubset1);


        // 7. Check if set2 is a subset of set1
        boolean isSubset2 = set1.containsAll(set2);
        System.out.println("Is set2 a subset of set1? " + isSubset2);

      // 8. Size comparison
        System.out.println("Size of set1: " + set1.size());
        System.out.println("Size of set2: " + set2.size());


    }
}
