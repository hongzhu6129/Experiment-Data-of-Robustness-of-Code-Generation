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


        // Print the initial TreeSet
        System.out.println("Initial TreeSet: " + treeSet);

        // Check if the TreeSet is empty before attempting to retrieve or remove
        if (!treeSet.isEmpty()) {
            // Retrieve the first element (smallest)
            Integer firstElement = treeSet.first(); 
            System.out.println("First element: " + firstElement);


            // Remove the first element
             treeSet.remove(firstElement); // Or treeSet.pollFirst();
            System.out.println("TreeSet after removing first element: " + treeSet);

         } else {
            System.out.println("TreeSet is empty. Cannot retrieve or remove the first element.");
        }



        // Example demonstrating pollFirst() which retrieves *and* removes
        treeSet.add(1); // Adding back for demonstration
        System.out.println("TreeSet before pollFirst(): " + treeSet);
        Integer polledElement = treeSet.pollFirst();
        System.out.println("Polled element: " + polledElement);
        System.out.println("TreeSet after pollFirst(): " + treeSet);



        // Handling empty TreeSet with pollFirst() - returns null if empty
        treeSet.clear(); // Emptying for demonstration.
        Integer polledFromEmpty = treeSet.pollFirst();
        System.out.println("Polled from empty set: " + polledFromEmpty); // Output will be null


    }
}
