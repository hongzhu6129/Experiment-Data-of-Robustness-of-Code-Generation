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

        // Get the element lower than the given element
        Integer lowerElement = treeSet.lower(element);

        // Print the result
        if (lowerElement != null) {
            System.out.println("The element lower than " + element + " is: " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }


        // Example with a different element
        element = 15;
        lowerElement = treeSet.lower(element);

        if (lowerElement != null) {
            System.out.println("The element lower than " + element + " is: " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }


        // Example with String TreeSet
         TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("grape");
        stringTreeSet.add("orange");

        String stringElement = "mango";
        String lowerString = stringTreeSet.lower(stringElement);

        if (lowerString != null) {
            System.out.println("The element lower than " + stringElement + " is: " + lowerString);
        } else {
            System.out.println("No element found lower than " + stringElement);
        }



        //Edge case: element is smallest in set
        element = 5;
        lowerElement = treeSet.lower(element);

        if (lowerElement != null) {
            System.out.println("The element lower than " + element + " is: " + lowerElement);
        } else {
            System.out.println("No element found lower than " + element);
        }
    }
}
