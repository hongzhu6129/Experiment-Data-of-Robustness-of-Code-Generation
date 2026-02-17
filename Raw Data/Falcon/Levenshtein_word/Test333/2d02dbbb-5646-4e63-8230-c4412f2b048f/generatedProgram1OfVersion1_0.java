import java.util.TreeSet;

public class RemoveFromTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + numbers);

        // Element to remove
        int elementToRemove = 15;


        // Remove the element
        boolean removed = numbers.remove(elementToRemove);

        if (removed) {
            System.out.println("TreeSet after removing " + elementToRemove + ": " + numbers);
        } else {
            System.out.println(elementToRemove + " was not found in the TreeSet.");
        }


         //Example removing a non-existent element:
        int nonExistentElement = 12; 
        boolean removed2 = numbers.remove(nonExistentElement);

        if (removed2) {
             System.out.println("TreeSet after removing " + nonExistentElement + ": " + numbers);
        } else {
            System.out.println(nonExistentElement + " was not found in the TreeSet.");
        }
    }
}
