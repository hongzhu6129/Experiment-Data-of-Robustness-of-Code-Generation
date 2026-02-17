import java.util.TreeSet;

public class TreeSetFirstElement {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        // Retrieve and remove the first element
        if (!treeSet.isEmpty()) {  // Check if the TreeSet is empty before attempting removal
            Integer firstElement = treeSet.pollFirst();
            System.out.println("Removed first element: " + firstElement);

            System.out.println("Updated TreeSet: " + treeSet);
        } else {
            System.out.println("TreeSet is empty. No element to remove.");
        }

        // Example demonstrating behavior with an empty TreeSet
        TreeSet<String> emptyTreeSet = new TreeSet<>();
        String first = emptyTreeSet.pollFirst(); // Returns null if the set is empty.

        if(first == null) {
            System.out.println("TreeSet is empty. pollFirst() returned null.");
        }


    }
}
