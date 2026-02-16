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


        if (!treeSet.isEmpty()) {
            // Retrieve the first element (lowest)
            Integer firstElement = treeSet.first();

            // Remove the first element
            treeSet.remove(firstElement);


            System.out.println("Removed first element: " + firstElement);
            System.out.println("Updated TreeSet: " + treeSet);
        } else {
            System.out.println("TreeSet is empty.");
        }
    }
}
