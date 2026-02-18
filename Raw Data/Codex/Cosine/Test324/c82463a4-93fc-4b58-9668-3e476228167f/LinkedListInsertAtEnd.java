import java.util.LinkedList;

public class LinkedListInsertAtEnd {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the end
        String newElement = "Grape";

        // Insert the element at the end using add() -  it automatically adds at the tail/end
        linkedList.add(newElement);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


         // Example with integers
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        int newNumber = 4;
        numberList.add(newNumber); // Inserts at the end

        System.out.println("Updated Number List: " + numberList);


    }
}
