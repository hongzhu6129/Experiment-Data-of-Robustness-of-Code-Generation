import java.util.TreeSet;

public class RemoveLastTreeSetElement {

    public static void main(String[] args) {
        // Create a TreeSet
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
            return; // Exit if the TreeSet is empty
        }


        // Retrieve and remove the last element
        Integer lastElement = numbers.last(); // Retrieves the last element
        numbers.remove(lastElement);        // Removes the last element

        // Print the removed element and the updated TreeSet
        System.out.println("Removed element: " + lastElement);
        System.out.println("Updated TreeSet: " + numbers);



        // Example of handling an empty TreeSet (optional - uncomment if you want to test)
        /*
        numbers.clear(); // Clear the TreeSet to make it empty

        if (numbers.isEmpty()) {
            System.out.println("TreeSet is empty.");
        } else {
           Integer last = numbers.last(); // This would throw an exception if the set were truly empty
           numbers.remove(last);
           System.out.println("Removed element: " + last);
           System.out.println("Updated TreeSet: " + numbers); 
        }
        */
    }
}
