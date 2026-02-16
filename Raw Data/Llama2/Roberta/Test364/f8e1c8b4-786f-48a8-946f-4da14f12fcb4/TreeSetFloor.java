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

        // Element to find the floor of
        int element = 35;

        // Get the element less than or equal to the given element
        Integer floor = treeSet.floor(element);

        // Print the result
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }


        // Test cases with different elements
        element = 15;
        floor = treeSet.floor(element);
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }

        element = 5;
        floor = treeSet.floor(element);
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }

         element = 50;
        floor = treeSet.floor(element);
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("No element less than or equal to " + element + " found in the TreeSet.");
        }

        // Example with a TreeSet of Strings
         TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");
        stringTreeSet.add("grape");

        String strElement = "mango";
        String strFloor = stringTreeSet.floor(strElement);

        if (strFloor != null) {
            System.out.println("The floor of " + strElement + " is: " + strFloor);
        } else {
            System.out.println("No element less than or equal to " + strElement + " found in the TreeSet.");
        }


    }
}
