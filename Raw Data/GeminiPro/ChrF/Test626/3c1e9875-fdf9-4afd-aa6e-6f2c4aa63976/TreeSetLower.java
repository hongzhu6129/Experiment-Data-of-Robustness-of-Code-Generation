import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the lower value of
        int element = 35;

        // Get the element lower than the given element
        Integer lowerElement = treeSet.lower(element);

        // Print the result
        if (lowerElement != null) {
            System.out.println("Element lower than " + element + ": " + lowerElement);
        } else {
            System.out.println("No element lower than " + element + " found.");
        }


        // Example with String TreeSet
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String stringElement = "mango";
        String lowerStringElement = stringTreeSet.lower(stringElement);

        if(lowerStringElement != null) {
             System.out.println("String element lower than " + stringElement + ": " + lowerStringElement);
        } else {
            System.out.println("No string element lower than " + stringElement + " found.");
        }



        // Example demonstrating handling when the element is already the lowest.
         lowerElement = treeSet.lower(10);  // 10 is the smallest

        if (lowerElement != null) {
            System.out.println("Element lower than 10: " + lowerElement);
        } else {
            System.out.println("No element lower than 10 found."); //This will be printed
        }
    }
}
