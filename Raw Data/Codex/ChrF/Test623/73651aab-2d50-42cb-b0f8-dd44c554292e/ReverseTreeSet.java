import java.util.TreeSet;
import java.util.NavigableSet;

public class ReverseTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(25);

        // Get a reverse order view using descendingSet()
        NavigableSet<Integer> reverseTreeSet = treeSet.descendingSet();

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Print the reversed TreeSet
        System.out.println("Reversed TreeSet: " + reverseTreeSet);


        // Demonstrating that changes in one view are reflected in the other
        reverseTreeSet.add(30);  // Adding to reverse view
        System.out.println("Original TreeSet after adding to reverse view: " + treeSet);

        treeSet.remove(15);      // Removing from original view
        System.out.println("Reversed TreeSet after removing from original view: " + reverseTreeSet);
    }
}
