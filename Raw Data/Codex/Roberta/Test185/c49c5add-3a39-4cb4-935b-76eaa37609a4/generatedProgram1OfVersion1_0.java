import java.util.TreeSet;

public class RemoveFirstTreeSetElement {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet (they will be sorted automatically)
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);


        // Check if the TreeSet is empty before attempting to remove
        if (!treeSet.isEmpty()) {
            // Get and remove the first (lowest) element
            Integer firstElement = treeSet.pollFirst(); 

            // Print the removed element and the updated TreeSet
            System.out.println("Removed element: " + firstElement);
            System.out.println("Updated TreeSet: " + treeSet);
        } else {
            System.out.println("TreeSet is empty. Cannot remove an element.");
        }
    }
}
