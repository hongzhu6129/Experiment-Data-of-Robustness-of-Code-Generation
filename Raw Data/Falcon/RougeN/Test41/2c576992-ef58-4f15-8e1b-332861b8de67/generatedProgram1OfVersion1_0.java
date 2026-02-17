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


        // Get the number of elements using the size() method
        int size = treeSet.size();

        // Print the size of the TreeSet
        System.out.println("The size of the TreeSet is: " + size);


        //Demonstrate that duplicates are not counted
        treeSet.add("Apple"); //Trying to add a duplicate
        size = treeSet.size(); //Get the new size

         System.out.println("The size of the TreeSet after adding a duplicate is: " + size); //Size remains the same



        //Demonstrate clearing all elements and resulting size

        treeSet.clear();
        size = treeSet.size();

        System.out.println("The size of the TreeSet after clearing all elements is: " + size); //Size is now 0


    }
}
