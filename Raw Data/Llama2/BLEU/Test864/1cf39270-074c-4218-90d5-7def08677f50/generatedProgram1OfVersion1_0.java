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

        // Get a reverse view of the TreeSet
        NavigableSet<Integer> reverseTreeSet = treeSet.descendingSet();

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Print the reversed TreeSet
        System.out.println("Reversed TreeSet: " + reverseTreeSet);


        //Demonstrate iteration in reverse order:
        System.out.print("Iterating in reverse: ");
        for (Integer value : reverseTreeSet) {
            System.out.print(value + " ");
        }
        System.out.println();


         // Another way to create the reverse view directly (useful for immutable sets)
        NavigableSet<Integer> anotherReverseView = new TreeSet<>(treeSet.descendingSet()); // Copies the elements
        System.out.println("Another reversed copy : " + anotherReverseView);



    }
}
