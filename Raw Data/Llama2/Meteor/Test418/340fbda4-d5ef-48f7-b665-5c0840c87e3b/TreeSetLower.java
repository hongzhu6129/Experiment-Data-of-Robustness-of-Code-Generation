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

        // Element to find the lower value for
        int element = 35;

        // Get the element with a lower value
        Integer lowerElement = treeSet.lower(element);

        // Print the result
        if (lowerElement != null) {
            System.out.println("Lower element of " + element + " is: " + lowerElement);
        } else {
            System.out.println("No lower element found for " + element);
        }


        // Example with String TreeSet
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String strElement = "grapefruit";

        String lowerString = stringTreeSet.lower(strElement);

         if (lowerString != null) {
            System.out.println("Lower element of " + strElement + " is: " + lowerString);
        } else {
            System.out.println("No lower element found for " + strElement);
        }


        //Edge case:  Searching for lower element than the smallest element
        lowerElement = treeSet.lower(10); // searching lower than the smallest (10)
         if (lowerElement != null) {
            System.out.println("Lower element of 10 is: " + lowerElement);
        } else {
            System.out.println("No lower element found for 10 ");
        }

        // Example with an empty TreeSet
        TreeSet<Integer> emptyTreeSet = new TreeSet<>();
        lowerElement = emptyTreeSet.lower(25);

        if (lowerElement != null) {
            System.out.println("Lower element of 25 is: " + lowerElement);
        } else {
            System.out.println("No lower element found for 25 in the empty TreeSet");
        }
    }
}
