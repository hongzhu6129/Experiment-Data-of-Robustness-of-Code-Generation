import java.util.TreeSet;

public class RemoveLastTreeSetElement {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);


        if (!treeSet.isEmpty()) { // Check if the TreeSet is not empty before attempting removal.
            // Retrieve and remove the last element
            Integer lastElement = treeSet.pollLast();


            // Print the removed element (if it exists)
            if (lastElement != null) {
                System.out.println("Removed last element: " + lastElement);
            }

            // Print the updated TreeSet
            System.out.println("Updated TreeSet: " + treeSet);

        } else {
            System.out.println("TreeSet is empty. No element to remove.");
        }

    }
}
