import java.util.TreeSet;

public class TreeSetFloorExample {

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

        // Get the floor of the element
        Integer floor = treeSet.floor(element);

        // Print the floor element
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }


        // Additional example with a different element:
        element = 20; // Element present in the set.
        floor = treeSet.floor(element);
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }



        // Another example, showing what happens when the element is smaller than anything in the set
        element = 5; // Element smaller than any element in the set.
        floor = treeSet.floor(element);
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }
    }
}
