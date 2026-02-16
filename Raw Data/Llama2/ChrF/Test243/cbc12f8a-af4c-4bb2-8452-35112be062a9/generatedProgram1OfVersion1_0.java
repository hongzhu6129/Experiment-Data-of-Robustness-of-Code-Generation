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


        //Demonstrate that changes in one view reflect in the other (important!)
        reverseTreeSet.add(30); //Add to the reversed view
        System.out.println("Original TreeSet after adding to reverse: " + treeSet);

        treeSet.remove(15); //Remove from the original
        System.out.println("Reversed TreeSet after removing from original: " + reverseTreeSet);


    }
}
