import java.util.TreeSet;

public class TreeSetGreaterOrEqual {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
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
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found.");
        }


        // Example with strings
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("cherry");
        stringTreeSet.add("date");

        String searchString = "blueberry";
        String greaterOrEqualString = stringTreeSet.ceiling(searchString);

         if (greaterOrEqualString != null) {
            System.out.println("String greater than or equal to " + searchString + ": " + greaterOrEqualString);
        } else {
            System.out.println("No string greater than or equal to " + searchString + " found.");
        }
    }
}
