import java.util.TreeSet;

public class TreeSetGreaterOrEqual {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects
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


        // Another Example with Strings
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");
        stringTreeSet.add("grape");

        String searchString = "kiwi";
        String greaterOrEqualString = stringTreeSet.ceiling(searchString);

        if (greaterOrEqualString != null) {
            System.out.println("The string greater than or equal to \"" + searchString + "\" is: \"" + greaterOrEqualString +"\"");
        } else {
            System.out.println("No string greater than or equal to \"" + searchString + "\" found in the TreeSet.");

        }



        //Demonstrate behavior when element is present in the set:
         element = 30; // Element present in the TreeSet
         greaterOrEqualElement = treeSet.ceiling(element);

        if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }



         element = 60; // Element larger than any in the TreeSet
         greaterOrEqualElement = treeSet.ceiling(element);

        if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }

    }
}
