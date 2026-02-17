import java.util.TreeSet;

public class TreeSetSize {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(30);

        // Get the number of elements in the TreeSet using the size() method
        int size = treeSet.size();

        // Print the size of the TreeSet
        System.out.println("The number of elements in the TreeSet is: " + size); 
    }
}
