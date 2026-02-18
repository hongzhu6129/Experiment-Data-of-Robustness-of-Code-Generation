import java.util.TreeSet;

public class LowerValueInTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet of Integer values
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element for which we want to find a lower value
        Integer givenElement = 40;

        // Get the element with a lower value using lower()
        Integer lowerValue = treeSet.lower(givenElement);

        // Print the lower value (or null if no lower value exists)
        if (lowerValue != null) {
            System.out.println("Lower value of " + givenElement + " is: " + lowerValue);
        } else {
            System.out.println("No lower value found for " + givenElement);
        }


        // Example with a String TreeSet
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");
        stringTreeSet.add("grape");

        String givenString = "orange";
        String lowerString = stringTreeSet.lower(givenString);

        if (lowerString != null) {
            System.out.println("Lower value of " + givenString + " is: " + lowerString);
        } else {
            System.out.println("No lower value found for " + givenString);
        }

         //Example demonstrating when no lower value exists
        givenElement = 10; // Smallest element
        lowerValue = treeSet.lower(givenElement);

        if (lowerValue != null) {
            System.out.println("Lower value of " + givenElement + " is: " + lowerValue);
        } else {
            System.out.println("No lower value found for " + givenElement);
        }
    }
}
