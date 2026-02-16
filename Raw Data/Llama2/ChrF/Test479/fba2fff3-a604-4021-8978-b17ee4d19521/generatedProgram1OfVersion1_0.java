import java.util.TreeSet;

public class TreeSetFirstLast {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet (order will be maintained automatically)
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        // Get the first and last elements
        if (!treeSet.isEmpty()) { // Check if the TreeSet is empty to avoid exceptions
            Integer firstElement = treeSet.first();
            Integer lastElement = treeSet.last();

            // Print the first and last elements
            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);


        } else {
            System.out.println("TreeSet is empty.");
        }

        // Example with Strings
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("banana");
        stringTreeSet.add("apple");
        stringTreeSet.add("orange");

         if (!stringTreeSet.isEmpty()) {
             String firstString = stringTreeSet.first();
             String lastString = stringTreeSet.last();
             System.out.println("First string: " + firstString);
             System.out.println("Last string: " + lastString);
         } else {
            System.out.println("String TreeSet is empty.");
         }


    }
}
