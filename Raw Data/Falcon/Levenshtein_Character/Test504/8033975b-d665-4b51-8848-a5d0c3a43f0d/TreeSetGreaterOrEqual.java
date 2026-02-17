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
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element found greater than or equal to " + element);
        }


        // Another example with a String TreeSet
         TreeSet<String> stringTreeSet = new TreeSet<>();
         stringTreeSet.add("apple");
         stringTreeSet.add("banana");
         stringTreeSet.add("orange");
         stringTreeSet.add("grape");

         String searchString = "mango";
         String greaterOrEqualString = stringTreeSet.ceiling(searchString);


         if (greaterOrEqualString != null) {
             System.out.println("The string greater than or equal to " + searchString + " is: " + greaterOrEqualString);
         } else {
             System.out.println("No string found greater than or equal to " + searchString); // Output: orange
         }
    }
}
