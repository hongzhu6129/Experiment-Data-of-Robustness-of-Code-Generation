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

        // Element to find the greater or equal element for
        int element = 25;

        // Get the element greater than or equal to the given element
        Integer greaterOrEqualElement = treeSet.ceiling(element);


        // Print the result.  Handle the case where no such element exists
        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }

         // Example with an element that exists in the set:
        element = 30;
        greaterOrEqualElement = treeSet.ceiling(element);
        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }


        // Example to demonstrate when the element is smaller than the smallest element
        element = 5;
        greaterOrEqualElement = treeSet.ceiling(element);
        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }

    }
}
