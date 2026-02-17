import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some sample data
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // The element for which we want to find the lower value
        Integer givenElement = 40;

        // Get the element with a lower value than the given element
        Integer lowerElement = treeSet.lower(givenElement);

        // Print the lower element (or null if no lower element exists)
        if (lowerElement != null) {
            System.out.println("The element lower than " + givenElement + " is: " + lowerElement);
        } else {
            System.out.println("There is no element lower than " + givenElement + " in the TreeSet.");
        }



        // Example with a String TreeSet:
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String givenString = "orange";
        String lowerString = stringTreeSet.lower(givenString);

        if (lowerString != null) {
            System.out.println("The string lower than " + givenString + " is: " + lowerString);
        } else {
            System.out.println("There is no string lower than " + givenString + " in the TreeSet.");
        }

         // Example demonstrating null if no lower element exists
         givenElement = 10;  // Smallest element
         lowerElement = treeSet.lower(givenElement);
        if (lowerElement != null) {
            System.out.println("The element lower than " + givenElement + " is: " + lowerElement);
        } else {
            System.out.println("There is no element lower than " + givenElement + " in the TreeSet."); // This will be printed
        }


    }
}
