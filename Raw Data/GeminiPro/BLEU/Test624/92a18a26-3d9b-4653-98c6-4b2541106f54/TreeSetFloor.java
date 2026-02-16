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

        // Example usage: Find the element less than or equal to 35
        Integer element = 35;
        Integer floorElement = treeSet.floor(element);

        if (floorElement != null) {
            System.out.println("The element less than or equal to " + element + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }


        // Another example: Find element less than or equal to 15
        element = 15;
        floorElement = treeSet.floor(element);

        if (floorElement != null) {
            System.out.println("The element less than or equal to " + element + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }


         // Example with a value already in the set
        element = 20;
        floorElement = treeSet.floor(element);

        if (floorElement != null) {
            System.out.println("The element less than or equal to " + element + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }



        // Example with a value smaller than the smallest element in the set
        element = 5;
        floorElement = treeSet.floor(element);

        if (floorElement != null) {
            System.out.println("The element less than or equal to " + element + " is: " + floorElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }
    }
}
