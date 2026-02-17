import java.util.TreeSet;

public class TreeSetFirstElement {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Check if the TreeSet is empty
        if (numbers.isEmpty()) {
            System.out.println("TreeSet is empty.");
            return; // Exit if the TreeSet is empty
        }

        // Retrieve the first element
        Integer firstElement = numbers.first();

        // Remove the first element
        numbers.remove(firstElement);



        // Print the first element and the updated TreeSet
        System.out.println("First element: " + firstElement);
        System.out.println("Updated TreeSet: " + numbers);


    }
}
