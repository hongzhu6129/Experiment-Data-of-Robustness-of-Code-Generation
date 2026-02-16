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

        // Element to find the floor for
        int element = 35;

        // Get the element less than or equal to the specified element (floor)
        Integer floorElement = treeSet.floor(element);


        if (floorElement != null) {
            System.out.println("The floor element of " + element + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }



        // More examples:
        System.out.println("Floor of 15: " + treeSet.floor(15)); // Output: 10
        System.out.println("Floor of 20: " + treeSet.floor(20)); // Output: 20
        System.out.println("Floor of 55: " + treeSet.floor(55)); // Output: 50
        System.out.println("Floor of 5: " + treeSet.floor(5));  // Output: null (no smaller element)

    }
}
