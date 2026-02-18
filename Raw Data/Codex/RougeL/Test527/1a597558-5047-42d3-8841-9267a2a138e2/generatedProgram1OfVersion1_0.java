import java.util.LinkedList;

public class InsertLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (index starts from 0)
        int insertionIndex = 1;


        try {
            // Insert the element at the specified position
            linkedList.add(insertionIndex, elementToInsert);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + linkedList);


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid insertion index. Index should be between 0 and " + (linkedList.size()));
        }

         //Example with an invalid index (out of bounds)
        insertionIndex = 5; //Invalid - list size is now 4
        try {
            linkedList.add(insertionIndex, "Mango"); // This will throw an IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid insertion index. Index should be between 0 and " + (linkedList.size()));
        }


        // Example with an invalid index (negative)
        insertionIndex = -1;
        try {
            linkedList.add(insertionIndex, "Kiwi");  // This will also throw an IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid insertion index. Index should be between 0 and " + linkedList.size());
        }

    }
}
