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

        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("Elements greater than or equal to " + element + ": " + tailSet(treeSet, element));


        element = 20; // Example with element present in the set

        System.out.println("\nOriginal TreeSet: " + treeSet); // Showing the original set again for clarity in multiple runs within main
        System.out.println("Elements greater than or equal to " + element + ": " + tailSet(treeSet, element));


        element = 60; // Example with element greater than any in the set

        System.out.println("\nOriginal TreeSet: " + treeSet);
        System.out.println("Elements greater than or equal to " + element + ": " + tailSet(treeSet, element));


        // Example with String TreeSet:
         TreeSet<String> stringTreeSet = new TreeSet<>();
         stringTreeSet.add("apple");
         stringTreeSet.add("banana");
         stringTreeSet.add("orange");
         stringTreeSet.add("grape");

         String strElement = "banana";
         System.out.println("\nOriginal String TreeSet: " + stringTreeSet);
         System.out.println("Elements greater than or equal to \"" + strElement + "\": " + tailSet(stringTreeSet, strElement));
    }



    private static <T> TreeSet<T> tailSet(TreeSet<T> set, T element) {
        // The method returns a view of the portion of this set whose elements are greater than or equal to fromElement.
        // Any modifications made to the set affect both the original set and the returned view.
        return new TreeSet<>(set.tailSet(element)); // Create a new set to avoid modifying the original set.
    }
}
