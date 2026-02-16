import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {

        // Create a TreeSet and populate it with some Integer values
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the lower value for
        Integer element = 35;

        // Get the element in the TreeSet with a lower value than 'element'
        Integer lowerElement = treeSet.lower(element);

        // Print the results
        System.out.println("TreeSet: " + treeSet);
        System.out.println("Element: " + element);

        if (lowerElement != null) {
            System.out.println("Lower element: " + lowerElement);
        } else {
            System.out.println("No lower element found.");
        }



        // Another example with no lower element
        element = 10;  // Smallest element in the set
        lowerElement = treeSet.lower(element);

        System.out.println("\nTreeSet: " + treeSet);
        System.out.println("Element: " + element);

        if (lowerElement != null) {
            System.out.println("Lower element: " + lowerElement);
        } else {
            System.out.println("No lower element found."); //This will be printed.
        }



        //Example with String TreeSet
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String elementString = "mango";
        String lowerString = stringTreeSet.lower(elementString);

         System.out.println("\nTreeSet: " + stringTreeSet);
        System.out.println("Element: " + elementString);

        if (lowerString != null) {
            System.out.println("Lower element: " + lowerString);
        } else {
            System.out.println("No lower element found.");
        }


    }
}
