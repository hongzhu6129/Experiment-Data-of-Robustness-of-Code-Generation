import java.util.TreeSet;

public class RemoveLastTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Retrieve and remove the last element
        if (!treeSet.isEmpty()) {  // Check if the TreeSet is empty before attempting removal
            Integer lastElement = treeSet.pollLast(); 
            System.out.println("Removed last element: " + lastElement);
        } else {
            System.out.println("TreeSet is empty. Cannot remove last element.");
        }


        // Print the TreeSet after removing the last element
        System.out.println("TreeSet after removal: " + treeSet);



    }
}
