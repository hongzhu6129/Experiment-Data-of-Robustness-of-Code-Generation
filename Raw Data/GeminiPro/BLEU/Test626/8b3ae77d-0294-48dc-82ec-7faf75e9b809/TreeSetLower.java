import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some values
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Element to find a lower value for
        Integer element = 40;


        // Get the element lower than the given element
        Integer lowerElement = treeSet.lower(element);


        // Print the result
        if (lowerElement != null) {
            System.out.println("The element lower than " + element + " is: " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }


        // Example with a different element
        element = 15; //An element not in the set
        lowerElement = treeSet.lower(element);

        if (lowerElement != null) {
            System.out.println("The element lower than " + element + " is: " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }



         // Example with the smallest element
        element = 10; 
        lowerElement = treeSet.lower(element);

        if (lowerElement != null) {
            System.out.println("The element lower than " + element + " is: " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }
    }
}
