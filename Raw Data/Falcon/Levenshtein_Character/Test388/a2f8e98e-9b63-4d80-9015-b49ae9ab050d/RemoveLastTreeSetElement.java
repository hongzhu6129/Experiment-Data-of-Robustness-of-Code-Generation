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

        // Check if the TreeSet is empty
        if (treeSet.isEmpty()) {
            System.out.println("TreeSet is empty.");
            return;
        }


        // Retrieve and remove the last element.  Note: There's no direct method to get 
        // *and* remove the last.  We need to get the last, then remove it.
        Integer lastElement = treeSet.last(); 
        if(lastElement != null) { // Added a null check for extra safety.
            treeSet.remove(lastElement);

            System.out.println("Removed last element: " + lastElement);
            System.out.println("Updated TreeSet: " + treeSet);

        }


    }
}
