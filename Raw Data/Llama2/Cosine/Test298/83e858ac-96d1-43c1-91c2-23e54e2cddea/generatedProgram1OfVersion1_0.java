import java.util.TreeSet;

public class TreeSetCeiling {

    public static void main(String[] args) {
        // Create a TreeSet of Integer
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to search for
        int searchElement1 = 25;
        int searchElement2 = 60; // Test with an element greater than all elements in the set
        int searchElement3 = 20;  // Test with an element already present

        // Get the element greater than or equal to the search element
        Integer ceiling1 = treeSet.ceiling(searchElement1);
        Integer ceiling2 = treeSet.ceiling(searchElement2);
        Integer ceiling3 = treeSet.ceiling(searchElement3);

        // Print the results
        if (ceiling1 != null) {
            System.out.println("Ceiling of " + searchElement1 + ": " + ceiling1);
        } else {
            System.out.println("No element greater than or equal to " + searchElement1 + " found.");
        }
        
        if (ceiling2 != null) {
            System.out.println("Ceiling of " + searchElement2 + ": " + ceiling2);
        } else {
            System.out.println("No element greater than or equal to " + searchElement2 + " found.");
        }

        if (ceiling3 != null) {
            System.out.println("Ceiling of " + searchElement3 + ": " + ceiling3);
        } else {
            System.out.println("No element greater than or equal to " + searchElement3 + " found.");
        }

        // Demonstrating with other data types (e.g., String):
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String searchString = "apricot";
        String stringCeiling = stringTreeSet.ceiling(searchString);

        if(stringCeiling != null) {
            System.out.println("Ceiling of " + searchString + ": " + stringCeiling);
        } else {
            System.out.println("No element greater than or equal to " + searchString + " found.");
        }
    }
}
