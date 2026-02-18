import java.util.TreeSet;

public class RemoveFirstTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + numbers);

        // Check if the TreeSet is empty
        if (!numbers.isEmpty()) {
            // Retrieve and remove the first element (smallest)
            Integer firstElement = numbers.pollFirst(); 

            // Print the removed element
            System.out.println("Removed first element: " + firstElement);

            // Print the updated TreeSet
            System.out.println("Updated TreeSet: " + numbers);
        } else {
            System.out.println("TreeSet is empty.");
        }
    }
}
