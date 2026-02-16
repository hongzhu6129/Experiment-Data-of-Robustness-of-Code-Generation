import java.util.TreeSet;

public class TreeSetFloor {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some integers
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Get the element less than or equal to 35
        Integer floorValue = treeSet.floor(35); 

        // Print the result
        if (floorValue != null) {
            System.out.println("The element less than or equal to 35 is: " + floorValue);
        } else {
            System.out.println("No element found less than or equal to 35.");
        }


        // Example with a value not in the set, and less than the smallest element
        floorValue = treeSet.floor(5);
        if (floorValue != null) {
            System.out.println("The element less than or equal to 5 is: " + floorValue);
        } else {
            System.out.println("No element found less than or equal to 5."); // This will be printed
        }


        // Example with a value greater than all elements in the set
        floorValue = treeSet.floor(60);
        if (floorValue != null) {
            System.out.println("The element less than or equal to 60 is: " + floorValue);  // Output: 50
        } else {
            System.out.println("No element found less than or equal to 60."); 
        }



         //Example with other data types (String)
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String floorString = stringTreeSet.floor("grape");
        if (floorString != null) {
            System.out.println("The string less than or equal to \"grape\" is: " + floorString); // Output: banana (lexicographically)
        } else {
            System.out.println("No string found less than or equal to \"grape\".");
        }


    }
}
