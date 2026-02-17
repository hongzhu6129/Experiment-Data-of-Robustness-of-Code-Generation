import java.util.TreeSet;

public class RemoveFirstElementTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet (which maintains elements in sorted order)
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(9);

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Retrieve and remove the first element (smallest element in a TreeSet)
        if (!treeSet.isEmpty()) {
            Integer firstElement = treeSet.pollFirst(); // Retrieves and removes
            System.out.println("Removed first element: " + firstElement);
            System.out.println("TreeSet after removal: " + treeSet);
        } else {
            System.out.println("TreeSet is empty.");
        }


        // Example with Strings (natural ordering)
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        System.out.println("\nOriginal String TreeSet: " + stringTreeSet);

        if (!stringTreeSet.isEmpty()) {
            String firstString = stringTreeSet.pollFirst();
            System.out.println("Removed first string: " + firstString);
            System.out.println("String TreeSet after removal: " + stringTreeSet);
        } else {
            System.out.println("String TreeSet is empty.");
        }

    }
}
