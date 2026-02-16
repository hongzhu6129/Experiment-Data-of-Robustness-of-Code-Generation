import java.util.TreeSet;

public class TreeSetGreaterOrEqual {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
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
            System.out.println("Element greater than or equal to " + searchElement + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element found greater than or equal to " + searchElement);
        }


        //Example 2: Search for an element that exists in the set.
        searchElement = 30;
        greaterOrEqualElement = numbers.ceiling(searchElement);
         if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + searchElement + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element found greater than or equal to " + searchElement);
        }

        //Example 3: search for an element smaller than the smallest in the set.
        searchElement = 5;
        greaterOrEqualElement = numbers.ceiling(searchElement);
         if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + searchElement + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element found greater than or equal to " + searchElement);
        }
    }
}
