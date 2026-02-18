import java.util.LinkedList;

public class InsertElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (0-indexed)
        int positionToInsert = 1;

        // Insert the element at the specified position
        insertElement(linkedList, elementToInsert, positionToInsert);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        //Example with out of bounds index - it will gracefully add to the end
        LinkedList<String> linkedList2 = new LinkedList<>();

        // Add some initial elements
        linkedList2.add("Apple");
        linkedList2.add("Banana");
        linkedList2.add("Orange");

        // Element to insert
        String elementToInsert2 = "Grape";

        // Position to insert (0-indexed) - deliberately out of bounds
        int positionToInsert2 = 10; 

        // Insert the element at the specified position (it will go to the end)
        insertElement(linkedList2, elementToInsert2, positionToInsert2);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList (out of bounds example): " + linkedList2);


        // Example with negative index - inserts at the beginning
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Apple");
        linkedList3.add("Banana");
        String elementToInsert3 = "Grape";
        int positionToInsert3 = -1; // Negative index
        insertElement(linkedList3, elementToInsert3, positionToInsert3);
        System.out.println("Updated LinkedList (negative index example): " + linkedList3);

    }




    public static <T> void insertElement(LinkedList<T> list, T element, int position) {
        if (position < 0) {
             list.add(0, element); // Treat negative index as insert at beginning
        } else if (position >= list.size()) {
            list.addLast(element); // Insert at the end if position is out of bounds
        } else {
            list.add(position, element); // Insert at the specified position
        }
    }
}
