import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some data
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the lower value for
        int element = 35;

        // Get the element with the lower value
        Integer lower = treeSet.lower(element);

        // Print the result
        if (lower != null) {
            System.out.println("The element lower than " + element + " is: " + lower);
        } else {
            System.out.println("No element found lower than " + element);
        }


        // Another example with a String TreeSet
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String strElement = "mango";

        String lowerStr = stringTreeSet.lower(strElement);

        if (lowerStr != null) {
            System.out.println("The element lower than " + strElement + " is: " + lowerStr);
        } else {
            System.out.println("No element found lower than " + strElement);
        }



         // Example demonstrating the edge case when the element is the smallest
        int smallestElement = 10; 
        Integer lowerSmallest = treeSet.lower(smallestElement);
        if (lowerSmallest != null) {
            System.out.println("The element lower than " + smallestElement + " is: " + lowerSmallest);
        } else {
            System.out.println("No element found lower than " + smallestElement); // This will be printed
        }
    }
}
