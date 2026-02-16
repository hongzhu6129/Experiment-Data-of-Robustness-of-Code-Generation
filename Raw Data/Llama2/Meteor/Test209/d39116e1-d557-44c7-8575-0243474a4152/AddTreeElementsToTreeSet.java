import java.util.TreeSet;

public class AddTreeElementsToTreeSet {

    public static void main(String[] args) {
        // Create the source TreeSet (representing the "specified tree")
        TreeSet<Integer> sourceTree = new TreeSet<>();
        sourceTree.add(5);
        sourceTree.add(2);
        sourceTree.add(8);
        sourceTree.add(1);
        sourceTree.add(9);


        // Create the destination TreeSet (the one we'll add elements to)
        TreeSet<Integer> destinationTree = new TreeSet<>();
        destinationTree.add(10); // Add some initial elements (optional)
        destinationTree.add(3);

        // Add all elements from sourceTree to destinationTree
        destinationTree.addAll(sourceTree);


        // Print the resulting TreeSet
        System.out.println("Destination TreeSet after adding elements: " + destinationTree);


        // Example with a TreeSet of Strings
        TreeSet<String> stringSourceTree = new TreeSet<>();
        stringSourceTree.add("apple");
        stringSourceTree.add("banana");
        stringSourceTree.add("orange");

        TreeSet<String> stringDestinationTree = new TreeSet<>();
        stringDestinationTree.add("grape");

        stringDestinationTree.addAll(stringSourceTree);
        System.out.println("String Destination TreeSet after adding: " + stringDestinationTree);

    }
}
