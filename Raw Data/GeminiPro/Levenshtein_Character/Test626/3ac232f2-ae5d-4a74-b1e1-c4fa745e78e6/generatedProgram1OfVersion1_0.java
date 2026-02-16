import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some Integer values.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find the lower value for.
        Integer element = 35;

        // Get the element with the lower value using lower().
        Integer lowerElement = treeSet.lower(element);

        // Print the result (or null if no lower element exists).
        if (lowerElement != null) {
            System.out.println("Lower element of " + element + " is: " + lowerElement);
        } else {
            System.out.println("No lower element found for " + element);
        }


        // Example with a different element:
        element = 15;
        lowerElement = treeSet.lower(element);
        if (lowerElement != null) {
            System.out.println("Lower element of " + element + " is: " + lowerElement);
        } else {
            System.out.println("No lower element found for " + element);
        }


        // Example with an element already in the set:
         element = 20;
        lowerElement = treeSet.lower(element);
        if (lowerElement != null) {
            System.out.println("Lower element of " + element + " is: " + lowerElement);
        } else {
            System.out.println("No lower element found for " + element);
        }


          // Example with the smallest element:
         element = 10;
        lowerElement = treeSet.lower(element);
        if (lowerElement != null) {
            System.out.println("Lower element of " + element + " is: " + lowerElement);
        } else {
            System.out.println("No lower element found for " + element);
        }        
    }
}
