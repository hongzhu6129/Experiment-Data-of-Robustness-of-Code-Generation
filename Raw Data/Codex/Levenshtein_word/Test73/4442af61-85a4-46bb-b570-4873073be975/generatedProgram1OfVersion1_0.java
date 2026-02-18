import java.util.TreeSet;

public class LowerValueInTreeSet {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        Integer element = 35;

        Integer lower = treeSet.lower(element);

        if (lower != null) {
            System.out.println("The element in the TreeSet lower than " + element + " is: " + lower);
        } else {
            System.out.println("No element found lower than " + element + " in the TreeSet.");
        }


        element = 10; // Test with the lowest value. No lower value should be found.
        lower = treeSet.lower(element);

        if (lower != null) {
            System.out.println("The element in the TreeSet lower than " + element + " is: " + lower);
        } else {
            System.out.println("No element found lower than " + element + " in the TreeSet.");
        }


        element = 60;  // Test with an element greater than any in the set.
        lower = treeSet.lower(element);

        if (lower != null) {
            System.out.println("The element in the TreeSet lower than " + element + " is: " + lower);
        } else {
            System.out.println("No element found lower than " + element + " in the TreeSet.");
        }
    }
}
