import java.util.LinkedList;

public class GetLastElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Check if the list is empty
        if (linkedList.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            // Retrieve the last element using peekLast() - does not remove the element
            String lastElement = linkedList.peekLast(); 

            // Print the last element
            System.out.println("Last element: " + lastElement);


            // You can also use getLast() which throws NoSuchElementException if the list is empty
           try{
              String lastElement2 = linkedList.getLast(); // This also retrieves but doesn't remove.
              System.out.println("Last element (using getLast()): " + lastElement2); 
           }catch(java.util.NoSuchElementException e){
               System.out.println("Error: The list is empty."); // Handle the potential exception.
           }
        }
    }
}
