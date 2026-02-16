import java.util.LinkedList;

public class InsertAtEndLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the end
        String elementToInsert = "Grape";

        // Insert at the end using add() 
        linkedList.add(elementToInsert);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int numberToInsert = 4;
        numbers.add(numberToInsert); // Insert at the end

        System.out.println("Updated LinkedList of numbers: " + numbers);


        // Illustrating error handling for null element insertion (though LinkedList allows nulls)

        String nullElement = null;

        LinkedList<String> listAllowingNulls = new LinkedList<>();
        listAllowingNulls.add("A");
        listAllowingNulls.add(nullElement); // LinkedList permits null insertion
        listAllowingNulls.add("C");


        System.out.println("List with null inserted: " + listAllowingNulls);


    }
}
