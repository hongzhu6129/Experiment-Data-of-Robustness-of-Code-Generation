import java.util.TreeSet;

public class TreeSetSize {

    public static void main(String[] args) {

        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grape");
        treeSet.add("Mango");


        // Get the number of elements in the TreeSet using size()
        int size = treeSet.size();

        // Print the size
        System.out.println("The number of elements in the TreeSet is: " + size); 
    }
}
