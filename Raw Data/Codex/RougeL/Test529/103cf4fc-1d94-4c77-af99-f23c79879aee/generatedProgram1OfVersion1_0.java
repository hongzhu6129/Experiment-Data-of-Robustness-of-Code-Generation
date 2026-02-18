import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet and add some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the lower value of
        int element = 35;

        // Get the element with a lower value
        Integer lower = treeSet.lower(element);

        // Print the result
        if (lower != null) {
            System.out.println("The element lower than " + element + " is: " + lower);
        } else {
            System.out.println("No element found lower than " + element);
        }


        // Example with a different element
        element = 15;
        lower = treeSet.lower(element);
        if (lower != null) {
            System.out.println("The element lower than " + element + " is: " + lower);
        } else {
            System.out.println("No element found lower than " + element);
        }


        // Example with element smaller than the smallest in the set
        element = 5;
        lower = treeSet.lower(element);
        if (lower != null) {
            System.out.println("The element lower than " + element + " is: " + lower);
        } else {
            System.out.println("No element found lower than " + element);
        }
    }
}
