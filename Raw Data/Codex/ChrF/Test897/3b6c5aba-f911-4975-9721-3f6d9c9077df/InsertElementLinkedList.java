import java.util.LinkedList;

public class InsertElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> days = new LinkedList<>();

        // Add some initial elements
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        // Element to insert
        String newDay = "Sunday";

        // Position to insert (0-indexed)
        int position = 2; // Insert at index 2 (becomes the 3rd element)


        // Validate position
        if (position < 0 || position > days.size()) {
            System.out.println("Invalid position. Position must be between 0 and " + days.size());
        } else {
            // Insert the element at the specified position
            days.add(position, newDay);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + days);
        }

         // Example with invalid position (out of bounds)
         int invalidPosition = 10;
         if (invalidPosition < 0 || invalidPosition > days.size()) {
            System.out.println("Invalid position: " + invalidPosition + ". Position must be between 0 and " + days.size());
        }



    }
}
