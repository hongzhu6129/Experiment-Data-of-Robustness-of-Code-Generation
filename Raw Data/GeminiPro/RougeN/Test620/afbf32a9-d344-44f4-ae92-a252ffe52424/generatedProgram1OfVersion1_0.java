import java.util.TreeSet;

public class TreeSetSize {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Get the number of elements in the TreeSet
        int size = treeSet.size();

        // Print the size
        System.out.println("The number of elements in the TreeSet is: " + size); 
    }
}
