import java.util.TreeSet;

public class CompareTreeSets {

    public static void main(String[] args) {

        // Create two TreeSets
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();

        // Populate set1
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");
        set1.add("grape");

        // Populate set2
        set2.add("banana");
        set2.add("orange");
        set2.add("kiwi");
        set2.add("mango");


        // 1. Check if sets are equal
        System.out.println("Are set1 and set2 equal? " + set1.equals(set2)); // Output: false (because they have different elements)


        // 2. Find common elements (intersection)
        TreeSet<String> intersection = new TreeSet<>(set1); // Create a copy of set1
        intersection.retainAll(set2); // retainAll modifies intersection to keep only elements present in both sets.
        System.out.println("Common elements: " + intersection); // Output: [banana, orange]



        // 3. Find the union of the two sets
        TreeSet<String> union = new TreeSet<>(set1);
        union.addAll(set2); // addAll adds all elements from set2 to union
        System.out.println("Union of sets: " + union); // Output: [apple, banana, grape, kiwi, mango, orange]



        // 4. Find elements present in set1 but not in set2 (difference)
        TreeSet<String> difference1 = new TreeSet<>(set1);
        difference1.removeAll(set2); //removeAll removes elements present in set2 from difference1
        System.out.println("Elements in set1 but not in set2: " + difference1); // Output: [apple, grape]


        // 5. Find elements present in set2 but not in set1 (difference)
        TreeSet<String> difference2 = new TreeSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Elements in set2 but not in set1: " + difference2); // Output: [kiwi, mango]




        // 6. Check if set1 is a subset of set2
        System.out.println("Is set1 a subset of set2? " + set2.containsAll(set1));  // Output: false


        // 7. Check if set2 is a superset of set1
        System.out.println("Is set2 a superset of set1? " + set2.containsAll(set1)); // Output: false


        //8. Size of the TreeSets
        System.out.println("Size of set1: " + set1.size());
        System.out.println("Size of set2: " + set2.size());


        //9. Check if a TreeSet is empty
        System.out.println("Is set1 empty? " + set1.isEmpty()); //false
        TreeSet<String> emptySet = new TreeSet<>();
        System.out.println("Is emptySet empty? " + emptySet.isEmpty()); //true


    }
}
