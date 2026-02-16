import java.util.TreeSet;

public class TreeSetFloor {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the floor of
        int element = 35;

        // Get the element less than or equal to the given element (floor)
        Integer floor = treeSet.floor(element);

        // Print the floor element
        if (floor != null) {
            System.out.println("Floor of " + element + " is: " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }


        //Example with a String TreeSet
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String searchString = "cherry";
        String floorString = stringTreeSet.floor(searchString);

        if (floorString != null) {
            System.out.println("Floor of \"" + searchString + "\" is: \"" + floorString + "\"");
        } else {
            System.out.println("No element less than or equal to \"" + searchString + "\" found in the TreeSet.");

        }

          // Example demonstrating edge case (searching for an element smaller than the smallest element)
        int elementSmallerThanSmallest = 5;  // Smaller than the smallest element (10)
        Integer floorSmaller = treeSet.floor(elementSmallerThanSmallest);

        if (floorSmaller != null) {
            System.out.println("Floor of " + elementSmallerThanSmallest + " is: " + floorSmaller);
        } else {
            System.out.println("No element less than or equal to " + elementSmallerThanSmallest + " found in the TreeSet.");
        }


    }
}
