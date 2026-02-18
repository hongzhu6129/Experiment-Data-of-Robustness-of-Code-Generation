import java.util.TreeSet;

public class TreeSetLastElement {

    public static void main(String[] args) {
        // Create a TreeSet of Integer
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Check if the TreeSet is empty
        if (numbers.isEmpty()) {
            System.out.println("TreeSet is empty.");
        } else {
            // Retrieve the last element using last()
            Integer lastElement = numbers.last();

            // Remove the last element using pollLast()
            Integer removedElement = numbers.pollLast(); // Removes and returns the last

            // Print the retrieved and removed elements
            System.out.println("Last element (retrieved): " + lastElement); // Output: 50
            System.out.println("Last element (removed): " + removedElement); // Output: 50

            // Print the updated TreeSet
            System.out.println("Updated TreeSet: " + numbers); // Output: [10, 20, 30, 40]



            // Example demonstrating handling when the TreeSet is empty *after* removal:

            // Remove all remaining elements
            numbers.clear(); // Or remove until empty using a loop and pollLast()

             if (numbers.isEmpty()) {
                 System.out.println("TreeSet is now empty. Cannot retrieve last element.");
             } else {
                 lastElement = numbers.pollLast();
                 System.out.println("Last element (after clearing): " + lastElement); 
             }
        }
    }
}
