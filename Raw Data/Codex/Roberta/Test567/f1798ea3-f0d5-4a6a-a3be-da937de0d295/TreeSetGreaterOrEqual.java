import java.util.TreeSet;

public class TreeSetGreaterOrEqual {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Element to search for
        int searchElement = 25;

        // Get the element greater than or equal to the search element
        Integer greaterOrEqualElement = numbers.ceiling(searchElement);

        // Print the result
        if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + searchElement + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element found greater than or equal to " + searchElement);
        }


        //Another example with strings
        TreeSet<String> strings = new TreeSet<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");

        String searchString = "blueberry";

        String greaterOrEqualString = strings.ceiling(searchString);

         if (greaterOrEqualString != null) {
            System.out.println("The string greater than or equal to " + searchString + " is: " + greaterOrEqualString);
        } else {
            System.out.println("No string found greater than or equal to " + searchString);
        }

    }
}
