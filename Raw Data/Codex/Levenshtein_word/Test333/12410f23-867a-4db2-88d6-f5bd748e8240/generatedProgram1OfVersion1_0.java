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

        System.out.println("Original TreeSet: " + numbers);

        // Element to remove
        int elementToRemove = 30;

        // Remove the element
        boolean removed = numbers.remove(elementToRemove);

        if (removed) {
            System.out.println("Element " + elementToRemove + " removed successfully.");
        } else {
            System.out.println("Element " + elementToRemove + " not found in the TreeSet.");
        }


        System.out.println("TreeSet after removal: " + numbers);



         // Example demonstrating removing a non-existent element
        int nonExistentElement = 100; 
        boolean removed2 = numbers.remove(nonExistentElement);

        if (removed2) {
            System.out.println("Element " + nonExistentElement + " removed successfully.");
        } else {
            System.out.println("Element " + nonExistentElement + " not found in the TreeSet.");
        }

        System.out.println("TreeSet after attempting to remove non-existent element: " + numbers);


    }
}
