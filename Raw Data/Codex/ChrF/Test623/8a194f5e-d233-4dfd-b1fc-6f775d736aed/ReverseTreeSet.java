import java.util.TreeSet;
import java.util.NavigableSet;

public class ReverseTreeSet {

    public static void main(String[] args) {

        // Create a TreeSet (naturally sorted in ascending order)
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        System.out.println("Original TreeSet (ascending order): " + treeSet);


        // Method 1: Using descendingSet() for a reverse view
        NavigableSet<Integer> reverseTreeSet = treeSet.descendingSet(); 

        System.out.println("Reversed TreeSet (descending order - view): " + reverseTreeSet);

        // Modification to the reverse view affects the original TreeSet.
        reverseTreeSet.add(7); // Add 7 to both
        System.out.println("Original TreeSet after modification through reverse view: " + treeSet);



        // Method 2:  Iterating in reverse using descendingIterator()

        System.out.print("Reversed TreeSet (descending iteration): ");
        var descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();  // Newline


         // Illustrating the 'view' concept:
        reverseTreeSet.remove(9); // Remove 9 from both!
        System.out.println("Original TreeSet after removal through reverse view: " + treeSet);
    }
}
