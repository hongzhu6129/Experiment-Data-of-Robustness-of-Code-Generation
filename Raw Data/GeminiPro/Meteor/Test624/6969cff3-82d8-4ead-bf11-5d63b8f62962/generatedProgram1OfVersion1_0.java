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


        // Additional examples for demonstration:
        System.out.println("Floor of 20: " + treeSet.floor(20)); // Output: 20
        System.out.println("Floor of 15: " + treeSet.floor(15)); // Output: 10
        System.out.println("Floor of 5: " + treeSet.floor(5));  // Output: null (no smaller element)
        System.out.println("Floor of 55: " + treeSet.floor(55)); // Output: 50 (largest element)


    }
}
