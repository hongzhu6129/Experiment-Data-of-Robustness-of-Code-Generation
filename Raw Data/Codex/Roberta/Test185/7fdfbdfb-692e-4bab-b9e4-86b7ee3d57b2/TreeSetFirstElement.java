import java.util.TreeSet;

public class TreeSetFirstElement {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        // Check if the TreeSet is empty
        if (treeSet.isEmpty()) {
            System.out.println("TreeSet is empty.");
            return; // Exit if the TreeSet is empty
        }


        // Retrieve the first element (smallest)
        Integer firstElement = treeSet.first();

        // Remove the first element
        treeSet.remove(firstElement);

        // Print the retrieved first element and the updated TreeSet
        System.out.println("Retrieved and removed first element: " + firstElement);
        System.out.println("Updated TreeSet: " + treeSet);
    }
}
