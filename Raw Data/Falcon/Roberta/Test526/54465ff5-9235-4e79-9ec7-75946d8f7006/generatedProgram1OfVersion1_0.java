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

        // Print the result
        if (floor != null) {
            System.out.println("Floor of " + element + ": " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }


        //More examples
        element = 25;
        floor = treeSet.floor(element);
         if (floor != null) {
            System.out.println("Floor of " + element + ": " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }

        element = 5;
        floor = treeSet.floor(element);
        if (floor != null) {
            System.out.println("Floor of " + element + ": " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }

         element = 50;
        floor = treeSet.floor(element);
        if (floor != null) {
            System.out.println("Floor of " + element + ": " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }

         element = 55;
        floor = treeSet.floor(element);
        if (floor != null) {
            System.out.println("Floor of " + element + ": " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found.");
        }
    }
}
