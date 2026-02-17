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

        // Element to search for
        int element = 35;

        // Get the element less than or equal to the given element
        Integer floorElement = treeSet.floor(element);

        // Print the result
        if (floorElement != null) {
            System.out.println("The element less than or equal to " + element + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }


        // Example with different element (demonstrates edge case)
        element = 5;
        floorElement = treeSet.floor(element);

         if (floorElement != null) {
            System.out.println("The element less than or equal to " + element + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }


        // Example with an element present in the set
        element = 30;
        floorElement = treeSet.floor(element);

         if (floorElement != null) {
            System.out.println("The element less than or equal to " + element + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }
    }
}
