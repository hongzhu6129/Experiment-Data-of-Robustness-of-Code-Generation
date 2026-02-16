import java.util.TreeSet;

public class TreeSetFloorExample {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the floor (greatest element less than or equal to)
        int element = 35;

        // Get the floor element using floor() method
        Integer floorElement = treeSet.floor(element);

        // Print the floor element
        if (floorElement != null) {
            System.out.println("Floor of " + element + ": " + floorElement);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }


        // Example 2: Element exists in the TreeSet
        element = 30;
        floorElement = treeSet.floor(element);

         if (floorElement != null) {
            System.out.println("Floor of " + element + ": " + floorElement);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }

        // Example 3: Element smaller than the smallest element
        element = 5;
        floorElement = treeSet.floor(element);

         if (floorElement != null) {
            System.out.println("Floor of " + element + ": " + floorElement);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }
    }
}
