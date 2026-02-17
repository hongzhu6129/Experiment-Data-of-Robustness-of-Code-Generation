import java.util.TreeSet;

public class TreeSetSize {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(25);

        // Get the number of elements using the size() method
        int size = treeSet.size();

        // Print the size
        System.out.println("The size of the TreeSet is: " + size); 
    }
}
