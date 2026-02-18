import java.util.TreeSet;

public class TreeSetGreaterOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int element = 25;

        Integer greaterOrEqualElement = treeSet.ceiling(element);


        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }


        // Another example with String
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");
        stringTreeSet.add("grape");

        String searchString = "banana";


        String greaterOrEqualString = stringTreeSet.ceiling(searchString);

        if (greaterOrEqualString != null) {
            System.out.println("String greater than or equal to \"" + searchString + "\": \"" + greaterOrEqualString + "\"");
        } else {
            System.out.println("No String greater than or equal to \"" + searchString + "\" found in the TreeSet.");
        }


         searchString = "apricot";  //Demonstrating an element not present and smaller than some elements

        greaterOrEqualString = stringTreeSet.ceiling(searchString);

        if (greaterOrEqualString != null) {
            System.out.println("String greater than or equal to \"" + searchString + "\": \"" + greaterOrEqualString + "\"");
        } else {
            System.out.println("No String greater than or equal to \"" + searchString + "\" found in the TreeSet.");
        }
    }
}
