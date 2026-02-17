import java.util.LinkedList;

public class EditLinkedListFront {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Original LinkedList: " + linkedList);


        // Edit the element at the front (index 0)
        if (!linkedList.isEmpty()) {
            linkedList.set(0, "Grape"); // Replace "Apple" with "Grape"
            System.out.println("Modified LinkedList: " + linkedList);
        } else {
            System.out.println("LinkedList is empty. Cannot edit.");
        }


        //Example of handling an empty list gracefully.  
        LinkedList<String> emptyList = new LinkedList<>();
         if (!emptyList.isEmpty()) {
            emptyList.set(0, "Mango"); 
        } else {
            System.out.println("Empty list. Cannot edit.");
        }


         // More robust error handling example (using try-catch)
        LinkedList<Integer> anotherList = new LinkedList<>();
        anotherList.add(1);
        anotherList.add(2);

        int indexToEdit = 5; // An invalid index (out of bounds)


        try {
            anotherList.set(indexToEdit, 10);  //Try to set element to 10 at specified index
            System.out.println("List after edit: " + anotherList);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index. Cannot edit."); // Catch the exception and handle
        }


    }
}
