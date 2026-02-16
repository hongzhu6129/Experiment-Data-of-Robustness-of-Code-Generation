import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (0-indexed)
        int insertionIndex = 1;


        try {
            // Insert the element at the specified position
            linkedList.add(insertionIndex, elementToInsert);


            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + linkedList);


        } catch (IndexOutOfBoundsException e) {
             System.out.println("Invalid insertion index. Index should be between 0 and " + linkedList.size());
        }
    }
}
