import java.util.TreeSet;

public class TreeSetGreaterOrEqual {

    public static void main(String[] args) {
        // Create a TreeSet of Integer
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Element to search for
        int searchElement = 25;

        // Find the element greater than or equal to searchElement
        Integer greaterOrEqualElement = numbers.ceiling(searchElement);

        // Print the result
        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + searchElement + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + searchElement + " found in the TreeSet.");
        }


        // Another Example demonstrating edge cases
        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);

        System.out.println("Greater than or equal to 5: " + numbers2.ceiling(5)); // Output: 10
        System.out.println("Greater than or equal to 10: " + numbers2.ceiling(10)); // Output: 10
        System.out.println("Greater than or equal to 25: " + numbers2.ceiling(25)); // Output: 30
        System.out.println("Greater than or equal to 35: " + numbers2.ceiling(35)); // Output: null


    }
}
