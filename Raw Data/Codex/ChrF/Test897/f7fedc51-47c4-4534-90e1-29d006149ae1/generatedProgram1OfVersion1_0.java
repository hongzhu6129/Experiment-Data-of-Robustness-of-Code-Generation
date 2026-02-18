import java.util.LinkedList;
import java.util.ListIterator;

public class InsertInLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (index starts from 0)
        int positionToInsert = 1;

        // Insert the element at the specified position
        insertElement(linkedList, elementToInsert, positionToInsert);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example 2: Insert at the beginning
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Apple");
        linkedList2.add("Banana");
        linkedList2.add("Orange");
        insertElement(linkedList2, "Mango", 0);
        System.out.println("Updated LinkedList 2: " + linkedList2);

        // Example 3: Insert at the end.
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Apple");
        linkedList3.add("Banana");
        linkedList3.add("Orange");
        insertElement(linkedList3, "Kiwi", linkedList3.size()); // Size is one position beyond last element, so it effectively inserts at the end.
        System.out.println("Updated LinkedList 3: " + linkedList3);



        // Example 4: Handling out of bounds index. Insert at a non-existent position (Error Handling)
        LinkedList<String> linkedList4 = new LinkedList<>();
        linkedList4.add("Apple");
        linkedList4.add("Banana");
        linkedList4.add("Orange");
        insertElement(linkedList4, "Pear", 5); // Invalid position
        System.out.println("Updated LinkedList 4: " + linkedList4);

    }

    public static void insertElement(LinkedList<String> linkedList, String element, int position) {
        if (position >= 0 && position <= linkedList.size()) {  // Check for valid positions, including the end.
            if (position == linkedList.size()) { // Special handling for inserting at the end
                linkedList.add(element);         //  More efficient than using an iterator in this case.
            } else {                           // Handle all other valid positions (0 to size-1)
                ListIterator<String> iterator = linkedList.listIterator(position);
                iterator.add(element);
            }
        } else {
            System.out.println("Error: Invalid position. Element not inserted.");
        }
    }
}
