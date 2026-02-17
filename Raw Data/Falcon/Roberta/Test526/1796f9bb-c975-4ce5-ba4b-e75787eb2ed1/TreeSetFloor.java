import java.util.TreeSet;

public class TreeSetFloor {

    public static void main(String[] args) {
        // Create a TreeSet and add some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the floor (greatest element less than or equal to)
        int element = 35;

        // Get the floor element using floor()
        Integer floorElement = treeSet.floor(element);

        // Print the floor element or a message if it doesn't exist
        if (floorElement != null) {
            System.out.println("Floor of " + element + " is: " + floorElement);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }



        // Example with strings:
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String targetString = "cherry";

        String floorString = stringTreeSet.floor(targetString);


        if (floorString != null) {
            System.out.println("Floor of " + targetString + " is: " + floorString);  // Output: banana
        } else {
            System.out.println("No element less than or equal to " + targetString + " found in the TreeSet.");
        }


         targetString = "zebra";
         floorString = stringTreeSet.floor(targetString); // orange


        if (floorString != null) {
            System.out.println("Floor of " + targetString + " is: " + floorString);  // Output: orange
        } else {
            System.out.println("No element less than or equal to " + targetString + " found in the TreeSet.");
        }



    }
}
