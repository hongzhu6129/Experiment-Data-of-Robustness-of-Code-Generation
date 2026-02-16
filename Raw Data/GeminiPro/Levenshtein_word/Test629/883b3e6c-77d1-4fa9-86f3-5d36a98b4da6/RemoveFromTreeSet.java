import java.util.TreeSet;

public class RemoveFromTreeSet {

    public static void main(String[] args) {

        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original TreeSet: " + numbers);

        // Remove an element using the remove() method
        int elementToRemove = 30;
        boolean removed = numbers.remove(elementToRemove);

        if (removed) {
            System.out.println(elementToRemove + " removed successfully.");
        } else {
            System.out.println(elementToRemove + " not found in the TreeSet.");
        }

        System.out.println("TreeSet after removal: " + numbers);


        // Example removing an element not present
        elementToRemove = 15; // Not in the set
        removed = numbers.remove(elementToRemove);

        if (removed) {
            System.out.println(elementToRemove + " removed successfully.");
        } else {
            System.out.println(elementToRemove + " not found in the TreeSet.");
        }

        System.out.println("TreeSet after second removal attempt: " + numbers);


        // Example using removeIf (Java 8 and later)  to remove elements based on a condition
        //  Remove all even numbers
        numbers.removeIf(number -> number % 2 == 0);  // Lambda expression

        System.out.println("TreeSet after removing even numbers: " + numbers);


        // Clearing the entire TreeSet
        numbers.clear();
        System.out.println("TreeSet after clearing: " + numbers);



    }
}
