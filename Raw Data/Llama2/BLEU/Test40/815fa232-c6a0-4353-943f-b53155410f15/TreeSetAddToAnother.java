import java.util.TreeSet;

public class TreeSetAddToAnother {

    public static void main(String[] args) {

        // Create the source TreeSet
        TreeSet<String> sourceTreeSet = new TreeSet<>();
        sourceTreeSet.add("Apple");
        sourceTreeSet.add("Banana");
        sourceTreeSet.add("Orange");
        sourceTreeSet.add("Grape");

        // Create the destination TreeSet
        TreeSet<String> destinationTreeSet = new TreeSet<>();
        destinationTreeSet.add("Red");
        destinationTreeSet.add("Green");
        destinationTreeSet.add("Blue");


        System.out.println("Initial Source TreeSet: " + sourceTreeSet);
        System.out.println("Initial Destination TreeSet: " + destinationTreeSet);

        // Add all elements from the source TreeSet to the destination TreeSet
        destinationTreeSet.addAll(sourceTreeSet);


        System.out.println("Final Destination TreeSet after adding all elements: " + destinationTreeSet);


        // Example with Integer TreeSets
        TreeSet<Integer> sourceNumbers = new TreeSet<>();
        sourceNumbers.add(5);
        sourceNumbers.add(2);
        sourceNumbers.add(8);
        sourceNumbers.add(1);

        TreeSet<Integer> destinationNumbers = new TreeSet<>();
        destinationNumbers.add(10);
        destinationNumbers.add(3);
        destinationNumbers.add(7);


        System.out.println("\nInitial Source TreeSet (Integers): " + sourceNumbers);
        System.out.println("Initial Destination TreeSet (Integers): " + destinationNumbers);

        destinationNumbers.addAll(sourceNumbers);

        System.out.println("Final Destination TreeSet (Integers) after adding all elements: " + destinationNumbers);


        //Important Note on Ordering: TreeSets automatically maintain elements in sorted order according to their natural ordering (or a provided Comparator).
        //When you add elements from one TreeSet to another, the resulting TreeSet will contain all the unique elements from both sets, sorted according to their natural order.

    }
}
