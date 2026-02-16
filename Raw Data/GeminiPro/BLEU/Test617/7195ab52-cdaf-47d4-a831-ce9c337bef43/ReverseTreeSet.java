import java.util.TreeSet;
import java.util.Iterator;

public class ReverseTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grape");
        treeSet.add("Mango");


        System.out.println("Original TreeSet: " + treeSet);

        // Get a reverse order iterator using descendingIterator()
        Iterator<String> reverseIterator = treeSet.descendingIterator();

        System.out.print("Reversed TreeSet: ");
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next());
            if (reverseIterator.hasNext()) { // Add a comma and space if not the last element
                System.out.print(", ");
            }
        }
        System.out.println(); // Newline for clarity

    }
}
