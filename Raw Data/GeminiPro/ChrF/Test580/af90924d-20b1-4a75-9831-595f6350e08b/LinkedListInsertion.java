import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListInsertion {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Initial LinkedList: " + linkedList);


        // Example 1: Insert "Grape" at index 1
        int index1 = 1;
        String element1 = "Grape";
        insertAtIndex(linkedList, index1, element1);
        System.out.println("After inserting " + element1 + " at index " + index1 + ": " + linkedList);

        // Example 2: Insert "Mango" at index 0 (beginning)
        int index2 = 0;
        String element2 = "Mango";
        insertAtIndex(linkedList, index2, element2);
        System.out.println("After inserting " + element2 + " at index " + index2 + ": " + linkedList);


        // Example 3: Insert "Pineapple" at the end (size of the list)
        int index3 = linkedList.size(); // Insert at the end 
        String element3 = "Pineapple";
        insertAtIndex(linkedList, index3, element3); 
        System.out.println("After inserting " + element3 + " at index " + index3 + ": " + linkedList);


        // Example 4: Handling invalid index (out of bounds)
        int index4 = 10; // Invalid index
        String element4 = "Watermelon";

        insertAtIndex(linkedList, index4, element4); // The method will handle the error



    }

    public static void insertAtIndex(LinkedList<String> list, int index, String element) {
        try {
            // Use a ListIterator for efficient insertion
            ListIterator<String> iterator = list.listIterator();

            // Move the iterator to the desired index
            for (int i = 0; i < index && iterator.hasNext(); i++) {
                iterator.next();
            }

            // Insert the element at the current position
            iterator.add(element);


        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index. Index should be between 0 and " + list.size());
        }


    }
}
