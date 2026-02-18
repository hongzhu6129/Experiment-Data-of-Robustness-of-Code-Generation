import java.util.TreeSet;

public class TreeSetFirstLast {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        // Check if the TreeSet is empty before getting elements
        if (!treeSet.isEmpty()) {
            // Get the first element (smallest)
            Integer firstElement = treeSet.first();
            System.out.println("First element: " + firstElement);


            // Get the last element (largest)
            Integer lastElement = treeSet.last();
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("TreeSet is empty.");
        }



        // Example with Strings:
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("cherry");

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
