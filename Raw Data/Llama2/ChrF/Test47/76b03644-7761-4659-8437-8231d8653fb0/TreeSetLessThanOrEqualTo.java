import java.util.TreeSet;

public class TreeSetLessThanOrEqualTo {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find less than or equal to
        int element = 35;

        // Get the element less than or equal to the given element
        Integer lessThanOrEqualToElement = treeSet.floor(element);


        // Print the result
        if (lessThanOrEqualToElement != null) {
            System.out.println("Element less than or equal to " + element + ": " + lessThanOrEqualToElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }


        // Another Example:
        element = 60; // Greater than any element in the set.
        lessThanOrEqualToElement = treeSet.floor(element);
         if (lessThanOrEqualToElement != null) {
            System.out.println("Element less than or equal to " + element + ": " + lessThanOrEqualToElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }


        // Another Example:
        element = 5; // Less than any element in the set.
        lessThanOrEqualToElement = treeSet.floor(element);
         if (lessThanOrEqualToElement != null) {
            System.out.println("Element less than or equal to " + element + ": " + lessThanOrEqualToElement);
        } else {
            System.out.println("No element found less than or equal to " + element);
        }
    }
}
