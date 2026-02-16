import java.util.TreeSet;

public class TreeSetLastElement {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Retrieve and remove the last element
        if (!treeSet.isEmpty()) { // Check if the TreeSet is empty to avoid exceptions
            Integer lastElement = treeSet.last();  // Retrieve the last element
            treeSet.remove(lastElement);           // Remove the last element
            System.out.println("Removed last element: " + lastElement);
        } else {
            System.out.println("TreeSet is empty."); 
        }


        // Print the updated TreeSet
        System.out.println("Updated TreeSet: " + treeSet);
    }
}
