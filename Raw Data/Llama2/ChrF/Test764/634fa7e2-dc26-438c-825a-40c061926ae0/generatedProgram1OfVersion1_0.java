import java.util.TreeSet;

public class RemoveFirstTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(80);
        treeSet.add(10);
        treeSet.add(30);


        if (!treeSet.isEmpty()) {
            // Retrieve the first element (lowest)
            Integer firstElement = treeSet.first();

            // Remove the first element
            treeSet.remove(firstElement);

            // Print the retrieved element
            System.out.println("Removed first element: " + firstElement);

            // Print the updated TreeSet
            System.out.println("Updated TreeSet: " + treeSet);
        } else {
            System.out.println("TreeSet is empty.");
        }
    }
}
