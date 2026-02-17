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

        int givenElement = 35;

        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("Elements greater than or equal to " + givenElement + ": " + tailSet(treeSet, givenElement));


        givenElement = 20; // Example with element present in the set
        System.out.println("\nOriginal TreeSet: " + treeSet); // Show the original set again (unchanged from previous operations)
        System.out.println("Elements greater than or equal to " + givenElement + ": " + tailSet(treeSet, givenElement));

        givenElement = 60; // Example with element greater than all elements in the set

        System.out.println("\nOriginal TreeSet: " + treeSet);
        System.out.println("Elements greater than or equal to " + givenElement + ": " + tailSet(treeSet, givenElement));



    }

    public static <T> TreeSet<T> tailSet(TreeSet<T> set, T fromElement) {
        return new TreeSet<>(set.tailSet(fromElement)); // Create a copy to avoid modifying the original set
    }
}
