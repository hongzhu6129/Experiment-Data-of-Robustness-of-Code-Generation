import java.util.TreeSet;

public class RemoveFromTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Element to remove
        int elementToRemove = 30;

        System.out.println("Original TreeSet: " + numbers);

        // Remove the element
        boolean removed = numbers.remove(elementToRemove);

        if (removed) {
            System.out.println("Element " + elementToRemove + " removed successfully.");
        } else {
            System.out.println("Element " + elementToRemove + " not found in the TreeSet.");
        }


        System.out.println("TreeSet after removal: " + numbers);


        // Example demonstrating removing an element not present
        int nonExistentElement = 15;
        boolean removedNonExistent = numbers.remove(nonExistentElement);

        if (removedNonExistent) {
             System.out.println("Element " + nonExistentElement + " removed successfully.");
        } else {
             System.out.println("Element " + nonExistentElement + " not found in the TreeSet.");
        }

         System.out.println("TreeSet after attempting to remove non-existent element: " + numbers);


    }
}
