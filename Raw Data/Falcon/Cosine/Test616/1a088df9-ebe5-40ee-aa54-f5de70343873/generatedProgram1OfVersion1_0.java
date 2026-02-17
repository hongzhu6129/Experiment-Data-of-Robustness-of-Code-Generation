import java.util.TreeSet;

public class TreeSetGreaterOrEqual {

    public static void main(String[] args) {
        // Create a TreeSet of Integer
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to search for
        int element = 25;

        // Get the element greater than or equal to the given element
        Integer greaterOrEqualElement = treeSet.ceiling(element);

        // Print the result
        if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }


        // Another example with element present in the set.
        element = 30;
        greaterOrEqualElement = treeSet.ceiling(element);
         if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }


        // Example with the element smaller than the smallest element in the set
        element = 5;
        greaterOrEqualElement = treeSet.ceiling(element);
         if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }


        // Example with element larger than the largest element
        element = 60;
        greaterOrEqualElement = treeSet.ceiling(element);
         if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }
    }
}
