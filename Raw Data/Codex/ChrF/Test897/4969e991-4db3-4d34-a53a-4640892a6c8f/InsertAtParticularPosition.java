import java.util.LinkedList;

public class InsertAtParticularPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Data to insert
        String elementToInsert = "Grape";

        // Position to insert at (0-based index)
        int position = 1;

        // Validate the position
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position. Position should be between 0 and " + list.size());
            return; // Exit if position is invalid
        }


        // Insert the element at the specified position
        list.add(position, elementToInsert);



        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + list);


        // Another Example with different data types (Integer)
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int numberToInsert = 15;
        int numberPosition = 1;


        if (numberPosition < 0 || numberPosition > numbers.size()) {
            System.out.println("Invalid position. Position should be between 0 and " + numbers.size());
            return; // Exit if position is invalid
        }

        numbers.add(numberPosition, numberToInsert);

        System.out.println("Updated LinkedList of numbers: " + numbers);


        //Edge cases: Inserting at the beginning (position 0) and end (position list.size())
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Orange");
        fruits.add("Pineapple");

        fruits.add(0, "Mango"); // Insert at the beginning
        fruits.add(fruits.size(), "Watermelon"); // Insert at the end


        System.out.println("Fruits list after inserting at beginning and end : " + fruits);



    }
}
