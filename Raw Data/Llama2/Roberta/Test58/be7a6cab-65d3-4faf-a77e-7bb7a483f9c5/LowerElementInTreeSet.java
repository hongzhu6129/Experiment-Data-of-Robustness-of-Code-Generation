import java.util.TreeSet;

public class LowerElementInTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the lower value for
        int element = 35;

        // Get the element lower than the given element
        Integer lowerElement = treeSet.lower(element);

        // Print the lower element
        if (lowerElement != null) {
            System.out.println("Lower element of " + element + ": " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }


        // Another example with no lower element
         element = 10;
         lowerElement = treeSet.lower(element);

        if (lowerElement != null) {
            System.out.println("Lower element of " + element + ": " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }
    }
}
