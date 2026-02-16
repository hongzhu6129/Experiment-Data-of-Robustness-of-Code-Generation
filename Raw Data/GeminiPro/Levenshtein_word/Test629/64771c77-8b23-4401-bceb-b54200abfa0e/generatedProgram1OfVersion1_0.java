import java.util.TreeSet;

public class RemoveFromTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        // Element to be removed
        int elementToRemove = 15;

        System.out.println("Original TreeSet: " + numbers);

        // Remove the element
        boolean removed = numbers.remove(elementToRemove);

        if (removed) {
            System.out.println("TreeSet after removing " + elementToRemove + ": " + numbers);
        } else {
            System.out.println(elementToRemove + " not found in the TreeSet.");
        }


        // Example with a non-existent element
        elementToRemove = 100; // Element not present
        removed = numbers.remove(elementToRemove);

        if (removed) {
            System.out.println("TreeSet after removing " + elementToRemove + ": " + numbers);
        } else {
            System.out.println(elementToRemove + " not found in the TreeSet.");
        }
    }
}
