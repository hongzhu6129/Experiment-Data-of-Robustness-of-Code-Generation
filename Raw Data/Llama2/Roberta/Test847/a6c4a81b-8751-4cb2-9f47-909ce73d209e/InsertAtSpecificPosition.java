import java.util.LinkedList;

public class InsertAtSpecificPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (0-indexed)
        int position = 1;


        try {
            // Insert the element at the specified position
            list.add(position, elementToInsert);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + list);


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid position. Position should be between 0 and " + list.size());
        }
        


        // Another example with an invalid position (out of bounds)
         LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        int element = 4;
        int invalidPosition = 4; // Index out of bound

        try {
           numbers.add(invalidPosition, element);
           System.out.println("Updated List: " + numbers);

        }
        catch (IndexOutOfBoundsException e) {
             System.out.println("Invalid position. Position should be between 0 and " + numbers.size());
        }



    }
}
