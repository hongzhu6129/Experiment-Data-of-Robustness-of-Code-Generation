import java.util.HashSet;
import java.util.TreeSet;

public class CloneHashSetToTreeSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("grape");


        // Clone HashSet to TreeSet (maintains sorted order)
        TreeSet<String> treeSet = new TreeSet<>(hashSet); 

        // Print the TreeSet (demonstrating it's a separate copy and sorted)
        System.out.println("TreeSet: " + treeSet); 

        // Modify original HashSet (to show independence)
        hashSet.remove("banana");

        // Print both to confirm independence
        System.out.println("Original HashSet after modification: " + hashSet);
        System.out.println("TreeSet (unaffected): " + treeSet);



        //If you specifically mean a "multiplication set" as a set where you perform some multiplication operation, you would need to clarify what type of multiplication and how it relates to the elements of the original set. Here is a basic example (multiplying string lengths):
        TreeSet<Integer> multiplicationSet = new TreeSet<>();
        for(String s : hashSet) {
            multiplicationSet.add(s.length() * 2); // Example: Multiplying length by 2
        }
        System.out.println("Multiplication set (string lengths * 2): " + multiplicationSet);


    }
}
