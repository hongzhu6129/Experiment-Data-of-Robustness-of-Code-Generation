import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the lower value for
        int element = 35;

        // Get the element in the TreeSet that has a lower value than the given element
        Integer lowerElement = treeSet.lower(element);

        // Print the results
        System.out.println("TreeSet: " + treeSet);
        System.out.println("Element: " + element);

        if (lowerElement != null) {
            System.out.println("Lower element: " + lowerElement);
        } else {
            System.out.println("No lower element found.");
        }


        //More examples for demonstration:

        element = 15;
        lowerElement = treeSet.lower(element);
        System.out.println("\nElement: " + element);
        if (lowerElement != null) {
            System.out.println("Lower element: " + lowerElement);
        } else {
            System.out.println("No lower element found."); //This will print because 10 is the smallest
        }



        element = 60;
        lowerElement = treeSet.lower(element);
        System.out.println("\nElement: " + element);
        if (lowerElement != null) {
            System.out.println("Lower element: " + lowerElement); // This will print 50
        } else {
            System.out.println("No lower element found."); 
        }


         //Example with strings
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String strElement = "grape";
        String lowerString = stringTreeSet.lower(strElement);

        System.out.println("\nString TreeSet: " + stringTreeSet);
        System.out.println("String Element: " + strElement);
        if(lowerString != null) {
            System.out.println("Lower string: " + lowerString); // Output: orange
        } else {
            System.out.println("No lower string found.");
        }

    }
}
